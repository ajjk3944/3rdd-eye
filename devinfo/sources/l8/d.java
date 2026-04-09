package l8;

import g8.b0;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import n3.f;
import x7.h;
import z7.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final d f28622b = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28623a;

    public /* synthetic */ d(int i4) {
        this.f28623a = i4;
    }

    @Override // l8.a
    public final y m(y yVar, h hVar) {
        f fVar;
        byte[] bArrArray;
        switch (this.f28623a) {
            case 0:
                return yVar;
            default:
                ByteBuffer byteBufferAsReadOnlyBuffer = ((k8.f) ((k8.b) yVar.get()).f28075a.f27975b).f28090a.f36523d.asReadOnlyBuffer();
                AtomicReference atomicReference = t8.b.f34503a;
                if (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) {
                    fVar = null;
                } else {
                    byte[] bArrArray2 = byteBufferAsReadOnlyBuffer.array();
                    int iArrayOffset = byteBufferAsReadOnlyBuffer.arrayOffset();
                    int iLimit = byteBufferAsReadOnlyBuffer.limit();
                    fVar = new f();
                    fVar.f29628c = bArrArray2;
                    fVar.f29626a = iArrayOffset;
                    fVar.f29627b = iLimit;
                }
                if (fVar != null && fVar.f29626a == 0 && fVar.f29627b == ((byte[]) fVar.f29628c).length) {
                    bArrArray = byteBufferAsReadOnlyBuffer.array();
                } else {
                    ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                    byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
                    byteBufferAsReadOnlyBuffer2.get(bArr);
                    bArrArray = bArr;
                }
                return new b0(bArrArray);
        }
    }
}
