package J2;

import I2.n;
import I2.o;
import I2.r;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class d implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9733a;

    /* renamed from: b, reason: collision with root package name */
    private final n f9734b;

    /* renamed from: c, reason: collision with root package name */
    private final n f9735c;

    /* renamed from: d, reason: collision with root package name */
    private final Class f9736d;

    private static abstract class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Context f9737a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f9738b;

        a(Context context, Class cls) {
            this.f9737a = context;
            this.f9738b = cls;
        }

        @Override // I2.o
        public final n d(r rVar) {
            return new d(this.f9737a, rVar.d(File.class, this.f9738b), rVar.d(Uri.class, this.f9738b), this.f9738b);
        }
    }

    public static final class b extends a {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: J2.d$d, reason: collision with other inner class name */
    private static final class C0388d implements com.bumptech.glide.load.data.d {

        /* renamed from: k, reason: collision with root package name */
        private static final String[] f9739k = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final Context f9740a;

        /* renamed from: b, reason: collision with root package name */
        private final n f9741b;

        /* renamed from: c, reason: collision with root package name */
        private final n f9742c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f9743d;

        /* renamed from: e, reason: collision with root package name */
        private final int f9744e;

        /* renamed from: f, reason: collision with root package name */
        private final int f9745f;

        /* renamed from: g, reason: collision with root package name */
        private final C2.g f9746g;

        /* renamed from: h, reason: collision with root package name */
        private final Class f9747h;

        /* renamed from: i, reason: collision with root package name */
        private volatile boolean f9748i;

        /* renamed from: j, reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d f9749j;

        C0388d(Context context, n nVar, n nVar2, Uri uri, int i10, int i11, C2.g gVar, Class cls) {
            this.f9740a = context.getApplicationContext();
            this.f9741b = nVar;
            this.f9742c = nVar2;
            this.f9743d = uri;
            this.f9744e = i10;
            this.f9745f = i11;
            this.f9746g = gVar;
            this.f9747h = cls;
        }

        private n.a c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f9741b.a(h(this.f9743d), this.f9744e, this.f9745f, this.f9746g);
            }
            if (D2.b.a(this.f9743d)) {
                return this.f9742c.a(this.f9743d, this.f9744e, this.f9745f, this.f9746g);
            }
            return this.f9742c.a(g() ? MediaStore.setRequireOriginal(this.f9743d) : this.f9743d, this.f9744e, this.f9745f, this.f9746g);
        }

        private com.bumptech.glide.load.data.d f() {
            n.a aVarC = c();
            if (aVarC != null) {
                return aVarC.f8513c;
            }
            return null;
        }

        private boolean g() {
            return this.f9740a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File h(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f9740a.getContentResolver().query(uri, f9739k, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th2) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th2;
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f9747h;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d dVar = this.f9749j;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f9748i = true;
            com.bumptech.glide.load.data.d dVar = this.f9749j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public C2.a d() {
            return C2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            try {
                com.bumptech.glide.load.data.d dVarF = f();
                if (dVarF == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f9743d));
                    return;
                }
                this.f9749j = dVarF;
                if (this.f9748i) {
                    cancel();
                } else {
                    dVarF.e(gVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    d(Context context, n nVar, n nVar2, Class cls) {
        this.f9733a = context.getApplicationContext();
        this.f9734b = nVar;
        this.f9735c = nVar2;
        this.f9736d = cls;
    }

    @Override // I2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i10, int i11, C2.g gVar) {
        return new n.a(new V2.b(uri), new C0388d(this.f9733a, this.f9734b, this.f9735c, uri, i10, i11, gVar, this.f9736d));
    }

    @Override // I2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && D2.b.c(uri);
    }
}
