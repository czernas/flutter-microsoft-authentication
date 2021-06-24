package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import za.co.britehouse.flutter_microsoft_authentication.FlutterMicrosoftAuthenticationPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    FlutterMicrosoftAuthenticationPlugin.registerWith(registry.registrarFor("za.co.britehouse.flutter_microsoft_authentication.FlutterMicrosoftAuthenticationPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
