package androidx.compose.runtime.snapshots;

import Yg.J;
import Zg.AbstractC3689v;
import d0.AbstractC5277i;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class a extends androidx.compose.runtime.snapshots.b {

    /* renamed from: androidx.compose.runtime.snapshots.a$a, reason: collision with other inner class name */
    static final class C1061a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f28609a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1061a(List list) {
            super(1);
            this.f28609a = list;
        }

        public final void a(Object obj) {
            List list = this.f28609a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((InterfaceC6835l) list.get(i10)).invoke(obj);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f28610a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f28611b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
            super(1);
            this.f28610a = interfaceC6835l;
            this.f28611b = interfaceC6835l2;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.snapshots.b invoke(i iVar) {
            int i10;
            synchronized (j.I()) {
                i10 = j.f28656e;
                j.f28656e = i10 + 1;
            }
            return new androidx.compose.runtime.snapshots.b(i10, iVar, this.f28610a, this.f28611b);
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f28612a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f28612a = interfaceC6835l;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f invoke(i iVar) {
            int i10;
            synchronized (j.I()) {
                i10 = j.f28656e;
                j.f28656e = i10 + 1;
            }
            return new f(i10, iVar, this.f28612a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i10, i iVar) {
        InterfaceC6835l c1061a;
        synchronized (j.I()) {
            List list = j.f28660i;
            c1061a = (InterfaceC6835l) AbstractC3689v.T0(list);
            c1061a = c1061a == null ? new C1061a(list) : c1061a;
        }
        super(i10, iVar, null, c1061a);
    }

    @Override // androidx.compose.runtime.snapshots.b
    public h C() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // androidx.compose.runtime.snapshots.b
    public androidx.compose.runtime.snapshots.b Q(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        return (androidx.compose.runtime.snapshots.b) j.b0(new b(interfaceC6835l, interfaceC6835l2));
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Void m(g gVar) {
        AbstractC5277i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public Void n(g gVar) {
        AbstractC5277i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void d() {
        synchronized (j.I()) {
            q();
            J j10 = J.f24997a;
        }
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void o() {
        j.B();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public g x(InterfaceC6835l interfaceC6835l) {
        return j.b0(new c(interfaceC6835l));
    }
}
