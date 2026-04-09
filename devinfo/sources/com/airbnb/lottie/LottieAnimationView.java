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
import androidx.lifecycle.f1;
import androidx.lifecycle.o0;
import com.liuzh.deviceinfo.R;
import f7.a;
import f7.a0;
import f7.b0;
import f7.c;
import f7.c0;
import f7.e0;
import f7.f;
import f7.f0;
import f7.g;
import f7.g0;
import f7.h;
import f7.h0;
import f7.i;
import f7.i0;
import f7.j;
import f7.j0;
import f7.k;
import f7.l;
import f7.s;
import f7.x;
import f7.y;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import je.u;
import k7.e;
import km.o;
import p.w;
import wd.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class LottieAnimationView extends w {

    /* renamed from: q, reason: collision with root package name */
    public static final f f2975q = new f();

    /* renamed from: d, reason: collision with root package name */
    public final i f2976d;

    /* renamed from: e, reason: collision with root package name */
    public final i f2977e;

    /* renamed from: f, reason: collision with root package name */
    public a0 f2978f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public final x f2979h;

    /* renamed from: i, reason: collision with root package name */
    public String f2980i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2981k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2982l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2983m;

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f2984n;

    /* renamed from: o, reason: collision with root package name */
    public final HashSet f2985o;

    /* renamed from: p, reason: collision with root package name */
    public e0 f2986p;

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2976d = new i(this, 1);
        this.f2977e = new i(this, 0);
        this.g = 0;
        this.f2979h = new x();
        this.f2981k = false;
        this.f2982l = false;
        this.f2983m = true;
        this.f2984n = new HashSet();
        this.f2985o = new HashSet();
        e(attributeSet);
    }

    private void setCompositionTask(e0 e0Var) {
        c0 c0Var = e0Var.f23727d;
        x xVar = this.f2979h;
        if (c0Var != null && xVar == getDrawable() && xVar.f23801a == c0Var.f23716a) {
            return;
        }
        this.f2984n.add(h.f23738a);
        this.f2979h.d();
        d();
        e0Var.b(this.f2976d);
        e0Var.a(this.f2977e);
        this.f2986p = e0Var;
    }

    public final void a() {
        this.f2982l = false;
        this.f2984n.add(h.f23743f);
        x xVar = this.f2979h;
        xVar.f23806f.clear();
        xVar.f23802b.cancel();
        if (xVar.isVisible()) {
            return;
        }
        xVar.R = 1;
    }

    public final void d() {
        e0 e0Var = this.f2986p;
        if (e0Var != null) {
            i iVar = this.f2976d;
            synchronized (e0Var) {
                e0Var.f23724a.remove(iVar);
            }
            this.f2986p.e(this.f2977e);
        }
    }

    public final void e(AttributeSet attributeSet) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g0.f23737a, R.attr.lottieAnimationViewStyle, 0);
        this.f2983m = typedArrayObtainStyledAttributes.getBoolean(4, true);
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
            this.f2982l = true;
        }
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(14, false);
        x xVar = this.f2979h;
        if (z3) {
            xVar.f23802b.setRepeatCount(-1);
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
        float f10 = typedArrayObtainStyledAttributes.getFloat(15, 0.0f);
        if (zHasValue4) {
            this.f2984n.add(h.f23739b);
        }
        xVar.u(f10);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        HashSet hashSet = (HashSet) xVar.f23810l.f30421b;
        y yVar = y.f23825a;
        boolean zAdd = z10 ? hashSet.add(yVar) : hashSet.remove(yVar);
        if (xVar.f23801a != null && zAdd) {
            xVar.c();
        }
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(0, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(1, true));
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            i0 i0Var = new i0(b.r(typedArrayObtainStyledAttributes.getResourceId(7, -1), getContext()).getDefaultColor(), PorterDuff.Mode.SRC_ATOP);
            e eVar = new e("**");
            o oVar = new o();
            oVar.f28445a = new s7.b();
            oVar.f28446b = i0Var;
            xVar.a(eVar, b0.I, oVar);
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            int i4 = typedArrayObtainStyledAttributes.getInt(17, 0);
            if (i4 >= h0.values().length) {
                i4 = 0;
            }
            setRenderMode(h0.values()[i4]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int i10 = typedArrayObtainStyledAttributes.getInt(2, 0);
            if (i10 >= h0.values().length) {
                i10 = 0;
            }
            setAsyncUpdates(a.values()[i10]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(12, false));
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(22, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void f() {
        this.f2984n.add(h.f23743f);
        this.f2979h.l();
    }

    public a getAsyncUpdates() {
        a aVar = this.f2979h.L;
        return aVar != null ? aVar : a.f23689a;
    }

    public boolean getAsyncUpdatesEnabled() {
        a aVar = this.f2979h.L;
        if (aVar == null) {
            aVar = a.f23689a;
        }
        return aVar == a.f23690b;
    }

    public boolean getClipTextToBoundingBox() {
        return this.f2979h.f23819u;
    }

    public boolean getClipToCompositionBounds() {
        return this.f2979h.f23812n;
    }

    public j getComposition() {
        Drawable drawable = getDrawable();
        x xVar = this.f2979h;
        if (drawable == xVar) {
            return xVar.f23801a;
        }
        return null;
    }

    public long getDuration() {
        j composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f2979h.f23802b.f32860h;
    }

    public String getImageAssetsFolder() {
        return this.f2979h.f23807h;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f2979h.f23811m;
    }

    public float getMaxFrame() {
        return this.f2979h.f23802b.f();
    }

    public float getMinFrame() {
        return this.f2979h.f23802b.g();
    }

    public f0 getPerformanceTracker() {
        j jVar = this.f2979h.f23801a;
        if (jVar != null) {
            return jVar.f23750a;
        }
        return null;
    }

    public float getProgress() {
        return this.f2979h.f23802b.e();
    }

    public h0 getRenderMode() {
        return this.f2979h.f23821w ? h0.f23746c : h0.f23745b;
    }

    public int getRepeatCount() {
        return this.f2979h.f23802b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f2979h.f23802b.getRepeatMode();
    }

    public float getSpeed() {
        return this.f2979h.f23802b.f32857d;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof x) {
            boolean z3 = ((x) drawable).f23821w;
            h0 h0Var = h0.f23746c;
            if ((z3 ? h0Var : h0.f23745b) == h0Var) {
                this.f2979h.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        x xVar = this.f2979h;
        if (drawable2 == xVar) {
            super.invalidateDrawable(xVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f2982l) {
            return;
        }
        this.f2979h.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i4;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        this.f2980i = gVar.f23731a;
        HashSet hashSet = this.f2984n;
        h hVar = h.f23738a;
        if (!hashSet.contains(hVar) && !TextUtils.isEmpty(this.f2980i)) {
            setAnimation(this.f2980i);
        }
        this.j = gVar.f23732b;
        if (!hashSet.contains(hVar) && (i4 = this.j) != 0) {
            setAnimation(i4);
        }
        if (!hashSet.contains(h.f23739b)) {
            this.f2979h.u(gVar.f23733c);
        }
        if (!hashSet.contains(h.f23743f) && gVar.f23734d) {
            f();
        }
        if (!hashSet.contains(h.f23742e)) {
            setImageAssetsFolder(gVar.f23735e);
        }
        if (!hashSet.contains(h.f23740c)) {
            setRepeatMode(gVar.f23736f);
        }
        if (hashSet.contains(h.f23741d)) {
            return;
        }
        setRepeatCount(gVar.g);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z3;
        g gVar = new g(super.onSaveInstanceState());
        gVar.f23731a = this.f2980i;
        gVar.f23732b = this.j;
        x xVar = this.f2979h;
        r7.f fVar = xVar.f23802b;
        r7.f fVar2 = xVar.f23802b;
        gVar.f23733c = fVar.e();
        if (xVar.isVisible()) {
            z3 = fVar2.f32864m;
        } else {
            int i4 = xVar.R;
            z3 = i4 == 2 || i4 == 3;
        }
        gVar.f23734d = z3;
        gVar.f23735e = xVar.f23807h;
        gVar.f23736f = fVar2.getRepeatMode();
        gVar.g = fVar2.getRepeatCount();
        return gVar;
    }

    public void setAnimation(final int i4) {
        e0 e0VarA;
        this.j = i4;
        final String str = null;
        this.f2980i = null;
        if (isInEditMode()) {
            e0VarA = new e0(new c7.e(this, i4, 1), true);
        } else if (this.f2983m) {
            Context context = getContext();
            final String strK = f7.o.k(i4, context);
            final WeakReference weakReference = new WeakReference(context);
            final Context applicationContext = context.getApplicationContext();
            e0VarA = f7.o.a(strK, new Callable() { // from class: f7.n
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = (Context) weakReference.get();
                    if (context2 == null) {
                        context2 = applicationContext;
                    }
                    return o.f(context2, i4, strK);
                }
            }, null);
        } else {
            Context context2 = getContext();
            HashMap map = f7.o.f23777a;
            final WeakReference weakReference2 = new WeakReference(context2);
            final Context applicationContext2 = context2.getApplicationContext();
            e0VarA = f7.o.a(null, new Callable() { // from class: f7.n
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context22 = (Context) weakReference2.get();
                    if (context22 == null) {
                        context22 = applicationContext2;
                    }
                    return o.f(context22, i4, str);
                }
            }, null);
        }
        setCompositionTask(e0VarA);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(f7.o.a(null, new l(0, byteArrayInputStream), new o0(20, byteArrayInputStream)));
    }

    public void setAnimationFromUrl(String str) {
        e0 e0VarA;
        int i4 = 0;
        String str2 = null;
        if (this.f2983m) {
            Context context = getContext();
            HashMap map = f7.o.f23777a;
            String strT = u.t("url_", str);
            e0VarA = f7.o.a(strT, new k(context, str, strT, i4), null);
        } else {
            e0VarA = f7.o.a(null, new k(getContext(), str, str2, i4), null);
        }
        setCompositionTask(e0VarA);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z3) {
        this.f2979h.f23817s = z3;
    }

    public void setApplyingShadowToLayersEnabled(boolean z3) {
        this.f2979h.f23818t = z3;
    }

    public void setAsyncUpdates(a aVar) {
        this.f2979h.L = aVar;
    }

    public void setCacheComposition(boolean z3) {
        this.f2983m = z3;
    }

    public void setClipTextToBoundingBox(boolean z3) {
        x xVar = this.f2979h;
        if (z3 != xVar.f23819u) {
            xVar.f23819u = z3;
            xVar.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z3) {
        x xVar = this.f2979h;
        if (z3 != xVar.f23812n) {
            xVar.f23812n = z3;
            n7.b bVar = xVar.f23813o;
            if (bVar != null) {
                bVar.L = z3;
            }
            xVar.invalidateSelf();
        }
    }

    public void setComposition(j jVar) {
        x xVar = this.f2979h;
        xVar.setCallback(this);
        boolean z3 = true;
        this.f2981k = true;
        ArrayList arrayList = xVar.f23806f;
        r7.f fVar = xVar.f23802b;
        if (xVar.f23801a == jVar) {
            z3 = false;
        } else {
            xVar.K = true;
            xVar.d();
            xVar.f23801a = jVar;
            xVar.c();
            boolean z10 = fVar.f32863l == null;
            fVar.f32863l = jVar;
            if (z10) {
                fVar.k(Math.max(fVar.j, jVar.f23759l), Math.min(fVar.f32862k, jVar.f23760m));
            } else {
                fVar.k((int) jVar.f23759l, (int) jVar.f23760m);
            }
            float f10 = fVar.f32860h;
            fVar.f32860h = 0.0f;
            fVar.g = 0.0f;
            fVar.j((int) f10);
            fVar.d();
            xVar.u(fVar.getAnimatedFraction());
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                f7.w wVar = (f7.w) it.next();
                if (wVar != null) {
                    wVar.run();
                }
                it.remove();
            }
            arrayList.clear();
            jVar.f23750a.f23728a = xVar.f23815q;
            xVar.e();
            Drawable.Callback callback = xVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(xVar);
            }
        }
        if (this.f2982l) {
            xVar.l();
        }
        this.f2981k = false;
        if (getDrawable() != xVar || z3) {
            if (!z3) {
                boolean z11 = fVar != null ? fVar.f32864m : false;
                setImageDrawable(null);
                setImageDrawable(xVar);
                if (z11) {
                    xVar.n();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.f2985o.iterator();
            if (it2.hasNext()) {
                throw u.o(it2);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        x xVar = this.f2979h;
        xVar.f23809k = str;
        f1 f1VarI = xVar.i();
        if (f1VarI != null) {
            f1VarI.f1138f = str;
        }
    }

    public void setFailureListener(a0 a0Var) {
        this.f2978f = a0Var;
    }

    public void setFallbackResource(int i4) {
        this.g = i4;
    }

    public void setFontAssetDelegate(f7.b bVar) {
        f1 f1Var = this.f2979h.f23808i;
    }

    public void setFontMap(Map<String, Typeface> map) {
        x xVar = this.f2979h;
        if (map == xVar.j) {
            return;
        }
        xVar.j = map;
        xVar.invalidateSelf();
    }

    public void setFrame(int i4) {
        this.f2979h.o(i4);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z3) {
        this.f2979h.f23804d = z3;
    }

    public void setImageAssetDelegate(c cVar) {
        j7.a aVar = this.f2979h.g;
    }

    public void setImageAssetsFolder(String str) {
        this.f2979h.f23807h = str;
    }

    @Override // p.w, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.j = 0;
        this.f2980i = null;
        d();
        super.setImageBitmap(bitmap);
    }

    @Override // p.w, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.j = 0;
        this.f2980i = null;
        d();
        super.setImageDrawable(drawable);
    }

    @Override // p.w, android.widget.ImageView
    public void setImageResource(int i4) {
        this.j = 0;
        this.f2980i = null;
        d();
        super.setImageResource(i4);
    }

    public void setMaintainOriginalImageBounds(boolean z3) {
        this.f2979h.f23811m = z3;
    }

    public void setMaxFrame(int i4) {
        this.f2979h.p(i4);
    }

    public void setMaxProgress(float f10) {
        x xVar = this.f2979h;
        j jVar = xVar.f23801a;
        if (jVar == null) {
            xVar.f23806f.add(new s(xVar, f10, 0));
            return;
        }
        r7.f fVar = xVar.f23802b;
        fVar.k(fVar.j, r7.h.f(jVar.f23759l, jVar.f23760m, f10));
    }

    public void setMinAndMaxFrame(String str) {
        this.f2979h.r(str);
    }

    public void setMinFrame(int i4) {
        this.f2979h.s(i4);
    }

    public void setMinProgress(float f10) {
        x xVar = this.f2979h;
        j jVar = xVar.f23801a;
        if (jVar == null) {
            xVar.f23806f.add(new s(xVar, f10, 1));
        } else {
            xVar.s((int) r7.h.f(jVar.f23759l, jVar.f23760m, f10));
        }
    }

    public void setOutlineMasksAndMattes(boolean z3) {
        x xVar = this.f2979h;
        if (xVar.f23816r == z3) {
            return;
        }
        xVar.f23816r = z3;
        n7.b bVar = xVar.f23813o;
        if (bVar != null) {
            bVar.q(z3);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z3) {
        x xVar = this.f2979h;
        xVar.f23815q = z3;
        j jVar = xVar.f23801a;
        if (jVar != null) {
            jVar.f23750a.f23728a = z3;
        }
    }

    public void setProgress(float f10) {
        this.f2984n.add(h.f23739b);
        this.f2979h.u(f10);
    }

    public void setRenderMode(h0 h0Var) {
        x xVar = this.f2979h;
        xVar.f23820v = h0Var;
        xVar.e();
    }

    public void setRepeatCount(int i4) {
        this.f2984n.add(h.f23741d);
        this.f2979h.f23802b.setRepeatCount(i4);
    }

    public void setRepeatMode(int i4) {
        this.f2984n.add(h.f23740c);
        this.f2979h.f23802b.setRepeatMode(i4);
    }

    public void setSafeMode(boolean z3) {
        this.f2979h.f23805e = z3;
    }

    public void setSpeed(float f10) {
        this.f2979h.f23802b.f32857d = f10;
    }

    public void setTextDelegate(j0 j0Var) {
        this.f2979h.getClass();
    }

    public void setUseCompositionFrameRate(boolean z3) {
        this.f2979h.f23802b.f32865n = z3;
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
            boolean r0 = r4.f2981k
            r1 = 0
            if (r0 != 0) goto L19
            f7.x r2 = r4.f2979h
            if (r5 != r2) goto L19
            r7.f r3 = r2.f23802b
            if (r3 != 0) goto Lf
            r3 = r1
            goto L11
        Lf:
            boolean r3 = r3.f32864m
        L11:
            if (r3 == 0) goto L19
            r4.f2982l = r1
            r2.k()
            goto L2e
        L19:
            if (r0 != 0) goto L2e
            boolean r0 = r5 instanceof f7.x
            if (r0 == 0) goto L2e
            r0 = r5
            f7.x r0 = (f7.x) r0
            r7.f r2 = r0.f23802b
            if (r2 != 0) goto L27
            goto L29
        L27:
            boolean r1 = r2.f32864m
        L29:
            if (r1 == 0) goto L2e
            r0.k()
        L2e:
            super.unscheduleDrawable(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.unscheduleDrawable(android.graphics.drawable.Drawable):void");
    }

    public void setMaxFrame(String str) {
        this.f2979h.q(str);
    }

    public void setMinFrame(String str) {
        this.f2979h.t(str);
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f2976d = new i(this, 1);
        this.f2977e = new i(this, 0);
        this.g = 0;
        this.f2979h = new x();
        this.f2981k = false;
        this.f2982l = false;
        this.f2983m = true;
        this.f2984n = new HashSet();
        this.f2985o = new HashSet();
        e(null);
    }

    public void setAnimation(String str) {
        e0 e0VarA;
        this.f2980i = str;
        int i4 = 0;
        this.j = 0;
        int i10 = 1;
        if (isInEditMode()) {
            e0VarA = new e0(new f7.e(i4, this, str), true);
        } else {
            String str2 = null;
            if (this.f2983m) {
                Context context = getContext();
                HashMap map = f7.o.f23777a;
                String strT = u.t("asset_", str);
                e0VarA = f7.o.a(strT, new k(context.getApplicationContext(), str, strT, i10), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = f7.o.f23777a;
                e0VarA = f7.o.a(null, new k(context2.getApplicationContext(), str, str2, i10), null);
            }
        }
        setCompositionTask(e0VarA);
    }
}
