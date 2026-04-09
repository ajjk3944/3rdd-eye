package z7;

import Zg.AbstractC3689v;
import ch.AbstractC4260a;
import java.net.DatagramSocket;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import x7.AbstractC8424a;

/* loaded from: classes3.dex */
public final class k implements x {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f67109a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6824a f67110b;

    public static final class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e(Integer.valueOf(k.this.c((m) obj2)), Integer.valueOf(k.this.c((m) obj)));
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f67112a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Integer num) {
            super(0);
            this.f67112a = num;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "opening new multicast socket on port - " + this.f67112a;
        }
    }

    public k(InterfaceC6835l rawMulticastSocketFactory, InterfaceC6824a interfacesProvider) {
        AbstractC6492s.i(rawMulticastSocketFactory, "rawMulticastSocketFactory");
        AbstractC6492s.i(interfacesProvider, "interfacesProvider");
        this.f67109a = rawMulticastSocketFactory;
        this.f67110b = interfacesProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int c(m mVar) {
        if (mVar.b() || !mVar.a()) {
            return -100;
        }
        if (mVar.getType() == p.VPN) {
            return 100;
        }
        if (mVar.getType() == p.WIFI) {
            return 50;
        }
        return mVar.getType() == p.ETHERNET ? 20 : 0;
    }

    @Override // z7.x
    public DatagramSocket a(Integer num) throws SocketException {
        AbstractC8424a.c(new b(num));
        MulticastSocket multicastSocket = (MulticastSocket) this.f67109a.invoke(Integer.valueOf(num != null ? num.intValue() : 0));
        multicastSocket.setBroadcast(true);
        multicastSocket.setReuseAddress(true);
        Iterable iterable = (Iterable) this.f67110b.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (c((m) obj) > 0) {
                arrayList.add(obj);
            }
        }
        m mVar = (m) AbstractC3689v.s0(AbstractC3689v.X0(arrayList, new a()));
        if (mVar != null) {
            mVar.c(multicastSocket);
        }
        return multicastSocket;
    }

    public /* synthetic */ k(InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? l.f67113a : interfaceC6835l, (i10 & 2) != 0 ? l.f67115c : interfaceC6824a);
    }
}
