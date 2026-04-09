package H0;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import androidx.work.s;
import com.applovin.sdk.AppLovinEventTypes;
import io.appmetrica.analytics.impl.Oo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: FontProvider.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1979a = new d(0);

    /* compiled from: FontProvider.java */
    public interface a {
        Cursor a(Uri uri, String[] strArr, String[] strArr2);

        void close();
    }

    /* compiled from: FontProvider.java */
    public static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f1980a;

        public b(Context context, Uri uri) {
            this.f1980a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // H0.e.a
        public final Cursor a(Uri uri, String[] strArr, String[] strArr2) {
            ContentProviderClient contentProviderClient = this.f1980a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
            } catch (RemoteException e4) {
                Log.w("FontsProvider", "Unable to query the content provider", e4);
                return null;
            }
        }

        @Override // H0.e.a
        public final void close() {
            ContentProviderClient contentProviderClient = this.f1980a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    /* compiled from: FontProvider.java */
    public static class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f1981a;

        public c(Context context, Uri uri) {
            this.f1981a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // H0.e.a
        public final Cursor a(Uri uri, String[] strArr, String[] strArr2) {
            ContentProviderClient contentProviderClient = this.f1981a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
            } catch (RemoteException e4) {
                Log.w("FontsProvider", "Unable to query the content provider", e4);
                return null;
            }
        }

        @Override // H0.e.a
        public final void close() {
            ContentProviderClient contentProviderClient = this.f1981a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    public static l a(Context context, f fVar) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        Cursor cursorA;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) fVar.f1983c;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(s.d("No package found for authority: ", str));
        }
        String str2 = providerInfoResolveContentProvider.packageName;
        String str3 = (String) fVar.f1984d;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException(Oo.f("Found content provider ", str, ", but package was not ", str3));
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        d dVar = f1979a;
        Collections.sort(arrayList, dVar);
        List<List<byte[]>> listB = (List) fVar.f1987g;
        if (listB == null) {
            listB = B0.e.b(resources, 0);
        }
        int i = 0;
        loop1: while (true) {
            cursorA = null;
            if (i >= listB.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList(listB.get(i));
            Collections.sort(arrayList2, dVar);
            if (arrayList.size() == arrayList2.size()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!Arrays.equals((byte[]) arrayList.get(i10), (byte[]) arrayList2.get(i10))) {
                        break;
                    }
                }
                break loop1;
            }
            i++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new l(1, null);
        }
        String str4 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority(str4).build();
        Uri uriBuild2 = new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority(str4).appendPath("file").build();
        a bVar = Build.VERSION.SDK_INT < 24 ? new b(context, uriBuild) : new c(context, uriBuild);
        try {
            cursorA = bVar.a(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, new String[]{(String) fVar.f1985e});
            if (cursorA != null && cursorA.getCount() > 0) {
                int columnIndex = cursorA.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorA.getColumnIndex("_id");
                int columnIndex3 = cursorA.getColumnIndex("file_id");
                int columnIndex4 = cursorA.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorA.getColumnIndex("font_weight");
                int columnIndex6 = cursorA.getColumnIndex("font_italic");
                while (cursorA.moveToNext()) {
                    arrayList3.add(new m(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorA.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorA.getLong(columnIndex3)), columnIndex4 != -1 ? cursorA.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorA.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorA.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorA.getInt(columnIndex) : 0));
                }
            }
            if (cursorA != null) {
                cursorA.close();
            }
            bVar.close();
            return new l(0, (m[]) arrayList3.toArray(new m[0]));
        } catch (Throwable th) {
            if (cursorA != null) {
                cursorA.close();
            }
            bVar.close();
            throw th;
        }
    }
}
