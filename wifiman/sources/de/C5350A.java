package de;

import Wb.e;
import com.ui.wifiman.db.RoomPersistentInstance;
import gc.EnumC5894a;
import gc.EnumC5895b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: de.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5350A extends RoomPersistentInstance implements z {

    /* renamed from: de.A$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46016a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46017b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f46018c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f46019d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f46020e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f46021f;

        static {
            int[] iArr = new int[e.d.values().length];
            try {
                iArr[e.d.SIGNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.d.FLOORPLAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46016a = iArr;
            int[] iArr2 = new int[EnumC5894a.values().length];
            try {
                iArr2[EnumC5894a.SIGNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC5894a.FLOORPLAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f46017b = iArr2;
            int[] iArr3 = new int[e.b.values().length];
            try {
                iArr3[e.b.SIGNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[e.b.THROUGHPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[e.b.LATENCY.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f46018c = iArr3;
            int[] iArr4 = new int[EnumC5895b.values().length];
            try {
                iArr4[EnumC5895b.SIGNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[EnumC5895b.THROUGHPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[EnumC5895b.LATENCY.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f46019d = iArr4;
            int[] iArr5 = new int[e.c.values().length];
            try {
                iArr5[e.c.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[e.c.CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            f46020e = iArr5;
            int[] iArr6 = new int[gc.c.values().length];
            try {
                iArr6[gc.c.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr6[gc.c.CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            f46021f = iArr6;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5350A(Wb.h dao) {
        super(dao);
        AbstractC6492s.i(dao, "dao");
    }

    private final e.b h(EnumC5895b enumC5895b) {
        int i10 = a.f46019d[enumC5895b.ordinal()];
        if (i10 == 1) {
            return e.b.SIGNAL;
        }
        if (i10 == 2) {
            return e.b.THROUGHPUT;
        }
        if (i10 == 3) {
            return e.b.LATENCY;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final e.c i(gc.c cVar) {
        int i10 = a.f46021f[cVar.ordinal()];
        if (i10 == 1) {
            return e.c.WIFI;
        }
        if (i10 == 2) {
            return e.c.CELLULAR;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final e.d j(EnumC5894a enumC5894a) {
        int i10 = a.f46017b[enumC5894a.ordinal()];
        if (i10 == 1) {
            return e.d.SIGNAL;
        }
        if (i10 == 2) {
            return e.d.FLOORPLAN;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final EnumC5894a k(e.d dVar) {
        int i10 = a.f46016a[dVar.ordinal()];
        if (i10 == 1) {
            return EnumC5894a.SIGNAL;
        }
        if (i10 == 2) {
            return EnumC5894a.FLOORPLAN;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final EnumC5895b l(e.b bVar) {
        int i10 = a.f46018c[bVar.ordinal()];
        if (i10 == 1) {
            return EnumC5895b.SIGNAL;
        }
        if (i10 == 2) {
            return EnumC5895b.THROUGHPUT;
        }
        if (i10 == 3) {
            return EnumC5895b.LATENCY;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final gc.c m(e.c cVar) {
        int i10 = a.f46020e[cVar.ordinal()];
        if (i10 == 1) {
            return gc.c.WIFI;
        }
        if (i10 == 2) {
            return gc.c.CELLULAR;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public y e(Wb.e persistent) {
        AbstractC6492s.i(persistent, "persistent");
        return new y(k(persistent.f()), l(persistent.b()), m(persistent.d()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public y f() {
        return new y(null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Wb.e g(y instance) {
        AbstractC6492s.i(instance, "instance");
        return new Wb.e(j(instance.d()), h(instance.c()), i(instance.e()));
    }
}
