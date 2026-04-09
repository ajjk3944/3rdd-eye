package n4;

import android.graphics.Rect;
import f4.f;
import java.util.Comparator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f29741a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f29742b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29743c;

    /* renamed from: d, reason: collision with root package name */
    public final i7.b f29744d;

    public b(boolean z3, i7.b bVar) {
        this.f29743c = z3;
        this.f29744d = bVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f29744d.getClass();
        Rect rect = this.f29741a;
        ((f) obj).f(rect);
        Rect rect2 = this.f29742b;
        ((f) obj2).f(rect2);
        int i4 = rect.top;
        int i10 = rect2.top;
        if (i4 < i10) {
            return -1;
        }
        if (i4 > i10) {
            return 1;
        }
        int i11 = rect.left;
        int i12 = rect2.left;
        boolean z3 = this.f29743c;
        if (i11 < i12) {
            return z3 ? 1 : -1;
        }
        if (i11 > i12) {
            return z3 ? -1 : 1;
        }
        int i13 = rect.bottom;
        int i14 = rect2.bottom;
        if (i13 < i14) {
            return -1;
        }
        if (i13 > i14) {
            return 1;
        }
        int i15 = rect.right;
        int i16 = rect2.right;
        if (i15 < i16) {
            return z3 ? 1 : -1;
        }
        if (i15 > i16) {
            return z3 ? -1 : 1;
        }
        return 0;
    }
}
