package com.bytedance.sdk.openadsdk.th;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.fkw.rn;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.ra.ouw;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.vt.ouw.jg;
import com.bytedance.sdk.component.vt.ouw.ouw.ouw.fkw;
import com.bytedance.sdk.component.vt.ouw.ouw.ouw.tlj;
import com.bytedance.sdk.component.vt.ouw.pno;
import com.bytedance.sdk.component.vt.ouw.ryl;
import com.bytedance.sdk.openadsdk.core.ex;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.multipro.yu.yu;
import com.bytedance.sdk.openadsdk.th.ouw.lh;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class vt {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile vt vt;

    /* renamed from: lh, reason: collision with root package name */
    private lh f8672lh;
    public final com.bytedance.sdk.component.ra.ouw ouw;
    private final Map<String, JSONObject> yu = new HashMap();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class ouw implements pno {
        public ouw() {
        }

        @Override // com.bytedance.sdk.component.vt.ouw.pno
        public final jg ouw(pno.ouw ouwVar) throws IOException {
            JSONObject jSONObjectOuw;
            ryl rylVarOuw = ouwVar.ouw();
            if (rylVarOuw.vt() != null && !rylVarOuw.vt().vt().isEmpty()) {
                List<String> listVt = rylVarOuw.vt().vt();
                StringBuilder sb2 = new StringBuilder();
                for (String str : listVt) {
                    sb2.append("/");
                    sb2.append(str);
                }
                String string = sb2.toString();
                if (!TextUtils.isEmpty(string) && string.equals("/monitor/collect/c/session")) {
                    return ouwVar.ouw(rylVarOuw);
                }
            }
            ryl.ouw ouwVar2 = new ryl.ouw(rylVarOuw);
            String strVt = yu.vt("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!TextUtils.isEmpty(strVt) && (jSONObjectOuw = vt.this.ouw(strVt)) != null) {
                ouwVar2.ouw("transfer-param", jSONObjectOuw.optString(PglCryptUtils.KEY_MESSAGE));
                if (jSONObjectOuw.optInt("cypher") == 4) {
                    ouwVar2.ouw("cypher", "4");
                } else {
                    ouwVar2.ouw("cypher", "3");
                }
            }
            try {
                ouwVar2.ouw("x-pangle-target-idc", cf.vt().lso());
            } catch (Throwable unused) {
                ko.vt("TTNetClient", "add x-pangle-target-idc error");
            }
            return ouwVar.ouw(ouwVar2.ouw());
        }
    }

    private vt() {
        int iYu = yu();
        ouw.C0059ouw c0059ouw = new ouw.C0059ouw();
        long j = iYu;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0059ouw.ouw = ouw.C0059ouw.ouw("timeout", j, timeUnit);
        c0059ouw.vt = ouw.C0059ouw.ouw("timeout", j, timeUnit);
        c0059ouw.f7623lh = ouw.C0059ouw.ouw("timeout", j, timeUnit);
        c0059ouw.yu.add(new ouw());
        com.bytedance.sdk.component.ra.ouw ouwVar = new com.bytedance.sdk.component.ra.ouw(c0059ouw, (byte) 0);
        this.ouw = ouwVar;
        com.bytedance.sdk.component.vt.ouw.ouw.ouw.ouw.ouw = new tlj() { // from class: com.bytedance.sdk.openadsdk.th.vt.1
            @Override // com.bytedance.sdk.component.vt.ouw.ouw.ouw.tlj
            public final ExecutorService ouw() {
                if (cf.vt().jvy()) {
                    return bs.cf();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.vt.ouw.ouw.ouw.tlj
            public final boolean vt() {
                return cf.vt().jvy();
            }
        };
        com.bytedance.sdk.component.ra.ouw.ouw = new fkw() { // from class: com.bytedance.sdk.openadsdk.th.vt.2
            @Override // com.bytedance.sdk.component.vt.ouw.ouw.ouw.fkw
            public final boolean ouw() {
                return com.bytedance.sdk.openadsdk.vpp.ouw.ouw("net_http_protocol", 0) == 1;
            }
        };
        com.bytedance.sdk.component.vt.ouw.yu yuVarOuw = ouwVar.vt.ouw();
        if (yuVarOuw != null) {
            yuVarOuw.ouw();
        }
    }

    private static int yu() {
        try {
            return com.bytedance.sdk.openadsdk.vpp.ouw.ouw("net_time_out", 10000);
        } catch (Throwable unused) {
            return 10000;
        }
    }

    public final lh lh() {
        if (this.f8672lh == null) {
            this.f8672lh = new lh();
        }
        return this.f8672lh;
    }

    public final com.bytedance.sdk.component.ra.ouw vt() {
        return this.ouw;
    }

    public static vt ouw() {
        if (vt == null) {
            synchronized (vt.class) {
                try {
                    if (vt == null) {
                        zih.ouw();
                        vt = new vt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return vt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject ouw(String str) throws JSONException {
        JSONObject jSONObject = this.yu.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ipv6", str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject2, new ex(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        this.yu.put(str, jSONObjectEncryptType4);
        return jSONObjectEncryptType4;
    }

    public final void ouw(String str, View view) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        yu.ouw.ouw(yu.ouw.vt.ouw(str).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw()))).lh(2).ouw(new com.bytedance.sdk.component.fkw.pno() { // from class: com.bytedance.sdk.openadsdk.th.vt.5
            @Override // com.bytedance.sdk.component.fkw.pno
            public final Bitmap ouw(Bitmap bitmap) {
                View view2 = (View) weakReference.get();
                if (view2 == null) {
                    return null;
                }
                return com.bytedance.sdk.component.adexpress.yu.ouw.ouw(view2.getContext(), bitmap, 10);
            }
        }).vt(new rn() { // from class: com.bytedance.sdk.openadsdk.th.vt.4
            @Override // com.bytedance.sdk.component.fkw.rn
            public final void ouw(int i4, String str2, Throwable th2) {
            }

            @Override // com.bytedance.sdk.component.fkw.rn
            public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
                final View view2;
                if (cfVar == null) {
                    return;
                }
                final Object objVt = cfVar.vt();
                if (!(objVt instanceof Bitmap) || (view2 = (View) weakReference.get()) == null) {
                    return;
                }
                if (!bs.le()) {
                    view2.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.th.vt.4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            View view3 = view2;
                            if (view3 instanceof ImageView) {
                                ((ImageView) view3).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) objVt));
                            } else {
                                view3.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) objVt));
                            }
                        }
                    });
                } else if (view2 instanceof ImageView) {
                    ((ImageView) view2).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) objVt));
                } else {
                    view2.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) objVt));
                }
            }
        });
    }

    public static void ouw(String str, int i4, int i10, ImageView imageView, vpp vppVar) {
        yu.ouw.ouw(yu.ouw.vt.ouw(str).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw()))).ouw(i4).vt(i10).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw())).lh(1).vt(com.bytedance.sdk.openadsdk.tlj.lh.ouw(vppVar, str, imageView));
    }

    public final void ouw(int i4, final ImageView imageView, final vpp vppVar) {
        if (vppVar == null || !TextUtils.isEmpty(vppVar.uz)) {
            yu.ouw.ouw(yu.ouw.vt.ouw(vppVar.uz).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw()))).ouw(i4).vt(i4).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw())).lh(1).vt(com.bytedance.sdk.openadsdk.tlj.lh.ouw(vppVar, vppVar.uz, imageView));
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.th.vt.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (imageView.getDrawable() != null) {
                            Intent intent = new Intent();
                            String str = vppVar.jo;
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(Uri.parse(str));
                            try {
                                com.bytedance.sdk.component.utils.vt.ouw(zih.ouw(), intent, null);
                            } catch (Exception unused) {
                            }
                        }
                    }
                });
            }
        }
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.zih zihVar, ImageView imageView, vpp vppVar) {
        if (zihVar == null || TextUtils.isEmpty(zihVar.ouw) || imageView == null) {
            return;
        }
        yu.ouw.ouw(yu.ouw.vt.ouw(zihVar.ouw).ouw(zihVar.vt).vt(zihVar.f8323lh).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw())).ouw(zihVar.f8322le)).lh(1).vt(com.bytedance.sdk.openadsdk.tlj.lh.ouw(vppVar, zihVar.ouw, imageView));
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.zih zihVar, ImageView imageView, vpp vppVar, rn rnVar) {
        if (zihVar == null || TextUtils.isEmpty(zihVar.ouw) || imageView == null) {
            return;
        }
        yu.ouw.ouw(yu.ouw.vt.ouw(zihVar.ouw).ouw(zihVar.vt).vt(zihVar.f8323lh).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw())).ouw(zihVar.f8322le)).lh(1).vt(new com.bytedance.sdk.openadsdk.tlj.vt(vppVar, zihVar.ouw, new com.bytedance.sdk.openadsdk.tlj.lh(imageView, rnVar)));
    }
}
