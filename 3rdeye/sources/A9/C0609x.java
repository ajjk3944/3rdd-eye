package A9;

import f9.C4351i;
import f9.InterfaceC4347e;
import f9.InterfaceC4348f;
import f9.InterfaceC4350h;

/* compiled from: CoroutineContext.kt */
/* renamed from: A9.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0609x {

    /* compiled from: CoroutineContext.kt */
    /* renamed from: A9.x$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.p<InterfaceC4350h, InterfaceC4350h.a, InterfaceC4350h> {

        /* renamed from: g, reason: collision with root package name */
        public static final a f295g = new a(2);

        @Override // p9.p
        public final InterfaceC4350h invoke(InterfaceC4350h interfaceC4350h, InterfaceC4350h.a aVar) {
            InterfaceC4350h interfaceC4350h2 = interfaceC4350h;
            InterfaceC4350h.a aVar2 = aVar;
            return aVar2 instanceof InterfaceC0608w ? interfaceC4350h2.plus(((InterfaceC0608w) aVar2).m0()) : interfaceC4350h2.plus(aVar2);
        }
    }

    /* compiled from: CoroutineContext.kt */
    /* renamed from: A9.x$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.p<InterfaceC4350h, InterfaceC4350h.a, InterfaceC4350h> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.w<InterfaceC4350h> f296g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f297h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.jvm.internal.w<InterfaceC4350h> wVar, boolean z10) {
            super(2);
            this.f296g = wVar;
            this.f297h = z10;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [T, f9.h] */
        @Override // p9.p
        public final InterfaceC4350h invoke(InterfaceC4350h interfaceC4350h, InterfaceC4350h.a aVar) {
            InterfaceC4350h interfaceC4350h2 = interfaceC4350h;
            InterfaceC4350h.a aVar2 = aVar;
            if (!(aVar2 instanceof InterfaceC0608w)) {
                return interfaceC4350h2.plus(aVar2);
            }
            kotlin.jvm.internal.w<InterfaceC4350h> wVar = this.f296g;
            if (wVar.f43660b.get(aVar2.getKey()) != null) {
                wVar.f43660b = wVar.f43660b.minusKey(aVar2.getKey());
                return interfaceC4350h2.plus(((InterfaceC0608w) aVar2).C0());
            }
            InterfaceC0608w interfaceC0608wM0 = (InterfaceC0608w) aVar2;
            if (this.f297h) {
                interfaceC0608wM0 = interfaceC0608wM0.m0();
            }
            return interfaceC4350h2.plus(interfaceC0608wM0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final InterfaceC4350h a(InterfaceC4350h interfaceC4350h, InterfaceC4350h interfaceC4350h2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        C0610y c0610y = C0610y.f299g;
        boolean zBooleanValue = ((Boolean) interfaceC4350h.fold(bool, c0610y)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC4350h2.fold(bool, c0610y)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC4350h.plus(interfaceC4350h2);
        }
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        wVar.f43660b = interfaceC4350h2;
        C4351i c4351i = C4351i.f37871b;
        InterfaceC4350h interfaceC4350h3 = (InterfaceC4350h) interfaceC4350h.fold(c4351i, new b(wVar, z10));
        if (zBooleanValue2) {
            wVar.f43660b = ((InterfaceC4350h) wVar.f43660b).fold(c4351i, a.f295g);
        }
        return interfaceC4350h3.plus((InterfaceC4350h) wVar.f43660b);
    }

    public static final InterfaceC4350h b(E e4, InterfaceC4350h interfaceC4350h) {
        InterfaceC4350h interfaceC4350hA = a(e4.k0(), interfaceC4350h, true);
        I9.c cVar = U.f211a;
        return (interfaceC4350hA == cVar || interfaceC4350hA.get(InterfaceC4348f.a.f37870b) != null) ? interfaceC4350hA : interfaceC4350hA.plus(cVar);
    }

    public static final S0<?> c(InterfaceC4347e<?> interfaceC4347e, InterfaceC4350h interfaceC4350h, Object obj) {
        S0<?> s02 = null;
        if ((interfaceC4347e instanceof h9.d) && interfaceC4350h.get(T0.f210b) != null) {
            h9.d callerFrame = (h9.d) interfaceC4347e;
            while (true) {
                if ((callerFrame instanceof Q) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof S0) {
                    s02 = (S0) callerFrame;
                    break;
                }
            }
            if (s02 != null) {
                s02.g0(interfaceC4350h, obj);
            }
        }
        return s02;
    }
}
