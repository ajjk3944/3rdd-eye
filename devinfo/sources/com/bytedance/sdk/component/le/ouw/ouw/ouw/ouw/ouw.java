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
public class ouw extends lh {

    /* renamed from: lh, reason: collision with root package name */
    private final Context f7548lh;
    protected List<String> ouw;
    private com.bytedance.sdk.component.le.ouw.yu.vt.ouw yu;

    public ouw(Context context, com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar) {
        super(context);
        this.ouw = new ArrayList();
        this.f7548lh = context;
        this.yu = ouwVar;
        if (ouwVar == null) {
            this.yu = com.bytedance.sdk.component.le.ouw.yu.vt.ouw.ouw();
        }
    }

    private int le() {
        Cursor cursorOuw = null;
        int i4 = 0;
        try {
            cursorOuw = com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(yu(), ouw(), new String[]{"count(1)"}, null, null, null);
            if (cursorOuw != null) {
                cursorOuw.moveToFirst();
                i4 = cursorOuw.getInt(0);
            }
        } catch (Exception unused) {
            if (cursorOuw != null) {
            }
        } catch (Throwable th2) {
            if (cursorOuw != null) {
                try {
                    cursorOuw.close();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
        if (cursorOuw != null) {
            try {
                cursorOuw.close();
            } catch (Exception unused3) {
            }
        }
        return i4;
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

    public byte lh() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.le.ouw.ouw.ouw.ouw.lh
    public String ouw() {
        com.bytedance.sdk.component.le.ouw.ouw.fkw fkwVar = pno.vt().ra;
        if (fkwVar != null) {
            return fkwVar.vt();
        }
        return null;
    }

    public byte vt() {
        return (byte) 2;
    }

    public static String vt(String str) {
        return h.t("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public final List<com.bytedance.sdk.component.le.ouw.yu.ouw> ouw(int i4, String str) {
        String str2;
        String[] strArr;
        Cursor cursorOuw;
        long jOuw = com.bytedance.sdk.component.le.ouw.vt.ouw.ouw(i4, yu());
        ouw();
        com.bytedance.sdk.component.le.ouw.lh.vt.vt();
        if (jOuw <= 0) {
            jOuw = 1;
        } else if (jOuw > 100) {
            jOuw = 100;
        }
        String str3 = str + " DESC limit " + jOuw;
        ArrayList arrayList = new ArrayList();
        this.ouw.clear();
        long jFkw = pno.vt().fkw();
        if (jFkw > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - jFkw)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.le.ouw.lh.ouw.fkw() && lh() == 3) {
            cursorOuw = com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(yu(), ouw(), new String[]{FacebookMediationAdapter.KEY_ID, "value", "encrypt", "channel"}, str2, strArr, str3);
        } else {
            cursorOuw = com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(yu(), ouw(), new String[]{FacebookMediationAdapter.KEY_ID, "value", "encrypt"}, str2, strArr, str3);
        }
        Cursor cursor = cursorOuw;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.le.ouw.fkw fkwVar = pno.vt().bly;
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(FacebookMediationAdapter.KEY_ID));
                        String string2 = cursor.getString(cursor.getColumnIndex("value"));
                        int i10 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i11 = (com.bytedance.sdk.component.le.ouw.lh.ouw.fkw() && lh() == 3) ? cursor.getInt(cursor.getColumnIndex("channel")) : 0;
                        if (i10 == 1) {
                            string2 = fkwVar.ouw(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                            this.ouw.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.le.ouw.yu.ouw.ouw ouwVar = new com.bytedance.sdk.component.le.ouw.yu.ouw.ouw(string, new JSONObject(string2));
                            ouwVar.ouw = lh();
                            ouwVar.vt = vt();
                            if (com.bytedance.sdk.component.le.ouw.lh.ouw.fkw() && lh() == 3) {
                                ouwVar.fkw = i11;
                            }
                            com.bytedance.sdk.component.le.ouw.lh.ouw.le();
                            arrayList.add(ouwVar);
                        }
                    } catch (Throwable th2) {
                        th2.getMessage();
                        com.bytedance.sdk.component.le.ouw.lh.vt.lh();
                    }
                }
            } finally {
                try {
                    cursor.close();
                    if (!this.ouw.isEmpty()) {
                        yu(this.ouw);
                        this.ouw.clear();
                    }
                } catch (Exception unused) {
                }
            }
        }
        ouw();
        arrayList.size();
        com.bytedance.sdk.component.le.ouw.lh.vt.vt();
        return arrayList;
    }

    public final List<com.bytedance.sdk.component.le.ouw.yu.ouw> ouw(String str) {
        com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar = this.yu;
        if (ouwVar == null) {
            return new ArrayList();
        }
        return ouw(ouwVar.vt, str);
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
        if (j > 0 || i4 > 0) {
            com.bytedance.sdk.component.le.ouw.ouw.ouw.lh.ouw(yu(), ouw(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i4)});
            ouw();
            com.bytedance.sdk.component.le.ouw.lh.vt.yu();
        }
    }

    public final boolean ouw(int i4) {
        if (this.yu == null) {
            return false;
        }
        int iLe = le();
        int i10 = this.yu.ouw;
        ouw();
        com.bytedance.sdk.component.le.ouw.lh.vt.vt();
        com.bytedance.sdk.component.le.ouw.lh.ouw.yu();
        return iLe >= i10;
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
