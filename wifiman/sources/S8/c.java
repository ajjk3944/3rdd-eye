package S8;

import Kb.a;
import S8.e;
import Yg.m;
import Yg.n;
import Zg.U;
import Zg.d0;
import com.ubnt.usurvey.wifi.WifiChannelUtils;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ InterfaceC5826a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c GHZ_2_4;
    public static final c GHZ_5;
    public static final c GHZ_6;
    private final m channels$delegate = n.b(new b());
    private final m channelsMap$delegate = n.b(new C0728c());
    private final Set<d> supportedBandwidths;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final c f20358a;

        /* renamed from: b, reason: collision with root package name */
        private final int f20359b;

        /* renamed from: c, reason: collision with root package name */
        private final d f20360c;

        public a(c band, int i10, d bandwidth) {
            AbstractC6492s.i(band, "band");
            AbstractC6492s.i(bandwidth, "bandwidth");
            this.f20358a = band;
            this.f20359b = i10;
            this.f20360c = bandwidth;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f20358a == aVar.f20358a && this.f20359b == aVar.f20359b && this.f20360c == aVar.f20360c;
        }

        public int hashCode() {
            return (((this.f20358a.hashCode() * 31) + Integer.hashCode(this.f20359b)) * 31) + this.f20360c.hashCode();
        }

        public String toString() {
            return "ChannelId(band=" + this.f20358a + ", channel=" + this.f20359b + ", bandwidth=" + this.f20360c + ")";
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f20362a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.GHZ_2_4.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.GHZ_5.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.GHZ_6.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f20362a = iArr;
            }
        }

        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            int i10 = a.f20362a[c.this.ordinal()];
            if (i10 == 1) {
                return c.this.getChannelList(c.GHZ_2_4, a.C0424a.f10592e.a());
            }
            if (i10 == 2) {
                return c.this.getChannelList(c.GHZ_5, a.C0424a.f10592e.b());
            }
            if (i10 == 3) {
                return c.this.getChannelList(c.GHZ_6, a.C0424a.f10592e.c());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: S8.c$c, reason: collision with other inner class name */
    static final class C0728c extends AbstractC6494u implements InterfaceC6824a {
        C0728c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            c cVar = c.this;
            Map mapC = U.c();
            for (e eVar : cVar.getChannels()) {
                mapC.put(new a(eVar.a(), eVar.d(), eVar.b()), eVar);
            }
            return U.b(mapC);
        }
    }

    private static final /* synthetic */ c[] $values() {
        return new c[]{GHZ_2_4, GHZ_5, GHZ_6};
    }

    static {
        d dVar = d.MHZ_20;
        d dVar2 = d.MHZ_40;
        GHZ_2_4 = new c("GHZ_2_4", 0, d0.i(dVar, dVar2));
        d dVar3 = d.MHZ_80;
        d dVar4 = d.MHZ_160;
        GHZ_5 = new c("GHZ_5", 1, d0.i(dVar, dVar2, dVar3, dVar4));
        GHZ_6 = new c("GHZ_6", 2, d0.i(dVar, dVar2, dVar3, dVar4, d.MHZ_320));
        c[] cVarArr$values = $values();
        $VALUES = cVarArr$values;
        $ENTRIES = AbstractC5827b.a(cVarArr$values);
    }

    private c(String str, int i10, Set set) {
        this.supportedBandwidths = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<e> getChannelList(c cVar, Set<a.C0424a> set) {
        e.b c0729b;
        Set setB = d0.b();
        for (a.C0424a c0424a : set) {
            d dVarA = d.Companion.a(c0424a.d());
            AbstractC6492s.f(dVarA);
            int iF = c0424a.f();
            if (cVar == GHZ_2_4 && c0424a.d() == 40) {
                WifiChannelUtils wifiChannelUtils = WifiChannelUtils.f41035a;
                Integer numC = wifiChannelUtils.c(c0424a.e());
                AbstractC6492s.f(numC);
                int iIntValue = numC.intValue();
                Integer numB = wifiChannelUtils.b(c0424a.f(), cVar);
                AbstractC6492s.f(numB);
                c0729b = new e.b.a(dVarA, numB.intValue(), iIntValue > c0424a.f() ? c0424a.e() + 10 : c0424a.e() - 10);
            } else {
                c0729b = new e.b.C0729b(dVarA, c0424a.e());
            }
            setB.add(new e(cVar, iF, c0729b, dVarA));
        }
        return d0.a(setB);
    }

    private final Map<a, e> getChannelsMap() {
        return (Map) this.channelsMap$delegate.getValue();
    }

    public static InterfaceC5826a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final e getChannel(int i10, d bandwidth) {
        AbstractC6492s.i(bandwidth, "bandwidth");
        return getChannelsMap().get(new a(this, i10, bandwidth));
    }

    public final Set<e> getChannels() {
        return (Set) this.channels$delegate.getValue();
    }

    public final Set<d> getSupportedBandwidths() {
        return this.supportedBandwidths;
    }
}
