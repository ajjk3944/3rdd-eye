package I7;

import android.content.Context;
import com.ubnt.teleport.TeleportTunnel;
import com.ubnt.teleport.TeleportTunnelManager;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.OkHttpClient;

/* renamed from: I7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2985a extends H7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0363a f8882a = C0363a.f8883a;

    /* renamed from: I7.a$a, reason: collision with other inner class name */
    public static final class C0363a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0363a f8883a = new C0363a();

        /* renamed from: b, reason: collision with root package name */
        private static InterfaceC2985a f8884b;

        private C0363a() {
        }

        public final InterfaceC2985a a(Context applicationContext, Class vpnServiceClass, J7.G clientDelegate, TeleportTunnelManager.Storage tunnelStorage, OkHttpClient sharedOkhttpClient) {
            AbstractC6492s.i(applicationContext, "applicationContext");
            AbstractC6492s.i(vpnServiceClass, "vpnServiceClass");
            AbstractC6492s.i(clientDelegate, "clientDelegate");
            AbstractC6492s.i(tunnelStorage, "tunnelStorage");
            AbstractC6492s.i(sharedOkhttpClient, "sharedOkhttpClient");
            synchronized (this) {
                try {
                    if (f8884b == null) {
                        f8884b = new C2995f(applicationContext, vpnServiceClass, clientDelegate, tunnelStorage, sharedOkhttpClient);
                    }
                    Yg.J j10 = Yg.J.f24997a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            InterfaceC2985a interfaceC2985a = f8884b;
            AbstractC6492s.f(interfaceC2985a);
            return interfaceC2985a;
        }
    }

    TeleportTunnelManager a();

    TeleportTunnel.c b();

    TeleportCloud.c d();
}
