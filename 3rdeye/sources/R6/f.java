package R6;

import K6.C0713c;
import N7.H9;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import b9.j;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import p9.p;

/* compiled from: DivViewWithItems.kt */
/* loaded from: classes.dex */
public final class f {

    /* compiled from: DivViewWithItems.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11745a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f11746b;

        static {
            int[] iArr = new int[R6.a.values().length];
            try {
                iArr[R6.a.PREVIOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[R6.a.NEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11745a = iArr;
            int[] iArr2 = new int[H9.values().length];
            try {
                iArr2[H9.PX.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[H9.SP.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[H9.DP.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f11746b = iArr2;
        }
    }

    /* compiled from: DivViewWithItems.kt */
    public /* synthetic */ class b extends k implements p<Integer, Integer, C1992A> {
        @Override // p9.p
        public final C1992A invoke(Integer num, Integer num2) {
            ((RecyclerView) this.receiver).smoothScrollBy(num.intValue(), num2.intValue());
            return C1992A.f18074a;
        }
    }

    /* compiled from: DivViewWithItems.kt */
    public /* synthetic */ class c extends k implements p<Integer, Integer, C1992A> {
        @Override // p9.p
        public final C1992A invoke(Integer num, Integer num2) {
            ((RecyclerView) this.receiver).scrollBy(num.intValue(), num2.intValue());
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int a(androidx.recyclerview.widget.RecyclerView r8, R6.a r9) {
        /*
            androidx.recyclerview.widget.LinearLayoutManager r0 = c(r8)
            r1 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 2
            if (r0 != 0) goto Le
        Lb:
            r0 = r1
            goto L7d
        Le:
            int[] r6 = R6.f.a.f11745a
            int r7 = r9.ordinal()
            r6 = r6[r7]
            if (r6 == r2) goto L6e
            if (r6 != r5) goto L68
            androidx.recyclerview.widget.LinearLayoutManager r6 = c(r8)
            if (r6 == 0) goto L27
            int r6 = r6.f16414p
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L28
        L27:
            r6 = r4
        L28:
            if (r6 != 0) goto L2b
            goto L36
        L2b:
            int r7 = r6.intValue()
            if (r7 != 0) goto L36
            boolean r6 = r8.canScrollHorizontally(r2)
            goto L45
        L36:
            if (r6 != 0) goto L39
            goto L44
        L39:
            int r6 = r6.intValue()
            if (r6 != r2) goto L44
            boolean r6 = r8.canScrollVertically(r2)
            goto L45
        L44:
            r6 = r3
        L45:
            if (r6 == 0) goto L57
            int r6 = r0.O()
            android.view.View r0 = r0.l1(r3, r6, r2, r3)
            if (r0 != 0) goto L52
            goto Lb
        L52:
            int r0 = androidx.recyclerview.widget.RecyclerView.p.b0(r0)
            goto L7d
        L57:
            int r6 = r0.O()
            int r6 = r6 - r2
            android.view.View r0 = r0.l1(r6, r1, r2, r3)
            if (r0 != 0) goto L63
            goto Lb
        L63:
            int r0 = androidx.recyclerview.widget.RecyclerView.p.b0(r0)
            goto L7d
        L68:
            b9.j r8 = new b9.j
            r8.<init>()
            throw r8
        L6e:
            int r6 = r0.O()
            android.view.View r0 = r0.l1(r3, r6, r2, r3)
            if (r0 != 0) goto L79
            goto Lb
        L79:
            int r0 = androidx.recyclerview.widget.RecyclerView.p.b0(r0)
        L7d:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            if (r0 == r1) goto L84
            r3 = r2
        L84:
            if (r3 == 0) goto L87
            r4 = r6
        L87:
            if (r4 == 0) goto L8e
            int r8 = r4.intValue()
            return r8
        L8e:
            androidx.recyclerview.widget.LinearLayoutManager r8 = c(r8)
            if (r8 == 0) goto Lb0
            int[] r0 = R6.f.a.f11745a
            int r9 = r9.ordinal()
            r9 = r0[r9]
            if (r9 == r2) goto Lab
            if (r9 != r5) goto La5
            int r8 = r8.i1()
            return r8
        La5:
            b9.j r8 = new b9.j
            r8.<init>()
            throw r8
        Lab:
            int r8 = r8.j1()
            return r8
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: R6.f.a(androidx.recyclerview.widget.RecyclerView, R6.a):int");
    }

    public static final int b(RecyclerView recyclerView) {
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            return layoutManager.V();
        }
        return 0;
    }

    public static final <T extends RecyclerView> LinearLayoutManager c(T t10) {
        RecyclerView.p layoutManager = t10.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    public static final <T extends RecyclerView> int d(T t10) {
        int paddingTop;
        int paddingBottom;
        LinearLayoutManager linearLayoutManagerC = c(t10);
        Integer numValueOf = linearLayoutManagerC != null ? Integer.valueOf(linearLayoutManagerC.f16414p) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            paddingTop = t10.getPaddingLeft() + (t10.computeHorizontalScrollRange() - t10.getWidth());
            paddingBottom = t10.getPaddingRight();
        } else {
            paddingTop = t10.getPaddingTop() + (t10.computeVerticalScrollRange() - t10.getHeight());
            paddingBottom = t10.getPaddingBottom();
        }
        return paddingBottom + paddingTop;
    }

    public static final <T extends RecyclerView> void e(T t10, int i, H9 h92, DisplayMetrics metrics, boolean z10) {
        T t11;
        p cVar;
        int i10 = a.f11746b[h92.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                Integer numValueOf = Integer.valueOf(i);
                l.f(metrics, "metrics");
                i = com.google.gson.internal.c.y(C0713c.X(numValueOf, metrics));
            } else {
                if (i10 != 3) {
                    throw new j();
                }
                i = C0713c.C(Integer.valueOf(i), metrics);
            }
        }
        LinearLayoutManager linearLayoutManagerC = c(t10);
        if (linearLayoutManagerC == null) {
            return;
        }
        if (z10) {
            t11 = t10;
            cVar = new b(2, t11, RecyclerView.class, "smoothScrollBy", "smoothScrollBy(II)V", 0);
        } else {
            t11 = t10;
            cVar = new c(2, t10, RecyclerView.class, "scrollBy", "scrollBy(II)V", 0);
        }
        int i11 = linearLayoutManagerC.f16414p;
        if (i11 == 0) {
            cVar.invoke(Integer.valueOf(i - t11.computeHorizontalScrollOffset()), 0);
        } else {
            if (i11 != 1) {
                return;
            }
            cVar.invoke(0, Integer.valueOf(i - t11.computeVerticalScrollOffset()));
        }
    }
}
