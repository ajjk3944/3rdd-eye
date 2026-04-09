package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class dr {
    private static volatile boolean dg = true;
    private static String emc;
    private static String xq;
    private static String ypw;

    public static class emc extends com.bytedance.sdk.component.msw.msw {
        public static AtomicBoolean emc = new AtomicBoolean(false);
        private static final AtomicLong ypw = new AtomicLong(0);

        public emc(String str, int i) {
            super(str, i);
        }

        public static void emc() {
            if (emc.get()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = ypw;
            if (jCurrentTimeMillis - atomicLong.get() < TTAdConstant.AD_MAX_EVENT_TIME) {
                return;
            }
            atomicLong.set(jCurrentTimeMillis);
            iyl.ypw((com.bytedance.sdk.component.msw.msw) new emc("UpdateSimStatusTask", 5));
        }

        @Override // java.lang.Runnable
        public void run() {
            emc.set(true);
            dr.bw();
            emc.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void bw() {
        String simOperatorName;
        String simOperator;
        String strSubstring;
        if (com.bytedance.sdk.openadsdk.core.aa.emc() == null) {
            return;
        }
        dg = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.aa.emc().getSystemService("phone");
            try {
                int simState = telephonyManager.getSimState();
                if (simState == 0 || simState == 1) {
                    dg = false;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ul.xq("SimUtils", th.getMessage());
            }
            String str = null;
            try {
                simOperatorName = telephonyManager.getSimOperatorName();
            } catch (Throwable unused) {
                simOperatorName = null;
            }
            try {
                simOperator = telephonyManager.getNetworkOperator();
            } catch (Throwable unused2) {
                simOperator = null;
            }
            if (simOperator == null || simOperator.length() < 5) {
                try {
                    simOperator = telephonyManager.getSimOperator();
                } catch (Throwable unused3) {
                }
            }
            if (TextUtils.isEmpty(simOperator) || simOperator.length() <= 4) {
                strSubstring = null;
            } else {
                String strSubstring2 = simOperator.substring(0, 3);
                strSubstring = simOperator.substring(3);
                str = strSubstring2;
            }
            if (!TextUtils.isEmpty(simOperatorName)) {
                emc = simOperatorName;
            }
            if (!TextUtils.isEmpty(str)) {
                ypw = str;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                return;
            }
            xq = strSubstring;
        } catch (Throwable unused4) {
        }
    }

    public static String emc() {
        emc.emc();
        return emc;
    }

    public static String xq() {
        emc.emc();
        return xq;
    }

    public static String ypw() {
        try {
            emc.emc();
            if (!dg) {
                StringBuilder sb = new StringBuilder("getMCC");
                sb.append(dg ? "Have SIM card" : "No SIM card, MCC returns null");
                com.bytedance.sdk.component.utils.ul.xq("MCC", sb.toString());
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.aa.emc().getResources().getConfiguration();
            int i = configuration.mcc;
            String strValueOf = i != 0 ? String.valueOf(i) : ypw;
            com.bytedance.sdk.component.utils.ul.xq("MCC", "config=" + configuration.mcc + ",sMCC=" + ypw);
            return strValueOf;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("SimUtils", th.getMessage());
            return null;
        }
    }
}
