package y3;

import android.content.Context;

/* loaded from: classes2.dex */
public final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25108a;

    /* renamed from: b, reason: collision with root package name */
    public final h4.a f25109b;

    /* renamed from: c, reason: collision with root package name */
    public final h4.a f25110c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25111d;

    public b(Context context, h4.a aVar, h4.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f25108a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f25109b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f25110c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f25111d = str;
    }

    @Override // y3.f
    public Context b() {
        return this.f25108a;
    }

    @Override // y3.f
    public String c() {
        return this.f25111d;
    }

    @Override // y3.f
    public h4.a d() {
        return this.f25110c;
    }

    @Override // y3.f
    public h4.a e() {
        return this.f25109b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f25108a.equals(fVar.b()) && this.f25109b.equals(fVar.e()) && this.f25110c.equals(fVar.d()) && this.f25111d.equals(fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f25108a.hashCode() ^ 1000003) * 1000003) ^ this.f25109b.hashCode()) * 1000003) ^ this.f25110c.hashCode()) * 1000003) ^ this.f25111d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f25108a + ", wallClock=" + this.f25109b + ", monotonicClock=" + this.f25110c + ", backendName=" + this.f25111d + "}";
    }
}
