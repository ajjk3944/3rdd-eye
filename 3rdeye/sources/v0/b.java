package V0;

import M0.g;
import V0.a;
import android.graphics.Rect;
import java.util.Comparator;

/* compiled from: FocusStrategy.java */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: FocusStrategy.java */
    public static class a<T> implements Comparator<T> {

        /* renamed from: b, reason: collision with root package name */
        public final Rect f12843b = new Rect();

        /* renamed from: c, reason: collision with root package name */
        public final Rect f12844c = new Rect();

        /* renamed from: d, reason: collision with root package name */
        public final boolean f12845d;

        /* renamed from: e, reason: collision with root package name */
        public final a.C0179a f12846e;

        public a(boolean z10, a.C0179a c0179a) {
            this.f12845d = z10;
            this.f12846e = c0179a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            a.C0179a c0179a = this.f12846e;
            c0179a.getClass();
            Rect rect = this.f12843b;
            ((g) t10).f(rect);
            c0179a.getClass();
            Rect rect2 = this.f12844c;
            ((g) t11).f(rect2);
            int i = rect.top;
            int i10 = rect2.top;
            if (i < i10) {
                return -1;
            }
            if (i > i10) {
                return 1;
            }
            int i11 = rect.left;
            int i12 = rect2.left;
            boolean z10 = this.f12845d;
            if (i11 < i12) {
                return z10 ? 1 : -1;
            }
            if (i11 > i12) {
                return z10 ? -1 : 1;
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
                return z10 ? 1 : -1;
            }
            if (i15 > i16) {
                return z10 ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = b(r8, r9, r10)
            boolean r1 = b(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = d(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.b.a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static boolean c(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i10 = rect.right;
            int i11 = rect2.right;
            return (i10 > i11 || rect.left >= i11) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            return (i12 > i13 || rect.top >= i13) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i14 = rect.left;
            int i15 = rect2.left;
            return (i14 < i15 || rect.right <= i15) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i16 = rect.top;
        int i17 = rect2.top;
        return (i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom;
    }

    public static int d(int i, Rect rect, Rect rect2) {
        int i10;
        int i11;
        if (i == 17) {
            i10 = rect.left;
            i11 = rect2.right;
        } else if (i == 33) {
            i10 = rect.top;
            i11 = rect2.bottom;
        } else if (i == 66) {
            i10 = rect2.left;
            i11 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i10 = rect2.top;
            i11 = rect.bottom;
        }
        return Math.max(0, i10 - i11);
    }

    public static int e(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
