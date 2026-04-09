package z7;

import java.net.DatagramSocket;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6839p;
import p7.InterfaceC7237b;

/* loaded from: classes3.dex */
public interface q {

    /* renamed from: a, reason: collision with root package name */
    public static final a f67125a = a.f67126a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f67126a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static InterfaceC6839p f67127b = C2384a.f67128a;

        /* renamed from: z7.q$a$a, reason: collision with other inner class name */
        static final class C2384a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            public static final C2384a f67128a = new C2384a();

            C2384a() {
                super(2);
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final u invoke(DatagramSocket socket, InterfaceC7237b provider) {
                AbstractC6492s.i(socket, "socket");
                AbstractC6492s.i(provider, "provider");
                return new u(socket, provider);
            }
        }

        private a() {
        }

        public final q a(DatagramSocket socket, InterfaceC7237b provider) {
            AbstractC6492s.i(socket, "socket");
            AbstractC6492s.i(provider, "provider");
            return (q) f67127b.invoke(socket, provider);
        }
    }

    gg.i a();
}
