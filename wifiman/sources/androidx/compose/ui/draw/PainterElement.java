package androidx.compose.ui.draw;

import C0.InterfaceC2528h;
import E0.AbstractC2640s;
import E0.E;
import E0.V;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import l0.C6537m;
import m0.AbstractC6735w0;
import org.snmp4j.util.SnmpConfigurator;
import r0.AbstractC7554d;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "LE0/V;", "Landroidx/compose/ui/draw/e;", "Lr0/d;", "painter", "", "sizeToIntrinsics", "Lf0/c;", "alignment", "LC0/h;", "contentScale", "", "alpha", "Lm0/w0;", "colorFilter", "<init>", "(Lr0/d;ZLf0/c;LC0/h;FLm0/w0;)V", "d", "()Landroidx/compose/ui/draw/e;", "node", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Landroidx/compose/ui/draw/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Lr0/d;", "getPainter", "()Lr0/d;", SnmpConfigurator.O_BIND_ADDRESS, "Z", "getSizeToIntrinsics", "()Z", SnmpConfigurator.O_COMMUNITY, "Lf0/c;", "getAlignment", "()Lf0/c;", "LC0/h;", "getContentScale", "()LC0/h;", "F", "getAlpha", "()F", "f", "Lm0/w0;", "getColorFilter", "()Lm0/w0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class PainterElement extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC7554d painter;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean sizeToIntrinsics;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final f0.c alignment;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC2528h contentScale;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6735w0 colorFilter;

    public PainterElement(AbstractC7554d abstractC7554d, boolean z10, f0.c cVar, InterfaceC2528h interfaceC2528h, float f10, AbstractC6735w0 abstractC6735w0) {
        this.painter = abstractC7554d;
        this.sizeToIntrinsics = z10;
        this.alignment = cVar;
        this.contentScale = interfaceC2528h;
        this.alpha = f10;
        this.colorFilter = abstractC6735w0;
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e a() {
        return new e(this.painter, this.sizeToIntrinsics, this.alignment, this.contentScale, this.alpha, this.colorFilter);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(e node) {
        boolean zF2 = node.F2();
        boolean z10 = this.sizeToIntrinsics;
        boolean z11 = zF2 != z10 || (z10 && !C6537m.f(node.E2().l(), this.painter.l()));
        node.N2(this.painter);
        node.O2(this.sizeToIntrinsics);
        node.K2(this.alignment);
        node.M2(this.contentScale);
        node.a(this.alpha);
        node.L2(this.colorFilter);
        if (z11) {
            E.b(node);
        }
        AbstractC2640s.a(node);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) other;
        return AbstractC6492s.d(this.painter, painterElement.painter) && this.sizeToIntrinsics == painterElement.sizeToIntrinsics && AbstractC6492s.d(this.alignment, painterElement.alignment) && AbstractC6492s.d(this.contentScale, painterElement.contentScale) && Float.compare(this.alpha, painterElement.alpha) == 0 && AbstractC6492s.d(this.colorFilter, painterElement.colorFilter);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.painter.hashCode() * 31) + Boolean.hashCode(this.sizeToIntrinsics)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        AbstractC6735w0 abstractC6735w0 = this.colorFilter;
        return iHashCode + (abstractC6735w0 == null ? 0 : abstractC6735w0.hashCode());
    }

    public String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
