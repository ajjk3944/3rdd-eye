package com.bytedance.sdk.openadsdk.multipro.dg;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.aa;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* loaded from: classes.dex */
public class xq implements com.bytedance.sdk.openadsdk.multipro.emc {
    private Context emc;

    private Context ypw() {
        Context context = this.emc;
        return context == null ? aa.emc() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    @NonNull
    public String emc() {
        return "t_sp";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public Cursor emc(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        Map<String, ?> mapXq;
        if (!uri.getPath().split("/")[2].equals("get_all") || (mapXq = ypw.xq(ypw(), uri.getQueryParameter("sp_file_name"))) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (String str3 : mapXq.keySet()) {
            Object[] objArr = new Object[3];
            objArr[0] = str3;
            Object obj = mapXq.get(str3);
            objArr[2] = obj;
            if (obj instanceof Boolean) {
                objArr[1] = "boolean";
            } else if (obj instanceof String) {
                objArr[1] = "string";
            } else if (obj instanceof Integer) {
                objArr[1] = "int";
            } else if (obj instanceof Long) {
                objArr[1] = "long";
            } else if (obj instanceof Float) {
                objArr[1] = "float";
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public String emc(@NonNull Uri uri) {
        String[] strArrSplit = uri.getPath().split("/");
        String str = strArrSplit[2];
        String str2 = strArrSplit[3];
        if (str.equals("contain")) {
            return String.valueOf(ypw.emc(aa.emc(), uri.getQueryParameter("sp_file_name"), str2));
        }
        return ypw.emc(ypw(), uri.getQueryParameter("sp_file_name"), str2, str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public Uri emc(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String str = uri.getPath().split("/")[3];
        Object obj = contentValues.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (obj != null) {
            ypw.emc(ypw(), uri.getQueryParameter("sp_file_name"), str, obj);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public int emc(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        String[] strArrSplit = uri.getPath().split("/");
        if (strArrSplit[2].equals("clean")) {
            ypw.ypw(ypw(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        String str2 = strArrSplit[3];
        if (ypw.emc(ypw(), uri.getQueryParameter("sp_file_name"), str2)) {
            ypw.ypw(ypw(), uri.getQueryParameter("sp_file_name"), str2);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.emc
    public int emc(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        emc(uri, contentValues);
        return 0;
    }
}
