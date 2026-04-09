package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import e9.c;
import hf.n;
import io.sentry.n4;
import j4.o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.xmlpull.v1.XmlPullParserException;
import r8.a0;
import r8.c0;
import r8.d;
import r8.d0;
import r8.e;
import r8.e0;
import r8.f0;
import r8.g;
import r8.g0;
import r8.h;
import r8.h0;
import r8.i;
import r8.i0;
import r8.l;
import r8.p;
import r8.t;
import r8.u;
import r8.v;
import r8.w;
import r8.y;
import r8.z;
import tv.b;
import x8.f;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final e M = new e();
    public int B;
    public final v D;
    public String E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final HashSet J;
    public final HashSet K;
    public c0 L;

    /* renamed from: r, reason: collision with root package name */
    public final g f4001r;

    /* renamed from: x, reason: collision with root package name */
    public final g f4002x;

    /* renamed from: y, reason: collision with root package name */
    public y f4003y;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new com.airbnb.lottie.a();
        public int B;

        /* renamed from: a, reason: collision with root package name */
        public String f4004a;

        /* renamed from: d, reason: collision with root package name */
        public int f4005d;

        /* renamed from: g, reason: collision with root package name */
        public float f4006g;

        /* renamed from: r, reason: collision with root package name */
        public boolean f4007r;

        /* renamed from: x, reason: collision with root package name */
        public String f4008x;

        /* renamed from: y, reason: collision with root package name */
        public int f4009y;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f4004a);
            parcel.writeFloat(this.f4006g);
            parcel.writeInt(this.f4007r ? 1 : 0);
            parcel.writeString(this.f4008x);
            parcel.writeInt(this.f4009y);
            parcel.writeInt(this.B);
        }
    }

    public enum a {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) throws XmlPullParserException, InterruptedException, Resources.NotFoundException, IOException {
        String string;
        boolean zRemove;
        super(context, attributeSet);
        this.f4001r = new g(this, 1);
        this.f4002x = new g(this, 0);
        this.B = 0;
        v vVar = new v();
        this.D = vVar;
        this.G = false;
        this.H = false;
        this.I = true;
        HashSet hashSet = new HashSet();
        this.J = hashSet;
        this.K = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f0.LottieAnimationView, e0.lottieAnimationViewStyle, 0);
        this.I = typedArrayObtainStyledAttributes.getBoolean(f0.LottieAnimationView_lottie_cacheComposition, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(f0.LottieAnimationView_lottie_rawRes);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(f0.LottieAnimationView_lottie_fileName);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(f0.LottieAnimationView_lottie_url);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(f0.LottieAnimationView_lottie_rawRes, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(f0.LottieAnimationView_lottie_fileName);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(f0.LottieAnimationView_lottie_url)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(f0.LottieAnimationView_lottie_fallbackRes, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(f0.LottieAnimationView_lottie_autoPlay, false)) {
            this.H = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(f0.LottieAnimationView_lottie_loop, false)) {
            vVar.f21379d.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(f0.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(f0.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(f0.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(f0.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(f0.LottieAnimationView_lottie_speed)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(f0.LottieAnimationView_lottie_speed, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(f0.LottieAnimationView_lottie_clipToCompositionBounds)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(f0.LottieAnimationView_lottie_clipToCompositionBounds, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(f0.LottieAnimationView_lottie_clipTextToBoundingBox)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(f0.LottieAnimationView_lottie_clipTextToBoundingBox, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(f0.LottieAnimationView_lottie_defaultFontFileExtension)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(f0.LottieAnimationView_lottie_defaultFontFileExtension));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(f0.LottieAnimationView_lottie_imageAssetsFolder));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(f0.LottieAnimationView_lottie_progress);
        float f10 = typedArrayObtainStyledAttributes.getFloat(f0.LottieAnimationView_lottie_progress, 0.0f);
        if (zHasValue4) {
            hashSet.add(a.SET_PROGRESS);
        }
        vVar.t(f10);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(f0.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false);
        w wVar = w.MergePathsApi19;
        HashSet hashSet2 = vVar.I.f17548a;
        if (!z10) {
            zRemove = hashSet2.remove(wVar);
        } else if (Build.VERSION.SDK_INT < wVar.minRequiredSdkVersion) {
            c.b(String.format("%s is not supported pre SDK %d", wVar.name(), Integer.valueOf(wVar.minRequiredSdkVersion)));
            zRemove = false;
        } else {
            zRemove = hashSet2.add(wVar);
        }
        if (vVar.f21375a != null && zRemove) {
            vVar.c();
        }
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(f0.LottieAnimationView_lottie_applyOpacityToLayers, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(f0.LottieAnimationView_lottie_applyShadowToLayers, true));
        if (typedArrayObtainStyledAttributes.hasValue(f0.LottieAnimationView_lottie_colorFilter)) {
            vVar.a(new f("**"), z.I, new bm.e(new h0(h3.c.c(getContext(), typedArrayObtainStyledAttributes.getResourceId(f0.LottieAnimationView_lottie_colorFilter, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(f0.LottieAnimationView_lottie_renderMode)) {
            int i10 = f0.LottieAnimationView_lottie_renderMode;
            g0 g0Var = g0.AUTOMATIC;
            int i11 = typedArrayObtainStyledAttributes.getInt(i10, g0Var.ordinal());
            setRenderMode(g0.values()[i11 >= g0.values().length ? g0Var.ordinal() : i11]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(f0.LottieAnimationView_lottie_asyncUpdates)) {
            int i12 = f0.LottieAnimationView_lottie_asyncUpdates;
            r8.a aVar = r8.a.AUTOMATIC;
            int i13 = typedArrayObtainStyledAttributes.getInt(i12, aVar.ordinal());
            setAsyncUpdates(r8.a.values()[i13 >= g0.values().length ? aVar.ordinal() : i13]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(f0.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        if (typedArrayObtainStyledAttributes.hasValue(f0.LottieAnimationView_lottie_useCompositionFrameRate)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(f0.LottieAnimationView_lottie_useCompositionFrameRate, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setCompositionTask(c0 c0Var) {
        a0 a0Var = c0Var.f21311d;
        v vVar = this.D;
        if (a0Var != null && vVar == getDrawable() && vVar.f21375a == a0Var.f21304a) {
            return;
        }
        this.J.add(a.SET_ANIMATION);
        this.D.d();
        a();
        c0Var.b(this.f4001r);
        c0Var.a(this.f4002x);
        this.L = c0Var;
    }

    public final void a() {
        c0 c0Var = this.L;
        if (c0Var != null) {
            g gVar = this.f4001r;
            synchronized (c0Var) {
                c0Var.f21308a.remove(gVar);
            }
            c0 c0Var2 = this.L;
            g gVar2 = this.f4002x;
            synchronized (c0Var2) {
                c0Var2.f21309b.remove(gVar2);
            }
        }
    }

    public r8.a getAsyncUpdates() {
        r8.a aVar = this.D.f21386i0;
        return aVar != null ? aVar : d.f21312a;
    }

    public boolean getAsyncUpdatesEnabled() {
        r8.a aVar = this.D.f21386i0;
        if (aVar == null) {
            aVar = d.f21312a;
        }
        return aVar == r8.a.ENABLED;
    }

    public boolean getClipTextToBoundingBox() {
        return this.D.R;
    }

    public boolean getClipToCompositionBounds() {
        return this.D.K;
    }

    public h getComposition() {
        Drawable drawable = getDrawable();
        v vVar = this.D;
        if (drawable == vVar) {
            return vVar.f21375a;
        }
        return null;
    }

    public long getDuration() {
        h composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.D.f21379d.D;
    }

    public String getImageAssetsFolder() {
        return this.D.E;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.D.J;
    }

    public float getMaxFrame() {
        return this.D.f21379d.b();
    }

    public float getMinFrame() {
        return this.D.f21379d.c();
    }

    public d0 getPerformanceTracker() {
        h hVar = this.D.f21375a;
        if (hVar != null) {
            return hVar.f21323a;
        }
        return null;
    }

    public float getProgress() {
        return this.D.f21379d.a();
    }

    public g0 getRenderMode() {
        return this.D.T ? g0.SOFTWARE : g0.HARDWARE;
    }

    public int getRepeatCount() {
        return this.D.f21379d.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.D.f21379d.getRepeatMode();
    }

    public float getSpeed() {
        return this.D.f21379d.f7990r;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof v) {
            if ((((v) drawable).T ? g0.SOFTWARE : g0.HARDWARE) == g0.SOFTWARE) {
                this.D.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        v vVar = this.D;
        if (drawable2 == vVar) {
            super.invalidateDrawable(vVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.H) {
            return;
        }
        this.D.k();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws XmlPullParserException, InterruptedException, Resources.NotFoundException, IOException {
        int i10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.E = savedState.f4004a;
        a aVar = a.SET_ANIMATION;
        HashSet hashSet = this.J;
        if (!hashSet.contains(aVar) && !TextUtils.isEmpty(this.E)) {
            setAnimation(this.E);
        }
        this.F = savedState.f4005d;
        if (!hashSet.contains(aVar) && (i10 = this.F) != 0) {
            setAnimation(i10);
        }
        boolean zContains = hashSet.contains(a.SET_PROGRESS);
        v vVar = this.D;
        if (!zContains) {
            vVar.t(savedState.f4006g);
        }
        a aVar2 = a.PLAY_OPTION;
        if (!hashSet.contains(aVar2) && savedState.f4007r) {
            hashSet.add(aVar2);
            vVar.k();
        }
        if (!hashSet.contains(a.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f4008x);
        }
        if (!hashSet.contains(a.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f4009y);
        }
        if (hashSet.contains(a.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.B);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4004a = this.E;
        savedState.f4005d = this.F;
        v vVar = this.D;
        e9.e eVar = vVar.f21379d;
        e9.e eVar2 = vVar.f21379d;
        savedState.f4006g = eVar.a();
        if (vVar.isVisible()) {
            z10 = eVar2.I;
        } else {
            u uVar = vVar.f21394y;
            z10 = uVar == u.PLAY || uVar == u.RESUME;
        }
        savedState.f4007r = z10;
        savedState.f4008x = vVar.E;
        savedState.f4009y = eVar2.getRepeatMode();
        savedState.B = eVar2.getRepeatCount();
        return savedState;
    }

    public void setAnimation(final int i10) throws XmlPullParserException, InterruptedException, Resources.NotFoundException, IOException {
        c0 c0VarA;
        this.F = i10;
        final String str = null;
        this.E = null;
        if (isInEditMode()) {
            c0VarA = new c0(new Callable() { // from class: r8.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this.f21319a;
                    boolean z10 = lottieAnimationView.I;
                    int i11 = i10;
                    if (!z10) {
                        return l.f(i11, lottieAnimationView.getContext(), null);
                    }
                    Context context = lottieAnimationView.getContext();
                    return l.f(i11, context, l.k(context, i11));
                }
            }, true);
        } else if (this.I) {
            Context context = getContext();
            final String strK = l.k(context, i10);
            final WeakReference weakReference = new WeakReference(context);
            final Context applicationContext = context.getApplicationContext();
            c0VarA = l.a(strK, new Callable() { // from class: r8.k
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = (Context) weakReference.get();
                    if (context2 == null) {
                        context2 = applicationContext;
                    }
                    return l.f(i10, context2, strK);
                }
            }, null);
        } else {
            Context context2 = getContext();
            HashMap map = l.f21348a;
            final WeakReference weakReference2 = new WeakReference(context2);
            final Context applicationContext2 = context2.getApplicationContext();
            c0VarA = l.a(null, new Callable() { // from class: r8.k
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context22 = (Context) weakReference2.get();
                    if (context22 == null) {
                        context22 = applicationContext2;
                    }
                    return l.f(i10, context22, str);
                }
            }, null);
        }
        setCompositionTask(c0VarA);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(l.a(null, new n(5, byteArrayInputStream), new o(14, byteArrayInputStream)));
    }

    public void setAnimationFromUrl(String str) throws XmlPullParserException, InterruptedException, Resources.NotFoundException, IOException {
        c0 c0VarA;
        int i10 = 0;
        String str2 = null;
        if (this.I) {
            Context context = getContext();
            HashMap map = l.f21348a;
            String strP = c7.a.p("url_", str);
            c0VarA = l.a(strP, new i(context, str, strP, i10), null);
        } else {
            c0VarA = l.a(null, new i(getContext(), str, str2, i10), null);
        }
        setCompositionTask(c0VarA);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.D.P = z10;
    }

    public void setApplyingShadowToLayersEnabled(boolean z10) {
        this.D.Q = z10;
    }

    public void setAsyncUpdates(r8.a aVar) {
        this.D.f21386i0 = aVar;
    }

    public void setCacheComposition(boolean z10) {
        this.I = z10;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        v vVar = this.D;
        if (z10 != vVar.R) {
            vVar.R = z10;
            vVar.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z10) {
        v vVar = this.D;
        if (z10 != vVar.K) {
            vVar.K = z10;
            a9.d dVar = vVar.L;
            if (dVar != null) {
                dVar.L = z10;
            }
            vVar.invalidateSelf();
        }
    }

    public void setComposition(h hVar) {
        r8.a aVar = d.f21312a;
        v vVar = this.D;
        vVar.setCallback(this);
        boolean z10 = true;
        this.G = true;
        ArrayList arrayList = vVar.B;
        e9.e eVar = vVar.f21379d;
        if (vVar.f21375a == hVar) {
            z10 = false;
        } else {
            vVar.f21385h0 = true;
            vVar.d();
            vVar.f21375a = hVar;
            vVar.c();
            boolean z11 = eVar.H == null;
            eVar.H = hVar;
            if (z11) {
                eVar.i(Math.max(eVar.F, hVar.f21332l), Math.min(eVar.G, hVar.f21333m));
            } else {
                eVar.i((int) hVar.f21332l, (int) hVar.f21333m);
            }
            float f10 = eVar.D;
            eVar.D = 0.0f;
            eVar.B = 0.0f;
            eVar.h((int) f10);
            eVar.f();
            vVar.t(eVar.getAnimatedFraction());
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                t tVar = (t) it.next();
                if (tVar != null) {
                    tVar.run();
                }
                it.remove();
            }
            arrayList.clear();
            hVar.f21323a.f21316a = vVar.N;
            vVar.e();
            Drawable.Callback callback = vVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(vVar);
            }
        }
        if (this.H) {
            vVar.k();
        }
        this.G = false;
        if (getDrawable() != vVar || z10) {
            if (!z10) {
                boolean z12 = eVar != null ? eVar.I : false;
                setImageDrawable(null);
                setImageDrawable(vVar);
                if (z12) {
                    vVar.m();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.K.iterator();
            if (it2.hasNext()) {
                throw w.g.d(it2);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        v vVar = this.D;
        vVar.H = str;
        b bVarI = vVar.i();
        if (bVarI != null) {
            bVarI.f23031x = str;
        }
    }

    public void setFailureListener(y yVar) {
        this.f4003y = yVar;
    }

    public void setFallbackResource(int i10) {
        this.B = i10;
    }

    public void setFontAssetDelegate(r8.b bVar) {
        b bVar2 = this.D.F;
    }

    public void setFontMap(Map<String, Typeface> map) {
        v vVar = this.D;
        if (map == vVar.G) {
            return;
        }
        vVar.G = map;
        vVar.invalidateSelf();
    }

    public void setFrame(int i10) {
        this.D.n(i10);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.D.f21392r = z10;
    }

    public void setImageAssetDelegate(r8.c cVar) {
        w8.a aVar = this.D.D;
    }

    public void setImageAssetsFolder(String str) {
        this.D.E = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.F = 0;
        this.E = null;
        a();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.F = 0;
        this.E = null;
        a();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        this.F = 0;
        this.E = null;
        a();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.D.J = z10;
    }

    public void setMaxFrame(int i10) {
        this.D.o(i10);
    }

    public void setMaxProgress(float f10) {
        v vVar = this.D;
        h hVar = vVar.f21375a;
        if (hVar == null) {
            vVar.B.add(new p(vVar, f10, 0));
            return;
        }
        e9.e eVar = vVar.f21379d;
        eVar.i(eVar.F, e9.g.f(hVar.f21332l, hVar.f21333m, f10));
    }

    public void setMinAndMaxFrame(String str) {
        this.D.q(str);
    }

    public void setMinFrame(int i10) {
        this.D.r(i10);
    }

    public void setMinProgress(float f10) {
        v vVar = this.D;
        h hVar = vVar.f21375a;
        if (hVar == null) {
            vVar.B.add(new p(vVar, f10, 1));
        } else {
            vVar.r((int) e9.g.f(hVar.f21332l, hVar.f21333m, f10));
        }
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        v vVar = this.D;
        if (vVar.O == z10) {
            return;
        }
        vVar.O = z10;
        a9.d dVar = vVar.L;
        if (dVar != null) {
            dVar.q(z10);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        v vVar = this.D;
        vVar.N = z10;
        h hVar = vVar.f21375a;
        if (hVar != null) {
            hVar.f21323a.f21316a = z10;
        }
    }

    public void setProgress(float f10) {
        this.J.add(a.SET_PROGRESS);
        this.D.t(f10);
    }

    public void setRenderMode(g0 g0Var) {
        v vVar = this.D;
        vVar.S = g0Var;
        vVar.e();
    }

    public void setRepeatCount(int i10) {
        this.J.add(a.SET_REPEAT_COUNT);
        this.D.f21379d.setRepeatCount(i10);
    }

    public void setRepeatMode(int i10) {
        this.J.add(a.SET_REPEAT_MODE);
        this.D.f21379d.setRepeatMode(i10);
    }

    public void setSafeMode(boolean z10) {
        this.D.f21393x = z10;
    }

    public void setSpeed(float f10) {
        this.D.f21379d.f7990r = f10;
    }

    public void setTextDelegate(i0 i0Var) {
        this.D.getClass();
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.D.f21379d.J = z10;
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
            boolean r0 = r4.G
            r1 = 0
            if (r0 != 0) goto L19
            r8.v r2 = r4.D
            if (r5 != r2) goto L19
            e9.e r3 = r2.f21379d
            if (r3 != 0) goto Lf
            r3 = r1
            goto L11
        Lf:
            boolean r3 = r3.I
        L11:
            if (r3 == 0) goto L19
            r4.H = r1
            r2.j()
            goto L2e
        L19:
            if (r0 != 0) goto L2e
            boolean r0 = r5 instanceof r8.v
            if (r0 == 0) goto L2e
            r0 = r5
            r8.v r0 = (r8.v) r0
            e9.e r2 = r0.f21379d
            if (r2 != 0) goto L27
            goto L29
        L27:
            boolean r1 = r2.I
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
        this.D.p(str);
    }

    public void setMinFrame(String str) {
        this.D.s(str);
    }

    public void setAnimation(String str) throws XmlPullParserException, InterruptedException, Resources.NotFoundException, IOException {
        c0 c0VarA;
        this.E = str;
        this.F = 0;
        int i10 = 1;
        if (isInEditMode()) {
            c0VarA = new c0(new n4(this, 9, str), true);
        } else {
            String str2 = null;
            if (this.I) {
                Context context = getContext();
                HashMap map = l.f21348a;
                String strP = c7.a.p("asset_", str);
                c0VarA = l.a(strP, new i(context.getApplicationContext(), str, strP, i10), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = l.f21348a;
                c0VarA = l.a(null, new i(context2.getApplicationContext(), str, str2, i10), null);
            }
        }
        setCompositionTask(c0VarA);
    }
}
