package com.bytedance.sdk.openadsdk.zih;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.qbp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements Comparable<ouw> {
    private int fkw;

    /* renamed from: jg, reason: collision with root package name */
    private long f8855jg;

    /* renamed from: lh, reason: collision with root package name */
    private int f8857lh;
    public final String ouw;
    private int ra;
    private final ArrayList<Long> vt = new ArrayList<>();
    private final ArrayList<Long> yu = new ArrayList<>();

    /* renamed from: le, reason: collision with root package name */
    private final ArrayList<Long> f8856le = new ArrayList<>();
    private final ArrayList<Long> pno = new ArrayList<>();
    private final HashMap<String, vt> bly = new HashMap<>();
    private int tlj = 0;

    /* renamed from: cf, reason: collision with root package name */
    private int f8854cf = 0;
    private final HashMap<String, vt> ryl = new HashMap<>();
    private int mwh = 0;
    private final ArrayList<String> ko = new ArrayList<>();

    public ouw(String str) {
        this.ouw = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ouw ouwVar) {
        return ouwVar.f8857lh - this.f8857lh;
    }

    public final void ouw(String str, String str2) {
        vt vtVar;
        vt vtVar2;
        vt vtVar3;
        vt vtVar4;
        vt vtVar5;
        vt vtVar6;
        str.getClass();
        switch (str) {
            case "landingContinue":
                if (!TextUtils.isEmpty(str2) && (vtVar = this.ryl.get(str2)) != null) {
                    vtVar.yu(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingPause":
                if (!TextUtils.isEmpty(str2) && (vtVar2 = this.ryl.get(str2)) != null) {
                    vtVar2.lh(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingStart":
                if (!TextUtils.isEmpty(str2) && this.ryl.get(str2) == null) {
                    vt vtVar7 = new vt();
                    this.ryl.put(str2, vtVar7);
                    vtVar7.ouw(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_over":
            case "feed_break":
            case "videoForceBreak":
            case "play_error":
                if (!TextUtils.isEmpty(str2) && (vtVar3 = this.bly.get(str2)) != null && vtVar3.f8859le != vt.fkw) {
                    vtVar3.vt(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.le.ouw.ouw().tlj) {
                        this.tlj = (int) (vtVar3.ouw(this.f8855jg, SystemClock.elapsedRealtime()) + this.tlj);
                        break;
                    }
                }
                break;
            case "feed_play":
                this.f8856le.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.le.ouw.ouw().f8564lh) {
                    this.ra++;
                }
                if (!TextUtils.isEmpty(str2) && this.bly.get(str2) == null) {
                    vt vtVar8 = new vt();
                    this.bly.put(str2, vtVar8);
                    vtVar8.ouw(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "show":
                this.vt.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.le.ouw.ouw().ouw) {
                    this.f8857lh++;
                    break;
                }
                break;
            case "click":
                if (!this.ko.contains(str2)) {
                    if (this.ko.size() > 50) {
                        this.ko.subList(0, 25).clear();
                    }
                    this.ko.add(str2);
                    this.yu.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    if (com.bytedance.sdk.openadsdk.le.ouw.ouw().vt) {
                        this.fkw++;
                        break;
                    }
                }
                break;
            case "feed_continue":
                if (!TextUtils.isEmpty(str2) && (vtVar4 = this.bly.get(str2)) != null) {
                    vtVar4.yu(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_pause":
                if (!TextUtils.isEmpty(str2) && (vtVar5 = this.bly.get(str2)) != null) {
                    vtVar5.lh(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingFinish":
                if (!TextUtils.isEmpty(str2) && (vtVar6 = this.ryl.get(str2)) != null && vtVar6.f8859le != vt.fkw) {
                    vtVar6.vt(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.le.ouw.ouw().bly) {
                        this.mwh = (int) (vtVar6.ouw(this.f8855jg, SystemClock.elapsedRealtime()) + this.mwh);
                        break;
                    }
                }
                break;
            case "videoPercent30":
                if (com.bytedance.sdk.openadsdk.le.ouw.ouw().ryl) {
                    this.f8854cf++;
                    break;
                }
                break;
            case "dislike":
                this.pno.add(Long.valueOf(SystemClock.elapsedRealtime()));
                break;
        }
    }

    public final JSONObject ouw(JSONObject jSONObject) {
        int i4;
        int i10;
        int i11;
        JSONObject jSONObject2 = new JSONObject();
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ouw("show_c_", jSONObject2, this.vt, com.bytedance.sdk.openadsdk.le.ouw.ouw().yu, jElapsedRealtime, jSONObject);
            ouw("click_c_", jSONObject2, this.yu, com.bytedance.sdk.openadsdk.le.ouw.ouw().fkw, jElapsedRealtime, jSONObject);
            ouw("v_play_c_", jSONObject2, this.f8856le, com.bytedance.sdk.openadsdk.le.ouw.ouw().f8563le, jElapsedRealtime, jSONObject);
            ouw("dislike_c_", jSONObject2, this.pno, com.bytedance.sdk.openadsdk.le.ouw.ouw().f8561cf, jElapsedRealtime, jSONObject);
            if (com.bytedance.sdk.openadsdk.le.ouw.ouw().ouw && (i11 = this.f8857lh) != 0) {
                jSONObject2.put("show_c_s", i11);
                int iOptInt = jSONObject.optInt("show_c_s") + this.f8857lh;
                if (iOptInt != 0) {
                    jSONObject.put("show_c_s", iOptInt);
                }
            }
            if (com.bytedance.sdk.openadsdk.le.ouw.ouw().vt && (i10 = this.fkw) != 0) {
                jSONObject2.put("click_c_s", i10);
                int iOptInt2 = jSONObject.optInt("click_c_s") + this.fkw;
                if (iOptInt2 != 0) {
                    jSONObject.put("click_c_s", iOptInt2);
                }
            }
            if (com.bytedance.sdk.openadsdk.le.ouw.ouw().f8564lh && (i4 = this.ra) != 0) {
                jSONObject2.put("v_play_c_s", i4);
                int iOptInt3 = jSONObject.optInt("v_play_c_s") + this.ra;
                if (iOptInt3 != 0) {
                    jSONObject.put("v_play_c_s", iOptInt3);
                }
            }
            ouw(jSONObject2, jSONObject);
            return jSONObject2;
        } catch (Throwable th2) {
            qbp.yu(th2.getMessage(), new Object[0]);
            return jSONObject2;
        }
    }

    private static void ouw(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i4 = 0;
        for (int i10 : iArr) {
            long j8 = j - (i10 * 60000);
            while (size >= 0 && arrayList.get(size).longValue() >= j8) {
                i4++;
                size--;
            }
            if (i4 != 0) {
                jSONObject.put(str + i10, i4);
                int iOptInt = jSONObject2.optInt(str + i10) + i4;
                if (iOptInt != 0) {
                    jSONObject2.put(str + i10, iOptInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    private void ouw(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i4;
        int i10;
        int i11;
        int[] iArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int[] iArr2 = com.bytedance.sdk.openadsdk.le.ouw.ouw().ra;
        if (iArr2 != null) {
            int i12 = 0;
            while (i12 < iArr2.length) {
                int i13 = iArr2[i12];
                long j = 60000;
                long j8 = jElapsedRealtime - (i13 * 60000);
                Iterator<String> it = this.ryl.keySet().iterator();
                long j9 = 0;
                while (it.hasNext()) {
                    long j10 = j;
                    String next = it.next();
                    Iterator<String> it2 = it;
                    vt vtVar = this.ryl.get(next);
                    if (vtVar != null) {
                        long jOuw = vtVar.ouw(j8, jElapsedRealtime);
                        j9 += jOuw;
                        if (jOuw <= 0 && i12 == iArr2.length - 1) {
                            hashSet.add(next);
                        }
                    }
                    it = it2;
                    j = j10;
                }
                if (j9 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i13)), j9);
                    iArr = iArr2;
                    long jOptInt = jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i13))) + j9;
                    if (jOptInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i13)), jOptInt);
                    }
                } else {
                    iArr = iArr2;
                }
                i12++;
                iArr2 = iArr;
            }
        }
        int[] iArr3 = com.bytedance.sdk.openadsdk.le.ouw.ouw().pno;
        if (iArr3 != null) {
            int i14 = 0;
            while (i14 < iArr3.length) {
                int i15 = iArr3[i14];
                long j11 = jElapsedRealtime - (i15 * 60000);
                long j12 = 0;
                int i16 = 0;
                for (String str : this.bly.keySet()) {
                    HashSet hashSet3 = hashSet;
                    int i17 = i15;
                    vt vtVar2 = this.bly.get(str);
                    if (vtVar2 != null) {
                        long jOuw2 = vtVar2.ouw(j11, jElapsedRealtime);
                        j12 += jOuw2;
                        if (jOuw2 > 20000) {
                            i16++;
                        }
                        if (jOuw2 <= 0 && i14 == iArr3.length - 1) {
                            hashSet2.add(str);
                        }
                    }
                    i15 = i17;
                    hashSet = hashSet3;
                }
                HashSet hashSet4 = hashSet;
                int i18 = i15;
                if (j12 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i18)), j12);
                    long jOptInt2 = jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i18))) + j12;
                    if (jOptInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i18)), jOptInt2);
                    }
                }
                if (i16 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i18)), i16);
                    int iOptInt = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i18))) + i16;
                    if (iOptInt != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i18)), iOptInt);
                    }
                }
                i14++;
                hashSet = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet;
        if (!hashSet5.isEmpty()) {
            Iterator it3 = hashSet5.iterator();
            while (it3.hasNext()) {
                this.ryl.remove((String) it3.next());
            }
        }
        if (!hashSet2.isEmpty()) {
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                this.bly.remove((String) it4.next());
            }
        }
        if (com.bytedance.sdk.openadsdk.le.ouw.ouw().tlj && (i11 = this.tlj) != 0) {
            jSONObject.put("v_stay_t_s", i11);
            int iOptInt2 = jSONObject2.optInt("v_stay_t_s") + this.tlj;
            if (iOptInt2 != 0) {
                jSONObject2.put("v_stay_t_s", iOptInt2);
            }
        }
        if (com.bytedance.sdk.openadsdk.le.ouw.ouw().bly && (i10 = this.mwh) != 0) {
            jSONObject.put("lp_stay_t_s", i10);
            int iOptInt3 = jSONObject2.optInt("lp_stay_t_s") + this.mwh;
            if (iOptInt3 != 0) {
                jSONObject2.put("lp_stay_t_s", iOptInt3);
            }
        }
        if (!com.bytedance.sdk.openadsdk.le.ouw.ouw().ryl || (i4 = this.f8854cf) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i4);
        int iOptInt4 = jSONObject2.optInt("v_30p_play_c_s") + this.f8854cf;
        if (iOptInt4 != 0) {
            jSONObject2.put("v_30p_play_c_s", iOptInt4);
        }
    }

    public final void ouw() {
        this.f8855jg = SystemClock.elapsedRealtime();
        this.f8854cf = 0;
        this.fkw = 0;
        this.f8857lh = 0;
        this.mwh = 0;
        this.tlj = 0;
        this.ra = 0;
    }
}
