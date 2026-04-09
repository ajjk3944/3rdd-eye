package od;

import Zg.AbstractC3689v;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;

/* renamed from: od.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7121c implements InterfaceC7120b {

    /* renamed from: a, reason: collision with root package name */
    private final Wb.a f55615a;

    /* renamed from: b, reason: collision with root package name */
    private final gg.i f55616b;

    /* renamed from: od.c$a */
    public static final class a implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f55618b;

        public a(long j10) {
            this.f55618b = j10;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                C7121c.this.f55615a.a(this.f55618b);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    /* renamed from: od.c$b */
    static final class b implements n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(List it) {
            AbstractC6492s.i(it, "it");
            Wb.d dVar = (Wb.d) AbstractC3689v.s0(it);
            return new C6556a(dVar != null ? C7121c.this.i(dVar) : null);
        }
    }

    /* renamed from: od.c$c, reason: collision with other inner class name */
    static final class C2012c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2012c f55620a = new C2012c();

        C2012c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(List it) {
            AbstractC6492s.i(it, "it");
            Wb.c cVar = (Wb.c) AbstractC3689v.s0(it);
            return new C6556a(cVar != null ? cVar.a() : null);
        }
    }

    /* renamed from: od.c$d */
    static final class d implements n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List records) {
            AbstractC6492s.i(records, "records");
            List list = records;
            C7121c c7121c = C7121c.this;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c7121c.i((Wb.d) it.next()));
            }
            return arrayList;
        }
    }

    /* renamed from: od.c$e */
    public static final class e implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f55622a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f55623b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f55624c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C7121c f55625d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f55626e;

        public e(String str, String str2, long j10, C7121c c7121c, String str3) {
            this.f55622a = str;
            this.f55623b = str2;
            this.f55624c = j10;
            this.f55625d = c7121c;
            this.f55626e = str3;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                Wb.d dVar = new Wb.d(0L, this.f55622a, this.f55623b, this.f55624c, 1, null);
                interfaceC5910A.onSuccess(this.f55625d.i(Wb.d.b(dVar, this.f55625d.f55615a.f(dVar, this.f55626e), null, null, 0L, 14, null)));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    /* renamed from: od.c$f */
    public static final class f implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f55628b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f55629c;

        public f(long j10, String str) {
            this.f55628b = j10;
            this.f55629c = str;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                C7121c.this.f55615a.b(this.f55628b, this.f55629c);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public C7121c(Wb.a floorplanDao) {
        AbstractC6492s.i(floorplanDao, "floorplanDao");
        this.f55615a = floorplanDao;
        gg.i iVarX0 = floorplanDao.k().N0(new d()).W().F1(Gg.a.d()).X0(Gg.a.a());
        AbstractC6492s.h(iVarX0, "observeOn(...)");
        this.f55616b = iVarX0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7119a i(Wb.d dVar) {
        return new C7119a(dVar.c(), dVar.d(), dVar.e(), dVar.f());
    }

    @Override // od.InterfaceC7120b
    public AbstractC5912b a(long j10) {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(j10));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bL = abstractC5912bR.W(Gg.a.d()).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }

    @Override // od.InterfaceC7120b
    public AbstractC5912b b(long j10, String str) {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new f(j10, str));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bL = abstractC5912bR.W(Gg.a.d()).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }

    @Override // od.InterfaceC7120b
    public gg.i c() {
        return this.f55616b;
    }

    @Override // od.InterfaceC7120b
    public z d(String str, String str2, long j10, String gpx) {
        AbstractC6492s.i(gpx, "gpx");
        z zVarI = z.i(new e(str2, str, j10, this, gpx));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarE = zVarI.O(Gg.a.d()).E(Gg.a.a());
        AbstractC6492s.h(zVarE, "observeOn(...)");
        return zVarE;
    }

    @Override // od.InterfaceC7120b
    public gg.i e(long j10) {
        gg.i iVarX0 = this.f55615a.d(j10).N0(new b()).W().F1(Gg.a.d()).X0(Gg.a.a());
        AbstractC6492s.h(iVarX0, "observeOn(...)");
        return iVarX0;
    }

    @Override // od.InterfaceC7120b
    public gg.i f(long j10) {
        gg.i iVarX0 = this.f55615a.i(j10).N0(C2012c.f55620a).F1(Gg.a.d()).X0(Gg.a.a());
        AbstractC6492s.h(iVarX0, "observeOn(...)");
        return iVarX0;
    }
}
