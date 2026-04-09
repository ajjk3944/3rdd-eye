package com.bytedance.sdk.openadsdk.multipro.emc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.bw;

/* loaded from: classes.dex */
public class ypw implements com.bytedance.sdk.openadsdk.multipro.emc {
    private static final Object ypw = new Object();
    private Context emc;

    private boolean ypw(Uri uri) {
        return uri == null || TextUtils.isEmpty(uri.getPath());
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    @NonNull
    public String emc() {
        return "t_db";
    }

    private Context ypw() {
        Context context = this.emc;
        return context == null ? aa.emc() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public Cursor emc(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        synchronized (ypw) {
            try {
                if (ypw(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str3 = strArrSplit[2];
                    String str4 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str3)) {
                        return null;
                    }
                    return bw.emc(ypw()).emc().emc(str4, strArr, str, strArr2, null, null, str2);
                }
                return null;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public String emc(@NonNull Uri uri) {
        synchronized (ypw) {
            try {
                if (ypw(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 5) {
                    String str = strArrSplit[2];
                    String str2 = strArrSplit[4];
                    if ("ttopensdk.db".equals(str)) {
                        if ("execSQL".equals(str2)) {
                            String queryParameter = uri.getQueryParameter("sql");
                            if (!TextUtils.isEmpty(queryParameter)) {
                                bw.emc(ypw()).emc().emc(Uri.decode(queryParameter));
                            }
                        } else if ("transactionBegin".equals(str2)) {
                            bw.emc(ypw()).emc().ypw();
                        } else if ("transactionSetSuccess".equals(str2)) {
                            bw.emc(ypw()).emc().xq();
                        } else if ("transactionEnd".equals(str2)) {
                            bw.emc(ypw()).emc().dg();
                        }
                    }
                    return null;
                }
                return null;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public Uri emc(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        synchronized (ypw) {
            try {
                if (ypw(uri)) {
                    return null;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str = strArrSplit[2];
                    String str2 = strArrSplit[3];
                    if ("ttopensdk.db".equals(str)) {
                        bw.emc(ypw()).emc().emc(str2, (String) null, contentValues);
                    }
                    return null;
                }
                return null;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public int emc(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        synchronized (ypw) {
            try {
                if (ypw(uri)) {
                    return 0;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str2 = strArrSplit[2];
                    String str3 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str2)) {
                        return 0;
                    }
                    return bw.emc(ypw()).emc().emc(str3, str, strArr);
                }
                return 0;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public int emc(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        synchronized (ypw) {
            try {
                if (ypw(uri)) {
                    return 0;
                }
                String[] strArrSplit = uri.getPath().split("/");
                if (strArrSplit != null && strArrSplit.length >= 4) {
                    String str2 = strArrSplit[2];
                    String str3 = strArrSplit[3];
                    if (!"ttopensdk.db".equals(str2)) {
                        return 0;
                    }
                    return bw.emc(ypw()).emc().emc(str3, contentValues, str, strArr);
                }
                return 0;
            } finally {
            }
        }
    }
}
