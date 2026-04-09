package com.bytedance.sdk.component.adexpress.ouw.vt;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.ko;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class fkw {
    public static int ouw = 20;
    private static volatile fkw vt;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.ouw.lh.lh> fkw;
    private final Object yu = new Object();

    /* renamed from: le, reason: collision with root package name */
    private AtomicBoolean f7384le = new AtomicBoolean(false);
    private LruCache<String, com.bytedance.sdk.component.adexpress.ouw.lh.vt> ra = new LruCache<String, com.bytedance.sdk.component.adexpress.ouw.lh.vt>(ouw) { // from class: com.bytedance.sdk.component.adexpress.ouw.vt.fkw.1
        @Override // android.util.LruCache
        public final /* bridge */ /* synthetic */ int sizeOf(String str, com.bytedance.sdk.component.adexpress.ouw.lh.vt vtVar) {
            return 1;
        }
    };

    /* renamed from: lh, reason: collision with root package name */
    private Set<String> f7385lh = DesugarCollections.synchronizedSet(new HashSet());

    private fkw() {
    }

    public static String lh() {
        return "CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)";
    }

    public static void ouw(int i4) {
        ouw = i4;
    }

    public static Set<String> vt(String str) {
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Cursor cursorOuw = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw.ouw("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
        try {
            try {
                if (cursorOuw.moveToFirst()) {
                    do {
                        hashSet.add(cursorOuw.getString(cursorOuw.getColumnIndex(FacebookMediationAdapter.KEY_ID)));
                    } while (cursorOuw.moveToNext());
                    return hashSet;
                }
            } catch (Exception e2) {
                Log.e("TmplDbHelper", "", e2);
            }
            return null;
        } finally {
            cursorOuw.close();
        }
    }

    public static fkw ouw() {
        if (vt == null) {
            synchronized (fkw.class) {
                try {
                    if (vt == null) {
                        vt = new fkw();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return vt;
    }

    public final com.bytedance.sdk.component.adexpress.ouw.lh.vt ouw(String str) {
        com.bytedance.sdk.component.adexpress.ouw.lh.vt vtVar;
        com.bytedance.sdk.component.adexpress.ouw.lh.vt vtVar2;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw == null) {
            return null;
        }
        synchronized (this.yu) {
            vtVar = this.ra.get(String.valueOf(str));
        }
        if (vtVar != null) {
            return vtVar;
        }
        Cursor cursorOuw = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw.ouw("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        try {
            if (cursorOuw.moveToFirst()) {
                do {
                    String string = cursorOuw.getString(cursorOuw.getColumnIndex("rit"));
                    String string2 = cursorOuw.getString(cursorOuw.getColumnIndex(FacebookMediationAdapter.KEY_ID));
                    String string3 = cursorOuw.getString(cursorOuw.getColumnIndex("md5"));
                    String string4 = cursorOuw.getString(cursorOuw.getColumnIndex("url"));
                    String string5 = cursorOuw.getString(cursorOuw.getColumnIndex("data"));
                    String string6 = cursorOuw.getString(cursorOuw.getColumnIndex("version"));
                    Long lValueOf = Long.valueOf(cursorOuw.getLong(cursorOuw.getColumnIndex("update_time")));
                    vtVar2 = new com.bytedance.sdk.component.adexpress.ouw.lh.vt();
                    vtVar2.ouw = string;
                    vtVar2.vt = string2;
                    vtVar2.f7379lh = string3;
                    vtVar2.yu = string4;
                    vtVar2.fkw = string5;
                    vtVar2.f7378le = string6;
                    vtVar2.ra = lValueOf;
                    synchronized (this.yu) {
                        this.ra.put(string2, vtVar2);
                    }
                    this.f7385lh.add(string2);
                } while (cursorOuw.moveToNext());
                return vtVar2;
            }
        } finally {
            try {
                return null;
            } finally {
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<com.bytedance.sdk.component.adexpress.ouw.lh.vt> vt() {
        if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw == null) {
            return null;
        }
        boolean z3 = this.f7384le.get();
        this.f7384le.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor cursorOuw = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw.ouw("template_diff_new", null, null, null, null, null, null);
        while (cursorOuw.moveToNext()) {
            try {
                String string = cursorOuw.getString(cursorOuw.getColumnIndex("rit"));
                String string2 = cursorOuw.getString(cursorOuw.getColumnIndex(FacebookMediationAdapter.KEY_ID));
                String string3 = cursorOuw.getString(cursorOuw.getColumnIndex("md5"));
                String string4 = cursorOuw.getString(cursorOuw.getColumnIndex("url"));
                String string5 = cursorOuw.getString(cursorOuw.getColumnIndex("data"));
                String string6 = cursorOuw.getString(cursorOuw.getColumnIndex("version"));
                Long lValueOf = Long.valueOf(cursorOuw.getLong(cursorOuw.getColumnIndex("update_time")));
                com.bytedance.sdk.component.adexpress.ouw.lh.vt vtVar = new com.bytedance.sdk.component.adexpress.ouw.lh.vt();
                vtVar.ouw = string;
                vtVar.vt = string2;
                vtVar.f7379lh = string3;
                vtVar.yu = string4;
                vtVar.fkw = string5;
                vtVar.f7378le = string6;
                vtVar.ra = lValueOf;
                arrayList.add(vtVar);
                synchronized (this.yu) {
                    this.ra.put(string2, arrayList.get(arrayList.size() - 1));
                }
                this.f7385lh.add(string2);
                if (!z3 && com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().fkw != null) {
                    if (this.fkw == null) {
                        this.fkw = new ConcurrentHashMap<>();
                    }
                    if (string2 != null && !this.fkw.contains(string2)) {
                        this.fkw.put(string2, new com.bytedance.sdk.component.adexpress.ouw.lh.lh(string, string2, string3));
                    }
                }
            } catch (Throwable th2) {
                try {
                    ko.lh("TmplDbHelper", "getTemplate error", th2);
                    return arrayList;
                } finally {
                    cursorOuw.close();
                }
            }
        }
        return arrayList;
    }

    public final void ouw(com.bytedance.sdk.component.adexpress.ouw.lh.vt vtVar, boolean z3) {
        if (vtVar == null || com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw == null || TextUtils.isEmpty(vtVar.vt)) {
            return;
        }
        Cursor cursorOuw = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw.ouw("template_diff_new", null, "id=?", new String[]{vtVar.vt}, null, null, null);
        boolean z10 = cursorOuw.getCount() > 0;
        try {
            string = cursorOuw.moveToFirst() ? cursorOuw.getString(cursorOuw.getColumnIndex("rit")) : null;
            cursorOuw.close();
        } catch (Throwable unused) {
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", vtVar.ouw);
        contentValues.put(FacebookMediationAdapter.KEY_ID, vtVar.vt);
        contentValues.put("md5", vtVar.f7379lh);
        contentValues.put("url", vtVar.yu);
        contentValues.put("data", vtVar.fkw);
        contentValues.put("version", vtVar.f7378le);
        contentValues.put("update_time", vtVar.ra);
        if (z10) {
            com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw.ouw("template_diff_new", contentValues, "id=?", new String[]{vtVar.vt});
        } else {
            com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw.ouw("template_diff_new", contentValues);
        }
        synchronized (this.yu) {
            this.ra.put(vtVar.vt, vtVar);
        }
        this.f7385lh.add(vtVar.vt);
        if (z3) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().fkw == null) {
                return;
            }
            if (this.fkw == null) {
                this.fkw = new ConcurrentHashMap<>();
            }
            this.fkw.put(vtVar.vt, new com.bytedance.sdk.component.adexpress.ouw.lh.lh(vtVar.ouw, vtVar.vt, vtVar.f7379lh));
            if (string != null) {
                com.bytedance.sdk.component.adexpress.ouw.ouw.fkw fkwVar = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().fkw;
            }
            com.bytedance.sdk.component.adexpress.ouw.ouw.fkw fkwVar2 = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().fkw;
        } catch (Throwable unused2) {
        }
    }

    public final void ouw(Set<String> set) {
        com.bytedance.sdk.component.adexpress.ouw.lh.lh lhVar;
        LruCache<String, com.bytedance.sdk.component.adexpress.ouw.lh.vt> lruCache;
        if (set.isEmpty() || com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i4 = 0; i4 < strArr.length; i4++) {
                String str = strArr[i4];
                if (!TextUtils.isEmpty(str) && (lruCache = this.ra) != null && lruCache.size() > 0) {
                    synchronized (this.yu) {
                        this.ra.remove(str);
                    }
                }
                com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().ouw.ouw("template_diff_new", "id=?", new String[]{strArr[i4]});
                String str2 = strArr[i4];
                try {
                    if (this.fkw != null && !this.fkw.isEmpty() && (lhVar = this.fkw.get(str2)) != null) {
                        if (!TextUtils.isEmpty(lhVar.ouw) && com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().fkw != null) {
                            com.bytedance.sdk.component.adexpress.ouw.ouw.fkw fkwVar = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().fkw;
                        }
                        this.fkw.remove(str2);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }
}
