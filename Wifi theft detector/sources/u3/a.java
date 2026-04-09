package u3;

import com.google.android.datatransport.Priority;

/* loaded from: classes2.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f24501a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24502b;

    /* renamed from: c, reason: collision with root package name */
    public final Priority f24503c;

    public a(Integer num, Object obj, Priority priority) {
        this.f24501a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f24502b = obj;
        if (priority == null) {
            throw new NullPointerException("Null priority");
        }
        this.f24503c = priority;
    }

    @Override // u3.c
    public Integer a() {
        return this.f24501a;
    }

    @Override // u3.c
    public Object b() {
        return this.f24502b;
    }

    @Override // u3.c
    public Priority c() {
        return this.f24503c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            Integer num = this.f24501a;
            if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
                if (this.f24502b.equals(cVar.b()) && this.f24503c.equals(cVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f24501a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f24502b.hashCode()) * 1000003) ^ this.f24503c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f24501a + ", payload=" + this.f24502b + ", priority=" + this.f24503c + "}";
    }
}
