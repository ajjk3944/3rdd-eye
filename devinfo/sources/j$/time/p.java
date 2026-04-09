package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class p implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final p f26190d = new p(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* renamed from: a, reason: collision with root package name */
    public final int f26191a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26192b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26193c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        Object[] objArr = {j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS};
        ArrayList arrayList = new ArrayList(3);
        for (int i4 = 0; i4 < 3; i4++) {
            arrayList.add(Objects.requireNonNull(objArr[i4]));
        }
        Collections.unmodifiableList(arrayList);
    }

    public p(int i4, int i10, int i11) {
        this.f26191a = i4;
        this.f26192b = i10;
        this.f26193c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f26191a == pVar.f26191a && this.f26192b == pVar.f26192b && this.f26193c == pVar.f26193c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f26193c, 16) + Integer.rotateLeft(this.f26192b, 8) + this.f26191a;
    }

    public final String toString() {
        if (this == f26190d) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder("P");
        int i4 = this.f26191a;
        if (i4 != 0) {
            sb2.append(i4);
            sb2.append('Y');
        }
        int i10 = this.f26192b;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        int i11 = this.f26193c;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('D');
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new q((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
