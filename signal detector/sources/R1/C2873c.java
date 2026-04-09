package r1;

import java.io.File;

/* renamed from: r1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2873c implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23339a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23340b;

    public /* synthetic */ C2873c(int i, Object obj) {
        this.f23339a = i;
        this.f23340b = obj;
    }

    @Override // r1.r
    public final q a(Object obj, int i, int i3, l1.h hVar) {
        switch (this.f23339a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new q(new G1.b(bArr), new m(bArr, 1, (C2870A) this.f23340b));
            case 1:
                return new q(new G1.b(obj), new m1.c(obj.toString(), (C2870A) this.f23340b, 1));
            default:
                File file = (File) obj;
                return new q(new G1.b(file), new m1.c(file, (C2870A) this.f23340b, 2));
        }
    }

    @Override // r1.r
    public final boolean b(Object obj) {
        switch (this.f23339a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }
}
