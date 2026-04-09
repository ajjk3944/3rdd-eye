package com.bytedance.adsdk.ypw;

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
import com.bytedance.adsdk.ypw.uym;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class ycc extends ImageView {
    private static final String emc = "ycc";
    private static final gbl<Throwable> ypw = new gbl<Throwable>() { // from class: com.bytedance.adsdk.ypw.ycc.1
        @Override // com.bytedance.adsdk.ypw.gbl
        public void emc(Throwable th) {
            com.bytedance.adsdk.ypw.ycc.ycc.emc(th);
        }
    };
    private final Handler aa;
    private gbl<Throwable> bw;
    private sz<uym> cf;
    private String db;
    private final gbl<Throwable> dg;
    private ypw dr;
    private int ee;
    private boolean gbl;
    private int hxp;
    private String msw;
    private final Set<Object> qh;
    private int rie;
    private boolean ru;
    private JSONArray sb;
    private int sba;
    private final Runnable sf;
    private int sra;
    private boolean sup;
    private final Set<dg> sz;
    private long ul;
    private final zz uym;
    private uym vk;
    private emc xmt;
    private final gbl<uym> xq;
    private int ycc;
    private com.bytedance.adsdk.ypw.xq.xq.xq ylm;
    private Handler yzg;
    private int zz;

    /* renamed from: com.bytedance.adsdk.ypw.ycc$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] emc;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            emc = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                emc[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                emc[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                emc[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum dg {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public interface emc {
    }

    public static class xq extends View.BaseSavedState {
        public static final Parcelable.Creator<xq> CREATOR = new Parcelable.Creator<xq>() { // from class: com.bytedance.adsdk.ypw.ycc.xq.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public xq createFromParcel(Parcel parcel) {
                return new xq(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public xq[] newArray(int i) {
                return new xq[i];
            }
        };
        String bw;
        boolean dg;
        String emc;
        int uym;
        float xq;
        int ycc;
        int ypw;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.emc);
            parcel.writeFloat(this.xq);
            parcel.writeInt(this.dg ? 1 : 0);
            parcel.writeString(this.bw);
            parcel.writeInt(this.ycc);
            parcel.writeInt(this.uym);
        }

        public xq(Parcelable parcelable) {
            super(parcelable);
        }

        private xq(Parcel parcel) {
            super(parcel);
            this.emc = parcel.readString();
            this.xq = parcel.readFloat();
            this.dg = parcel.readInt() == 1;
            this.bw = parcel.readString();
            this.ycc = parcel.readInt();
            this.uym = parcel.readInt();
        }
    }

    public interface ypw {
    }

    public ycc(Context context) {
        super(context);
        this.xq = new gbl<uym>() { // from class: com.bytedance.adsdk.ypw.ycc.6
            @Override // com.bytedance.adsdk.ypw.gbl
            public void emc(uym uymVar) {
                ycc.this.setComposition(uymVar);
            }
        };
        this.dg = new gbl<Throwable>() { // from class: com.bytedance.adsdk.ypw.ycc.7
            @Override // com.bytedance.adsdk.ypw.gbl
            public void emc(Throwable th) {
                if (ycc.this.ycc != 0) {
                    ycc yccVar = ycc.this;
                    yccVar.setImageResource(yccVar.ycc);
                }
                (ycc.this.bw == null ? ycc.ypw : ycc.this.bw).emc(th);
            }
        };
        this.ycc = 0;
        this.uym = new zz();
        this.ru = false;
        this.gbl = false;
        this.sup = true;
        this.sz = new HashSet();
        this.qh = new HashSet();
        this.aa = new Handler(Looper.getMainLooper());
        this.sba = 0;
        this.ul = 0L;
        this.sf = new Runnable() { // from class: com.bytedance.adsdk.ypw.ycc.4
            @Override // java.lang.Runnable
            public void run() {
                Log.i("TMe", "--==--- timer callback, timer: " + ycc.this.sra + ", " + ycc.this.rie);
                if (ycc.this.sra > ycc.this.rie) {
                    ycc.sba(ycc.this);
                    com.bytedance.adsdk.ypw.xq.xq.xq xqVar = ycc.this.ylm;
                    StringBuilder sb = new StringBuilder();
                    sb.append(ycc.this.sra);
                    xqVar.emc(sb.toString());
                    ycc.this.invalidate();
                    ycc.this.cf();
                    return;
                }
                if (ycc.this.hxp < 0 || ycc.this.ee < 0) {
                    Log.i("TMe", "--==--- timer end, frame invalid: " + ycc.this.hxp + "," + ycc.this.ee);
                } else {
                    Log.i("TMe", "--==--- timer end, play anim, startframe: " + ycc.this.hxp);
                    ycc.this.emc();
                    ycc yccVar = ycc.this;
                    yccVar.setFrame(yccVar.hxp);
                    ycc.this.emc(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ypw.ycc.4.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (ycc.this.getFrame() < ycc.this.ee - 1 || ycc.this.getFrame() >= ycc.this.ee + 2) {
                                return;
                            }
                            Log.i("TMe", "--==--- timer end, play anim, endframe: " + ycc.this.ee);
                            ycc.this.ypw(this);
                            ycc.this.ycc();
                        }
                    });
                }
                if ((!TextUtils.isEmpty(ycc.this.db) || (ycc.this.sb != null && ycc.this.sb.length() > 0)) && ycc.this.dr != null) {
                    ypw unused = ycc.this.dr;
                    String unused2 = ycc.this.db;
                    JSONArray unused3 = ycc.this.sb;
                }
            }
        };
        msw();
    }

    public static /* synthetic */ int bw(ycc yccVar) {
        int i = yccVar.sba;
        yccVar.sba = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public uym.emc getGlobalConfig() {
        uym uymVarDb;
        zz zzVar = this.uym;
        if (zzVar == null || (uymVarDb = zzVar.db()) == null) {
            return null;
        }
        return uymVarDb.gbl();
    }

    private uym.ypw getGlobalEvent() {
        uym uymVarDb;
        zz zzVar = this.uym;
        if (zzVar == null || (uymVarDb = zzVar.db()) == null) {
            return null;
        }
        return uymVarDb.ru();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        uym uymVarDb;
        zz zzVar = this.uym;
        if (zzVar == null || (uymVarDb = zzVar.db()) == null) {
            return null;
        }
        return uymVarDb.zz();
    }

    public static /* synthetic */ int sba(ycc yccVar) {
        int i = yccVar.sra;
        yccVar.sra = i - 1;
        return i;
    }

    private void setCompositionTask(sz<uym> szVar) {
        this.sz.add(dg.SET_ANIMATION);
        aa();
        sz();
        this.cf = szVar.emc(this.xq).xq(this.dg);
    }

    public boolean getClipToCompositionBounds() {
        return this.uym.xq();
    }

    public uym getComposition() {
        return this.vk;
    }

    public long getDuration() {
        uym uymVar = this.vk;
        if (uymVar != null) {
            return (long) uymVar.bw();
        }
        return 0L;
    }

    public int getFrame() {
        return this.uym.yzg();
    }

    public String getImageAssetsFolder() {
        return this.uym.dg();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.uym.bw();
    }

    public float getMaxFrame() {
        return this.uym.cf();
    }

    public float getMinFrame() {
        return this.uym.qh();
    }

    public sba getPerformanceTracker() {
        return this.uym.msw();
    }

    public float getProgress() {
        return this.uym.dr();
    }

    public yzg getRenderMode() {
        return this.uym.ycc();
    }

    public int getRepeatCount() {
        return this.uym.ylm();
    }

    public int getRepeatMode() {
        return this.uym.ul();
    }

    public float getSpeed() {
        return this.uym.vk();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof zz) && ((zz) drawable).ycc() == yzg.SOFTWARE) {
            this.uym.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        zz zzVar = this.uym;
        if (drawable2 == zzVar) {
            super.invalidateDrawable(zzVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.gbl) {
            return;
        }
        this.uym.gbl();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vk();
        Handler handler = this.yzg;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        xq();
        ypw();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof xq)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        xq xqVar = (xq) parcelable;
        super.onRestoreInstanceState(xqVar.getSuperState());
        this.msw = xqVar.emc;
        Set<dg> set = this.sz;
        dg dgVar = dg.SET_ANIMATION;
        if (!set.contains(dgVar) && !TextUtils.isEmpty(this.msw)) {
            setAnimation(this.msw);
        }
        this.zz = xqVar.ypw;
        if (!this.sz.contains(dgVar) && (i = this.zz) != 0) {
            setAnimation(i);
        }
        if (!this.sz.contains(dg.SET_PROGRESS)) {
            emc(xqVar.xq, false);
        }
        if (!this.sz.contains(dg.PLAY_OPTION) && xqVar.dg) {
            emc();
        }
        if (!this.sz.contains(dg.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(xqVar.bw);
        }
        if (!this.sz.contains(dg.SET_REPEAT_MODE)) {
            setRepeatMode(xqVar.ycc);
        }
        if (this.sz.contains(dg.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(xqVar.uym);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        xq xqVar = new xq(super.onSaveInstanceState());
        xqVar.emc = this.msw;
        xqVar.ypw = this.zz;
        xqVar.xq = this.uym.dr();
        xqVar.dg = this.uym.rie();
        xqVar.bw = this.uym.dg();
        xqVar.ycc = this.uym.ul();
        xqVar.uym = this.uym.ylm();
        return xqVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[][] iArr;
        com.bytedance.adsdk.ypw.xq.xq.emc emcVarEmc = emc(motionEvent);
        if (emcVarEmc == null) {
            if (getGlobalConfig() == null || getGlobalConfig().emc != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        String strZz = emcVarEmc.zz();
        if (emcVarEmc instanceof com.bytedance.adsdk.ypw.xq.xq.ypw) {
            if (getGlobalConfig() == null || getGlobalConfig().emc != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        if (strZz != null && strZz.startsWith("CSJCLOSE")) {
            vk();
        }
        ru ruVarEmc = emc(emcVarEmc.bw());
        if (ruVarEmc != null && motionEvent.getAction() == 1) {
            emc(strZz, ruVarEmc.bw(), ruVarEmc.uym());
            int[][] iArrYcc = ruVarEmc.ycc();
            if (iArrYcc != null) {
                emc(iArrYcc);
            } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().ypw) != null) {
                emc(iArr);
            }
        }
        if (strZz == null || !strZz.startsWith("CSJNTP")) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setAnimation(int i) {
        this.zz = i;
        this.msw = null;
        setCompositionTask(emc(i));
    }

    public void setAnimationFromJson(String str) {
        emc(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.sup ? msw.emc(getContext(), str) : msw.emc(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z6) {
        this.uym.bw(z6);
    }

    public void setCacheComposition(boolean z6) {
        this.sup = z6;
    }

    public void setClipToCompositionBounds(boolean z6) {
        this.uym.emc(z6);
    }

    public void setComposition(uym uymVar) {
        if (bw.emc) {
            Log.v(emc, "Set Composition \n".concat(String.valueOf(uymVar)));
        }
        this.uym.setCallback(this);
        this.vk = uymVar;
        this.ru = true;
        boolean zEmc = this.uym.emc(uymVar, getContext().getApplicationContext());
        this.ru = false;
        if (getDrawable() != this.uym || zEmc) {
            if (!zEmc) {
                sba();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.qh.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.uym.uym(str);
    }

    public void setFailureListener(gbl<Throwable> gblVar) {
        this.bw = gblVar;
    }

    public void setFallbackResource(int i) {
        this.ycc = i;
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.ypw.xq xqVar) {
        this.uym.emc(xqVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.uym.emc(map);
    }

    public void setFrame(int i) {
        this.uym.xq(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z6) {
        this.uym.uym(z6);
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.ypw.dg dgVar) {
        this.uym.emc(dgVar);
    }

    public void setImageAssetsFolder(String str) {
        this.uym.emc(str);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        sz();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        sz();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        sz();
        super.setImageResource(i);
    }

    public void setLottieAnimListener(emc emcVar) {
        this.xmt = emcVar;
    }

    public void setLottieClicklistener(ypw ypwVar) {
        this.dr = ypwVar;
    }

    public void setMaintainOriginalImageBounds(boolean z6) {
        this.uym.ypw(z6);
    }

    public void setMaxFrame(int i) {
        this.uym.ypw(i);
    }

    public void setMaxProgress(float f2) {
        this.uym.ypw(f2);
    }

    public void setMinAndMaxFrame(String str) {
        this.uym.dg(str);
    }

    public void setMinFrame(int i) {
        this.uym.emc(i);
    }

    public void setMinProgress(float f2) {
        this.uym.emc(f2);
    }

    public void setOutlineMasksAndMattes(boolean z6) {
        this.uym.dg(z6);
    }

    public void setPerformanceTrackingEnabled(boolean z6) {
        this.uym.xq(z6);
    }

    public void setProgress(float f2) {
        emc(f2, true);
    }

    public void setRenderMode(yzg yzgVar) {
        this.uym.emc(yzgVar);
    }

    public void setRepeatCount(int i) {
        this.sz.add(dg.SET_REPEAT_COUNT);
        this.uym.bw(i);
    }

    public void setRepeatMode(int i) {
        this.sz.add(dg.SET_REPEAT_MODE);
        this.uym.dg(i);
    }

    public void setSafeMode(boolean z6) {
        this.uym.ycc(z6);
    }

    public void setSpeed(float f2) {
        this.uym.xq(f2);
    }

    public void setTextDelegate(ul ulVar) {
        this.uym.emc(ulVar);
    }

    public void setUseCompositionFrameRate(boolean z6) {
        this.uym.msw(z6);
    }

    public void setView(View view) {
        this.uym.emc(view);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        zz zzVar;
        if (!this.ru && drawable == (zzVar = this.uym) && zzVar.sra()) {
            ycc();
        } else if (!this.ru && (drawable instanceof zz)) {
            zz zzVar2 = (zz) drawable;
            if (zzVar2.sra()) {
                zzVar2.sf();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    private void aa() {
        this.vk = null;
        this.uym.ru();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cf() {
        this.aa.postDelayed(this.sf, 1000L);
    }

    private void dg(Matrix matrix, float f2, float f5, float f6, float f7) {
        if (f6 >= f2 || f7 >= f5) {
            if (f6 / f7 >= f2 / f5) {
                float f8 = f2 / f6;
                matrix.preScale(f8, f8);
                matrix.postTranslate(0.0f, (f5 - (f7 * f8)) / 2.0f);
                return;
            } else {
                float f9 = f5 / f7;
                matrix.preScale(f9, f9);
                matrix.postTranslate((f2 - (f6 * f9)) / 2.0f, 0.0f);
                return;
            }
        }
        if (f6 / f7 >= f2 / f5) {
            float f10 = f2 / f6;
            matrix.preScale(f10, f10);
            matrix.postTranslate(0.0f, (f5 - (f7 * f10)) / 2.0f);
        } else {
            float f11 = f5 / f7;
            matrix.preScale(f11, f11);
            matrix.postTranslate((f2 - (f6 * f11)) / 2.0f, 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gbl() {
        final uym.emc globalConfig = getGlobalConfig();
        if (globalConfig == null || globalConfig.bw <= 0) {
            return;
        }
        if (TextUtils.isEmpty(globalConfig.ycc) && globalConfig.uym == null) {
            return;
        }
        int maxFrame = globalConfig.bw;
        if (maxFrame > getMaxFrame()) {
            maxFrame = (int) getMaxFrame();
        }
        final float maxFrame2 = maxFrame / getMaxFrame();
        emc(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ypw.ycc.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < maxFrame2) {
                    return;
                }
                ycc.this.ypw(this);
                if (ycc.this.dr != null) {
                    ypw unused = ycc.this.dr;
                }
            }
        });
    }

    private void msw() {
        setSaveEnabled(false);
        this.sup = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        emc(0.0f, false);
        emc(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.uym.emc(Boolean.valueOf(com.bytedance.adsdk.ypw.ycc.ycc.emc(getContext()) != 0.0f));
        zz();
        ru();
        sup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qh() throws NumberFormatException {
        zz zzVar;
        int i;
        int i3;
        final int i6;
        if (this.vk == null || (zzVar = this.uym) == null) {
            return;
        }
        ul ulVarHxp = zzVar.hxp();
        uym.xq xqVarMsw = this.vk.msw();
        if (xqVarMsw == null || ulVarHxp == null) {
            return;
        }
        final int i7 = xqVarMsw.emc;
        if (i7 < 0) {
            Log.i("TMe", "--==--- timer fail, ke is invalid: ".concat(String.valueOf(i7)));
            return;
        }
        int[] iArr = xqVarMsw.bw;
        final int i8 = -1;
        if (iArr == null || iArr.length < 2) {
            i = -1;
            i3 = -1;
        } else {
            i3 = iArr[0];
            i = iArr[1];
        }
        String strEmc = ulVarHxp.emc(xqVarMsw.xq);
        String strEmc2 = ulVarHxp.emc(xqVarMsw.dg);
        try {
            i6 = Integer.parseInt(strEmc);
            try {
                i8 = Integer.parseInt(strEmc2);
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i6 = -1;
        }
        Log.i("TMe", "--==--- prepare timer, startS: " + i6 + ", lenS: " + i8);
        if (TextUtils.isEmpty(xqVarMsw.ypw)) {
            Log.i("TMe", "--==--- timer fail, id is invalid: " + xqVarMsw.ypw);
            return;
        }
        Log.i("TMe", "--==--- timer, id:" + xqVarMsw.ypw);
        com.bytedance.adsdk.ypw.xq.xq.xq xqVarXq = xq(xqVarMsw.ypw);
        if (xqVarXq != null) {
            Log.i("TMe", "--==--- timer success");
            this.db = xqVarMsw.ycc;
            this.sb = xqVarMsw.uym;
            this.ylm = xqVarXq;
            this.sra = i6;
            this.rie = i6 - i8;
            this.hxp = i3;
            this.ee = i;
            StringBuilder sb = new StringBuilder();
            sb.append(this.sra);
            xqVarXq.emc(sb.toString());
            emc(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ypw.ycc.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (ycc.this.getFrame() < i7 - 1 || ycc.this.getFrame() >= i7 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- enter timer point, frame: " + ycc.this.getFrame());
                    ycc.this.ypw(this);
                    if (i6 < 0 || i8 < 0) {
                        Log.i("TMe", "--==--- enter timer callback, NOT start timer");
                    } else {
                        Log.i("TMe", "--==--- enter timer callback, start timer");
                        ycc.this.cf();
                    }
                    ycc.this.ycc();
                }
            });
        }
    }

    private void ru() {
        emc(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ypw.ycc.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) throws NumberFormatException {
                int i;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < 0.98f) {
                    return;
                }
                ycc.bw(ycc.this);
                uym.emc globalConfig = ycc.this.getGlobalConfig();
                if (globalConfig != null && (i = globalConfig.dg) > 0 && i > ycc.this.sba) {
                    ycc.this.qh();
                    ycc.this.emc();
                    ycc.this.setProgress(0.0f);
                } else {
                    ycc.this.ypw(this);
                    if (ycc.this.xmt != null) {
                        emc unused = ycc.this.xmt;
                    }
                }
            }
        });
    }

    private void sba() {
        boolean zDg = dg();
        setImageDrawable(null);
        setImageDrawable(this.uym);
        if (zDg) {
            this.uym.sz();
        }
    }

    private void sup() {
        emc(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.ypw.ycc.11
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ul ulVarHxp;
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - ycc.this.ul;
                ycc.this.ypw(this);
                String playDelayedELExpressTimeS = ycc.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && (ulVarHxp = ycc.this.uym.hxp()) != null) {
                    try {
                        int i = Integer.parseInt(ulVarHxp.emc(playDelayedELExpressTimeS)) * TTAdConstant.STYLE_SIZE_RADIO_1_1;
                        if (ycc.this.ul > 0) {
                            long jElapsedRealtime2 = (ycc.this.ul + i) - SystemClock.elapsedRealtime();
                            Log.i("TMe", "--==-- lottie delayed time: ".concat(String.valueOf(jElapsedRealtime2)));
                            if (jElapsedRealtime2 > 0) {
                                ycc.this.ycc();
                                ycc.this.setVisibility(8);
                                if (ycc.this.yzg == null) {
                                    ycc.this.yzg = new Handler(Looper.getMainLooper());
                                }
                                ycc.this.yzg.removeCallbacksAndMessages(null);
                                ycc.this.yzg.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ypw.ycc.11.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Log.i("TMe", "--==-- lottie real start play");
                                        ycc.this.setVisibility(0);
                                        ycc.this.emc();
                                        ycc.this.emc(jElapsedRealtime);
                                    }
                                }, jElapsedRealtime2);
                                return;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                ycc.this.emc(jElapsedRealtime);
            }
        });
    }

    private void sz() {
        sz<uym> szVar = this.cf;
        if (szVar != null) {
            szVar.ypw(this.xq);
            this.cf.dg(this.dg);
        }
    }

    private void vk() {
        this.aa.removeCallbacksAndMessages(null);
    }

    private void xq(Matrix matrix, float f2, float f5, float f6, float f7) {
        matrix.postTranslate((f2 - f6) / 2.0f, (f5 - f7) / 2.0f);
    }

    private void ypw(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = this.uym.getBounds().width();
        float fHeight = this.uym.getBounds().height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i = AnonymousClass5.emc[getScaleType().ordinal()];
        if (i == 1) {
            emc(matrix, width, height, fWidth, fHeight);
        } else if (i == 2) {
            ypw(matrix, width, height, fWidth, fHeight);
        } else if (i == 3) {
            xq(matrix, width, height, fWidth, fHeight);
        } else if (i == 4) {
            dg(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF, rectF2);
    }

    private void zz() {
        emc(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.ypw.ycc.8
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) throws NumberFormatException {
                ycc.this.ypw(this);
                ycc.this.qh();
                ycc.this.gbl();
            }
        });
    }

    public void bw() {
        this.sz.add(dg.PLAY_OPTION);
        this.uym.sb();
    }

    public void setMaxFrame(String str) {
        this.uym.xq(str);
    }

    public void setMinFrame(String str) {
        this.uym.ypw(str);
    }

    public void ycc() {
        this.gbl = false;
        this.uym.sf();
    }

    private com.bytedance.adsdk.ypw.xq.xq.xq xq(String str) {
        com.bytedance.adsdk.ypw.xq.xq.ypw ypwVarYpw;
        zz zzVar = this.uym;
        if (zzVar == null || (ypwVarYpw = zzVar.ypw()) == null) {
            return null;
        }
        return emc(ypwVarYpw, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(long j6) {
        Map<String, Object> map;
        uym.emc globalConfig = getGlobalConfig();
        if (this.xmt != null) {
            HashMap map2 = new HashMap();
            map2.put("duration", Long.valueOf(j6));
            if (globalConfig == null || (map = globalConfig.ypw) == null || map.isEmpty()) {
                return;
            }
            map2.putAll(globalConfig.ypw);
        }
    }

    public void setAnimation(String str) {
        this.msw = str;
        this.zz = 0;
        setCompositionTask(ypw(str));
    }

    public void xq() {
        this.uym.sba();
    }

    private ru emc(String str) {
        zz zzVar;
        uym uymVarDb;
        Map<String, ru> mapVk;
        if (TextUtils.isEmpty(str) || (zzVar = this.uym) == null || (uymVarDb = zzVar.db()) == null || (mapVk = uymVarDb.vk()) == null) {
            return null;
        }
        return mapVk.get(str);
    }

    public boolean dg() {
        return this.uym.sra();
    }

    private void ypw(Matrix matrix, float f2, float f5, float f6, float f7) {
        if (f6 < f2 && f7 < f5) {
            matrix.postTranslate((f2 - f6) / 2.0f, (f5 - f7) / 2.0f);
            return;
        }
        if (f6 / f7 >= f2 / f5) {
            float f8 = f2 / f6;
            matrix.preScale(f8, f8);
            matrix.postTranslate(0.0f, (f5 - (f7 * f8)) / 2.0f);
        } else {
            float f9 = f5 / f7;
            matrix.preScale(f9, f9);
            matrix.postTranslate((f2 - (f6 * f9)) / 2.0f, 0.0f);
        }
    }

    private void emc(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i = iArr2[0];
            final int i3 = iArr2[1];
            if (i < 0 || i3 < 0) {
                return;
            }
            Log.i("TMe", "--==--- inel enter, play anim, startframe: ".concat(String.valueOf(i)));
            vk();
            emc();
            setFrame(i);
            emc(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.ypw.ycc.12
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (ycc.this.getFrame() < i3 - 1 || ycc.this.getFrame() >= i3 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- inel enter, play anim end, endframe: " + i3 + ", realFrame: " + ycc.this.getFrame());
                    ycc.this.ypw(this);
                    ycc.this.ycc();
                }
            });
        } catch (Throwable unused) {
        }
    }

    private sz<uym> ypw(final String str) {
        if (isInEditMode()) {
            return new sz<>(new Callable<sup<uym>>() { // from class: com.bytedance.adsdk.ypw.ycc.2
                @Override // java.util.concurrent.Callable
                /* renamed from: emc, reason: merged with bridge method [inline-methods] */
                public sup<uym> call() {
                    return ycc.this.sup ? msw.xq(ycc.this.getContext(), str) : msw.xq(ycc.this.getContext(), str, null);
                }
            }, true);
        }
        return this.sup ? msw.ypw(getContext(), str) : msw.ypw(getContext(), str, (String) null);
    }

    public void ypw(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.uym.ypw(animatorUpdateListener);
    }

    private void emc(String str, String str2, JSONArray jSONArray) {
        uym.ypw globalEvent = getGlobalEvent();
        if (globalEvent != null && str != null) {
            if (TextUtils.isEmpty(str2) && !str.contains("CSJNO")) {
                str2 = globalEvent.emc;
            }
            if ((jSONArray == null || jSONArray.length() <= 0) && !str.contains("CSJLELNO")) {
                jSONArray = globalEvent.xq;
            }
        }
        if (!TextUtils.isEmpty(str2) || jSONArray == null) {
            return;
        }
        jSONArray.length();
    }

    public void ypw() {
        this.uym.aa();
    }

    public void ypw(Animator.AnimatorListener animatorListener) {
        this.uym.ypw(animatorListener);
    }

    private com.bytedance.adsdk.ypw.xq.xq.emc emc(MotionEvent motionEvent) {
        com.bytedance.adsdk.ypw.xq.xq.ypw ypwVarYpw;
        zz zzVar = this.uym;
        if (zzVar == null || (ypwVarYpw = zzVar.ypw()) == null) {
            return null;
        }
        return emc(ypwVarYpw, motionEvent);
    }

    private com.bytedance.adsdk.ypw.xq.xq.emc emc(com.bytedance.adsdk.ypw.xq.xq.ypw ypwVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.ypw.xq.xq.emc emcVarEmc;
        for (com.bytedance.adsdk.ypw.xq.xq.emc emcVar : ypwVar.sup()) {
            if (emcVar instanceof com.bytedance.adsdk.ypw.xq.xq.ypw) {
                if (emcVar.msw() && emcVar.ycc() > 0.0f) {
                    RectF rectF = new RectF();
                    emcVar.emc(rectF, emcVar.dg(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (emcVarEmc = emc((com.bytedance.adsdk.ypw.xq.xq.ypw) emcVar, motionEvent)) != null) {
                        return emcVarEmc;
                    }
                }
            } else if (emcVar.msw() && emcVar.ycc() > 0.0f) {
                RectF rectF2 = new RectF();
                zz zzVar = this.uym;
                if (zzVar != null && zzVar.uym()) {
                    emcVar.emc(rectF2, emcVar.dg(), true);
                    RectF rectFXmt = this.uym.xmt();
                    if (rectFXmt != null) {
                        emc(rectF2, rectFXmt);
                    }
                } else {
                    RectF rectF3 = new RectF();
                    emcVar.emc(rectF3, emcVar.dg(), true);
                    ypw(rectF2, rectF3);
                }
                if (emc(motionEvent, rectF2)) {
                    return emcVar;
                }
            }
        }
        return null;
    }

    private boolean emc(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent != null && rectF != null) {
            float x6 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (x6 >= rectF.left && x6 <= rectF.right && y3 >= rectF.top && y3 <= rectF.bottom) {
                return true;
            }
        }
        return false;
    }

    private void emc(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i = AnonymousClass5.emc[getScaleType().ordinal()];
        if (i == 1) {
            emc(matrix, width, height, fWidth, fHeight);
        } else if (i == 2) {
            ypw(matrix, width, height, fWidth, fHeight);
        } else if (i == 3) {
            xq(matrix, width, height, fWidth, fHeight);
        } else if (i == 4) {
            dg(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF);
    }

    private void emc(Matrix matrix, float f2, float f5, float f6, float f7) {
        if (f6 / f7 >= f2 / f5) {
            float f8 = f5 / f7;
            matrix.preScale(f8, f8);
            matrix.postTranslate(-(((f6 * f8) - f2) / 2.0f), 0.0f);
        } else {
            float f9 = f2 / f6;
            matrix.preScale(f9, f9);
            matrix.postTranslate(0.0f, -(((f7 * f9) - f5) / 2.0f));
        }
    }

    public void emc(boolean z6, Context context) {
        this.uym.emc(z6, context);
    }

    private sz<uym> emc(final int i) {
        if (isInEditMode()) {
            return new sz<>(new Callable<sup<uym>>() { // from class: com.bytedance.adsdk.ypw.ycc.13
                @Override // java.util.concurrent.Callable
                /* renamed from: emc, reason: merged with bridge method [inline-methods] */
                public sup<uym> call() {
                    return ycc.this.sup ? msw.ypw(ycc.this.getContext(), i) : msw.ypw(ycc.this.getContext(), i, (String) null);
                }
            }, true);
        }
        return this.sup ? msw.emc(getContext(), i) : msw.emc(getContext(), i, (String) null);
    }

    public void emc(String str, String str2) {
        emc(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void emc(InputStream inputStream, String str) {
        setCompositionTask(msw.emc(inputStream, str));
    }

    private com.bytedance.adsdk.ypw.xq.xq.xq emc(com.bytedance.adsdk.ypw.xq.xq.ypw ypwVar, String str) {
        for (com.bytedance.adsdk.ypw.xq.xq.emc emcVar : ypwVar.sup()) {
            if (emcVar instanceof com.bytedance.adsdk.ypw.xq.xq.ypw) {
                com.bytedance.adsdk.ypw.xq.xq.xq xqVarEmc = emc((com.bytedance.adsdk.ypw.xq.xq.ypw) emcVar, str);
                if (xqVarEmc != null) {
                    return xqVarEmc;
                }
            } else if (TextUtils.equals(str, emcVar.zz()) && (emcVar instanceof com.bytedance.adsdk.ypw.xq.xq.xq)) {
                return (com.bytedance.adsdk.ypw.xq.xq.xq) emcVar;
            }
        }
        return null;
    }

    public void emc() {
        if (this.ul == 0) {
            this.ul = SystemClock.elapsedRealtime();
        }
        this.sz.add(dg.PLAY_OPTION);
        this.uym.gbl();
    }

    public void emc(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.uym.emc(animatorUpdateListener);
    }

    public void emc(Animator.AnimatorListener animatorListener) {
        this.uym.emc(animatorListener);
    }

    public void emc(boolean z6) {
        this.uym.bw(z6 ? -1 : 0);
    }

    public Bitmap emc(String str, Bitmap bitmap) {
        return this.uym.emc(str, bitmap);
    }

    private void emc(float f2, boolean z6) {
        if (z6) {
            this.sz.add(dg.SET_PROGRESS);
        }
        this.uym.dg(f2);
    }
}
