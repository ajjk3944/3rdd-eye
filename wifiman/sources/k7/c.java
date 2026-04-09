package K7;

import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudRequestResponse;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudResponseConnection;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudResponseIce;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudResponseTokenFetch;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;

/* loaded from: classes3.dex */
public interface c {

    public static final class a {
        public static void a(c cVar, ApiTeleportCloudRequestResponse receiver) throws TeleportCloud.Error.InvalidResponse {
            AbstractC6492s.i(receiver, "$receiver");
            String requestId = receiver.getRequestId();
            if (requestId == null || t.m0(requestId)) {
                throw new TeleportCloud.Error.InvalidResponse("missing requestID in long term token generation request", null, 2, null);
            }
        }

        public static void b(c cVar, ApiTeleportCloudResponseConnection receiver) throws TeleportCloud.Error.InvalidResponse {
            AbstractC6492s.i(receiver, "$receiver");
            String clientIp = receiver.getClientIp();
            if (clientIp == null || t.m0(clientIp)) {
                throw new TeleportCloud.Error.InvalidResponse("connection info fetch - client ip unavailable", null, 2, null);
            }
            List dns = receiver.getDns();
            if (dns == null || dns.isEmpty()) {
                throw new TeleportCloud.Error.InvalidResponse("connection info fetch - dns unavailable", null, 2, null);
            }
            if (receiver.getRemoteClientInfo() == null) {
                throw new TeleportCloud.Error.InvalidResponse("connection info fetch - server info unavailable", null, 2, null);
            }
            if (receiver.getRemoteClientInfo().getEncryptionPublicKey() == null) {
                throw new TeleportCloud.Error.InvalidResponse("connection info fetch - server info missing public key", null, 2, null);
            }
            if (receiver.getRemoteClientInfo().getPeerDescription() == null) {
                throw new TeleportCloud.Error.InvalidResponse("connection info fetch - server info missing peer description", null, 2, null);
            }
        }

        public static void c(c cVar, ApiTeleportCloudResponseIce receiver) throws TeleportCloud.Error.InvalidResponse {
            AbstractC6492s.i(receiver, "$receiver");
            String ice = receiver.getIce();
            if (ice == null || t.m0(ice)) {
                throw new TeleportCloud.Error.InvalidResponse("ice fetch - ice unavailable", null, 2, null);
            }
        }

        public static void d(c cVar, ApiTeleportCloudResponseTokenFetch receiver) throws TeleportCloud.Error.InvalidResponse {
            AbstractC6492s.i(receiver, "$receiver");
            String secret = receiver.getSecret();
            if (secret == null || t.m0(secret)) {
                throw new TeleportCloud.Error.InvalidResponse("token fetch - secret unavailable", null, 2, null);
            }
            String token = receiver.getToken();
            if (token == null || t.m0(token)) {
                throw new TeleportCloud.Error.InvalidResponse("token fetch - token unavailable", null, 2, null);
            }
        }
    }
}
