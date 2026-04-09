package androidx.compose.foundation.text.modifiers;

import ar.k;
import c7.a;
import g0.h;
import g1.s;
import h2.f;
import h2.j0;
import k2.g;
import kotlin.Metadata;
import x1.z0;
import z0.l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Lx1/z0;", "Lg0/h;", "Lg1/s;", "color", "Lg1/s;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f1084a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f1085b;

    /* renamed from: c, reason: collision with root package name */
    public final g f1086c;
    private final s color;

    /* renamed from: d, reason: collision with root package name */
    public final k f1087d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1088e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1089f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1090g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1091h;

    public TextAnnotatedStringElement(f fVar, j0 j0Var, g gVar, k kVar, int i10, boolean z10, int i11, int i12, s sVar) {
        this.f1084a = fVar;
        this.f1085b = j0Var;
        this.f1086c = gVar;
        this.f1087d = kVar;
        this.f1088e = i10;
        this.f1089f = z10;
        this.f1090g = i11;
        this.f1091h = i12;
        this.color = sVar;
    }

    @Override // x1.z0
    public final l d() {
        s sVar = this.color;
        h hVar = new h();
        hVar.f9169p = this.f1084a;
        hVar.f9170q = this.f1085b;
        hVar.f9171r = this.f1086c;
        hVar.f9172s = this.f1087d;
        hVar.f9173t = this.f1088e;
        hVar.f9174u = this.f1089f;
        hVar.f9175v = this.f1090g;
        hVar.f9176w = this.f1091h;
        hVar.f9177x = sVar;
        return hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    @Override // x1.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(z0.l r15) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement.e(z0.l):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return br.l.a(this.color, textAnnotatedStringElement.color) && this.f1084a.equals(textAnnotatedStringElement.f1084a) && br.l.a(this.f1085b, textAnnotatedStringElement.f1085b) && br.l.a(this.f1086c, textAnnotatedStringElement.f1086c) && this.f1087d == textAnnotatedStringElement.f1087d && this.f1088e == textAnnotatedStringElement.f1088e && this.f1089f == textAnnotatedStringElement.f1089f && this.f1090g == textAnnotatedStringElement.f1090g && this.f1091h == textAnnotatedStringElement.f1091h;
    }

    public final int hashCode() {
        int iHashCode = (this.f1086c.hashCode() + a.e(this.f1085b, this.f1084a.hashCode() * 31, 31)) * 31;
        k kVar = this.f1087d;
        int iB = (((w.g.b(a.C(this.f1088e, (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31, 31), this.f1089f, 31) + this.f1090g) * 31) + this.f1091h) * 923521;
        s sVar = this.color;
        return (iB + (sVar != null ? sVar.hashCode() : 0)) * 31;
    }
}
