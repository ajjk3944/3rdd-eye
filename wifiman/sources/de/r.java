package de;

import Pb.g;
import com.ui.wifiman.db.RoomPersistentInstance;
import fc.EnumC5804a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class r extends RoomPersistentInstance implements q {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46050a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46051b;

        static {
            int[] iArr = new int[g.b.values().length];
            try {
                iArr[g.b.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.b.MAC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.b.SIGNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f46050a = iArr;
            int[] iArr2 = new int[EnumC5804a.values().length];
            try {
                iArr2[EnumC5804a.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC5804a.MAC.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC5804a.SIGNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f46051b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Pb.a dao) {
        super(dao);
        AbstractC6492s.i(dao, "dao");
    }

    private final g.b h(EnumC5804a enumC5804a) {
        int i10 = a.f46051b[enumC5804a.ordinal()];
        if (i10 == 1) {
            return g.b.NAME;
        }
        if (i10 == 2) {
            return g.b.MAC;
        }
        if (i10 == 3) {
            return g.b.SIGNAL;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final EnumC5804a i(g.b bVar) {
        int i10 = a.f46050a[bVar.ordinal()];
        if (i10 == 1) {
            return EnumC5804a.NAME;
        }
        if (i10 == 2) {
            return EnumC5804a.MAC;
        }
        if (i10 == 3) {
            return EnumC5804a.SIGNAL;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public p e(Pb.g persistent) {
        AbstractC6492s.i(persistent, "persistent");
        return new p(i(persistent.c()), persistent.e(), persistent.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public p f() {
        return new p(null, false, false, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Pb.g g(p instance) {
        AbstractC6492s.i(instance, "instance");
        return new Pb.g(instance.c(), instance.e(), h(instance.d()));
    }
}
