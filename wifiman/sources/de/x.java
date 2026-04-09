package de;

import Pb.i;
import com.ui.wifiman.db.RoomPersistentInstance;
import fc.EnumC5805b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class x extends RoomPersistentInstance implements w {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46057a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46058b;

        static {
            int[] iArr = new int[i.b.values().length];
            try {
                iArr[i.b.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.b.IP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46057a = iArr;
            int[] iArr2 = new int[EnumC5805b.values().length];
            try {
                iArr2[EnumC5805b.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC5805b.IP.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f46058b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Pb.e dao) {
        super(dao);
        AbstractC6492s.i(dao, "dao");
    }

    private final i.b h(EnumC5805b enumC5805b) {
        int i10 = a.f46058b[enumC5805b.ordinal()];
        if (i10 == 1) {
            return i.b.NAME;
        }
        if (i10 == 2) {
            return i.b.IP;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final EnumC5805b i(i.b bVar) {
        int i10 = a.f46057a[bVar.ordinal()];
        if (i10 == 1) {
            return EnumC5805b.NAME;
        }
        if (i10 == 2) {
            return EnumC5805b.IP;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public v e(Pb.i persistent) {
        AbstractC6492s.i(persistent, "persistent");
        return new v(i(persistent.c()), persistent.e());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public v f() {
        return new v(null, false, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Pb.i g(v instance) {
        AbstractC6492s.i(instance, "instance");
        return new Pb.i(h(instance.c()), false, instance.d());
    }
}
