package com.bytedance.adsdk.vt;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.vt.bly;
import com.bytedance.adsdk.vt.ra;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class le extends ImageView {

    /* renamed from: lh, reason: collision with root package name */
    private static final String f7044lh = "le";
    private static final cf<Throwable> yu = new cf<Throwable>() { // from class: com.bytedance.adsdk.vt.le.1
        @Override // com.bytedance.adsdk.vt.cf
        public final /* bridge */ /* synthetic */ void ouw(Throwable th2) {
            Throwable th3 = th2;
            if (com.bytedance.adsdk.vt.le.pno.ouw(th3)) {
                com.bytedance.adsdk.vt.le.yu.ouw("Unable to load composition.", th3);
            } else {
                com.bytedance.adsdk.vt.le.yu.ouw("Unable to parse composition:", th3);
            }
        }
    };
    private String bly;

    /* renamed from: cd, reason: collision with root package name */
    private vt f7045cd;

    /* renamed from: cf, reason: collision with root package name */
    private boolean f7046cf;
    private int ex;
    private final cf<ra> fkw;
    private JSONArray jae;

    /* renamed from: jg, reason: collision with root package name */
    private final Set<Object> f7047jg;
    private int jqy;
    private jg<ra> ko;
    private String ksc;

    /* renamed from: le, reason: collision with root package name */
    private final cf<Throwable> f7048le;
    private boolean mwh;

    /* renamed from: od, reason: collision with root package name */
    private final Runnable f7049od;
    public final bly ouw;
    private int pno;
    private long qbp;
    private cf<Throwable> ra;
    private ra rn;
    private boolean ryl;
    private int tc;

    /* renamed from: th, reason: collision with root package name */
    private Handler f7050th;
    private int tlj;
    private ouw uq;
    private int vm;
    private int vpp;
    public final Set<yu> vt;
    private final Handler zih;
    private com.bytedance.adsdk.vt.lh.lh.lh zin;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.adsdk.vt.le$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            ouw = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ouw[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ouw[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class lh extends View.BaseSavedState {
        public static final Parcelable.Creator<lh> CREATOR = new Parcelable.Creator<lh>() { // from class: com.bytedance.adsdk.vt.le.lh.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ lh createFromParcel(Parcel parcel) {
                return new lh(parcel, (byte) 0);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ lh[] newArray(int i4) {
                return new lh[i4];
            }
        };
        String fkw;

        /* renamed from: le, reason: collision with root package name */
        int f7056le;

        /* renamed from: lh, reason: collision with root package name */
        float f7057lh;
        String ouw;
        int ra;
        int vt;
        boolean yu;

        public /* synthetic */ lh(Parcel parcel, byte b10) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeString(this.ouw);
            parcel.writeFloat(this.f7057lh);
            parcel.writeInt(this.yu ? 1 : 0);
            parcel.writeString(this.fkw);
            parcel.writeInt(this.f7056le);
            parcel.writeInt(this.ra);
        }

        public lh(Parcelable parcelable) {
            super(parcelable);
        }

        private lh(Parcel parcel) {
            super(parcel);
            this.ouw = parcel.readString();
            this.f7057lh = parcel.readFloat();
            this.yu = parcel.readInt() == 1;
            this.fkw = parcel.readString();
            this.f7056le = parcel.readInt();
            this.ra = parcel.readInt();
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface vt {
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum yu {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public le(Context context) {
        super(context);
        this.fkw = new cf<ra>() { // from class: com.bytedance.adsdk.vt.le.6
            @Override // com.bytedance.adsdk.vt.cf
            public final /* synthetic */ void ouw(ra raVar) {
                le.this.setComposition(raVar);
            }
        };
        this.f7048le = new cf<Throwable>() { // from class: com.bytedance.adsdk.vt.le.7
            @Override // com.bytedance.adsdk.vt.cf
            public final /* synthetic */ void ouw(Throwable th2) {
                Throwable th3 = th2;
                if (le.this.pno != 0) {
                    le leVar = le.this;
                    leVar.setImageResource(leVar.pno);
                }
                (le.this.ra == null ? le.yu : le.this.ra).ouw(th3);
            }
        };
        this.pno = 0;
        bly blyVar = new bly();
        this.ouw = blyVar;
        this.f7046cf = false;
        this.ryl = false;
        this.mwh = true;
        this.vt = new HashSet();
        this.f7047jg = new HashSet();
        this.zih = new Handler(Looper.getMainLooper());
        this.vm = 0;
        this.qbp = 0L;
        this.f7049od = new Runnable() { // from class: com.bytedance.adsdk.vt.le.4
            @Override // java.lang.Runnable
            public final void run() {
                Log.i("TMe", "--==--- timer callback, timer: " + le.this.vpp + ", " + le.this.jqy);
                if (le.this.vpp > le.this.jqy) {
                    le.vm(le.this);
                    com.bytedance.adsdk.vt.lh.lh.lh lhVar = le.this.zin;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(le.this.vpp);
                    lhVar.f7079cf = sb2.toString();
                    le.this.invalidate();
                    le.ko(le.this);
                    return;
                }
                if (le.this.ex < 0 || le.this.tc < 0) {
                    Log.i("TMe", "--==--- timer end, frame invalid: " + le.this.ex + "," + le.this.tc);
                } else {
                    Log.i("TMe", "--==--- timer end, play anim, startframe: " + le.this.ex);
                    le.this.ouw();
                    le leVar = le.this;
                    leVar.setFrame(leVar.ex);
                    le.this.ouw(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.vt.le.4.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (le.this.getFrame() < le.this.tc - 1 || le.this.getFrame() >= le.this.tc + 2) {
                                return;
                            }
                            Log.i("TMe", "--==--- timer end, play anim, endframe: " + le.this.tc);
                            le.this.vt(this);
                            le.this.vt();
                        }
                    });
                }
                if ((!TextUtils.isEmpty(le.this.ksc) || (le.this.jae != null && le.this.jae.length() > 0)) && le.this.f7045cd != null) {
                    vt unused = le.this.f7045cd;
                    String unused2 = le.this.ksc;
                    JSONArray unused3 = le.this.jae;
                }
            }
        };
        setSaveEnabled(false);
        this.mwh = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        ouw(0.0f, false);
        Context applicationContext = getContext().getApplicationContext();
        if (blyVar.zih) {
            blyVar.zih = false;
            if (blyVar.ouw != null) {
                blyVar.ouw(applicationContext);
            }
        }
        setIgnoreDisabledSystemAnimations(false);
        blyVar.f7030lh = com.bytedance.adsdk.vt.le.pno.ouw(getContext()) != 0.0f;
        ouw(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.vt.le.8
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) throws NumberFormatException {
                le.this.vt(this);
                le.lh(le.this);
                le.yu(le.this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }
        });
        ouw(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.vt.le.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) throws NumberFormatException {
                int i4;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < 0.98f) {
                    return;
                }
                le.fkw(le.this);
                ra.ouw globalConfig = le.this.getGlobalConfig();
                if (globalConfig != null && (i4 = globalConfig.yu) > 0 && i4 > le.this.vm) {
                    le.lh(le.this);
                    le.this.ouw();
                    le.this.setProgress(0.0f);
                } else {
                    le.this.vt(this);
                    if (le.this.uq != null) {
                        ouw unused = le.this.uq;
                    }
                }
            }
        });
        ouw(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.vt.le.11
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - le.this.qbp;
                le.this.vt(this);
                String playDelayedELExpressTimeS = le.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && le.this.ouw.rn != null) {
                    try {
                        int i4 = Integer.parseInt(zin.ouw(playDelayedELExpressTimeS)) * 1000;
                        if (le.this.qbp > 0) {
                            long jElapsedRealtime2 = (le.this.qbp + i4) - SystemClock.elapsedRealtime();
                            Log.i("TMe", "--==-- lottie delayed time: ".concat(String.valueOf(jElapsedRealtime2)));
                            if (jElapsedRealtime2 > 0) {
                                le.this.vt();
                                le.this.setVisibility(8);
                                if (le.this.f7050th == null) {
                                    le.this.f7050th = new Handler(Looper.getMainLooper());
                                }
                                le.this.f7050th.removeCallbacksAndMessages(null);
                                le.this.f7050th.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.vt.le.11.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Log.i("TMe", "--==-- lottie real start play");
                                        le.this.setVisibility(0);
                                        le.this.ouw();
                                        le.ouw(le.this, jElapsedRealtime);
                                    }
                                }, jElapsedRealtime2);
                                return;
                            }
                        }
                    } catch (NumberFormatException e2) {
                        e2.printStackTrace();
                    }
                }
                le.ouw(le.this, jElapsedRealtime);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }
        });
    }

    public static /* synthetic */ int fkw(le leVar) {
        int i4 = leVar.vm;
        leVar.vm = i4 + 1;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ra.ouw getGlobalConfig() {
        ra raVar;
        bly blyVar = this.ouw;
        if (blyVar == null || (raVar = blyVar.ouw) == null) {
            return null;
        }
        return raVar.zih;
    }

    private ra.vt getGlobalEvent() {
        ra raVar;
        bly blyVar = this.ouw;
        if (blyVar == null || (raVar = blyVar.ouw) == null) {
            return null;
        }
        return raVar.vm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        ra raVar;
        bly blyVar = this.ouw;
        if (blyVar == null || (raVar = blyVar.ouw) == null) {
            return null;
        }
        return raVar.rn;
    }

    public static /* synthetic */ void ko(le leVar) {
        leVar.zih.postDelayed(leVar.f7049od, 1000L);
    }

    private void setCompositionTask(jg<ra> jgVar) {
        this.vt.add(yu.SET_ANIMATION);
        this.rn = null;
        this.ouw.lh();
        yu();
        this.ko = jgVar.ouw(this.fkw).lh(this.f7048le);
    }

    public static /* synthetic */ int vm(le leVar) {
        int i4 = leVar.vpp;
        leVar.vpp = i4 - 1;
        return i4;
    }

    private static void yu(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 >= f10 || f13 >= f11) {
            if (f12 / f13 >= f10 / f11) {
                float f14 = f10 / f12;
                matrix.preScale(f14, f14);
                matrix.postTranslate(0.0f, (f11 - (f13 * f14)) / 2.0f);
                return;
            } else {
                float f15 = f11 / f13;
                matrix.preScale(f15, f15);
                matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, 0.0f);
                return;
            }
        }
        if (f12 / f13 >= f10 / f11) {
            float f16 = f10 / f12;
            matrix.preScale(f16, f16);
            matrix.postTranslate(0.0f, (f11 - (f13 * f16)) / 2.0f);
        } else {
            float f17 = f11 / f13;
            matrix.preScale(f17, f17);
            matrix.postTranslate((f10 - (f12 * f17)) / 2.0f, 0.0f);
        }
    }

    public boolean getClipToCompositionBounds() {
        return this.ouw.f7033th;
    }

    public ra getComposition() {
        return this.rn;
    }

    public long getDuration() {
        ra raVar = this.rn;
        if (raVar != null) {
            return (long) raVar.ouw();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.ouw.vt.f7055lh;
    }

    public String getImageAssetsFolder() {
        return this.ouw.tlj;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.ouw.vm;
    }

    public float getMaxFrame() {
        return this.ouw.vt.mwh();
    }

    public float getMinFrame() {
        return this.ouw.vt.ryl();
    }

    public th getPerformanceTracker() {
        ra raVar = this.ouw.ouw;
        if (raVar != null) {
            return raVar.ouw;
        }
        return null;
    }

    public float getProgress() {
        return this.ouw.vt.le();
    }

    public qbp getRenderMode() {
        return this.ouw.ouw();
    }

    public int getRepeatCount() {
        return this.ouw.vt.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.ouw.vt.getRepeatMode();
    }

    public float getSpeed() {
        return this.ouw.vt.ouw;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof bly) && ((bly) drawable).ouw() == qbp.SOFTWARE) {
            this.ouw.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        bly blyVar = this.ouw;
        if (drawable2 == blyVar) {
            super.invalidateDrawable(blyVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.ryl) {
            return;
        }
        this.ouw.yu();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fkw();
        Handler handler = this.f7050th;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.ouw.vt.removeAllListeners();
        bly blyVar = this.ouw;
        blyVar.vt.removeAllUpdateListeners();
        blyVar.vt.addUpdateListener(blyVar.pno);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i4;
        if (!(parcelable instanceof lh)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        lh lhVar = (lh) parcelable;
        super.onRestoreInstanceState(lhVar.getSuperState());
        this.bly = lhVar.ouw;
        Set<yu> set = this.vt;
        yu yuVar = yu.SET_ANIMATION;
        if (!set.contains(yuVar) && !TextUtils.isEmpty(this.bly)) {
            setAnimation(this.bly);
        }
        this.tlj = lhVar.vt;
        if (!this.vt.contains(yuVar) && (i4 = this.tlj) != 0) {
            setAnimation(i4);
        }
        if (!this.vt.contains(yu.SET_PROGRESS)) {
            ouw(lhVar.f7057lh, false);
        }
        if (!this.vt.contains(yu.PLAY_OPTION) && lhVar.yu) {
            ouw();
        }
        if (!this.vt.contains(yu.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(lhVar.fkw);
        }
        if (!this.vt.contains(yu.SET_REPEAT_MODE)) {
            setRepeatMode(lhVar.f7056le);
        }
        if (this.vt.contains(yu.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(lhVar.ra);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean zIsRunning;
        lh lhVar = new lh(super.onSaveInstanceState());
        lhVar.ouw = this.bly;
        lhVar.vt = this.tlj;
        lhVar.f7057lh = this.ouw.vt.le();
        bly blyVar = this.ouw;
        if (blyVar.isVisible()) {
            zIsRunning = blyVar.vt.isRunning();
        } else {
            bly.vt vtVar = blyVar.f7029le;
            zIsRunning = vtVar == bly.vt.PLAY || vtVar == bly.vt.RESUME;
        }
        lhVar.yu = zIsRunning;
        bly blyVar2 = this.ouw;
        lhVar.fkw = blyVar2.tlj;
        lhVar.f7056le = blyVar2.vt.getRepeatMode();
        lhVar.ra = this.ouw.vt.getRepeatCount();
        return lhVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.bytedance.adsdk.vt.lh.lh.vt vtVar;
        int[][] iArr;
        bly blyVar;
        ra raVar;
        Map<String, tlj> map;
        bly blyVar2 = this.ouw;
        tlj tljVar = null;
        com.bytedance.adsdk.vt.lh.lh.ouw ouwVarOuw = (blyVar2 == null || (vtVar = blyVar2.qbp) == null) ? null : ouw(vtVar, motionEvent);
        if (ouwVarOuw == null) {
            if (getGlobalConfig() == null || getGlobalConfig().ouw != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        String str = ouwVarOuw.f7085lh.f7073lh;
        if (ouwVarOuw instanceof com.bytedance.adsdk.vt.lh.lh.vt) {
            if (getGlobalConfig() == null || getGlobalConfig().ouw != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        if (str != null && str.startsWith("CSJCLOSE")) {
            fkw();
        }
        com.bytedance.adsdk.vt.lh.lh.fkw fkwVar = ouwVarOuw.f7085lh;
        String str2 = fkwVar != null ? fkwVar.ra : null;
        if (!TextUtils.isEmpty(str2) && (blyVar = this.ouw) != null && (raVar = blyVar.ouw) != null && (map = raVar.f7198lh) != null) {
            tljVar = map.get(str2);
        }
        if (tljVar != null && motionEvent.getAction() == 1) {
            String str3 = tljVar.pno;
            JSONArray jSONArray = tljVar.tlj;
            ra.vt globalEvent = getGlobalEvent();
            if (globalEvent != null && str != null) {
                if (TextUtils.isEmpty(str3) && !str.contains("CSJNO")) {
                    str3 = globalEvent.ouw;
                }
                if ((jSONArray == null || jSONArray.length() <= 0) && !str.contains("CSJLELNO")) {
                    jSONArray = globalEvent.f7208lh;
                }
            }
            if (TextUtils.isEmpty(str3) && jSONArray != null) {
                jSONArray.length();
            }
            int[][] iArr2 = tljVar.bly;
            if (iArr2 != null) {
                ouw(iArr2);
            } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().vt) != null) {
                ouw(iArr);
            }
        }
        if (str == null || !str.startsWith("CSJNTP")) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setAnimation(final int i4) {
        this.tlj = i4;
        this.bly = null;
        setCompositionTask(isInEditMode() ? new jg<>(new Callable<mwh<ra>>() { // from class: com.bytedance.adsdk.vt.le.13
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ mwh<ra> call() throws Exception {
                return le.this.mwh ? pno.vt(le.this.getContext(), i4) : pno.lh(le.this.getContext(), i4);
            }
        }, true) : this.mwh ? pno.ouw(getContext(), i4) : pno.ouw(getContext(), i4, (String) null));
    }

    public void setAnimationFromJson(String str) {
        setCompositionTask(pno.ouw(new ByteArrayInputStream(str.getBytes()), (String) null));
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.mwh ? pno.ouw(getContext(), str) : pno.ouw(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z3) {
        this.ouw.jqy = z3;
    }

    public void setCacheComposition(boolean z3) {
        this.mwh = z3;
    }

    public void setClipToCompositionBounds(boolean z3) {
        bly blyVar = this.ouw;
        if (z3 != blyVar.f7033th) {
            blyVar.f7033th = z3;
            com.bytedance.adsdk.vt.lh.lh.vt vtVar = blyVar.qbp;
            if (vtVar != null) {
                vtVar.ryl = z3;
            }
            blyVar.invalidateSelf();
        }
    }

    public void setComposition(ra raVar) {
        if (fkw.ouw) {
            Log.v(f7044lh, "Set Composition \n".concat(String.valueOf(raVar)));
        }
        this.ouw.setCallback(this);
        this.rn = raVar;
        boolean z3 = true;
        this.f7046cf = true;
        bly blyVar = this.ouw;
        Context applicationContext = getContext().getApplicationContext();
        if (blyVar.ouw == raVar) {
            z3 = false;
        } else {
            blyVar.f7031od = true;
            blyVar.lh();
            blyVar.ouw = raVar;
            blyVar.ouw(applicationContext);
            com.bytedance.adsdk.vt.le.fkw fkwVar = blyVar.vt;
            boolean z10 = fkwVar.f7054le == null;
            fkwVar.f7054le = raVar;
            if (z10) {
                fkwVar.ouw(Math.max(fkwVar.yu, raVar.tlj), Math.min(fkwVar.fkw, raVar.f7195cf));
            } else {
                fkwVar.ouw((int) raVar.tlj, (int) raVar.f7195cf);
            }
            float f10 = fkwVar.f7055lh;
            fkwVar.f7055lh = 0.0f;
            fkwVar.vt = 0.0f;
            fkwVar.ouw((int) f10);
            fkwVar.lh();
            blyVar.lh(blyVar.vt.getAnimatedFraction());
            Iterator it = new ArrayList(blyVar.ra).iterator();
            while (it.hasNext()) {
                bly.ouw ouwVar = (bly.ouw) it.next();
                if (ouwVar != null) {
                    ouwVar.ouw();
                }
                it.remove();
            }
            blyVar.ra.clear();
            raVar.ouw(blyVar.zin);
            blyVar.vt();
            Drawable.Callback callback = blyVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(blyVar);
            }
        }
        this.f7046cf = false;
        Drawable drawable = getDrawable();
        bly blyVar2 = this.ouw;
        if (drawable != blyVar2 || z3) {
            if (!z3) {
                boolean zLe = blyVar2.le();
                setImageDrawable(null);
                setImageDrawable(this.ouw);
                if (zLe) {
                    this.ouw.fkw();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it2 = this.f7047jg.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        bly blyVar = this.ouw;
        blyVar.f7028jg = str;
        com.bytedance.adsdk.vt.vt.ouw ouwVarBly = blyVar.bly();
        if (ouwVarBly != null) {
            ouwVarBly.yu = str;
        }
    }

    public void setFailureListener(cf<Throwable> cfVar) {
        this.ra = cfVar;
    }

    public void setFallbackResource(int i4) {
        this.pno = i4;
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.vt.lh lhVar) {
        bly blyVar = this.ouw;
        blyVar.ko = lhVar;
        com.bytedance.adsdk.vt.vt.ouw ouwVar = blyVar.ryl;
        if (ouwVar != null) {
            ouwVar.f7218lh = lhVar;
        }
    }

    public void setFontMap(Map<String, Typeface> map) {
        bly blyVar = this.ouw;
        if (map != blyVar.mwh) {
            blyVar.mwh = map;
            blyVar.invalidateSelf();
        }
    }

    public void setFrame(int i4) {
        this.ouw.lh(i4);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z3) {
        this.ouw.yu = z3;
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.vt.yu yuVar) {
        bly blyVar = this.ouw;
        blyVar.f7027cf = yuVar;
        com.bytedance.adsdk.vt.vt.vt vtVar = blyVar.bly;
        if (vtVar != null) {
            vtVar.ouw = yuVar;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.ouw.tlj = str;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        yu();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        yu();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        yu();
        super.setImageResource(i4);
    }

    public void setLottieAnimListener(ouw ouwVar) {
        this.uq = ouwVar;
    }

    public void setLottieClicklistener(vt vtVar) {
        this.f7045cd = vtVar;
    }

    public void setMaintainOriginalImageBounds(boolean z3) {
        this.ouw.vm = z3;
    }

    public void setMaxFrame(int i4) {
        this.ouw.vt(i4);
    }

    public void setMaxProgress(float f10) {
        this.ouw.vt(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.ouw.lh(str);
    }

    public void setMinFrame(int i4) {
        this.ouw.ouw(i4);
    }

    public void setMinProgress(float f10) {
        this.ouw.ouw(f10);
    }

    public void setOutlineMasksAndMattes(boolean z3) {
        bly blyVar = this.ouw;
        if (blyVar.vpp != z3) {
            blyVar.vpp = z3;
            com.bytedance.adsdk.vt.lh.lh.vt vtVar = blyVar.qbp;
            if (vtVar != null) {
                vtVar.ouw(z3);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z3) {
        bly blyVar = this.ouw;
        blyVar.zin = z3;
        ra raVar = blyVar.ouw;
        if (raVar != null) {
            raVar.ouw(z3);
        }
    }

    public void setProgress(float f10) {
        ouw(f10, true);
    }

    public void setRenderMode(qbp qbpVar) {
        bly blyVar = this.ouw;
        blyVar.ex = qbpVar;
        blyVar.vt();
    }

    public void setRepeatCount(int i4) {
        this.vt.add(yu.SET_REPEAT_COUNT);
        this.ouw.yu(i4);
    }

    public void setRepeatMode(int i4) {
        this.vt.add(yu.SET_REPEAT_MODE);
        this.ouw.vt.setRepeatMode(i4);
    }

    public void setSafeMode(boolean z3) {
        this.ouw.fkw = z3;
    }

    public void setSpeed(float f10) {
        this.ouw.vt.ouw = f10;
    }

    public void setTextDelegate(zin zinVar) {
        this.ouw.rn = zinVar;
    }

    public void setUseCompositionFrameRate(boolean z3) {
        this.ouw.vt.pno = z3;
    }

    public void setView(View view) {
        this.ouw.jae = view;
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        bly blyVar;
        if (!this.f7046cf && drawable == (blyVar = this.ouw) && blyVar.le()) {
            vt();
        } else if (!this.f7046cf && (drawable instanceof bly)) {
            bly blyVar2 = (bly) drawable;
            if (blyVar2.le()) {
                blyVar2.ra();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    private void fkw() {
        this.zih.removeCallbacksAndMessages(null);
    }

    private static void lh(Matrix matrix, float f10, float f11, float f12, float f13) {
        matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
    }

    private void vt(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = this.ouw.getBounds().width();
        float fHeight = this.ouw.getBounds().height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i4 = AnonymousClass5.ouw[getScaleType().ordinal()];
        if (i4 == 1) {
            ouw(matrix, width, height, fWidth, fHeight);
        } else if (i4 == 2) {
            vt(matrix, width, height, fWidth, fHeight);
        } else if (i4 == 3) {
            lh(matrix, width, height, fWidth, fHeight);
        } else if (i4 == 4) {
            yu(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF, rectF2);
    }

    public void setMaxFrame(String str) {
        this.ouw.vt(str);
    }

    public void setMinFrame(String str) {
        this.ouw.ouw(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void lh(com.bytedance.adsdk.vt.le r9) throws java.lang.NumberFormatException {
        /*
            com.bytedance.adsdk.vt.ra r0 = r9.rn
            if (r0 == 0) goto Ld3
            com.bytedance.adsdk.vt.bly r1 = r9.ouw
            if (r1 == 0) goto Ld3
            com.bytedance.adsdk.vt.zin r1 = r1.rn
            com.bytedance.adsdk.vt.ra$lh r0 = r0.ko
            if (r0 == 0) goto Ld3
            if (r1 == 0) goto Ld3
            int r1 = r0.ouw
            java.lang.String r2 = "TMe"
            if (r1 >= 0) goto L24
            java.lang.String r9 = "--==--- timer fail, ke is invalid: "
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r9 = r9.concat(r0)
            android.util.Log.i(r2, r9)
            return
        L24:
            int[] r3 = r0.fkw
            r4 = -1
            if (r3 == 0) goto L34
            int r5 = r3.length
            r6 = 2
            if (r5 < r6) goto L34
            r5 = 0
            r5 = r3[r5]
            r6 = 1
            r3 = r3[r6]
            goto L36
        L34:
            r3 = r4
            r5 = r3
        L36:
            java.lang.String r6 = r0.f7201lh
            java.lang.String r6 = com.bytedance.adsdk.vt.zin.ouw(r6)
            java.lang.String r7 = r0.yu
            java.lang.String r7 = com.bytedance.adsdk.vt.zin.ouw(r7)
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L4d
            int r4 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L4b
            goto L52
        L4b:
            r7 = move-exception
            goto L4f
        L4d:
            r7 = move-exception
            r6 = r4
        L4f:
            r7.printStackTrace()
        L52:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "--==--- prepare timer, startS: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r8 = ", lenS: "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            android.util.Log.i(r2, r7)
            java.lang.String r7 = r0.vt
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto Lc0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "--==--- timer, id:"
            r7.<init>(r8)
            java.lang.String r8 = r0.vt
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.i(r2, r7)
            java.lang.String r7 = r0.vt
            com.bytedance.adsdk.vt.lh.lh.lh r7 = r9.ouw(r7)
            if (r7 == 0) goto Ld3
            java.lang.String r8 = "--==--- timer success"
            android.util.Log.i(r2, r8)
            java.lang.String r2 = r0.f7200le
            r9.ksc = r2
            org.json.JSONArray r0 = r0.ra
            r9.jae = r0
            r9.zin = r7
            r9.vpp = r6
            int r0 = r6 - r4
            r9.jqy = r0
            r9.ex = r5
            r9.tc = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r9.vpp
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r7.f7079cf = r0
            com.bytedance.adsdk.vt.le$3 r0 = new com.bytedance.adsdk.vt.le$3
            r0.<init>()
            r9.ouw(r0)
            goto Ld3
        Lc0:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "--==--- timer fail, id is invalid: "
            r9.<init>(r1)
            java.lang.String r0 = r0.vt
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            android.util.Log.i(r2, r9)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.le.lh(com.bytedance.adsdk.vt.le):void");
    }

    private void ouw(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i4 = iArr2[0];
            final int i10 = iArr2[1];
            if (i4 < 0 || i10 < 0) {
                return;
            }
            Log.i("TMe", "--==--- inel enter, play anim, startframe: ".concat(String.valueOf(i4)));
            fkw();
            ouw();
            setFrame(i4);
            ouw(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.vt.le.12
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (le.this.getFrame() < i10 - 1 || le.this.getFrame() >= i10 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- inel enter, play anim end, endframe: " + i10 + ", realFrame: " + le.this.getFrame());
                    le.this.vt(this);
                    le.this.vt();
                }
            });
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void setAnimation(final String str) {
        jg<ra> jgVarVt;
        this.bly = str;
        this.tlj = 0;
        if (isInEditMode()) {
            jgVarVt = new jg<>(new Callable<mwh<ra>>() { // from class: com.bytedance.adsdk.vt.le.2
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ mwh<ra> call() throws Exception {
                    return le.this.mwh ? pno.lh(le.this.getContext(), str) : pno.lh(le.this.getContext(), str, null);
                }
            }, true);
        } else {
            jgVarVt = this.mwh ? pno.vt(getContext(), str) : pno.vt(getContext(), str, (String) null);
        }
        setCompositionTask(jgVarVt);
    }

    private void yu() {
        jg<ra> jgVar = this.ko;
        if (jgVar != null) {
            jgVar.vt(this.fkw);
            this.ko.yu(this.f7048le);
        }
    }

    private static boolean ouw(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return x10 >= rectF.left && x10 <= rectF.right && y10 >= rectF.top && y10 <= rectF.bottom;
    }

    public static /* synthetic */ void yu(le leVar) {
        final ra.ouw globalConfig = leVar.getGlobalConfig();
        if (globalConfig == null || globalConfig.fkw <= 0) {
            return;
        }
        if (TextUtils.isEmpty(globalConfig.f7206le) && globalConfig.ra == null) {
            return;
        }
        int maxFrame = globalConfig.fkw;
        if (maxFrame > leVar.getMaxFrame()) {
            maxFrame = (int) leVar.getMaxFrame();
        }
        final float maxFrame2 = maxFrame / leVar.getMaxFrame();
        leVar.ouw(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.vt.le.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < maxFrame2) {
                    return;
                }
                le.this.vt(this);
                if (le.this.f7045cd != null) {
                    vt unused = le.this.f7045cd;
                }
            }
        });
    }

    private static void vt(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 < f10 && f13 < f11) {
            matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
            return;
        }
        if (f12 / f13 >= f10 / f11) {
            float f14 = f10 / f12;
            matrix.preScale(f14, f14);
            matrix.postTranslate(0.0f, (f11 - (f13 * f14)) / 2.0f);
        } else {
            float f15 = f11 / f13;
            matrix.preScale(f15, f15);
            matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, 0.0f);
        }
    }

    private void ouw(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i4 = AnonymousClass5.ouw[getScaleType().ordinal()];
        if (i4 == 1) {
            ouw(matrix, width, height, fWidth, fHeight);
        } else if (i4 == 2) {
            vt(matrix, width, height, fWidth, fHeight);
        } else if (i4 == 3) {
            lh(matrix, width, height, fWidth, fHeight);
        } else if (i4 == 4) {
            yu(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF);
    }

    public final void vt(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.ouw.vt.removeUpdateListener(animatorUpdateListener);
    }

    public final void vt(Animator.AnimatorListener animatorListener) {
        this.ouw.vt.removeListener(animatorListener);
    }

    public final void vt() {
        this.ryl = false;
        this.ouw.ra();
    }

    private static void ouw(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 / f13 >= f10 / f11) {
            float f14 = f11 / f13;
            matrix.preScale(f14, f14);
            matrix.postTranslate(-(((f12 * f14) - f10) / 2.0f), 0.0f);
        } else {
            float f15 = f10 / f12;
            matrix.preScale(f15, f15);
            matrix.postTranslate(0.0f, -(((f13 * f15) - f11) / 2.0f));
        }
    }

    private com.bytedance.adsdk.vt.lh.lh.lh ouw(String str) {
        com.bytedance.adsdk.vt.lh.lh.vt vtVar;
        bly blyVar = this.ouw;
        if (blyVar == null || (vtVar = blyVar.qbp) == null) {
            return null;
        }
        return ouw(vtVar, str);
    }

    public final void ouw() {
        if (this.qbp == 0) {
            this.qbp = SystemClock.elapsedRealtime();
        }
        this.vt.add(yu.PLAY_OPTION);
        this.ouw.yu();
    }

    public final void ouw(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.ouw.ouw(animatorUpdateListener);
    }

    public final void ouw(Animator.AnimatorListener animatorListener) {
        this.ouw.ouw(animatorListener);
    }

    public final void ouw(boolean z3) {
        this.ouw.yu(z3 ? -1 : 0);
    }

    public final Bitmap ouw(String str, Bitmap bitmap) {
        Bitmap bitmap2;
        bly blyVar = this.ouw;
        com.bytedance.adsdk.vt.vt.vt vtVarPno = blyVar.pno();
        if (vtVarPno == null) {
            com.bytedance.adsdk.vt.le.yu.vt("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        if (bitmap == null) {
            tlj tljVar = vtVarPno.vt.get(str);
            bitmap2 = tljVar.f7211cf;
            tljVar.f7211cf = null;
        } else {
            Bitmap bitmap3 = vtVarPno.vt.get(str).f7211cf;
            vtVarPno.ouw(str, bitmap);
            bitmap2 = bitmap3;
        }
        blyVar.invalidateSelf();
        return bitmap2;
    }

    private void ouw(float f10, boolean z3) {
        if (z3) {
            this.vt.add(yu.SET_PROGRESS);
        }
        this.ouw.lh(f10);
    }

    private com.bytedance.adsdk.vt.lh.lh.ouw ouw(com.bytedance.adsdk.vt.lh.lh.vt vtVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.vt.lh.lh.ouw ouwVarOuw;
        for (com.bytedance.adsdk.vt.lh.lh.ouw ouwVar : vtVar.f7094cf) {
            if (ouwVar instanceof com.bytedance.adsdk.vt.lh.lh.vt) {
                if (ouwVar.f7084le && ouwVar.tlj > 0.0f) {
                    RectF rectF = new RectF();
                    ouwVar.ouw(rectF, ouwVar.bly, true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (ouwVarOuw = ouw((com.bytedance.adsdk.vt.lh.lh.vt) ouwVar, motionEvent)) != null) {
                        return ouwVarOuw;
                    }
                }
            } else if (ouwVar.f7084le && ouwVar.tlj > 0.0f) {
                RectF rectF2 = new RectF();
                bly blyVar = this.ouw;
                if (blyVar != null && blyVar.tc) {
                    ouwVar.ouw(rectF2, ouwVar.bly, true);
                    RectF rectF3 = this.ouw.ksc;
                    if (rectF3 != null) {
                        ouw(rectF2, rectF3);
                    }
                } else {
                    RectF rectF4 = new RectF();
                    ouwVar.ouw(rectF4, ouwVar.bly, true);
                    vt(rectF2, rectF4);
                }
                if (ouw(motionEvent, rectF2)) {
                    return ouwVar;
                }
            }
        }
        return null;
    }

    private com.bytedance.adsdk.vt.lh.lh.lh ouw(com.bytedance.adsdk.vt.lh.lh.vt vtVar, String str) {
        for (com.bytedance.adsdk.vt.lh.lh.ouw ouwVar : vtVar.f7094cf) {
            if (ouwVar instanceof com.bytedance.adsdk.vt.lh.lh.vt) {
                com.bytedance.adsdk.vt.lh.lh.lh lhVarOuw = ouw((com.bytedance.adsdk.vt.lh.lh.vt) ouwVar, str);
                if (lhVarOuw != null) {
                    return lhVarOuw;
                }
            } else if (TextUtils.equals(str, ouwVar.f7085lh.f7073lh) && (ouwVar instanceof com.bytedance.adsdk.vt.lh.lh.lh)) {
                return (com.bytedance.adsdk.vt.lh.lh.lh) ouwVar;
            }
        }
        return null;
    }

    public static /* synthetic */ void ouw(le leVar, long j) {
        Map<String, Object> map;
        ra.ouw globalConfig = leVar.getGlobalConfig();
        if (leVar.uq != null) {
            HashMap map2 = new HashMap();
            map2.put("duration", Long.valueOf(j));
            if (globalConfig == null || (map = globalConfig.vt) == null || map.isEmpty()) {
                return;
            }
            map2.putAll(globalConfig.vt);
        }
    }
}
