package J7;

import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudRequestResponse;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
public final class q extends AbstractC6494u implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    public static final q f9887a = new q();

    public q() {
        super(1);
    }

    @Override // mh.InterfaceC6835l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke(ApiTeleportCloudRequestResponse apiTeleportCloudRequestResponse) {
        String requestId = apiTeleportCloudRequestResponse.getRequestId();
        if (requestId != null) {
            return requestId;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
