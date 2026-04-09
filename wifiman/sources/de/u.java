package de;

import Pb.h;
import com.ui.wifiman.db.RoomPersistentInstance;
import fc.EnumC5806c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class u extends RoomPersistentInstance implements t {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46053a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46054b;

        static {
            int[] iArr = new int[h.b.values().length];
            try {
                iArr[h.b.LAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.b.BLUETOOTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46053a = iArr;
            int[] iArr2 = new int[EnumC5806c.values().length];
            try {
                iArr2[EnumC5806c.LAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC5806c.BLUETOOTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f46054b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Pb.c dao) {
        super(dao);
        AbstractC6492s.i(dao, "dao");
    }

    private final h.b h(EnumC5806c enumC5806c) {
        int i10 = a.f46054b[enumC5806c.ordinal()];
        if (i10 == 1) {
            return h.b.LAN;
        }
        if (i10 == 2) {
            return h.b.BLUETOOTH;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final EnumC5806c i(h.b bVar) {
        int i10 = a.f46053a[bVar.ordinal()];
        if (i10 == 1) {
            return EnumC5806c.LAN;
        }
        if (i10 == 2) {
            return EnumC5806c.BLUETOOTH;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public s e(Pb.h persistent) {
        AbstractC6492s.i(persistent, "persistent");
        return new s(i(persistent.b()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public s f() {
        return new s(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Pb.h g(s instance) {
        AbstractC6492s.i(instance, "instance");
        return new Pb.h(h(instance.b()));
    }
}
