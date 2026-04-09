package b4;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import androidx.recyclerview.widget.g2;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.internal.measurement.z3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final g2 f1673a = new g2(2);

    /* renamed from: b, reason: collision with root package name */
    public static final b f1674b = new b(0);

    public static t7.m a(Context context, List list) {
        String str;
        Typeface typefaceC;
        Trace.beginSection(z3.w("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < list.size(); i4++) {
                f fVar = (f) list.get(i4);
                if (Build.VERSION.SDK_INT < 31 || (typefaceC = v3.e.c((str = fVar.f1679e))) == null || v3.e.d(typefaceC) == null) {
                    ProviderInfo providerInfoB = b(context.getPackageManager(), fVar, context.getResources());
                    if (providerInfoB == null) {
                        return new t7.m((byte) 0, 2);
                    }
                    arrayList.add(c(context, fVar, providerInfoB.authority));
                } else {
                    arrayList.add(new k[]{new k(str, fVar.f1680f)});
                }
            }
            return new t7.m(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, f fVar, Resources resources) {
        b bVar = f1674b;
        g2 g2Var = f1673a;
        Trace.beginSection(z3.w("FontProvider.getProvider"));
        try {
            List listL = fVar.f1678d;
            String str = fVar.f1675a;
            String str2 = fVar.f1676b;
            if (listL == null) {
                listL = u3.b.l(resources, 0);
            }
            d dVar = new d();
            dVar.f1670a = str;
            dVar.f1671b = str2;
            dVar.f1672c = listL;
            ProviderInfo providerInfo = (ProviderInfo) g2Var.g(dVar);
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
            Collections.sort(arrayList, bVar);
            for (int i4 = 0; i4 < listL.size(); i4++) {
                ArrayList arrayList2 = new ArrayList((Collection) listL.get(i4));
                Collections.sort(arrayList2, bVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i10), (byte[]) arrayList2.get(i10))) {
                            break;
                        }
                    }
                    g2Var.k(dVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static k[] c(Context context, f fVar, String str) {
        Trace.beginSection(z3.w("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority(str).appendPath("file").build();
            c cVar = Build.VERSION.SDK_INT < 24 ? new o7.c(context, uriBuild) : new o7.d(context, uriBuild);
            Cursor cursorL = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(z3.w("ContentQueryWrapper.query"));
                try {
                    cursorL = cVar.l(uriBuild, strArr, new String[]{fVar.f1677c});
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
                            int i4 = columnIndex != -1 ? cursorL.getInt(columnIndex) : 0;
                            arrayList2.add(new k(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorL.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorL.getLong(columnIndex3)), columnIndex4 != -1 ? cursorL.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorL.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorL.getInt(columnIndex6) == 1, i4));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorL != null) {
                        cursorL.close();
                    }
                    cVar.close();
                    return (k[]) arrayList.toArray(new k[0]);
                } finally {
                }
            } catch (Throwable th2) {
                if (cursorL != null) {
                    cursorL.close();
                }
                cVar.close();
                throw th2;
            }
        } finally {
        }
    }
}
