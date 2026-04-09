package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.bj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0949bj implements InterfaceC0441Bk {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f13452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2951a f13453c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Qt f13454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0960bu f13455e;

    public /* synthetic */ C0949bj(Context context, C2951a c2951a, Qt qt, C0960bu c0960bu, int i) {
        this.f13451a = i;
        this.f13452b = context;
        this.f13453c = c2951a;
        this.f13454d = qt;
        this.f13455e = c0960bu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0441Bk
    public final void e() {
        switch (this.f13451a) {
            case 0:
                JSONObject jSONObject = this.f13454d.f10728C;
                p2.j.f22785C.f22801o.d(this.f13452b, this.f13453c.f23784a, jSONObject.toString(), this.f13455e.f13485g);
                break;
            default:
                JSONObject jSONObject2 = this.f13454d.f10728C;
                p2.j.f22785C.f22801o.d(this.f13452b, this.f13453c.f23784a, jSONObject2.toString(), this.f13455e.f13485g);
                break;
        }
    }
}
