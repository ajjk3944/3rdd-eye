package D2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class c implements com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f2814a;

    /* renamed from: b, reason: collision with root package name */
    private final e f2815b;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f2816c;

    static class a implements d {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f2817b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f2818a;

        a(ContentResolver contentResolver) {
            this.f2818a = contentResolver;
        }

        @Override // D2.d
        public Cursor a(Uri uri) {
            return this.f2818a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f2817b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    static class b implements d {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f2819b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f2820a;

        b(ContentResolver contentResolver) {
            this.f2820a = contentResolver;
        }

        @Override // D2.d
        public Cursor a(Uri uri) {
            return this.f2820a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f2819b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    c(Uri uri, e eVar) {
        this.f2814a = uri;
        this.f2815b = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.c(context).j().g(), dVar, com.bumptech.glide.b.c(context).e(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws Throwable {
        InputStream inputStreamD = this.f2815b.d(this.f2814a);
        int iA = inputStreamD != null ? this.f2815b.a(this.f2814a) : -1;
        return iA != -1 ? new g(inputStreamD, iA) : inputStreamD;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() throws IOException {
        InputStream inputStream = this.f2816c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public C2.a d() {
        return C2.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a aVar) throws Throwable {
        try {
            InputStream inputStreamH = h();
            this.f2816c = inputStreamH;
            aVar.f(inputStreamH);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.c(e10);
        }
    }
}
