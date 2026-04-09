package T;

import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* renamed from: T.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3533h0 extends AbstractC6494u implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC6835l f21088a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3533h0(InterfaceC6835l interfaceC6835l) {
        super(1);
        this.f21088a = interfaceC6835l;
    }

    public final Object a(long j10) {
        return this.f21088a.invoke(Long.valueOf(j10 / 1000000));
    }

    @Override // mh.InterfaceC6835l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).longValue());
    }
}
