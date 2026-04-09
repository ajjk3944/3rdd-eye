package Gh;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class G extends u implements Qh.B {

    /* renamed from: a, reason: collision with root package name */
    private final E f7450a;

    /* renamed from: b, reason: collision with root package name */
    private final Annotation[] f7451b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7452c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7453d;

    public G(E type, Annotation[] reflectAnnotations, String str, boolean z10) {
        AbstractC6492s.i(type, "type");
        AbstractC6492s.i(reflectAnnotations, "reflectAnnotations");
        this.f7450a = type;
        this.f7451b = reflectAnnotations;
        this.f7452c = str;
        this.f7453d = z10;
    }

    @Override // Qh.B
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public E getType() {
        return this.f7450a;
    }

    @Override // Qh.B
    public boolean c() {
        return this.f7453d;
    }

    @Override // Qh.B
    public Zh.f getName() {
        String str = this.f7452c;
        if (str != null) {
            return Zh.f.g(str);
        }
        return null;
    }

    @Override // Qh.InterfaceC3447d
    public boolean h() {
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(G.class.getName());
        sb2.append(": ");
        sb2.append(c() ? "vararg " : "");
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(getType());
        return sb2.toString();
    }

    @Override // Qh.InterfaceC3447d
    public List getAnnotations() {
        return k.b(this.f7451b);
    }

    @Override // Qh.InterfaceC3447d
    public C2915g l(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        return k.a(this.f7451b, fqName);
    }
}
