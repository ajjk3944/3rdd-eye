package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.applovin.impl.sdk.ad.b;
import com.applovin.sdk.AppLovinSdkUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class n4 {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f4871a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4872b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4873c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4874d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f4875e;

    public n4(Activity activity) {
        this.f4871a = activity;
        int iD = n7.d(activity);
        this.f4873c = iD;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(activity);
        this.f4874d = zIsTablet;
        this.f4872b = a(iD, zIsTablet);
        this.f4875e = zIsTablet && 2 == a(activity);
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        int i4;
        if (!bVar.x0() || (i4 = this.f4872b) == -1) {
            a(bVar.W());
        } else {
            a(i4);
        }
    }

    private int a(int i4, boolean z3) {
        if (z3 && this.f4875e) {
            if (i4 == 0) {
                return 0;
            }
            if (i4 == 1) {
                return 9;
            }
            if (i4 == 2) {
                return 8;
            }
            return i4 == 3 ? 1 : -1;
        }
        if (i4 == 0) {
            return 1;
        }
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 9;
        }
        return i4 == 3 ? 8 : -1;
    }

    private void a(b.c cVar) {
        if (cVar == b.c.ACTIVITY_PORTRAIT) {
            if (this.f4874d && this.f4875e) {
                int i4 = this.f4873c;
                if (i4 != 1 && i4 != 3) {
                    a(1);
                    return;
                } else if (i4 == 1) {
                    a(9);
                    return;
                } else {
                    a(1);
                    return;
                }
            }
            int i10 = this.f4873c;
            if (i10 != 0 && i10 != 2) {
                a(1);
                return;
            } else {
                a(i10 != 0 ? 9 : 1);
                return;
            }
        }
        if (cVar == b.c.ACTIVITY_LANDSCAPE) {
            if (this.f4874d && this.f4875e) {
                int i11 = this.f4873c;
                if (i11 != 0 && i11 != 2) {
                    a(0);
                    return;
                } else {
                    a(i11 != 2 ? 0 : 8);
                    return;
                }
            }
            int i12 = this.f4873c;
            if (i12 != 1 && i12 != 3) {
                a(0);
            } else {
                a(i12 == 1 ? 0 : 8);
            }
        }
    }

    private static int a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = n7.f(context).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    private void a(int i4) {
        try {
            this.f4871a.setRequestedOrientation(i4);
        } catch (Throwable unused) {
        }
    }
}
