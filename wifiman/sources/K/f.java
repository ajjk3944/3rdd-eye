package K;

import Zg.AbstractC3689v;
import androidx.compose.runtime.snapshots.k;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final a f10250d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f10251e = 8;

    /* renamed from: a, reason: collision with root package name */
    private final int f10252a;

    /* renamed from: b, reason: collision with root package name */
    private k f10253b;

    /* renamed from: c, reason: collision with root package name */
    private k f10254c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public f(List list, List list2, int i10) {
        this.f10252a = i10;
        k kVar = new k();
        kVar.addAll(list);
        this.f10253b = kVar;
        k kVar2 = new k();
        kVar2.addAll(list2);
        this.f10254c = kVar2;
        if (i10 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive integer");
        }
        if (g() <= i10) {
            return;
        }
        throw new IllegalArgumentException(("Initial list of undo and redo operations have a size=(" + g() + ") greater than the given capacity=(" + i10 + ").").toString());
    }

    public final void d() {
        this.f10253b.clear();
        this.f10254c.clear();
    }

    public final boolean e() {
        return !this.f10254c.isEmpty();
    }

    public final boolean f() {
        return !this.f10253b.isEmpty();
    }

    public final int g() {
        return this.f10253b.size() + this.f10254c.size();
    }

    public final void h(Object obj) {
        this.f10254c.clear();
        while (g() > this.f10252a - 1) {
            AbstractC3689v.L(this.f10253b);
        }
        this.f10253b.add(obj);
    }

    public final Object i() {
        if (!e()) {
            throw new IllegalStateException("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
        }
        Object objN = AbstractC3689v.N(this.f10254c);
        this.f10253b.add(objN);
        return objN;
    }

    public final Object j() {
        if (!f()) {
            throw new IllegalStateException("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
        }
        Object objN = AbstractC3689v.N(this.f10253b);
        this.f10254c.add(objN);
        return objN;
    }

    public /* synthetic */ f(List list, List list2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? AbstractC3689v.l() : list, (i11 & 2) != 0 ? AbstractC3689v.l() : list2, (i11 & 4) != 0 ? 100 : i10);
    }
}
