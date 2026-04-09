package com.bytedance.sdk.openadsdk.core.ryl.lh;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.uoy;
import i3.e;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {
    private static SimpleDateFormat vt = null;
    private static boolean yu = false;

    /* renamed from: lh, reason: collision with root package name */
    private final List<String> f8400lh;
    public final Map<vt, String> ouw;

    public lh(List<String> list, vpp vppVar) {
        int iUoy;
        this.f8400lh = list;
        HashMap map = new HashMap();
        this.ouw = map;
        map.put(vt.CACHEBUSTING, String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d))));
        vt vtVar = vt.TIMESTAMP;
        if (vt == null) {
            if (Build.VERSION.SDK_INT >= 24) {
                vt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.getDefault());
            } else {
                vt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.getDefault());
                yu = true;
            }
        }
        String string = vt.format(new Date());
        if (yu) {
            int iKsc = uoy.ksc();
            if (iKsc >= 0) {
                if (iKsc < 10) {
                    string = string + "+0" + iKsc;
                } else {
                    string = string + "+" + iKsc;
                }
            } else if (iKsc <= -10) {
                string = string + iKsc;
            } else {
                StringBuilder sbB = e.b(string, "-0");
                sbB.append(-iKsc);
                string = sbB.toString();
            }
        }
        map.put(vtVar, string);
        map.put(vt.APPBUNDLE, zih.ouw().getPackageName());
        vt vtVar2 = vt.PLAYERSTATE;
        map.put(vtVar2, "");
        if (vppVar != null && ((iUoy = vppVar.uoy()) == 3 || iUoy == 7 || iUoy == 8)) {
            map.put(vtVar2, "fullscreen");
        }
        map.put(vt.SERVERSIDE, "0");
    }

    public final List<String> ouw() {
        ArrayList arrayList = new ArrayList();
        for (String strReplaceAll : this.f8400lh) {
            if (!TextUtils.isEmpty(strReplaceAll)) {
                for (vt vtVar : vt.values()) {
                    String str = this.ouw.get(vtVar);
                    if (str == null) {
                        str = "";
                    }
                    strReplaceAll = vtVar == vt.__MRC_IMPRESSION_ID__ ? strReplaceAll.replaceAll(vtVar.name(), str) : strReplaceAll.replaceAll("\\[" + vtVar.name() + "\\]", str);
                }
                arrayList.add(strReplaceAll);
            }
        }
        return arrayList;
    }

    public final lh ouw(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            this.ouw.put(vt.ASSETURI, str);
        }
        return this;
    }

    public static String ouw(long j) {
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(j)), Long.valueOf(timeUnit.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j % 1000));
    }
}
