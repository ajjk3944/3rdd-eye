package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class Es implements InterfaceC1682pD, InterfaceC1099eO {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8015a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8016b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8017c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8018d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8019e;

    /* renamed from: f, reason: collision with root package name */
    public Object f8020f;

    public /* synthetic */ Es(Gs gs, String str, List list, Bundle bundle, boolean z6, boolean z7) {
        this.f8017c = gs;
        this.f8018d = str;
        this.f8019e = list;
        this.f8020f = bundle;
        this.f8015a = z6;
        this.f8016b = z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1682pD, Y2.O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f4.InterfaceFutureC2326a a() {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Es.a():f4.a");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1099eO
    public void b(C2159y5 c2159y5) {
        InterfaceC1099eO interfaceC1099eO = (InterfaceC1099eO) this.f8020f;
        if (interfaceC1099eO != null) {
            interfaceC1099eO.b(c2159y5);
            c2159y5 = ((InterfaceC1099eO) this.f8020f).h();
        }
        ((AO) this.f8017c).b(c2159y5);
    }

    public void c(PP pp) {
        InterfaceC1099eO interfaceC1099eO;
        InterfaceC1099eO interfaceC1099eOM0 = pp.m0();
        if (interfaceC1099eOM0 == null || interfaceC1099eOM0 == (interfaceC1099eO = (InterfaceC1099eO) this.f8020f)) {
            return;
        }
        if (interfaceC1099eO != null) {
            throw new HN(2, new IllegalStateException("Multiple renderer media clocks enabled."), TTAdConstant.STYLE_SIZE_RADIO_1_1);
        }
        this.f8020f = interfaceC1099eOM0;
        this.f8019e = pp;
        ((C1909tP) interfaceC1099eOM0).b(((AO) this.f8017c).f6987d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1099eO
    public long e() {
        if (this.f8015a) {
            return ((AO) this.f8017c).e();
        }
        InterfaceC1099eO interfaceC1099eO = (InterfaceC1099eO) this.f8020f;
        interfaceC1099eO.getClass();
        return interfaceC1099eO.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1099eO
    public boolean g() {
        if (this.f8015a) {
            return false;
        }
        InterfaceC1099eO interfaceC1099eO = (InterfaceC1099eO) this.f8020f;
        interfaceC1099eO.getClass();
        return interfaceC1099eO.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1099eO
    public C2159y5 h() {
        InterfaceC1099eO interfaceC1099eO = (InterfaceC1099eO) this.f8020f;
        return interfaceC1099eO != null ? interfaceC1099eO.h() : ((AO) this.f8017c).f6987d;
    }

    public Es(ZN zn) {
        this.f8018d = zn;
        AO ao = new AO();
        ao.f6987d = C2159y5.f17678d;
        this.f8017c = ao;
        this.f8015a = true;
    }
}
