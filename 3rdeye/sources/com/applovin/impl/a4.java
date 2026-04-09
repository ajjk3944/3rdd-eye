package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import com.applovin.impl.sdk.ad.b;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class a4 {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f18934a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18935b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18936c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f18937d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f18938e;

    public a4(Activity activity) {
        this.f18934a = activity;
        int iC = a7.c(activity);
        this.f18936c = iC;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(activity);
        this.f18937d = zIsTablet;
        this.f18935b = a(iC, zIsTablet);
        this.f18938e = zIsTablet && 2 == a(activity);
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        int i;
        if (!bVar.L0() || (i = this.f18935b) == -1) {
            a(bVar.g0());
        } else {
            a(i);
        }
    }

    private int a(int i, boolean z10) {
        if (z10 && this.f18938e) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return 9;
            }
            if (i == 2) {
                return 8;
            }
            return i == 3 ? 1 : -1;
        }
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 9;
        }
        return i == 3 ? 8 : -1;
    }

    private void a(b.c cVar) {
        if (cVar == b.c.ACTIVITY_PORTRAIT) {
            if (this.f18937d && this.f18938e) {
                int i = this.f18936c;
                if (i != 1 && i != 3) {
                    a(1);
                    return;
                } else if (i == 1) {
                    a(9);
                    return;
                } else {
                    a(1);
                    return;
                }
            }
            int i10 = this.f18936c;
            if (i10 != 0 && i10 != 2) {
                a(1);
                return;
            } else {
                a(i10 != 0 ? 9 : 1);
                return;
            }
        }
        if (cVar == b.c.ACTIVITY_LANDSCAPE) {
            if (this.f18937d && this.f18938e) {
                int i11 = this.f18936c;
                if (i11 != 0 && i11 != 2) {
                    a(0);
                    return;
                } else {
                    a(i11 != 2 ? 0 : 8);
                    return;
                }
            }
            int i12 = this.f18936c;
            if (i12 != 1 && i12 != 3) {
                a(0);
            } else {
                a(i12 == 1 ? 0 : 8);
            }
        }
    }

    private static int a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    private void a(int i) {
        try {
            this.f18934a.setRequestedOrientation(i);
        } catch (Throwable unused) {
        }
    }
}
