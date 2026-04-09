package com.bytedance.sdk.openadsdk.core.sup.xq;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.tp;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public class xq {
    private static boolean dg = false;
    private static SimpleDateFormat emc;
    private final Map<ypw, String> xq;
    private final List<String> ypw;

    public xq(List<String> list, rie rieVar) {
        int iMfx;
        this.ypw = list;
        HashMap map = new HashMap();
        this.xq = map;
        map.put(ypw.CACHEBUSTING, xq());
        map.put(ypw.TIMESTAMP, ypw());
        map.put(ypw.APPBUNDLE, aa.emc().getPackageName());
        ypw ypwVar = ypw.PLAYERSTATE;
        map.put(ypwVar, "");
        if (rieVar != null && ((iMfx = rieVar.mfx()) == 3 || iMfx == 7 || iMfx == 8)) {
            map.put(ypwVar, "fullscreen");
        }
        map.put(ypw.SERVERSIDE, "0");
    }

    private String xq() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    private String ypw() {
        if (emc == null) {
            if (Build.VERSION.SDK_INT >= 24) {
                emc = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.getDefault());
            } else {
                emc = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.getDefault());
                dg = true;
            }
        }
        String str = emc.format(new Date());
        if (!dg) {
            return str;
        }
        int iEe = tp.ee();
        if (iEe < 0) {
            if (iEe > -10) {
                StringBuilder sbB = AbstractC2984e.b(str, "-0");
                sbB.append(-iEe);
                return sbB.toString();
            }
            return str + iEe;
        }
        if (iEe < 10) {
            return str + "+0" + iEe;
        }
        return str + "+" + iEe;
    }

    public List<String> emc() {
        ArrayList arrayList = new ArrayList();
        for (String strReplaceAll : this.ypw) {
            if (!TextUtils.isEmpty(strReplaceAll)) {
                for (ypw ypwVar : ypw.values()) {
                    String str = this.xq.get(ypwVar);
                    if (str == null) {
                        str = "";
                    }
                    strReplaceAll = ypwVar == ypw.__MRC_IMPRESSION_ID__ ? strReplaceAll.replaceAll(ypwVar.name(), str) : strReplaceAll.replaceAll("\\[" + ypwVar.name() + "\\]", str);
                }
                arrayList.add(strReplaceAll);
            }
        }
        return arrayList;
    }

    public xq emc(com.bytedance.sdk.openadsdk.core.sup.emc.emc emcVar) {
        if (emcVar != null) {
            this.xq.put(ypw.ERRORCODE, emcVar.emc());
        }
        return this;
    }

    public xq emc(long j6) {
        if (j6 >= 0) {
            String strYpw = ypw(j6);
            if (!TextUtils.isEmpty(strYpw)) {
                this.xq.put(ypw.CONTENTPLAYHEAD, strYpw);
            }
        }
        return this;
    }

    public xq emc(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.xq.put(ypw.__MRC_IMPRESSION_ID__, str);
        }
        return this;
    }

    public xq ypw(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            this.xq.put(ypw.ASSETURI, str);
        }
        return this;
    }

    private String ypw(long j6) {
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(j6)), Long.valueOf(timeUnit.toMinutes(j6) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j6) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j6 % 1000));
    }
}
