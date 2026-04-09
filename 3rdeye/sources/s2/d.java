package S2;

import L2.h;
import R2.q;
import R2.r;
import R2.u;
import T1.B;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import g3.C4389b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* compiled from: QMediaStoreUriLoader.java */
/* loaded from: classes.dex */
public final class d<DataT> implements q<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11872a;

    /* renamed from: b, reason: collision with root package name */
    public final q<File, DataT> f11873b;

    /* renamed from: c, reason: collision with root package name */
    public final q<Uri, DataT> f11874c;

    /* renamed from: d, reason: collision with root package name */
    public final Class<DataT> f11875d;

    /* compiled from: QMediaStoreUriLoader.java */
    public static abstract class a<DataT> implements r<Uri, DataT> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f11876a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<DataT> f11877b;

        public a(Context context, Class<DataT> cls) {
            this.f11876a = context;
            this.f11877b = cls;
        }

        @Override // R2.r
        public final q<Uri, DataT> c(u uVar) {
            Class<DataT> cls = this.f11877b;
            return new d(this.f11876a, uVar.b(File.class, cls), uVar.b(Uri.class, cls), cls);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    public static final class b extends a<ParcelFileDescriptor> {
    }

    /* compiled from: QMediaStoreUriLoader.java */
    public static final class c extends a<InputStream> {
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* renamed from: S2.d$d, reason: collision with other inner class name */
    public static final class C0163d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: l, reason: collision with root package name */
        public static final String[] f11878l = {"_data"};

        /* renamed from: b, reason: collision with root package name */
        public final Context f11879b;

        /* renamed from: c, reason: collision with root package name */
        public final q<File, DataT> f11880c;

        /* renamed from: d, reason: collision with root package name */
        public final q<Uri, DataT> f11881d;

        /* renamed from: e, reason: collision with root package name */
        public final Uri f11882e;

        /* renamed from: f, reason: collision with root package name */
        public final int f11883f;

        /* renamed from: g, reason: collision with root package name */
        public final int f11884g;

        /* renamed from: h, reason: collision with root package name */
        public final h f11885h;
        public final Class<DataT> i;

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f11886j;

        /* renamed from: k, reason: collision with root package name */
        public volatile com.bumptech.glide.load.data.d<DataT> f11887k;

        public C0163d(Context context, q<File, DataT> qVar, q<Uri, DataT> qVar2, Uri uri, int i, int i10, h hVar, Class<DataT> cls) {
            this.f11879b = context.getApplicationContext();
            this.f11880c = qVar;
            this.f11881d = qVar2;
            this.f11882e = uri;
            this.f11883f = i;
            this.f11884g = i10;
            this.f11885h = hVar;
            this.i = cls;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<DataT> a() {
            return this.i;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f11887k;
            if (dVar != null) {
                dVar.b();
            }
        }

        public final com.bumptech.glide.load.data.d<DataT> c() throws Throwable {
            q.a<DataT> aVarB;
            boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            Context context = this.f11879b;
            h hVar = this.f11885h;
            int i = this.f11884g;
            int i10 = this.f11883f;
            if (zIsExternalStorageLegacy) {
                Uri uri = this.f11882e;
                try {
                    Cursor cursorQuery = context.getContentResolver().query(uri, f11878l, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                aVarB = this.f11880c.b(file, i10, i, hVar);
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
                Uri requireOriginal = this.f11882e;
                boolean zP = B.p(requireOriginal);
                q<Uri, DataT> qVar = this.f11881d;
                if (zP && requireOriginal.getPathSegments().contains("picker")) {
                    aVarB = qVar.b(requireOriginal, i10, i, hVar);
                } else {
                    if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                    }
                    aVarB = qVar.b(requireOriginal, i10, i, hVar);
                }
            }
            if (aVarB != null) {
                return aVarB.f11688c;
            }
            return null;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
            this.f11886j = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f11887k;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final L2.a d() {
            return L2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.h hVar, d.a<? super DataT> aVar) throws Throwable {
            try {
                com.bumptech.glide.load.data.d<DataT> dVarC = c();
                if (dVarC == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f11882e));
                } else {
                    this.f11887k = dVarC;
                    if (this.f11886j) {
                        cancel();
                    } else {
                        dVarC.e(hVar, aVar);
                    }
                }
            } catch (FileNotFoundException e4) {
                aVar.c(e4);
            }
        }
    }

    public d(Context context, q<File, DataT> qVar, q<Uri, DataT> qVar2, Class<DataT> cls) {
        this.f11872a = context.getApplicationContext();
        this.f11873b = qVar;
        this.f11874c = qVar2;
        this.f11875d = cls;
    }

    @Override // R2.q
    public final boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && B.p(uri);
    }

    @Override // R2.q
    public final q.a b(Uri uri, int i, int i10, h hVar) {
        Uri uri2 = uri;
        return new q.a(new C4389b(uri2), new C0163d(this.f11872a, this.f11873b, this.f11874c, uri2, i, i10, hVar, this.f11875d));
    }
}
