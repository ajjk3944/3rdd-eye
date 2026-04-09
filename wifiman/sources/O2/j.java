package O2;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes.dex */
public class j implements C2.i {

    /* renamed from: a, reason: collision with root package name */
    private final List f16944a;

    /* renamed from: b, reason: collision with root package name */
    private final C2.i f16945b;

    /* renamed from: c, reason: collision with root package name */
    private final F2.b f16946c;

    public j(List list, C2.i iVar, F2.b bVar) {
        this.f16944a = list;
        this.f16945b = iVar;
        this.f16946c = bVar;
    }

    private static byte[] e(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(TLSTM.TLS_MAX_FRAGMENT_SIZE);
        try {
            byte[] bArr = new byte[TLSTM.TLS_MAX_FRAGMENT_SIZE];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException e10) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            return null;
        }
    }

    @Override // C2.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public E2.c b(InputStream inputStream, int i10, int i11, C2.g gVar) throws IOException {
        byte[] bArrE = e(inputStream);
        if (bArrE == null) {
            return null;
        }
        return this.f16945b.b(ByteBuffer.wrap(bArrE), i10, i11, gVar);
    }

    @Override // C2.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, C2.g gVar) {
        return !((Boolean) gVar.c(i.f16943b)).booleanValue() && com.bumptech.glide.load.a.f(this.f16944a, inputStream, this.f16946c) == ImageHeaderParser.ImageType.GIF;
    }
}
