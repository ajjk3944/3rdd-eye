package defpackage;

import android.graphics.Path;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yu0 implements ej {
    public final boolean a;
    public final Path.FillType b;
    public final String c;
    public final b4 d;
    public final b4 e;
    public final boolean f;

    public yu0(String str, boolean z, Path.FillType fillType, b4 b4Var, b4 b4Var2, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = b4Var;
        this.e = b4Var2;
        this.f = z2;
    }

    @Override // defpackage.ej
    public final vi a(i90 i90Var, u80 u80Var, da daVar) {
        return new lu(i90Var, daVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.a + '}';
    }
}
