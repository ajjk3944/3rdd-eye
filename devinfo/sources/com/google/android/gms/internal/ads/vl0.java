package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vl0 implements qn0 {

    /* renamed from: d, reason: collision with root package name */
    public static String f17645d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17646a;

    /* renamed from: b, reason: collision with root package name */
    public final w81 f17647b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f17648c;

    public /* synthetic */ vl0(Context context, w81 w81Var, int i4) {
        this.f17646a = i4;
        this.f17648c = context;
        this.f17647b = w81Var;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int a() {
        switch (this.f17646a) {
            case 0:
                return 61;
            case 1:
                return 13;
            case 2:
                return 18;
            case 3:
                return 57;
            case 4:
                return 27;
            case 5:
                return 37;
            case 6:
                return 59;
            default:
                return 39;
        }
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final vd.b b() {
        switch (this.f17646a) {
            case 0:
                if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16159he)).booleanValue()) {
                    return yo0.e(new wl0(0, null, false));
                }
                ContentResolver contentResolver = this.f17648c.getContentResolver();
                if (contentResolver == null) {
                    return yo0.e(new wl0(0, null, false));
                }
                return ((ex) this.f17647b).e(new qe(10, contentResolver));
            case 1:
                return ((ex) this.f17647b).e(new qe(13, this));
            case 2:
                return ((ex) this.f17647b).e(new qe(16, this));
            case 3:
                return ((ex) this.f17647b).e(new qe(17, this));
            case 4:
                return ((ex) this.f17647b).e(new mk(this));
            case 5:
                return ((ex) this.f17647b).e(new qe(26, this));
            case 6:
                if (!((Boolean) nl.f14322b.u()).booleanValue()) {
                    return yo0.e(new un0(-1, -1));
                }
                return ((ex) this.f17647b).e(new qe(27, this));
            default:
                return ((ex) this.f17647b).e(new qe(29, this));
        }
    }

    public /* synthetic */ vl0(w81 w81Var, Context context, int i4) {
        this.f17646a = i4;
        this.f17647b = w81Var;
        this.f17648c = context;
    }
}
