package com.bytedance.sdk.component.adexpress.dynamic.bw;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.bw.ypw;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class gbl {
    private static final Set<String> emc = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));
    private static String ypw;

    /* JADX WARN: Removed duplicated region for block: B:225:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0457 A[Catch: Exception -> 0x0468, TryCatch #2 {Exception -> 0x0468, blocks: (B:226:0x044b, B:228:0x0457, B:233:0x0461), top: B:281:0x044b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bytedance.sdk.component.adexpress.dynamic.bw.ypw.xq emc(java.lang.String r25, java.lang.String r26, java.lang.String r27, boolean r28, boolean r29, int r30, com.bytedance.sdk.component.adexpress.dynamic.dg.msw r31, double r32, int r34, double r35, java.lang.String r37, com.bytedance.sdk.component.adexpress.ypw.sz r38) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.bw.gbl.emc(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, com.bytedance.sdk.component.adexpress.dynamic.dg.msw, double, int, double, java.lang.String, com.bytedance.sdk.component.adexpress.ypw.sz):com.bytedance.sdk.component.adexpress.dynamic.bw.ypw$xq");
    }

    public static double ypw(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString(TtmlNode.ATTR_TTS_FONT_SIZE));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static int[] ypw(String str, float f10, boolean z10) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.dg.emc());
            textView.setTextSize(f10);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z10) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static boolean ypw() {
        return !TextUtils.isEmpty(ypw);
    }

    public static String emc(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split("adx:")) == null || strArrSplit.length < 2) ? "" : strArrSplit[1];
    }

    private static ypw.xq emc(ypw.xq xqVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            xqVar.emc = 0.0f;
            xqVar.ypw = 0.0f;
            return xqVar;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = emc(str);
        }
        if (TextUtils.isEmpty(str3)) {
            xqVar.emc = 0.0f;
            xqVar.ypw = 0.0f;
            return xqVar;
        }
        return emc(str3, str2);
    }

    public static ypw.xq emc(String str, String str2) {
        return emc(str, str2, false);
    }

    public static ypw.xq emc(String str, String str2, boolean z10) {
        ypw.xq xqVar = new ypw.xq();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] iArrEmc = emc(str, (float) ypw(str2), z10);
            xqVar.emc = iArrEmc[0];
            xqVar.ypw = iArrEmc[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == 0.0d) {
                xqVar.ypw = 0.0f;
            }
        } catch (Exception unused) {
        }
        return xqVar;
    }

    public static int[] emc(String str, float f10, boolean z10) {
        int[] iArrYpw = ypw(str, f10, z10);
        return new int[]{com.bytedance.sdk.component.adexpress.dg.uym.ypw(com.bytedance.sdk.component.adexpress.dg.emc(), iArrYpw[0]), com.bytedance.sdk.component.adexpress.dg.uym.ypw(com.bytedance.sdk.component.adexpress.dg.emc(), iArrYpw[1])};
    }

    public static String emc() {
        return ypw;
    }
}
