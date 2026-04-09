package y1;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C0752Tp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import l1.j;
import n1.z;

/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24247a;

    /* renamed from: b, reason: collision with root package name */
    public final a f24248b;

    /* renamed from: c, reason: collision with root package name */
    public final C0752Tp f24249c;

    public h(ArrayList arrayList, a aVar, C0752Tp c0752Tp) {
        this.f24247a = arrayList;
        this.f24248b = aVar;
        this.f24249c = c0752Tp;
    }

    @Override // l1.j
    public final boolean a(Object obj, l1.h hVar) {
        return !((Boolean) hVar.c(g.f24246b)).booleanValue() && R2.a.r(this.f24247a, (InputStream) obj, this.f24249c) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // l1.j
    public final z b(Object obj, int i, int i3, l1.h hVar) throws IOException {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i6 = inputStream.read(bArr);
                if (i6 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i6);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e6) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e6);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f24248b.b(ByteBuffer.wrap(byteArray), i, i3, hVar);
    }
}
