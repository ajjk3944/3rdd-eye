package com.bytedance.sdk.component.ycc.emc.emc.emc.emc;

import A.f;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.ycc.emc.msw;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import o4.AbstractC2763b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uym extends xq {
    protected List<String> emc;
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc xq;

    public uym(Context context, com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar) {
        super(context);
        this.emc = new ArrayList();
        this.xq = emcVar;
        if (emcVar == null) {
            this.xq = com.bytedance.sdk.component.ycc.emc.dg.ypw.emc.xq();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023 A[EXC_TOP_SPLITTER, PHI: r0 r1
  0x0023: PHI (r0v2 int) = (r0v0 int), (r0v6 int) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0023: PHI (r1v2 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int dg() {
        /*
            r9 = this;
            r0 = 0
            android.content.Context r1 = r9.bw()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = r9.ypw()     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "count(1)"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L27
            r7 = 0
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r1 = com.bytedance.sdk.component.ycc.emc.emc.emc.xq.emc(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L21
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L28
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L28
        L21:
            if (r1 == 0) goto L2b
        L23:
            r1.close()     // Catch: java.lang.Exception -> L2b
            goto L2b
        L27:
            r1 = 0
        L28:
            if (r1 == 0) goto L2b
            goto L23
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ycc.emc.emc.emc.emc.uym.dg():int");
    }

    public byte emc() {
        return (byte) 1;
    }

    public byte xq() {
        return (byte) 2;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.emc.emc.xq
    public long ycc() {
        return com.bytedance.sdk.component.ycc.emc.uym.emc.ypw();
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.emc.emc.xq
    public String ypw() {
        return msw.uym().dg().dg();
    }

    public static String xq(String str) {
        return f.m("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public List<com.bytedance.sdk.component.ycc.emc.dg.emc> emc(int i, String str) {
        long jEmc = com.bytedance.sdk.component.ycc.emc.ypw.emc.emc(i, bw());
        if (jEmc <= 0) {
            jEmc = 1;
        } else if (jEmc > 100) {
            jEmc = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.emc.clear();
        Cursor cursorEmc = com.bytedance.sdk.component.ycc.emc.emc.emc.xq.emc(bw(), ypw(), new String[]{"id", "value", "encrypt"}, null, null, null, null, str + " DESC limit " + jEmc);
        if (cursorEmc != null) {
            while (cursorEmc.moveToNext()) {
                try {
                    try {
                        String string = cursorEmc.getString(cursorEmc.getColumnIndex("id"));
                        String string2 = cursorEmc.getString(cursorEmc.getColumnIndex("value"));
                        if (cursorEmc.getInt(cursorEmc.getColumnIndex("encrypt")) == 1) {
                            string2 = msw.uym().vk().emc(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.emc.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.ycc.emc.dg.emc.emc emcVar = new com.bytedance.sdk.component.ycc.emc.dg.emc.emc(string, new JSONObject(string2));
                            emcVar.ypw(xq());
                            emcVar.emc(emc());
                            arrayList.add(emcVar);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                }
            }
            try {
                cursorEmc.close();
                if (!this.emc.isEmpty()) {
                    emc(this.emc);
                    this.emc.clear();
                }
            } catch (Exception unused2) {
            }
        }
        return arrayList;
    }

    public List<com.bytedance.sdk.component.ycc.emc.dg.emc> ypw(String str) {
        com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar = this.xq;
        return emcVar == null ? new ArrayList() : emc(emcVar.ypw(), str);
    }

    public void ypw(List<com.bytedance.sdk.component.ycc.emc.dg.emc> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.ycc.emc.dg.emc emcVar : list) {
            linkedList.add(emcVar.xq());
            com.bytedance.sdk.component.ycc.emc.xq.emc.ru(emcVar);
        }
        ypw();
        linkedList.size();
        com.bytedance.sdk.component.ycc.emc.emc.emc.xq.emc(bw(), "DELETE FROM " + ypw() + " WHERE " + emc("id", linkedList, TTAdConstant.STYLE_SIZE_RADIO_1_1, true));
        xq(linkedList);
    }

    private void ypw(int i, long j6) {
        com.bytedance.sdk.component.ycc.emc.emc.emc.xq.emc(bw(), ypw(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j6), String.valueOf(i)});
    }

    public void emc(List<String> list) {
        ypw();
        list.size();
        com.bytedance.sdk.component.ycc.emc.emc.emc.xq.emc(bw(), "DELETE FROM " + ypw() + " WHERE " + emc("id", list, TTAdConstant.STYLE_SIZE_RADIO_1_1, true));
        com.bytedance.sdk.component.ycc.emc.xq.ypw.emc(com.bytedance.sdk.component.ycc.emc.ypw.dg.dg.ndl(), list.size());
        xq(list);
    }

    public void emc(int i, long j6) {
        ypw(i, j6);
    }

    public boolean emc(int i) {
        return this.xq != null && dg() >= this.xq.emc();
    }

    private static String emc(String str, List<?> list, int i, boolean z6) {
        int i3;
        String str2 = z6 ? " IN " : " NOT IN ";
        String str3 = z6 ? " OR " : " AND ";
        int iMin = Math.min(i, TTAdConstant.STYLE_SIZE_RADIO_1_1);
        int size = list.size();
        if (size % iMin == 0) {
            i3 = size / iMin;
        } else {
            i3 = (size / iMin) + 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = i6 * iMin;
            String strEmc = emc(TextUtils.join("','", list.subList(i7, Math.min(i7 + iMin, size))), "");
            if (i6 != 0) {
                sb.append(str3);
            }
            f.w(sb, str, str2, "('", strEmc);
            sb.append("')");
        }
        return emc(sb.toString(), AbstractC2763b.f(str, str2, "('')"));
    }

    private static String emc(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
