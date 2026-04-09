package H6;

import b9.C2001h;
import p9.InterfaceC5480a;

/* compiled from: CompositeLogId.kt */
/* renamed from: H6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0673j {

    /* renamed from: a, reason: collision with root package name */
    public final String f2149a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2150b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2151c;

    /* renamed from: d, reason: collision with root package name */
    public final b9.p f2152d;

    /* compiled from: CompositeLogId.kt */
    /* renamed from: H6.j$a */
    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<String> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            C0673j c0673j = C0673j.this;
            sb.append(c0673j.f2149a);
            String str = c0673j.f2150b;
            sb.append(str.length() > 0 ? "#".concat(str) : "");
            sb.append('#');
            sb.append(c0673j.f2151c);
            return sb.toString();
        }
    }

    public C0673j(String str, String scopeLogId, String actionLogId) {
        kotlin.jvm.internal.l.f(scopeLogId, "scopeLogId");
        kotlin.jvm.internal.l.f(actionLogId, "actionLogId");
        this.f2149a = str;
        this.f2150b = scopeLogId;
        this.f2151c = actionLogId;
        this.f2152d = C2001h.b(new a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0673j)) {
            return false;
        }
        C0673j c0673j = (C0673j) obj;
        return kotlin.jvm.internal.l.b(this.f2149a, c0673j.f2149a) && kotlin.jvm.internal.l.b(this.f2150b, c0673j.f2150b) && kotlin.jvm.internal.l.b(this.f2151c, c0673j.f2151c);
    }

    public final int hashCode() {
        return this.f2151c.hashCode() + B4.g.n(this.f2149a.hashCode() * 31, 31, this.f2150b);
    }

    public final String toString() {
        return (String) this.f2152d.getValue();
    }
}
