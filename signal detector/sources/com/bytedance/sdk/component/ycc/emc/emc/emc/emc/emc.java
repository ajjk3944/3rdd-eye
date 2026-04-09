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
public class emc extends xq {
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc dg;
    protected List<String> emc;
    private final Context xq;

    public emc(Context context, com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar) {
        super(context);
        this.emc = new ArrayList();
        this.xq = context;
        this.dg = emcVar;
        if (emcVar == null) {
            this.dg = com.bytedance.sdk.component.ycc.emc.dg.ypw.emc.xq();
        }
    }

    public byte dg() {
        return (byte) 0;
    }

    public int emc() {
        Cursor cursorEmc = null;
        int i = 0;
        try {
            cursorEmc = com.bytedance.sdk.component.ycc.emc.emc.emc.xq.emc(bw(), ypw(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorEmc != null) {
                cursorEmc.moveToFirst();
                i = cursorEmc.getInt(0);
            }
        } catch (Exception unused) {
            if (cursorEmc != null) {
            }
        } catch (Throwable th) {
            if (cursorEmc != null) {
                try {
                    cursorEmc.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
        if (cursorEmc != null) {
            try {
                cursorEmc.close();
            } catch (Exception unused3) {
            }
        }
        return i;
    }

    public byte xq() {
        return (byte) 2;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.emc.emc.emc.xq
    public String ypw() {
        com.bytedance.sdk.component.ycc.emc.emc.bw bwVarDg = msw.uym().dg();
        if (bwVarDg != null) {
            return bwVarDg.ypw();
        }
        return null;
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

    public List<com.bytedance.sdk.component.ycc.emc.dg.emc> emc(int i, String str) {
        String str2;
        String[] strArr;
        String str3;
        byte b5;
        Cursor cursorEmc;
        long jEmc = com.bytedance.sdk.component.ycc.emc.ypw.emc.emc(i, bw());
        ypw();
        if (jEmc <= 0) {
            jEmc = 1;
        } else if (jEmc > 100) {
            jEmc = 100;
        }
        String str4 = str + " DESC limit " + jEmc;
        ArrayList arrayList = new ArrayList();
        this.emc.clear();
        long jAa = msw.uym().aa();
        if (jAa > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - jAa)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.ycc.emc.xq.emc.dg() && dg() == 3) {
            str3 = "id";
            b5 = 3;
            cursorEmc = com.bytedance.sdk.component.ycc.emc.emc.emc.xq.emc(bw(), ypw(), new String[]{"id", "value", "encrypt", "channel"}, str2, strArr, null, null, str4);
        } else {
            str3 = "id";
            b5 = 3;
            cursorEmc = com.bytedance.sdk.component.ycc.emc.emc.emc.xq.emc(bw(), ypw(), new String[]{str3, "value", "encrypt"}, str2, strArr, null, null, str4);
        }
        Cursor cursor = cursorEmc;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.ycc.emc.bw bwVarVk = msw.uym().vk();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str3));
                        String string2 = cursor.getString(cursor.getColumnIndex("value"));
                        int i3 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i6 = (com.bytedance.sdk.component.ycc.emc.xq.emc.dg() && dg() == b5) ? cursor.getInt(cursor.getColumnIndex("channel")) : 0;
                        if (i3 == 1) {
                            try {
                                string2 = bwVarVk.emc(string2);
                            } catch (Throwable th) {
                                th = th;
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.emc.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(string2);
                            com.bytedance.sdk.component.ycc.emc.dg.emc.emc emcVar = new com.bytedance.sdk.component.ycc.emc.dg.emc.emc(string, jSONObject);
                            emcVar.emc(dg());
                            emcVar.ypw(xq());
                            if (com.bytedance.sdk.component.ycc.emc.xq.emc.dg() && dg() == b5) {
                                emcVar.emc(i6);
                            }
                            com.bytedance.sdk.component.ycc.emc.xq.emc.emc(jSONObject, emcVar);
                            arrayList.add(emcVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } finally {
                try {
                    cursor.close();
                    if (!this.emc.isEmpty()) {
                        emc(this.emc);
                        this.emc.clear();
                    }
                } catch (Exception unused) {
                }
            }
        }
        ypw();
        arrayList.size();
        return arrayList;
    }

    private void ypw(int i, long j6) {
        if (j6 > 0 || i > 0) {
            com.bytedance.sdk.component.ycc.emc.emc.emc.xq.emc(bw(), ypw(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j6), String.valueOf(i)});
            ypw();
        }
    }

    public static String ypw(String str) {
        return f.m("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public List<com.bytedance.sdk.component.ycc.emc.dg.emc> emc(String str) {
        com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar = this.dg;
        if (emcVar == null) {
            return new ArrayList();
        }
        return emc(emcVar.ypw(), str);
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
        if (this.dg == null) {
            return false;
        }
        int iEmc = emc();
        int iEmc2 = this.dg.emc();
        ypw();
        return (com.bytedance.sdk.component.ycc.emc.xq.emc.xq() && (i == 1 || i == 2)) ? iEmc > 0 : iEmc >= iEmc2;
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
