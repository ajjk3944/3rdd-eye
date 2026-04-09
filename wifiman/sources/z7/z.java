package z7;

import java.net.DatagramSocket;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final DatagramSocket f67164a;

    public z(DatagramSocket datagramSocket) {
        this.f67164a = datagramSocket;
    }

    public final DatagramSocket a() {
        return this.f67164a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && AbstractC6492s.d(this.f67164a, ((z) obj).f67164a);
    }

    public int hashCode() {
        DatagramSocket datagramSocket = this.f67164a;
        if (datagramSocket == null) {
            return 0;
        }
        return datagramSocket.hashCode();
    }

    public String toString() {
        return "SocketResult(socket=" + this.f67164a + ")";
    }
}
