package com.airbnb.lottie;

import B0.f;
import T1.CallableC1599k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.work.s;
import c2.CallableC2060j;
import com.airbnb.lottie.LottieAnimationView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import f2.RunnableC4331a;
import i2.C4434G;
import i2.C4435H;
import i2.C4437J;
import i2.C4438K;
import i2.C4440M;
import i2.C4442b;
import i2.C4444d;
import i2.C4446f;
import i2.C4448h;
import i2.C4453m;
import i2.EnumC4428A;
import i2.EnumC4439L;
import i2.EnumC4441a;
import i2.InterfaceC4431D;
import i2.InterfaceC4432E;
import i2.InterfaceC4433F;
import i2.InterfaceC4443c;
import i2.N;
import i2.r;
import i2.x;
import i2.z;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import m2.C5318a;
import m2.C5319b;
import n2.C5351e;
import u2.C5624c;
import u2.C5628g;
import u2.C5629h;
import u2.ChoreographerFrameCallbackC5626e;
import z0.C5848a;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: r, reason: collision with root package name */
    public static final C4446f f18590r = new C4446f();

    /* renamed from: e, reason: collision with root package name */
    public final d f18591e;

    /* renamed from: f, reason: collision with root package name */
    public final c f18592f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC4431D<Throwable> f18593g;

    /* renamed from: h, reason: collision with root package name */
    public int f18594h;
    public final z i;

    /* renamed from: j, reason: collision with root package name */
    public String f18595j;

    /* renamed from: k, reason: collision with root package name */
    public int f18596k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18597l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18598m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18599n;

    /* renamed from: o, reason: collision with root package name */
    public final HashSet f18600o;

    /* renamed from: p, reason: collision with root package name */
    public final HashSet f18601p;

    /* renamed from: q, reason: collision with root package name */
    public C4435H<C4448h> f18602q;

    public static class a extends View.BaseSavedState {
        public static final Parcelable.Creator<a> CREATOR = new C0300a();

        /* renamed from: b, reason: collision with root package name */
        public String f18603b;

        /* renamed from: c, reason: collision with root package name */
        public int f18604c;

        /* renamed from: d, reason: collision with root package name */
        public float f18605d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f18606e;

        /* renamed from: f, reason: collision with root package name */
        public String f18607f;

        /* renamed from: g, reason: collision with root package name */
        public int f18608g;

        /* renamed from: h, reason: collision with root package name */
        public int f18609h;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$a$a, reason: collision with other inner class name */
        public class C0300a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                a aVar = new a(parcel);
                aVar.f18603b = parcel.readString();
                aVar.f18605d = parcel.readFloat();
                aVar.f18606e = parcel.readInt() == 1;
                aVar.f18607f = parcel.readString();
                aVar.f18608g = parcel.readInt();
                aVar.f18609h = parcel.readInt();
                return aVar;
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f18603b);
            parcel.writeFloat(this.f18605d);
            parcel.writeInt(this.f18606e ? 1 : 0);
            parcel.writeString(this.f18607f);
            parcel.writeInt(this.f18608g);
            parcel.writeInt(this.f18609h);
        }
    }

    public enum b {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public static class c implements InterfaceC4431D<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<LottieAnimationView> f18610a;

        public c(LottieAnimationView lottieAnimationView) {
            this.f18610a = new WeakReference<>(lottieAnimationView);
        }

        @Override // i2.InterfaceC4431D
        public final void onResult(Throwable th) {
            Throwable th2 = th;
            LottieAnimationView lottieAnimationView = this.f18610a.get();
            if (lottieAnimationView == null) {
                return;
            }
            int i = lottieAnimationView.f18594h;
            if (i != 0) {
                lottieAnimationView.setImageResource(i);
            }
            InterfaceC4431D interfaceC4431D = lottieAnimationView.f18593g;
            if (interfaceC4431D == null) {
                interfaceC4431D = LottieAnimationView.f18590r;
            }
            interfaceC4431D.onResult(th2);
        }
    }

    public static class d implements InterfaceC4431D<C4448h> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<LottieAnimationView> f18611a;

        public d(LottieAnimationView lottieAnimationView) {
            this.f18611a = new WeakReference<>(lottieAnimationView);
        }

        @Override // i2.InterfaceC4431D
        public final void onResult(C4448h c4448h) {
            C4448h c4448h2 = c4448h;
            LottieAnimationView lottieAnimationView = this.f18611a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(c4448h2);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        String string;
        boolean zRemove;
        super(context, attributeSet);
        this.f18591e = new d(this);
        this.f18592f = new c(this);
        this.f18594h = 0;
        z zVar = new z();
        this.i = zVar;
        this.f18597l = false;
        this.f18598m = false;
        this.f18599n = true;
        HashSet hashSet = new HashSet();
        this.f18600o = hashSet;
        this.f18601p = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C4438K.f38336a, R.attr.lottieAnimationViewStyle, 0);
        this.f18599n = typedArrayObtainStyledAttributes.getBoolean(2, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(9);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(19);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(14, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(9);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(19)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(8, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(1, false)) {
            this.f18598m = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(12, false)) {
            zVar.f38424c.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(17, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(16, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(18, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(4, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(3, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(6));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(11));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(13);
        float f10 = typedArrayObtainStyledAttributes.getFloat(13, 0.0f);
        if (zHasValue4) {
            hashSet.add(b.SET_PROGRESS);
        }
        zVar.s(f10);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(7, false);
        EnumC4428A enumC4428A = EnumC4428A.MergePathsApi19;
        HashSet<EnumC4428A> hashSet2 = zVar.f38434n.f38282a;
        if (!z10) {
            zRemove = hashSet2.remove(enumC4428A);
        } else if (Build.VERSION.SDK_INT < enumC4428A.minRequiredSdkVersion) {
            C5624c.b(String.format("%s is not supported pre SDK %d", enumC4428A.name(), Integer.valueOf(enumC4428A.minRequiredSdkVersion)));
            zRemove = false;
        } else {
            zRemove = hashSet2.add(enumC4428A);
        }
        if (zVar.f38423b != null && zRemove) {
            zVar.c();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            zVar.a(new C5351e("**"), InterfaceC4433F.f38294F, new f(new C4440M(C5848a.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(5, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            EnumC4439L enumC4439L = EnumC4439L.AUTOMATIC;
            int i = typedArrayObtainStyledAttributes.getInt(15, enumC4439L.ordinal());
            setRenderMode(EnumC4439L.values()[i >= EnumC4439L.values().length ? enumC4439L.ordinal() : i]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            EnumC4441a enumC4441a = EnumC4441a.AUTOMATIC;
            int i10 = typedArrayObtainStyledAttributes.getInt(0, enumC4441a.ordinal());
            setAsyncUpdates(EnumC4441a.values()[i10 >= EnumC4439L.values().length ? enumC4441a.ordinal() : i10]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(10, false));
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(20, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        Context context2 = getContext();
        C5629h.a aVar = C5629h.f46557a;
        zVar.f38425d = Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    private void setCompositionTask(C4435H<C4448h> c4435h) {
        C4434G<C4448h> c4434g = c4435h.f38331d;
        z zVar = this.i;
        if (c4434g != null && zVar == getDrawable() && zVar.f38423b == c4434g.f38325a) {
            return;
        }
        this.f18600o.add(b.SET_ANIMATION);
        this.i.d();
        l();
        c4435h.b(this.f18591e);
        c4435h.a(this.f18592f);
        this.f18602q = c4435h;
    }

    public EnumC4441a getAsyncUpdates() {
        EnumC4441a enumC4441a = this.i.f38417L;
        return enumC4441a != null ? enumC4441a : C4444d.f38338a;
    }

    public boolean getAsyncUpdatesEnabled() {
        EnumC4441a enumC4441a = this.i.f38417L;
        if (enumC4441a == null) {
            enumC4441a = C4444d.f38338a;
        }
        return enumC4441a == EnumC4441a.ENABLED;
    }

    public boolean getClipTextToBoundingBox() {
        return this.i.f38442v;
    }

    public boolean getClipToCompositionBounds() {
        return this.i.f38436p;
    }

    public C4448h getComposition() {
        Drawable drawable = getDrawable();
        z zVar = this.i;
        if (drawable == zVar) {
            return zVar.f38423b;
        }
        return null;
    }

    public long getDuration() {
        C4448h composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.i.f38424c.i;
    }

    public String getImageAssetsFolder() {
        return this.i.f38430j;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.i.f38435o;
    }

    public float getMaxFrame() {
        return this.i.f38424c.e();
    }

    public float getMinFrame() {
        return this.i.f38424c.f();
    }

    public C4437J getPerformanceTracker() {
        C4448h c4448h = this.i.f38423b;
        if (c4448h != null) {
            return c4448h.f38345a;
        }
        return null;
    }

    public float getProgress() {
        return this.i.f38424c.d();
    }

    public EnumC4439L getRenderMode() {
        return this.i.f38444x ? EnumC4439L.SOFTWARE : EnumC4439L.HARDWARE;
    }

    public int getRepeatCount() {
        return this.i.f38424c.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.i.f38424c.getRepeatMode();
    }

    public float getSpeed() {
        return this.i.f38424c.f46545e;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof z) {
            if ((((z) drawable).f38444x ? EnumC4439L.SOFTWARE : EnumC4439L.HARDWARE) == EnumC4439L.SOFTWARE) {
                this.i.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        z zVar = this.i;
        if (drawable2 == zVar) {
            super.invalidateDrawable(zVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void l() {
        C4435H<C4448h> c4435h = this.f18602q;
        if (c4435h != null) {
            d dVar = this.f18591e;
            synchronized (c4435h) {
                c4435h.f38328a.remove(dVar);
            }
            this.f18602q.e(this.f18592f);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f18598m) {
            return;
        }
        this.i.j();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        this.f18595j = aVar.f18603b;
        HashSet hashSet = this.f18600o;
        b bVar = b.SET_ANIMATION;
        if (!hashSet.contains(bVar) && !TextUtils.isEmpty(this.f18595j)) {
            setAnimation(this.f18595j);
        }
        this.f18596k = aVar.f18604c;
        if (!hashSet.contains(bVar) && (i = this.f18596k) != 0) {
            setAnimation(i);
        }
        boolean zContains = hashSet.contains(b.SET_PROGRESS);
        z zVar = this.i;
        if (!zContains) {
            zVar.s(aVar.f18605d);
        }
        b bVar2 = b.PLAY_OPTION;
        if (!hashSet.contains(bVar2) && aVar.f18606e) {
            hashSet.add(bVar2);
            zVar.j();
        }
        if (!hashSet.contains(b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(aVar.f18607f);
        }
        if (!hashSet.contains(b.SET_REPEAT_MODE)) {
            setRepeatMode(aVar.f18608g);
        }
        if (hashSet.contains(b.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(aVar.f18609h);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        a aVar = new a(super.onSaveInstanceState());
        aVar.f18603b = this.f18595j;
        aVar.f18604c = this.f18596k;
        z zVar = this.i;
        aVar.f18605d = zVar.f38424c.d();
        boolean zIsVisible = zVar.isVisible();
        ChoreographerFrameCallbackC5626e choreographerFrameCallbackC5626e = zVar.f38424c;
        if (zIsVisible) {
            z10 = choreographerFrameCallbackC5626e.f46553n;
        } else {
            z.b bVar = zVar.f38428g;
            z10 = bVar == z.b.PLAY || bVar == z.b.RESUME;
        }
        aVar.f18606e = z10;
        aVar.f18607f = zVar.f38430j;
        aVar.f18608g = choreographerFrameCallbackC5626e.getRepeatMode();
        aVar.f18609h = choreographerFrameCallbackC5626e.getRepeatCount();
        return aVar;
    }

    public void setAnimation(final int i) {
        C4435H<C4448h> c4435hA;
        this.f18596k = i;
        final String str = null;
        this.f18595j = null;
        if (isInEditMode()) {
            c4435hA = new C4435H<>(new Callable() { // from class: i2.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this.f38343a;
                    boolean z10 = lottieAnimationView.f18599n;
                    int i10 = i;
                    if (!z10) {
                        return C4453m.e(lottieAnimationView.getContext(), i10, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    return C4453m.e(context, i10, C4453m.j(context, i10));
                }
            }, true);
        } else if (this.f18599n) {
            Context context = getContext();
            final String strJ = C4453m.j(context, i);
            final WeakReference weakReference = new WeakReference(context);
            final Context applicationContext = context.getApplicationContext();
            c4435hA = C4453m.a(strJ, new Callable() { // from class: i2.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = (Context) weakReference.get();
                    if (context2 == null) {
                        context2 = applicationContext;
                    }
                    return C4453m.e(context2, i, strJ);
                }
            }, null);
        } else {
            Context context2 = getContext();
            HashMap map = C4453m.f38371a;
            final WeakReference weakReference2 = new WeakReference(context2);
            final Context applicationContext2 = context2.getApplicationContext();
            c4435hA = C4453m.a(null, new Callable() { // from class: i2.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context22 = (Context) weakReference2.get();
                    if (context22 == null) {
                        context22 = applicationContext2;
                    }
                    return C4453m.e(context22, i, str);
                }
            }, null);
        }
        setCompositionTask(c4435hA);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(C4453m.a(null, new CallableC2060j(byteArrayInputStream, 1), new RunnableC4331a(byteArrayInputStream, 2)));
    }

    public void setAnimationFromUrl(String str) {
        C4435H<C4448h> c4435hA;
        String str2 = null;
        if (this.f18599n) {
            Context context = getContext();
            HashMap map = C4453m.f38371a;
            String strD = s.d("url_", str);
            c4435hA = C4453m.a(strD, new CallableC1599k(context, str, strD), null);
        } else {
            c4435hA = C4453m.a(null, new CallableC1599k(getContext(), str, str2), null);
        }
        setCompositionTask(c4435hA);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.i.f38441u = z10;
    }

    public void setAsyncUpdates(EnumC4441a enumC4441a) {
        this.i.f38417L = enumC4441a;
    }

    public void setCacheComposition(boolean z10) {
        this.f18599n = z10;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        z zVar = this.i;
        if (z10 != zVar.f38442v) {
            zVar.f38442v = z10;
            zVar.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z10) {
        z zVar = this.i;
        if (z10 != zVar.f38436p) {
            zVar.f38436p = z10;
            q2.c cVar = zVar.f38437q;
            if (cVar != null) {
                cVar.f45365J = z10;
            }
            zVar.invalidateSelf();
        }
    }

    public void setComposition(C4448h c4448h) {
        EnumC4441a enumC4441a = C4444d.f38338a;
        z zVar = this.i;
        zVar.setCallback(this);
        boolean z10 = true;
        this.f18597l = true;
        C4448h c4448h2 = zVar.f38423b;
        ChoreographerFrameCallbackC5626e choreographerFrameCallbackC5626e = zVar.f38424c;
        if (c4448h2 == c4448h) {
            z10 = false;
        } else {
            zVar.f38416K = true;
            zVar.d();
            zVar.f38423b = c4448h;
            zVar.c();
            boolean z11 = choreographerFrameCallbackC5626e.f46552m == null;
            choreographerFrameCallbackC5626e.f46552m = c4448h;
            if (z11) {
                choreographerFrameCallbackC5626e.j(Math.max(choreographerFrameCallbackC5626e.f46550k, c4448h.f38355l), Math.min(choreographerFrameCallbackC5626e.f46551l, c4448h.f38356m));
            } else {
                choreographerFrameCallbackC5626e.j((int) c4448h.f38355l, (int) c4448h.f38356m);
            }
            float f10 = choreographerFrameCallbackC5626e.i;
            choreographerFrameCallbackC5626e.i = 0.0f;
            choreographerFrameCallbackC5626e.f46548h = 0.0f;
            choreographerFrameCallbackC5626e.i((int) f10);
            choreographerFrameCallbackC5626e.b();
            zVar.s(choreographerFrameCallbackC5626e.getAnimatedFraction());
            ArrayList<z.a> arrayList = zVar.f38429h;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                z.a aVar = (z.a) it.next();
                if (aVar != null) {
                    aVar.run();
                }
                it.remove();
            }
            arrayList.clear();
            c4448h.f38345a.f38333a = zVar.f38439s;
            zVar.e();
            Drawable.Callback callback = zVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(zVar);
            }
        }
        if (this.f18598m) {
            zVar.j();
        }
        this.f18597l = false;
        if (getDrawable() != zVar || z10) {
            if (!z10) {
                boolean z12 = choreographerFrameCallbackC5626e != null ? choreographerFrameCallbackC5626e.f46553n : false;
                setImageDrawable(null);
                setImageDrawable(zVar);
                if (z12) {
                    zVar.l();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.f18601p.iterator();
            while (it2.hasNext()) {
                ((InterfaceC4432E) it2.next()).a();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        z zVar = this.i;
        zVar.f38433m = str;
        C5318a c5318aH = zVar.h();
        if (c5318aH != null) {
            c5318aH.f44053e = str;
        }
    }

    public void setFailureListener(InterfaceC4431D<Throwable> interfaceC4431D) {
        this.f18593g = interfaceC4431D;
    }

    public void setFallbackResource(int i) {
        this.f18594h = i;
    }

    public void setFontAssetDelegate(C4442b c4442b) {
        C5318a c5318a = this.i.f38431k;
    }

    public void setFontMap(Map<String, Typeface> map) {
        z zVar = this.i;
        if (map == zVar.f38432l) {
            return;
        }
        zVar.f38432l = map;
        zVar.invalidateSelf();
    }

    public void setFrame(int i) {
        this.i.m(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.i.f38426e = z10;
    }

    public void setImageAssetDelegate(InterfaceC4443c interfaceC4443c) {
        C5319b c5319b = this.i.i;
    }

    public void setImageAssetsFolder(String str) {
        this.i.f38430j = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f18596k = 0;
        this.f18595j = null;
        l();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f18596k = 0;
        this.f18595j = null;
        l();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.f18596k = 0;
        this.f18595j = null;
        l();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.i.f38435o = z10;
    }

    public void setMaxFrame(int i) {
        this.i.n(i);
    }

    public void setMaxProgress(float f10) {
        z zVar = this.i;
        C4448h c4448h = zVar.f38423b;
        if (c4448h == null) {
            zVar.f38429h.add(new r(zVar, f10, 0));
            return;
        }
        float fE = C5628g.e(c4448h.f38355l, c4448h.f38356m, f10);
        ChoreographerFrameCallbackC5626e choreographerFrameCallbackC5626e = zVar.f38424c;
        choreographerFrameCallbackC5626e.j(choreographerFrameCallbackC5626e.f46550k, fE);
    }

    public void setMinAndMaxFrame(String str) {
        this.i.p(str);
    }

    public void setMinFrame(int i) {
        this.i.q(i);
    }

    public void setMinProgress(float f10) {
        z zVar = this.i;
        C4448h c4448h = zVar.f38423b;
        if (c4448h == null) {
            zVar.f38429h.add(new x(zVar, f10));
        } else {
            zVar.q((int) C5628g.e(c4448h.f38355l, c4448h.f38356m, f10));
        }
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        z zVar = this.i;
        if (zVar.f38440t == z10) {
            return;
        }
        zVar.f38440t = z10;
        q2.c cVar = zVar.f38437q;
        if (cVar != null) {
            cVar.r(z10);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        z zVar = this.i;
        zVar.f38439s = z10;
        C4448h c4448h = zVar.f38423b;
        if (c4448h != null) {
            c4448h.f38345a.f38333a = z10;
        }
    }

    public void setProgress(float f10) {
        this.f18600o.add(b.SET_PROGRESS);
        this.i.s(f10);
    }

    public void setRenderMode(EnumC4439L enumC4439L) {
        z zVar = this.i;
        zVar.f38443w = enumC4439L;
        zVar.e();
    }

    public void setRepeatCount(int i) {
        this.f18600o.add(b.SET_REPEAT_COUNT);
        this.i.f38424c.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.f18600o.add(b.SET_REPEAT_MODE);
        this.i.f38424c.setRepeatMode(i);
    }

    public void setSafeMode(boolean z10) {
        this.i.f38427f = z10;
    }

    public void setSpeed(float f10) {
        this.i.f38424c.f46545e = f10;
    }

    public void setTextDelegate(N n9) {
        this.i.getClass();
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.i.f38424c.f46554o = z10;
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
            boolean r0 = r4.f18597l
            r1 = 0
            if (r0 != 0) goto L19
            i2.z r2 = r4.i
            if (r5 != r2) goto L19
            u2.e r3 = r2.f38424c
            if (r3 != 0) goto Lf
            r3 = r1
            goto L11
        Lf:
            boolean r3 = r3.f46553n
        L11:
            if (r3 == 0) goto L19
            r4.f18598m = r1
            r2.i()
            goto L2e
        L19:
            if (r0 != 0) goto L2e
            boolean r0 = r5 instanceof i2.z
            if (r0 == 0) goto L2e
            r0 = r5
            i2.z r0 = (i2.z) r0
            u2.e r2 = r0.f38424c
            if (r2 != 0) goto L27
            goto L29
        L27:
            boolean r1 = r2.f46553n
        L29:
            if (r1 == 0) goto L2e
            r0.i()
        L2e:
            super.unscheduleDrawable(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.unscheduleDrawable(android.graphics.drawable.Drawable):void");
    }

    public void setMaxFrame(String str) {
        this.i.o(str);
    }

    public void setMinFrame(String str) {
        this.i.r(str);
    }

    public void setAnimation(final String str) {
        C4435H<C4448h> c4435hA;
        this.f18595j = str;
        this.f18596k = 0;
        if (isInEditMode()) {
            c4435hA = new C4435H<>(new Callable() { // from class: i2.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this.f38341a;
                    boolean z10 = lottieAnimationView.f18599n;
                    String str2 = str;
                    if (!z10) {
                        return C4453m.b(lottieAnimationView.getContext(), str2, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    HashMap map = C4453m.f38371a;
                    return C4453m.b(context, str2, "asset_" + str2);
                }
            }, true);
        } else {
            final String str2 = null;
            if (this.f18599n) {
                Context context = getContext();
                HashMap map = C4453m.f38371a;
                final String strD = s.d("asset_", str);
                final Context applicationContext = context.getApplicationContext();
                c4435hA = C4453m.a(strD, new Callable() { // from class: i2.i
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C4453m.b(applicationContext, str, strD);
                    }
                }, null);
            } else {
                Context context2 = getContext();
                HashMap map2 = C4453m.f38371a;
                final Context applicationContext2 = context2.getApplicationContext();
                c4435hA = C4453m.a(null, new Callable() { // from class: i2.i
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C4453m.b(applicationContext2, str, str2);
                    }
                }, null);
            }
        }
        setCompositionTask(c4435hA);
    }
}
