package j$.time.chrono;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class h implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f26069e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a, reason: collision with root package name */
    public final m f26070a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26071b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26072c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26073d;

    static {
        Object[] objArr = {j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS};
        ArrayList arrayList = new ArrayList(3);
        for (int i4 = 0; i4 < 3; i4++) {
            arrayList.add(Objects.requireNonNull(objArr[i4]));
        }
        Collections.unmodifiableList(arrayList);
    }

    public h(m mVar, int i4, int i10, int i11) {
        Objects.requireNonNull(mVar, "chrono");
        this.f26070a = mVar;
        this.f26071b = i4;
        this.f26072c = i10;
        this.f26073d = i11;
    }

    public final String toString() {
        if (this.f26071b == 0 && this.f26072c == 0 && this.f26073d == 0) {
            return this.f26070a.toString() + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26070a.toString());
        sb2.append(" P");
        int i4 = this.f26071b;
        if (i4 != 0) {
            sb2.append(i4);
            sb2.append('Y');
        }
        int i10 = this.f26072c;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        int i11 = this.f26073d;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('D');
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f26071b == hVar.f26071b && this.f26072c == hVar.f26072c && this.f26073d == hVar.f26073d && this.f26070a.equals(hVar.f26070a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.f26073d, 16) + (Integer.rotateLeft(this.f26072c, 8) + this.f26071b)) ^ this.f26070a.hashCode();
    }

    public Object writeReplace() {
        return new f0((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
