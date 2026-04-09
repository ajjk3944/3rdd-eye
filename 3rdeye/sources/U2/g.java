package U2;

import U2.s;
import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapDecoder.java */
/* loaded from: classes.dex */
public final class g implements L2.j<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final m f12399a;

    public g(m mVar) {
        this.f12399a = mVar;
    }

    @Override // L2.j
    public final boolean a(ByteBuffer byteBuffer, L2.h hVar) throws IOException {
        this.f12399a.getClass();
        return true;
    }

    @Override // L2.j
    public final N2.u<Bitmap> b(ByteBuffer byteBuffer, int i, int i10, L2.h hVar) throws IOException {
        m mVar = this.f12399a;
        return mVar.a(new s.a(byteBuffer, mVar.f12423d, mVar.f12422c), i, i10, hVar, m.f12418k);
    }
}
