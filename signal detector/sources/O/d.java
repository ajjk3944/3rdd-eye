package O;

import A2.C0117e;
import L2.w;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import androidx.recyclerview.widget.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f3037a = new p0(2);

    /* renamed from: b, reason: collision with root package name */
    public static final a f3038b = new a();

    public static w a(Context context, List list) {
        R3.b.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                e eVar = (e) list.get(i);
                ProviderInfo providerInfoB = b(context.getPackageManager(), eVar, context.getResources());
                if (providerInfoB == null) {
                    return new w(1, (byte) 0);
                }
                arrayList.add(c(context, eVar, providerInfoB.authority));
            }
            return new w(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, e eVar, Resources resources) {
        a aVar = f3038b;
        p0 p0Var = f3037a;
        R3.b.c("FontProvider.getProvider");
        try {
            List listK = eVar.f3042d;
            String str = eVar.f3039a;
            String str2 = eVar.f3040b;
            if (listK == null) {
                listK = I.b.k(resources, 0);
            }
            c cVar = new c();
            cVar.f3034a = str;
            cVar.f3035b = str2;
            cVar.f3036c = listK;
            ProviderInfo providerInfo = (ProviderInfo) p0Var.h(cVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, aVar);
            for (int i = 0; i < listK.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listK.get(i));
                Collections.sort(arrayList2, aVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i3), (byte[]) arrayList2.get(i3))) {
                            break;
                        }
                    }
                    p0Var.o(cVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static i[] c(Context context, e eVar, String str) {
        R3.b.c("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            b jVar = Build.VERSION.SDK_INT < 24 ? new U0.j(context, uriBuild) : new C0117e(context, uriBuild);
            Cursor cursorL = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                R3.b.c("ContentQueryWrapper.query");
                try {
                    cursorL = jVar.l(uriBuild, strArr, new String[]{eVar.f3041c});
                    Trace.endSection();
                    if (cursorL != null && cursorL.getCount() > 0) {
                        int columnIndex = cursorL.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorL.getColumnIndex("_id");
                        int columnIndex3 = cursorL.getColumnIndex("file_id");
                        int columnIndex4 = cursorL.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorL.getColumnIndex("font_weight");
                        int columnIndex6 = cursorL.getColumnIndex("font_italic");
                        while (cursorL.moveToNext()) {
                            int i = columnIndex != -1 ? cursorL.getInt(columnIndex) : 0;
                            arrayList2.add(new i(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorL.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorL.getLong(columnIndex3)), columnIndex4 != -1 ? cursorL.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorL.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorL.getInt(columnIndex6) == 1, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorL != null) {
                        cursorL.close();
                    }
                    jVar.close();
                    return (i[]) arrayList.toArray(new i[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursorL != null) {
                    cursorL.close();
                }
                jVar.close();
                throw th;
            }
        } finally {
        }
    }
}
