package Ec;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import h9.C5969a;
import inet.ipaddr.ipv4.C6180b;
import inet.ipaddr.ipv6.C6205b;

/* loaded from: classes4.dex */
public interface t {

    public static abstract class a extends b {
        @Override // Ec.t.b
        public String b() {
            return a() + ":" + g();
        }

        public abstract C5969a g();

        @Override // Ec.t.b
        public int hashCode() {
            return g().hashCode();
        }
    }

    public static abstract class b {
        public abstract c a();

        public String b() {
            return a() + ":" + c();
        }

        public abstract inet.ipaddr.g c();

        public C6180b d() {
            inet.ipaddr.g gVarC = c();
            if (gVarC instanceof C6180b) {
                return (C6180b) gVarC;
            }
            return null;
        }

        public C6205b e() {
            inet.ipaddr.g gVarC = c();
            if (gVarC instanceof C6205b) {
                return (C6205b) gVarC;
            }
            return null;
        }

        public abstract long f();

        public int hashCode() {
            return b().hashCode();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c UBNT = new c("UBNT", 0);
        public static final c ICMP = new c("ICMP", 1);
        public static final c ARP = new c("ARP", 2);
        public static final c BONJOUR = new c("BONJOUR", 3);
        public static final c NETBIOS = new c("NETBIOS", 4);
        public static final c SNMP = new c("SNMP", 5);
        public static final c MYSELF = new c("MYSELF", 6);
        public static final c GATEWAY = new c("GATEWAY", 7);
        public static final c AP = new c("AP", 8);
        public static final c UPNP = new c("UPNP", 9);
        public static final c MIKROTIK = new c("MIKROTIK", 10);
        public static final c UNIFI = new c("UNIFI", 11);
        public static final c UBNT_TCP_SPEEDTEST = new c("UBNT_TCP_SPEEDTEST", 12);
        public static final c UBNT_HTTP_SPEEDTEST = new c("UBNT_HTTP_SPEEDTEST", 13);
        public static final c HOSTNAME = new c("HOSTNAME", 14);

        private static final /* synthetic */ c[] $values() {
            return new c[]{UBNT, ICMP, ARP, BONJOUR, NETBIOS, SNMP, MYSELF, GATEWAY, AP, UPNP, MIKROTIK, UNIFI, UBNT_TCP_SPEEDTEST, UBNT_HTTP_SPEEDTEST, HOSTNAME};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = AbstractC5827b.a(cVarArr$values);
        }

        private c(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    gg.i b();
}
