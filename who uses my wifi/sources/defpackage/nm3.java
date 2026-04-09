package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nm3 extends pm3 {
    public static final pm3 f(int i) {
        return i < 0 ? pm3.b : i > 0 ? pm3.c : pm3.a;
    }

    @Override // defpackage.pm3
    public final pm3 a(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // defpackage.pm3
    public final pm3 b(int i, int i2) {
        return f(Integer.compare(i, i2));
    }

    @Override // defpackage.pm3
    public final pm3 c(boolean z, boolean z2) {
        return f(Boolean.compare(z2, z));
    }

    @Override // defpackage.pm3
    public final pm3 d(boolean z, boolean z2) {
        return f(Boolean.compare(z, z2));
    }

    @Override // defpackage.pm3
    public final int e() {
        return 0;
    }
}
