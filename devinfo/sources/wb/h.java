package wb;

import ac.j;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends ac.a {
    public final vb.a D2(vb.b bVar, String str, int i4, vb.b bVar2) {
        Parcel parcelT = T();
        j.b(parcelT, bVar);
        parcelT.writeString(str);
        parcelT.writeInt(i4);
        j.b(parcelT, bVar2);
        return r5.c.p(O(parcelT, 8));
    }

    public final vb.a k2(vb.b bVar, String str, int i4) {
        Parcel parcelT = T();
        j.b(parcelT, bVar);
        parcelT.writeString(str);
        parcelT.writeInt(i4);
        return r5.c.p(O(parcelT, 2));
    }

    public final vb.a r2(vb.b bVar, String str, int i4) {
        Parcel parcelT = T();
        j.b(parcelT, bVar);
        parcelT.writeString(str);
        parcelT.writeInt(i4);
        return r5.c.p(O(parcelT, 4));
    }
}
