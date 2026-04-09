package Yb;

import Zg.AbstractC3689v;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.f;
import gg.i;
import java.util.Arrays;
import java.util.List;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;

/* loaded from: classes3.dex */
public abstract class c {

    public static final class a implements InterfaceC5915e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Yb.b f24844a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Yb.a[] f24845b;

        public a(Yb.b bVar, Yb.a[] aVarArr) {
            this.f24844a = bVar;
            this.f24845b = aVarArr;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                Yb.b bVar = this.f24844a;
                Yb.a[] aVarArr = this.f24845b;
                bVar.b((Yb.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f24846a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(List it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(AbstractC3689v.s0(it));
        }
    }

    /* renamed from: Yb.c$c, reason: collision with other inner class name */
    public static final class C0946c implements InterfaceC5915e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Yb.a f24847a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Yb.b f24848b;

        public C0946c(Yb.a aVar, Yb.b bVar) {
            this.f24847a = aVar;
            this.f24848b = bVar;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                Yb.a aVar = this.f24847a;
                if (aVar != null) {
                    this.f24848b.a(aVar);
                }
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Yb.b f24849a;

        d(Yb.b bVar) {
            this.f24849a = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f apply(List results) {
            AbstractC6492s.i(results, "results");
            Yb.b bVar = this.f24849a;
            Yb.a[] aVarArr = (Yb.a[]) results.toArray(new Yb.a[0]);
            return c.a(bVar, (Yb.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        }
    }

    public static final AbstractC5912b a(Yb.b bVar, Yb.a... results) {
        AbstractC6492s.i(bVar, "<this>");
        AbstractC6492s.i(results, "results");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(bVar, results));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bL = abstractC5912bR.L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }

    public static final i b(Yb.b bVar) {
        AbstractC6492s.i(bVar, "<this>");
        i iVarX0 = bVar.c().N0(b.f24846a).W().X0(Gg.a.a());
        AbstractC6492s.h(iVarX0, "observeOn(...)");
        return iVarX0;
    }

    public static final AbstractC5912b c(Yb.b bVar, Yb.a aVar) {
        AbstractC6492s.i(bVar, "<this>");
        AbstractC5912b abstractC5912bT0 = bVar.c().O1(1L).t0(new d(bVar));
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C0946c(aVar, bVar));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bL = abstractC5912bT0.g(abstractC5912bR).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }
}
