package com.applovin.impl.sdk.ad;

import com.applovin.impl.v4;
import org.json.JSONArray;
import r.InterfaceC5503a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC5503a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f21076b;

    public /* synthetic */ e(b bVar, int i) {
        this.f21075a = i;
        this.f21076b = bVar;
    }

    @Override // r.InterfaceC5503a
    public final Object apply(Object obj) {
        switch (this.f21075a) {
            case 0:
                return this.f21076b.a((v4) obj);
            case 1:
                return this.f21076b.l((v4) obj);
            case 2:
                return this.f21076b.b((v4) obj);
            case 3:
                return this.f21076b.a((JSONArray) obj);
            default:
                return this.f21076b.g((v4) obj);
        }
    }
}
