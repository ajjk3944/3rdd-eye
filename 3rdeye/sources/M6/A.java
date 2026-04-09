package M6;

import N7.G7;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: WrapContentPageSizeItemDecoration.kt */
/* loaded from: classes.dex */
public final class A extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f4206a;

    /* renamed from: b, reason: collision with root package name */
    public final j f4207b;

    /* renamed from: c, reason: collision with root package name */
    public final G7.a f4208c;

    /* compiled from: WrapContentPageSizeItemDecoration.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4209a;

        static {
            int[] iArr = new int[G7.a.values().length];
            try {
                iArr[G7.a.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G7.a.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G7.a.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4209a = iArr;
        }
    }

    public A(int i, j jVar, G7.a aVar) {
        this.f4206a = i;
        this.f4207b = jVar;
        this.f4208c = aVar;
    }

    public final int b(View view) {
        float f10;
        int measuredWidth;
        float measuredWidth2;
        int i = a.f4209a[this.f4208c.ordinal()];
        j jVar = this.f4207b;
        int i10 = this.f4206a;
        if (i == 1) {
            f10 = i10 - jVar.f4257g;
            measuredWidth = view.getMeasuredWidth();
        } else {
            if (i == 2) {
                measuredWidth2 = (i10 - view.getMeasuredWidth()) / 2.0f;
                return com.google.gson.internal.c.y(measuredWidth2);
            }
            if (i != 3) {
                throw new b9.j();
            }
            f10 = i10 - jVar.f4258h;
            measuredWidth = view.getMeasuredWidth();
        }
        measuredWidth2 = f10 - measuredWidth;
        return com.google.gson.internal.c.y(measuredWidth2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.B state) {
        View child;
        float measuredHeight;
        int iY;
        float measuredHeight2;
        int iY2;
        kotlin.jvm.internal.l.f(outRect, "outRect");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(parent, "parent");
        kotlin.jvm.internal.l.f(state, "state");
        int width = parent.getWidth();
        j jVar = this.f4207b;
        view.measure(View.MeasureSpec.makeMeasureSpec(width - com.google.gson.internal.c.y(jVar.f4253c + jVar.f4255e), 1073741824), View.MeasureSpec.makeMeasureSpec(parent.getHeight() - com.google.gson.internal.c.y(jVar.f4254d + jVar.f4256f), 1073741824));
        l lVar = view instanceof l ? (l) view : null;
        if (lVar == null || (child = lVar.getChild()) == null) {
            return;
        }
        Integer num = jVar.i;
        int iIntValue = num != null ? num.intValue() : b(child);
        Integer num2 = jVar.f4259j;
        int i = this.f4206a;
        G7.a aVar = this.f4208c;
        if (num2 != null) {
            iY = num2.intValue();
        } else {
            int i10 = a.f4209a[aVar.ordinal()];
            if (i10 == 1) {
                measuredHeight = jVar.f4257g;
            } else if (i10 == 2) {
                measuredHeight = (i - child.getMeasuredHeight()) / 2.0f;
            } else {
                if (i10 != 3) {
                    throw new b9.j();
                }
                measuredHeight = (i - jVar.f4258h) - child.getMeasuredHeight();
            }
            iY = com.google.gson.internal.c.y(measuredHeight);
        }
        Integer num3 = jVar.f4260k;
        int iIntValue2 = num3 != null ? num3.intValue() : b(child);
        Integer num4 = jVar.f4261l;
        if (num4 != null) {
            iY2 = num4.intValue();
        } else {
            int i11 = a.f4209a[aVar.ordinal()];
            if (i11 == 1) {
                measuredHeight2 = (i - jVar.f4257g) - child.getMeasuredHeight();
            } else if (i11 == 2) {
                measuredHeight2 = (i - child.getMeasuredHeight()) / 2.0f;
            } else {
                if (i11 != 3) {
                    throw new b9.j();
                }
                measuredHeight2 = jVar.f4258h;
            }
            iY2 = com.google.gson.internal.c.y(measuredHeight2);
        }
        outRect.set(iIntValue, iY, iIntValue2, iY2);
    }
}
