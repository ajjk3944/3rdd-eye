package U9;

import java.security.cert.Certificate;
import java.util.List;
import p9.InterfaceC5480a;

/* compiled from: Handshake.kt */
/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.m implements InterfaceC5480a<List<? extends Certificate>> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<Certificate> f12702g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(List<? extends Certificate> list) {
        super(0);
        this.f12702g = list;
    }

    @Override // p9.InterfaceC5480a
    public final List<? extends Certificate> invoke() {
        return this.f12702g;
    }
}
