package com.bytedance.sdk.openadsdk.core.ryl.lh;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.pno.pno;
import com.bytedance.sdk.component.utils.ra;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.fkw;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl.ouw.vt;
import com.bytedance.sdk.openadsdk.core.zih;
import d.h;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {
    public static final List<String> ouw = Arrays.asList("video/mp4", "video/3gpp");
    private static final ConcurrentHashMap<String, Boolean> vt = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static void vt(vpp vppVar, File file, fkw.ouw ouwVar, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu(zih.ouw(), 0, 0);
        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVarOuw = yuVar.ouw((String) null, file, new ArrayList());
        if (ouwVarOuw != null) {
            com.bytedance.sdk.openadsdk.core.model.yu yuVar2 = ouwVarOuw.ouw;
            ouwVar.f8226lh = yuVar2.ouw;
            ouwVar.yu = yuVar2.vt;
        }
        ouw(vppVar, ouwVar.ouw, true, j);
        vt(vppVar, "vast_url", ouwVarOuw, jElapsedRealtime, yuVar.f8416le);
        vt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ouw(vpp vppVar, final String str, final boolean z3, final long j) {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, vppVar.vt(), "track_url_request_result", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.core.ryl.lh.yu.3
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject lh() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", str);
                    jSONObject.put("duration", j);
                    jSONObject.put("success", z3);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ouw(final vpp vppVar, final String str, final com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar, final long j, final vt.ouw ouwVar2) {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(new pno("vast_parser2") { // from class: com.bytedance.sdk.openadsdk.core.ryl.lh.yu.5
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                com.bytedance.sdk.openadsdk.core.ryl.vt vtVar;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.elapsedRealtime() - j);
                    com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar3 = ouwVar;
                    String str2 = "load_vast_fail";
                    if (ouwVar3 == null) {
                        vt.ouw ouwVar4 = ouwVar2;
                        if (ouwVar4 != null) {
                            jSONObject.put("error_code", ouwVar4.ouw);
                        }
                    } else if (TextUtils.isEmpty(ouwVar3.ouw()) || TextUtils.isEmpty(ouwVar.f8410le) || ouwVar.pno <= 0.0d) {
                        jSONObject.put("error_code", -3);
                    } else {
                        str2 = "load_vast_success";
                    }
                    com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, str, str2, jSONObject);
                    com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar5 = ouwVar;
                    if (ouwVar5 == null || (vtVar = ouwVar5.vt) == null || !TextUtils.isEmpty(vtVar.le())) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_code", 1000);
                        jSONObject2.put("description", "1000:Image url is null");
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, str, "load_vast_icon_fail", jSONObject2);
                    ouwVar.ouw((com.bytedance.sdk.openadsdk.core.ryl.vt) null);
                } catch (Exception unused2) {
                }
            }
        });
    }

    public static double ouw(int i4, double d10, int i10, int i11, int i12, String str) {
        double d11;
        double dAbs = (d10 > 0.0d ? Math.abs(d10 - (i11 > 0 ? i10 / i11 : 0.0d)) : 0.0d) + (i4 > 0 ? Math.abs((i4 - i10) / i4) : 0.0d);
        int iMax = Math.max(i12, 0);
        double dMin = (700 > iMax || iMax > 1500) ? Math.min(Math.abs(700 - iMax) / 700.0f, Math.abs(TTAdConstant.STYLE_SIZE_RADIO_3_2 - iMax) / 1500.0f) : 0.0d;
        if (str == null) {
            str = "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1664118616) {
            if (iHashCode == 1331848029 && str.equals("video/mp4")) {
                d11 = 1.5d;
            }
            return (1.0d / ((dAbs + 1.0d) + dMin)) * d11;
        }
        str.equals("video/3gpp");
        d11 = 1.0d;
        return (1.0d / ((dAbs + 1.0d) + dMin)) * d11;
    }

    private static void vt() {
        File[] fileArrListFiles = ra.ouw(zih.ouw(), com.bytedance.sdk.openadsdk.multipro.vt.lh(), new File(CacheDirFactory.getRootDir()).getName() + "/vast/").listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 5) {
            return;
        }
        Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.bytedance.sdk.openadsdk.core.ryl.lh.yu.2
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(File file, File file2) {
                File file3 = file;
                File file4 = file2;
                if (file3.lastModified() < file4.lastModified()) {
                    return -1;
                }
                return file3.lastModified() > file4.lastModified() ? 1 : 0;
            }
        });
        int length = fileArrListFiles.length - 5;
        for (int i4 = 0; i4 < fileArrListFiles.length && i4 < length; i4++) {
            File file = fileArrListFiles[i4];
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static void ouw(vpp vppVar) {
        fkw fkwVar;
        ArrayList<fkw.ouw> arrayList;
        vpp vppVar2;
        final vpp vppVar3;
        if (vppVar == null || vppVar.ra()) {
            return;
        }
        int iUoy = vppVar.uoy();
        int i4 = vppVar.ucs;
        if (iUoy == 3 || iUoy == 7 || iUoy == 8) {
            if ((i4 != 5 && i4 != 15 && i4 != 50) || (fkwVar = vppVar.ryl) == null || (arrayList = fkwVar.ouw) == null || arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                fkw.ouw ouwVar = arrayList.get(i10);
                i10++;
                final fkw.ouw ouwVar2 = ouwVar;
                String str = ouwVar2.vt;
                if (TextUtils.isEmpty(str)) {
                    vppVar2 = vppVar;
                } else {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu(zih.ouw(), 0, 0);
                    com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVarOuw = yuVar.ouw(str, (File) null, new ArrayList());
                    if (ouwVarOuw != null) {
                        com.bytedance.sdk.openadsdk.core.model.yu yuVar2 = ouwVarOuw.ouw;
                        ouwVar2.f8226lh = yuVar2.ouw;
                        ouwVar2.yu = yuVar2.vt;
                    }
                    vppVar2 = vppVar;
                    vt(vppVar2, "vast_content", ouwVarOuw, jElapsedRealtime, yuVar.f8416le);
                }
                String str2 = ouwVar2.ouw;
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder sbZ = h.z(str2);
                    sbZ.append(vppVar2.ux());
                    final String string = sbZ.toString();
                    ConcurrentHashMap<String, Boolean> concurrentHashMap = vt;
                    if (!concurrentHashMap.containsKey(string)) {
                        String strOuw = com.bytedance.sdk.component.utils.fkw.ouw(string);
                        File fileOuw = strOuw != null ? ra.ouw(zih.ouw(), com.bytedance.sdk.openadsdk.multipro.vt.lh(), h.s(new File(CacheDirFactory.getRootDir()).getName(), "/vast/"), strOuw) : null;
                        if (fileOuw != null) {
                            if (fileOuw.exists() && fileOuw.length() > 0) {
                                vt(vppVar2, fileOuw, ouwVar2, 0L);
                                vppVar = vppVar2;
                            } else {
                                concurrentHashMap.put(string, Boolean.TRUE);
                                File file = fileOuw;
                                vppVar3 = vppVar2;
                                final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                com.bytedance.sdk.component.ra.vt.ouw ouwVarLh = com.bytedance.sdk.openadsdk.th.vt.ouw().ouw.lh();
                                ouwVarLh.ouw(str2);
                                ouwVarLh.ouw(file.getParent(), file.getName());
                                ouwVarLh.vt(str2);
                                ouwVarLh.ouw(new com.bytedance.sdk.component.ra.ouw.ouw() { // from class: com.bytedance.sdk.openadsdk.core.ryl.lh.yu.1
                                    @Override // com.bytedance.sdk.component.ra.ouw.ouw
                                    public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, IOException iOException) {
                                        yu.ouw(vppVar3, ouwVar2.ouw, false, SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                        yu.vt.remove(string);
                                    }

                                    @Override // com.bytedance.sdk.component.ra.ouw.ouw
                                    public final void ouw(com.bytedance.sdk.component.ra.vt.lh lhVar, com.bytedance.sdk.component.ra.vt vtVar) {
                                        File file2;
                                        if (vtVar.pno && (file2 = vtVar.ra) != null && file2.exists()) {
                                            yu.vt(vppVar3, vtVar.ra, ouwVar2, SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                        } else {
                                            yu.ouw(vppVar3, ouwVar2.ouw, false, SystemClock.elapsedRealtime() - jElapsedRealtime2);
                                        }
                                        yu.vt.remove(string);
                                    }
                                });
                                vppVar = vppVar3;
                            }
                        }
                    }
                }
                vppVar3 = vppVar2;
                vppVar = vppVar3;
            }
        }
    }

    private static void vt(final vpp vppVar, final String str, final com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar, final long j, final vt.ouw ouwVar2) {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(new pno("vast_parser1") { // from class: com.bytedance.sdk.openadsdk.core.ryl.lh.yu.4
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.elapsedRealtime() - j);
                    jSONObject.put("from", str);
                    if (ouwVar != null) {
                        vpp vppVar2 = vppVar;
                        com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar2, vppVar2.vt(), "track_load_vast_success", jSONObject);
                        return;
                    }
                    vt.ouw ouwVar3 = ouwVar2;
                    if (ouwVar3 != null) {
                        jSONObject.put("error_code", ouwVar3.ouw);
                    }
                    vpp vppVar3 = vppVar;
                    com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar3, vppVar3.vt(), "track_load_vast_fail", jSONObject);
                } catch (Exception unused) {
                }
            }
        });
    }

    public static void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        List<vpp> list = ouwVar.yu;
        if (list != null) {
            Iterator<vpp> it = list.iterator();
            while (it.hasNext()) {
                ouw(it.next());
            }
        }
    }
}
