package androidx.compose.ui.draw;

import g1.m;
import kotlin.Metadata;
import v1.g;
import x1.k;
import x1.z0;
import z0.e;
import z0.l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Lx1/z0;", "Landroidx/compose/ui/draw/PainterNode;", "Ll1/a;", "painter", "Ll1/a;", "getPainter", "()Ll1/a;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class PainterElement extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f1121a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1122b;

    /* renamed from: c, reason: collision with root package name */
    public final m f1123c;
    private final l1.a painter;

    public PainterElement(l1.a aVar, e eVar, float f10, m mVar) {
        this.painter = aVar;
        this.f1121a = eVar;
        this.f1122b = f10;
        this.f1123c = mVar;
    }

    @Override // x1.z0
    public final l d() {
        return new PainterNode(this.painter, this.f1121a, this.f1122b, this.f1123c);
    }

    @Override // x1.z0
    public final void e(l lVar) {
        PainterNode painterNode = (PainterNode) lVar;
        painterNode.getClass();
        boolean zA = f1.e.a(painterNode.getPainter().d(), this.painter.d());
        painterNode.f0(this.painter);
        painterNode.f1124p = this.f1121a;
        painterNode.f1125q = this.f1122b;
        painterNode.f1126r = this.f1123c;
        if (!zA) {
            k.k(painterNode);
        }
        k.j(painterNode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        if (!br.l.a(this.painter, painterElement.painter) || !br.l.a(this.f1121a, painterElement.f1121a)) {
            return false;
        }
        Object obj2 = g.f23786a;
        return obj2.equals(obj2) && Float.compare(this.f1122b, painterElement.f1122b) == 0 && br.l.a(this.f1123c, painterElement.f1123c);
    }

    public final int hashCode() {
        int iA = w.g.a((g.f23786a.hashCode() + ((this.f1121a.hashCode() + w.g.b(this.painter.hashCode() * 31, true, 31)) * 31)) * 31, this.f1122b, 31);
        m mVar = this.f1123c;
        return iA + (mVar == null ? 0 : mVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=true, alignment=" + this.f1121a + ", contentScale=" + g.f23786a + ", alpha=" + this.f1122b + ", colorFilter=" + this.f1123c + ')';
    }
}
