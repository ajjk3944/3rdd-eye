package O6;

import H6.C0672i;
import N7.B8;
import N7.X2;
import N7.Z;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import z0.C5848a;

/* compiled from: DivInputView.kt */
/* loaded from: classes.dex */
public final class p extends r7.m implements l<Z.h> {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m<Z.h> f10437m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f10438n;

    /* renamed from: o, reason: collision with root package name */
    public T6.b f10439o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f10440p;

    /* renamed from: q, reason: collision with root package name */
    public o f10441q;

    /* renamed from: r, reason: collision with root package name */
    public String f10442r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10443s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10444t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10445u;

    public p(Context context) {
        super(context);
        this.f10437m = new m<>();
        this.f10438n = C5848a.getDrawable(context, getNativeBackgroundResId());
        this.f10440p = new ArrayList();
        this.f10443s = true;
        this.f10444t = true;
    }

    private int getNativeBackgroundResId() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.editTextBackground, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // i7.k
    public final void b(j6.d dVar) {
        m<Z.h> mVar = this.f10437m;
        mVar.getClass();
        B8.c(mVar, dVar);
    }

    @Override // O6.InterfaceC1478d
    public final void c() {
        this.f10437m.c();
    }

    @Override // O6.InterfaceC1478d
    public final void d(C0672i bindingContext, X2 x22, View view) throws Exception {
        kotlin.jvm.internal.l.f(bindingContext, "bindingContext");
        kotlin.jvm.internal.l.f(view, "view");
        this.f10437m.d(bindingContext, x22, view);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int iSave;
        kotlin.jvm.internal.l.f(canvas, "canvas");
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        C1476b divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        if (scrollX == 0 && scrollY == 0) {
            iSave = canvas.save();
            try {
                divBorderDrawer.c(canvas);
                super.draw(canvas);
                divBorderDrawer.d(canvas);
                return;
            } finally {
            }
        }
        float f10 = scrollX;
        float f11 = scrollY;
        iSave = canvas.save();
        try {
            canvas.translate(f10, f11);
            divBorderDrawer.c(canvas);
            canvas.translate(-f10, -f11);
            super.draw(canvas);
            canvas.translate(f10, f11);
            divBorderDrawer.d(canvas);
        } finally {
        }
    }

    @Override // r7.r
    public final void e(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10437m.e(view);
    }

    @Override // r7.r
    public final boolean g() {
        return this.f10437m.f10430c.g();
    }

    public boolean getAccessibilityEnabled$div_release() {
        return this.f10445u;
    }

    @Override // O6.l
    public C0672i getBindingContext() {
        return this.f10437m.f10432e;
    }

    @Override // O6.InterfaceC1478d
    public C1476b getDivBorderDrawer() {
        return this.f10437m.f10429b.f10419b;
    }

    public boolean getEnabled() {
        return this.f10444t;
    }

    public T6.b getFocusTracker$div_release() {
        return this.f10439o;
    }

    public Drawable getNativeBackground$div_release() {
        return this.f10438n;
    }

    @Override // O6.InterfaceC1478d
    public boolean getNeedClipping() {
        return this.f10437m.f10429b.f10420c;
    }

    @Override // i7.k
    public List<j6.d> getSubscriptions() {
        return this.f10437m.f10433f;
    }

    @Override // i7.k
    public final void h() throws Exception {
        m<Z.h> mVar = this.f10437m;
        mVar.getClass();
        B8.d(mVar);
    }

    @Override // r7.r
    public final void j(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.f10437m.j(view);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i, Rect rect) {
        T6.b focusTracker$div_release = getFocusTracker$div_release();
        if (focusTracker$div_release != null) {
            Object tag = getTag();
            if (!focusTracker$div_release.f12301b) {
                if (z10) {
                    focusTracker$div_release.f12300a = tag;
                    T6.b.f12299d = new WeakReference<>(this);
                    setSelection(length());
                } else if (!z10) {
                    focusTracker$div_release.f12300a = null;
                    T6.b.f12299d = null;
                }
            }
        }
        super.onFocusChanged(z10, i, rect);
    }

    @Override // r7.m, android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.f10437m.a();
    }

    @Override // H6.O
    public final void release() throws Exception {
        this.f10437m.release();
    }

    public void setAccessibilityEnabled$div_release(boolean z10) {
        this.f10445u = z10;
        setInputHint(this.f10442r);
    }

    @Override // O6.l
    public void setBindingContext(C0672i c0672i) {
        this.f10437m.f10432e = c0672i;
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        setInputHint(this.f10442r);
    }

    public void setEnabled$div_release(boolean z10) {
        this.f10444t = z10;
        setFocusable(this.f10443s);
    }

    public void setFocusTracker$div_release(T6.b bVar) {
        this.f10439o = bVar;
    }

    @Override // android.view.View
    public void setFocusable(boolean z10) {
        this.f10443s = z10;
        boolean z11 = z10 && getEnabled();
        super.setFocusable(z11);
        setFocusableInTouchMode(z11);
    }

    public void setInputHint(String str) {
        CharSequence contentDescription;
        CharSequence charSequenceSubSequence;
        this.f10442r = str;
        CharSequence contentDescription2 = str;
        if (getAccessibilityEnabled$div_release()) {
            if ((str == null || str.length() == 0) && ((contentDescription = getContentDescription()) == null || contentDescription.length() == 0)) {
                contentDescription2 = null;
            } else if (str == null || str.length() == 0) {
                contentDescription2 = getContentDescription();
            } else {
                CharSequence contentDescription3 = getContentDescription();
                contentDescription2 = str;
                if (contentDescription3 != null) {
                    contentDescription2 = str;
                    if (contentDescription3.length() != 0) {
                        StringBuilder sb = new StringBuilder();
                        char[] cArr = {'.'};
                        kotlin.jvm.internal.l.f(str, "<this>");
                        int length = str.length() - 1;
                        if (length >= 0) {
                            while (true) {
                                int i = length - 1;
                                char cCharAt = str.charAt(length);
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= 1) {
                                        i10 = -1;
                                        break;
                                    } else if (cCharAt == cArr[i10]) {
                                        break;
                                    } else {
                                        i10++;
                                    }
                                }
                                if (i10 < 0) {
                                    charSequenceSubSequence = str.subSequence(0, length + 1);
                                    break;
                                } else if (i < 0) {
                                    break;
                                } else {
                                    length = i;
                                }
                            }
                            sb.append(charSequenceSubSequence.toString());
                            sb.append(". ");
                            sb.append((Object) getContentDescription());
                            contentDescription2 = sb.toString();
                        } else {
                            charSequenceSubSequence = "";
                            sb.append(charSequenceSubSequence.toString());
                            sb.append(". ");
                            sb.append((Object) getContentDescription());
                            contentDescription2 = sb.toString();
                        }
                    }
                }
            }
        }
        setHint(contentDescription2);
    }

    @Override // O6.InterfaceC1478d
    public void setNeedClipping(boolean z10) {
        this.f10437m.setNeedClipping(z10);
    }

    @Override // O6.l
    public Z.h getDiv() {
        return (Z.h) this.f10437m.f10431d;
    }

    @Override // O6.l
    public void setDiv(Z.h hVar) {
        this.f10437m.f10431d = hVar;
    }
}
