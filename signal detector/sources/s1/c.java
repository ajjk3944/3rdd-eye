package s1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import l1.h;
import m1.AbstractC2652a;
import r1.q;
import r1.r;

/* loaded from: classes.dex */
public final class c implements com.bumptech.glide.load.data.d {

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f23429k = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f23430a;

    /* renamed from: b, reason: collision with root package name */
    public final r f23431b;

    /* renamed from: c, reason: collision with root package name */
    public final r f23432c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f23433d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23434e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23435f;

    /* renamed from: g, reason: collision with root package name */
    public final h f23436g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f23437h;
    public volatile boolean i;

    /* renamed from: j, reason: collision with root package name */
    public volatile com.bumptech.glide.load.data.d f23438j;

    public c(Context context, r rVar, r rVar2, Uri uri, int i, int i3, h hVar, Class cls) {
        this.f23430a = context.getApplicationContext();
        this.f23431b = rVar;
        this.f23432c = rVar2;
        this.f23433d = uri;
        this.f23434e = i;
        this.f23435f = i3;
        this.f23436g = hVar;
        this.f23437h = cls;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return this.f23437h;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        com.bumptech.glide.load.data.d dVar = this.f23438j;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.i = true;
        com.bumptech.glide.load.data.d dVar = this.f23438j;
        if (dVar != null) {
            dVar.cancel();
        }
    }

    public final com.bumptech.glide.load.data.d d() throws Throwable {
        q qVarA;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f23430a;
        h hVar = this.f23436g;
        int i = this.f23435f;
        int i3 = this.f23434e;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f23433d;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, f23429k, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            qVarA = this.f23431b.a(file, i3, i, hVar);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri requireOriginal = this.f23433d;
            boolean zA = AbstractC2652a.a(requireOriginal);
            r rVar = this.f23432c;
            if (zA && requireOriginal.getPathSegments().contains("picker")) {
                qVarA = rVar.a(requireOriginal, i3, i, hVar);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                qVarA = rVar.a(requireOriginal, i3, i, hVar);
            }
        }
        if (qVarA != null) {
            return qVarA.f23370c;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.c cVar) throws Throwable {
        try {
            com.bumptech.glide.load.data.d dVarD = d();
            if (dVarD == null) {
                cVar.d(new IllegalArgumentException("Failed to build fetcher for: " + this.f23433d));
            } else {
                this.f23438j = dVarD;
                if (this.i) {
                    cancel();
                } else {
                    dVarD.e(hVar, cVar);
                }
            }
        } catch (FileNotFoundException e6) {
            cVar.d(e6);
        }
    }
}
