package fk;

import java.io.Serializable;
import zj.e;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends e implements a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f24059a;

    public b(Enum[] enumArr) {
        this.f24059a = enumArr;
    }

    @Override // zj.a, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        return ((Enum) m.a0(this.f24059a, r42.ordinal())) == r42;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        zj.b bVar = e.Companion;
        Enum[] enumArr = this.f24059a;
        int length = enumArr.length;
        bVar.getClass();
        zj.b.a(i4, length);
        return enumArr[i4];
    }

    @Override // zj.a
    public final int getSize() {
        return this.f24059a.length;
    }

    @Override // zj.e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int iOrdinal = r42.ordinal();
        if (((Enum) m.a0(this.f24059a, iOrdinal)) == r42) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // zj.e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int iOrdinal = r42.ordinal();
        if (((Enum) m.a0(this.f24059a, iOrdinal)) == r42) {
            return iOrdinal;
        }
        return -1;
    }
}
