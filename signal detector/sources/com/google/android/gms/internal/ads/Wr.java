package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import f4.InterfaceFutureC2326a;
import q2.C2841s;

/* loaded from: classes.dex */
public final class Wr implements Ms {

    /* renamed from: d, reason: collision with root package name */
    public static String f12324d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12325a;

    /* renamed from: b, reason: collision with root package name */
    public final ID f12326b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f12327c;

    public /* synthetic */ Wr(Context context, ID id, int i) {
        this.f12325a = i;
        this.f12327c = context;
        this.f12326b = id;
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final InterfaceFutureC2326a a() {
        switch (this.f12325a) {
            case 0:
                if (!((Boolean) C2841s.f23267e.f23270c.a(H9.fe)).booleanValue()) {
                    return AbstractC1984ut.e(new Xr(null, false, 0));
                }
                ContentResolver contentResolver = this.f12327c.getContentResolver();
                if (contentResolver == null) {
                    return AbstractC1984ut.e(new Xr(null, false, 0));
                }
                return ((C0623Mf) this.f12326b).b(new J6(10, contentResolver));
            case 1:
                return ((C0623Mf) this.f12326b).b(new J6(13, this));
            case 2:
                return ((C0623Mf) this.f12326b).b(new J6(14, this));
            case 3:
                return ((C0623Mf) this.f12326b).b(new J6(16, this));
            case 4:
                return ((C0623Mf) this.f12326b).b(new J6(17, this));
            case 5:
                return ((C0623Mf) this.f12326b).b(new B9(this));
            case 6:
                return ((C0623Mf) this.f12326b).b(new J6(26, this));
            case 7:
                if (!((Boolean) AbstractC0994ca.f13568b.v()).booleanValue()) {
                    return AbstractC1984ut.e(new Qs(-1, -1));
                }
                return ((C0623Mf) this.f12326b).b(new J6(27, this));
            default:
                return ((C0623Mf) this.f12326b).b(new J6(29, this));
        }
    }

    public Intent b() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        boolean zBooleanValue = ((Boolean) C2841s.f23267e.f23270c.a(H9.kc)).booleanValue();
        Context context = this.f12327c;
        return (!zBooleanValue || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final int c() {
        switch (this.f12325a) {
            case 0:
                return 61;
            case 1:
                return 13;
            case 2:
                return 14;
            case 3:
                return 18;
            case 4:
                return 57;
            case 5:
                return 27;
            case 6:
                return 37;
            case 7:
                return 59;
            default:
                return 39;
        }
    }

    public /* synthetic */ Wr(ID id, Context context, int i) {
        this.f12325a = i;
        this.f12326b = id;
        this.f12327c = context;
    }
}
