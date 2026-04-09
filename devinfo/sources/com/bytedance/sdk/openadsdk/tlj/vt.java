package com.bytedance.sdk.openadsdk.tlj;

import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.fkw.cf;
import com.bytedance.sdk.component.fkw.rn;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.bytedance.sdk.openadsdk.utils.uoy;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt<T> implements rn<T> {

    /* renamed from: lh, reason: collision with root package name */
    private final long f8679lh = SystemClock.elapsedRealtime();
    final String ouw;
    final vpp vt;
    private final rn<T> yu;

    public vt(final vpp vppVar, String str, rn<T> rnVar) {
        this.yu = rnVar;
        this.vt = vppVar;
        this.ouw = str;
        if (yu.ouw.ouw) {
            com.bytedance.sdk.openadsdk.vm.lh.ouw(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.tlj.vt.1
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    ouwVar.f8751lh = "load_img";
                    vpp vppVar2 = vppVar;
                    if (vppVar2 != null) {
                        ouwVar.ra = vppVar2.yu("-1");
                        ouwVar.pno = uoy.lh(vppVar.lna);
                    }
                    ouwVar.vt = BuildConfig.VERSION_NAME;
                    return ouwVar;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.fkw.rn
    public final void ouw(cf<T> cfVar) {
        rn<T> rnVar = this.yu;
        if (rnVar != null) {
            rnVar.ouw(cfVar);
        }
        if (this.vt != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8679lh;
            final int iRa = cfVar.ra() / Segment.SHARE_MINIMUM;
            final int i4 = cfVar.le() ? 1 : 0;
            com.bytedance.sdk.openadsdk.rn.lh.ouw("load_image_success", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.tlj.vt.2
                @Override // com.bytedance.sdk.openadsdk.rn.vt
                public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", jElapsedRealtime);
                    jSONObject.put("url", vt.this.ouw);
                    jSONObject.put("preload_size", iRa);
                    jSONObject.put("local_cache", i4);
                    jSONObject.put("image_mode", vt.this.vt.ucs);
                    jSONObject.put("use_new_img", yu.ouw.ouw ? 1 : 0);
                    com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                    yuVar.ouw = "load_image_success";
                    yuVar.yu = vt.this.vt.lna;
                    yuVar.bly = jSONObject.toString();
                    return yuVar;
                }
            });
            if (yu.ouw.ouw) {
                com.bytedance.sdk.openadsdk.vm.lh.vt(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.tlj.vt.3
                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                        ouwVar.f8751lh = "load_img";
                        vpp vppVar = vt.this.vt;
                        if (vppVar != null) {
                            ouwVar.ra = vppVar.yu("-1");
                            ouwVar.pno = uoy.lh(vt.this.vt.lna);
                        }
                        ouwVar.vt = BuildConfig.VERSION_NAME;
                        return ouwVar;
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.component.fkw.rn
    public final void ouw(final int i4, final String str, final Throwable th2) {
        rn<T> rnVar = this.yu;
        if (rnVar != null) {
            rnVar.ouw(i4, str, th2);
        }
        vpp vppVar = this.vt;
        if (vppVar != null) {
            if (!TextUtils.isEmpty(uoy.ouw(vppVar))) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8679lh;
                com.bytedance.sdk.openadsdk.rn.lh.ouw("load_image_error", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.tlj.vt.4
                    @Override // com.bytedance.sdk.openadsdk.rn.vt
                    public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", jElapsedRealtime);
                        jSONObject.put("url", vt.this.ouw);
                        jSONObject.put("error_code", i4);
                        Throwable th3 = th2;
                        if (th3 instanceof NullPointerException) {
                            ApmHelper.reportCustomError("image load fail", "image_load", th3);
                        }
                        jSONObject.put("error_message", str);
                        jSONObject.put("image_mode", vt.this.vt.ucs);
                        jSONObject.put("use_new_img", yu.ouw.ouw ? 1 : 0);
                        com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                        yuVar.ouw = "load_image_error";
                        yuVar.yu = vt.this.vt.lna;
                        yuVar.bly = jSONObject.toString();
                        return yuVar;
                    }
                });
            }
            if (yu.ouw.ouw) {
                com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.tlj.vt.5
                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                        ouwVar.f8751lh = "load_img";
                        vpp vppVar2 = vt.this.vt;
                        if (vppVar2 != null) {
                            ouwVar.ra = vppVar2.yu("-1");
                            ouwVar.pno = uoy.lh(vt.this.vt.lna);
                        }
                        ouwVar.vt = BuildConfig.VERSION_NAME;
                        return ouwVar;
                    }
                });
            }
        }
    }
}
