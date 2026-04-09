package sq;

import br.l;
import java.io.Serializable;
import mq.d;

/* loaded from: classes.dex */
public final class b extends d implements a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f22208a;

    public b(Enum[] enumArr) {
        l.e(enumArr, "entries");
        this.f22208a = enumArr;
    }

    @Override // mq.a
    public final int a() {
        return this.f22208a.length;
    }

    @Override // mq.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        return ((Enum) mq.l.q0(r42.ordinal(), this.f22208a)) == r42;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Enum[] enumArr = this.f22208a;
        int length = enumArr.length;
        if (i10 < 0 || i10 >= length) {
            throw new IndexOutOfBoundsException(h0.b.l("index: ", i10, length, ", size: "));
        }
        return enumArr[i10];
    }

    @Override // mq.d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int iOrdinal = r42.ordinal();
        if (((Enum) mq.l.q0(iOrdinal, this.f22208a)) == r42) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // mq.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int iOrdinal = r42.ordinal();
        if (((Enum) mq.l.q0(iOrdinal, this.f22208a)) == r42) {
            return iOrdinal;
        }
        return -1;
    }
}
