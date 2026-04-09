package androidx.compose.foundation;

import a0.i;
import kotlin.Metadata;
import w.g;
import x1.z0;
import y.h;
import y.q;
import z0.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Lx1/z0;", "Ly/h;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class ClickableElement extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f1064a;

    /* renamed from: b, reason: collision with root package name */
    public final q f1065b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1066c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1067d;

    /* renamed from: e, reason: collision with root package name */
    public final ar.a f1068e;

    public ClickableElement(i iVar, q qVar, boolean z10, boolean z11, ar.a aVar) {
        this.f1064a = iVar;
        this.f1065b = qVar;
        this.f1066c = z10;
        this.f1067d = z11;
        this.f1068e = aVar;
    }

    @Override // x1.z0
    public final l d() {
        return new h(this.f1064a, this.f1065b, this.f1066c, this.f1067d, this.f1068e);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    @Override // x1.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(z0.l r8) {
        /*
            r7 = this;
            y.h r8 = (y.h) r8
            y.l r0 = r8.f25587w
            a0.i r1 = r8.D
            a0.i r2 = r7.f1064a
            boolean r1 = br.l.a(r1, r2)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L19
            r8.f0()
            r8.D = r2
            r8.f25582r = r2
            r1 = r3
            goto L1a
        L19:
            r1 = r4
        L1a:
            y.q r2 = r8.f25583s
            y.q r5 = r7.f1065b
            boolean r2 = br.l.a(r2, r5)
            if (r2 != 0) goto L27
            r8.f25583s = r5
            r1 = r3
        L27:
            boolean r2 = r8.f25584t
            boolean r5 = r7.f1066c
            if (r2 == r5) goto L35
            r8.f25584t = r5
            if (r5 == 0) goto L34
            r8.E()
        L34:
            r1 = r3
        L35:
            boolean r2 = r8.f25585u
            boolean r5 = r7.f1067d
            if (r2 == r5) goto L4c
            if (r5 == 0) goto L41
            r8.c0(r0)
            goto L47
        L41:
            r8.d0(r0)
            r8.f0()
        L47:
            x1.k.l(r8)
            r8.f25585u = r5
        L4c:
            ar.a r2 = r7.f1068e
            r8.f25586v = r2
            boolean r2 = r8.E
            a0.i r5 = r8.D
            if (r5 != 0) goto L58
            r6 = r3
            goto L59
        L58:
            r6 = r4
        L59:
            if (r2 == r6) goto L67
            if (r5 != 0) goto L5e
            r4 = r3
        L5e:
            r8.E = r4
            if (r4 != 0) goto L67
            x1.i r2 = r8.f25589y
            if (r2 != 0) goto L67
            goto L68
        L67:
            r3 = r1
        L68:
            if (r3 == 0) goto L7d
            x1.i r1 = r8.f25589y
            if (r1 != 0) goto L72
            boolean r2 = r8.E
            if (r2 != 0) goto L7d
        L72:
            if (r1 == 0) goto L77
            r8.d0(r1)
        L77:
            r1 = 0
            r8.f25589y = r1
            r8.h0()
        L7d:
            a0.i r8 = r8.f25582r
            r0.h0(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableElement.e(z0.l):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return br.l.a(this.f1064a, clickableElement.f1064a) && br.l.a(this.f1065b, clickableElement.f1065b) && this.f1066c == clickableElement.f1066c && this.f1067d == clickableElement.f1067d && this.f1068e == clickableElement.f1068e;
    }

    public final int hashCode() {
        i iVar = this.f1064a;
        int iHashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        q qVar = this.f1065b;
        return this.f1068e.hashCode() + g.b(g.b((iHashCode + (qVar != null ? qVar.hashCode() : 0)) * 31, this.f1066c, 31), this.f1067d, 29791);
    }
}
