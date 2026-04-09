package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.applovin.shadow.okio.a;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class zih implements com.bytedance.sdk.openadsdk.mwh.pno {
    public int bly;
    public boolean fkw;

    /* renamed from: le, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.lh.ra f7994le;

    /* renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.component.bly.le f7995lh;
    public final Activity ouw;
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw pno;
    public final AtomicBoolean ra = new AtomicBoolean(false);
    private volatile boolean tlj;
    public final vpp vt;
    public ImageView yu;

    public zih(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.pno = ouwVar;
        this.vt = ouwVar.vt;
        this.ouw = ouwVar.jvy;
    }

    public final void ouw(final int i4, final String str) {
        if (this.tlj) {
            return;
        }
        this.tlj = true;
        if (i4 != Integer.MAX_VALUE) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(new com.bytedance.sdk.component.pno.pno("load_vast_endcard_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.zih.2
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("reason_code", i4);
                        jSONObject.put("error_code", i4);
                        String str2 = str;
                        if (str2 != null) {
                            jSONObject.put("url", str2);
                        }
                        vpp vppVar = zih.this.vt;
                        com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, vppVar.vt(), "load_vast_endcard_fail", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        } else {
            vpp vppVar = this.vt;
            com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, vppVar.vt(), "load_vast_endcard_success", (JSONObject) null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.mwh.pno
    public final void vt(int i4) {
        int i10 = this.bly;
        if (i10 == 0 && i4 > 0) {
            this.vt.cu.ouw.ouw.pno(this.pno.ex.fkw());
        } else if (i10 > 0 && i4 == 0) {
            this.vt.cu.ouw.ouw.ra(this.pno.ex.fkw());
        }
        this.bly = i4;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean ouw(ko koVar) {
        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar;
        com.bytedance.sdk.openadsdk.core.ryl.lh lhVar;
        if (!this.fkw) {
            return false;
        }
        if (this.yu != null && this.ra.get()) {
            this.yu.setVisibility(0);
        } else {
            com.bytedance.sdk.component.bly.le leVar = this.f7995lh;
            if (leVar != null) {
                leVar.setVisibility(0);
                if (this.f7995lh.getWebView() != null) {
                    this.f7995lh.getWebView().setOnTouchListener(this.f7994le);
                }
            }
        }
        vpp vppVar = this.vt;
        if (vppVar == null || (ouwVar = vppVar.cu) == null || (lhVar = ouwVar.f8411lh) == null) {
            return true;
        }
        lhVar.vt(koVar != null ? koVar.fkw() : -1L);
        return true;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw implements com.bytedance.sdk.component.fkw.rn {

        /* renamed from: lh, reason: collision with root package name */
        private final WeakReference<zih> f7997lh;
        private final WeakReference<ImageView> ouw;
        private final String vt;
        private final AtomicBoolean yu;

        public ouw(ImageView imageView, String str, zih zihVar, AtomicBoolean atomicBoolean) {
            this.ouw = new WeakReference<>(imageView);
            this.vt = str;
            this.f7997lh = new WeakReference<>(zihVar);
            this.yu = atomicBoolean;
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
            zih zihVar;
            ImageView imageView = this.ouw.get();
            if (imageView == null || (zihVar = this.f7997lh.get()) == null || cfVar == null) {
                return;
            }
            Object objVt = cfVar.vt();
            if (objVt == null) {
                zihVar.ouw(-1, this.vt);
                return;
            }
            if (objVt instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objVt);
            } else if (objVt instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && a.i(objVt)) {
                    a.c(objVt).start();
                }
                imageView.setImageDrawable((Drawable) objVt);
            }
            this.yu.set(true);
            zihVar.ouw(Integer.MAX_VALUE, null);
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(int i4, String str, Throwable th2) {
            zih zihVar;
            ImageView imageView = this.ouw.get();
            if (imageView == null || (zihVar = this.f7997lh.get()) == null) {
                return;
            }
            imageView.setVisibility(8);
            zihVar.ouw(-2, this.vt);
        }
    }
}
