package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class av0 implements ej {
    public final String a;
    public final List b;
    public final boolean c;

    public av0(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.ej
    public final vi a(i90 i90Var, u80 u80Var, da daVar) {
        return new zi(i90Var, daVar, this, u80Var);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
