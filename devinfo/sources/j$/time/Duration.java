package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class Duration implements Comparable<Duration>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Duration f26034c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: a, reason: collision with root package name */
    public final long f26035a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26036b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int iCompare = Long.compare(this.f26035a, duration2.f26035a);
        return iCompare != 0 ? iCompare : this.f26036b - duration2.f26036b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    public static Duration ofMinutes(long j) {
        return i(j$.com.android.tools.r8.a.w(j, 60), 0);
    }

    public static Duration j(long j) {
        long j8 = j / 1000000000;
        int i4 = (int) (j % 1000000000);
        if (i4 < 0) {
            i4 = (int) (i4 + 1000000000);
            j8--;
        }
        return i(j8, i4);
    }

    public static Duration i(long j, int i4) {
        if ((i4 | j) == 0) {
            return f26034c;
        }
        return new Duration(j, i4);
    }

    public Duration(long j, int i4) {
        this.f26035a = j;
        this.f26036b = i4;
    }

    public long toMillis() {
        long j = this.f26035a;
        long j8 = this.f26036b;
        if (j < 0) {
            j++;
            j8 -= 1000000000;
        }
        return j$.com.android.tools.r8.a.x(j$.com.android.tools.r8.a.w(j, 1000), j8 / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f26035a == duration.f26035a && this.f26036b == duration.f26036b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f26035a;
        return (this.f26036b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        if (this == f26034c) {
            return "PT0S";
        }
        long j = this.f26035a;
        if (j < 0 && this.f26036b > 0) {
            j++;
        }
        long j8 = j / 3600;
        int i4 = (int) ((j % 3600) / 60);
        int i10 = (int) (j % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j8 != 0) {
            sb2.append(j8);
            sb2.append('H');
        }
        if (i4 != 0) {
            sb2.append(i4);
            sb2.append('M');
        }
        if (i10 == 0 && this.f26036b == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (this.f26035a < 0 && this.f26036b > 0 && i10 == 0) {
            sb2.append("-0");
        } else {
            sb2.append(i10);
        }
        if (this.f26036b > 0) {
            int length = sb2.length();
            if (this.f26035a < 0) {
                sb2.append(2000000000 - this.f26036b);
            } else {
                sb2.append(this.f26036b + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }

    private Object writeReplace() {
        return new q((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
