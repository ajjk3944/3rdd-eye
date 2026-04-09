package z7;

import Zg.AbstractC3689v;
import java.net.DatagramSocket;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import zi.AbstractC8783m;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC6835l f67113a = b.f67118a;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC6835l f67114b = c.f67119a;

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC6824a f67115c = a.f67116a;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f67116a = new a();

        /* renamed from: z7.l$a$a, reason: collision with other inner class name */
        static final class C2383a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final C2383a f67117a = new C2383a();

            C2383a() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n invoke(NetworkInterface it) {
                AbstractC6492s.h(it, "it");
                return new n(it);
            }
        }

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() throws SocketException {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            AbstractC6492s.h(networkInterfaces, "getNetworkInterfaces()");
            return AbstractC8783m.Z(AbstractC8783m.N(AbstractC8783m.g(AbstractC3689v.z(networkInterfaces)), C2383a.f67117a));
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f67118a = new b();

        b() {
            super(1);
        }

        public final MulticastSocket a(int i10) {
            return new MulticastSocket(i10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f67119a = new c();

        c() {
            super(1);
        }

        public final DatagramSocket a(int i10) {
            return new DatagramSocket(i10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }
}
