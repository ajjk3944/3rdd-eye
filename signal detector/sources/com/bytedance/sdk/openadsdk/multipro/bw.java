package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class bw implements emc {
    private static volatile bw emc;
    private static final List<emc> xq;
    private static WeakReference<Context> ypw;

    static {
        List<emc> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        xq = listSynchronizedList;
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.dg.xq());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.emc.ypw());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.xq.emc());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.dg.emc.xq(new com.bytedance.sdk.component.ycc.emc.ypw.ypw.ypw()));
        Iterator<emc> it = listSynchronizedList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private bw() {
    }

    public static bw emc(Context context) {
        if (context != null) {
            ypw = new WeakReference<>(context.getApplicationContext());
        }
        if (emc == null) {
            synchronized (bw.class) {
                try {
                    if (emc == null) {
                        emc = new bw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return emc;
    }

    private boolean xq(Uri uri) {
        return true;
    }

    private emc ypw(Uri uri) {
        if (uri == null || !xq(uri)) {
            return null;
        }
        String[] strArrSplit = uri.getPath().split("/");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (emc emcVar : xq) {
            if (str.equals(emcVar.emc())) {
                return emcVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public String emc() {
        return "";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public Cursor emc(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            emc emcVarYpw = ypw(uri);
            if (emcVarYpw != null) {
                return emcVarYpw.emc(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public String emc(Uri uri) {
        try {
            emc emcVarYpw = ypw(uri);
            if (emcVarYpw != null) {
                return emcVarYpw.emc(uri);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public Uri emc(Uri uri, ContentValues contentValues) {
        try {
            emc emcVarYpw = ypw(uri);
            if (emcVarYpw != null) {
                return emcVarYpw.emc(uri, contentValues);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public int emc(Uri uri, String str, String[] strArr) {
        try {
            emc emcVarYpw = ypw(uri);
            if (emcVarYpw != null) {
                return emcVarYpw.emc(uri, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public int emc(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            emc emcVarYpw = ypw(uri);
            if (emcVarYpw != null) {
                return emcVarYpw.emc(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
