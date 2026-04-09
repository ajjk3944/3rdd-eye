package de;

import bc.AbstractC4082a;
import bc.C4084c;
import com.ui.wifiman.db.RoomPersistentInstance;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: de.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5359c extends RoomPersistentInstance implements InterfaceC5358b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5359c(AbstractC4082a dao) {
        super(dao);
        AbstractC6492s.i(dao, "dao");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C5357a e(C4084c persistent) {
        AbstractC6492s.i(persistent, "persistent");
        return new C5357a(persistent.c(), persistent.e(), persistent.a(), persistent.d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C5357a f() {
        return new C5357a(null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C4084c g(C5357a instance) {
        AbstractC6492s.i(instance, "instance");
        return new C4084c(0, instance.d(), instance.f(), instance.c(), instance.e(), 1, null);
    }
}
