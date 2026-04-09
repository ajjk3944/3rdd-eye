package Dd;

import com.ui.wifiman.db.RoomPersistentInstance;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class c extends RoomPersistentInstance implements b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Zb.a dao) {
        super(dao);
        AbstractC6492s.i(dao, "dao");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public a e(Zb.c persistent) {
        AbstractC6492s.i(persistent, "persistent");
        return new a(persistent.c(), persistent.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public a f() {
        return new a(true, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Zb.c g(a instance) {
        AbstractC6492s.i(instance, "instance");
        return new Zb.c(0, instance.d(), instance.c(), 1, null);
    }
}
