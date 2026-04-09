package x9;

import com.google.android.exoplayer2.w1;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f25181a;

    /* renamed from: b, reason: collision with root package name */
    public final w1 f25182b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25183c;

    /* renamed from: d, reason: collision with root package name */
    public final ya.v f25184d;

    /* renamed from: e, reason: collision with root package name */
    public final long f25185e;

    /* renamed from: f, reason: collision with root package name */
    public final w1 f25186f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25187g;

    /* renamed from: h, reason: collision with root package name */
    public final ya.v f25188h;

    /* renamed from: i, reason: collision with root package name */
    public final long f25189i;
    public final long j;

    public q(long j, w1 w1Var, int i10, ya.v vVar, long j7, w1 w1Var2, int i11, ya.v vVar2, long j10, long j11) {
        this.f25181a = j;
        this.f25182b = w1Var;
        this.f25183c = i10;
        this.f25184d = vVar;
        this.f25185e = j7;
        this.f25186f = w1Var2;
        this.f25187g = i11;
        this.f25188h = vVar2;
        this.f25189i = j10;
        this.j = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f25181a == qVar.f25181a && this.f25183c == qVar.f25183c && this.f25185e == qVar.f25185e && this.f25187g == qVar.f25187g && this.f25189i == qVar.f25189i && this.j == qVar.j && a.a.k(this.f25182b, qVar.f25182b) && a.a.k(this.f25184d, qVar.f25184d) && a.a.k(this.f25186f, qVar.f25186f) && a.a.k(this.f25188h, qVar.f25188h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f25181a), this.f25182b, Integer.valueOf(this.f25183c), this.f25184d, Long.valueOf(this.f25185e), this.f25186f, Integer.valueOf(this.f25187g), this.f25188h, Long.valueOf(this.f25189i), Long.valueOf(this.j)});
    }
}
