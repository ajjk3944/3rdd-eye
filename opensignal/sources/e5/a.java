package e5;

import androidx.media3.common.a1;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f7788a;

    /* renamed from: b, reason: collision with root package name */
    public final a1 f7789b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7790c;

    /* renamed from: d, reason: collision with root package name */
    public final o5.z f7791d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7792e;

    /* renamed from: f, reason: collision with root package name */
    public final a1 f7793f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7794g;

    /* renamed from: h, reason: collision with root package name */
    public final o5.z f7795h;

    /* renamed from: i, reason: collision with root package name */
    public final long f7796i;
    public final long j;

    public a(long j, a1 a1Var, int i10, o5.z zVar, long j7, a1 a1Var2, int i11, o5.z zVar2, long j10, long j11) {
        this.f7788a = j;
        this.f7789b = a1Var;
        this.f7790c = i10;
        this.f7791d = zVar;
        this.f7792e = j7;
        this.f7793f = a1Var2;
        this.f7794g = i11;
        this.f7795h = zVar2;
        this.f7796i = j10;
        this.j = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f7788a == aVar.f7788a && this.f7790c == aVar.f7790c && this.f7792e == aVar.f7792e && this.f7794g == aVar.f7794g && this.f7796i == aVar.f7796i && this.j == aVar.j && a.a.k(this.f7789b, aVar.f7789b) && a.a.k(this.f7791d, aVar.f7791d) && a.a.k(this.f7793f, aVar.f7793f) && a.a.k(this.f7795h, aVar.f7795h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f7788a), this.f7789b, Integer.valueOf(this.f7790c), this.f7791d, Long.valueOf(this.f7792e), this.f7793f, Integer.valueOf(this.f7794g), this.f7795h, Long.valueOf(this.f7796i), Long.valueOf(this.j)});
    }
}
