package R2;

import R2.q;
import T1.B;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import g3.C4389b;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: MediaStoreFileLoader.java */
/* loaded from: classes.dex */
public final class m implements q<Uri, File> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11678a;

    /* compiled from: MediaStoreFileLoader.java */
    public static final class a implements r<Uri, File> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f11679a;

        public a(Context context) {
            this.f11679a = context;
        }

        @Override // R2.r
        public final q<Uri, File> c(u uVar) {
            return new m(this.f11679a);
        }
    }

    public m(Context context) {
        this.f11678a = context;
    }

    @Override // R2.q
    public final boolean a(Uri uri) {
        return B.p(uri);
    }

    @Override // R2.q
    public final q.a<File> b(Uri uri, int i, int i10, L2.h hVar) {
        Uri uri2 = uri;
        return new q.a<>(new C4389b(uri2), new b(this.f11678a, uri2));
    }

    /* compiled from: MediaStoreFileLoader.java */
    public static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: d, reason: collision with root package name */
        public static final String[] f11680d = {"_data"};

        /* renamed from: b, reason: collision with root package name */
        public final Context f11681b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f11682c;

        public b(Context context, Uri uri) {
            this.f11681b = context;
            this.f11682c = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public final L2.a d() {
            return L2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.h hVar, d.a<? super File> aVar) {
            Cursor cursorQuery = this.f11681b.getContentResolver().query(this.f11682c, f11680d, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.f(new File(string));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f11682c));
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
