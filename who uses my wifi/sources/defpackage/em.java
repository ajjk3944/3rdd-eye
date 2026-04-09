package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class em {
    public static final ue0 a;

    static {
        ue0 ue0Var = new ue0("DNSSEC algorithm", 2);
        a = ue0Var;
        ue0Var.i = 255;
        ue0Var.b("DELETE", 0);
        ue0Var.b("RSAMD5", 1);
        ue0Var.b("DH", 2);
        ue0Var.b("DSA", 3);
        ue0Var.b("RSASHA1", 5);
        ue0Var.b("DSA-NSEC3-SHA1", 6);
        ue0Var.b("RSASHA1-NSEC3-SHA1", 7);
        ue0Var.b("RSASHA256", 8);
        ue0Var.b("RSASHA512", 10);
        ue0Var.b("ECC-GOST", 12);
        ue0Var.b("ECDSAP256SHA256", 13);
        ue0Var.b("ECDSAP384SHA384", 14);
        ue0Var.b("ED25519", 15);
        ue0Var.b("ED448", 16);
        ue0Var.b("SM2SM3", 17);
        ue0Var.b("ECC-GOST12", 23);
        ue0Var.b("INDIRECT", 252);
        ue0Var.b("PRIVATEDNS", 253);
        ue0Var.b("PRIVATEOID", 254);
    }
}
