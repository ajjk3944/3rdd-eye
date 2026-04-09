package com.bytedance.sdk.openadsdk.oem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.sf;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.dg.xq;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class IPBroadcastReceiver extends BroadcastReceiver {
    private static volatile IPBroadcastReceiver emc;
    private int dg = 0;
    private emc xq;
    private final LruCache<String, rie> ypw;

    private IPBroadcastReceiver() {
        int i10 = 10;
        int iEmc = com.bytedance.sdk.openadsdk.sra.emc.emc("ip_data_config", "ip_ad_cache_count", 10);
        if (iEmc > 0 && iEmc <= 200) {
            i10 = iEmc;
        }
        this.ypw = new LruCache<>(i10);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        intent.getAction();
        if ("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT".equals(intent.getAction())) {
            emc(intent);
        } else if ("com.oplus.market.intent.action.ADD_APP_STATUS_CHANGED".equals(intent.getAction())) {
            ypw(intent);
        }
    }

    private void ypw(final Intent intent) {
        if (intent == null) {
            return;
        }
        iyl.xq(new msw("ip-oppo") { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    int intExtra = intent.getIntExtra("event_type", 0);
                    final String stringExtra = intent.getStringExtra("event_track");
                    if (intExtra != 7 && intExtra != 9 && stringExtra != null) {
                        final String stringExtra2 = intent.getStringExtra("event_id");
                        final String stringExtra3 = intent.getStringExtra("app_package_name");
                        final String stringExtra4 = intent.getStringExtra("market_version");
                        final String stringExtra5 = intent.getStringExtra("caller");
                        final int iEmc = ypw.emc(intExtra);
                        final int iYpw = ypw.ypw(intExtra);
                        String.format("eventId: %s, eventType: %s, eventTrack: %s, appPackage: %s, marketVersion: %s, caller: %s, errorCode: %s, status: %s", stringExtra2, Integer.valueOf(intExtra), stringExtra, stringExtra3, stringExtra4, stringExtra5, Integer.valueOf(iEmc), Integer.valueOf(iYpw));
                        emc emcVar = IPBroadcastReceiver.this.xq;
                        if (iEmc > 0 && emcVar != null) {
                            emcVar.emc(stringExtra3, iEmc);
                        }
                        final rie rieVarEmc = IPBroadcastReceiver.this.emc(stringExtra3);
                        if (rieVarEmc != null) {
                            xq.emc(System.currentTimeMillis(), rieVarEmc, tp.emc(rieVarEmc), "ip_listener_log", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.2.1
                                @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                                public JSONObject emc() {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("ip_error_code", iEmc);
                                        jSONObject.put("ip_market_version", stringExtra4);
                                        jSONObject.put("ip_app_pkg", stringExtra3);
                                        jSONObject.put("ip_caller_pkg", stringExtra5);
                                        jSONObject.put("ip_event_id", stringExtra2);
                                        jSONObject.put("ip_event_track", stringExtra);
                                        jSONObject.put("ip_status", iYpw);
                                        jSONObject.put("ip_exec_type", IPBroadcastReceiver.this.dg);
                                        rie rieVar = rieVarEmc;
                                        if (rieVar != null) {
                                            jSONObject.put("ip_is_w2a", rieVar.sba());
                                            if (rieVarEmc.au() != null) {
                                                jSONObject.put("ip_oem_type", rieVarEmc.au().ycc());
                                                return jSONObject;
                                            }
                                        }
                                        return jSONObject;
                                    } catch (Throwable th) {
                                        ul.emc("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th);
                                        return null;
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    ul.emc("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th);
                    IPBroadcastReceiver.this.dg = 2;
                }
            }
        });
    }

    public static void ypw(final Context context, final rie rieVar) {
        sf sfVarAu;
        if (emc != null || rieVar == null || (sfVarAu = rieVar.au()) == null) {
            return;
        }
        if (sfVarAu.uym() || sfVarAu.msw()) {
            qh.ypw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        IPBroadcastReceiver.emc(aa.emc(context), rieVar);
                    } catch (Throwable th) {
                        ul.emc("IPMiBroadcastReceiver", "registerBroadcastReceiverAsy error ", th);
                    }
                }
            });
        }
    }

    public void emc(String str, rie rieVar) {
        if (TextUtils.isEmpty(str) || rieVar == null || this.ypw.get(str) != null) {
            return;
        }
        this.ypw.put(str, rieVar);
    }

    public rie emc(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.ypw.get(str);
    }

    public void emc(emc emcVar) {
        this.xq = emcVar;
    }

    public void emc() {
        this.xq = null;
    }

    private void emc(final Intent intent) {
        if (intent == null) {
            return;
        }
        iyl.xq(new msw("ip-mi") { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.1
            @Override // java.lang.Runnable
            public void run() {
                final int i10;
                final int i11;
                final int i12;
                try {
                    int intExtra = 0;
                    final int intExtra2 = intent.getIntExtra("errorCode", 0);
                    if (intExtra2 < 0) {
                        int intExtra3 = intent.getIntExtra("reason", 0);
                        if (intExtra2 == -4 && intExtra3 == -1) {
                            return;
                        } else {
                            i10 = intExtra3;
                        }
                    } else {
                        i10 = 0;
                    }
                    if (intExtra2 == 5) {
                        int intExtra4 = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, 0);
                        if (intExtra4 == -2) {
                            try {
                                intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_PROGRESS, 0);
                            } catch (Throwable unused) {
                                IPBroadcastReceiver.this.dg = 1;
                            }
                            if (intExtra < 100) {
                                return;
                            }
                        }
                        i11 = intExtra4;
                        i12 = intExtra;
                    } else {
                        i11 = 0;
                        i12 = 0;
                    }
                    String stringExtra = intent.getStringExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                    emc emcVar = IPBroadcastReceiver.this.xq;
                    if (intExtra2 > 0 && emcVar != null) {
                        emcVar.emc(stringExtra, intExtra2);
                    }
                    final rie rieVarEmc = IPBroadcastReceiver.this.emc(stringExtra);
                    if (rieVarEmc != null) {
                        xq.emc(System.currentTimeMillis(), rieVarEmc, tp.emc(rieVarEmc), "ip_listener_log", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.1.1
                            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
                            public JSONObject emc() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("ip_error_code", intExtra2);
                                    rie rieVar = rieVarEmc;
                                    if (rieVar != null) {
                                        jSONObject.put("ip_is_w2a", rieVar.sba());
                                    }
                                    int i13 = intExtra2;
                                    if (i13 > 0) {
                                        if (i13 == 5) {
                                            jSONObject.put("ip_status", i11);
                                            jSONObject.put("ip_exec_type", IPBroadcastReceiver.this.dg);
                                        }
                                        if (i11 == -2) {
                                            jSONObject.put("ip_progress", i12);
                                        }
                                    }
                                    if (intExtra2 < 0) {
                                        jSONObject.put("ip_reason", i10);
                                    }
                                    return jSONObject;
                                } catch (Throwable th) {
                                    ul.emc("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th);
                                    return null;
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    ul.emc("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th);
                }
            }
        });
    }

    public static IPBroadcastReceiver emc(Context context, rie rieVar) {
        sf sfVarAu;
        if (com.bytedance.sdk.openadsdk.sra.emc.emc("ip_data_config", "ip_link_listener", 0) == 0 || rieVar == null || (sfVarAu = rieVar.au()) == null) {
            return null;
        }
        if (emc == null) {
            synchronized (IPBroadcastReceiver.class) {
                try {
                    if (emc == null) {
                        emc = new IPBroadcastReceiver();
                        IntentFilter intentFilter = new IntentFilter();
                        if (sfVarAu.uym()) {
                            intentFilter.addAction("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
                        } else if (sfVarAu.msw()) {
                            intentFilter.addAction("com.oplus.market.intent.action.ADD_APP_STATUS_CHANGED");
                        }
                        if (Build.VERSION.SDK_INT >= 34 && tp.ycc(context) >= 34) {
                            context.registerReceiver(emc, intentFilter, 2);
                        } else {
                            context.registerReceiver(emc, intentFilter);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }
}
