package D8;

import D8.n;
import androidx.recyclerview.widget.p;

/* compiled from: TotoParamsAdapter.kt */
/* loaded from: classes3.dex */
public final class o extends p.e<n> {
    @Override // androidx.recyclerview.widget.p.e
    public final boolean areContentsTheSame(n nVar, n nVar2) {
        n oldItem = nVar;
        n newItem = nVar2;
        kotlin.jvm.internal.l.f(oldItem, "oldItem");
        kotlin.jvm.internal.l.f(newItem, "newItem");
        if ((oldItem instanceof n.a) && (newItem instanceof n.a)) {
            return true;
        }
        return (oldItem instanceof n.b) && (newItem instanceof n.b) && ((n.b) oldItem).f1126b == ((n.b) newItem).f1126b;
    }

    @Override // androidx.recyclerview.widget.p.e
    public final boolean areItemsTheSame(n nVar, n nVar2) {
        n oldItem = nVar;
        n newItem = nVar2;
        kotlin.jvm.internal.l.f(oldItem, "oldItem");
        kotlin.jvm.internal.l.f(newItem, "newItem");
        if ((oldItem instanceof n.a) && (newItem instanceof n.a) && kotlin.jvm.internal.l.b(((n.a) oldItem).f1124a, ((n.a) newItem).f1124a)) {
            return true;
        }
        return (oldItem instanceof n.b) && (newItem instanceof n.b) && kotlin.jvm.internal.l.b(((n.b) oldItem).f1125a, ((n.b) newItem).f1125a);
    }
}
