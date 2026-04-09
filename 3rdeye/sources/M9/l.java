package M9;

import java.util.List;
import p9.InterfaceC5480a;
import w9.InterfaceC5748c;

/* compiled from: SerializersCache.kt */
/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.m implements InterfaceC5480a<InterfaceC5748c> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<w9.j> f4361g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(List<? extends w9.j> list) {
        super(0);
        this.f4361g = list;
    }

    @Override // p9.InterfaceC5480a
    public final InterfaceC5748c invoke() {
        return this.f4361g.get(0).f();
    }
}
