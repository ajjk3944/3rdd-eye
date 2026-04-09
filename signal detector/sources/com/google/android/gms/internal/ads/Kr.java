package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Kr implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9550a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9551b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9552c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9553d;

    public /* synthetic */ Kr(Object obj, Object obj2, Object obj3, int i) {
        this.f9550a = i;
        this.f9551b = obj;
        this.f9552c = obj2;
        this.f9553d = obj3;
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[Catch: JSONException -> 0x0050, TryCatch #2 {JSONException -> 0x0050, blocks: (B:5:0x0007, B:7:0x0013, B:9:0x001b, B:16:0x0045, B:19:0x0052, B:21:0x0058), top: B:145:0x0007 }] */
    @Override // com.google.android.gms.internal.ads.Ls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r10) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Kr.b(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final void d(Object obj) {
        int i;
        switch (this.f9550a) {
            case 1:
                C0960bu c0960bu = (C0960bu) this.f9551b;
                ArrayList arrayList = c0960bu.f13486h;
                C0797Wj c0797Wj = (C0797Wj) obj;
                if (arrayList != null && !arrayList.isEmpty()) {
                    Bundle bundle = c0797Wj.f12309b;
                    C0499Fa c0499Fa = c0960bu.f13487j;
                    if (c0499Fa != null && (i = c0499Fa.i) != 0) {
                        bundle.putBoolean("sccg_tap", c0499Fa.f8135j);
                        bundle.putInt("sccg_dir", i);
                        break;
                    }
                }
                break;
        }
    }
}
