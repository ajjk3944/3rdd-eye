package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.cw0;
import defpackage.e2;
import defpackage.e90;
import defpackage.ex0;
import defpackage.fh;
import defpackage.fn0;
import defpackage.g20;
import defpackage.g4;
import defpackage.h90;
import defpackage.hv;
import defpackage.i90;
import defpackage.j90;
import defpackage.jp0;
import defpackage.m90;
import defpackage.n90;
import defpackage.o90;
import defpackage.ob1;
import defpackage.p80;
import defpackage.q90;
import defpackage.qk0;
import defpackage.r80;
import defpackage.s30;
import defpackage.s80;
import defpackage.s90;
import defpackage.t40;
import defpackage.t80;
import defpackage.te0;
import defpackage.u80;
import defpackage.v01;
import defpackage.vq2;
import defpackage.w80;
import defpackage.x8;
import defpackage.xb4;
import defpackage.z80;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final p80 v = new p80();
    public final t80 i;
    public final t80 j;
    public m90 k;
    public int l;
    public final i90 m;
    public String n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final HashSet s;
    public final HashSet t;
    public q90 u;

    public LottieAnimationView(Context context, AttributeSet attributeSet) throws IOException {
        String string;
        super(context, attributeSet);
        this.i = new t80(this, 1);
        this.j = new t80(this, 0);
        this.l = 0;
        i90 i90Var = new i90();
        this.m = i90Var;
        this.p = false;
        this.q = false;
        this.r = true;
        HashSet hashSet = new HashSet();
        this.s = hashSet;
        this.t = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, fn0.a, R.attr.lottieAnimationViewStyle, 0);
        this.r = typedArrayObtainStyledAttributes.getBoolean(4, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(16);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(11);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(21);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(16, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(11);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(21)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(10, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            this.q = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            i90Var.g.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(19)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(19, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(18, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(20, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(6, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(5, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(8));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(13));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(15);
        float f = typedArrayObtainStyledAttributes.getFloat(15, 0.0f);
        if (zHasValue4) {
            hashSet.add(s80.g);
        }
        i90Var.t(f);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(9, false);
        HashSet hashSet2 = (HashSet) i90Var.q.g;
        j90 j90Var = j90.f;
        boolean zAdd = z ? hashSet2.add(j90Var) : hashSet2.remove(j90Var);
        if (i90Var.f != null && zAdd) {
            i90Var.c();
        }
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(0, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(1, true));
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            i90Var.a(new t40("**"), n90.F, new vq2(new cw0(ob1.d(getContext(), typedArrayObtainStyledAttributes.getResourceId(7, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            int i = typedArrayObtainStyledAttributes.getInt(17, 0);
            setRenderMode(jp0.values()[i >= jp0.values().length ? 0 : i]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(2, 0);
            setAsyncUpdates(x8.values()[i2 >= jp0.values().length ? 0 : i2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(12, false));
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(22, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setCompositionTask(q90 q90Var) {
        o90 o90Var = q90Var.d;
        i90 i90Var = this.m;
        if (o90Var != null && i90Var == getDrawable() && i90Var.f == o90Var.a) {
            return;
        }
        this.s.add(s80.f);
        this.m.d();
        c();
        q90Var.b(this.i);
        q90Var.a(this.j);
        this.u = q90Var;
    }

    public final void c() {
        q90 q90Var = this.u;
        if (q90Var != null) {
            t80 t80Var = this.i;
            synchronized (q90Var) {
                q90Var.a.remove(t80Var);
            }
            q90 q90Var2 = this.u;
            t80 t80Var2 = this.j;
            synchronized (q90Var2) {
                q90Var2.b.remove(t80Var2);
            }
        }
    }

    public x8 getAsyncUpdates() {
        x8 x8Var = this.m.Q;
        return x8Var != null ? x8Var : x8.f;
    }

    public boolean getAsyncUpdatesEnabled() {
        x8 x8Var = this.m.Q;
        if (x8Var == null) {
            x8Var = x8.f;
        }
        return x8Var == x8.g;
    }

    public boolean getClipTextToBoundingBox() {
        return this.m.z;
    }

    public boolean getClipToCompositionBounds() {
        return this.m.s;
    }

    public u80 getComposition() {
        Drawable drawable = getDrawable();
        i90 i90Var = this.m;
        if (drawable == i90Var) {
            return i90Var.f;
        }
        return null;
    }

    public long getDuration() {
        u80 composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.m.g.m;
    }

    public String getImageAssetsFolder() {
        return this.m.m;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.m.r;
    }

    public float getMaxFrame() {
        return this.m.g.b();
    }

    public float getMinFrame() {
        return this.m.g.c();
    }

    public qk0 getPerformanceTracker() {
        u80 u80Var = this.m.f;
        if (u80Var != null) {
            return u80Var.a;
        }
        return null;
    }

    public float getProgress() {
        return this.m.g.a();
    }

    public jp0 getRenderMode() {
        return this.m.B ? jp0.h : jp0.g;
    }

    public int getRepeatCount() {
        return this.m.g.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.m.g.getRepeatMode();
    }

    public float getSpeed() {
        return this.m.g.i;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof i90) {
            boolean z = ((i90) drawable).B;
            jp0 jp0Var = jp0.h;
            if ((z ? jp0Var : jp0.g) == jp0Var) {
                this.m.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        i90 i90Var = this.m;
        if (drawable2 == i90Var) {
            super.invalidateDrawable(i90Var);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.q) {
            return;
        }
        this.m.k();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws IOException {
        int i;
        if (!(parcelable instanceof r80)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r80 r80Var = (r80) parcelable;
        super.onRestoreInstanceState(r80Var.getSuperState());
        this.n = r80Var.f;
        HashSet hashSet = this.s;
        s80 s80Var = s80.f;
        if (!hashSet.contains(s80Var) && !TextUtils.isEmpty(this.n)) {
            setAnimation(this.n);
        }
        this.o = r80Var.g;
        if (!hashSet.contains(s80Var) && (i = this.o) != 0) {
            setAnimation(i);
        }
        boolean zContains = hashSet.contains(s80.g);
        i90 i90Var = this.m;
        if (!zContains) {
            i90Var.t(r80Var.h);
        }
        s80 s80Var2 = s80.k;
        if (!hashSet.contains(s80Var2) && r80Var.i) {
            hashSet.add(s80Var2);
            i90Var.k();
        }
        if (!hashSet.contains(s80.j)) {
            setImageAssetsFolder(r80Var.j);
        }
        if (!hashSet.contains(s80.h)) {
            setRepeatMode(r80Var.k);
        }
        if (hashSet.contains(s80.i)) {
            return;
        }
        setRepeatCount(r80Var.l);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        r80 r80Var = new r80(super.onSaveInstanceState());
        r80Var.f = this.n;
        r80Var.g = this.o;
        i90 i90Var = this.m;
        s90 s90Var = i90Var.g;
        s90 s90Var2 = i90Var.g;
        r80Var.h = s90Var.a();
        if (i90Var.isVisible()) {
            z = s90Var2.r;
        } else {
            int i = i90Var.U;
            z = i == 2 || i == 3;
        }
        r80Var.i = z;
        r80Var.j = i90Var.m;
        r80Var.k = s90Var2.getRepeatMode();
        r80Var.l = s90Var2.getRepeatCount();
        return r80Var;
    }

    public void setAnimation(final int i) throws IOException {
        q90 q90VarA;
        this.o = i;
        final String str = null;
        this.n = null;
        if (isInEditMode()) {
            q90VarA = new q90(new Callable() { // from class: q80
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this.a;
                    boolean z = lottieAnimationView.r;
                    int i2 = i;
                    if (!z) {
                        return z80.f(i2, lottieAnimationView.getContext(), null);
                    }
                    Context context = lottieAnimationView.getContext();
                    return z80.f(i2, context, z80.k(context, i2));
                }
            }, true);
        } else if (this.r) {
            Context context = getContext();
            final String strK = z80.k(context, i);
            final WeakReference weakReference = new WeakReference(context);
            final Context applicationContext = context.getApplicationContext();
            q90VarA = z80.a(strK, new Callable() { // from class: y80
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = (Context) weakReference.get();
                    if (context2 == null) {
                        context2 = applicationContext;
                    }
                    return z80.f(i, context2, strK);
                }
            }, null);
        } else {
            Context context2 = getContext();
            HashMap map = z80.a;
            final WeakReference weakReference2 = new WeakReference(context2);
            final Context applicationContext2 = context2.getApplicationContext();
            q90VarA = z80.a(null, new Callable() { // from class: y80
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context22 = (Context) weakReference2.get();
                    if (context22 == null) {
                        context22 = applicationContext2;
                    }
                    return z80.f(i, context22, str);
                }
            }, null);
        }
        setCompositionTask(q90VarA);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(z80.a(null, new s30(1, byteArrayInputStream), new e2(9, byteArrayInputStream)));
    }

    public void setAnimationFromUrl(String str) throws IOException {
        q90 q90VarA;
        int i = 0;
        String str2 = null;
        if (this.r) {
            Context context = getContext();
            HashMap map = z80.a;
            String str3 = "url_" + str;
            q90VarA = z80.a(str3, new w80(context, str, str3, i), null);
        } else {
            q90VarA = z80.a(null, new w80(getContext(), str, str2, i), null);
        }
        setCompositionTask(q90VarA);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.m.x = z;
    }

    public void setApplyingShadowToLayersEnabled(boolean z) {
        this.m.y = z;
    }

    public void setAsyncUpdates(x8 x8Var) {
        this.m.Q = x8Var;
    }

    public void setCacheComposition(boolean z) {
        this.r = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        i90 i90Var = this.m;
        if (z != i90Var.z) {
            i90Var.z = z;
            i90Var.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        i90 i90Var = this.m;
        if (z != i90Var.s) {
            i90Var.s = z;
            fh fhVar = i90Var.t;
            if (fhVar != null) {
                fhVar.L = z;
            }
            i90Var.invalidateSelf();
        }
    }

    public void setComposition(u80 u80Var) {
        i90 i90Var = this.m;
        i90Var.setCallback(this);
        boolean z = true;
        this.p = true;
        ArrayList arrayList = i90Var.k;
        s90 s90Var = i90Var.g;
        if (i90Var.f == u80Var) {
            z = false;
        } else {
            i90Var.P = true;
            i90Var.d();
            i90Var.f = u80Var;
            i90Var.c();
            boolean z2 = s90Var.q == null;
            s90Var.q = u80Var;
            if (z2) {
                s90Var.i(Math.max(s90Var.o, u80Var.l), Math.min(s90Var.p, u80Var.m));
            } else {
                s90Var.i((int) u80Var.l, (int) u80Var.m);
            }
            float f = s90Var.m;
            s90Var.m = 0.0f;
            s90Var.l = 0.0f;
            s90Var.h((int) f);
            s90Var.f();
            i90Var.t(s90Var.getAnimatedFraction());
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                h90 h90Var = (h90) it.next();
                if (h90Var != null) {
                    h90Var.run();
                }
                it.remove();
            }
            arrayList.clear();
            u80Var.a.a = i90Var.v;
            i90Var.e();
            Drawable.Callback callback = i90Var.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(i90Var);
            }
        }
        if (this.q) {
            i90Var.k();
        }
        this.p = false;
        if (getDrawable() != i90Var || z) {
            if (!z) {
                boolean z3 = s90Var != null ? s90Var.r : false;
                setImageDrawable(null);
                setImageDrawable(i90Var);
                if (z3) {
                    i90Var.m();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.t.iterator();
            if (it2.hasNext()) {
                throw ex0.e(it2);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        i90 i90Var = this.m;
        i90Var.p = str;
        g4 g4VarI = i90Var.i();
        if (g4VarI != null) {
            g4VarI.k = str;
        }
    }

    public void setFailureListener(m90 m90Var) {
        this.k = m90Var;
    }

    public void setFallbackResource(int i) {
        this.l = i;
    }

    public void setFontAssetDelegate(hv hvVar) {
        g4 g4Var = this.m.n;
    }

    public void setFontMap(Map<String, Typeface> map) {
        i90 i90Var = this.m;
        if (map == i90Var.o) {
            return;
        }
        i90Var.o = map;
        i90Var.invalidateSelf();
    }

    public void setFrame(int i) {
        this.m.n(i);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.m.i = z;
    }

    public void setImageAssetDelegate(g20 g20Var) {
        xb4 xb4Var = this.m.l;
    }

    public void setImageAssetsFolder(String str) {
        this.m.m = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.o = 0;
        this.n = null;
        c();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.o = 0;
        this.n = null;
        c();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.o = 0;
        this.n = null;
        c();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.m.r = z;
    }

    public void setMaxFrame(int i) {
        this.m.o(i);
    }

    public void setMaxProgress(float f) {
        i90 i90Var = this.m;
        u80 u80Var = i90Var.f;
        if (u80Var == null) {
            i90Var.k.add(new e90(i90Var, f, 0));
            return;
        }
        s90 s90Var = i90Var.g;
        s90Var.i(s90Var.o, te0.f(u80Var.l, u80Var.m, f));
    }

    public void setMinAndMaxFrame(String str) {
        this.m.q(str);
    }

    public void setMinFrame(int i) {
        this.m.r(i);
    }

    public void setMinProgress(float f) {
        i90 i90Var = this.m;
        u80 u80Var = i90Var.f;
        if (u80Var == null) {
            i90Var.k.add(new e90(i90Var, f, 1));
        } else {
            i90Var.r((int) te0.f(u80Var.l, u80Var.m, f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        i90 i90Var = this.m;
        if (i90Var.w == z) {
            return;
        }
        i90Var.w = z;
        fh fhVar = i90Var.t;
        if (fhVar != null) {
            fhVar.q(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        i90 i90Var = this.m;
        i90Var.v = z;
        u80 u80Var = i90Var.f;
        if (u80Var != null) {
            u80Var.a.a = z;
        }
    }

    public void setProgress(float f) {
        this.s.add(s80.g);
        this.m.t(f);
    }

    public void setRenderMode(jp0 jp0Var) {
        i90 i90Var = this.m;
        i90Var.A = jp0Var;
        i90Var.e();
    }

    public void setRepeatCount(int i) {
        this.s.add(s80.i);
        this.m.g.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.s.add(s80.h);
        this.m.g.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.m.j = z;
    }

    public void setSpeed(float f) {
        this.m.g.i = f;
    }

    public void setTextDelegate(v01 v01Var) {
        this.m.getClass();
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.m.g.s = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void unscheduleDrawable(android.graphics.drawable.Drawable r5) {
        /*
            r4 = this;
            boolean r0 = r4.p
            r1 = 0
            if (r0 != 0) goto L19
            i90 r2 = r4.m
            if (r5 != r2) goto L19
            s90 r3 = r2.g
            if (r3 != 0) goto Lf
            r3 = r1
            goto L11
        Lf:
            boolean r3 = r3.r
        L11:
            if (r3 == 0) goto L19
            r4.q = r1
            r2.j()
            goto L2e
        L19:
            if (r0 != 0) goto L2e
            boolean r0 = r5 instanceof defpackage.i90
            if (r0 == 0) goto L2e
            r0 = r5
            i90 r0 = (defpackage.i90) r0
            s90 r2 = r0.g
            if (r2 != 0) goto L27
            goto L29
        L27:
            boolean r1 = r2.r
        L29:
            if (r1 == 0) goto L2e
            r0.j()
        L2e:
            super.unscheduleDrawable(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.unscheduleDrawable(android.graphics.drawable.Drawable):void");
    }

    public void setMaxFrame(String str) {
        this.m.p(str);
    }

    public void setMinFrame(String str) {
        this.m.s(str);
    }

    public void setAnimation(final String str) throws IOException {
        q90 q90VarA;
        this.n = str;
        this.o = 0;
        int i = 1;
        if (isInEditMode()) {
            q90VarA = new q90(new Callable() { // from class: o80
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this.a;
                    boolean z = lottieAnimationView.r;
                    String str2 = str;
                    if (!z) {
                        return z80.b(lottieAnimationView.getContext(), str2, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    HashMap map = z80.a;
                    return z80.b(context, str2, "asset_" + str2);
                }
            }, true);
        } else {
            String str2 = null;
            if (this.r) {
                Context context = getContext();
                HashMap map = z80.a;
                String str3 = "asset_" + str;
                q90VarA = z80.a(str3, new w80(context.getApplicationContext(), str, str3, i), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = z80.a;
                q90VarA = z80.a(null, new w80(context2.getApplicationContext(), str, str2, i), null);
            }
        }
        setCompositionTask(q90VarA);
    }
}
