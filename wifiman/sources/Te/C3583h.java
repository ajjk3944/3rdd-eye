package Te;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import sh.C7974i;

/* renamed from: Te.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3583h {

    /* renamed from: a, reason: collision with root package name */
    private final M f21844a;

    /* renamed from: b, reason: collision with root package name */
    private final C7974i f21845b;

    /* renamed from: c, reason: collision with root package name */
    private final List f21846c;

    /* renamed from: d, reason: collision with root package name */
    private final z6.c f21847d;

    /* renamed from: e, reason: collision with root package name */
    private final String f21848e;

    public C3583h(M axis, C7974i range, List labels, z6.c valueFormatter, String longestLabel) {
        AbstractC6492s.i(axis, "axis");
        AbstractC6492s.i(range, "range");
        AbstractC6492s.i(labels, "labels");
        AbstractC6492s.i(valueFormatter, "valueFormatter");
        AbstractC6492s.i(longestLabel, "longestLabel");
        this.f21844a = axis;
        this.f21845b = range;
        this.f21846c = labels;
        this.f21847d = valueFormatter;
        this.f21848e = longestLabel;
    }

    public final M a() {
        return this.f21844a;
    }

    public final List b() {
        return this.f21846c;
    }

    public final String c() {
        return this.f21848e;
    }

    public final C7974i d() {
        return this.f21845b;
    }

    public final z6.c e() {
        return this.f21847d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3583h)) {
            return false;
        }
        C3583h c3583h = (C3583h) obj;
        return AbstractC6492s.d(this.f21844a, c3583h.f21844a) && AbstractC6492s.d(this.f21845b, c3583h.f21845b) && AbstractC6492s.d(this.f21846c, c3583h.f21846c) && AbstractC6492s.d(this.f21847d, c3583h.f21847d) && AbstractC6492s.d(this.f21848e, c3583h.f21848e);
    }

    public int hashCode() {
        return (((((((this.f21844a.hashCode() * 31) + this.f21845b.hashCode()) * 31) + this.f21846c.hashCode()) * 31) + this.f21847d.hashCode()) * 31) + this.f21848e.hashCode();
    }

    public String toString() {
        return "ChartYAxis(axis=" + this.f21844a + ", range=" + this.f21845b + ", labels=" + this.f21846c + ", valueFormatter=" + this.f21847d + ", longestLabel=" + this.f21848e + ")";
    }
}
