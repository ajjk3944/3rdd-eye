package org.kodein.type;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class d implements i {

    /* renamed from: b, reason: collision with root package name */
    private final i f56948b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f56949c;

    public d(i typeToken, Class raw) {
        AbstractC6492s.i(typeToken, "typeToken");
        AbstractC6492s.i(raw, "raw");
        this.f56948b = typeToken;
        this.f56949c = raw;
    }

    @Override // org.kodein.type.q
    public boolean a() {
        return this.f56948b.a();
    }

    @Override // org.kodein.type.q
    public q[] b() {
        return this.f56948b.b();
    }

    @Override // org.kodein.type.q
    public q c() {
        return new f(this.f56949c);
    }

    @Override // org.kodein.type.q
    public boolean d(q typeToken) {
        AbstractC6492s.i(typeToken, "typeToken");
        return this.f56948b.d(typeToken);
    }

    @Override // org.kodein.type.i
    public Type e() {
        return this.f56948b.e();
    }

    public boolean equals(Object obj) {
        return this.f56948b.equals(obj);
    }

    @Override // org.kodein.type.q
    public boolean f() {
        return this.f56948b.f();
    }

    @Override // org.kodein.type.q
    public List g() {
        return this.f56948b.g();
    }

    @Override // org.kodein.type.q
    public String h() {
        return this.f56948b.h();
    }

    public int hashCode() {
        return this.f56948b.hashCode();
    }

    @Override // org.kodein.type.q
    public String i() {
        return this.f56948b.i();
    }

    public String toString() {
        return this.f56948b.toString();
    }
}
