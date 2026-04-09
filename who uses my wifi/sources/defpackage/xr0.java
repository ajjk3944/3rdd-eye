package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xr0 extends yr0 {
    public final /* synthetic */ int f;
    public final ArrayList g;

    public xr0(int i) {
        this.f = i;
        switch (i) {
            case 1:
                this.g = new ArrayList();
                break;
            case 2:
                this.g = new ArrayList();
                break;
            default:
                this.g = new ArrayList();
                break;
        }
    }

    @Override // defpackage.yr0
    public final void a(byte[] bArr) throws t91 {
        switch (this.f) {
            case 0:
                ArrayList arrayList = this.g;
                arrayList.clear();
                cm cmVar = new cm(bArr);
                while (((ByteBuffer) cmVar.j).remaining() > 0) {
                    arrayList.add(cmVar.e());
                }
                return;
            case 1:
                ArrayList arrayList2 = this.g;
                arrayList2.clear();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.position();
                byteBufferWrap.limit();
                while (byteBufferWrap.remaining() >= 4) {
                    if (4 > byteBufferWrap.remaining()) {
                        throw new t91("end of input");
                    }
                    byte[] bArr2 = new byte[4];
                    byteBufferWrap.get(bArr2, 0, 4);
                    arrayList2.add(bArr2);
                }
                if (byteBufferWrap.remaining() > 0) {
                    throw new t91("Unexpected number of bytes in ipv4hint parameter");
                }
                return;
            default:
                ArrayList arrayList3 = this.g;
                arrayList3.clear();
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr);
                byteBufferWrap2.position();
                byteBufferWrap2.limit();
                while (byteBufferWrap2.remaining() >= 16) {
                    if (16 > byteBufferWrap2.remaining()) {
                        throw new t91("end of input");
                    }
                    byte[] bArr3 = new byte[16];
                    byteBufferWrap2.get(bArr3, 0, 16);
                    arrayList3.add(bArr3);
                }
                if (byteBufferWrap2.remaining() > 0) {
                    throw new t91("Unexpected number of bytes in ipv6hint parameter");
                }
                return;
        }
    }

    @Override // defpackage.yr0
    public final byte[] b() {
        switch (this.f) {
            case 0:
                t3 t3Var = new t3(2, (byte) 0);
                ArrayList arrayList = this.g;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    t3Var.l((byte[]) obj);
                }
                return t3Var.i();
            case 1:
                t3 t3Var2 = new t3(2, (byte) 0);
                ArrayList arrayList2 = this.g;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    t3Var2.j((byte[]) obj2);
                }
                return t3Var2.i();
            default:
                t3 t3Var3 = new t3(2, (byte) 0);
                ArrayList arrayList3 = this.g;
                int size3 = arrayList3.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj3 = arrayList3.get(i3);
                    i3++;
                    t3Var3.j((byte[]) obj3);
                }
                return t3Var3.i();
        }
    }

    @Override // defpackage.yr0
    public final String toString() {
        switch (this.f) {
            case 0:
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = this.g;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    byte[] bArr = (byte[]) obj;
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(tn0.a(bArr, false).replace(",", "\\,"));
                }
                return sb.toString();
            case 1:
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList2 = this.g;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    byte[] bArr2 = (byte[]) obj2;
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(a30.j(bArr2));
                }
                return sb2.toString();
            default:
                StringBuilder sb3 = new StringBuilder();
                ArrayList arrayList3 = this.g;
                int size3 = arrayList3.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj3 = arrayList3.get(i3);
                    i3++;
                    byte[] bArr3 = (byte[]) obj3;
                    if (sb3.length() > 0) {
                        sb3.append(",");
                    }
                    try {
                        sb3.append(InetAddress.getByAddress(null, bArr3).getHostAddress());
                    } catch (UnknownHostException e) {
                        return e.getMessage();
                    }
                }
                return sb3.toString();
        }
    }
}
