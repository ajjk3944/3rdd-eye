package M8;

import Bf.c;
import M8.K;
import S8.e;
import Zg.AbstractC3689v;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import le.C6585f;
import le.C6588i;
import mh.InterfaceC6835l;
import sh.C7974i;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* loaded from: classes3.dex */
public interface K {

    public static final class a {
        public static ic.e d(K k10, S8.c cVar) {
            int i10 = cVar == null ? -1 : b.f12847b[cVar.ordinal()];
            if (i10 == -1) {
                return ic.e.ALL;
            }
            if (i10 == 1) {
                return ic.e.GHZ_2;
            }
            if (i10 == 2) {
                return ic.e.GHZ_5;
            }
            if (i10 == 3) {
                return ic.e.GHZ_6;
            }
            throw new NoWhenBranchMatchedException();
        }

        public static S8.c e(K k10, ic.e receiver) {
            AbstractC6492s.i(receiver, "$receiver");
            int i10 = b.f12846a[receiver.ordinal()];
            if (i10 == 1) {
                return null;
            }
            if (i10 == 2) {
                return S8.c.GHZ_2_4;
            }
            if (i10 == 3) {
                return S8.c.GHZ_5;
            }
            if (i10 == 4) {
                return S8.c.GHZ_6;
            }
            throw new NoWhenBranchMatchedException();
        }

        public static Bf.b f(K k10, final S8.c band, InterfaceC8780j signals, final InterfaceC6835l interfaceC6835l) {
            AbstractC6492s.i(band, "band");
            AbstractC6492s.i(signals, "signals");
            return new Bf.b(band, AbstractC8783m.Z(AbstractC8783m.O(AbstractC8783m.C(signals, new InterfaceC6835l() { // from class: M8.I
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(K.a.g(band, (C6588i) obj));
                }
            }), new InterfaceC6835l() { // from class: M8.J
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return K.a.h(band, interfaceC6835l, (C6588i) obj);
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean g(S8.c cVar, C6588i it) {
            AbstractC6492s.i(it, "it");
            return it.f().a() == cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Bf.c h(S8.c cVar, InterfaceC6835l interfaceC6835l, C6588i signal) {
            List listO;
            AbstractC6492s.i(signal, "signal");
            Boolean bool = null;
            C6588i c6588i = signal.f().a() == cVar ? signal : null;
            if (c6588i == null) {
                return null;
            }
            String strK = c6588i.k();
            long jO = r.o(signal);
            Float fValueOf = signal.q() != null ? Float.valueOf(r10.b()) : null;
            if (interfaceC6835l != null) {
                bool = (Boolean) interfaceC6835l.invoke(signal);
                bool.booleanValue();
            }
            Boolean bool2 = bool;
            e.b bVarE = signal.f().e();
            if (bVarE instanceof e.b.C0729b) {
                listO = AbstractC3689v.e(new c.a(signal.f().e().a(), signal.f().b().getWidth()));
            } else {
                if (!(bVarE instanceof e.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (signal.f().a() == S8.c.GHZ_2_4 && signal.f().b() == S8.d.MHZ_40) {
                    float width = signal.f().b().getWidth();
                    Iterator it = signal.f().e().b().iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    int i10 = ((C7974i) it.next()).i();
                    while (it.hasNext()) {
                        int i11 = ((C7974i) it.next()).i();
                        if (i10 > i11) {
                            i10 = i11;
                        }
                    }
                    listO = AbstractC3689v.e(new c.a(i10 + 20, width));
                } else {
                    AbstractC6492s.g(signal.f().e(), "null cannot be cast to non-null type com.ubnt.usurvey.wifi.WifiChannel.FrequencyRange.Combined");
                    AbstractC6492s.g(signal.f().e(), "null cannot be cast to non-null type com.ubnt.usurvey.wifi.WifiChannel.FrequencyRange.Combined");
                    listO = AbstractC3689v.o(new c.a(((e.b.a) r0).d(), signal.f().b().getWidth() / 4.0f), new c.a(((e.b.a) r11).e(), signal.f().b().getWidth() / 4.0f));
                }
            }
            return new Bf.c(strK, listO, fValueOf, jO, bool2, null);
        }

        public static Bf.b i(K k10, S8.c band, InterfaceC8780j networks, InterfaceC6835l interfaceC6835l) {
            AbstractC6492s.i(band, "band");
            AbstractC6492s.i(networks, "networks");
            return k10.J(band, AbstractC8783m.I(networks, new InterfaceC6835l() { // from class: M8.H
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return K.a.k((C6585f) obj);
                }
            }), interfaceC6835l);
        }

        public static /* synthetic */ Bf.b j(K k10, S8.c cVar, InterfaceC8780j interfaceC8780j, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChartModelByNetworks");
            }
            if ((i10 & 4) != 0) {
                interfaceC6835l = null;
            }
            return k10.q(cVar, interfaceC8780j, interfaceC6835l);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Iterable k(C6585f it) {
            AbstractC6492s.i(it, "it");
            return it.a();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12846a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f12847b;

        static {
            int[] iArr = new int[ic.e.values().length];
            try {
                iArr[ic.e.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ic.e.GHZ_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ic.e.GHZ_5.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ic.e.GHZ_6.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f12846a = iArr;
            int[] iArr2 = new int[S8.c.values().length];
            try {
                iArr2[S8.c.GHZ_2_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[S8.c.GHZ_5.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[S8.c.GHZ_6.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f12847b = iArr2;
        }
    }

    Bf.b J(S8.c cVar, InterfaceC8780j interfaceC8780j, InterfaceC6835l interfaceC6835l);

    Bf.b q(S8.c cVar, InterfaceC8780j interfaceC8780j, InterfaceC6835l interfaceC6835l);
}
