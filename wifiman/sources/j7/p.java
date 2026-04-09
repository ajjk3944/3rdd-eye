package J7;

import Yg.J;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudRequestResponse;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
public final class p extends AbstractC6494u implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f9886a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n nVar) {
        super(1);
        this.f9886a = nVar;
    }

    public final void a(ApiTeleportCloudRequestResponse it) throws TeleportCloud.Error.InvalidResponse {
        n nVar = this.f9886a;
        AbstractC6492s.h(it, "it");
        nVar.m(it);
    }

    @Override // mh.InterfaceC6835l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws TeleportCloud.Error.InvalidResponse {
        a((ApiTeleportCloudRequestResponse) obj);
        return J.f24997a;
    }
}
