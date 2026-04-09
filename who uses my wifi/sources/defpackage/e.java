package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e extends tn0 {
    public ArrayList k;

    /* JADX WARN: Type inference failed for: r3v2, types: [byte[], java.io.Serializable, java.lang.Object] */
    @Override // defpackage.tn0
    public final void k(cm cmVar) throws t91, UnknownHostException {
        d dVar;
        this.k = new ArrayList(1);
        while (((ByteBuffer) cmVar.j).remaining() != 0) {
            int iF = cmVar.f();
            int i = cmVar.i();
            int i2 = cmVar.i();
            boolean z = (i2 & 128) != 0;
            ?? C = cmVar.c(i2 & (-129));
            if (i < 0 || i >= 256 || ((iF == 1 && i > 32) || (iF == 2 && i > 128))) {
                throw new t91("invalid prefix length");
            }
            if (iF == 1 || iF == 2) {
                int iA = a30.a(iF);
                if (C.length > iA) {
                    throw new t91("invalid address length");
                }
                int length = C.length;
                byte[] bArr = C;
                if (length != iA) {
                    byte[] bArr2 = new byte[iA];
                    System.arraycopy(C, 0, bArr2, 0, C.length);
                    bArr = bArr2;
                }
                InetAddress byAddress = InetAddress.getByAddress(bArr);
                dVar = new d(a30.d(byAddress), z, byAddress, i);
            } else {
                dVar = new d(iF, z, C, i);
            }
            this.k.add(dVar);
        }
    }

    @Override // defpackage.tn0
    public final String l() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            sb.append((d) it.next());
            if (it.hasNext()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        byte[] address;
        int length;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            d dVar = (d) obj;
            int i2 = dVar.f;
            Object obj2 = dVar.i;
            if (i2 == 1 || i2 == 2) {
                address = ((InetAddress) obj2).getAddress();
                int length2 = address.length - 1;
                while (true) {
                    if (length2 < 0) {
                        length = 0;
                        break;
                    } else {
                        if (address[length2] != 0) {
                            length = length2 + 1;
                            break;
                        }
                        length2--;
                    }
                }
            } else {
                address = (byte[]) obj2;
                length = address.length;
            }
            int i3 = dVar.g ? length | 128 : length;
            t3Var.m(dVar.f);
            t3Var.q(dVar.h);
            t3Var.q(i3);
            t3Var.k(address, 0, length);
        }
    }
}
