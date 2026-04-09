package W;

import W.AbstractC1630s;

/* compiled from: AutoValue_MediaSpec.java */
/* renamed from: W.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1618f extends AbstractC1630s {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f13253a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1613a f13254b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13255c;

    /* compiled from: AutoValue_MediaSpec.java */
    /* renamed from: W.f$a */
    public static final class a extends AbstractC1630s.a {

        /* renamed from: a, reason: collision with root package name */
        public b0 f13256a;

        /* renamed from: b, reason: collision with root package name */
        public AbstractC1613a f13257b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f13258c;

        public final C1618f a() {
            String strConcat = this.f13256a == null ? " videoSpec" : "";
            if (this.f13257b == null) {
                strConcat = strConcat.concat(" audioSpec");
            }
            if (strConcat.isEmpty()) {
                return new C1618f(this.f13256a, this.f13257b, this.f13258c.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
    }

    public C1618f(b0 b0Var, AbstractC1613a abstractC1613a, int i) {
        this.f13253a = b0Var;
        this.f13254b = abstractC1613a;
        this.f13255c = i;
    }

    @Override // W.AbstractC1630s
    public final AbstractC1613a b() {
        return this.f13254b;
    }

    @Override // W.AbstractC1630s
    public final int c() {
        return this.f13255c;
    }

    @Override // W.AbstractC1630s
    public final b0 d() {
        return this.f13253a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1630s)) {
            return false;
        }
        AbstractC1630s abstractC1630s = (AbstractC1630s) obj;
        return this.f13253a.equals(abstractC1630s.d()) && this.f13254b.equals(abstractC1630s.b()) && this.f13255c == abstractC1630s.c();
    }

    public final int hashCode() {
        return ((((this.f13253a.hashCode() ^ 1000003) * 1000003) ^ this.f13254b.hashCode()) * 1000003) ^ this.f13255c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSpec{videoSpec=");
        sb.append(this.f13253a);
        sb.append(", audioSpec=");
        sb.append(this.f13254b);
        sb.append(", outputFormat=");
        return B4.i.j(sb, this.f13255c, "}");
    }
}
