package P2;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class a implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f18010a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18011b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // P2.e
    public E2.c a(E2.c cVar, C2.g gVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) cVar.get()).compress(this.f18010a, this.f18011b, byteArrayOutputStream);
        cVar.c();
        return new L2.b(byteArrayOutputStream.toByteArray());
    }

    public a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f18010a = compressFormat;
        this.f18011b = i10;
    }
}
