package z7;

import java.net.DatagramSocket;
import java.net.SocketException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import x7.AbstractC8424a;

/* loaded from: classes3.dex */
public final class y implements x {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f67162a;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f67163a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Integer num) {
            super(0);
            this.f67163a = num;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "opening new datagram socket on port - " + this.f67163a;
        }
    }

    public y(InterfaceC6835l rawSocketFactory) {
        AbstractC6492s.i(rawSocketFactory, "rawSocketFactory");
        this.f67162a = rawSocketFactory;
    }

    @Override // z7.x
    public DatagramSocket a(Integer num) throws SocketException {
        AbstractC8424a.c(new a(num));
        DatagramSocket datagramSocket = (DatagramSocket) this.f67162a.invoke(Integer.valueOf(num != null ? num.intValue() : 0));
        datagramSocket.setBroadcast(true);
        return datagramSocket;
    }

    public /* synthetic */ y(InterfaceC6835l interfaceC6835l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? l.f67114b : interfaceC6835l);
    }
}
