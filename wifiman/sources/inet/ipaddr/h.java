package inet.ipaddr;

import inet.ipaddr.ipv4.C6180b;
import inet.ipaddr.ipv6.C6205b;

/* loaded from: classes4.dex */
public interface h extends C6205b.InterfaceC1861b, C6180b.a {

    public static class a implements h {
        @Override // inet.ipaddr.ipv4.C6180b.a
        public C6180b a(g gVar) {
            if (c(gVar)) {
                return gVar.e1() ? gVar.n1() : gVar.o1().D1();
            }
            return null;
        }

        @Override // inet.ipaddr.ipv6.C6205b.InterfaceC1861b
        public C6205b b(g gVar) {
            return gVar.f1() ? gVar.o1() : gVar.n1().A1();
        }

        public boolean c(g gVar) {
            return gVar.e1() || gVar.o1().R1();
        }
    }
}
