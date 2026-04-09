package J7;

import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudResponseIce;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class H {
    public static final ApiTeleportCloudResponseIce a(ApiTeleportCloudResponseIce apiTeleportCloudResponseIce) {
        AbstractC6492s.i(apiTeleportCloudResponseIce, "<this>");
        String ice = apiTeleportCloudResponseIce.getIce();
        return new ApiTeleportCloudResponseIce(ice != null ? kotlin.text.t.L(ice, "\"stun:global.stun.twilio.com:3478\"", "\"stun:global.stun.twilio.com:3478?transport=udp\"", false, 4, null) : null);
    }
}
