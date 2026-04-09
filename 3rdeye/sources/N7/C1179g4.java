package N7;

import A7.b;
import N7.C1194h4;
import android.net.Uri;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivDisappearAction.kt */
/* renamed from: N7.g4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1179g4 implements InterfaceC5868a, B9 {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Long> f8275a;

    /* renamed from: b, reason: collision with root package name */
    public final C1223j4 f8276b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<Boolean> f8277c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<String> f8278d;

    /* renamed from: e, reason: collision with root package name */
    public final A7.b<Long> f8279e;

    /* renamed from: f, reason: collision with root package name */
    public final JSONObject f8280f;

    /* renamed from: g, reason: collision with root package name */
    public final A7.b<Uri> f8281g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8282h;
    public final AbstractC1192h2 i;

    /* renamed from: j, reason: collision with root package name */
    public final A7.b<Uri> f8283j;

    /* renamed from: k, reason: collision with root package name */
    public final A7.b<Long> f8284k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f8285l;

    static {
        b.a.a(800L);
        b.a.a(Boolean.TRUE);
        b.a.a(1L);
        b.a.a(0L);
    }

    public C1179g4(A7.b disappearDuration, A7.b isEnabled, A7.b bVar, A7.b logLimit, A7.b bVar2, A7.b bVar3, A7.b visibilityPercentage, AbstractC1192h2 abstractC1192h2, C1223j4 c1223j4, String str, JSONObject jSONObject) {
        kotlin.jvm.internal.l.f(disappearDuration, "disappearDuration");
        kotlin.jvm.internal.l.f(isEnabled, "isEnabled");
        kotlin.jvm.internal.l.f(logLimit, "logLimit");
        kotlin.jvm.internal.l.f(visibilityPercentage, "visibilityPercentage");
        this.f8275a = disappearDuration;
        this.f8276b = c1223j4;
        this.f8277c = isEnabled;
        this.f8278d = bVar;
        this.f8279e = logLimit;
        this.f8280f = jSONObject;
        this.f8281g = bVar2;
        this.f8282h = str;
        this.i = abstractC1192h2;
        this.f8283j = bVar3;
        this.f8284k = visibilityPercentage;
    }

    @Override // N7.B9
    public final AbstractC1192h2 a() {
        return this.i;
    }

    @Override // N7.B9
    public final C1223j4 b() {
        return this.f8276b;
    }

    @Override // N7.B9
    public final JSONObject c() {
        return this.f8280f;
    }

    @Override // N7.B9
    public final String d() {
        return this.f8282h;
    }

    @Override // N7.B9
    public final A7.b<Uri> e() {
        return this.f8281g;
    }

    @Override // N7.B9
    public final A7.b<Long> f() {
        return this.f8279e;
    }

    @Override // N7.B9
    public final A7.b<String> g() {
        return this.f8278d;
    }

    @Override // N7.B9
    public final A7.b<Uri> getUrl() {
        return this.f8283j;
    }

    public final boolean h(C1179g4 c1179g4, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        if (c1179g4 != null && this.f8275a.a(resolver).longValue() == c1179g4.f8275a.a(otherResolver).longValue()) {
            C1223j4 c1223j4 = c1179g4.f8276b;
            C1223j4 c1223j42 = this.f8276b;
            if ((c1223j42 != null ? c1223j42.a(c1223j4, resolver, otherResolver) : c1223j4 == null) && this.f8277c.a(resolver).booleanValue() == c1179g4.f8277c.a(otherResolver).booleanValue() && kotlin.jvm.internal.l.b(this.f8278d.a(resolver), c1179g4.f8278d.a(otherResolver)) && this.f8279e.a(resolver).longValue() == c1179g4.f8279e.a(otherResolver).longValue() && kotlin.jvm.internal.l.b(this.f8280f, c1179g4.f8280f)) {
                A7.b<Uri> bVar = this.f8281g;
                Uri uriA = bVar != null ? bVar.a(resolver) : null;
                A7.b<Uri> bVar2 = c1179g4.f8281g;
                if (kotlin.jvm.internal.l.b(uriA, bVar2 != null ? bVar2.a(otherResolver) : null) && kotlin.jvm.internal.l.b(this.f8282h, c1179g4.f8282h)) {
                    AbstractC1192h2 abstractC1192h2 = c1179g4.i;
                    AbstractC1192h2 abstractC1192h22 = this.i;
                    if (abstractC1192h22 != null ? abstractC1192h22.a(abstractC1192h2, resolver, otherResolver) : abstractC1192h2 == null) {
                        A7.b<Uri> bVar3 = this.f8283j;
                        Uri uriA2 = bVar3 != null ? bVar3.a(resolver) : null;
                        A7.b<Uri> bVar4 = c1179g4.f8283j;
                        if (kotlin.jvm.internal.l.b(uriA2, bVar4 != null ? bVar4.a(otherResolver) : null) && this.f8284k.a(resolver).longValue() == c1179g4.f8284k.a(otherResolver).longValue()) {
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
        return ((C1194h4.a) D7.a.f1071b.f6535M2.getValue()).b(D7.a.f1070a, this);
    }

    @Override // N7.B9
    public final A7.b<Boolean> isEnabled() {
        return this.f8277c;
    }

    public final int j() {
        Integer num = this.f8285l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = this.f8275a.hashCode() + kotlin.jvm.internal.x.a(C1179g4.class).hashCode();
        C1223j4 c1223j4 = this.f8276b;
        int iHashCode2 = this.f8279e.hashCode() + this.f8278d.hashCode() + this.f8277c.hashCode() + iHashCode + (c1223j4 != null ? c1223j4.b() : 0);
        JSONObject jSONObject = this.f8280f;
        int iHashCode3 = iHashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
        A7.b<Uri> bVar = this.f8281g;
        int iHashCode4 = iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
        String str = this.f8282h;
        int iHashCode5 = iHashCode4 + (str != null ? str.hashCode() : 0);
        AbstractC1192h2 abstractC1192h2 = this.i;
        int iB = iHashCode5 + (abstractC1192h2 != null ? abstractC1192h2.b() : 0);
        A7.b<Uri> bVar2 = this.f8283j;
        int iHashCode6 = this.f8284k.hashCode() + iB + (bVar2 != null ? bVar2.hashCode() : 0);
        this.f8285l = Integer.valueOf(iHashCode6);
        return iHashCode6;
    }
}
