package defpackage;

import java.net.InetSocketAddress;
import java.util.Comparator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ha implements Comparator {
    public final /* synthetic */ int f;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f) {
            case 0:
                return Integer.compare(((InetSocketAddress) obj2).getAddress().getAddress().length, ((InetSocketAddress) obj).getAddress().getAddress().length);
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
        }
    }
}
