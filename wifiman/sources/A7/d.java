package A7;

import java.net.DatagramPacket;
import java.net.InetAddress;
import kotlin.jvm.internal.AbstractC6492s;
import s7.C7920g;

/* loaded from: classes3.dex */
public interface d {

    public static final class a {
        public static C7920g a(d dVar, DatagramPacket packet) {
            AbstractC6492s.i(packet, "packet");
            InetAddress address = packet.getAddress();
            AbstractC6492s.h(address, "packet.address");
            byte[] data = packet.getData();
            AbstractC6492s.h(data, "packet.data");
            return dVar.a(address, data);
        }
    }

    C7920g a(InetAddress inetAddress, byte[] bArr);

    C7920g b(DatagramPacket datagramPacket);
}
