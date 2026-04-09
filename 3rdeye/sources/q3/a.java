package Q3;

import B7.d;
import D0.a;
import L0.I;
import L0.S;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.button.MaterialButton;
import i4.C4456a;
import java.util.WeakHashMap;
import l4.C5287f;
import l4.C5290i;
import l4.m;

/* compiled from: MaterialButtonHelper.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f10930a;

    /* renamed from: b, reason: collision with root package name */
    public C5290i f10931b;

    /* renamed from: c, reason: collision with root package name */
    public int f10932c;

    /* renamed from: d, reason: collision with root package name */
    public int f10933d;

    /* renamed from: e, reason: collision with root package name */
    public int f10934e;

    /* renamed from: f, reason: collision with root package name */
    public int f10935f;

    /* renamed from: g, reason: collision with root package name */
    public int f10936g;

    /* renamed from: h, reason: collision with root package name */
    public int f10937h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f10938j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f10939k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f10940l;

    /* renamed from: m, reason: collision with root package name */
    public C5287f f10941m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10945q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f10947s;

    /* renamed from: t, reason: collision with root package name */
    public int f10948t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10942n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10943o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10944p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10946r = true;

    public a(MaterialButton materialButton, C5290i c5290i) {
        this.f10930a = materialButton;
        this.f10931b = c5290i;
    }

    public final m a() {
        RippleDrawable rippleDrawable = this.f10947s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f10947s.getNumberOfLayers() > 2 ? (m) this.f10947s.getDrawable(2) : (m) this.f10947s.getDrawable(1);
    }

    public final C5287f b(boolean z10) {
        RippleDrawable rippleDrawable = this.f10947s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C5287f) ((LayerDrawable) ((InsetDrawable) this.f10947s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
    }

    public final void c(C5290i c5290i) {
        this.f10931b = c5290i;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(c5290i);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(c5290i);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(c5290i);
        }
    }

    public final void d(int i, int i10) {
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        MaterialButton materialButton = this.f10930a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i11 = this.f10934e;
        int i12 = this.f10935f;
        this.f10935f = i10;
        this.f10934e = i;
        if (!this.f10943o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i11, paddingEnd, (paddingBottom + i10) - i12);
    }

    public final void e() {
        C5287f c5287f = new C5287f(this.f10931b);
        MaterialButton materialButton = this.f10930a;
        c5287f.i(materialButton.getContext());
        a.C0009a.h(c5287f, this.f10938j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            a.C0009a.i(c5287f, mode);
        }
        float f10 = this.f10937h;
        ColorStateList colorStateList = this.f10939k;
        c5287f.f43759b.f43790j = f10;
        c5287f.invalidateSelf();
        C5287f.b bVar = c5287f.f43759b;
        if (bVar.f43785d != colorStateList) {
            bVar.f43785d = colorStateList;
            c5287f.onStateChange(c5287f.getState());
        }
        C5287f c5287f2 = new C5287f(this.f10931b);
        c5287f2.setTint(0);
        float f11 = this.f10937h;
        int iM = this.f10942n ? d.m(R.attr.colorSurface, materialButton) : 0;
        c5287f2.f43759b.f43790j = f11;
        c5287f2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM);
        C5287f.b bVar2 = c5287f2.f43759b;
        if (bVar2.f43785d != colorStateListValueOf) {
            bVar2.f43785d = colorStateListValueOf;
            c5287f2.onStateChange(c5287f2.getState());
        }
        C5287f c5287f3 = new C5287f(this.f10931b);
        this.f10941m = c5287f3;
        a.C0009a.g(c5287f3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(C4456a.a(this.f10940l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c5287f2, c5287f}), this.f10932c, this.f10934e, this.f10933d, this.f10935f), this.f10941m);
        this.f10947s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C5287f c5287fB = b(false);
        if (c5287fB != null) {
            c5287fB.j(this.f10948t);
            c5287fB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        C5287f c5287fB = b(false);
        C5287f c5287fB2 = b(true);
        if (c5287fB != null) {
            float f10 = this.f10937h;
            ColorStateList colorStateList = this.f10939k;
            c5287fB.f43759b.f43790j = f10;
            c5287fB.invalidateSelf();
            C5287f.b bVar = c5287fB.f43759b;
            if (bVar.f43785d != colorStateList) {
                bVar.f43785d = colorStateList;
                c5287fB.onStateChange(c5287fB.getState());
            }
            if (c5287fB2 != null) {
                float f11 = this.f10937h;
                int iM = this.f10942n ? d.m(R.attr.colorSurface, this.f10930a) : 0;
                c5287fB2.f43759b.f43790j = f11;
                c5287fB2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM);
                C5287f.b bVar2 = c5287fB2.f43759b;
                if (bVar2.f43785d != colorStateListValueOf) {
                    bVar2.f43785d = colorStateListValueOf;
                    c5287fB2.onStateChange(c5287fB2.getState());
                }
            }
        }
    }
}
