package com.bytedance.sdk.openadsdk.aa;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ul;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
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

    private void ypw(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i10;
        int i11;
        int i12;
        int[] iArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int[] iArrSup = com.bytedance.sdk.openadsdk.ycc.emc.emc().sup();
        if (iArrSup != null) {
            int i13 = 0;
            while (i13 < iArrSup.length) {
                int i14 = iArrSup[i13];
                long j10 = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                long j11 = jElapsedRealtime - (i14 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                Iterator<String> it = this.sup.keySet().iterator();
                long j12 = 0;
                while (it.hasNext()) {
                    long j13 = j10;
                    String next = it.next();
                    Iterator<String> it2 = it;
                    ypw ypwVar = this.sup.get(next);
                    if (ypwVar != null) {
                        long jEmc = ypwVar.emc(j11, jElapsedRealtime);
                        j12 += jEmc;
                        if (jEmc <= 0 && i13 == iArrSup.length - 1) {
                            hashSet.add(next);
                        }
                    }
                    it = it2;
                    j10 = j13;
                }
                if (j12 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i14)), j12);
                    iArr = iArrSup;
                    long jOptInt = jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i14))) + j12;
                    if (jOptInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i14)), jOptInt);
                    }
                } else {
                    iArr = iArrSup;
                }
                i13++;
                iArrSup = iArr;
            }
        }
        int[] iArrSz = com.bytedance.sdk.openadsdk.ycc.emc.emc().sz();
        if (iArrSz != null) {
            int i15 = 0;
            while (i15 < iArrSz.length) {
                int i16 = iArrSz[i15];
                long j14 = jElapsedRealtime - (i16 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                long j15 = 0;
                int i17 = 0;
                for (String str : this.zz.keySet()) {
                    HashSet hashSet3 = hashSet;
                    int i18 = i16;
                    ypw ypwVar2 = this.zz.get(str);
                    if (ypwVar2 != null) {
                        long jEmc2 = ypwVar2.emc(j14, jElapsedRealtime);
                        j15 += jEmc2;
                        if (jEmc2 > 20000) {
                            i17++;
                        }
                        if (jEmc2 <= 0 && i15 == iArrSz.length - 1) {
                            hashSet2.add(str);
                        }
                    }
                    i16 = i18;
                    hashSet = hashSet3;
                }
                HashSet hashSet4 = hashSet;
                int i19 = i16;
                if (j15 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i19)), j15);
                    long jOptInt2 = jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i19))) + j15;
                    if (jOptInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i19)), jOptInt2);
                    }
                }
                if (i17 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i19)), i17);
                    int iOptInt = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i19))) + i17;
                    if (iOptInt != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i19)), iOptInt);
                    }
                }
                i15++;
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
        if (com.bytedance.sdk.openadsdk.ycc.emc.emc().cf() && (i12 = this.ru) != 0) {
            jSONObject.put("v_stay_t_s", i12);
            int iOptInt2 = jSONObject2.optInt("v_stay_t_s") + this.ru;
            if (iOptInt2 != 0) {
                jSONObject2.put("v_stay_t_s", iOptInt2);
            }
        }
        if (com.bytedance.sdk.openadsdk.ycc.emc.emc().qh() && (i11 = this.sz) != 0) {
            jSONObject.put("lp_stay_t_s", i11);
            int iOptInt3 = jSONObject2.optInt("lp_stay_t_s") + this.sz;
            if (iOptInt3 != 0) {
                jSONObject2.put("lp_stay_t_s", iOptInt3);
            }
        }
        if (!com.bytedance.sdk.openadsdk.ycc.emc.emc().aa() || (i10 = this.gbl) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i10);
        int iOptInt4 = jSONObject2.optInt("v_30p_play_c_s") + this.gbl;
        if (iOptInt4 != 0) {
            jSONObject2.put("v_30p_play_c_s", iOptInt4);
        }
    }

    public void emc(@NonNull String str, @Nullable String str2) {
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
                        this.ru = (int) (this.ru + ypwVar3.emc(this.qh, SystemClock.elapsedRealtime()));
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
                        this.sz = (int) (this.sz + ypwVar6.emc(this.qh, SystemClock.elapsedRealtime()));
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

    private void emc(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j10, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i10 = 0;
        for (int i11 : iArr) {
            long j11 = j10 - (i11 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            while (size >= 0 && arrayList.get(size).longValue() >= j11) {
                i10++;
                size--;
            }
            if (i10 != 0) {
                jSONObject.put(str + i11, i10);
                int iOptInt = jSONObject2.optInt(str + i11) + i10;
                if (iOptInt != 0) {
                    jSONObject2.put(str + i11, iOptInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    private void emc(@NonNull JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i10;
        int i11;
        int i12;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        emc("show_c_", jSONObject, this.emc, com.bytedance.sdk.openadsdk.ycc.emc.emc().zz(), jElapsedRealtime, jSONObject2);
        emc("click_c_", jSONObject, this.dg, com.bytedance.sdk.openadsdk.ycc.emc.emc().ru(), jElapsedRealtime, jSONObject2);
        emc("v_play_c_", jSONObject, this.ycc, com.bytedance.sdk.openadsdk.ycc.emc.emc().gbl(), jElapsedRealtime, jSONObject2);
        emc("dislike_c_", jSONObject, this.msw, com.bytedance.sdk.openadsdk.ycc.emc.emc().vk(), jElapsedRealtime, jSONObject2);
        if (com.bytedance.sdk.openadsdk.ycc.emc.emc().ycc() && (i12 = this.xq) != 0) {
            jSONObject.put("show_c_s", i12);
            int iOptInt = jSONObject2.optInt("show_c_s") + this.xq;
            if (iOptInt != 0) {
                jSONObject2.put("show_c_s", iOptInt);
            }
        }
        if (com.bytedance.sdk.openadsdk.ycc.emc.emc().uym() && (i11 = this.bw) != 0) {
            jSONObject.put("click_c_s", i11);
            int iOptInt2 = jSONObject2.optInt("click_c_s") + this.bw;
            if (iOptInt2 != 0) {
                jSONObject2.put("click_c_s", iOptInt2);
            }
        }
        if (!com.bytedance.sdk.openadsdk.ycc.emc.emc().msw() || (i10 = this.uym) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i10);
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
