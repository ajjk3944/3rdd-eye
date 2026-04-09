package N7;

import A7.b;
import N7.C1384uc;
import android.net.Uri;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivVisibilityAction.kt */
/* renamed from: N7.tc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1370tc implements InterfaceC5868a, B9 {

    /* renamed from: a, reason: collision with root package name */
    public final C1223j4 f9339a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Boolean> f9340b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<String> f9341c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<Long> f9342d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f9343e;

    /* renamed from: f, reason: collision with root package name */
    public final A7.b<Uri> f9344f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9345g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC1192h2 f9346h;
    public final A7.b<Uri> i;

    /* renamed from: j, reason: collision with root package name */
    public final A7.b<Long> f9347j;

    /* renamed from: k, reason: collision with root package name */
    public final A7.b<Long> f9348k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f9349l;

    static {
        b.a.a(Boolean.TRUE);
        b.a.a(1L);
        b.a.a(800L);
        b.a.a(50L);
    }

    public C1370tc(A7.b isEnabled, A7.b bVar, A7.b logLimit, A7.b bVar2, A7.b bVar3, A7.b visibilityDuration, A7.b visibilityPercentage, AbstractC1192h2 abstractC1192h2, C1223j4 c1223j4, String str, JSONObject jSONObject) {
        kotlin.jvm.internal.l.f(isEnabled, "isEnabled");
        kotlin.jvm.internal.l.f(logLimit, "logLimit");
        kotlin.jvm.internal.l.f(visibilityDuration, "visibilityDuration");
        kotlin.jvm.internal.l.f(visibilityPercentage, "visibilityPercentage");
        this.f9339a = c1223j4;
        this.f9340b = isEnabled;
        this.f9341c = bVar;
        this.f9342d = logLimit;
        this.f9343e = jSONObject;
        this.f9344f = bVar2;
        this.f9345g = str;
        this.f9346h = abstractC1192h2;
        this.i = bVar3;
        this.f9347j = visibilityDuration;
        this.f9348k = visibilityPercentage;
    }

    @Override // N7.B9
    public final AbstractC1192h2 a() {
        return this.f9346h;
    }

    @Override // N7.B9
    public final C1223j4 b() {
        return this.f9339a;
    }

    @Override // N7.B9
    public final JSONObject c() {
        return this.f9343e;
    }

    @Override // N7.B9
    public final String d() {
        return this.f9345g;
    }

    @Override // N7.B9
    public final A7.b<Uri> e() {
        return this.f9344f;
    }

    @Override // N7.B9
    public final A7.b<Long> f() {
        return this.f9342d;
    }

    @Override // N7.B9
    public final A7.b<String> g() {
        return this.f9341c;
    }

    @Override // N7.B9
    public final A7.b<Uri> getUrl() {
        return this.i;
    }

    public final boolean h(C1370tc c1370tc, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        if (c1370tc != null) {
            C1223j4 c1223j4 = c1370tc.f9339a;
            C1223j4 c1223j42 = this.f9339a;
            if ((c1223j42 != null ? c1223j42.a(c1223j4, resolver, otherResolver) : c1223j4 == null) && this.f9340b.a(resolver).booleanValue() == c1370tc.f9340b.a(otherResolver).booleanValue() && kotlin.jvm.internal.l.b(this.f9341c.a(resolver), c1370tc.f9341c.a(otherResolver)) && this.f9342d.a(resolver).longValue() == c1370tc.f9342d.a(otherResolver).longValue() && kotlin.jvm.internal.l.b(this.f9343e, c1370tc.f9343e)) {
                A7.b<Uri> bVar = this.f9344f;
                Uri uriA = bVar != null ? bVar.a(resolver) : null;
                A7.b<Uri> bVar2 = c1370tc.f9344f;
                if (kotlin.jvm.internal.l.b(uriA, bVar2 != null ? bVar2.a(otherResolver) : null) && kotlin.jvm.internal.l.b(this.f9345g, c1370tc.f9345g)) {
                    AbstractC1192h2 abstractC1192h2 = c1370tc.f9346h;
                    AbstractC1192h2 abstractC1192h22 = this.f9346h;
                    if (abstractC1192h22 != null ? abstractC1192h22.a(abstractC1192h2, resolver, otherResolver) : abstractC1192h2 == null) {
                        A7.b<Uri> bVar3 = this.i;
                        Uri uriA2 = bVar3 != null ? bVar3.a(resolver) : null;
                        A7.b<Uri> bVar4 = c1370tc.i;
                        if (kotlin.jvm.internal.l.b(uriA2, bVar4 != null ? bVar4.a(otherResolver) : null) && this.f9347j.a(resolver).longValue() == c1370tc.f9347j.a(otherResolver).longValue() && this.f9348k.a(resolver).longValue() == c1370tc.f9348k.a(otherResolver).longValue()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1384uc.a) D7.a.f1071b.n9.getValue()).b(D7.a.f1070a, this);
    }

    @Override // N7.B9
    public final A7.b<Boolean> isEnabled() {
        return this.f9340b;
    }

    public final int j() {
        Integer num = this.f9349l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.x.a(C1370tc.class).hashCode();
        C1223j4 c1223j4 = this.f9339a;
        int iHashCode2 = this.f9342d.hashCode() + this.f9341c.hashCode() + this.f9340b.hashCode() + iHashCode + (c1223j4 != null ? c1223j4.b() : 0);
        JSONObject jSONObject = this.f9343e;
        int iHashCode3 = iHashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
        A7.b<Uri> bVar = this.f9344f;
        int iHashCode4 = iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
        String str = this.f9345g;
        int iHashCode5 = iHashCode4 + (str != null ? str.hashCode() : 0);
        AbstractC1192h2 abstractC1192h2 = this.f9346h;
        int iB = iHashCode5 + (abstractC1192h2 != null ? abstractC1192h2.b() : 0);
        A7.b<Uri> bVar2 = this.i;
        int iHashCode6 = this.f9348k.hashCode() + this.f9347j.hashCode() + iB + (bVar2 != null ? bVar2.hashCode() : 0);
        this.f9349l = Integer.valueOf(iHashCode6);
        return iHashCode6;
    }
}
