package com.bytedance.sdk.openadsdk.core.gbl.emc;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.aa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class xq {
    public static int emc = 20;
    private static volatile xq ypw;
    private final Object xq = new Object();
    private final LruCache<String, emc> dg = new LruCache<String, emc>(emc) { // from class: com.bytedance.sdk.openadsdk.core.gbl.emc.xq.1
        @Override // android.util.LruCache
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, emc emcVar) {
            return 1;
        }
    };

    private xq() {
    }

    public static String dg() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }

    public static xq emc() {
        if (ypw == null) {
            synchronized (xq.class) {
                try {
                    if (ypw == null) {
                        ypw = new xq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ypw;
    }

    public static String xq() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)").toString();
    }

    public List<emc> ypw() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.multipro.aidl.xq xqVar = new com.bytedance.sdk.openadsdk.multipro.aidl.xq(com.bytedance.sdk.openadsdk.multipro.emc.emc.emc(aa.emc(), "ugen_template", null, null, null, null, null, null));
        try {
            if (xqVar.moveToFirst()) {
                do {
                    int columnIndex = xqVar.getColumnIndex("id");
                    int columnIndex2 = xqVar.getColumnIndex("md5");
                    int columnIndex3 = xqVar.getColumnIndex("url");
                    int columnIndex4 = xqVar.getColumnIndex("data");
                    int columnIndex5 = xqVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = xqVar.getColumnIndex("rit");
                        String string = columnIndex6 != -1 ? xqVar.getString(columnIndex6) : null;
                        String string2 = xqVar.getString(columnIndex);
                        String string3 = xqVar.getString(columnIndex2);
                        String string4 = xqVar.getString(columnIndex3);
                        emc emcVarEmc = new emc().emc(string2).ypw(string3).xq(string4).dg(xqVar.getString(columnIndex4)).bw(string).emc(Long.valueOf(xqVar.getLong(columnIndex5)));
                        arrayList.add(emcVarEmc);
                        synchronized (this.xq) {
                            this.dg.put(string2, emcVarEmc);
                        }
                    }
                } while (xqVar.moveToNext());
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                ul.emc("UGTmplDbHelper", "getUgenTemplate error", th);
                return arrayList;
            } finally {
                xqVar.close();
            }
        }
    }

    public emc emc(String str, String str2) {
        emc emcVar;
        emc emcVarEmc;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.xq) {
            emcVar = this.dg.get(str);
        }
        if (emcVar != null) {
            if (TextUtils.equals(str2, emcVar.ypw())) {
                return emcVar;
            }
            ypw(str2);
            return null;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.xq xqVar = new com.bytedance.sdk.openadsdk.multipro.aidl.xq(com.bytedance.sdk.openadsdk.multipro.emc.emc.emc(aa.emc(), "ugen_template", null, "id=? AND md5=?", new String[]{str, str2}, null, null, null));
        try {
            if (xqVar.moveToFirst()) {
                do {
                    int columnIndex = xqVar.getColumnIndex("id");
                    int columnIndex2 = xqVar.getColumnIndex("md5");
                    int columnIndex3 = xqVar.getColumnIndex("url");
                    int columnIndex4 = xqVar.getColumnIndex("data");
                    int columnIndex5 = xqVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = xqVar.getColumnIndex("rit");
                        String string = xqVar.getString(columnIndex);
                        String string2 = xqVar.getString(columnIndex2);
                        String string3 = xqVar.getString(columnIndex3);
                        String string4 = xqVar.getString(columnIndex4);
                        if (TextUtils.isEmpty(string4)) {
                            return null;
                        }
                        emcVarEmc = new emc().emc(string).ypw(string2).dg(string4).xq(string3).bw(columnIndex6 != -1 ? xqVar.getString(columnIndex6) : null).emc(Long.valueOf(xqVar.getLong(columnIndex5)));
                        synchronized (this.xq) {
                            this.dg.put(string, emcVarEmc);
                        }
                    }
                    return null;
                } while (xqVar.moveToNext());
                return emcVarEmc;
            }
        } finally {
            try {
                return null;
            } finally {
            }
        }
        return null;
    }

    private void ypw(String str) {
        if (!TextUtils.isEmpty(str) && this.dg.size() > 0) {
            synchronized (this.xq) {
                this.dg.remove(str);
            }
        }
    }

    public void emc(emc emcVar) {
        if (emcVar == null || TextUtils.isEmpty(emcVar.emc())) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.xq xqVar = new com.bytedance.sdk.openadsdk.multipro.aidl.xq(com.bytedance.sdk.openadsdk.multipro.emc.emc.emc(aa.emc(), "ugen_template", null, "id=?", new String[]{emcVar.emc()}, null, null, null));
        boolean z10 = xqVar.getCount() > 0;
        try {
            xqVar.close();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", emcVar.emc());
            contentValues.put("md5", emcVar.ypw());
            contentValues.put("url", emcVar.xq());
            contentValues.put("data", emcVar.bw());
            contentValues.put("rit", emcVar.ycc());
            contentValues.put("update_time", emcVar.dg());
            if (z10) {
                com.bytedance.sdk.openadsdk.multipro.emc.emc.emc(aa.emc(), "ugen_template", contentValues, "id=?", new String[]{emcVar.emc()});
            } else {
                com.bytedance.sdk.openadsdk.multipro.emc.emc.emc(aa.emc(), "ugen_template", contentValues);
            }
            synchronized (this.xq) {
                this.dg.put(emcVar.emc(), emcVar);
            }
        } catch (Throwable unused) {
        }
    }

    public Set<emc> emc(String str) {
        emc emcVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        com.bytedance.sdk.openadsdk.multipro.aidl.xq xqVar = new com.bytedance.sdk.openadsdk.multipro.aidl.xq(com.bytedance.sdk.openadsdk.multipro.emc.emc.emc(aa.emc(), "ugen_template", null, "rit=?", new String[]{str}, null, null, null));
        try {
            if (xqVar.moveToFirst()) {
                do {
                    int columnIndex = xqVar.getColumnIndex("id");
                    if (columnIndex != -1) {
                        String string = xqVar.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            synchronized (this.xq) {
                                emcVar = this.dg.get(string);
                            }
                            if (emcVar != null) {
                                hashSet.add(emcVar);
                            } else {
                                emc emcVar2 = new emc();
                                int columnIndex2 = xqVar.getColumnIndex("data");
                                if (columnIndex2 != -1) {
                                    String string2 = xqVar.getString(columnIndex2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        emcVar2.dg(string2);
                                        emcVar2.emc(string);
                                        emcVar2.bw(str);
                                        int columnIndex3 = xqVar.getColumnIndex("md5");
                                        int columnIndex4 = xqVar.getColumnIndex("url");
                                        int columnIndex5 = xqVar.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            emcVar2.ypw(xqVar.getString(columnIndex3));
                                        }
                                        if (columnIndex4 != -1) {
                                            emcVar2.xq(xqVar.getString(columnIndex4));
                                        }
                                        if (columnIndex5 != -1) {
                                            emcVar2.emc(Long.valueOf(xqVar.getLong(columnIndex5)));
                                        }
                                        hashSet.add(emcVar2);
                                        synchronized (this.xq) {
                                            this.dg.put(string, emcVar2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (xqVar.moveToNext());
            }
            return hashSet;
        } catch (Throwable th) {
            try {
                ul.emc("UGTmplDbHelper", "getUgenTemplateFormRit error", th);
                return hashSet;
            } finally {
                xqVar.close();
            }
        }
    }

    public void emc(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                ypw(str);
                com.bytedance.sdk.openadsdk.multipro.emc.emc.emc(aa.emc(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }
}
