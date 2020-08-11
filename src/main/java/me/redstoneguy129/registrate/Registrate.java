package me.redstoneguy129.registrate;

import net.minecraft.client.Minecraft;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.event.server.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.userdev.FMLDevDataLaunchProvider;
import net.minecraftforge.userdev.FMLUserdevDataLaunchProvider;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Objects;

@Mod("registrate")
public class Registrate {

    public Registrate() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void getPacks(FMLServerAboutToStartEvent event) {
        System.out.println("****************************");
        System.out.println("****************************");
        System.out.println("****************************");
        System.out.println("****************************");
        event.getServer().getResourcePacks().getAllPacks().forEach(resourcePackInfo -> {
            System.out.println(resourcePackInfo.getName());
            if(resourcePackInfo.getName().equals("mod:registrate")) {
                File registratePack = event.getServer().getFile("registrate");
                if(registratePack.exists()) {
                    System.out.println("EXISTS");
                    System.out.println(registratePack);
                } else {
                    System.out.println("NOT RIGHT!");
                }
            }
        });
        System.out.println("****************************");
        System.out.println("****************************");
        System.out.println("****************************");
        System.out.println("****************************");
    }
}
