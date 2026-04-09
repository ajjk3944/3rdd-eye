package K7;

import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudRequestPayloadConnection;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudRequestPayloadIce;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudRequestPayloadTokenRequest;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10465a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Z6.a f10466b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Z6.a a() {
            return b.f10466b;
        }

        private a() {
        }
    }

    static {
        Z6.a aVarC = Z6.a.b(b.class, "request_type").c(ApiTeleportCloudRequestPayloadTokenRequest.class, "REQUEST_ACCESS").c(ApiTeleportCloudRequestPayloadIce.class, "GET_ICE_CONFIGURATION").c(ApiTeleportCloudRequestPayloadConnection.class, "CONNECT");
        AbstractC6492s.h(aVarC, "of(ApiTeleportCloudReque…n::class.java, \"CONNECT\")");
        f10466b = aVarC;
    }
}
