package z3;

import android.content.Context;

/* compiled from: AutoValue_CreationContext.java */
/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f48440a;

    /* renamed from: b, reason: collision with root package name */
    public final H3.a f48441b;

    /* renamed from: c, reason: collision with root package name */
    public final H3.a f48442c;

    /* renamed from: d, reason: collision with root package name */
    public final String f48443d;

    public c(Context context, H3.a aVar, H3.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f48440a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f48441b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f48442c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f48443d = str;
    }

    @Override // z3.h
    public final Context a() {
        return this.f48440a;
    }

    @Override // z3.h
    public final String b() {
        return this.f48443d;
    }

    @Override // z3.h
    public final H3.a c() {
        return this.f48442c;
    }

    @Override // z3.h
    public final H3.a d() {
        return this.f48441b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f48440a.equals(hVar.a()) && this.f48441b.equals(hVar.d()) && this.f48442c.equals(hVar.c()) && this.f48443d.equals(hVar.b());
    }

    public final int hashCode() {
        return ((((((this.f48440a.hashCode() ^ 1000003) * 1000003) ^ this.f48441b.hashCode()) * 1000003) ^ this.f48442c.hashCode()) * 1000003) ^ this.f48443d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f48440a);
        sb.append(", wallClock=");
        sb.append(this.f48441b);
        sb.append(", monotonicClock=");
        sb.append(this.f48442c);
        sb.append(", backendName=");
        return B4.f.c(sb, this.f48443d, "}");
    }
}
