package androidx.compose.ui.semantics;

import E0.V;
import J0.d;
import kotlin.Metadata;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/semantics/EmptySemanticsElement;", "LE0/V;", "LJ0/d;", "node", "<init>", "(LJ0/d;)V", "d", "()LJ0/d;", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "LJ0/d;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EmptySemanticsElement extends V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d node;

    public EmptySemanticsElement(d dVar) {
        this.node = dVar;
    }

    @Override // E0.V
    /* renamed from: d, reason: from getter and merged with bridge method [inline-methods] */
    public d a() {
        return this.node;
    }

    @Override // E0.V
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(d node) {
    }

    public boolean equals(Object other) {
        return other == this;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }
}
