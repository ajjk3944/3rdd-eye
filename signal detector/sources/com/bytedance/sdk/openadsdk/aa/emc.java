package com.bytedance.sdk.openadsdk.aa;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ul;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc implements Comparable<emc> {
    private int bw;
    private long qh;
    private int uym;
    private int xq;
    private final String ypw;
    private final ArrayList<Long> emc = new ArrayList<>();
    private final ArrayList<Long> dg = new ArrayList<>();
    private final ArrayList<Long> ycc = new ArrayList<>();
    private final ArrayList<Long> msw = new ArrayList<>();
    private final HashMap<String, ypw> zz = new HashMap<>();
    private int ru = 0;
    private int gbl = 0;
    private final HashMap<String, ypw> sup = new HashMap<>();
    private int sz = 0;
    private final ArrayList<String> cf = new ArrayList<>();

    public emc(String str) {
        this.ypw = str;
    }

    private void ypw(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i;
        int i3;
        int i6;
        int[] iArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int[] iArrSup = com.bytedance.sdk.openadsdk.ycc.emc.emc().sup();
        if (iArrSup != null) {
            int i7 = 0;
            while (i7 < iArrSup.length) {
                int i8 = iArrSup[i7];
                long j6 = 60000;
                long j7 = jElapsedRealtime - (i8 * 60000);
                Iterator<String> it = this.sup.keySet().iterator();
                long j8 = 0;
                while (it.hasNext()) {
                    long j9 = j6;
                    String next = it.next();
                    Iterator<String> it2 = it;
                    ypw ypwVar = this.sup.get(next);
                    if (ypwVar != null) {
                        long jEmc = ypwVar.emc(j7, jElapsedRealtime);
                        j8 += jEmc;
                        if (jEmc <= 0 && i7 == iArrSup.length - 1) {
                            hashSet.add(next);
                        }
                    }
                    it = it2;
                    j6 = j9;
                }
                if (j8 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i8)), j8);
                    iArr = iArrSup;
                    long jOptInt = jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i8))) + j8;
                    if (jOptInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i8)), jOptInt);
                    }
                } else {
                    iArr = iArrSup;
                }
                i7++;
                iArrSup = iArr;
            }
        }
        int[] iArrSz = com.bytedance.sdk.openadsdk.ycc.emc.emc().sz();
        if (iArrSz != null) {
            int i9 = 0;
            while (i9 < iArrSz.length) {
                int i10 = iArrSz[i9];
                long j10 = jElapsedRealtime - (i10 * 60000);
                long j11 = 0;
                int i11 = 0;
                for (String str : this.zz.keySet()) {
                    HashSet hashSet3 = hashSet;
                    int i12 = i10;
                    ypw ypwVar2 = this.zz.get(str);
                    if (ypwVar2 != null) {
                        long jEmc2 = ypwVar2.emc(j10, jElapsedRealtime);
                        j11 += jEmc2;
                        if (jEmc2 > 20000) {
                            i11++;
                        }
                        if (jEmc2 <= 0 && i9 == iArrSz.length - 1) {
                            hashSet2.add(str);
                        }
                    }
                    i10 = i12;
                    hashSet = hashSet3;
                }
                HashSet hashSet4 = hashSet;
                int i13 = i10;
                if (j11 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i13)), j11);
                    long jOptInt2 = jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i13))) + j11;
                    if (jOptInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i13)), jOptInt2);
                    }
                }
                if (i11 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i13)), i11);
                    int iOptInt = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i13))) + i11;
                    if (iOptInt != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i13)), iOptInt);
                    }
                }
                i9++;
                hashSet = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet;
        if (!hashSet5.isEmpty()) {
            Iterator it3 = hashSet5.iterator();
            while (it3.hasNext()) {
                this.sup.remove((String) it3.next());
            }
        }
        if (!hashSet2.isEmpty()) {
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                this.zz.remove((String) it4.next());
            }
        }
        if (com.bytedance.sdk.openadsdk.ycc.emc.emc().cf() && (i6 = this.ru) != 0) {
            jSONObject.put("v_stay_t_s", i6);
            int iOptInt2 = jSONObject2.optInt("v_stay_t_s") + this.ru;
            if (iOptInt2 != 0) {
                jSONObject2.put("v_stay_t_s", iOptInt2);
            }
        }
        if (com.bytedance.sdk.openadsdk.ycc.emc.emc().qh() && (i3 = this.sz) != 0) {
            jSONObject.put("lp_stay_t_s", i3);
            int iOptInt3 = jSONObject2.optInt("lp_stay_t_s") + this.sz;
            if (iOptInt3 != 0) {
                jSONObject2.put("lp_stay_t_s", iOptInt3);
            }
        }
        if (!com.bytedance.sdk.openadsdk.ycc.emc.emc().aa() || (i = this.gbl) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i);
        int iOptInt4 = jSONObject2.optInt("v_30p_play_c_s") + this.gbl;
        if (iOptInt4 != 0) {
            jSONObject2.put("v_30p_play_c_s", iOptInt4);
        }
    }

    public void emc(String str, String str2) {
        ypw ypwVar;
        ypw ypwVar2;
        ypw ypwVar3;
        ypw ypwVar4;
        ypw ypwVar5;
        ypw ypwVar6;
        str.getClass();
        switch (str) {
            case "landingContinue":
                if (!TextUtils.isEmpty(str2) && (ypwVar = this.sup.get(str2)) != null) {
                    ypwVar.dg(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingPause":
                if (!TextUtils.isEmpty(str2) && (ypwVar2 = this.sup.get(str2)) != null) {
                    ypwVar2.xq(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingStart":
                if (!TextUtils.isEmpty(str2) && this.sup.get(str2) == null) {
                    ypw ypwVar7 = new ypw();
                    this.sup.put(str2, ypwVar7);
                    ypwVar7.emc(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_over":
            case "feed_break":
            case "videoForceBreak":
            case "play_error":
                if (!TextUtils.isEmpty(str2) && (ypwVar3 = this.zz.get(str2)) != null && ypwVar3.emc() != ypw.bw) {
                    ypwVar3.ypw(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.ycc.emc.emc().cf()) {
                        this.ru = (int) (ypwVar3.emc(this.qh, SystemClock.elapsedRealtime()) + this.ru);
                        break;
                    }
                }
                break;
            case "feed_play":
                this.ycc.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.ycc.emc.emc().msw()) {
                    this.uym++;
                }
                if (!TextUtils.isEmpty(str2) && this.zz.get(str2) == null) {
                    ypw ypwVar8 = new ypw();
                    this.zz.put(str2, ypwVar8);
                    ypwVar8.emc(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "show":
                this.emc.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.ycc.emc.emc().ycc()) {
                    this.xq++;
                    break;
                }
                break;
            case "click":
                if (!this.cf.contains(str2)) {
                    if (this.cf.size() > 50) {
                        this.cf.subList(0, 25).clear();
                    }
                    this.cf.add(str2);
                    this.dg.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    if (com.bytedance.sdk.openadsdk.ycc.emc.emc().uym()) {
                        this.bw++;
                        break;
                    }
                }
                break;
            case "feed_continue":
                if (!TextUtils.isEmpty(str2) && (ypwVar4 = this.zz.get(str2)) != null) {
                    ypwVar4.dg(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_pause":
                if (!TextUtils.isEmpty(str2) && (ypwVar5 = this.zz.get(str2)) != null) {
                    ypwVar5.xq(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingFinish":
                if (!TextUtils.isEmpty(str2) && (ypwVar6 = this.sup.get(str2)) != null && ypwVar6.emc() != ypw.bw) {
                    ypwVar6.ypw(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.ycc.emc.emc().qh()) {
                        this.sz = (int) (ypwVar6.emc(this.qh, SystemClock.elapsedRealtime()) + this.sz);
                        break;
                    }
                }
                break;
            case "videoPercent30":
                if (com.bytedance.sdk.openadsdk.ycc.emc.emc().aa()) {
                    this.gbl++;
                    break;
                }
                break;
            case "dislike":
                this.msw.add(Long.valueOf(SystemClock.elapsedRealtime()));
                break;
        }
    }

    public JSONObject emc(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            emc(jSONObject2, jSONObject);
            ypw(jSONObject2, jSONObject);
            return jSONObject2;
        } catch (Throwable th) {
            ul.xq(th.getMessage(), new Object[0]);
            return jSONObject2;
        }
    }

    public String ypw() {
        return this.ypw;
    }

    private void emc(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j6, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i = 0;
        for (int i3 : iArr) {
            long j7 = j6 - (i3 * 60000);
            while (size >= 0 && arrayList.get(size).longValue() >= j7) {
                i++;
                size--;
            }
            if (i != 0) {
                jSONObject.put(str + i3, i);
                int iOptInt = jSONObject2.optInt(str + i3) + i;
                if (iOptInt != 0) {
                    jSONObject2.put(str + i3, iOptInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    private void emc(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i;
        int i3;
        int i6;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        emc("show_c_", jSONObject, this.emc, com.bytedance.sdk.openadsdk.ycc.emc.emc().zz(), jElapsedRealtime, jSONObject2);
        emc("click_c_", jSONObject, this.dg, com.bytedance.sdk.openadsdk.ycc.emc.emc().ru(), jElapsedRealtime, jSONObject2);
        emc("v_play_c_", jSONObject, this.ycc, com.bytedance.sdk.openadsdk.ycc.emc.emc().gbl(), jElapsedRealtime, jSONObject2);
        emc("dislike_c_", jSONObject, this.msw, com.bytedance.sdk.openadsdk.ycc.emc.emc().vk(), jElapsedRealtime, jSONObject2);
        if (com.bytedance.sdk.openadsdk.ycc.emc.emc().ycc() && (i6 = this.xq) != 0) {
            jSONObject.put("show_c_s", i6);
            int iOptInt = jSONObject2.optInt("show_c_s") + this.xq;
            if (iOptInt != 0) {
                jSONObject2.put("show_c_s", iOptInt);
            }
        }
        if (com.bytedance.sdk.openadsdk.ycc.emc.emc().uym() && (i3 = this.bw) != 0) {
            jSONObject.put("click_c_s", i3);
            int iOptInt2 = jSONObject2.optInt("click_c_s") + this.bw;
            if (iOptInt2 != 0) {
                jSONObject2.put("click_c_s", iOptInt2);
            }
        }
        if (!com.bytedance.sdk.openadsdk.ycc.emc.emc().msw() || (i = this.uym) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i);
        int iOptInt3 = jSONObject2.optInt("v_play_c_s") + this.uym;
        if (iOptInt3 != 0) {
            jSONObject2.put("v_play_c_s", iOptInt3);
        }
    }

    public void emc() {
        this.qh = SystemClock.elapsedRealtime();
        this.gbl = 0;
        this.bw = 0;
        this.xq = 0;
        this.sz = 0;
        this.ru = 0;
        this.uym = 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public int compareTo(emc emcVar) {
        return emcVar.xq - this.xq;
    }
}
