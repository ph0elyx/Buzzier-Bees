package com.minecraftabnormals.buzzier_bees.core.registry;

import com.minecraftabnormals.abnormals_core.core.api.banner.BannerManager;
import com.minecraftabnormals.buzzier_bees.core.BuzzierBees;
import net.minecraft.entity.item.PaintingType;
import net.minecraft.tileentity.BannerPattern;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BBBanners {
	public static final DeferredRegister<PaintingType> PAINTINGS = DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, BuzzierBees.MOD_ID);
	public static final RegistryObject<PaintingType> CANDLE = PAINTINGS.register("candle", () -> new PaintingType(32, 48));

	public static final BannerPattern HONEYCOMB = BannerManager.createPattern("mca", "honeycomb", "hny");

	public static void registerBanners() {
		BannerManager.addPattern(HONEYCOMB, BBItems.HONEYCOMB_BANNER_PATTERN.get());
	}
}
