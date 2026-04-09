package r7;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import g0.C4356c;

/* compiled from: DivViewGroup.kt */
/* renamed from: r7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5534e extends ViewGroup {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f45766c = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f45767b;

    /* compiled from: DivViewGroup.kt */
    /* renamed from: r7.e$a */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if (r11 == Integer.MAX_VALUE) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        
            r9 = r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        
            if (r11 == Integer.MAX_VALUE) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (r11 == Integer.MAX_VALUE) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int a(int r7, int r8, int r9, int r10, int r11) {
            /*
                int r0 = android.view.View.MeasureSpec.getMode(r7)
                int r7 = android.view.View.MeasureSpec.getSize(r7)
                int r7 = r7 - r8
                r8 = 0
                int r7 = java.lang.Math.max(r8, r7)
                r1 = -3
                r2 = -2
                r3 = -1
                r4 = 1073741824(0x40000000, float:2.0)
                r5 = 2147483647(0x7fffffff, float:NaN)
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r6) goto L4e
                if (r0 == 0) goto L3e
                if (r0 == r4) goto L20
                goto L67
            L20:
                if (r9 < 0) goto L26
                if (r9 > r5) goto L26
            L24:
                r8 = r4
                goto L68
            L26:
                if (r9 != r3) goto L2a
                r9 = r7
                goto L24
            L2a:
                if (r9 != r2) goto L33
                if (r11 != r5) goto L30
            L2e:
                r9 = r7
                goto L68
            L30:
                r9 = r11
            L31:
                r8 = r6
                goto L68
            L33:
                if (r9 != r1) goto L67
                int r7 = java.lang.Math.max(r7, r10)
                int r9 = java.lang.Math.min(r7, r11)
                goto L31
            L3e:
                if (r9 < 0) goto L43
                if (r9 > r5) goto L43
                goto L24
            L43:
                if (r9 != r3) goto L46
                goto L2e
            L46:
                if (r9 != r2) goto L49
                goto L4b
            L49:
                if (r9 != r1) goto L67
            L4b:
                if (r11 != r5) goto L30
                goto L2e
            L4e:
                if (r9 < 0) goto L53
                if (r9 > r5) goto L53
                goto L24
            L53:
                if (r9 != r3) goto L57
                r9 = r7
                goto L31
            L57:
                if (r9 != r2) goto L5c
                if (r11 != r5) goto L30
                goto L2e
            L5c:
                if (r9 != r1) goto L67
                int r7 = java.lang.Math.max(r7, r10)
                int r9 = java.lang.Math.min(r7, r11)
                goto L31
            L67:
                r9 = r8
            L68:
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r8)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: r7.AbstractC5534e.a.a(int, int, int, int, int):int");
        }
    }

    /* compiled from: DivViewGroup.kt */
    /* renamed from: r7.e$b */
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        public float f45768a = 0.0f;

        /* renamed from: b, reason: collision with root package name */
        public float f45769b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public int f45770c = 0;

        public b(int i) {
        }

        public final void a(float f10, int i, int i10) {
            this.f45768a = 0.0f;
            this.f45769b = 0.0f;
            this.f45770c = 0;
            switch (i) {
                case 1:
                case 16:
                    this.f45768a = f10 / 2;
                    return;
                case 3:
                case 48:
                    return;
                case 5:
                case 80:
                    this.f45768a = f10;
                    return;
                case 16777216:
                case 268435456:
                    int i11 = AbstractC5534e.f45766c;
                    float f11 = f10 / (i10 * 2);
                    this.f45768a = f11;
                    float f12 = 2;
                    this.f45769b = f11 * f12;
                    this.f45770c = (int) (f11 / f12);
                    return;
                case 33554432:
                case 536870912:
                    int i12 = AbstractC5534e.f45766c;
                    this.f45769b = i10 != 1 ? f10 / (i10 - 1) : 0.0f;
                    return;
                case 67108864:
                case 1073741824:
                    int i13 = AbstractC5534e.f45766c;
                    float f13 = f10 / (i10 + 1);
                    this.f45768a = f13;
                    this.f45769b = f13;
                    this.f45770c = (int) (f13 / 2);
                    return;
                default:
                    throw new IllegalStateException(C4356c.h(i, "Invalid gravity is set: "));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5534e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.l.f(context, "context");
        this.f45767b = 8388659;
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C5533d;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C5533d(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C5533d(getContext(), attributeSet);
    }

    public final int getGravity() {
        return this.f45767b;
    }

    public final int getHorizontalGravity$div_release() {
        return this.f45767b & 125829127;
    }

    public final int getHorizontalPaddings$div_release() {
        return getPaddingRight() + getPaddingLeft();
    }

    public final int getVerticalGravity$div_release() {
        return this.f45767b & 1879048304;
    }

    public final int getVerticalPaddings$div_release() {
        return getPaddingBottom() + getPaddingTop();
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View child, int i, int i10) {
        kotlin.jvm.internal.l.f(child, "child");
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        C5533d c5533d = (C5533d) layoutParams;
        child.measure(a.a(i, getHorizontalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) c5533d).width, child.getMinimumWidth(), c5533d.f45765h), a.a(i10, getVerticalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) c5533d).height, child.getMinimumHeight(), c5533d.f45764g));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View child, int i, int i10, int i11, int i12) {
        kotlin.jvm.internal.l.f(child, "child");
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        C5533d c5533d = (C5533d) layoutParams;
        child.measure(a.a(i, c5533d.b() + getHorizontalPaddings$div_release() + i10, ((ViewGroup.MarginLayoutParams) c5533d).width, child.getMinimumWidth(), c5533d.f45765h), a.a(i11, c5533d.d() + getVerticalPaddings$div_release() + i12, ((ViewGroup.MarginLayoutParams) c5533d).height, child.getMinimumHeight(), c5533d.f45764g));
    }

    public final void setGravity(int i) {
        if (this.f45767b == i) {
            return;
        }
        if ((125829127 & i) == 0) {
            i |= 8388611;
        }
        if ((1879048304 & i) == 0) {
            i |= 48;
        }
        this.f45767b = i;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C5533d ? new C5533d((C5533d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C5533d((ViewGroup.MarginLayoutParams) layoutParams) : new C5533d(layoutParams);
    }

    public static /* synthetic */ void getGravity$annotations() {
    }
}
