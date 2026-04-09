package com.bytedance.sdk.openadsdk.core.sup.xq;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.msw.msw;
import com.bytedance.sdk.component.utils.uym;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.bw;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sup.emc.ypw;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg {
    public static final List<String> emc = Arrays.asList(MimeTypes.VIDEO_MP4, MimeTypes.VIDEO_H263);
    private static final ConcurrentHashMap<String, Boolean> ypw = new ConcurrentHashMap<>();

    private static double ypw(String str) {
        if (str == null) {
            str = "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1664118616) {
            return (iHashCode == 1331848029 && str.equals(MimeTypes.VIDEO_MP4)) ? 1.5d : 1.0d;
        }
        str.equals(MimeTypes.VIDEO_H263);
        return 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ypw(rie rieVar, File file, bw.emc emcVar, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.core.sup.emc.emc.bw bwVar = new com.bytedance.sdk.openadsdk.core.sup.emc.emc.bw(aa.emc(), 0, 0);
        com.bytedance.sdk.openadsdk.core.sup.emc emcVarEmc = bwVar.emc((String) null, file, new ArrayList());
        if (emcVarEmc != null) {
            emcVar.emc(emcVarEmc.emc());
            emcVar.emc(emcVarEmc.sz());
        }
        ypw(rieVar, emcVar.xq(), true, j10);
        emc(rieVar, "vast_url", emcVarEmc, jElapsedRealtime, bwVar.ycc);
        ypw();
    }

    public static double emc(int i10, double d10, int i11, int i12, int i13, @Nullable String str) {
        double dEmc = emc(i10, d10, i11, i12);
        return ypw(str) * (1.0d / ((dEmc + 1.0d) + emc(i13)));
    }

    private static double emc(int i10, double d10, int i11, int i12) {
        return (d10 > 0.0d ? Math.abs(d10 - (i12 > 0 ? i11 / i12 : 0.0d)) : 0.0d) + (i10 > 0 ? Math.abs((i10 - i11) / i10) : 0.0d);
    }

    private static double emc(int i10) {
        int iMax = Math.max(i10, 0);
        if (700 > iMax || iMax > 1500) {
            return Math.min(Math.abs(700 - iMax) / 700.0f, Math.abs(1500 - iMax) / 1500.0f);
        }
        return 0.0d;
    }

    private static void ypw() {
        File[] fileArrListFiles;
        File fileEmc = emc(aa.emc(), com.bytedance.sdk.openadsdk.multipro.ypw.xq());
        if (fileEmc == null || (fileArrListFiles = fileEmc.listFiles()) == null || fileArrListFiles.length <= 5) {
            return;
        }
        Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.bytedance.sdk.openadsdk.core.sup.xq.dg.2
            @Override // java.util.Comparator
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public int compare(File file, File file2) {
                if (file.lastModified() < file2.lastModified()) {
                    return -1;
                }
                return file.lastModified() > file2.lastModified() ? 1 : 0;
            }
        });
        int length = fileArrListFiles.length - 5;
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < length; i10++) {
            File file = fileArrListFiles[i10];
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static void emc(rie rieVar) {
        bw bwVarSno;
        ArrayList<bw.emc> arrayListEmc;
        rie rieVar2;
        if (rieVar == null || !bw.emc(rieVar) || (bwVarSno = rieVar.sno()) == null || (arrayListEmc = bwVarSno.emc()) == null || arrayListEmc.isEmpty()) {
            return;
        }
        int size = arrayListEmc.size();
        int i10 = 0;
        while (i10 < size) {
            bw.emc emcVar = arrayListEmc.get(i10);
            i10++;
            bw.emc emcVar2 = emcVar;
            String strDg = emcVar2.dg();
            if (TextUtils.isEmpty(strDg)) {
                rieVar2 = rieVar;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                com.bytedance.sdk.openadsdk.core.sup.emc.emc.bw bwVar = new com.bytedance.sdk.openadsdk.core.sup.emc.emc.bw(aa.emc(), 0, 0);
                com.bytedance.sdk.openadsdk.core.sup.emc emcVarEmc = bwVar.emc(strDg, (File) null, new ArrayList());
                if (emcVarEmc != null) {
                    emcVar2.emc(emcVarEmc.emc());
                    emcVar2.emc(emcVarEmc.sz());
                }
                rieVar2 = rieVar;
                emc(rieVar2, "vast_content", emcVarEmc, jElapsedRealtime, bwVar.ycc);
            }
            emc(rieVar2, emcVar2);
            rieVar = rieVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ypw(rie rieVar, final String str, final boolean z10, final long j10) {
        com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), rieVar, rieVar.bw(), "track_url_request_result", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.core.sup.xq.dg.3
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject xq() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", str);
                    jSONObject.put("duration", j10);
                    jSONObject.put("success", z10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ypw(final rie rieVar, final String str, final com.bytedance.sdk.openadsdk.core.sup.emc emcVar, final long j10, final ypw.emc emcVar2) {
        com.bytedance.sdk.openadsdk.dg.xq.emc(new msw("vast_parser2") { // from class: com.bytedance.sdk.openadsdk.core.sup.xq.dg.5
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.elapsedRealtime() - j10);
                    com.bytedance.sdk.openadsdk.core.sup.emc emcVar3 = emcVar;
                    String str2 = "load_vast_fail";
                    if (emcVar3 == null) {
                        ypw.emc emcVar4 = emcVar2;
                        if (emcVar4 != null) {
                            jSONObject.put("error_code", emcVar4.emc);
                        }
                    } else if (TextUtils.isEmpty(emcVar3.zz()) || TextUtils.isEmpty(emcVar.ycc()) || emcVar.msw() <= 0.0d) {
                        jSONObject.put("error_code", -3);
                    } else {
                        str2 = "load_vast_success";
                    }
                    com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar, str, str2, jSONObject);
                    com.bytedance.sdk.openadsdk.core.sup.emc emcVar5 = emcVar;
                    if (emcVar5 == null || emcVar5.ypw() == null || !TextUtils.isEmpty(emcVar.ypw().ycc())) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_code", 1000);
                        jSONObject2.put("description", "1000:Image url is null");
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar, str, "load_vast_icon_fail", jSONObject2);
                    emcVar.emc((com.bytedance.sdk.openadsdk.core.sup.ypw) null);
                } catch (Exception unused2) {
                }
            }
        });
    }

    public static void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        List<rie> listDg = emcVar.dg();
        if (listDg != null) {
            Iterator<rie> it = listDg.iterator();
            while (it.hasNext()) {
                emc(it.next());
            }
        }
    }

    private static void emc(final rie rieVar, final bw.emc emcVar) {
        File fileEmc;
        String strXq = emcVar.xq();
        if (TextUtils.isEmpty(strXq)) {
            return;
        }
        final String str = strXq + rieVar.lvs();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = ypw;
        if (concurrentHashMap.containsKey(str) || (fileEmc = emc(str)) == null) {
            return;
        }
        if (fileEmc.exists() && fileEmc.length() > 0) {
            ypw(rieVar, fileEmc, emcVar, 0L);
            return;
        }
        concurrentHashMap.put(str, Boolean.TRUE);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.uym.ypw.emc emcVarDg = com.bytedance.sdk.openadsdk.yzg.ypw.ypw().xq().dg();
        emcVarDg.ypw(strXq);
        emcVarDg.emc(fileEmc.getParent(), fileEmc.getName());
        emcVarDg.xq(strXq);
        emcVarDg.emc(new com.bytedance.sdk.component.uym.emc.emc() { // from class: com.bytedance.sdk.openadsdk.core.sup.xq.dg.1
            @Override // com.bytedance.sdk.component.uym.emc.emc
            public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, com.bytedance.sdk.component.uym.ypw ypwVar) {
                if (ypwVar.ycc() && ypwVar.bw() != null && ypwVar.bw().exists()) {
                    dg.ypw(rieVar, ypwVar.bw(), emcVar, SystemClock.elapsedRealtime() - jElapsedRealtime);
                } else {
                    dg.ypw(rieVar, emcVar.xq(), false, SystemClock.elapsedRealtime() - jElapsedRealtime);
                }
                dg.ypw.remove(str);
            }

            @Override // com.bytedance.sdk.component.uym.emc.emc
            public void emc(com.bytedance.sdk.component.uym.ypw.xq xqVar, IOException iOException) {
                dg.ypw(rieVar, emcVar.xq(), false, SystemClock.elapsedRealtime() - jElapsedRealtime);
                dg.ypw.remove(str);
            }
        });
    }

    public static File emc(String str) {
        String strEmc = com.bytedance.sdk.component.utils.bw.emc(str);
        if (strEmc == null) {
            return null;
        }
        return uym.emc(aa.emc(), com.bytedance.sdk.openadsdk.multipro.ypw.xq(), new File(CacheDirFactory.getRootDir()).getName() + "/vast/", strEmc);
    }

    private static File emc(Context context, boolean z10) {
        return uym.emc(context, z10, new File(CacheDirFactory.getRootDir()).getName() + "/vast/");
    }

    public static void emc(final rie rieVar, final String str, final com.bytedance.sdk.openadsdk.core.sup.emc emcVar, final long j10, final ypw.emc emcVar2) {
        com.bytedance.sdk.openadsdk.dg.xq.emc(new msw("vast_parser1") { // from class: com.bytedance.sdk.openadsdk.core.sup.xq.dg.4
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.elapsedRealtime() - j10);
                    jSONObject.put("from", str);
                    if (emcVar != null) {
                        rie rieVar2 = rieVar;
                        com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar2, rieVar2.bw(), "track_load_vast_success", jSONObject);
                        return;
                    }
                    ypw.emc emcVar3 = emcVar2;
                    if (emcVar3 != null) {
                        jSONObject.put("error_code", emcVar3.emc);
                    }
                    rie rieVar3 = rieVar;
                    com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar3, rieVar3.bw(), "track_load_vast_fail", jSONObject);
                } catch (Exception unused) {
                }
            }
        });
    }
}
