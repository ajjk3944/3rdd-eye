package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class N3 implements InterfaceC4366h5 {
    protected int zza = 0;

    protected static void f(Iterable iterable, List list) {
        O3.i(iterable, list);
    }

    abstract int a(InterfaceC4495x5 interfaceC4495x5);

    abstract void g(int i10);

    abstract int h();

    public final byte[] i() {
        try {
            byte[] bArr = new byte[d()];
            zzjr zzjrVarD = zzjr.D(bArr);
            b(zzjrVarD);
            zzjrVarD.E();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
