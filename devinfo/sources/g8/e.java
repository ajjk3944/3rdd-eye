package g8;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements x7.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24562a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24563b;

    public /* synthetic */ e(int i4, Object obj) {
        this.f24562a = i4;
        this.f24563b = obj;
    }

    @Override // x7.j
    public final z7.y a(Object obj, int i4, int i10, x7.h hVar) {
        switch (this.f24562a) {
            case 0:
                o oVar = (o) this.f24563b;
                return oVar.a(new yb.e((ByteBuffer) obj, oVar.f24593d, oVar.f24592c, 23), i4, i10, hVar, o.f24588k);
            case 1:
                o oVar2 = (o) this.f24563b;
                return oVar2.a(new yb.e((ParcelFileDescriptor) obj, oVar2.f24593d, oVar2.f24592c), i4, i10, hVar, o.f24588k);
            default:
                return c.c((a8.b) this.f24563b, ((w7.d) obj).b());
        }
    }

    @Override // x7.j
    public final boolean b(Object obj, x7.h hVar) {
        switch (this.f24562a) {
            case 0:
                ((o) this.f24563b).getClass();
                break;
            case 1:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if ((("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) && parcelFileDescriptor.getStatSize() > 536870912) || "robolectric".equals(Build.FINGERPRINT)) {
                }
                break;
            default:
                break;
        }
        return true;
    }
}
