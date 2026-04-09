package xr;

import java.lang.annotation.Annotation;
import java.util.Collection;

/* loaded from: classes.dex */
public final class d0 extends s implements hs.b {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f25497a;

    /* renamed from: b, reason: collision with root package name */
    public final Annotation[] f25498b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25499c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25500d;

    public d0(b0 b0Var, Annotation[] annotationArr, String str, boolean z10) {
        br.l.e(annotationArr, "reflectAnnotations");
        this.f25497a = b0Var;
        this.f25498b = annotationArr;
        this.f25499c = str;
        this.f25500d = z10;
    }

    @Override // hs.b
    public final e a(qs.c cVar) {
        br.l.e(cVar, "fqName");
        return ba.m.w(this.f25498b, cVar);
    }

    @Override // hs.b
    public final Collection getAnnotations() {
        return ba.m.x(this.f25498b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d0.class.getName());
        sb2.append(": ");
        sb2.append(this.f25500d ? "vararg " : "");
        String str = this.f25499c;
        sb2.append(str != null ? qs.g.d(str) : null);
        sb2.append(": ");
        sb2.append(this.f25497a);
        return sb2.toString();
    }
}
