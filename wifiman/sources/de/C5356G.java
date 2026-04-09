package de;

import Tb.a;
import com.ui.wifiman.db.RoomPersistentInstance;
import ic.EnumC6141b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: de.G, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5356G extends RoomPersistentInstance implements InterfaceC5355F {

    /* renamed from: de.G$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46029a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46030b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f46031c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f46032d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f46033e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f46034f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f46035g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f46036h;

        static {
            int[] iArr = new int[a.e.values().length];
            try {
                iArr[a.e.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.e.GHZ_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.e.GHZ_5.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.e.GHZ_6.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f46029a = iArr;
            int[] iArr2 = new int[ic.e.values().length];
            try {
                iArr2[ic.e.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ic.e.GHZ_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ic.e.GHZ_5.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ic.e.GHZ_6.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f46030b = iArr2;
            int[] iArr3 = new int[a.b.values().length];
            try {
                iArr3[a.b.NETWORKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[a.b.CHANNEL_HEALTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f46031c = iArr3;
            int[] iArr4 = new int[EnumC6141b.values().length];
            try {
                iArr4[EnumC6141b.NETWORKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[EnumC6141b.CHANNEL_HEALTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            f46032d = iArr4;
            int[] iArr5 = new int[a.d.values().length];
            try {
                iArr5[a.d.SSID.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[a.d.SIGNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            f46033e = iArr5;
            int[] iArr6 = new int[ic.d.values().length];
            try {
                iArr6[ic.d.SSID.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr6[ic.d.SIGNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            f46034f = iArr6;
            int[] iArr7 = new int[a.c.values().length];
            try {
                iArr7[a.c.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr7[a.c.HEALTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            f46035g = iArr7;
            int[] iArr8 = new int[ic.c.values().length];
            try {
                iArr8[ic.c.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr8[ic.c.HEALTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            f46036h = iArr8;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5356G(Tb.b dao) {
        super(dao);
        AbstractC6492s.i(dao, "dao");
    }

    private final a.b h(EnumC6141b enumC6141b) {
        int i10 = a.f46032d[enumC6141b.ordinal()];
        if (i10 == 1) {
            return a.b.NETWORKS;
        }
        if (i10 == 2) {
            return a.b.CHANNEL_HEALTH;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final a.c i(ic.c cVar) {
        int i10 = a.f46036h[cVar.ordinal()];
        if (i10 == 1) {
            return a.c.NUMBER;
        }
        if (i10 == 2) {
            return a.c.HEALTH;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final a.d j(ic.d dVar) {
        int i10 = a.f46034f[dVar.ordinal()];
        if (i10 == 1) {
            return a.d.SSID;
        }
        if (i10 == 2) {
            return a.d.SIGNAL;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final a.e k(ic.e eVar) {
        int i10 = a.f46030b[eVar.ordinal()];
        if (i10 == 1) {
            return a.e.ALL;
        }
        if (i10 == 2) {
            return a.e.GHZ_2;
        }
        if (i10 == 3) {
            return a.e.GHZ_5;
        }
        if (i10 == 4) {
            return a.e.GHZ_6;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final EnumC6141b l(a.b bVar) {
        int i10 = a.f46031c[bVar.ordinal()];
        if (i10 == 1) {
            return EnumC6141b.NETWORKS;
        }
        if (i10 == 2) {
            return EnumC6141b.CHANNEL_HEALTH;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final ic.c m(a.c cVar) {
        int i10 = a.f46035g[cVar.ordinal()];
        if (i10 == 1) {
            return ic.c.NUMBER;
        }
        if (i10 == 2) {
            return ic.c.HEALTH;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final ic.d n(a.d dVar) {
        int i10 = a.f46033e[dVar.ordinal()];
        if (i10 == 1) {
            return ic.d.SSID;
        }
        if (i10 == 2) {
            return ic.d.SIGNAL;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final ic.e o(a.e eVar) {
        int i10 = a.f46029a[eVar.ordinal()];
        if (i10 == 1) {
            return ic.e.ALL;
        }
        if (i10 == 2) {
            return ic.e.GHZ_2;
        }
        if (i10 == 3) {
            return ic.e.GHZ_5;
        }
        if (i10 == 4) {
            return ic.e.GHZ_6;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C5354E e(Tb.a persistent) {
        AbstractC6492s.i(persistent, "persistent");
        return new C5354E(o(persistent.h()), n(persistent.f()), m(persistent.d()), l(persistent.b()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public C5354E f() {
        return new C5354E(null, null, null, null, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Tb.a g(C5354E instance) {
        AbstractC6492s.i(instance, "instance");
        return new Tb.a(k(instance.c()), h(instance.d()), j(instance.f()), i(instance.e()));
    }
}
