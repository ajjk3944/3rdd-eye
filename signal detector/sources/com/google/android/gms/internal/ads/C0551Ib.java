package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import q2.InterfaceC2806a;
import s2.InterfaceC2891a;

/* renamed from: com.google.android.gms.internal.ads.Ib, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0551Ib implements InterfaceC2891a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9102b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2806a f9103c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashMap f9104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f9105e;

    public C0551Ib(C0568Jb c0568Jb, boolean z6, InterfaceC2806a interfaceC2806a, HashMap map, Map map2) {
        this.f9102b = z6;
        this.f9103c = interfaceC2806a;
        this.f9104d = map;
        this.f9105e = map2;
        Objects.requireNonNull(c0568Jb);
        this.f9101a = false;
    }

    @Override // s2.InterfaceC2891a
    public final void g0(boolean z6) {
        if (this.f9101a) {
            return;
        }
        InterfaceC2806a interfaceC2806a = this.f9103c;
        if (z6 && this.f9102b) {
            ((InterfaceC2084wl) interfaceC2806a).L();
        }
        this.f9101a = true;
        String str = (String) this.f9105e.get("event_id");
        Boolean boolValueOf = Boolean.valueOf(z6);
        HashMap map = this.f9104d;
        map.put(str, boolValueOf);
        ((InterfaceC1322ic) interfaceC2806a).a("openIntentAsync", map);
    }

    @Override // s2.InterfaceC2891a
    public final void h(int i) {
    }
}
