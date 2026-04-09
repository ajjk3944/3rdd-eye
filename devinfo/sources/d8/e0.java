package d8;

import java.io.File;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 implements v {

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f22009b = new e0(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22010a;

    public /* synthetic */ e0(int i4) {
        this.f22010a = i4;
    }

    @Override // d8.v
    public final u a(Object obj, int i4, int i10, x7.h hVar) {
        switch (this.f22010a) {
            case 0:
                return new u(new s8.d(obj), new d(1, obj));
            case 1:
                File file = (File) obj;
                return new u(new s8.d(file), new d(0, file));
            default:
                return null;
        }
    }

    @Override // d8.v
    public final boolean b(Object obj) {
        switch (this.f22010a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }
}
