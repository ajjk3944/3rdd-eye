package I2;

import I2.n;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8500a;

    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Context f8501a;

        public a(Context context) {
            this.f8501a = context;
        }

        @Override // I2.o
        public n d(r rVar) {
            return new l(this.f8501a);
        }
    }

    private static class b implements com.bumptech.glide.load.data.d {

        /* renamed from: c, reason: collision with root package name */
        private static final String[] f8502c = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final Context f8503a;

        /* renamed from: b, reason: collision with root package name */
        private final Uri f8504b;

        b(Context context, Uri uri) {
            this.f8503a = context;
            this.f8504b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public C2.a d() {
            return C2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            Cursor cursorQuery = this.f8503a.getContentResolver().query(this.f8504b, f8502c, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    cursorQuery.close();
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.f(new File(string));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f8504b));
        }
    }

    public l(Context context) {
        this.f8500a = context;
    }

    @Override // I2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i10, int i11, C2.g gVar) {
        return new n.a(new V2.b(uri), new b(this.f8500a, uri));
    }

    @Override // I2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return D2.b.c(uri);
    }
}
