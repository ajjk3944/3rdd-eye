package com.bytedance.sdk.component.adexpress.dynamic.fkw;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.fkw.vt;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cf {
    private static final Set<String> ouw = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));
    private static String vt;

    public static String ouw(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split("adx:")) == null || strArrSplit.length < 2) ? "" : strArrSplit[1];
    }

    private static double vt(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString("fontSize"));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static boolean vt() {
        return !TextUtils.isEmpty(vt);
    }

    private static vt.lh ouw(vt.lh lhVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            lhVar.ouw = 0.0f;
            lhVar.vt = 0.0f;
            return lhVar;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = ouw(str);
        }
        if (TextUtils.isEmpty(str3)) {
            lhVar.ouw = 0.0f;
            lhVar.vt = 0.0f;
            return lhVar;
        }
        return ouw(str3, str2);
    }

    private static vt.lh ouw(String str, String str2) {
        vt.lh lhVar = new vt.lh();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] iArrOuw = ouw(str, (float) vt(str2), false);
            int[] iArr = {com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), iArrOuw[0]), com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), iArrOuw[1])};
            lhVar.ouw = iArr[0];
            lhVar.vt = iArr[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) != 0.0d) {
                return lhVar;
            }
            lhVar.vt = 0.0f;
            return lhVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return lhVar;
        }
    }

    public static int[] ouw(String str, float f10, boolean z3) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.yu.ouw());
            textView.setTextSize(f10);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z3) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static String ouw() {
        return vt;
    }

    /* JADX WARN: Removed duplicated region for block: B:225:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0458 A[Catch: Exception -> 0x0469, TryCatch #2 {Exception -> 0x0469, blocks: (B:226:0x044e, B:228:0x0458, B:233:0x0462), top: B:283:0x044e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bytedance.sdk.component.adexpress.dynamic.fkw.vt.lh ouw(java.lang.String r25, java.lang.String r26, java.lang.String r27, boolean r28, boolean r29, int r30, com.bytedance.sdk.component.adexpress.dynamic.yu.pno r31, double r32, int r34, double r35, com.bytedance.sdk.component.adexpress.vt.mwh r37) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.fkw.cf.ouw(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, com.bytedance.sdk.component.adexpress.dynamic.yu.pno, double, int, double, com.bytedance.sdk.component.adexpress.vt.mwh):com.bytedance.sdk.component.adexpress.dynamic.fkw.vt$lh");
    }
}
