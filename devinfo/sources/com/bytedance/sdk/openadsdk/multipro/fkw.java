package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ko;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class fkw implements ouw {

    /* renamed from: lh, reason: collision with root package name */
    private static final List<ouw> f8594lh;
    private static volatile fkw ouw;
    private static WeakReference<Context> vt;

    static {
        List<ouw> listSynchronizedList = DesugarCollections.synchronizedList(new ArrayList());
        f8594lh = listSynchronizedList;
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.yu.lh());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.ouw.vt());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.lh.ouw());
        listSynchronizedList.add(new com.bytedance.sdk.openadsdk.yu.ouw.lh(new com.bytedance.sdk.component.le.ouw.vt.vt.ouw()));
        Iterator<ouw> it = listSynchronizedList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private fkw() {
    }

    public static fkw ouw(Context context) {
        if (context != null) {
            vt = new WeakReference<>(context.getApplicationContext());
        }
        if (ouw == null) {
            synchronized (fkw.class) {
                try {
                    if (ouw == null) {
                        ouw = new fkw();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return ouw;
    }

    private static ouw vt(Uri uri) {
        if (uri == null) {
            return null;
        }
        String[] strArrSplit = uri.getPath().split("/");
        if (strArrSplit.length < 2) {
            ko.vt("TTProviderManager", "uri is error2");
            return null;
        }
        String str = strArrSplit[1];
        if (TextUtils.isEmpty(str)) {
            ko.vt("TTProviderManager", "uri is error3");
            return null;
        }
        for (ouw ouwVar : f8594lh) {
            if (str.equals(ouwVar.ouw())) {
                return ouwVar;
            }
        }
        ko.vt("TTProviderManager", "uri is error4");
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final String ouw() {
        return "";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final Cursor ouw(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            ouw ouwVarVt = vt(uri);
            if (ouwVarVt != null) {
                return ouwVarVt.ouw(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable th2) {
            ko.ouw("TTProviderManager", "==provider query error==", th2);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final String ouw(Uri uri) {
        try {
            ouw ouwVarVt = vt(uri);
            if (ouwVarVt != null) {
                return ouwVarVt.ouw(uri);
            }
            return null;
        } catch (Throwable th2) {
            ko.ouw("TTProviderManager", "==provider getType error==", th2);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final Uri ouw(Uri uri, ContentValues contentValues) {
        try {
            ouw ouwVarVt = vt(uri);
            if (ouwVarVt != null) {
                return ouwVarVt.ouw(uri, contentValues);
            }
            return null;
        } catch (Throwable th2) {
            ko.ouw("TTProviderManager", "==provider insert error==", th2);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final int ouw(Uri uri, String str, String[] strArr) {
        try {
            ouw ouwVarVt = vt(uri);
            if (ouwVarVt != null) {
                return ouwVarVt.ouw(uri, str, strArr);
            }
            return 0;
        } catch (Throwable th2) {
            ko.ouw("TTProviderManager", "==provider delete error==", th2);
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final int ouw(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        try {
            ouw ouwVarVt = vt(uri);
            if (ouwVarVt != null) {
                return ouwVarVt.ouw(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable th2) {
            ko.ouw("TTProviderManager", "==provider update error==", th2);
            return 0;
        }
    }
}
