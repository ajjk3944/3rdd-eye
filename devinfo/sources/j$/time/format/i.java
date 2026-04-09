package j$.time.format;

import com.applovin.shadow.okhttp3.internal.connection.RealConnection;

/* loaded from: classes2.dex */
public class i implements f {

    /* renamed from: f, reason: collision with root package name */
    public static final long[] f26134f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS};

    /* renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.q f26135a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26136b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26137c;

    /* renamed from: d, reason: collision with root package name */
    public final u f26138d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26139e;

    public i(j$.time.temporal.q qVar, int i4, int i10, u uVar) {
        this.f26135a = qVar;
        this.f26136b = i4;
        this.f26137c = i10;
        this.f26138d = uVar;
        this.f26139e = 0;
    }

    public i(j$.time.temporal.q qVar, int i4, int i10, u uVar, int i11) {
        this.f26135a = qVar;
        this.f26136b = i4;
        this.f26137c = i10;
        this.f26138d = uVar;
        this.f26139e = i11;
    }

    public i a() {
        if (this.f26139e == -1) {
            return this;
        }
        return new i(this.f26135a, this.f26136b, this.f26137c, this.f26138d, -1);
    }

    public i b(int i4) {
        return new i(this.f26135a, this.f26136b, this.f26137c, this.f26138d, this.f26139e + i4);
    }

    @Override // j$.time.format.f
    public boolean i(p pVar, StringBuilder sb2) {
        j$.time.temporal.q qVar = this.f26135a;
        Long lA = pVar.a(qVar);
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        s sVar = pVar.f26162b.f26124c;
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        int i4 = this.f26137c;
        if (length > i4) {
            throw new j$.time.a("Field " + qVar + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i4);
        }
        sVar.getClass();
        int i10 = this.f26136b;
        u uVar = this.f26138d;
        if (jLongValue >= 0) {
            int i11 = c.f26129a[uVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    sb2.append('+');
                }
            } else if (i10 < 19 && jLongValue >= f26134f[i10]) {
                sb2.append('+');
            }
        } else {
            int i12 = c.f26129a[uVar.ordinal()];
            if (i12 == 1 || i12 == 2 || i12 == 3) {
                sb2.append('-');
            } else if (i12 == 4) {
                throw new j$.time.a("Field " + qVar + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i13 = 0; i13 < i10 - string.length(); i13++) {
            sb2.append('0');
        }
        sb2.append(string);
        return true;
    }

    public String toString() {
        int i4 = this.f26137c;
        j$.time.temporal.q qVar = this.f26135a;
        u uVar = this.f26138d;
        int i10 = this.f26136b;
        if (i10 == 1 && i4 == 19 && uVar == u.NORMAL) {
            return "Value(" + qVar + ")";
        }
        if (i10 == i4 && uVar == u.NOT_NEGATIVE) {
            return "Value(" + qVar + "," + i10 + ")";
        }
        return "Value(" + qVar + "," + i10 + "," + i4 + "," + uVar + ")";
    }
}
