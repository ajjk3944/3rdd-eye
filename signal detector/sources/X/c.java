package X;

import S4.r;
import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f4118a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f4119b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4120c;

    /* renamed from: d, reason: collision with root package name */
    public final r f4121d;

    public c(boolean z6, r rVar) {
        this.f4120c = z6;
        this.f4121d = rVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f4121d.getClass();
        Rect rect = this.f4118a;
        ((S.d) obj).f(rect);
        Rect rect2 = this.f4119b;
        ((S.d) obj2).f(rect2);
        int i = rect.top;
        int i3 = rect2.top;
        if (i < i3) {
            return -1;
        }
        if (i > i3) {
            return 1;
        }
        int i6 = rect.left;
        int i7 = rect2.left;
        boolean z6 = this.f4120c;
        if (i6 < i7) {
            return z6 ? 1 : -1;
        }
        if (i6 > i7) {
            return z6 ? -1 : 1;
        }
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        if (i8 < i9) {
            return -1;
        }
        if (i8 > i9) {
            return 1;
        }
        int i10 = rect.right;
        int i11 = rect2.right;
        if (i10 < i11) {
            return z6 ? 1 : -1;
        }
        if (i10 > i11) {
            return z6 ? -1 : 1;
        }
        return 0;
    }
}
