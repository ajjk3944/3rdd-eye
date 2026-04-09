package Y2;

import L2.j;
import N2.u;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: StreamGifDecoder.java */
/* loaded from: classes.dex */
public final class i implements j<InputStream, c> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13763a;

    /* renamed from: b, reason: collision with root package name */
    public final a f13764b;

    /* renamed from: c, reason: collision with root package name */
    public final O2.g f13765c;

    public i(ArrayList arrayList, a aVar, O2.g gVar) {
        this.f13763a = arrayList;
        this.f13764b = aVar;
        this.f13765c = gVar;
    }

    @Override // L2.j
    public final boolean a(InputStream inputStream, L2.h hVar) throws IOException {
        return !((Boolean) hVar.c(h.f13762b)).booleanValue() && com.bumptech.glide.load.a.b(this.f13763a, inputStream, this.f13765c) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // L2.j
    public final u<c> b(InputStream inputStream, int i, int i10, L2.h hVar) throws IOException {
        byte[] byteArray;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i11 = inputStream2.read(bArr);
                if (i11 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e4);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f13764b.b(ByteBuffer.wrap(byteArray), i, i10, hVar);
    }
}
