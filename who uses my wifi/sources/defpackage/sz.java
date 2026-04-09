package defpackage;

import android.graphics.Path;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sz implements ej {
    public final int a;
    public final Path.FillType b;
    public final b4 c;
    public final b4 d;
    public final b4 e;
    public final b4 f;
    public final String g;
    public final boolean h;

    public sz(String str, int i, Path.FillType fillType, b4 b4Var, b4 b4Var2, b4 b4Var3, b4 b4Var4, boolean z) {
        this.a = i;
        this.b = fillType;
        this.c = b4Var;
        this.d = b4Var2;
        this.e = b4Var3;
        this.f = b4Var4;
        this.g = str;
        this.h = z;
    }

    @Override // defpackage.ej
    public final vi a(i90 i90Var, u80 u80Var, da daVar) {
        return new tz(i90Var, u80Var, daVar, this);
    }
}
