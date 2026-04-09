package k8;

import android.util.Log;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.measurement.d5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import x7.j;
import z7.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f28106a;

    /* renamed from: b, reason: collision with root package name */
    public final a f28107b;

    /* renamed from: c, reason: collision with root package name */
    public final a8.g f28108c;

    public h(ArrayList arrayList, a aVar, a8.g gVar) {
        this.f28106a = arrayList;
        this.f28107b = aVar;
        this.f28108c = gVar;
    }

    @Override // x7.j
    public final y a(Object obj, int i4, int i10, x7.h hVar) throws IOException {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int i11 = inputStream.read(bArr);
                if (i11 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e2);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f28107b.a(ByteBuffer.wrap(byteArray), i4, i10, hVar);
    }

    @Override // x7.j
    public final boolean b(Object obj, x7.h hVar) {
        return !((Boolean) hVar.c(g.f28105b)).booleanValue() && d5.l(this.f28106a, (InputStream) obj, this.f28108c) == ImageHeaderParser$ImageType.GIF;
    }
}
