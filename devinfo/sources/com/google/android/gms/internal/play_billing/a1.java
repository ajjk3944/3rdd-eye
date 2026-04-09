package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.d7;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a1 implements r1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a1 f20073b = new a1(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a1 f20074c = new a1(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a1 f20075d = new a1(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a1 f20076e = new a1(3);

    /* renamed from: f, reason: collision with root package name */
    public static final a1 f20077f = new a1(4);
    public static final a1 g = new a1(5);

    /* renamed from: h, reason: collision with root package name */
    public static final a1 f20078h = new a1(6);

    /* renamed from: i, reason: collision with root package name */
    public static final a1 f20079i = new a1(7);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20080a;

    public /* synthetic */ a1(int i4) {
        this.f20080a = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.r1
    public final boolean a(int i4) {
        switch (this.f20080a) {
            case 0:
                switch (i4) {
                }
            case 1:
                switch (i4) {
                    default:
                        switch (i4) {
                        }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return true;
                }
            case 2:
                if (d7.d(i4) != 0) {
                }
                break;
            case 3:
                if ((i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? null : e3.ALTERNATIVE_BILLING_ACTION : e3.LOCAL_PURCHASES_UPDATED_ACTION : e3.PURCHASES_UPDATED_ACTION : e3.BROADCAST_ACTION_UNSPECIFIED) != null) {
                }
                break;
            case 4:
                if (i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3) {
                }
                break;
            case 5:
                switch (i4) {
                }
            case 6:
                switch (i4) {
                }
            default:
                if (i4 == 0 || i4 == 1) {
                }
                break;
        }
        return true;
    }
}
