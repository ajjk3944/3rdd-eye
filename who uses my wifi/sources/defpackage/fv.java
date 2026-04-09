package defpackage;

import android.graphics.Rect;
import java.util.Comparator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fv implements Comparator {
    public final Rect f = new Rect();
    public final Rect g = new Rect();
    public final boolean h;
    public final pz i;

    public fv(pz pzVar, boolean z) {
        this.h = z;
        this.i = pzVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.i.getClass();
        Rect rect = this.f;
        ((a1) obj).f(rect);
        Rect rect2 = this.g;
        ((a1) obj2).f(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.h;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
