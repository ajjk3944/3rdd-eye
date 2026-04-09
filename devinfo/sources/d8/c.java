package d8;

import java.io.File;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21997a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21998b;

    public /* synthetic */ c(int i4, Object obj) {
        this.f21997a = i4;
        this.f21998b = obj;
    }

    @Override // d8.v
    public final u a(Object obj, int i4, int i10, x7.h hVar) {
        switch (this.f21997a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new u(new s8.d(bArr), new q(1, bArr, (d0) this.f21998b));
            case 1:
                return new u(new s8.d(obj), new e(obj.toString(), (d0) this.f21998b, 0));
            default:
                File file = (File) obj;
                return new u(new s8.d(file), new e(file, (d0) this.f21998b, 1));
        }
    }

    @Override // d8.v
    public final boolean b(Object obj) {
        switch (this.f21997a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }
}
