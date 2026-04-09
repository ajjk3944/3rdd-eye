package de;

import Sb.a;
import com.ui.wifiman.db.RoomPersistentInstance;
import ic.EnumC6140a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: de.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5353D extends RoomPersistentInstance implements InterfaceC5352C {

    /* renamed from: de.D$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46023a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46024b;

        static {
            int[] iArr = new int[EnumC6140a.values().length];
            try {
                iArr[EnumC6140a.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6140a.SIGNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46023a = iArr;
            int[] iArr2 = new int[a.b.values().length];
            try {
                iArr2[a.b.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[a.b.SIGNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f46024b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5353D(Sb.b dao) {
        super(dao);
        AbstractC6492s.i(dao, "dao");
    }

    private final a.b h(EnumC6140a enumC6140a) {
        int i10 = a.f46023a[enumC6140a.ordinal()];
        if (i10 == 1) {
            return a.b.NAME;
        }
        if (i10 == 2) {
            return a.b.SIGNAL;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final EnumC6140a i(a.b bVar) {
        int i10 = a.f46024b[bVar.ordinal()];
        if (i10 == 1) {
            return EnumC6140a.NAME;
        }
        if (i10 == 2) {
            return EnumC6140a.SIGNAL;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C5351B e(Sb.a persistent) {
        AbstractC6492s.i(persistent, "persistent");
        return new C5351B(i(persistent.b()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C5351B f() {
        return new C5351B(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Sb.a g(C5351B instance) {
        AbstractC6492s.i(instance, "instance");
        return new Sb.a(h(instance.b()));
    }
}
