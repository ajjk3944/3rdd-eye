package X1;

import D9.InterfaceC0644f;
import D9.InterfaceC0645g;
import X1.b;
import b9.C1992A;
import b9.n;
import f9.InterfaceC4347e;
import h9.i;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;
import p9.q;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes.dex */
public final class f implements InterfaceC0644f<X1.b> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0644f[] f13546b;

    /* compiled from: Zip.kt */
    public static final class a extends m implements InterfaceC5480a<X1.b[]> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0644f[] f13547g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0644f[] interfaceC0644fArr) {
            super(0);
            this.f13547g = interfaceC0644fArr;
        }

        @Override // p9.InterfaceC5480a
        public final X1.b[] invoke() {
            return new X1.b[this.f13547g.length];
        }
    }

    /* compiled from: Zip.kt */
    @h9.e(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {292}, m = "invokeSuspend")
    public static final class b extends i implements q<InterfaceC0645g<? super X1.b>, X1.b[], InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f13548l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ InterfaceC0645g f13549m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object[] f13550n;

        @Override // p9.q
        public final Object invoke(InterfaceC0645g<? super X1.b> interfaceC0645g, X1.b[] bVarArr, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            b bVar = new b(3, interfaceC4347e);
            bVar.f13549m = interfaceC0645g;
            bVar.f13550n = bVarArr;
            return bVar.invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            X1.b bVar;
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f13548l;
            if (i == 0) {
                n.b(obj);
                InterfaceC0645g interfaceC0645g = this.f13549m;
                X1.b[] bVarArr = (X1.b[]) this.f13550n;
                int length = bVarArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = bVarArr[i10];
                    if (!l.b(bVar, b.a.f13538a)) {
                        break;
                    }
                    i10++;
                }
                if (bVar == null) {
                    bVar = b.a.f13538a;
                }
                this.f13548l = 1;
                if (interfaceC0645g.emit(bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            }
            return C1992A.f18074a;
        }
    }

    public f(InterfaceC0644f[] interfaceC0644fArr) {
        this.f13546b = interfaceC0644fArr;
    }

    @Override // D9.InterfaceC0644f
    public final Object b(InterfaceC0645g<? super X1.b> interfaceC0645g, InterfaceC4347e interfaceC4347e) {
        InterfaceC0644f[] interfaceC0644fArr = this.f13546b;
        Object objA = E9.i.a(interfaceC0645g, interfaceC4347e, new a(interfaceC0644fArr), new b(3, null), interfaceC0644fArr);
        return objA == g9.a.COROUTINE_SUSPENDED ? objA : C1992A.f18074a;
    }
}
