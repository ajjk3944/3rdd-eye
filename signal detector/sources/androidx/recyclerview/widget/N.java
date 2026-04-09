package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class N implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5298a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5299b;

    public /* synthetic */ N(int i, Object obj) {
        this.f5298a = i;
        this.f5299b = obj;
    }

    @Override // androidx.recyclerview.widget.r0
    public int a(View view) {
        int decoratedLeft;
        int i;
        switch (this.f5298a) {
            case 0:
                S s5 = (S) view.getLayoutParams();
                decoratedLeft = ((Q) this.f5299b).getDecoratedLeft(view);
                i = ((ViewGroup.MarginLayoutParams) s5).leftMargin;
                break;
            default:
                S s6 = (S) view.getLayoutParams();
                decoratedLeft = ((Q) this.f5299b).getDecoratedTop(view);
                i = ((ViewGroup.MarginLayoutParams) s6).topMargin;
                break;
        }
        return decoratedLeft - i;
    }

    @Override // androidx.recyclerview.widget.r0
    public int b() {
        switch (this.f5298a) {
            case 0:
                return ((Q) this.f5299b).getPaddingLeft();
            default:
                return ((Q) this.f5299b).getPaddingTop();
        }
    }

    @Override // androidx.recyclerview.widget.r0
    public int c() {
        int width;
        int paddingRight;
        switch (this.f5298a) {
            case 0:
                Q q3 = (Q) this.f5299b;
                width = q3.getWidth();
                paddingRight = q3.getPaddingRight();
                break;
            default:
                Q q6 = (Q) this.f5299b;
                width = q6.getHeight();
                paddingRight = q6.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // androidx.recyclerview.widget.r0
    public View d(int i) {
        switch (this.f5298a) {
        }
        return ((Q) this.f5299b).getChildAt(i);
    }

    @Override // androidx.recyclerview.widget.r0
    public int e(View view) {
        int decoratedRight;
        int i;
        switch (this.f5298a) {
            case 0:
                S s5 = (S) view.getLayoutParams();
                decoratedRight = ((Q) this.f5299b).getDecoratedRight(view);
                i = ((ViewGroup.MarginLayoutParams) s5).rightMargin;
                break;
            default:
                S s6 = (S) view.getLayoutParams();
                decoratedRight = ((Q) this.f5299b).getDecoratedBottom(view);
                i = ((ViewGroup.MarginLayoutParams) s6).bottomMargin;
                break;
        }
        return decoratedRight + i;
    }
}
