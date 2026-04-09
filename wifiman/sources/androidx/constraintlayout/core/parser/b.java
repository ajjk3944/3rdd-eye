package androidx.constraintlayout.core.parser;

import f1.C5493b;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class b implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private final char[] f30032a;

    /* renamed from: b, reason: collision with root package name */
    protected long f30033b = -1;

    /* renamed from: c, reason: collision with root package name */
    protected long f30034c = Long.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    protected a f30035d;

    /* renamed from: e, reason: collision with root package name */
    private int f30036e;

    public b(char[] cArr) {
        this.f30032a = cArr;
    }

    @Override // 
    /* renamed from: b */
    public b clone() {
        try {
            return (b) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public String e() {
        String str = new String(this.f30032a);
        if (str.length() < 1) {
            return "";
        }
        long j10 = this.f30034c;
        if (j10 != Long.MAX_VALUE) {
            long j11 = this.f30033b;
            if (j10 >= j11) {
                return str.substring((int) j11, ((int) j10) + 1);
            }
        }
        long j12 = this.f30033b;
        return str.substring((int) j12, ((int) j12) + 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f30033b == bVar.f30033b && this.f30034c == bVar.f30034c && this.f30036e == bVar.f30036e && Arrays.equals(this.f30032a, bVar.f30032a)) {
            return Objects.equals(this.f30035d, bVar.f30035d);
        }
        return false;
    }

    public float f() {
        if (this instanceof C5493b) {
            return ((C5493b) this).f();
        }
        return Float.NaN;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f30032a) * 31;
        long j10 = this.f30033b;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f30034c;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        a aVar = this.f30035d;
        return ((i11 + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.f30036e;
    }

    public int i() {
        if (this instanceof C5493b) {
            return ((C5493b) this).i();
        }
        return 0;
    }

    public int k() {
        return this.f30036e;
    }

    protected String m() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public boolean o() {
        char[] cArr = this.f30032a;
        return cArr != null && cArr.length >= 1;
    }

    public void q(a aVar) {
        this.f30035d = aVar;
    }

    public String toString() {
        long j10 = this.f30033b;
        long j11 = this.f30034c;
        if (j10 > j11 || j11 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.f30033b + "-" + this.f30034c + ")";
        }
        return m() + " (" + this.f30033b + " : " + this.f30034c + ") <<" + new String(this.f30032a).substring((int) this.f30033b, ((int) this.f30034c) + 1) + ">>";
    }

    public void u(long j10) {
        if (this.f30034c != Long.MAX_VALUE) {
            return;
        }
        this.f30034c = j10;
        if (e.f30040a) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        a aVar = this.f30035d;
        if (aVar != null) {
            aVar.x(this);
        }
    }

    public void w(long j10) {
        this.f30033b = j10;
    }
}
