package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class aa0 extends mi0 {
    public static final ni0 i;
    public float g = 0.0f;
    public float h = 0.0f;

    static {
        ni0 ni0VarA = ni0.a(32, new aa0());
        i = ni0VarA;
        ni0VarA.f = 0.5f;
    }

    public static aa0 b(float f, float f2) {
        aa0 aa0Var = (aa0) i.b();
        aa0Var.g = f;
        aa0Var.h = f2;
        return aa0Var;
    }

    @Override // defpackage.mi0
    public final mi0 a() {
        return new aa0();
    }
}
