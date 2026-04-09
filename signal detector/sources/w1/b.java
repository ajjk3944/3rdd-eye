package w1;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C0752Tp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import l1.h;
import l1.j;
import n1.z;
import t2.q;

/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23941a;

    /* renamed from: b, reason: collision with root package name */
    public final q f23942b;

    public /* synthetic */ b(q qVar, int i) {
        this.f23941a = i;
        this.f23942b = qVar;
    }

    @Override // l1.j
    public final boolean a(Object obj, h hVar) throws IOException {
        switch (this.f23941a) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeS = R2.a.s((ArrayList) this.f23942b.f23648b, (ByteBuffer) obj);
                if (imageHeaderParser$ImageTypeS == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeS == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
            default:
                q qVar = this.f23942b;
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeR = R2.a.r((ArrayList) qVar.f23648b, (InputStream) obj, (C0752Tp) qVar.f23649c);
                if (imageHeaderParser$ImageTypeR == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeR == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
        }
        return true;
    }

    @Override // l1.j
    public final z b(Object obj, int i, int i3, h hVar) {
        switch (this.f23941a) {
            case 0:
                return q.d(ImageDecoder.createSource((ByteBuffer) obj), i, i3, hVar);
            default:
                return q.d(ImageDecoder.createSource(H1.b.b((InputStream) obj)), i, i3, hVar);
        }
    }
}
