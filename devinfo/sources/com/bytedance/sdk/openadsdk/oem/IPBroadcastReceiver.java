package com.bytedance.sdk.openadsdk.oem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.jae;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.lh;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class IPBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: lh, reason: collision with root package name */
    private static volatile IPBroadcastReceiver f8598lh;
    public final LruCache<String, vpp> ouw;
    public ouw vt;
    private int yu = 0;

    private IPBroadcastReceiver() {
        int i4 = 10;
        int iOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("ip_data_config", "ip_ad_cache_count", 10);
        if (iOuw > 0 && iOuw <= 200) {
            i4 = iOuw;
        }
        ko.vt("IPMiBroadcastReceiver", "cacheSize=", Integer.valueOf(i4));
        this.ouw = new LruCache<>(i4);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        ko.vt("IPMiBroadcastReceiver", "onReceive action = " + intent.getAction());
        if ("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT".equals(intent.getAction())) {
            ko.vt("IPMiBroadcastReceiver", "handleXiaomiInstallResult start");
            bs.lh(new pno("ip-mi") { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.1
                @Override // java.lang.Runnable
                public final void run() {
                    final int i4;
                    int intExtra;
                    int intExtra2;
                    try {
                        final int intExtra3 = intent.getIntExtra("errorCode", 0);
                        if (intExtra3 < 0) {
                            int intExtra4 = intent.getIntExtra("reason", 0);
                            if (intExtra3 == -4 && intExtra4 == -1) {
                                return;
                            } else {
                                i4 = intExtra4;
                            }
                        } else {
                            i4 = 0;
                        }
                        if (intExtra3 == 5) {
                            intExtra = intent.getIntExtra("status", 0);
                            if (intExtra == -2) {
                                try {
                                    intExtra2 = intent.getIntExtra("progress", 0);
                                } catch (Throwable unused) {
                                    IPBroadcastReceiver.this.yu = 1;
                                    intExtra2 = 0;
                                }
                                if (intExtra2 < 100) {
                                    return;
                                }
                            } else {
                                intExtra2 = 0;
                            }
                        } else {
                            intExtra = 0;
                            intExtra2 = 0;
                        }
                        String stringExtra = intent.getStringExtra("packageName");
                        ouw ouwVar = IPBroadcastReceiver.this.vt;
                        if (intExtra3 > 0 && ouwVar != null) {
                            ouwVar.ouw(stringExtra, intExtra3);
                        }
                        final vpp vppVarOuw = IPBroadcastReceiver.this.ouw(stringExtra);
                        ko.ouw("IPMiBroadcastReceiver", "err_code=", Integer.valueOf(intExtra3), " reason=", Integer.valueOf(i4), " status=", Integer.valueOf(intExtra), " progress=", Integer.valueOf(intExtra2));
                        if (vppVarOuw != null) {
                            final int i10 = intExtra;
                            final int i11 = intExtra2;
                            lh.ouw(System.currentTimeMillis(), vppVarOuw, uoy.ouw(vppVarOuw), "ip_listener_log", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.1.1
                                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                                public final JSONObject ouw() {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("ip_error_code", intExtra3);
                                        vpp vppVar = vppVarOuw;
                                        if (vppVar != null) {
                                            jSONObject.put("ip_is_w2a", vppVar.fkw());
                                        }
                                        int i12 = intExtra3;
                                        if (i12 > 0) {
                                            if (i12 == 5) {
                                                jSONObject.put("ip_status", i10);
                                                jSONObject.put("ip_exec_type", IPBroadcastReceiver.this.yu);
                                            }
                                            if (i10 == -2) {
                                                jSONObject.put("ip_progress", i11);
                                            }
                                        }
                                        if (intExtra3 < 0) {
                                            jSONObject.put("ip_reason", i4);
                                        }
                                        return jSONObject;
                                    } catch (Throwable th2) {
                                        qbp.ouw("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th2);
                                        return null;
                                    }
                                }
                            });
                        }
                    } catch (Throwable th2) {
                        qbp.ouw("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th2);
                    }
                }
            });
        } else if ("com.oplus.market.intent.action.ADD_APP_STATUS_CHANGED".equals(intent.getAction())) {
            ko.vt("IPMiBroadcastReceiver", "handleOppoInstallResult start");
            bs.lh(new pno("ip-oppo") { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        int i4 = 0;
                        int intExtra = intent.getIntExtra("event_type", 0);
                        final String stringExtra = intent.getStringExtra("event_track");
                        int i10 = 7;
                        if (intExtra != 7 && intExtra != 9 && stringExtra != null) {
                            final String stringExtra2 = intent.getStringExtra("event_id");
                            final String stringExtra3 = intent.getStringExtra("app_package_name");
                            final String stringExtra4 = intent.getStringExtra("market_version");
                            final String stringExtra5 = intent.getStringExtra("caller");
                            if (intExtra != 2) {
                                i10 = 3;
                                if (intExtra == 3) {
                                    i10 = 1;
                                } else if (intExtra == 4) {
                                    i10 = 2;
                                } else if (intExtra != 5) {
                                    i10 = intExtra != 6 ? 0 : 4;
                                }
                            }
                            if (intExtra == 8) {
                                i4 = -3;
                            } else if (intExtra == 10) {
                                i4 = -100;
                            } else if (intExtra == 11) {
                                i4 = -101;
                            }
                            ko.vt("IPMiBroadcastReceiver", "eventId: " + stringExtra2 + ", eventType: " + intExtra + ", eventTrack: " + stringExtra + ", appPackage: " + stringExtra3 + ", marketVersion: " + stringExtra4 + ", caller: " + stringExtra5 + ", errorCode: " + i10 + ", status: " + i4);
                            ouw ouwVar = IPBroadcastReceiver.this.vt;
                            if (i10 > 0 && ouwVar != null) {
                                ouwVar.ouw(stringExtra3, i10);
                            }
                            final vpp vppVarOuw = IPBroadcastReceiver.this.ouw(stringExtra3);
                            if (vppVarOuw != null) {
                                final int i11 = i10;
                                final int i12 = i4;
                                lh.ouw(System.currentTimeMillis(), vppVarOuw, uoy.ouw(vppVarOuw), "ip_listener_log", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.2.1
                                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                                    public final JSONObject ouw() {
                                        JSONObject jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("ip_error_code", i11);
                                            jSONObject.put("ip_market_version", stringExtra4);
                                            jSONObject.put("ip_app_pkg", stringExtra3);
                                            jSONObject.put("ip_caller_pkg", stringExtra5);
                                            jSONObject.put("ip_event_id", stringExtra2);
                                            jSONObject.put("ip_event_track", stringExtra);
                                            jSONObject.put("ip_status", i12);
                                            jSONObject.put("ip_exec_type", IPBroadcastReceiver.this.yu);
                                            vpp vppVar = vppVarOuw;
                                            if (vppVar != null) {
                                                jSONObject.put("ip_is_w2a", vppVar.fkw());
                                                jae jaeVar = vppVarOuw.oiz;
                                                if (jaeVar != null) {
                                                    jSONObject.put("ip_oem_type", jaeVar.ouw);
                                                    return jSONObject;
                                                }
                                            }
                                            return jSONObject;
                                        } catch (Throwable th2) {
                                            qbp.ouw("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th2);
                                            return null;
                                        }
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        ko.vt("IPMiBroadcastReceiver", "handleOppoInstallResult eventType= " + intExtra + ", eventTrack = " + stringExtra);
                    } catch (Throwable th2) {
                        qbp.ouw("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th2);
                        IPBroadcastReceiver.this.yu = 2;
                    }
                }
            });
        }
    }

    public static void vt(final Context context, final vpp vppVar) {
        jae jaeVar;
        ko.vt("IPMiBroadcastReceiver", "registerBroadcastReceiverAsy");
        if (f8598lh != null || vppVar == null || (jaeVar = vppVar.oiz) == null) {
            return;
        }
        if (jaeVar.ouw() || jaeVar.vt()) {
            jg.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        IPBroadcastReceiver.ouw(zih.ouw(context), vppVar);
                    } catch (Throwable th2) {
                        qbp.ouw("IPMiBroadcastReceiver", "registerBroadcastReceiverAsy error ", th2);
                    }
                }
            });
        }
    }

    public final vpp ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.ouw.get(str);
    }

    public static IPBroadcastReceiver ouw(Context context, vpp vppVar) {
        jae jaeVar;
        int iOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("ip_data_config", "ip_link_listener", 0);
        ko.ouw("IPMiBroadcastReceiver", "open =", Integer.valueOf(iOuw));
        if (iOuw == 0 || vppVar == null || (jaeVar = vppVar.oiz) == null) {
            return null;
        }
        if (f8598lh == null) {
            synchronized (IPBroadcastReceiver.class) {
                try {
                    if (f8598lh == null) {
                        f8598lh = new IPBroadcastReceiver();
                        IntentFilter intentFilter = new IntentFilter();
                        if (jaeVar.ouw()) {
                            intentFilter.addAction("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
                        } else if (jaeVar.vt()) {
                            intentFilter.addAction("com.oplus.market.intent.action.ADD_APP_STATUS_CHANGED");
                        }
                        if (Build.VERSION.SDK_INT >= 34 && uoy.vt(context) >= 34) {
                            ko.vt("IPMiBroadcastReceiver", "registerBroadcastReceiverAsy sdk 34+ ");
                            context.registerReceiver(f8598lh, intentFilter, 2);
                        } else {
                            ko.vt("IPMiBroadcastReceiver", "registerBroadcastReceiverAsy sdk < 34");
                            context.registerReceiver(f8598lh, intentFilter);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f8598lh;
    }
}
