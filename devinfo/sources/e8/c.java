package e8;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.i;
import d8.u;
import d8.v;
import java.io.File;
import java.io.FileNotFoundException;
import x7.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements com.bumptech.glide.load.data.d {

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f22448k = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f22449a;

    /* renamed from: b, reason: collision with root package name */
    public final v f22450b;

    /* renamed from: c, reason: collision with root package name */
    public final v f22451c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f22452d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22453e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22454f;
    public final h g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f22455h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f22456i;
    public volatile com.bumptech.glide.load.data.d j;

    public c(Context context, v vVar, v vVar2, Uri uri, int i4, int i10, h hVar, Class cls) {
        this.f22449a = context.getApplicationContext();
        this.f22450b = vVar;
        this.f22451c = vVar2;
        this.f22452d = uri;
        this.f22453e = i4;
        this.f22454f = i10;
        this.g = hVar;
        this.f22455h = cls;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return this.f22455h;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        com.bumptech.glide.load.data.d dVar = this.j;
        if (dVar != null) {
            dVar.b();
        }
    }

    public final com.bumptech.glide.load.data.d c() throws Throwable {
        u uVarA;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f22449a;
        h hVar = this.g;
        int i4 = this.f22454f;
        int i10 = this.f22453e;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f22452d;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f22448k, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            uVarA = this.f22450b.a(file, i10, i4, hVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            Uri requireOriginal = this.f22452d;
            boolean zG = f4.d.g(requireOriginal);
            v vVar = this.f22451c;
            if (zG && requireOriginal.getPathSegments().contains("picker")) {
                uVarA = vVar.a(requireOriginal, i10, i4, hVar);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                uVarA = vVar.a(requireOriginal, i10, i4, hVar);
            }
        }
        if (uVarA != null) {
            return uVarA.f22049c;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f22456i = true;
        com.bumptech.glide.load.data.d dVar = this.j;
        if (dVar != null) {
            dVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(i iVar, com.bumptech.glide.load.data.c cVar) throws Throwable {
        try {
            com.bumptech.glide.load.data.d dVarC = c();
            if (dVarC == null) {
                cVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f22452d));
            } else {
                this.j = dVarC;
                if (this.f22456i) {
                    cancel();
                } else {
                    dVarC.e(iVar, cVar);
                }
            }
        } catch (FileNotFoundException e2) {
            cVar.c(e2);
        }
    }
}
