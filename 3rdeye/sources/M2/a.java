package M2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ThumbFetcher.java */
/* loaded from: classes.dex */
public final class a implements d<InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public final Uri f4149b;

    /* renamed from: c, reason: collision with root package name */
    public final c f4150c;

    /* renamed from: d, reason: collision with root package name */
    public InputStream f4151d;

    /* compiled from: ThumbFetcher.java */
    /* renamed from: M2.a$a, reason: collision with other inner class name */
    public static class C0073a implements M2.b {

        /* renamed from: b, reason: collision with root package name */
        public static final String[] f4152b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f4153a;

        public C0073a(ContentResolver contentResolver) {
            this.f4153a = contentResolver;
        }

        @Override // M2.b
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f4153a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f4152b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    public static class b implements M2.b {

        /* renamed from: b, reason: collision with root package name */
        public static final String[] f4154b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f4155a;

        public b(ContentResolver contentResolver) {
            this.f4155a = contentResolver;
        }

        @Override // M2.b
        public final Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f4155a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f4154b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    public a(Uri uri, c cVar) {
        this.f4149b = uri;
        this.f4150c = cVar;
    }

    public static a c(Context context, Uri uri, M2.b bVar) {
        return new a(uri, new c(com.bumptech.glide.b.a(context).f22239d.b().f(), bVar, com.bumptech.glide.b.a(context).f22240e, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() throws IOException {
        InputStream inputStream = this.f4151d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final L2.a d() {
        return L2.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(h hVar, d.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamF = f();
            this.f4151d = inputStreamF;
            aVar.f(inputStreamF);
        } catch (FileNotFoundException e4) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e4);
            }
            aVar.c(e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0022: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:35), block:B:10:0x0022 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029 A[PHI: r6
  0x0029: PHI (r6v6 android.database.Cursor) = (r6v2 android.database.Cursor), (r6v8 android.database.Cursor) binds: [B:23:0x0048, B:13:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.InputStream f() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.a.f():java.io.InputStream");
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
