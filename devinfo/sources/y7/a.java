package y7;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f37354c = {"_data"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f37355d = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37356a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentResolver f37357b;

    public /* synthetic */ a(ContentResolver contentResolver, int i4) {
        this.f37356a = i4;
        this.f37357b = contentResolver;
    }

    @Override // y7.b
    public final Cursor a(Uri uri) {
        switch (this.f37356a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f37357b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f37354c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f37357b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f37355d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
