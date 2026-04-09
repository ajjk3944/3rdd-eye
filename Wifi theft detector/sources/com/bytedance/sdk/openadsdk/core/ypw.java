package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.emc.emc.emc.xq.b;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.sup.emc.ypw;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw {

    public static class emc {
        public String emc;
        public int ypw;

        public emc(String str, int i10) {
            this.emc = str;
            this.ypw = i10;
        }
    }

    private static FilterWord bw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    FilterWord filterWordBw = bw(jSONArrayOptJSONArray.optJSONObject(i10));
                    if (filterWordBw != null && filterWordBw.isValid()) {
                        filterWord.addOption(filterWordBw);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static com.bytedance.sdk.openadsdk.core.model.uym dg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("splash_clickarea", 2);
        int iOptInt2 = jSONObject.optInt("splash_layout_id", 1);
        long jOptLong = jSONObject.optLong("load_wait_time", 0L);
        long j10 = jOptLong >= 0 ? jOptLong : 0L;
        int iOptInt3 = jSONObject.optInt("skip_time", -1);
        com.bytedance.sdk.openadsdk.core.model.uym uymVar = new com.bytedance.sdk.openadsdk.core.model.uym();
        uymVar.ypw(iOptInt);
        uymVar.xq(iOptInt2);
        uymVar.emc(j10);
        uymVar.emc(iOptInt3);
        return uymVar;
    }

    private static boolean emc(int i10) {
        return i10 == 2 || i10 == 3 || i10 == 8;
    }

    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.sz gbl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.sz szVar = new com.bytedance.sdk.openadsdk.core.model.sz();
        szVar.emc(jSONObject.optString("deeplink_url"));
        szVar.ypw(jSONObject.optString("fallback_url"));
        szVar.emc(jSONObject.optInt("fallback_type"));
        return szVar;
    }

    private static com.bytedance.sdk.openadsdk.core.model.yzg msw(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.yzg yzgVar = new com.bytedance.sdk.openadsdk.core.model.yzg();
        if (jSONObject == null) {
            yzgVar.dg(5);
            yzgVar.bw(30);
            yzgVar.ycc(70);
            yzgVar.uym(1);
            yzgVar.msw(com.bytedance.sdk.openadsdk.core.model.yzg.emc);
            yzgVar.xq(0);
            yzgVar.ypw(0);
            yzgVar.emc(3);
            return yzgVar;
        }
        yzgVar.dg(jSONObject.optInt("ceiling_time", 5));
        yzgVar.bw(jSONObject.optInt("ceiling_ratio", 30));
        yzgVar.ycc(jSONObject.optInt("expand_ratio", 70));
        yzgVar.uym(jSONObject.optInt("back_type", 1));
        yzgVar.msw(jSONObject.optInt("boc_return_type", com.bytedance.sdk.openadsdk.core.model.yzg.emc));
        yzgVar.xq(jSONObject.optInt("pre_render_status", 0));
        yzgVar.ypw(jSONObject.optInt("pre_render_use_gecko", 0));
        yzgVar.emc(jSONObject.optInt("pre_render_add_type", 3));
        return yzgVar;
    }

    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.qh ru(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.qh qhVar = new com.bytedance.sdk.openadsdk.core.model.qh();
        qhVar.emc(jSONObject.optInt("if_send_click", 0));
        return qhVar;
    }

    private static Map<String, Object> sup(JSONObject jSONObject) {
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

    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.ylm uym(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.ylm ylmVar = new com.bytedance.sdk.openadsdk.core.model.ylm();
        if (jSONObject == null) {
            ylmVar.emc(10L);
            ylmVar.ypw(20L);
            ylmVar.xq(10L);
            ylmVar.dg(20L);
            ylmVar.emc("");
            return ylmVar;
        }
        ylmVar.emc(jSONObject.optLong("onlylp_loading_maxtime", 10L));
        ylmVar.ypw(jSONObject.optLong("straight_lp_showtime", 20L));
        ylmVar.xq(jSONObject.optLong("onlyagg_loading_maxtime", 10L));
        ylmVar.dg(jSONObject.optLong("straight_agg_showtime", 20L));
        ylmVar.emc(jSONObject.optString("loading_text", ""));
        return ylmVar;
    }

    private static com.bytedance.sdk.openadsdk.core.gbl.msw.emc xq(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.gbl.msw.emc emcVar = new com.bytedance.sdk.openadsdk.core.gbl.msw.emc();
        emcVar.emc(jSONObject.optString("id"));
        emcVar.ypw(jSONObject.optString("md5"));
        emcVar.xq(jSONObject.optString("url"));
        return emcVar;
    }

    @Nullable
    private static com.bytedance.sdk.openadsdk.core.model.ycc ycc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.ycc yccVar = new com.bytedance.sdk.openadsdk.core.model.ycc();
        yccVar.ypw(jSONObject.optString("app_name"));
        yccVar.xq(jSONObject.optString(CampaignEx.JSON_KEY_PACKAGE_NAME));
        yccVar.emc(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
        yccVar.emc(jSONObject.optDouble("score", -1.0d));
        yccVar.emc(jSONObject.optInt("comment_num", -1));
        yccVar.ypw(jSONObject.optInt(CampaignEx.JSON_KEY_APP_SIZE, 0));
        yccVar.dg(jSONObject.optString("app_category"));
        return yccVar;
    }

    public static AdSlot ypw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("mCodeId", "");
        int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 0);
        int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", 0);
        float fOptDouble = (float) jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
        float fOptDouble2 = (float) jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
        int iOptInt3 = jSONObject.optInt("mAdCount", 6);
        boolean zOptBoolean = jSONObject.optBoolean("mSupportDeepLink", true);
        String strOptString2 = jSONObject.optString("mRewardName", "");
        int iOptInt4 = jSONObject.optInt("mRewardAmount", 0);
        String strOptString3 = jSONObject.optString("mMediaExtra", "");
        String strOptString4 = jSONObject.optString("mUserID", "");
        jSONObject.optInt("mOrientation", 2);
        int iOptInt5 = jSONObject.optInt("mNativeAdType", 0);
        boolean zOptBoolean2 = jSONObject.optBoolean("mIsAutoPlay", false);
        boolean zOptBoolean3 = jSONObject.optBoolean("mIsExpressAd", false);
        String strOptString5 = jSONObject.optString("mBidAdm", "");
        return new AdSlot.Builder().setCodeId(strOptString).setImageAcceptedSize(iOptInt, iOptInt2).setExpressViewAcceptedSize(fOptDouble, fOptDouble2).setAdCount(iOptInt3).setSupportDeepLink(zOptBoolean).setRewardName(strOptString2).setRewardAmount(iOptInt4).setMediaExtra(strOptString3).setUserID(strOptString4).setNativeAdType(iOptInt5).setIsAutoPlay(zOptBoolean2).isExpressAd(zOptBoolean3).withBid(strOptString5).setDurationSlotType(jSONObject.optInt("mDurationSlotType", 0)).build();
    }

    private static com.bytedance.sdk.openadsdk.core.model.msw zz(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.msw mswVar = new com.bytedance.sdk.openadsdk.core.model.msw();
        if (jSONObject == null) {
            mswVar.xq(0);
            mswVar.dg(0);
            mswVar.ypw(new ArrayList());
            mswVar.bw(0);
            mswVar.emc(new ArrayList());
            mswVar.ypw(0);
            mswVar.emc(0);
            return mswVar;
        }
        mswVar.xq(jSONObject.optInt("interceptor_x", 0));
        mswVar.dg(jSONObject.optInt("interceptor_y", 0));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("interceptor_page");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i10)));
            }
        }
        mswVar.ypw(arrayList);
        mswVar.bw(jSONObject.optInt("interceptor_interval_time", 0));
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("url_regular");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(jSONArrayOptJSONArray2.optString(i11));
            }
        }
        mswVar.emc(arrayList2);
        mswVar.ypw(jSONObject.optInt("boc_index", 0));
        mswVar.emc(jSONObject.optInt("is_act", 0));
        return mswVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [android.util.Pair<com.bytedance.sdk.openadsdk.core.model.emc, java.util.ArrayList<java.lang.Integer>>] */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Nullable
    public static Pair<com.bytedance.sdk.openadsdk.core.model.emc, ArrayList<Integer>> emc(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.sb sbVar) {
        ?? r17;
        com.bytedance.sdk.openadsdk.core.model.rie rieVar;
        com.bytedance.sdk.openadsdk.core.model.rie rieVar2;
        com.bytedance.sdk.openadsdk.core.model.rie rieVar3 = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.emc emcVar = new com.bytedance.sdk.openadsdk.core.model.emc();
            emcVar.emc(jSONObject.optString("request_id"));
            emcVar.emc(jSONObject.optInt("ret"));
            emcVar.ypw(jSONObject.optInt("multi_ad_style", 0));
            emcVar.ypw(jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
            String strOptString = jSONObject.optString("gdid_encrypted");
            emcVar.emc(com.bytedance.sdk.openadsdk.core.model.sra.emc(jSONObject.optJSONObject("loop_config")));
            String strOptString2 = jSONObject.optString("auction_price");
            if (emcVar.xq() != 0) {
                return null;
            }
            emcVar.emc(com.bytedance.sdk.openadsdk.core.model.ee.emc(jSONObject.optString("multi_ad_config")));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                jSONArrayOptJSONArray.length();
                int i10 = 0;
                ArrayList arrayList2 = emcVar.ru() ? new ArrayList() : null;
                while (i10 < jSONArrayOptJSONArray.length()) {
                    com.bytedance.sdk.openadsdk.core.model.rie rieVarEmc = emc(jSONArrayOptJSONArray.optJSONObject(i10), adSlot, sbVar, emcVar, i10);
                    ?? r92 = arrayList2;
                    if (!emcVar.ru()) {
                        r92 = rieVar3;
                    }
                    int iEmc = emc(rieVarEmc);
                    if (iEmc != 200) {
                        if (rieVarEmc != null) {
                            com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVarEmc, com.bytedance.sdk.openadsdk.utils.tp.xq(rieVarEmc.blf()), iEmc);
                        } else {
                            com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar3, "", iEmc);
                        }
                        arrayList.add(Integer.valueOf(iEmc));
                        if (r92 == 0 || rieVarEmc == null) {
                            rieVar2 = rieVar3;
                        } else {
                            rieVar = rieVar3;
                            try {
                                r92.add(new emc(rieVarEmc.wa(), iEmc));
                                rieVar2 = rieVar;
                            } catch (Throwable th) {
                                th = th;
                                r17 = rieVar;
                                com.bytedance.sdk.component.utils.ul.xq("TTAD.AdInfoFactory", th.getMessage());
                                return r17;
                            }
                        }
                        if (rieVarEmc != null && (rieVarEmc.fu() == 39 || rieVarEmc.fu() == 41)) {
                            emcVar.ypw(0);
                        }
                        jSONArrayOptJSONArray.remove(i10);
                        i10--;
                    } else {
                        rieVar2 = rieVar3;
                        rieVarEmc.qh(strOptString2);
                        if (!TextUtils.isEmpty(strOptString)) {
                            rieVarEmc.zz(strOptString);
                        }
                        emcVar.emc(rieVarEmc);
                    }
                    i10++;
                    rieVar3 = rieVar2;
                    arrayList2 = r92;
                }
                rieVar = rieVar3;
                List<com.bytedance.sdk.openadsdk.core.model.rie> listDg = emcVar.dg();
                emc(listDg, emcVar);
                if (listDg != null) {
                    if (emcVar.ru() && listDg.size() == 1) {
                        emcVar.ypw(0);
                        com.bytedance.sdk.openadsdk.core.model.rie rieVar4 = listDg.get(0);
                        if (rieVar4 != null) {
                            rieVar4.zz(false);
                        }
                    }
                    int size = listDg.size();
                    jSONObject.put("creatives", jSONArrayOptJSONArray);
                    for (int i11 = 0; i11 < size; i11++) {
                        com.bytedance.sdk.openadsdk.core.model.rie rieVar5 = listDg.get(i11);
                        if (rieVar5 != null) {
                            if (i11 > 0) {
                                rieVar5.ksn();
                            }
                            rieVar5.rtt(jSONObject.toString());
                        }
                    }
                }
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    emc((ArrayList<emc>) arrayList2);
                }
            } else {
                rieVar = null;
            }
            return new Pair<>(emcVar, arrayList);
        } catch (Throwable th2) {
            th = th2;
            r17 = rieVar3;
        }
    }

    private static int xq(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        int iEmc;
        String strXq = com.bytedance.sdk.openadsdk.utils.tp.xq(rieVar.blf());
        if (rieVar.aod() == 0) {
            iEmc = emc(rieVar.kda());
            if (iEmc != 200) {
                com.bytedance.sdk.openadsdk.dg.xq.xq(rieVar, strXq, iEmc);
                return iEmc;
            }
        } else {
            iEmc = 200;
        }
        int iSx = rieVar.sx();
        if (iSx != 2 && iSx != 3) {
            if (iSx == 4) {
                int iEmc2 = emc(rieVar.mjd());
                if (iEmc2 != 200) {
                    com.bytedance.sdk.openadsdk.dg.xq.xq(rieVar, strXq, iEmc2);
                }
                return iEmc2;
            }
            if (iSx != 8) {
                return iEmc;
            }
        }
        if (!dg(rieVar) || !TextUtils.isEmpty(rieVar.xst())) {
            return iEmc;
        }
        com.bytedance.sdk.openadsdk.dg.xq.xq(rieVar, strXq, TTAdConstant.LANDING_PAGE_TYPE_CODE);
        return TTAdConstant.LANDING_PAGE_TYPE_CODE;
    }

    private static boolean dg(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        return (rieVar.ak() || rieVar.yvi()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int ypw(com.bytedance.sdk.openadsdk.core.model.rie r8) {
        /*
            int r0 = r8.blf()
            java.lang.String r0 = com.bytedance.sdk.openadsdk.utils.tp.xq(r0)
            int r1 = r8.aod()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != 0) goto L1c
            com.bytedance.sdk.openadsdk.core.model.sz r1 = r8.kda()
            int r1 = emc(r1)
            com.bytedance.sdk.openadsdk.dg.xq.xq(r8, r0, r1)
            goto L1d
        L1c:
            r1 = r2
        L1d:
            int r3 = r8.sx()
            r4 = 2
            r5 = 406(0x196, float:5.69E-43)
            r6 = 417(0x1a1, float:5.84E-43)
            r7 = 407(0x197, float:5.7E-43)
            if (r3 == r4) goto L79
            r4 = 3
            if (r3 == r4) goto L79
            r4 = 4
            if (r3 == r4) goto L35
            r4 = 8
            if (r3 == r4) goto L79
            goto L8d
        L35:
            com.bytedance.sdk.openadsdk.core.model.ycc r3 = r8.mjd()
            if (r3 != 0) goto L40
            com.bytedance.sdk.openadsdk.dg.xq.xq(r8, r0, r7)
            r1 = r7
            goto L8d
        L40:
            java.lang.String r4 = r3.xq()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L59
            java.lang.String r4 = r3.emc()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L59
            com.bytedance.sdk.openadsdk.dg.xq.xq(r8, r0, r6)
            r1 = r6
            goto L8d
        L59:
            java.lang.String r4 = r3.xq()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L69
            r1 = 416(0x1a0, float:5.83E-43)
            com.bytedance.sdk.openadsdk.dg.xq.xq(r8, r0, r1)
            goto L8d
        L69:
            java.lang.String r3 = r3.emc()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L8d
            r1 = 408(0x198, float:5.72E-43)
            com.bytedance.sdk.openadsdk.dg.xq.xq(r8, r0, r1)
            goto L8d
        L79:
            boolean r3 = dg(r8)
            if (r3 == 0) goto L8d
            java.lang.String r3 = r8.xst()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L8d
            com.bytedance.sdk.openadsdk.dg.xq.xq(r8, r0, r5)
            r1 = r5
        L8d:
            if (r1 == r6) goto L9a
            if (r1 == r7) goto L9a
            if (r1 != r5) goto L94
            goto L9a
        L94:
            if (r1 == r2) goto L99
            com.bytedance.sdk.openadsdk.dg.xq.ypw(r8, r0, r1)
        L99:
            return r2
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ypw.ypw(com.bytedance.sdk.openadsdk.core.model.rie):int");
    }

    private static void emc(List<com.bytedance.sdk.openadsdk.core.model.rie> list, com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = list.get(0);
        if (!emcVar.ru() || rieVar == null || !rieVar.gn() || com.bytedance.sdk.openadsdk.utils.tp.xmt() == 0) {
            return;
        }
        emcVar.ypw(0);
        rieVar.zz(false);
    }

    @Nullable
    public static com.bytedance.sdk.openadsdk.core.model.rie emc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return emc(jSONObject, null, null, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x06b7 A[PHI: r0
  0x06b7: PHI (r0v88 int) = (r0v87 int), (r0v138 int) binds: [B:169:0x06a3, B:174:0x06b4] A[DONT_GENERATE, DONT_INLINE]] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bytedance.sdk.openadsdk.core.model.rie emc(org.json.JSONObject r17, com.bytedance.sdk.openadsdk.AdSlot r18, com.bytedance.sdk.openadsdk.core.model.sb r19, com.bytedance.sdk.openadsdk.core.model.emc r20, int r21) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 2114
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ypw.emc(org.json.JSONObject, com.bytedance.sdk.openadsdk.AdSlot, com.bytedance.sdk.openadsdk.core.model.sb, com.bytedance.sdk.openadsdk.core.model.emc, int):com.bytedance.sdk.openadsdk.core.model.rie");
    }

    private static void emc(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("iv_skip_time", -1);
            int iOptInt2 = jSONObject.optInt("rv_skip_time", -1);
            if (iOptInt != -1) {
                rieVar.hj(iOptInt);
            }
            if (iOptInt2 != -1) {
                rieVar.xhi(iOptInt2);
            }
        }
    }

    private static void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", -1);
            jSONObject.put("error_code", -1);
            com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar, str, "load_vast_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    private static Pair<com.bytedance.sdk.openadsdk.core.sup.emc, ypw.emc> emc(String str, int i10, int i11) {
        int iXq;
        int iBw;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i11 == 1 || i11 == 5) {
            iXq = 0;
            iBw = 0;
        } else {
            iXq = vw.xq(aa.emc());
            iBw = vw.bw(aa.emc());
            if (i10 == 2) {
                iBw = iXq;
                iXq = iBw;
            }
        }
        com.bytedance.sdk.openadsdk.core.sup.emc.emc.bw bwVar = new com.bytedance.sdk.openadsdk.core.sup.emc.emc.bw(aa.emc(), iXq, iBw);
        return new Pair<>(bwVar.emc(str, (File) null, new ArrayList()), bwVar.ycc);
    }

    private static void emc(com.bytedance.sdk.openadsdk.core.sup.emc emcVar, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        emcVar.emc(rieVar);
        if (!emc(rieVar.sx())) {
            rieVar.xmt(2);
        }
        rieVar.cf(1);
        rieVar.emc(emcVar);
        if (!TextUtils.isEmpty(emcVar.dg())) {
            rieVar.ul(emcVar.dg());
        }
        if (!TextUtils.isEmpty(emcVar.bw())) {
            rieVar.ylm(emcVar.bw());
        }
        rieVar.sba(emcVar.ycc());
        rieVar.emc((com.bytedance.sdk.openadsdk.core.model.ycc) null);
        b bVarIat = rieVar.iat();
        if (bVarIat == null) {
            bVarIat = new b();
        }
        bVarIat.D(emcVar.uym());
        bVarIat.j(emcVar.msw());
        bVarIat.G(null);
        bVarIat.K(null);
        bVarIat.h(null);
        rieVar.emc(bVarIat);
        if (emcVar.ypw() != null && !TextUtils.isEmpty(emcVar.ypw().bw())) {
            com.bytedance.sdk.openadsdk.core.model.sba sbaVar = new com.bytedance.sdk.openadsdk.core.model.sba();
            sbaVar.emc(emcVar.ypw().bw());
            sbaVar.emc(emcVar.ypw().ypw());
            sbaVar.ypw(emcVar.ypw().xq());
            rieVar.emc(sbaVar);
            return;
        }
        if (rieVar.ya() == null) {
            com.bytedance.sdk.openadsdk.core.model.sba sbaVar2 = new com.bytedance.sdk.openadsdk.core.model.sba();
            sbaVar2.emc("https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/static/images/2023620white.jpeg");
            sbaVar2.emc(98);
            sbaVar2.ypw(98);
            rieVar.emc(sbaVar2);
        }
    }

    @Nullable
    private static b emc(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.rie rieVar, boolean z10) {
        int iOptInt;
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        bVar.J(jSONObject.optInt("cover_height"));
        bVar.C(jSONObject.optInt("cover_width"));
        bVar.m(jSONObject.optString("resolution"));
        bVar.l(jSONObject.optLong("size"));
        double dOptDouble = jSONObject.optDouble("video_duration", 0.0d);
        bVar.j(dOptDouble);
        int i10 = 1;
        int iOptInt2 = jSONObject.optInt("replay_time", 1);
        if (dOptDouble <= 15.0d && rieVar.yid() != 1 && com.bytedance.sdk.openadsdk.core.model.rie.bw(rieVar)) {
            i10 = iOptInt2;
        }
        bVar.s(i10);
        bVar.K(jSONObject.optString("cover_url"));
        bVar.D(jSONObject.optString(CampaignEx.JSON_KEY_VIDEO_URL));
        bVar.h(jSONObject.optString(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD));
        bVar.d(jSONObject.optString("playable_download_url"));
        bVar.G(jSONObject.optString("file_hash"));
        bVar.p(jSONObject.optInt("if_playable_loading_show", 0));
        bVar.N(jSONObject.optInt("remove_loading_page_type", 0));
        bVar.k(jSONObject.optInt("fallback_endcard_judge", 0));
        bVar.c(jSONObject.optInt("video_preload_size", 307200));
        bVar.F(jSONObject.optInt("reward_video_cached_type", 0));
        bVar.z(jSONObject.optInt("execute_cached_type", 0));
        if (z10) {
            iOptInt = jSONObject.optInt("endcard_render", 0);
        } else {
            iOptInt = jSONObject.optInt("endcard_render", -1);
        }
        bVar.g(iOptInt);
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int emc(com.bytedance.sdk.openadsdk.core.model.rie r5) {
        /*
            r0 = 401(0x191, float:5.62E-43)
            r1 = 0
            if (r5 != 0) goto Lb
            java.lang.String r5 = ""
            com.bytedance.sdk.openadsdk.dg.xq.xq(r1, r5, r0)
            return r0
        Lb:
            int r2 = r5.blf()
            java.lang.String r2 = com.bytedance.sdk.openadsdk.utils.tp.xq(r2)
            java.lang.String r3 = r5.ye()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto Lbd
            java.lang.String r3 = r5.ye()
            int r3 = r3.length()
            r4 = 1
            if (r3 > r4) goto L2a
            goto Lbd
        L2a:
            boolean r3 = r5.yvi()
            if (r3 == 0) goto L64
            int r3 = r5.blf()
            if (r3 >= 0) goto L47
            com.bytedance.sdk.openadsdk.AdSlot r3 = r5.vaf()
            if (r3 == 0) goto L44
            com.bytedance.sdk.openadsdk.AdSlot r3 = r5.vaf()
            r3.getDurationSlotType()
            goto L47
        L44:
            r5.mfx()
        L47:
            boolean r3 = r5.tze()
            if (r3 == 0) goto L4f
            java.lang.String r2 = "fullscreen_interstitial_ad"
        L4f:
            java.lang.String r3 = r5.al()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L5f
            java.lang.String r3 = "load_html_fail"
            com.bytedance.sdk.openadsdk.dg.xq.ypw(r5, r2, r3, r1)
            return r0
        L5f:
            java.lang.String r0 = "load_html_success"
            com.bytedance.sdk.openadsdk.dg.xq.ypw(r5, r2, r0, r1)
        L64:
            int r0 = r5.aod()
            if (r0 != 0) goto La9
            int r0 = r5.in()
            r1 = 2
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L9b
            r1 = 3
            if (r0 == r1) goto L9b
            r1 = 4
            if (r0 == r1) goto L9b
            r1 = 5
            if (r0 == r1) goto L89
            r1 = 15
            if (r0 == r1) goto L89
            r1 = 16
            if (r0 == r1) goto L9b
            r1 = 50
            if (r0 == r1) goto L89
            goto La9
        L89:
            com.bykv.vk.openvk.emc.emc.emc.xq.b r0 = r5.iat()
            boolean r1 = r5.ak()
            int r0 = emc(r0, r1)
            if (r0 == r3) goto La9
            com.bytedance.sdk.openadsdk.dg.xq.xq(r5, r2, r0)
            return r0
        L9b:
            java.util.List r0 = r5.rr()
            int r0 = emc(r0)
            if (r0 == r3) goto La9
            com.bytedance.sdk.openadsdk.dg.xq.xq(r5, r2, r0)
            return r0
        La9:
            com.bytedance.sdk.openadsdk.core.settings.gbl r0 = com.bytedance.sdk.openadsdk.core.settings.gbl.xq()
            boolean r0 = r0.hxp()
            if (r0 == 0) goto Lb8
            int r5 = xq(r5)
            return r5
        Lb8:
            int r5 = ypw(r5)
            return r5
        Lbd:
            r0 = 402(0x192, float:5.63E-43)
            com.bytedance.sdk.openadsdk.dg.xq.xq(r5, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ypw.emc(com.bytedance.sdk.openadsdk.core.model.rie):int");
    }

    private static int emc(com.bytedance.sdk.openadsdk.core.model.sz szVar) {
        if (szVar == null) {
            return 200;
        }
        if (TextUtils.isEmpty(szVar.emc())) {
            return TTAdConstant.DEEPLINK_UNAVAILABLE_CODE;
        }
        if (TextUtils.isEmpty(szVar.ypw())) {
            return TTAdConstant.DEEPLINK_FALLBACK_CODE;
        }
        if (szVar.xq() == 1 || szVar.xq() == 2) {
            return 200;
        }
        return TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE;
    }

    private static int emc(b bVar, boolean z10) {
        if (bVar == null) {
            return TTAdConstant.VIDEO_INFO_CODE;
        }
        if (TextUtils.isEmpty(bVar.n())) {
            return TTAdConstant.VIDEO_URL_CODE;
        }
        if (z10 || !TextUtils.isEmpty(bVar.r())) {
            return 200;
        }
        return TTAdConstant.VIDEO_COVER_URL_CODE;
    }

    private static int emc(com.bytedance.sdk.openadsdk.core.model.ycc yccVar) {
        if (yccVar == null) {
            return TTAdConstant.DOWNLOAD_APP_INFO_CODE;
        }
        if (TextUtils.isEmpty(yccVar.emc())) {
            return TTAdConstant.DOWNLOAD_URL_CODE;
        }
        if (TextUtils.isEmpty(yccVar.xq())) {
            return TTAdConstant.PACKAGE_NAME_CODE;
        }
        return 200;
    }

    private static int emc(List<com.bytedance.sdk.openadsdk.core.model.sba> list) {
        if (list == null) {
            return TTAdConstant.IMAGE_LIST_CODE;
        }
        if (list.size() <= 0) {
            return TTAdConstant.IMAGE_LIST_SIZE_CODE;
        }
        for (com.bytedance.sdk.openadsdk.core.model.sba sbaVar : list) {
            if (sbaVar == null) {
                return TTAdConstant.IMAGE_CODE;
            }
            if (TextUtils.isEmpty(sbaVar.emc())) {
                return TTAdConstant.IMAGE_URL_CODE;
            }
        }
        return 200;
    }

    private static void emc(final ArrayList<emc> arrayList) {
        com.bytedance.sdk.openadsdk.vk.xq.emc("multiple_ads_parsing_error", false, new com.bytedance.sdk.openadsdk.vk.ypw() { // from class: com.bytedance.sdk.openadsdk.core.ypw.1
            @Override // com.bytedance.sdk.openadsdk.vk.ypw
            @Nullable
            public com.bytedance.sdk.openadsdk.vk.emc.xq emc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("material_error", arrayList.size());
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    emc emcVar = (emc) obj;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(BidResponsedEx.KEY_CID, emcVar.emc);
                    jSONObject2.put("error_msg", emcVar.ypw);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("error_cid_list", jSONArray);
                return com.bytedance.sdk.openadsdk.vk.emc.dg.ypw().emc("multiple_ads_parsing_error").ypw(jSONObject.toString());
            }
        });
    }
}
