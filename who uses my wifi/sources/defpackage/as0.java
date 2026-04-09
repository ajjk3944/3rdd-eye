package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class as0 extends yr0 {
    public final ArrayList f = new ArrayList();

    @Override // defpackage.yr0
    public final void a(byte[] bArr) throws t91 {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.position();
        byteBufferWrap.limit();
        while (byteBufferWrap.remaining() >= 2) {
            if (2 > byteBufferWrap.remaining()) {
                throw new t91("end of input");
            }
            arrayList.add(Integer.valueOf(byteBufferWrap.getShort() & 65535));
        }
        if (byteBufferWrap.remaining() > 0) {
            throw new t91("Unexpected number of bytes in mandatory parameter");
        }
    }

    @Override // defpackage.yr0
    public final byte[] b() {
        t3 t3Var = new t3(2, (byte) 0);
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            t3Var.m(((Integer) obj).intValue());
        }
        return t3Var.i();
    }

    @Override // defpackage.yr0
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Integer num = (Integer) obj;
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(es0.n.e(num.intValue()));
        }
        return sb.toString();
    }
}
