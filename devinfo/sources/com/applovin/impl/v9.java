package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.l8;
import com.applovin.impl.o2;
import com.applovin.impl.p5;
import com.applovin.impl.w1;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class v9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5888b;

    public /* synthetic */ v9(int i4, Object obj) {
        this.f5887a = i4;
        this.f5888b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.f5887a) {
            case 0:
                ((l8.a) this.f5888b).b();
                break;
            case 1:
                ((o2.a) this.f5888b).a();
                break;
            case 2:
                ((p5.c) this.f5888b).a();
                break;
            case 3:
                ((w1.h) this.f5888b).a();
                break;
            case 4:
                ((a) this.f5888b).b();
                break;
            case 5:
                ((SharedPreferences.Editor) this.f5888b).commit();
                break;
            case 6:
                ((c6) this.f5888b).e();
                break;
            case 7:
                ((d1) this.f5888b).notifyDataSetChanged();
                break;
            case 8:
                ((e5) this.f5888b).c();
                break;
            case 9:
                ((f6) this.f5888b).e();
                break;
            case 10:
                h1.b((Context) this.f5888b);
                break;
            case 11:
                ((l5) this.f5888b).i();
                break;
            case 12:
                ((l8) this.f5888b).a();
                break;
            case 13:
                ((o3) this.f5888b).notifyDataSetChanged();
                break;
            default:
                ((s2) this.f5888b).notifyDataSetChanged();
                break;
        }
    }
}
