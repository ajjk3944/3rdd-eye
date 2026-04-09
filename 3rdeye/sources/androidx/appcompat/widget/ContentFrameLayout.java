package androidx.appcompat.widget;

import L0.S;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f;
import h.C4403g;
import h.LayoutInflaterFactory2C4402f;
import o.InterfaceC5373A;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f14621b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f14622c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f14623d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f14624e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f14625f;

    /* renamed from: g, reason: collision with root package name */
    public TypedValue f14626g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f14627h;
    public a i;

    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f14627h = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f14625f == null) {
            this.f14625f = new TypedValue();
        }
        return this.f14625f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f14626g == null) {
            this.f14626g = new TypedValue();
        }
        return this.f14626g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f14623d == null) {
            this.f14623d = new TypedValue();
        }
        return this.f14623d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f14624e == null) {
            this.f14624e = new TypedValue();
        }
        return this.f14624e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f14621b == null) {
            this.f14621b = new TypedValue();
        }
        return this.f14621b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f14622c == null) {
            this.f14622c = new TypedValue();
        }
        return this.f14622c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.i;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.i;
        if (aVar != null) {
            LayoutInflaterFactory2C4402f layoutInflaterFactory2C4402f = ((C4403g) aVar).f38067a;
            InterfaceC5373A interfaceC5373A = layoutInflaterFactory2C4402f.f38025s;
            if (interfaceC5373A != null) {
                interfaceC5373A.i();
            }
            if (layoutInflaterFactory2C4402f.f38030x != null) {
                layoutInflaterFactory2C4402f.f38019m.getDecorView().removeCallbacks(layoutInflaterFactory2C4402f.f38031y);
                if (layoutInflaterFactory2C4402f.f38030x.isShowing()) {
                    try {
                        layoutInflaterFactory2C4402f.f38030x.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C4402f.f38030x = null;
            }
            S s10 = layoutInflaterFactory2C4402f.f38032z;
            if (s10 != null) {
                s10.b();
            }
            f fVar = layoutInflaterFactory2C4402f.R(0).f38058h;
            if (fVar != null) {
                fVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.i = aVar;
    }
}
