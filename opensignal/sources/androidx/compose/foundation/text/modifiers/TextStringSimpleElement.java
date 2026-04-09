package androidx.compose.foundation.text.modifiers;

import c7.a;
import g0.k;
import g1.s;
import h2.j0;
import k2.g;
import kotlin.Metadata;
import x1.z0;
import z0.l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Lx1/z0;", "Lg0/k;", "Lg1/s;", "color", "Lg1/s;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1092a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f1093b;

    /* renamed from: c, reason: collision with root package name */
    public final g f1094c;
    private final s color;

    /* renamed from: d, reason: collision with root package name */
    public final int f1095d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1096e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1097f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1098g;

    public TextStringSimpleElement(String str, j0 j0Var, g gVar, int i10, boolean z10, int i11, int i12, s sVar) {
        this.f1092a = str;
        this.f1093b = j0Var;
        this.f1094c = gVar;
        this.f1095d = i10;
        this.f1096e = z10;
        this.f1097f = i11;
        this.f1098g = i12;
        this.color = sVar;
    }

    @Override // x1.z0
    public final l d() {
        s sVar = this.color;
        k kVar = new k();
        kVar.f9186p = this.f1092a;
        kVar.f9187q = this.f1093b;
        kVar.f9188r = this.f1094c;
        kVar.f9189s = this.f1095d;
        kVar.f9190t = this.f1096e;
        kVar.f9191u = this.f1097f;
        kVar.f9192v = this.f1098g;
        kVar.f9193w = sVar;
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // x1.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(z0.l r12) {
        /*
            r11 = this;
            g0.k r12 = (g0.k) r12
            g1.s r0 = r11.color
            g1.s r1 = r12.f9193w
            boolean r1 = br.l.a(r0, r1)
            r12.f9193w = r0
            r0 = 0
            r2 = 1
            h2.j0 r3 = r11.f1093b
            if (r1 == 0) goto L26
            h2.j0 r1 = r12.f9187q
            if (r3 == r1) goto L21
            h2.c0 r4 = r3.f9840a
            h2.c0 r1 = r1.f9840a
            boolean r1 = r4.b(r1)
            if (r1 == 0) goto L26
            goto L24
        L21:
            r3.getClass()
        L24:
            r1 = r0
            goto L27
        L26:
            r1 = r2
        L27:
            java.lang.String r4 = r12.f9186p
            java.lang.String r5 = r11.f1092a
            boolean r4 = br.l.a(r4, r5)
            if (r4 == 0) goto L32
            goto L38
        L32:
            r12.f9186p = r5
            r0 = 0
            r12.A = r0
            r0 = r2
        L38:
            h2.j0 r4 = r12.f9187q
            boolean r4 = r4.c(r3)
            r4 = r4 ^ r2
            r12.f9187q = r3
            int r3 = r12.f9192v
            int r5 = r11.f1098g
            if (r3 == r5) goto L4a
            r12.f9192v = r5
            r4 = r2
        L4a:
            int r3 = r12.f9191u
            int r5 = r11.f1097f
            if (r3 == r5) goto L53
            r12.f9191u = r5
            r4 = r2
        L53:
            boolean r3 = r12.f9190t
            boolean r5 = r11.f1096e
            if (r3 == r5) goto L5c
            r12.f9190t = r5
            r4 = r2
        L5c:
            k2.g r3 = r12.f9188r
            k2.g r5 = r11.f1094c
            boolean r3 = br.l.a(r3, r5)
            if (r3 != 0) goto L69
            r12.f9188r = r5
            r4 = r2
        L69:
            int r3 = r12.f9189s
            int r5 = r11.f1095d
            if (r3 != r5) goto L71
            r2 = r4
            goto L73
        L71:
            r12.f9189s = r5
        L73:
            if (r0 != 0) goto L77
            if (r2 == 0) goto La3
        L77:
            g0.e r3 = r12.c0()
            java.lang.String r4 = r12.f9186p
            h2.j0 r5 = r12.f9187q
            k2.g r6 = r12.f9188r
            int r7 = r12.f9189s
            boolean r8 = r12.f9190t
            int r9 = r12.f9191u
            int r10 = r12.f9192v
            r3.f9148a = r4
            r3.f9149b = r5
            r3.f9150c = r6
            r3.f9151d = r7
            r3.f9152e = r8
            r3.f9153f = r9
            r3.f9154g = r10
            long r4 = r3.f9162q
            r6 = 2
            long r4 = r4 << r6
            r6 = 2
            long r4 = r4 | r6
            r3.f9162q = r4
            r3.b()
        La3:
            boolean r3 = r12.f26506o
            if (r3 != 0) goto La8
            goto Lc2
        La8:
            if (r0 != 0) goto Lb0
            if (r1 == 0) goto Lb3
            g0.i r3 = r12.f9196z
            if (r3 == 0) goto Lb3
        Lb0:
            x1.k.l(r12)
        Lb3:
            if (r0 != 0) goto Lb7
            if (r2 == 0) goto Lbd
        Lb7:
            x1.k.k(r12)
            x1.k.j(r12)
        Lbd:
            if (r1 == 0) goto Lc2
            x1.k.j(r12)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleElement.e(z0.l):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return br.l.a(this.color, textStringSimpleElement.color) && br.l.a(this.f1092a, textStringSimpleElement.f1092a) && br.l.a(this.f1093b, textStringSimpleElement.f1093b) && br.l.a(this.f1094c, textStringSimpleElement.f1094c) && this.f1095d == textStringSimpleElement.f1095d && this.f1096e == textStringSimpleElement.f1096e && this.f1097f == textStringSimpleElement.f1097f && this.f1098g == textStringSimpleElement.f1098g;
    }

    public final int hashCode() {
        int iB = (((w.g.b(a.C(this.f1095d, (this.f1094c.hashCode() + a.e(this.f1093b, this.f1092a.hashCode() * 31, 31)) * 31, 31), this.f1096e, 31) + this.f1097f) * 31) + this.f1098g) * 31;
        s sVar = this.color;
        return iB + (sVar != null ? sVar.hashCode() : 0);
    }
}
