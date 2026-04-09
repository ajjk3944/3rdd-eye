package com.bytedance.sdk.component.le.ouw.le;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.le.ouw.pno;
import com.bytedance.sdk.component.utils.ko;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh implements vt {
    final Context ouw;
    private final fkw vt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    @SuppressLint({"StaticFieldLeak"})
    public class ouw extends com.bytedance.sdk.component.le.ouw.fkw.fkw {

        /* renamed from: lh, reason: collision with root package name */
        private final String f7527lh;
        private final yu vt;
        private final Map<String, String> yu;

        public /* synthetic */ ouw(lh lhVar, yu yuVar, String str, Map map, byte b10) {
            this(yuVar, str, map);
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.bytedance.sdk.component.le.ouw.fkw.yu yuVarOuw;
            com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
            if (fkwVar == null || pno.vt().ouw == null) {
                return;
            }
            String str = this.vt.vt;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.startsWith("http://") || str.startsWith("https://")) {
                yu yuVar = this.vt;
                if (yuVar.yu >= fkwVar.lh(yuVar.f7529le)) {
                    lh.this.vt.lh(this.vt);
                    return;
                }
                try {
                    if (this.vt.yu == -1) {
                        lh.this.vt.ouw(this.vt);
                    }
                    Context context = lh.this.ouw;
                    if (context == null) {
                        context = pno.vt().ouw;
                    }
                    if (fkwVar.ouw(context)) {
                        System.currentTimeMillis();
                        String str2 = this.vt.vt;
                        com.bytedance.sdk.component.le.ouw.fkw.lh lhVarYu = fkwVar.yu();
                        lhVarYu.ouw("User-Agent", fkwVar.lh());
                        lhVarYu.ouw("csj_client_source_from", "1");
                        if (this.yu != null) {
                            JSONObject jSONObject = new JSONObject();
                            for (Map.Entry<String, String> entry : this.yu.entrySet()) {
                                jSONObject.put(entry.getKey(), entry.getValue());
                            }
                            lhVarYu.ouw("csj_extra_info", jSONObject.toString());
                        }
                        lhVarYu.ouw(str2);
                        try {
                            yuVarOuw = lhVarYu.ouw();
                            try {
                                yuVarOuw.ouw();
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            yuVarOuw = null;
                        }
                        this.vt.yu++;
                        if (yuVarOuw != null && yuVarOuw.ouw()) {
                            lh.this.vt.lh(this.vt);
                            String str3 = this.vt.vt;
                            com.bytedance.sdk.component.le.ouw.lh.vt.yu();
                            System.currentTimeMillis();
                            fkwVar.ouw(true, this.vt);
                            return;
                        }
                        if (yuVarOuw != null) {
                            yu yuVar2 = this.vt;
                            int iVt = yuVarOuw.vt();
                            yuVar2.bly = iVt;
                            if (iVt != 0) {
                                if (TextUtils.isEmpty(yuVar2.ra)) {
                                    yuVar2.ra = String.valueOf(yuVar2.bly);
                                } else {
                                    yuVar2.ra += "," + yuVar2.bly;
                                }
                            }
                            yu yuVar3 = this.vt;
                            String strLh = yuVarOuw.lh();
                            yuVar3.tlj = strLh;
                            if (!TextUtils.isEmpty(strLh)) {
                                if (TextUtils.isEmpty(yuVar3.pno)) {
                                    yuVar3.pno = String.valueOf(yuVar3.tlj);
                                } else {
                                    yuVar3.pno += "," + yuVar3.tlj;
                                }
                            }
                        }
                        if (yuVarOuw == null || yuVarOuw.vt() != 8848) {
                            String str4 = this.vt.vt;
                            com.bytedance.sdk.component.le.ouw.lh.vt.yu();
                            yu yuVar4 = this.vt;
                            if (yuVar4.yu >= fkwVar.lh(yuVar4.f7529le)) {
                                lh.this.vt.lh(this.vt);
                                String str5 = this.vt.vt;
                                com.bytedance.sdk.component.le.ouw.lh.vt.yu();
                            } else {
                                lh.this.vt.vt(this.vt);
                            }
                        } else {
                            ko.vt("trackurl", "block url : " + yuVarOuw.lh());
                            lh.this.vt.lh(this.vt);
                        }
                        System.currentTimeMillis();
                        fkwVar.ouw(false, this.vt);
                    }
                } catch (Throwable unused3) {
                }
            }
        }

        private ouw(yu yuVar, String str, Map<String, String> map) {
            super("AdsStats");
            this.vt = yuVar;
            this.f7527lh = str;
            this.yu = map;
        }
    }

    public lh(Context context, fkw fkwVar) {
        this.ouw = context;
        this.vt = fkwVar;
    }

    @Override // com.bytedance.sdk.component.le.ouw.le.vt
    public final void ouw(String str, List<String> list, boolean z3, Map<String, String> map, int i4, String str2) {
        com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
        if (fkwVar == null || pno.vt().ouw == null || fkwVar.ouw() == null || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            fkwVar.ouw().execute(new ouw(this, new yu(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z3, i4, str2), str, map, (byte) 0));
        }
    }

    @Override // com.bytedance.sdk.component.le.ouw.le.vt
    public final void ouw(final String str, final boolean z3) {
        com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
        if (fkwVar == null || pno.vt().ouw == null) {
            return;
        }
        com.bytedance.sdk.component.le.ouw.fkw.fkw fkwVar2 = new com.bytedance.sdk.component.le.ouw.fkw.fkw("trackFailedUrls") { // from class: com.bytedance.sdk.component.le.ouw.le.lh.2
            @Override // java.lang.Runnable
            public final void run() {
                lh.ouw(lh.this, lh.this.vt.ouw(), str, z3);
            }
        };
        fkwVar2.pno = 1;
        if (fkwVar.ouw() != null) {
            fkwVar.ouw().execute(fkwVar2);
        }
    }

    @Override // com.bytedance.sdk.component.le.ouw.le.vt
    public final Runnable ouw(final yu yuVar, final String str, final Map<String, String> map) {
        if (TextUtils.isEmpty(yuVar.ouw)) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.le.ouw.le.lh.1
            @Override // java.lang.Runnable
            public final void run() {
                if (lh.this.vt.ouw(yuVar.ouw) != null) {
                    new ouw(lh.this, yuVar, str, map, (byte) 0).run();
                }
            }
        };
    }

    public static /* synthetic */ void ouw(lh lhVar, List list, String str, boolean z3) {
        lh lhVar2;
        String str2;
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yu yuVar = (yu) it.next();
            if (fkwVar == null || fkwVar.ouw() == null) {
                lhVar2 = lhVar;
                str2 = str;
            } else {
                yuVar.f7528cf = z3;
                lhVar2 = lhVar;
                str2 = str;
                fkwVar.ouw().execute(new ouw(lhVar2, yuVar, str2, null, (byte) 0));
            }
            lhVar = lhVar2;
            str = str2;
        }
    }
}
