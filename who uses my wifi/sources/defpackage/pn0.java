package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class pn0 {
    public static final ue0 a;

    static {
        ue0 ue0Var = new ue0("DNS Rcode", 2);
        a = ue0Var;
        ue0Var.i = 4095;
        ue0Var.g("RESERVED");
        ue0Var.b("NOERROR", 0);
        ue0Var.b("FORMERR", 1);
        ue0Var.b("SERVFAIL", 2);
        ue0Var.b("NXDOMAIN", 3);
        ue0Var.b("NOTIMP", 4);
        ue0Var.c("NOTIMPL", 4);
        ue0Var.b("REFUSED", 5);
        ue0Var.b("YXDOMAIN", 6);
        ue0Var.b("YXRRSET", 7);
        ue0Var.b("NXRRSET", 8);
        ue0Var.b("NOTAUTH", 9);
        ue0Var.b("NOTZONE", 10);
        ue0Var.b("BADVERS", 16);
        ue0Var.b("BADKEY", 17);
        ue0Var.b("BADTIME", 18);
        ue0Var.b("BADMODE", 19);
        ue0Var.b("BADNAME", 20);
        ue0Var.b("BADALG", 21);
        ue0Var.b("BADTRUNC", 22);
        ue0Var.b("BADCOOKIE", 23);
    }
}
