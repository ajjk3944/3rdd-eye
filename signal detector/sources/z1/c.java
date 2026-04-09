package z1;

import C.g;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import l1.h;
import n1.z;
import u1.C2944B;
import y1.f;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final c f24452b = new c(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24453a;

    public /* synthetic */ c(int i) {
        this.f24453a = i;
    }

    @Override // z1.a
    public final z b(z zVar, h hVar) {
        g gVar;
        byte[] bArrArray;
        switch (this.f24453a) {
            case 0:
                return zVar;
            default:
                ByteBuffer byteBufferAsReadOnlyBuffer = ((f) ((y1.b) zVar.get()).f24213a.f2634b).f24230a.f21764d.asReadOnlyBuffer();
                AtomicReference atomicReference = H1.b.f1755a;
                if (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) {
                    gVar = null;
                } else {
                    gVar = new g(byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit(), byteBufferAsReadOnlyBuffer.array());
                }
                if (gVar != null && gVar.f890a == 0 && gVar.f891b == ((byte[]) gVar.f892c).length) {
                    bArrArray = byteBufferAsReadOnlyBuffer.array();
                } else {
                    ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                    byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
                    byteBufferAsReadOnlyBuffer2.get(bArr);
                    bArrArray = bArr;
                }
                return new C2944B(bArrArray);
        }
    }
}
