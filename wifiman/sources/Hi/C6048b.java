package hi;

import kotlin.jvm.internal.AbstractC6492s;
import oi.InterfaceC7141b;
import oi.n;

/* renamed from: hi.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6048b implements InterfaceC6047a {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable f48751a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7141b f48752b;

    public C6048b(n storageManager, Iterable samWithReceiverResolvers) {
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(samWithReceiverResolvers, "samWithReceiverResolvers");
        this.f48751a = samWithReceiverResolvers;
        this.f48752b = storageManager.a();
    }
}
