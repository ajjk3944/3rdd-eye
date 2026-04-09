package Te;

import gc.EnumC5895b;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC5895b f21662a;

    /* renamed from: b, reason: collision with root package name */
    private final List f21663b;

    /* renamed from: c, reason: collision with root package name */
    private final M f21664c;

    /* renamed from: d, reason: collision with root package name */
    private final L f21665d;

    /* renamed from: e, reason: collision with root package name */
    private final List f21666e;

    /* renamed from: f, reason: collision with root package name */
    private final List f21667f;

    public J(EnumC5895b type, List lines, M yAxis, L xAxis, List markers, List outages) {
        AbstractC6492s.i(type, "type");
        AbstractC6492s.i(lines, "lines");
        AbstractC6492s.i(yAxis, "yAxis");
        AbstractC6492s.i(xAxis, "xAxis");
        AbstractC6492s.i(markers, "markers");
        AbstractC6492s.i(outages, "outages");
        this.f21662a = type;
        this.f21663b = lines;
        this.f21664c = yAxis;
        this.f21665d = xAxis;
        this.f21666e = markers;
        this.f21667f = outages;
    }

    public final List a() {
        return this.f21663b;
    }

    public final List b() {
        return this.f21666e;
    }

    public final List c() {
        return this.f21667f;
    }

    public final EnumC5895b d() {
        return this.f21662a;
    }

    public final L e() {
        return this.f21665d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j10 = (J) obj;
        return this.f21662a == j10.f21662a && AbstractC6492s.d(this.f21663b, j10.f21663b) && AbstractC6492s.d(this.f21664c, j10.f21664c) && AbstractC6492s.d(this.f21665d, j10.f21665d) && AbstractC6492s.d(this.f21666e, j10.f21666e) && AbstractC6492s.d(this.f21667f, j10.f21667f);
    }

    public final M f() {
        return this.f21664c;
    }

    public int hashCode() {
        return (((((((((this.f21662a.hashCode() * 31) + this.f21663b.hashCode()) * 31) + this.f21664c.hashCode()) * 31) + this.f21665d.hashCode()) * 31) + this.f21666e.hashCode()) * 31) + this.f21667f.hashCode();
    }

    public String toString() {
        return "Model(type=" + this.f21662a + ", lines=" + this.f21663b + ", yAxis=" + this.f21664c + ", xAxis=" + this.f21665d + ", markers=" + this.f21666e + ", outages=" + this.f21667f + ")";
    }
}
