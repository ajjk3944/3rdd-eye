package E6;

import E6.c;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6839p;
import y6.AbstractC8616e;

/* loaded from: classes3.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4034a = a.f4035a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f4035a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final c f4036b = new c() { // from class: E6.a
            @Override // E6.c
            public final boolean a(x6.b bVar, x6.b bVar2) {
                return c.a.c(bVar, bVar2);
            }
        };

        /* renamed from: c, reason: collision with root package name */
        private static final c f4037c = new c() { // from class: E6.b
            @Override // E6.c
            public final boolean a(x6.b bVar, x6.b bVar2) {
                return c.a.d(bVar, bVar2);
            }
        };

        /* renamed from: E6.c$a$a, reason: collision with other inner class name */
        static final class C0173a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            public static final C0173a f4038a = new C0173a();

            C0173a() {
                super(2);
            }

            public final Boolean a(int i10, int i11) {
                return Boolean.valueOf(i10 > i11);
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a(((Number) obj).intValue(), ((Number) obj2).intValue());
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean c(x6.b bVar, x6.b bVar2) {
            AbstractC6492s.i(bVar, "<anonymous parameter 0>");
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(x6.b n10, x6.b bVar) {
            Integer numValueOf;
            AbstractC6492s.i(n10, "n");
            if (bVar == null) {
                return false;
            }
            List listF = n10.f();
            List listF2 = bVar.f();
            if (listF.size() <= listF2.size()) {
                Iterator it = listF.iterator();
                Integer num = null;
                if (it.hasNext()) {
                    numValueOf = Integer.valueOf(((List) it.next()).size());
                    while (it.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(((List) it.next()).size());
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                } else {
                    numValueOf = null;
                }
                Iterator it2 = listF2.iterator();
                if (it2.hasNext()) {
                    Integer numValueOf3 = Integer.valueOf(((List) it2.next()).size());
                    loop0: while (true) {
                        num = numValueOf3;
                        while (it2.hasNext()) {
                            numValueOf3 = Integer.valueOf(((List) it2.next()).size());
                            if (num.compareTo(numValueOf3) < 0) {
                                break;
                            }
                        }
                    }
                }
                if (!AbstractC6492s.d(AbstractC8616e.a(numValueOf, num, C0173a.f4038a), Boolean.TRUE)) {
                    return false;
                }
            }
            return true;
        }

        public final c e() {
            return f4036b;
        }
    }

    boolean a(x6.b bVar, x6.b bVar2);
}
