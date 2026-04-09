package androidx.compose.foundation.layout;

import E0.V;
import f0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;
import z.C8677C;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignElement;", "LE0/V;", "Lz/C;", "Lf0/c$b;", "horizontal", "<init>", "(Lf0/c$b;)V", "d", "()Lz/C;", "node", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Lz/C;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Lf0/c$b;", "getHorizontal", "()Lf0/c$b;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HorizontalAlignElement extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c.b horizontal;

    public HorizontalAlignElement(c.b bVar) {
        this.horizontal = bVar;
    }

    @Override // E0.V
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C8677C a() {
        return new C8677C(this.horizontal);
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(C8677C node) {
        node.E2(this.horizontal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = other instanceof HorizontalAlignElement ? (HorizontalAlignElement) other : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return AbstractC6492s.d(this.horizontal, horizontalAlignElement.horizontal);
    }

    public int hashCode() {
        return this.horizontal.hashCode();
    }
}
