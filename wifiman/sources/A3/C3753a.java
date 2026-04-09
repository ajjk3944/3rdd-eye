package a3;

/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3753a extends AbstractC3755c {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f25716a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f25717b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC3757e f25718c;

    C3753a(Integer num, Object obj, EnumC3757e enumC3757e, AbstractC3758f abstractC3758f, AbstractC3756d abstractC3756d) {
        this.f25716a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f25717b = obj;
        if (enumC3757e == null) {
            throw new NullPointerException("Null priority");
        }
        this.f25718c = enumC3757e;
    }

    @Override // a3.AbstractC3755c
    public Integer a() {
        return this.f25716a;
    }

    @Override // a3.AbstractC3755c
    public AbstractC3756d b() {
        return null;
    }

    @Override // a3.AbstractC3755c
    public Object c() {
        return this.f25717b;
    }

    @Override // a3.AbstractC3755c
    public EnumC3757e d() {
        return this.f25718c;
    }

    @Override // a3.AbstractC3755c
    public AbstractC3758f e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3755c)) {
            return false;
        }
        AbstractC3755c abstractC3755c = (AbstractC3755c) obj;
        Integer num = this.f25716a;
        if (num != null ? num.equals(abstractC3755c.a()) : abstractC3755c.a() == null) {
            if (this.f25717b.equals(abstractC3755c.c()) && this.f25718c.equals(abstractC3755c.d())) {
                abstractC3755c.e();
                abstractC3755c.b();
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f25716a;
        return ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f25717b.hashCode()) * 1000003) ^ this.f25718c.hashCode()) * (-721379959);
    }

    public String toString() {
        return "Event{code=" + this.f25716a + ", payload=" + this.f25717b + ", priority=" + this.f25718c + ", productData=" + ((Object) null) + ", eventContext=" + ((Object) null) + "}";
    }
}
