package f8;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import l8.n;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8674a;

    public /* synthetic */ a(int i10) {
        this.f8674a = i10;
    }

    @Override // f8.f
    public final g a(Object obj, n nVar) {
        switch (this.f8674a) {
            case 0:
                Uri uri = (Uri) obj;
                if (q8.i.d(uri)) {
                    return new b(uri, nVar, 0);
                }
                return null;
            case 1:
                return new c((Bitmap) obj, nVar, 0);
            case 2:
                return new c((ByteBuffer) obj, nVar, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (br.l.a(uri2.getScheme(), "content")) {
                    return new b(uri2, nVar, 1);
                }
                return null;
            case 4:
                return new c((Drawable) obj, nVar, 2);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return new h((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (br.l.a(uri3.getScheme(), "android.resource")) {
                    return new b(uri3, nVar, 2);
                }
                return null;
        }
    }
}
