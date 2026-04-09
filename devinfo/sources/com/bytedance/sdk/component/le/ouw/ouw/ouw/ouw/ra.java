package com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.le.ouw.pno;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import d.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ra extends lh {

    /* renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.component.le.ouw.yu.vt.ouw f7549lh;
    protected List<String> ouw;

    public ra(Context context, com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar) {
        super(context);
        this.ouw = new ArrayList();
        this.f7549lh = ouwVar;
        if (ouwVar == null) {
            this.f7549lh = com.bytedance.sdk.component.le.ouw.yu.vt.ouw.ouw();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021 A[EXC_TOP_SPLITTER, PHI: r0 r1
  0x0021: PHI (r0v2 int) = (r0v0 int), (r0v6 int) binds: [B:10:0x0026, B:6:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0021: PHI (r1v2 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:10:0x0026, B:6:0x001f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int ra() {
        /*
            r7 = this;
            r0 = 0
            android.content.Context r1 = r7.yu()     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = r7.ouw()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "count(1)"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L25
            r5 = 0
            r6 = 0
            r4 = 0
            android.database.Cursor r1 = com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L1f
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L26
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L26
        L1f:
            if (r1 == 0) goto L29
        L21:
            r1.close()     // Catch: java.lang.Exception -> L29
            goto L29
        L25:
            r1 = 0
        L26:
            if (r1 == 0) goto L29
            goto L21
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.ra.ra():int");
    }

    private void yu(List<String> list) {
        ouw();
        list.size();
        com.bytedance.sdk.component.le.ouw.lh.vt.yu();
        com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(yu(), "DELETE FROM " + ouw() + " WHERE " + ouw(FacebookMediationAdapter.KEY_ID, list));
        com.bytedance.sdk.component.le.ouw.vt.yu yuVar = com.bytedance.sdk.component.le.ouw.vt.yu.ouw;
        list.size();
        com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
        vt(list);
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.lh
    public final long fkw() {
        return com.bytedance.sdk.component.le.ouw.ra.ouw.vt();
    }

    public final boolean le() {
        return this.f7549lh != null && ra() >= this.f7549lh.ouw;
    }

    public byte lh() {
        return (byte) 2;
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.lh
    public String ouw() {
        return pno.vt().ra.yu();
    }

    public byte vt() {
        return (byte) 1;
    }

    public static String lh(String str) {
        return h.t("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public final List<com.bytedance.sdk.component.le.ouw.yu.ouw> vt(String str) {
        com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar = this.f7549lh;
        return ouwVar == null ? new ArrayList() : ouw(ouwVar.vt, str);
    }

    public final List<com.bytedance.sdk.component.le.ouw.yu.ouw> ouw(int i4, String str) {
        long jOuw = com.bytedance.sdk.component.le.ouw.vt.ouw.ouw(i4, yu());
        if (jOuw <= 0) {
            jOuw = 1;
        } else if (jOuw > 100) {
            jOuw = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.ouw.clear();
        Cursor cursorOuw = com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(yu(), ouw(), new String[]{FacebookMediationAdapter.KEY_ID, "value", "encrypt"}, null, null, str + " DESC limit " + jOuw);
        if (cursorOuw != null) {
            while (cursorOuw.moveToNext()) {
                try {
                    try {
                        String string = cursorOuw.getString(cursorOuw.getColumnIndex(FacebookMediationAdapter.KEY_ID));
                        String string2 = cursorOuw.getString(cursorOuw.getColumnIndex("value"));
                        if (cursorOuw.getInt(cursorOuw.getColumnIndex("encrypt")) == 1) {
                            string2 = pno.vt().bly.ouw(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.ouw.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.le.ouw.yu.ouw.ouw ouwVar = new com.bytedance.sdk.component.le.ouw.yu.ouw.ouw(string, new JSONObject(string2));
                            ouwVar.vt = lh();
                            ouwVar.ouw = vt();
                            arrayList.add(ouwVar);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                }
            }
            try {
                cursorOuw.close();
                if (!this.ouw.isEmpty()) {
                    yu(this.ouw);
                    this.ouw.clear();
                }
            } catch (Exception unused2) {
            }
        }
        return arrayList;
    }

    public final void ouw(List<com.bytedance.sdk.component.le.ouw.yu.ouw> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<com.bytedance.sdk.component.le.ouw.yu.ouw> it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().lh());
            com.bytedance.sdk.component.le.ouw.lh.ouw.bly();
        }
        ouw();
        linkedList.size();
        com.bytedance.sdk.component.le.ouw.lh.vt.yu();
        com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(yu(), "DELETE FROM " + ouw() + " WHERE " + ouw(FacebookMediationAdapter.KEY_ID, linkedList));
        vt(linkedList);
    }

    public final void ouw(int i4, long j) {
        com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(yu(), ouw(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i4)});
    }

    private static String ouw(String str, List<?> list) {
        int i4;
        int iMin = Math.min(1000, 1000);
        int size = list.size();
        if (size % iMin == 0) {
            i4 = size / iMin;
        } else {
            i4 = (size / iMin) + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < i4; i10++) {
            int i11 = i10 * iMin;
            String strOuw = ouw(TextUtils.join("','", list.subList(i11, Math.min(i11 + iMin, size))), "");
            if (i10 != 0) {
                sb2.append(" OR ");
            }
            sb2.append(str);
            sb2.append(" IN ('");
            sb2.append(strOuw);
            sb2.append("')");
        }
        return ouw(sb2.toString(), h.s(str, " IN ('')"));
    }

    private static String ouw(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
