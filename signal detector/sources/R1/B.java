package r1;

import java.io.File;

/* loaded from: classes.dex */
public final class B implements r {

    /* renamed from: b, reason: collision with root package name */
    public static final B f23327b = new B(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23328a;

    public /* synthetic */ B(int i) {
        this.f23328a = i;
    }

    @Override // r1.r
    public final q a(Object obj, int i, int i3, l1.h hVar) {
        switch (this.f23328a) {
            case 0:
                return new q(new G1.b(obj), new C2874d(1, obj));
            case 1:
                File file = (File) obj;
                return new q(new G1.b(file), new C2874d(0, file));
            default:
                return null;
        }
    }

    @Override // r1.r
    public final boolean b(Object obj) {
        switch (this.f23328a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }
}
