package com.bytedance.sdk.openadsdk.core.sup.xq;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.b;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public class xq {
    private static boolean dg = false;
    private static SimpleDateFormat emc;

    @NonNull
    private final Map<ypw, String> xq;

    @NonNull
    private final List<String> ypw;

    public xq(@NonNull List<String> list, rie rieVar) {
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
            map.put(ypwVar, b.TEMPLATE_TYPE_FULLSCREEN);
        }
        map.put(ypw.SERVERSIDE, MBridgeConstans.ENDCARD_URL_TYPE_PL);
    }

    @NonNull
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
            if (iEe <= -10) {
                return str + iEe;
            }
            return str + "-0" + (-iEe);
        }
        if (iEe < 10) {
            return str + "+0" + iEe;
        }
        return str + Marker.ANY_NON_NULL_MARKER + iEe;
    }

    @NonNull
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

    @NonNull
    public xq emc(@Nullable com.bytedance.sdk.openadsdk.core.sup.emc.emc emcVar) {
        if (emcVar != null) {
            this.xq.put(ypw.ERRORCODE, emcVar.emc());
        }
        return this;
    }

    @NonNull
    public xq emc(@Nullable long j10) {
        if (j10 >= 0) {
            String strYpw = ypw(j10);
            if (!TextUtils.isEmpty(strYpw)) {
                this.xq.put(ypw.CONTENTPLAYHEAD, strYpw);
            }
        }
        return this;
    }

    @NonNull
    public xq ypw(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, C.UTF8_NAME);
            } catch (Throwable unused) {
            }
            this.xq.put(ypw.ASSETURI, str);
        }
        return this;
    }

    public xq emc(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.xq.put(ypw.__MRC_IMPRESSION_ID__, str);
        }
        return this;
    }

    @NonNull
    private String ypw(long j10) {
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(j10)), Long.valueOf(timeUnit.toMinutes(j10) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j10) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j10 % 1000));
    }
}
