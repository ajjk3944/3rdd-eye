package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class yl {
    public static final xl a;

    static {
        xl xlVar = new xl("DClass", 2);
        xlVar.g("CLASS");
        a = xlVar;
        xlVar.b("IN", 1);
        xlVar.b("CH", 3);
        xlVar.c("CHAOS", 3);
        xlVar.b("HS", 4);
        xlVar.c("HESIOD", 4);
        xlVar.b("NONE", 254);
        xlVar.b("ANY", 255);
    }

    public static void a(int i) {
        if (i < 0 || i > 65535) {
            throw new l30(ex0.f("Invalid DNS class: ", i));
        }
    }
}
