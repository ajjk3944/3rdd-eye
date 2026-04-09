package com.bytedance.sdk.openadsdk.yzg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.bw.vk;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.uym.emc;
import com.bytedance.sdk.component.ypw.emc.emc.emc.bw;
import com.bytedance.sdk.component.ypw.emc.emc.emc.ru;
import com.bytedance.sdk.component.ypw.emc.msw;
import com.bytedance.sdk.component.ypw.emc.qh;
import com.bytedance.sdk.component.ypw.emc.sup;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.hxp;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.sba;
import com.bytedance.sdk.openadsdk.core.settings.gbl;
import com.bytedance.sdk.openadsdk.multipro.dg.dg;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.bytedance.sdk.openadsdk.yzg.emc.xq;
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

/* loaded from: classes.dex */
public class ypw {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile ypw emc;
    private final Map<String, JSONObject> dg = new HashMap();
    private xq xq;
    private final com.bytedance.sdk.component.uym.emc ypw;

    public class emc implements msw {
        public emc() {
        }

        @Override // com.bytedance.sdk.component.ypw.emc.msw
        public qh emc(msw.emc emcVar) throws IOException {
            JSONObject jSONObjectEmc;
            sup supVarEmc = emcVar.emc();
            if (supVarEmc.ypw() != null && !supVarEmc.ypw().dg().isEmpty()) {
                List<String> listDg = supVarEmc.ypw().dg();
                StringBuilder sb = new StringBuilder();
                for (String str : listDg) {
                    sb.append("/");
                    sb.append(str);
                }
                String string = sb.toString();
                if (!TextUtils.isEmpty(string) && string.equals("/monitor/collect/c/session")) {
                    return emcVar.emc(supVarEmc);
                }
            }
            sup.emc emcVarZz = supVarEmc.zz();
            String strYpw = dg.ypw("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!TextUtils.isEmpty(strYpw) && (jSONObjectEmc = ypw.this.emc(strYpw)) != null) {
                emcVarZz.ypw("transfer-param", jSONObjectEmc.optString(PglCryptUtils.KEY_MESSAGE));
                if (jSONObjectEmc.optInt("cypher") == 4) {
                    emcVarZz.ypw("cypher", "4");
                } else {
                    emcVarZz.ypw("cypher", "3");
                }
            }
            try {
                emcVarZz.ypw("x-pangle-target-idc", gbl.xq().nx());
            } catch (Throwable unused) {
            }
            return emcVar.emc(emcVarZz.ypw());
        }
    }

    private ypw(Context context) {
        int iEmc = emc();
        emc.C0123emc c0123emc = new emc.C0123emc();
        long j10 = iEmc;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.bytedance.sdk.component.uym.emc emcVarEmc = c0123emc.emc(j10, timeUnit).ypw(j10, timeUnit).xq(j10, timeUnit).emc(new emc()).emc(true).emc();
        this.ypw = emcVarEmc;
        com.bytedance.sdk.component.ypw.emc.emc.emc.emc.emc(new ru() { // from class: com.bytedance.sdk.openadsdk.yzg.ypw.1
            @Override // com.bytedance.sdk.component.ypw.emc.emc.emc.ru
            public ExecutorService emc() {
                if (gbl.xq().ej()) {
                    return iyl.gbl();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.ypw.emc.emc.emc.ru
            public boolean ypw() {
                return gbl.xq().ej();
            }
        });
        com.bytedance.sdk.component.uym.emc.emc(new bw() { // from class: com.bytedance.sdk.openadsdk.yzg.ypw.2
            @Override // com.bytedance.sdk.component.ypw.emc.emc.emc.bw
            public boolean emc() {
                return com.bytedance.sdk.openadsdk.sra.emc.emc("net_http_protocol", 0) == 1;
            }
        });
        com.bytedance.sdk.component.ypw.emc.dg dgVarEmc = emcVarEmc.ycc().emc();
        if (dgVarEmc != null) {
            dgVarEmc.emc(32);
        }
    }

    private void bw() {
        if (this.xq == null) {
            this.xq = new xq();
        }
    }

    public static ypw ypw() {
        if (emc == null) {
            synchronized (ypw.class) {
                try {
                    if (emc == null) {
                        emc = new ypw(aa.emc());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    public xq dg() {
        bw();
        return this.xq;
    }

    public com.bytedance.sdk.component.uym.emc xq() {
        return this.ypw;
    }

    public int emc() {
        try {
            return com.bytedance.sdk.openadsdk.sra.emc.emc("net_time_out", 10000);
        } catch (Throwable unused) {
            return 10000;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject emc(String str) throws JSONException {
        JSONObject jSONObject = this.dg.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ipv6", str);
        } catch (JSONException unused) {
        }
        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject2, new hxp(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        this.dg.put(str, jSONObjectEncryptType4);
        return jSONObjectEncryptType4;
    }

    public void emc(String str, int i10, int i11, ImageView imageView, rie rieVar) {
        com.bytedance.sdk.openadsdk.ru.dg.emc(str).emc(i10).ypw(i11).bw(vw.bw(aa.emc())).dg(vw.xq(aa.emc())).xq(1).emc(com.bytedance.sdk.openadsdk.ru.xq.emc(rieVar, str, imageView));
    }

    public void emc(int i10, final ImageView imageView, final rie rieVar) {
        if (rieVar == null || !TextUtils.isEmpty(rieVar.ylm())) {
            com.bytedance.sdk.openadsdk.ru.dg.emc(rieVar.ylm()).emc(i10).ypw(i10).bw(vw.bw(aa.emc())).dg(vw.xq(aa.emc())).xq(1).emc(com.bytedance.sdk.openadsdk.ru.xq.emc(rieVar, rieVar.ylm(), imageView));
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.yzg.ypw.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (imageView.getDrawable() != null) {
                            Intent intent = new Intent();
                            String strSra = rieVar.sra();
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(Uri.parse(strSra));
                            try {
                                com.bytedance.sdk.component.utils.ypw.emc(aa.emc(), intent, null);
                            } catch (Exception unused) {
                            }
                        }
                    }
                });
            }
        }
    }

    public void emc(sba sbaVar, ImageView imageView, rie rieVar) {
        if (sbaVar == null || TextUtils.isEmpty(sbaVar.emc()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ru.dg.emc(sbaVar).xq(1).emc(com.bytedance.sdk.openadsdk.ru.xq.emc(rieVar, sbaVar.emc(), imageView));
    }

    public void emc(sba sbaVar, ImageView imageView, rie rieVar, vk vkVar) {
        if (sbaVar == null || TextUtils.isEmpty(sbaVar.emc()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ru.dg.emc(sbaVar).xq(1).emc(com.bytedance.sdk.openadsdk.ru.xq.emc(rieVar, sbaVar.emc(), imageView, vkVar));
    }

    public void emc(String str, View view) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        com.bytedance.sdk.openadsdk.ru.dg.emc(str).xq(2).emc(new com.bytedance.sdk.component.bw.msw() { // from class: com.bytedance.sdk.openadsdk.yzg.ypw.5
            @Override // com.bytedance.sdk.component.bw.msw
            public Bitmap emc(Bitmap bitmap) {
                View view2 = (View) weakReference.get();
                if (view2 == null) {
                    return null;
                }
                return com.bytedance.sdk.component.adexpress.dg.emc.emc(view2.getContext(), bitmap, 10);
            }
        }).emc(new vk() { // from class: com.bytedance.sdk.openadsdk.yzg.ypw.4
            @Override // com.bytedance.sdk.component.bw.vk
            public void emc(int i10, String str2, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.bw.vk
            public void emc(com.bytedance.sdk.component.bw.gbl gblVar) {
                final View view2;
                if (gblVar == null) {
                    return;
                }
                final Object objYpw = gblVar.ypw();
                if (!(objYpw instanceof Bitmap) || (view2 = (View) weakReference.get()) == null) {
                    return;
                }
                if (!iyl.ycc()) {
                    view2.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yzg.ypw.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            View view3 = view2;
                            if (view3 instanceof ImageView) {
                                ((ImageView) view3).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) objYpw));
                            } else {
                                view3.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) objYpw));
                            }
                        }
                    });
                } else if (view2 instanceof ImageView) {
                    ((ImageView) view2).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) objYpw));
                } else {
                    view2.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) objYpw));
                }
            }
        });
    }
}
