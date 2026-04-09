package yj;

import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class v {
    public static f a(u[] uVarArr, boolean z10) {
        return uVarArr.length == 0 ? zj.c.Y() : z10 ? new zj.c(uVarArr) : new zj.c((u[]) Arrays.copyOf(uVarArr, uVarArr.length));
    }

    public static g b(byte[] bArr, boolean z10) {
        return z10 ? new zj.e(bArr) : new zj.e(Arrays.copyOf(bArr, bArr.length));
    }

    public static h c(boolean z10) {
        return z10 ? zj.f.f67400b : zj.f.f67401c;
    }

    public static i d(byte b10, byte[] bArr) {
        return new zj.h(b10, bArr);
    }

    public static j e(double d10) {
        return new zj.g(d10);
    }

    public static k f(long j10) {
        return new zj.i(j10);
    }

    public static k g(BigInteger bigInteger) {
        return new zj.d(bigInteger);
    }

    public static l h(u[] uVarArr, boolean z10) {
        return uVarArr.length == 0 ? zj.j.Z() : z10 ? new zj.j(uVarArr) : new zj.j((u[]) Arrays.copyOf(uVarArr, uVarArr.length));
    }

    public static m i() {
        return zj.k.X();
    }

    public static n j(byte[] bArr, boolean z10) {
        return z10 ? new zj.l(bArr) : new zj.l(Arrays.copyOf(bArr, bArr.length));
    }
}
