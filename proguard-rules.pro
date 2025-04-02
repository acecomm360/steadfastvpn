# Keep application class
-keep public class com.servicepro.steadfastvpn.SteadfastVpnApp { *; }

# Keep VPN service
-keep public class com.servicepro.steadfastvpn.services.SteadfastVpnService { *; }

# OneSignal rules
-keep class com.onesignal.** { *; }

# AdMob rules
-keep public class com.google.android.gms.ads.** { public *; }
-keep class com.google.ads.** { *; }

# Gson rules
-keep class com.google.gson.** { *; }
-keep class com.servicepro.steadfastvpn.models.** { *; }

# Keep model classes
-keepclassmembers class com.servicepro.steadfastvpn.models.** { *; }