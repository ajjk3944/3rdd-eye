package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.CombineKt;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class FlowKt__ZipKt {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f22408a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f22409b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l9.q f22410c;

        public a(b bVar, b bVar2, l9.q qVar) {
            this.f22408a = bVar;
            this.f22409b = bVar2;
            this.f22410c = qVar;
        }

        @Override // kotlinx.coroutines.flow.b
        public Object collect(c cVar, c9.c cVar2) {
            Object objA = CombineKt.a(cVar, new b[]{this.f22408a, this.f22409b}, FlowKt__ZipKt.c(), new FlowKt__ZipKt$combine$1$1(this.f22410c, null), cVar2);
            return objA == kotlin.coroutines.intrinsics.a.f() ? objA : y8.s.f25199a;
        }
    }

    public static final b b(b bVar, b bVar2, l9.q qVar) {
        return new a(bVar, bVar2, qVar);
    }

    public static final l9.a c() {
        return new l9.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
            @Override // l9.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Void invoke() {
                return null;
            }
        };
    }
}
