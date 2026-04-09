package m1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2653b implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f21929c = {"_data"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f21930d = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21931a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentResolver f21932b;

    public /* synthetic */ C2653b(ContentResolver contentResolver, int i) {
        this.f21931a = i;
        this.f21932b = contentResolver;
    }

    @Override // m1.d
    public final Cursor a(Uri uri) {
        switch (this.f21931a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f21932b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f21929c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f21932b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f21930d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
