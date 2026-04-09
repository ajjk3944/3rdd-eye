package com.bytedance.sdk.component.adexpress.emc.ypw;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class ycc {
    public static int emc = 20;
    private static volatile ycc ypw;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.emc.xq.xq> bw;
    private final Object dg = new Object();
    private AtomicBoolean ycc = new AtomicBoolean(false);
    private LruCache<String, com.bytedance.sdk.component.adexpress.emc.xq.ypw> uym = new LruCache<String, com.bytedance.sdk.component.adexpress.emc.xq.ypw>(emc) { // from class: com.bytedance.sdk.component.adexpress.emc.ypw.ycc.1
        @Override // android.util.LruCache
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.emc.xq.ypw ypwVar) {
            return 1;
        }
    };
    private Set<String> xq = Collections.synchronizedSet(new HashSet());

    private ycc() {
    }

    private void dg(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.emc.xq.ypw> lruCache;
        if (TextUtils.isEmpty(str) || (lruCache = this.uym) == null || lruCache.size() <= 0) {
            return;
        }
        synchronized (this.dg) {
            this.uym.remove(str);
        }
    }

    public static void emc(int i) {
        emc = i;
    }

    public void xq(String str) {
        com.bytedance.sdk.component.adexpress.emc.xq.xq xqVar;
        try {
            if (this.bw != null && !this.bw.isEmpty() && (xqVar = this.bw.get(str)) != null) {
                if (!TextUtils.isEmpty(xqVar.emc()) && com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().ycc() != null) {
                    com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().ycc();
                }
                this.bw.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    public Set<String> ypw(String str) {
        if (!TextUtils.isEmpty(str) && com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().ypw() != null) {
            HashSet hashSet = new HashSet();
            Cursor cursorEmc = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().ypw().emc("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            if (cursorEmc != null) {
                try {
                    try {
                        if (cursorEmc.moveToFirst()) {
                            do {
                                hashSet.add(cursorEmc.getString(cursorEmc.getColumnIndex("id")));
                            } while (cursorEmc.moveToNext());
                            return hashSet;
                        }
                    } catch (Exception e6) {
                        Log.e("TmplDbHelper", "", e6);
                    }
                } finally {
                    cursorEmc.close();
                }
            }
        }
        return null;
    }

    public static ycc emc() {
        if (ypw == null) {
            synchronized (ycc.class) {
                try {
                    if (ypw == null) {
                        ypw = new ycc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ypw;
    }

    public static String xq() {
        return "CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)";
    }

    public com.bytedance.sdk.component.adexpress.emc.xq.ypw emc(String str) {
        com.bytedance.sdk.component.adexpress.emc.xq.ypw ypwVar;
        com.bytedance.sdk.component.adexpress.emc.xq.ypw ypwVarEmc;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().ypw() == null) {
            return null;
        }
        synchronized (this.dg) {
            ypwVar = this.uym.get(String.valueOf(str));
        }
        if (ypwVar != null) {
            return ypwVar;
        }
        Cursor cursorEmc = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().ypw().emc("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (cursorEmc != null) {
            try {
                if (cursorEmc.moveToFirst()) {
                    do {
                        String string = cursorEmc.getString(cursorEmc.getColumnIndex("rit"));
                        String string2 = cursorEmc.getString(cursorEmc.getColumnIndex("id"));
                        String string3 = cursorEmc.getString(cursorEmc.getColumnIndex("md5"));
                        String string4 = cursorEmc.getString(cursorEmc.getColumnIndex("url"));
                        String string5 = cursorEmc.getString(cursorEmc.getColumnIndex("data"));
                        String string6 = cursorEmc.getString(cursorEmc.getColumnIndex("version"));
                        ypwVarEmc = new com.bytedance.sdk.component.adexpress.emc.xq.ypw().emc(string).ypw(string2).xq(string3).dg(string4).bw(string5).ycc(string6).emc(Long.valueOf(cursorEmc.getLong(cursorEmc.getColumnIndex("update_time"))));
                        synchronized (this.dg) {
                            this.uym.put(string2, ypwVarEmc);
                        }
                        this.xq.add(string2);
                    } while (cursorEmc.moveToNext());
                    cursorEmc.close();
                    return ypwVarEmc;
                }
            } catch (Throwable unused) {
            }
            cursorEmc.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<com.bytedance.sdk.component.adexpress.emc.xq.ypw> ypw() {
        if (com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().ypw() == null) {
            return null;
        }
        boolean z6 = this.ycc.get();
        this.ycc.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor cursorEmc = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().ypw().emc("template_diff_new", null, null, null, null, null, null);
        if (cursorEmc != null) {
            while (cursorEmc.moveToNext()) {
                try {
                    String string = cursorEmc.getString(cursorEmc.getColumnIndex("rit"));
                    String string2 = cursorEmc.getString(cursorEmc.getColumnIndex("id"));
                    String string3 = cursorEmc.getString(cursorEmc.getColumnIndex("md5"));
                    String string4 = cursorEmc.getString(cursorEmc.getColumnIndex("url"));
                    String string5 = cursorEmc.getString(cursorEmc.getColumnIndex("data"));
                    String string6 = cursorEmc.getString(cursorEmc.getColumnIndex("version"));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.emc.xq.ypw().emc(string).ypw(string2).xq(string3).dg(string4).bw(string5).ycc(string6).emc(Long.valueOf(cursorEmc.getLong(cursorEmc.getColumnIndex("update_time")))));
                    synchronized (this.dg) {
                        this.uym.put(string2, arrayList.get(arrayList.size() - 1));
                    }
                    this.xq.add(string2);
                    if (!z6 && com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().ycc() != null) {
                        if (this.bw == null) {
                            this.bw = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.bw.contains(string2)) {
                            this.bw.put(string2, new com.bytedance.sdk.component.adexpress.emc.xq.xq(string, string2, string3));
                        }
                    }
                } catch (Throwable unused) {
                    cursorEmc.close();
                }
            }
            cursorEmc.close();
            return arrayList;
        }
        return arrayList;
    }

    public void emc(com.bytedance.sdk.component.adexpress.emc.xq.ypw ypwVar, boolean z6) {
        if (ypwVar == null || com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().ypw() == null || TextUtils.isEmpty(ypwVar.ypw())) {
            return;
        }
        Cursor cursorEmc = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().ypw().emc("template_diff_new", null, "id=?", new String[]{ypwVar.ypw()}, null, null, null);
        boolean z7 = cursorEmc != null && cursorEmc.getCount() > 0;
        if (cursorEmc != null) {
            try {
                string = cursorEmc.moveToFirst() ? cursorEmc.getString(cursorEmc.getColumnIndex("rit")) : null;
                cursorEmc.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", ypwVar.emc());
        contentValues.put("id", ypwVar.ypw());
        contentValues.put("md5", ypwVar.xq());
        contentValues.put("url", ypwVar.dg());
        contentValues.put("data", ypwVar.bw());
        contentValues.put("version", ypwVar.ycc());
        contentValues.put("update_time", ypwVar.uym());
        if (z7) {
            com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().ypw().emc("template_diff_new", contentValues, "id=?", new String[]{ypwVar.ypw()});
        } else {
            com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().ypw().emc("template_diff_new", contentValues);
        }
        synchronized (this.dg) {
            this.uym.put(ypwVar.ypw(), ypwVar);
        }
        this.xq.add(ypwVar.ypw());
        if (z6) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().ycc() == null) {
                return;
            }
            if (this.bw == null) {
                this.bw = new ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.emc.xq.xq xqVar = new com.bytedance.sdk.component.adexpress.emc.xq.xq(ypwVar.emc(), ypwVar.ypw(), ypwVar.xq());
            this.bw.put(ypwVar.ypw(), xqVar);
            if (string != null) {
                com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().ycc();
                xqVar.ypw();
            }
            com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().ycc();
            ypwVar.emc();
        } catch (Throwable unused2) {
        }
    }

    public void emc(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().ypw() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                dg(strArr[i]);
                com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().ypw().emc("template_diff_new", "id=?", new String[]{strArr[i]});
                xq(strArr[i]);
            }
        }
    }
}
