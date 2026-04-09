package be;

import Yg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import th.l;

/* renamed from: be.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4088b implements InterfaceC4087a {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ l[] f33114c = {O.h(new F(C4088b.class, "networkWifimanApiService", "getNetworkWifimanApiService()Lcom/ui/wifiman/model/ubiquiti/unifi/network/wifiman/NetworkWifimanApiService;", 0))};

    /* renamed from: a, reason: collision with root package name */
    private final m f33115a;

    /* renamed from: b, reason: collision with root package name */
    private final gg.i f33116b;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: be.b$a */
    public static final class a extends o<InterfaceC4091e> {
    }

    public C4088b(DI di2) {
        AbstractC6492s.i(di2, "di");
        org.kodein.type.i iVarE = s.e(new a().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f33115a = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, InterfaceC4091e.class), null).a(this, f33114c[0]);
        this.f33116b = b().d();
    }

    private final InterfaceC4091e b() {
        return (InterfaceC4091e) this.f33115a.getValue();
    }

    @Override // be.InterfaceC4087a
    public gg.i a() {
        return this.f33116b;
    }
}
