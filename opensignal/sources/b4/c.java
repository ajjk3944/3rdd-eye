package b4;

import android.graphics.Rect;
import io.sentry.hints.i;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f2392a = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f2393d = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2394g;

    /* renamed from: r, reason: collision with root package name */
    public final i f2395r;

    public c(boolean z10, i iVar) {
        this.f2394g = z10;
        this.f2395r = iVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f2395r.getClass();
        Rect rect = this.f2392a;
        ((v3.c) obj).f(rect);
        Rect rect2 = this.f2393d;
        ((v3.c) obj2).f(rect2);
        int i10 = rect.top;
        int i11 = rect2.top;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = rect.left;
        int i13 = rect2.left;
        boolean z10 = this.f2394g;
        if (i12 < i13) {
            return z10 ? 1 : -1;
        }
        if (i12 > i13) {
            return z10 ? -1 : 1;
        }
        int i14 = rect.bottom;
        int i15 = rect2.bottom;
        if (i14 < i15) {
            return -1;
        }
        if (i14 > i15) {
            return 1;
        }
        int i16 = rect.right;
        int i17 = rect2.right;
        if (i16 < i17) {
            return z10 ? 1 : -1;
        }
        if (i16 > i17) {
            return z10 ? -1 : 1;
        }
        return 0;
    }
}
