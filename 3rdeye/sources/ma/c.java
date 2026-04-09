package ma;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* compiled from: Duration.java */
/* loaded from: classes3.dex */
public final class c implements Comparable<c>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final c f44087d = new c(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final long f44088b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44089c;

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    public c(long j4, int i) {
        this.f44088b = j4;
        this.f44089c = i;
    }

    public static c a(int i, long j4) {
        return (((long) i) | j4) == 0 ? f44087d : new c(j4, i);
    }

    public static c b(long j4) {
        long j10 = j4 / 1000000000;
        int i = (int) (j4 % 1000000000);
        if (i < 0) {
            i += 1000000000;
            j10--;
        }
        return a(i, j10);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 1, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(c cVar) {
        c cVar2 = cVar;
        int iF = com.google.gson.internal.c.f(this.f44088b, cVar2.f44088b);
        return iF != 0 ? iF : this.f44089c - cVar2.f44089c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f44088b == cVar.f44088b && this.f44089c == cVar.f44089c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f44088b;
        return (this.f44089c * 51) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        if (this == f44087d) {
            return "PT0S";
        }
        long j4 = this.f44088b;
        long j10 = j4 / 3600;
        int i = (int) ((j4 % 3600) / 60);
        int i10 = (int) (j4 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j10 != 0) {
            sb.append(j10);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        int i11 = this.f44089c;
        if (i10 == 0 && i11 == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i10 >= 0 || i11 <= 0) {
            sb.append(i10);
        } else if (i10 == -1) {
            sb.append("-0");
        } else {
            sb.append(i10 + 1);
        }
        if (i11 > 0) {
            int length = sb.length();
            if (i10 < 0) {
                sb.append(2000000000 - i11);
            } else {
                sb.append(i11 + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}
