package com.bytedance.sdk.openadsdk.core;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.core.model.fkw;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl.ouw.vt;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        public String ouw;
        public int vt;

        public ouw(String str, int i4) {
            this.ouw = str;
            this.vt = i4;
        }
    }

    private static FilterWord lh(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString(FacebookMediationAdapter.KEY_ID));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                    FilterWord filterWordLh = lh(jSONArrayOptJSONArray.optJSONObject(i4));
                    if (filterWordLh != null && filterWordLh.isValid()) {
                        filterWord.addOption(filterWordLh);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ab A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:5:0x0008, B:8:0x004b, B:10:0x0062, B:12:0x006b, B:17:0x0076, B:19:0x007c, B:24:0x0095, B:170:0x0273, B:172:0x0281, B:175:0x028c, B:177:0x029a, B:181:0x02a4, B:182:0x02a7, B:188:0x02be, B:171:0x027d, B:184:0x02b0, B:186:0x02b8, B:187:0x02ba, B:26:0x009c, B:28:0x00aa, B:31:0x00b5, B:33:0x00bb, B:35:0x00bf, B:37:0x00c3, B:38:0x00c7, B:39:0x00ca, B:42:0x00d2, B:46:0x00dd, B:49:0x00e7, B:50:0x00ed, B:52:0x00f2, B:67:0x010c, B:80:0x0138, B:71:0x0119, B:75:0x0128, B:81:0x013d, B:83:0x0147, B:84:0x014c, B:86:0x0156, B:88:0x0160, B:90:0x016a, B:92:0x0170, B:101:0x0182, B:113:0x01a6, B:105:0x018b, B:108:0x0196, B:115:0x01ab, B:117:0x01b1, B:119:0x01b9, B:122:0x01c6, B:124:0x01d0, B:126:0x01dc, B:164:0x0260, B:135:0x01ee, B:137:0x01f2, B:138:0x01fc, B:140:0x0204, B:142:0x020c, B:143:0x0216, B:145:0x021e, B:147:0x0226, B:149:0x022e, B:150:0x0235, B:152:0x023b, B:154:0x0243, B:166:0x0267, B:189:0x02c4, B:191:0x02c8, B:194:0x02cf, B:197:0x02de, B:199:0x02e4, B:202:0x02eb, B:204:0x02f2, B:206:0x02f8, B:208:0x02ff, B:210:0x030a, B:211:0x030c, B:213:0x0316, B:216:0x0320, B:217:0x0323, B:218:0x0329, B:220:0x032e, B:222:0x0334, B:223:0x033f), top: B:227:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c6 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:5:0x0008, B:8:0x004b, B:10:0x0062, B:12:0x006b, B:17:0x0076, B:19:0x007c, B:24:0x0095, B:170:0x0273, B:172:0x0281, B:175:0x028c, B:177:0x029a, B:181:0x02a4, B:182:0x02a7, B:188:0x02be, B:171:0x027d, B:184:0x02b0, B:186:0x02b8, B:187:0x02ba, B:26:0x009c, B:28:0x00aa, B:31:0x00b5, B:33:0x00bb, B:35:0x00bf, B:37:0x00c3, B:38:0x00c7, B:39:0x00ca, B:42:0x00d2, B:46:0x00dd, B:49:0x00e7, B:50:0x00ed, B:52:0x00f2, B:67:0x010c, B:80:0x0138, B:71:0x0119, B:75:0x0128, B:81:0x013d, B:83:0x0147, B:84:0x014c, B:86:0x0156, B:88:0x0160, B:90:0x016a, B:92:0x0170, B:101:0x0182, B:113:0x01a6, B:105:0x018b, B:108:0x0196, B:115:0x01ab, B:117:0x01b1, B:119:0x01b9, B:122:0x01c6, B:124:0x01d0, B:126:0x01dc, B:164:0x0260, B:135:0x01ee, B:137:0x01f2, B:138:0x01fc, B:140:0x0204, B:142:0x020c, B:143:0x0216, B:145:0x021e, B:147:0x0226, B:149:0x022e, B:150:0x0235, B:152:0x023b, B:154:0x0243, B:166:0x0267, B:189:0x02c4, B:191:0x02c8, B:194:0x02cf, B:197:0x02de, B:199:0x02e4, B:202:0x02eb, B:204:0x02f2, B:206:0x02f8, B:208:0x02ff, B:210:0x030a, B:211:0x030c, B:213:0x0316, B:216:0x0320, B:217:0x0323, B:218:0x0329, B:220:0x032e, B:222:0x0334, B:223:0x033f), top: B:227:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0235 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:5:0x0008, B:8:0x004b, B:10:0x0062, B:12:0x006b, B:17:0x0076, B:19:0x007c, B:24:0x0095, B:170:0x0273, B:172:0x0281, B:175:0x028c, B:177:0x029a, B:181:0x02a4, B:182:0x02a7, B:188:0x02be, B:171:0x027d, B:184:0x02b0, B:186:0x02b8, B:187:0x02ba, B:26:0x009c, B:28:0x00aa, B:31:0x00b5, B:33:0x00bb, B:35:0x00bf, B:37:0x00c3, B:38:0x00c7, B:39:0x00ca, B:42:0x00d2, B:46:0x00dd, B:49:0x00e7, B:50:0x00ed, B:52:0x00f2, B:67:0x010c, B:80:0x0138, B:71:0x0119, B:75:0x0128, B:81:0x013d, B:83:0x0147, B:84:0x014c, B:86:0x0156, B:88:0x0160, B:90:0x016a, B:92:0x0170, B:101:0x0182, B:113:0x01a6, B:105:0x018b, B:108:0x0196, B:115:0x01ab, B:117:0x01b1, B:119:0x01b9, B:122:0x01c6, B:124:0x01d0, B:126:0x01dc, B:164:0x0260, B:135:0x01ee, B:137:0x01f2, B:138:0x01fc, B:140:0x0204, B:142:0x020c, B:143:0x0216, B:145:0x021e, B:147:0x0226, B:149:0x022e, B:150:0x0235, B:152:0x023b, B:154:0x0243, B:166:0x0267, B:189:0x02c4, B:191:0x02c8, B:194:0x02cf, B:197:0x02de, B:199:0x02e4, B:202:0x02eb, B:204:0x02f2, B:206:0x02f8, B:208:0x02ff, B:210:0x030a, B:211:0x030c, B:213:0x0316, B:216:0x0320, B:217:0x0323, B:218:0x0329, B:220:0x032e, B:222:0x0334, B:223:0x033f), top: B:227:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0260 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:5:0x0008, B:8:0x004b, B:10:0x0062, B:12:0x006b, B:17:0x0076, B:19:0x007c, B:24:0x0095, B:170:0x0273, B:172:0x0281, B:175:0x028c, B:177:0x029a, B:181:0x02a4, B:182:0x02a7, B:188:0x02be, B:171:0x027d, B:184:0x02b0, B:186:0x02b8, B:187:0x02ba, B:26:0x009c, B:28:0x00aa, B:31:0x00b5, B:33:0x00bb, B:35:0x00bf, B:37:0x00c3, B:38:0x00c7, B:39:0x00ca, B:42:0x00d2, B:46:0x00dd, B:49:0x00e7, B:50:0x00ed, B:52:0x00f2, B:67:0x010c, B:80:0x0138, B:71:0x0119, B:75:0x0128, B:81:0x013d, B:83:0x0147, B:84:0x014c, B:86:0x0156, B:88:0x0160, B:90:0x016a, B:92:0x0170, B:101:0x0182, B:113:0x01a6, B:105:0x018b, B:108:0x0196, B:115:0x01ab, B:117:0x01b1, B:119:0x01b9, B:122:0x01c6, B:124:0x01d0, B:126:0x01dc, B:164:0x0260, B:135:0x01ee, B:137:0x01f2, B:138:0x01fc, B:140:0x0204, B:142:0x020c, B:143:0x0216, B:145:0x021e, B:147:0x0226, B:149:0x022e, B:150:0x0235, B:152:0x023b, B:154:0x0243, B:166:0x0267, B:189:0x02c4, B:191:0x02c8, B:194:0x02cf, B:197:0x02de, B:199:0x02e4, B:202:0x02eb, B:204:0x02f2, B:206:0x02f8, B:208:0x02ff, B:210:0x030a, B:211:0x030c, B:213:0x0316, B:216:0x0320, B:217:0x0323, B:218:0x0329, B:220:0x032e, B:222:0x0334, B:223:0x033f), top: B:227:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:5:0x0008, B:8:0x004b, B:10:0x0062, B:12:0x006b, B:17:0x0076, B:19:0x007c, B:24:0x0095, B:170:0x0273, B:172:0x0281, B:175:0x028c, B:177:0x029a, B:181:0x02a4, B:182:0x02a7, B:188:0x02be, B:171:0x027d, B:184:0x02b0, B:186:0x02b8, B:187:0x02ba, B:26:0x009c, B:28:0x00aa, B:31:0x00b5, B:33:0x00bb, B:35:0x00bf, B:37:0x00c3, B:38:0x00c7, B:39:0x00ca, B:42:0x00d2, B:46:0x00dd, B:49:0x00e7, B:50:0x00ed, B:52:0x00f2, B:67:0x010c, B:80:0x0138, B:71:0x0119, B:75:0x0128, B:81:0x013d, B:83:0x0147, B:84:0x014c, B:86:0x0156, B:88:0x0160, B:90:0x016a, B:92:0x0170, B:101:0x0182, B:113:0x01a6, B:105:0x018b, B:108:0x0196, B:115:0x01ab, B:117:0x01b1, B:119:0x01b9, B:122:0x01c6, B:124:0x01d0, B:126:0x01dc, B:164:0x0260, B:135:0x01ee, B:137:0x01f2, B:138:0x01fc, B:140:0x0204, B:142:0x020c, B:143:0x0216, B:145:0x021e, B:147:0x0226, B:149:0x022e, B:150:0x0235, B:152:0x023b, B:154:0x0243, B:166:0x0267, B:189:0x02c4, B:191:0x02c8, B:194:0x02cf, B:197:0x02de, B:199:0x02e4, B:202:0x02eb, B:204:0x02f2, B:206:0x02f8, B:208:0x02ff, B:210:0x030a, B:211:0x030c, B:213:0x0316, B:216:0x0320, B:217:0x0323, B:218:0x0329, B:220:0x032e, B:222:0x0334, B:223:0x033f), top: B:227:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010c A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:5:0x0008, B:8:0x004b, B:10:0x0062, B:12:0x006b, B:17:0x0076, B:19:0x007c, B:24:0x0095, B:170:0x0273, B:172:0x0281, B:175:0x028c, B:177:0x029a, B:181:0x02a4, B:182:0x02a7, B:188:0x02be, B:171:0x027d, B:184:0x02b0, B:186:0x02b8, B:187:0x02ba, B:26:0x009c, B:28:0x00aa, B:31:0x00b5, B:33:0x00bb, B:35:0x00bf, B:37:0x00c3, B:38:0x00c7, B:39:0x00ca, B:42:0x00d2, B:46:0x00dd, B:49:0x00e7, B:50:0x00ed, B:52:0x00f2, B:67:0x010c, B:80:0x0138, B:71:0x0119, B:75:0x0128, B:81:0x013d, B:83:0x0147, B:84:0x014c, B:86:0x0156, B:88:0x0160, B:90:0x016a, B:92:0x0170, B:101:0x0182, B:113:0x01a6, B:105:0x018b, B:108:0x0196, B:115:0x01ab, B:117:0x01b1, B:119:0x01b9, B:122:0x01c6, B:124:0x01d0, B:126:0x01dc, B:164:0x0260, B:135:0x01ee, B:137:0x01f2, B:138:0x01fc, B:140:0x0204, B:142:0x020c, B:143:0x0216, B:145:0x021e, B:147:0x0226, B:149:0x022e, B:150:0x0235, B:152:0x023b, B:154:0x0243, B:166:0x0267, B:189:0x02c4, B:191:0x02c8, B:194:0x02cf, B:197:0x02de, B:199:0x02e4, B:202:0x02eb, B:204:0x02f2, B:206:0x02f8, B:208:0x02ff, B:210:0x030a, B:211:0x030c, B:213:0x0316, B:216:0x0320, B:217:0x0323, B:218:0x0329, B:220:0x032e, B:222:0x0334, B:223:0x033f), top: B:227:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013d A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:5:0x0008, B:8:0x004b, B:10:0x0062, B:12:0x006b, B:17:0x0076, B:19:0x007c, B:24:0x0095, B:170:0x0273, B:172:0x0281, B:175:0x028c, B:177:0x029a, B:181:0x02a4, B:182:0x02a7, B:188:0x02be, B:171:0x027d, B:184:0x02b0, B:186:0x02b8, B:187:0x02ba, B:26:0x009c, B:28:0x00aa, B:31:0x00b5, B:33:0x00bb, B:35:0x00bf, B:37:0x00c3, B:38:0x00c7, B:39:0x00ca, B:42:0x00d2, B:46:0x00dd, B:49:0x00e7, B:50:0x00ed, B:52:0x00f2, B:67:0x010c, B:80:0x0138, B:71:0x0119, B:75:0x0128, B:81:0x013d, B:83:0x0147, B:84:0x014c, B:86:0x0156, B:88:0x0160, B:90:0x016a, B:92:0x0170, B:101:0x0182, B:113:0x01a6, B:105:0x018b, B:108:0x0196, B:115:0x01ab, B:117:0x01b1, B:119:0x01b9, B:122:0x01c6, B:124:0x01d0, B:126:0x01dc, B:164:0x0260, B:135:0x01ee, B:137:0x01f2, B:138:0x01fc, B:140:0x0204, B:142:0x020c, B:143:0x0216, B:145:0x021e, B:147:0x0226, B:149:0x022e, B:150:0x0235, B:152:0x023b, B:154:0x0243, B:166:0x0267, B:189:0x02c4, B:191:0x02c8, B:194:0x02cf, B:197:0x02de, B:199:0x02e4, B:202:0x02eb, B:204:0x02f2, B:206:0x02f8, B:208:0x02ff, B:210:0x030a, B:211:0x030c, B:213:0x0316, B:216:0x0320, B:217:0x0323, B:218:0x0329, B:220:0x032e, B:222:0x0334, B:223:0x033f), top: B:227:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0156 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:5:0x0008, B:8:0x004b, B:10:0x0062, B:12:0x006b, B:17:0x0076, B:19:0x007c, B:24:0x0095, B:170:0x0273, B:172:0x0281, B:175:0x028c, B:177:0x029a, B:181:0x02a4, B:182:0x02a7, B:188:0x02be, B:171:0x027d, B:184:0x02b0, B:186:0x02b8, B:187:0x02ba, B:26:0x009c, B:28:0x00aa, B:31:0x00b5, B:33:0x00bb, B:35:0x00bf, B:37:0x00c3, B:38:0x00c7, B:39:0x00ca, B:42:0x00d2, B:46:0x00dd, B:49:0x00e7, B:50:0x00ed, B:52:0x00f2, B:67:0x010c, B:80:0x0138, B:71:0x0119, B:75:0x0128, B:81:0x013d, B:83:0x0147, B:84:0x014c, B:86:0x0156, B:88:0x0160, B:90:0x016a, B:92:0x0170, B:101:0x0182, B:113:0x01a6, B:105:0x018b, B:108:0x0196, B:115:0x01ab, B:117:0x01b1, B:119:0x01b9, B:122:0x01c6, B:124:0x01d0, B:126:0x01dc, B:164:0x0260, B:135:0x01ee, B:137:0x01f2, B:138:0x01fc, B:140:0x0204, B:142:0x020c, B:143:0x0216, B:145:0x021e, B:147:0x0226, B:149:0x022e, B:150:0x0235, B:152:0x023b, B:154:0x0243, B:166:0x0267, B:189:0x02c4, B:191:0x02c8, B:194:0x02cf, B:197:0x02de, B:199:0x02e4, B:202:0x02eb, B:204:0x02f2, B:206:0x02f8, B:208:0x02ff, B:210:0x030a, B:211:0x030c, B:213:0x0316, B:216:0x0320, B:217:0x0323, B:218:0x0329, B:220:0x032e, B:222:0x0334, B:223:0x033f), top: B:227:0x0008 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<com.bytedance.sdk.openadsdk.core.model.ouw, java.util.ArrayList<java.lang.Integer>> ouw(org.json.JSONObject r20, com.bytedance.sdk.openadsdk.AdSlot r21, com.bytedance.sdk.openadsdk.core.model.ksc r22) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.vt.ouw(org.json.JSONObject, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.model.ksc):android.util.Pair");
    }

    private static com.bytedance.sdk.openadsdk.core.cf.pno.ouw vt(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.cf.pno.ouw();
        ouwVar.ouw = jSONObject.optString(FacebookMediationAdapter.KEY_ID);
        ouwVar.vt = jSONObject.optString("md5");
        ouwVar.f8158lh = jSONObject.optString("url");
        return ouwVar;
    }

    private static Map<String, Object> yu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next)) {
                map.put(next, jSONObject.opt(next));
            }
        }
        return map;
    }

    public static com.bytedance.sdk.openadsdk.core.model.vpp ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return ouw(jSONObject, null, null, null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v54 */
    public static com.bytedance.sdk.openadsdk.core.model.vpp ouw(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ksc kscVar, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, int i4) throws JSONException {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
        ?? r52;
        int i10;
        AdSlot adSlot2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        JSONObject jSONObject2;
        com.bytedance.sdk.openadsdk.core.model.le leVar;
        String str7;
        com.bytedance.sdk.openadsdk.core.model.ryl rylVar;
        c cVar;
        c cVarOuw;
        int i11;
        int iYu;
        int iLe;
        Pair pair;
        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar2;
        vt.ouw ouwVar3;
        String str8;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar2;
        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar4;
        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar5;
        com.bytedance.sdk.openadsdk.core.model.fkw fkwVar;
        ArrayList<fkw.ouw> arrayList;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar6;
        com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVar7;
        JSONObject jSONObjectOptJSONObject3;
        if (jSONObject == 0) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar3 = new com.bytedance.sdk.openadsdk.core.model.vpp();
        if (ouwVar != null) {
            vppVar3.vm = ouwVar;
            if (ouwVar.yu()) {
                int iOptInt = jSONObject.optInt("interaction_method");
                if (iOptInt != 30 && iOptInt != 39 && iOptInt != 40 && iOptInt != 41 && iOptInt != 43 && iOptInt != 44) {
                    ouwVar.bly = 0;
                    vppVar3.tpk = false;
                } else {
                    vppVar3.tpk = true;
                }
            }
        }
        vppVar3.jqy = i4;
        int iOptInt2 = jSONObject.optInt("iv_skip_time", -1);
        int iOptInt3 = jSONObject.optInt("rv_skip_time", -1);
        if (iOptInt2 != -1) {
            vppVar3.yu(iOptInt2);
        }
        if (iOptInt3 != -1) {
            vppVar3.fkw(iOptInt3);
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("multi_ad_scene");
        if (jSONObjectOptJSONObject4 != null) {
            vppVar3.ccd = com.bytedance.sdk.openadsdk.core.model.tc.ouw(jSONObjectOptJSONObject4);
        }
        if (jSONObject.has("raw_response_info")) {
            vppVar3.bo = jSONObject.optString("raw_response_info");
        }
        vppVar3.myk = jSONObject.optInt("proportion_watching", -1);
        vppVar3.zn = jSONObject.optBoolean("mate_disable_cache", false);
        vppVar3.f8305pd = jSONObject.optInt("interaction_type");
        vppVar3.f8293ej = jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.vpp.yu, 0);
        vppVar3.uy = jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.vpp.f8288lh, 0);
        vppVar3.jcd = jSONObject.optInt(com.bytedance.sdk.openadsdk.core.model.vpp.fkw, 0);
        vppVar3.osn = jSONObject.optString("target_url");
        vppVar3.pv = jSONObject.optString("ad_id");
        vppVar3.yib = jSONObject.optString("app_log_url");
        vppVar3.mwh = jSONObject.optString("settings_url");
        vppVar3.f8315vh = jSONObject.optString("source");
        vppVar3.f8312ub = jSONObject.optString("app_name");
        vppVar3.f8302ng = jSONObject.optInt("dislike_control", 0);
        vppVar3.mwe = jSONObject.optInt("play_bar_show_time", AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES);
        vppVar3.f8298ki = jSONObject.optString("gecko_id");
        double d10 = 1.0d;
        if (jSONObject.has("set_click_type")) {
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("set_click_type");
            double dOptDouble = jSONObjectOptJSONObject5.optDouble("cta", 2.0d);
            if (dOptDouble != 2.0d && dOptDouble != 1.0d) {
                vppVar3.lai = 2;
            } else {
                vppVar3.lai = (int) dOptDouble;
            }
            double dOptDouble2 = jSONObjectOptJSONObject5.optDouble("other", 1.0d);
            if (dOptDouble2 != 2.0d && dOptDouble2 != 1.0d) {
                vppVar3.ajl = 1;
            } else {
                vppVar3.ajl = (int) dOptDouble2;
            }
        }
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("extension");
        vppVar3.hsa = jSONObjectOptJSONObject6;
        if (jSONObjectOptJSONObject6 != null) {
            vppVar3.f8289ak = new com.bytedance.sdk.openadsdk.core.model.rn(jSONObjectOptJSONObject6);
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("icon");
        vppVar3.odc = jSONObject.optBoolean("screenshot", false);
        vppVar3.qld = jSONObject.optInt("play_bar_style", 0);
        vppVar3.lgp = jSONObject.optString("market_url", "");
        vppVar3.wbf = jSONObject.optInt("video_adaptation", 0);
        vppVar3.ln = jSONObject.optInt("feed_video_opentype", 0);
        vppVar3.qni = jSONObject.optJSONObject("session_params");
        JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("dynamic_configs");
        vppVar3.smu = jSONObjectOptJSONObject8;
        if (jSONObjectOptJSONObject8 == null || (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject8.optJSONObject("speed_config")) == null) {
            vppVar = vppVar3;
            r52 = 0;
        } else {
            com.bytedance.sdk.openadsdk.core.model.cd cdVar = new com.bytedance.sdk.openadsdk.core.model.cd();
            cdVar.ouw = (float) jSONObjectOptJSONObject3.optDouble("speed", 1.0d);
            r52 = 0;
            cdVar.vt = jSONObjectOptJSONObject3.optInt("type", 0);
            vppVar = vppVar3;
            vppVar.f8311tj = cdVar;
        }
        vppVar.ehk = jSONObject.optString("auction_price", "");
        vppVar.f8307rh = jSONObject.optInt("mrc_report", r52);
        if (jSONObject.optBoolean("isMrcReportFinish", r52)) {
            i10 = 1;
            vppVar.vrp = true;
        } else {
            i10 = 1;
        }
        JSONObject jSONObjectOptJSONObject9 = jSONObject.optJSONObject("render");
        if (jSONObjectOptJSONObject9 != 0) {
            vppVar.kfa = jSONObjectOptJSONObject9.optInt("render_sequence", r52);
            vppVar.yw = jSONObjectOptJSONObject9.optInt("backup_render_control", i10);
            vppVar.f8313uj = Math.max((int) r52, jSONObjectOptJSONObject9.optInt("reserve_time", 100));
            vppVar.lk = jSONObjectOptJSONObject9.optInt("render_thread", r52);
        }
        vppVar.zvq = jSONObject.optInt("render_control", kscVar != null ? kscVar.bly : 1);
        if (jSONObjectOptJSONObject7 != null) {
            com.bytedance.sdk.openadsdk.core.model.zih zihVar = new com.bytedance.sdk.openadsdk.core.model.zih();
            zihVar.ouw = jSONObjectOptJSONObject7.optString("url");
            zihVar.f8323lh = jSONObjectOptJSONObject7.optInt("height");
            zihVar.vt = jSONObjectOptJSONObject7.optInt("width");
            vppVar.ouw(zihVar);
        }
        JSONObject jSONObjectOptJSONObject10 = jSONObject.optJSONObject("reward_data");
        if (jSONObjectOptJSONObject10 != null) {
            vppVar.xdk = jSONObjectOptJSONObject10.optInt("reward_amount", 0);
            vppVar.mt = jSONObjectOptJSONObject10.optString("reward_name", "");
        }
        JSONObject jSONObjectOptJSONObject11 = jSONObject.optJSONObject("cover_image");
        if (jSONObjectOptJSONObject11 != null) {
            com.bytedance.sdk.openadsdk.core.model.zih zihVar2 = new com.bytedance.sdk.openadsdk.core.model.zih();
            zihVar2.ouw = jSONObjectOptJSONObject11.optString("url");
            zihVar2.f8323lh = jSONObjectOptJSONObject11.optInt("height");
            zihVar2.vt = jSONObjectOptJSONObject11.optInt("width");
            vppVar.uoy = zihVar2;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
        if (jSONArrayOptJSONArray != null) {
            int i12 = 0;
            while (i12 < jSONArrayOptJSONArray.length()) {
                com.bytedance.sdk.openadsdk.core.model.zih zihVar3 = new com.bytedance.sdk.openadsdk.core.model.zih();
                JSONObject jSONObjectOptJSONObject12 = jSONArrayOptJSONArray.optJSONObject(i12);
                zihVar3.ouw = jSONObjectOptJSONObject12.optString("url");
                zihVar3.f8323lh = jSONObjectOptJSONObject12.optInt("height");
                zihVar3.vt = jSONObjectOptJSONObject12.optInt("width");
                zihVar3.fkw = jSONObjectOptJSONObject12.optBoolean("image_preview");
                zihVar3.f8322le = jSONObjectOptJSONObject12.optString("image_key");
                vppVar.tc.add(zihVar3);
                i12++;
                d10 = d10;
            }
        }
        double d11 = d10;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("show_url");
        if (jSONArrayOptJSONArray2 != null) {
            for (int i13 = 0; i13 < jSONArrayOptJSONArray2.length(); i13++) {
                vppVar.rrs.add(jSONArrayOptJSONArray2.optString(i13));
            }
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("click_url");
        if (jSONArrayOptJSONArray3 != null) {
            for (int i14 = 0; i14 < jSONArrayOptJSONArray3.length(); i14++) {
                vppVar.jvy.add(jSONArrayOptJSONArray3.optString(i14));
            }
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("play_start");
        if (jSONArrayOptJSONArray4 != null) {
            for (int i15 = 0; i15 < jSONArrayOptJSONArray4.length(); i15++) {
                vppVar.ksc.add(jSONArrayOptJSONArray4.optString(i15));
            }
        }
        JSONObject jSONObjectOptJSONObject13 = jSONObject.optJSONObject("click_area");
        if (jSONObjectOptJSONObject13 != null) {
            com.bytedance.sdk.openadsdk.core.model.tlj tljVar = new com.bytedance.sdk.openadsdk.core.model.tlj();
            tljVar.ouw = jSONObjectOptJSONObject13.optBoolean("click_upper_content_area", true);
            tljVar.vt = jSONObjectOptJSONObject13.optBoolean("click_upper_non_content_area", true);
            tljVar.f8282lh = jSONObjectOptJSONObject13.optBoolean("click_lower_content_area", true);
            tljVar.yu = jSONObjectOptJSONObject13.optBoolean("click_lower_non_content_area", true);
            tljVar.fkw = jSONObjectOptJSONObject13.optBoolean("click_button_area", true);
            tljVar.f8281le = jSONObjectOptJSONObject13.optBoolean("click_video_area", true);
            vppVar.ms = tljVar;
        }
        JSONObject jSONObjectOptJSONObject14 = jSONObject.optJSONObject("adslot");
        if (jSONObjectOptJSONObject14 == null) {
            adSlot2 = adSlot;
            str = "width";
            str2 = "app_name";
            str3 = "height";
            str4 = "interaction_method";
            str5 = "url";
            str6 = "";
            vppVar.yiz = adSlot2;
        } else {
            String strOptString = jSONObjectOptJSONObject14.optString("mCodeId", "");
            int iOptInt4 = jSONObjectOptJSONObject14.optInt("mImgAcceptedWidth", 0);
            int iOptInt5 = jSONObjectOptJSONObject14.optInt("mImgAcceptedHeight", 0);
            str3 = "height";
            float fOptDouble = (float) jSONObjectOptJSONObject14.optDouble("mExpressViewAcceptedWidth", 0.0d);
            str = "width";
            float fOptDouble2 = (float) jSONObjectOptJSONObject14.optDouble("mExpressViewAcceptedHeight", 0.0d);
            int iOptInt6 = jSONObjectOptJSONObject14.optInt("mAdCount", 6);
            boolean zOptBoolean = jSONObjectOptJSONObject14.optBoolean("mSupportDeepLink", true);
            String strOptString2 = jSONObjectOptJSONObject14.optString("mRewardName", "");
            str2 = "app_name";
            str4 = "interaction_method";
            int iOptInt7 = jSONObjectOptJSONObject14.optInt("mRewardAmount", 0);
            String strOptString3 = jSONObjectOptJSONObject14.optString("mMediaExtra", "");
            str5 = "url";
            String strOptString4 = jSONObjectOptJSONObject14.optString("mUserID", "");
            jSONObjectOptJSONObject14.optInt("mOrientation", 2);
            int iOptInt8 = jSONObjectOptJSONObject14.optInt("mNativeAdType", 0);
            str6 = "";
            vppVar = vppVar;
            vppVar.yiz = new AdSlot.Builder().setCodeId(strOptString).setImageAcceptedSize(iOptInt4, iOptInt5).setExpressViewAcceptedSize(fOptDouble, fOptDouble2).setAdCount(iOptInt6).setSupportDeepLink(zOptBoolean).setRewardName(strOptString2).setRewardAmount(iOptInt7).setMediaExtra(strOptString3).setUserID(strOptString4).setNativeAdType(iOptInt8).setIsAutoPlay(jSONObjectOptJSONObject14.optBoolean("mIsAutoPlay", false)).isExpressAd(jSONObjectOptJSONObject14.optBoolean("mIsExpressAd", false)).withBid(jSONObjectOptJSONObject14.optString("mBidAdm", "")).setDurationSlotType(jSONObjectOptJSONObject14.optInt("mDurationSlotType", 0)).build();
            adSlot2 = adSlot;
        }
        if (adSlot2 != null) {
            Map<String, Object> requestExtraMap = adSlot2.getRequestExtraMap();
            if (requestExtraMap != null && requestExtraMap.containsKey("admob_watermark")) {
                vppVar.pev = String.valueOf(requestExtraMap.get("admob_watermark"));
            }
            jSONObject2 = jSONObject;
        } else {
            jSONObject2 = jSONObject;
            vppVar.pev = jSONObject2.optString("identificationOverlayContent");
        }
        vppVar.ixm = jSONObject2.optInt("intercept_flag", 0);
        vppVar.ey = jSONObject2.optString("phone_num");
        vppVar.fqk = jSONObject2.optString("title");
        vppVar.hun = jSONObject2.optString("description");
        vppVar.ux = jSONObject2.optString("button_text");
        vppVar.zrz = jSONObject2.optInt("ad_logo", 1);
        vppVar.yhj = jSONObject2.optString("ext");
        vppVar.lvd = jSONObject2.optInt("cover_click_area", 0);
        vppVar.ucs = jSONObject2.optInt("image_mode");
        vppVar.fg = jSONObject2.optInt("orientation", 1);
        vppVar.baa = (float) jSONObject2.optDouble("aspect_ratio", 100.0d);
        vppVar.lvd = jSONObject2.optInt("cover_click_area", 0);
        JSONObject jSONObjectOptJSONObject15 = jSONObject2.optJSONObject("app");
        JSONObject jSONObjectOptJSONObject16 = jSONObject2.optJSONObject("deep_link");
        JSONObject jSONObjectOptJSONObject17 = jSONObject2.optJSONObject("oem");
        vppVar.ouw(jSONObject2.optInt("is_web_jump_ip", 0));
        vppVar.oiz = com.bytedance.sdk.openadsdk.core.model.jae.ouw(jSONObjectOptJSONObject17);
        if (jSONObjectOptJSONObject15 == null) {
            leVar = null;
        } else {
            leVar = new com.bytedance.sdk.openadsdk.core.model.le();
            leVar.vt = jSONObjectOptJSONObject15.optString(str2);
            leVar.f8244lh = jSONObjectOptJSONObject15.optString("package_name");
            leVar.ouw = jSONObjectOptJSONObject15.optString("download_url");
            double dOptDouble3 = jSONObjectOptJSONObject15.optDouble("score", -1.0d);
            if (dOptDouble3 >= d11 && dOptDouble3 <= 5.0d) {
                leVar.fkw = dOptDouble3;
            } else {
                leVar.fkw = -1.0d;
            }
            int iOptInt9 = jSONObjectOptJSONObject15.optInt("comment_num", -1);
            if (iOptInt9 <= 0) {
                leVar.f8243le = -1;
            } else {
                leVar.f8243le = iOptInt9;
            }
            leVar.ra = jSONObjectOptJSONObject15.optInt("app_size", 0);
            leVar.yu = jSONObjectOptJSONObject15.optString("app_category");
        }
        vppVar.wp = leVar;
        JSONObject jSONObjectOptJSONObject18 = jSONObject2.optJSONObject("interaction_method_params");
        JSONObject jSONObjectOptJSONObject19 = jSONObject2.optJSONObject("arbitrage_interceptor_params");
        com.bytedance.sdk.openadsdk.core.model.pno pnoVar = new com.bytedance.sdk.openadsdk.core.model.pno();
        if (jSONObjectOptJSONObject19 == null) {
            pnoVar.ouw = 0;
            pnoVar.vt = 0;
            pnoVar.f8258lh = new ArrayList();
            pnoVar.yu = 0;
            pnoVar.fkw = new ArrayList();
            pnoVar.ra = 0;
            pnoVar.f8257le = 0;
        } else {
            pnoVar.ouw = jSONObjectOptJSONObject19.optInt("interceptor_x", 0);
            pnoVar.vt = jSONObjectOptJSONObject19.optInt("interceptor_y", 0);
            JSONArray jSONArrayOptJSONArray5 = jSONObjectOptJSONObject19.optJSONArray("interceptor_page");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray5 != null) {
                for (int i16 = 0; i16 < jSONArrayOptJSONArray5.length(); i16++) {
                    arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray5.optInt(i16)));
                }
            }
            pnoVar.f8258lh = arrayList2;
            pnoVar.yu = jSONObjectOptJSONObject19.optInt("interceptor_interval_time", 0);
            JSONArray jSONArrayOptJSONArray6 = jSONObjectOptJSONObject19.optJSONArray("url_regular");
            ArrayList arrayList3 = new ArrayList();
            if (jSONArrayOptJSONArray6 != null) {
                for (int i17 = 0; i17 < jSONArrayOptJSONArray6.length(); i17++) {
                    arrayList3.add(jSONArrayOptJSONArray6.optString(i17));
                }
            }
            pnoVar.fkw = arrayList3;
            pnoVar.ra = jSONObjectOptJSONObject19.optInt("boc_index", 0);
            pnoVar.f8257le = jSONObjectOptJSONObject19.optInt("is_act", 0);
        }
        vppVar.our = pnoVar;
        com.bytedance.sdk.openadsdk.core.model.qbp qbpVar = new com.bytedance.sdk.openadsdk.core.model.qbp();
        if (jSONObjectOptJSONObject18 == null) {
            qbpVar.ouw(10L);
            qbpVar.vt(20L);
            qbpVar.lh(10L);
            qbpVar.yu(20L);
            str7 = str6;
            qbpVar.fkw = str7;
        } else {
            str7 = str6;
            qbpVar.ouw(jSONObjectOptJSONObject18.optLong("onlylp_loading_maxtime", 10L));
            qbpVar.vt(jSONObjectOptJSONObject18.optLong("straight_lp_showtime", 20L));
            qbpVar.lh(jSONObjectOptJSONObject18.optLong("onlyagg_loading_maxtime", 10L));
            qbpVar.yu(jSONObjectOptJSONObject18.optLong("straight_agg_showtime", 20L));
            qbpVar.fkw = jSONObjectOptJSONObject18.optString("loading_text", str7);
        }
        vppVar.kq = qbpVar;
        com.bytedance.sdk.openadsdk.core.model.vm vmVar = new com.bytedance.sdk.openadsdk.core.model.vm();
        if (jSONObjectOptJSONObject18 == null) {
            vmVar.f8287lh = 5;
            vmVar.yu = 30;
            vmVar.fkw = 70;
            vmVar.f8286le = 1;
            vmVar.ra = com.bytedance.sdk.openadsdk.core.model.vm.ouw;
            vmVar.pno = 0;
            vmVar.bly = 0;
            vmVar.tlj = 3;
        } else {
            vmVar.f8287lh = jSONObjectOptJSONObject18.optInt("ceiling_time", 5);
            vmVar.yu = jSONObjectOptJSONObject18.optInt("ceiling_ratio", 30);
            vmVar.fkw = jSONObjectOptJSONObject18.optInt("expand_ratio", 70);
            vmVar.f8286le = jSONObjectOptJSONObject18.optInt("back_type", 1);
            vmVar.ra = jSONObjectOptJSONObject18.optInt("boc_return_type", com.bytedance.sdk.openadsdk.core.model.vm.ouw);
            vmVar.pno = jSONObjectOptJSONObject18.optInt("pre_render_status", 0);
            vmVar.bly = jSONObjectOptJSONObject18.optInt("pre_render_use_gecko", 0);
            vmVar.tlj = jSONObjectOptJSONObject18.optInt("pre_render_add_type", 3);
        }
        vppVar.f8301mb = vmVar;
        if (jSONObjectOptJSONObject16 == null) {
            rylVar = null;
        } else {
            rylVar = new com.bytedance.sdk.openadsdk.core.model.ryl();
            rylVar.ouw = jSONObjectOptJSONObject16.optString("deeplink_url");
            rylVar.vt = jSONObjectOptJSONObject16.optString("fallback_url");
            rylVar.f8261lh = jSONObjectOptJSONObject16.optInt("fallback_type");
        }
        vppVar.kn = rylVar;
        vppVar.nbp = new com.bytedance.sdk.openadsdk.core.model.od(jSONObject2);
        JSONArray jSONArrayOptJSONArray7 = jSONObject2.optJSONArray("filter_words");
        if (jSONArrayOptJSONArray7 != null) {
            for (int i18 = 0; i18 < jSONArrayOptJSONArray7.length(); i18++) {
                FilterWord filterWordLh = lh(jSONArrayOptJSONArray7.optJSONObject(i18));
                if (filterWordLh != null && filterWordLh.isValid()) {
                    vppVar.jae.add(filterWordLh);
                }
            }
        }
        vppVar.coz = jSONObject2.optInt("count_down");
        vppVar.fwd = jSONObject2.optLong("expiration_time");
        vppVar.f8314vf = jSONObject2.optInt("video_encode_type", 0);
        vppVar.sm = 0;
        JSONObject jSONObjectOptJSONObject20 = jSONObject2.optJSONObject("video");
        if (jSONObjectOptJSONObject20 != null) {
            c cVarOuw2 = ouw(jSONObjectOptJSONObject20, vppVar, true);
            vppVar.njr = cVarOuw2;
            vppVar.f8303ob = jSONObjectOptJSONObject20.optInt("multi_played_percent", 50);
            cVar = cVarOuw2;
        } else {
            cVar = null;
        }
        JSONObject jSONObjectOptJSONObject21 = jSONObject2.optJSONObject("h265_video");
        if (jSONObjectOptJSONObject21 != null) {
            cVarOuw = ouw(jSONObjectOptJSONObject21, vppVar, false);
            vppVar.euf = cVarOuw;
        } else {
            cVarOuw = null;
        }
        if (Build.VERSION.SDK_INT < 26 || vppVar.f8314vf == 0) {
            vppVar.f8309sd = cVar;
            i11 = 0;
            vppVar.f8314vf = 0;
        } else {
            if (cVarOuw != null && cVar != null) {
                if (TextUtils.isEmpty(cVarOuw.f6579h)) {
                    cVarOuw.f6579h = cVar.f6579h;
                }
                if (TextUtils.isEmpty(cVarOuw.f6580i)) {
                    cVarOuw.f6580i = cVar.f6580i;
                }
                if (cVarOuw.f6582l == -1) {
                    cVarOuw.f6582l = cVar.f6582l;
                }
            }
            if (cVarOuw != null) {
                vppVar.f8309sd = cVarOuw;
            } else {
                vppVar.f8309sd = cVar;
            }
            i11 = 0;
        }
        JSONObject jSONObjectOptJSONObject22 = jSONObject2.optJSONObject("download_conf");
        if (jSONObjectOptJSONObject22 != null) {
            com.bytedance.sdk.openadsdk.core.model.mwh mwhVar = new com.bytedance.sdk.openadsdk.core.model.mwh();
            mwhVar.ouw = jSONObjectOptJSONObject22.optInt("if_send_click", i11);
            vppVar.xwt = mwhVar;
        }
        vppVar.npr = yu(jSONObject2.optJSONObject("media_ext"));
        JSONObject jSONObjectOptJSONObject23 = jSONObject2.optJSONObject("tpl_info");
        if (jSONObjectOptJSONObject23 != null) {
            vpp.ouw ouwVar8 = new vpp.ouw();
            ouwVar8.ouw = jSONObjectOptJSONObject23.optString(FacebookMediationAdapter.KEY_ID);
            ouwVar8.vt = jSONObjectOptJSONObject23.optString("md5");
            ouwVar8.f8320lh = jSONObjectOptJSONObject23.optString(str5);
            ouwVar8.yu = jSONObjectOptJSONObject23.optString("data");
            ouwVar8.fkw = jSONObjectOptJSONObject23.optString("diff_data");
            String strOptString5 = jSONObjectOptJSONObject23.optString("dynamic_creative");
            ouwVar8.ra = strOptString5;
            ouwVar8.f8319le = jSONObjectOptJSONObject23.optString("version");
            ouwVar8.f8317cf = jSONObjectOptJSONObject23.optString("media_view");
            try {
                ArrayList arrayList4 = new ArrayList();
                JSONObject jSONObject3 = new JSONObject(strOptString5);
                JSONArray jSONArrayOptJSONArray8 = jSONObject3.optJSONArray("tag_ids");
                if (jSONArrayOptJSONArray8 != null) {
                    for (int i19 = 0; i19 < jSONArrayOptJSONArray8.length(); i19++) {
                        arrayList4.add(Integer.valueOf(jSONArrayOptJSONArray8.optInt(i19)));
                    }
                }
                String strOptString6 = jSONObject3.optString("music_url");
                ouwVar8.pno = arrayList4;
                ouwVar8.bly = strOptString6;
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.qbp.lh("TTAD.AdInfoFactory", e2.getMessage());
            }
            ouwVar8.tlj = jSONObjectOptJSONObject23.optString("engine_version");
            ouwVar8.ryl = jSONObjectOptJSONObject23.optString("ugen_url");
            ouwVar8.mwh = jSONObjectOptJSONObject23.optString("ugen_md5");
            ouwVar8.f8318jg = jSONObjectOptJSONObject23.optString("ugen_data");
            vppVar.xn = ouwVar8;
            String strValueOf = String.valueOf(vppVar.fqk());
            com.bytedance.sdk.component.adexpress.ouw.lh.yu yuVar = new com.bytedance.sdk.component.adexpress.ouw.lh.yu();
            yuVar.ouw = ouwVar8.ouw;
            yuVar.vt = ouwVar8.vt;
            yuVar.f7381lh = ouwVar8.f8320lh;
            yuVar.yu = ouwVar8.yu;
            yuVar.fkw = ouwVar8.f8319le;
            yuVar.f7380le = strValueOf;
            if (!vppVar.th()) {
                com.bytedance.sdk.component.adexpress.ouw.vt.vt.ouw(yuVar);
            }
            if (!TextUtils.isEmpty(ouwVar8.ryl)) {
                vpp.ouw ouwVar9 = vppVar.xn;
                if (ouwVar9 == null) {
                    ouwVar7 = null;
                } else {
                    String strValueOf2 = String.valueOf(vppVar.fqk());
                    ouwVar7 = new com.bytedance.sdk.openadsdk.core.cf.pno.ouw();
                    ouwVar7.ouw = ouwVar9.ouw;
                    ouwVar7.vt = ouwVar9.mwh;
                    ouwVar7.f8158lh = ouwVar9.ryl;
                    ouwVar7.yu = ouwVar9.f8318jg;
                    ouwVar7.fkw = strValueOf2;
                }
                com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw().ouw(ouwVar7, "ad");
            }
        }
        JSONObject jSONObjectOptJSONObject24 = jSONObject2.optJSONObject("tpl_info_v3");
        if (jSONObjectOptJSONObject24 != null) {
            com.bytedance.sdk.openadsdk.core.model.pd pdVarOuw = com.bytedance.sdk.openadsdk.core.model.pd.ouw(jSONObjectOptJSONObject24);
            vppVar.lht = pdVarOuw;
            if (pdVarOuw != null && !TextUtils.isEmpty(pdVarOuw.f8255lh)) {
                com.bytedance.sdk.openadsdk.core.model.pd pdVar = vppVar.lht;
                if (pdVar == null) {
                    ouwVar6 = null;
                } else {
                    ouwVar6 = new com.bytedance.sdk.openadsdk.core.cf.pno.ouw();
                    ouwVar6.ouw = pdVar.ouw;
                    ouwVar6.vt = pdVar.vt;
                    ouwVar6.f8158lh = pdVar.f8255lh;
                    ouwVar6.yu = pdVar.yu;
                    ouwVar6.fkw = vppVar.fqk() + "_v3";
                }
                com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw().ouw(ouwVar6, "adv3");
            }
        }
        JSONObject jSONObjectOptJSONObject25 = jSONObject2.optJSONObject("dynamic_creative");
        if (jSONObjectOptJSONObject25 != null) {
            vppVar.jvj = jSONObjectOptJSONObject25;
        }
        vppVar.zjp = jSONObject2.optString("creative_extra");
        vppVar.eay = jSONObject2.optInt("if_block_lp", 0);
        vppVar.fn = jSONObject2.optInt("cache_sort", 1);
        vppVar.byv = jSONObject2.optInt("if_sp_cache", 0);
        JSONObject jSONObjectOptJSONObject26 = jSONObject2.optJSONObject("splash_control");
        if (jSONObjectOptJSONObject26 != null) {
            int iOptInt10 = jSONObjectOptJSONObject26.optInt("splash_clickarea", 2);
            int iOptInt11 = jSONObjectOptJSONObject26.optInt("splash_layout_id", 1);
            long jOptLong = jSONObjectOptJSONObject26.optLong("load_wait_time", 0L);
            long j = jOptLong >= 0 ? jOptLong : 0L;
            int iOptInt12 = jSONObjectOptJSONObject26.optInt("skip_time", -1);
            com.bytedance.sdk.openadsdk.core.model.ra raVar = new com.bytedance.sdk.openadsdk.core.model.ra();
            raVar.ouw = iOptInt10;
            raVar.vt = iOptInt11;
            raVar.f8260lh = j;
            raVar.yu = iOptInt12;
            vppVar.qjg = raVar;
        }
        vppVar.zjq = jSONObject2.optInt("is_package_open", 1);
        vppVar.nn = jSONObject2.optString("ad_info", null);
        vppVar.f8316vi = jSONObject2.optInt("ua_policy", 2);
        vppVar.eot = jSONObject2.optInt("playable_duration_time", 30);
        vppVar.ko = jSONObject2.optInt("playable_close_time", -1);
        vppVar.mu = jSONObject2.optInt("playable_endcard_close_time", -1);
        vppVar.xne = jSONObject2.optInt("endcard_close_time", -1);
        vppVar.ouw(jSONObject2.optInt(str4), -1);
        vppVar.vt(jSONObject2.optInt("lp_click_type", -1));
        vppVar.ouw(jSONObject2.optInt("lp_click_interval", -1));
        vppVar.swm = jSONObject2.optString("dsp_html");
        vppVar.wud = jSONObject2.optInt("image_stay", 0);
        int iOptInt13 = jSONObject2.optInt("dsp_material_type", 0);
        if (iOptInt13 < 0 || iOptInt13 > 3) {
            iOptInt13 = 0;
        }
        if (iOptInt13 == 0) {
            if (jSONObject2.optBoolean("is_vast", false)) {
                iOptInt13 = 1;
            }
            if (jSONObject2.optBoolean("is_html", false)) {
                iOptInt13 = 2;
            }
        }
        vppVar.cy = iOptInt13;
        if (iOptInt13 == 1 || iOptInt13 == 3) {
            int iUoy = vppVar.lna;
            if (iUoy < 0) {
                AdSlot adSlot3 = vppVar.yiz;
                if (adSlot3 != null) {
                    iUoy = adSlot3.getDurationSlotType();
                } else {
                    iUoy = vppVar.uoy();
                }
            }
            String strLh = com.bytedance.sdk.openadsdk.utils.uoy.lh(iUoy);
            if (jSONObject2.has("vast_json")) {
                JSONObject jSONObjectOptJSONObject27 = jSONObject2.optJSONObject("vast_json");
                if (jSONObjectOptJSONObject27 == null) {
                    ouwVar5 = null;
                } else {
                    ouwVar5 = new com.bytedance.sdk.openadsdk.core.ryl.ouw();
                    com.bytedance.sdk.openadsdk.core.ryl.yu yuVar2 = ouwVar5.ouw.ouw;
                    if (yuVar2 == null) {
                        yuVar2 = new com.bytedance.sdk.openadsdk.core.ryl.yu();
                        ouwVar5.ouw.ouw = yuVar2;
                    }
                    yuVar2.ouw(jSONObjectOptJSONObject27.optJSONObject("videoTrackers"));
                    ouwVar5.vt = com.bytedance.sdk.openadsdk.core.ryl.vt.ouw(jSONObjectOptJSONObject27.optJSONObject("vastIcon"));
                    ouwVar5.f8411lh = com.bytedance.sdk.openadsdk.core.ryl.lh.vt(jSONObjectOptJSONObject27.optJSONObject("endCard"));
                    ouwVar5.yu = jSONObjectOptJSONObject27.optString("title");
                    ouwVar5.fkw = jSONObjectOptJSONObject27.optString("description");
                    ouwVar5.f8410le = jSONObjectOptJSONObject27.optString("clickThroughUrl");
                    ouwVar5.ra = jSONObjectOptJSONObject27.optString("videoUrl");
                    ouwVar5.pno = jSONObjectOptJSONObject27.optDouble("videDuration");
                    ouwVar5.bly = jSONObjectOptJSONObject27.optInt("videoWidth");
                    ouwVar5.bly = jSONObjectOptJSONObject27.optInt("videoHeight");
                    Set hashSet = ouwVar5.ouw.vt;
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        ouwVar5.ouw.vt = hashSet;
                    }
                    hashSet.addAll(com.bytedance.sdk.openadsdk.core.ryl.tlj.ouw(jSONObjectOptJSONObject27.optJSONArray("viewabilityVendor")));
                }
                ouwVar4 = ouwVar5;
                str8 = str3;
            } else {
                String strOptString7 = jSONObject2.optString("dsp_vast");
                if (TextUtils.isEmpty(strOptString7)) {
                    try {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("reason_code", -1);
                        jSONObject4.put("error_code", -1);
                        com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, strLh, "load_vast_fail", jSONObject4);
                        return null;
                    } catch (Exception unused) {
                        return null;
                    }
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                int iJqy = vppVar.jqy();
                if (TextUtils.isEmpty(strOptString7)) {
                    pair = null;
                } else {
                    if (iUoy == 1 || iUoy == 5) {
                        iYu = 0;
                        iLe = 0;
                    } else {
                        iYu = com.bytedance.sdk.openadsdk.utils.osn.yu(zih.ouw());
                        iLe = com.bytedance.sdk.openadsdk.utils.osn.le(zih.ouw());
                        if (iJqy == 2) {
                            iLe = iYu;
                            iYu = iLe;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu yuVar3 = new com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu(zih.ouw(), iYu, iLe);
                    pair = new Pair(yuVar3.ouw(strOptString7, (File) null, new ArrayList()), yuVar3.f8416le);
                }
                if (pair != null) {
                    ouwVar2 = (com.bytedance.sdk.openadsdk.core.ryl.ouw) pair.first;
                    ouwVar3 = (vt.ouw) pair.second;
                    vppVar2 = vppVar;
                    str8 = str3;
                } else {
                    ouwVar2 = null;
                    ouwVar3 = null;
                    str8 = str3;
                    vppVar2 = vppVar;
                }
                com.bytedance.sdk.openadsdk.core.ryl.lh.yu.ouw(vppVar2, strLh, ouwVar2, jElapsedRealtime, ouwVar3);
                vppVar = vppVar2;
                ouwVar4 = ouwVar2;
            }
            if (ouwVar4 == null) {
                return null;
            }
            ouwVar4.ouw.ouw(vppVar);
            com.bytedance.sdk.openadsdk.core.ryl.vt vtVar = ouwVar4.vt;
            if (vtVar != null) {
                vtVar.f8397cf = vppVar;
            }
            com.bytedance.sdk.openadsdk.core.ryl.lh lhVar = ouwVar4.f8411lh;
            if (lhVar != null) {
                lhVar.f8397cf = vppVar;
            }
            int i20 = vppVar.f8305pd;
            if (i20 != 2 && i20 != 3 && i20 != 8) {
                vppVar.f8305pd = 2;
            }
            vppVar.zvq = 1;
            vppVar.cu = ouwVar4;
            if (!TextUtils.isEmpty(ouwVar4.yu)) {
                vppVar.fqk = ouwVar4.yu;
            }
            if (!TextUtils.isEmpty(ouwVar4.fkw)) {
                vppVar.hun = ouwVar4.fkw;
            }
            vppVar.osn = ouwVar4.f8410le;
            vppVar.wp = null;
            c cVar2 = vppVar.f8309sd;
            if (cVar2 == null) {
                cVar2 = new c();
            }
            cVar2.g = ouwVar4.ra;
            cVar2.f6576d = ouwVar4.pno;
            cVar2.j = null;
            cVar2.f6578f = null;
            cVar2.f6579h = null;
            vppVar.f8309sd = cVar2;
            com.bytedance.sdk.openadsdk.core.ryl.vt vtVar2 = ouwVar4.vt;
            if (vtVar2 != null && !TextUtils.isEmpty(vtVar2.fkw())) {
                com.bytedance.sdk.openadsdk.core.model.zih zihVar4 = new com.bytedance.sdk.openadsdk.core.model.zih();
                zihVar4.ouw = ouwVar4.vt.fkw();
                zihVar4.vt = ouwVar4.vt.vt();
                zihVar4.f8323lh = ouwVar4.vt.lh();
                vppVar.ouw(zihVar4);
            } else if (vppVar.fak == null) {
                com.bytedance.sdk.openadsdk.core.model.zih zihVar5 = new com.bytedance.sdk.openadsdk.core.model.zih();
                zihVar5.ouw = "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/static/images/2023620white.jpeg";
                zihVar5.vt = 98;
                zihVar5.f8323lh = 98;
                vppVar.ouw(zihVar5);
            }
        } else {
            str8 = str3;
        }
        vppVar.lso = jSONObject2.optString("deep_link_appname", str7);
        vppVar.f8292cj = jSONObject2.optInt("landing_page_download_clicktype", 1);
        JSONObject jSONObjectOptJSONObject28 = jSONObject2.optJSONObject("dsp_style");
        if (jSONObjectOptJSONObject28 != null) {
            vppVar.kbx = new com.bytedance.sdk.openadsdk.core.model.jg(jSONObjectOptJSONObject28);
        }
        JSONObject jSONObjectOptJSONObject29 = jSONObject2.optJSONObject("dsp_adchoices");
        if (jSONObjectOptJSONObject29 != null) {
            vppVar.uz = jSONObjectOptJSONObject29.optString("adchoices_icon", str7);
            vppVar.jo = jSONObjectOptJSONObject29.optString("adchoices_url", str7);
        }
        String strOptString8 = jSONObject2.optString("gdid_encrypted");
        if (!TextUtils.isEmpty(strOptString8)) {
            vppVar.f8306qg = strOptString8;
        }
        c cVar3 = vppVar.f8309sd;
        if (cVar3 != null && !TextUtils.isEmpty(cVar3.f6579h)) {
            try {
                if (vppVar.f8309sd.f6579h.contains("style_id")) {
                    vppVar.hai = true;
                    vppVar.f8296jf = Uri.parse(vppVar.f8309sd.f6579h).getQueryParameters("style_id").get(0);
                } else {
                    vppVar.hai = false;
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.yu(th2.getMessage(), new Object[0]);
            }
        }
        JSONObject jSONObjectOptJSONObject30 = jSONObject2.optJSONObject("ugen");
        if (jSONObjectOptJSONObject30 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject30.optJSONObject("endcard")) != null) {
            com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVarVt = vt(jSONObjectOptJSONObject2);
            vppVar.upp = ouwVarVt;
            com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw().ouw(ouwVarVt, "endcard");
            JSONObject jSONObjectOptJSONObject31 = jSONObjectOptJSONObject2.optJSONObject("overlay");
            if (jSONObjectOptJSONObject31 != null) {
                com.bytedance.sdk.openadsdk.core.cf.pno.ouw ouwVarVt2 = vt(jSONObjectOptJSONObject31);
                vppVar.nit = ouwVarVt2;
                com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw().ouw(ouwVarVt2, "endcard");
            }
        }
        vppVar.gls = jSONObject2.optInt("preload_h5_type", 0);
        vppVar.bu = jSONObject2.optBoolean("hasReportShow", false);
        vppVar.znd = jSONObject2.optString("endcard_creative", str7);
        JSONObject jSONObjectOptJSONObject32 = jSONObject2.optJSONObject("ad_label");
        com.bytedance.sdk.openadsdk.core.model.vt vtVar3 = vppVar.f8295hk;
        if (jSONObjectOptJSONObject32 != null) {
            vtVar3.ouw = jSONObjectOptJSONObject32.optString("icon");
            vtVar3.vt = jSONObjectOptJSONObject32.optString("text");
            vtVar3.f8321lh = jSONObjectOptJSONObject32.optString("privacy_url");
            vtVar3.yu = jSONObjectOptJSONObject32.optString("privacy_title");
        }
        JSONObject jSONObjectOptJSONObject33 = jSONObject2.optJSONObject("ev");
        if (jSONObjectOptJSONObject33 != null) {
            vppVar.vt(jSONObjectOptJSONObject33.optBoolean("enable", com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw));
            vppVar.lh(jSONObjectOptJSONObject33.optInt("wait_time", com.bytedance.sdk.openadsdk.tc.ouw.lh.vt));
            vppVar.fkw(jSONObjectOptJSONObject33.optString("label", com.bytedance.sdk.openadsdk.tc.ouw.lh.f8661lh));
            vppVar.sn = new com.bytedance.sdk.openadsdk.tc.ouw.vt(vppVar);
        }
        if (jSONObject2.has("banner") && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("banner")) != null) {
            vppVar.bfk = new PAGBannerSize(jSONObjectOptJSONObject.optInt(str, 0), jSONObjectOptJSONObject.optInt(str8, 0));
        }
        JSONArray jSONArrayOptJSONArray9 = jSONObject2.optJSONArray("ad_tracks");
        if (jSONArrayOptJSONArray9 != null && jSONArrayOptJSONArray9.length() > 0 && (arrayList = (fkwVar = new com.bytedance.sdk.openadsdk.core.model.fkw(jSONArrayOptJSONArray9)).ouw) != null && !arrayList.isEmpty()) {
            vppVar.ryl = fkwVar;
        }
        JSONObject jSONObjectOptJSONObject34 = jSONObject2.optJSONObject("popup");
        if (jSONObjectOptJSONObject34 != null) {
            vppVar.f8297jg = new com.bytedance.sdk.openadsdk.core.model.jqy(jSONObjectOptJSONObject34);
        }
        return vppVar;
    }

    private static c ouw(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, boolean z3) {
        int iOptInt;
        if (jSONObject == null) {
            return null;
        }
        c cVar = new c();
        cVar.f6573a = jSONObject.optInt("cover_height");
        cVar.f6574b = jSONObject.optInt("cover_width");
        cVar.f6577e = jSONObject.optString("resolution");
        cVar.f6575c = jSONObject.optLong("size");
        double dOptDouble = jSONObject.optDouble("video_duration", 0.0d);
        cVar.f6576d = dOptDouble;
        int iOptInt2 = jSONObject.optInt("replay_time", 1);
        if (dOptDouble > 15.0d || vppVar.rn() == 1 || !com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVar)) {
            iOptInt2 = 1;
        }
        cVar.f6588r = Math.min(4, Math.max(1, iOptInt2));
        cVar.f6578f = jSONObject.optString("cover_url");
        cVar.g = jSONObject.optString("video_url");
        cVar.f6579h = jSONObject.optString("endcard");
        cVar.f6580i = jSONObject.optString("playable_download_url");
        cVar.j = jSONObject.optString("file_hash");
        cVar.f6583m = jSONObject.optInt("if_playable_loading_show", 0);
        cVar.f6584n = jSONObject.optInt("remove_loading_page_type", 0);
        cVar.f6581k = jSONObject.optInt("fallback_endcard_judge", 0);
        cVar.f6587q = jSONObject.optInt("video_preload_size", 307200);
        cVar.f6585o = jSONObject.optInt("reward_video_cached_type", 0);
        cVar.f6586p = jSONObject.optInt("execute_cached_type", 0);
        if (z3) {
            iOptInt = jSONObject.optInt("endcard_render", 0);
        } else {
            iOptInt = jSONObject.optInt("endcard_render", -1);
        }
        cVar.f6582l = iOptInt;
        return cVar;
    }

    private static boolean ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        return (vppVar.cd() || vppVar.pd()) ? false : true;
    }

    private static int ouw(List<com.bytedance.sdk.openadsdk.core.model.zih> list) {
        if (list == null) {
            return TTAdConstant.IMAGE_LIST_CODE;
        }
        if (list.size() <= 0) {
            return TTAdConstant.IMAGE_LIST_SIZE_CODE;
        }
        for (com.bytedance.sdk.openadsdk.core.model.zih zihVar : list) {
            if (zihVar == null) {
                return TTAdConstant.IMAGE_CODE;
            }
            if (TextUtils.isEmpty(zihVar.ouw)) {
                return TTAdConstant.IMAGE_URL_CODE;
            }
        }
        return TTAdConstant.MATE_VALID;
    }

    private static int ouw(com.bytedance.sdk.openadsdk.core.model.ryl rylVar) {
        if (rylVar == null) {
            return TTAdConstant.MATE_VALID;
        }
        if (TextUtils.isEmpty(rylVar.ouw)) {
            return TTAdConstant.DEEPLINK_UNAVAILABLE_CODE;
        }
        if (TextUtils.isEmpty(rylVar.vt)) {
            return TTAdConstant.DEEPLINK_FALLBACK_CODE;
        }
        int i4 = rylVar.f8261lh;
        return (i4 == 1 || i4 == 2) ? TTAdConstant.MATE_VALID : TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE;
    }
}
