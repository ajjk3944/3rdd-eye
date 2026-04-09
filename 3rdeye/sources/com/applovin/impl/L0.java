package com.applovin.impl;

import android.content.SharedPreferences;
import android.webkit.WebView;
import com.applovin.impl.r1;
import com.applovin.impl.y7;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class L0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18827c;

    public /* synthetic */ L0(Object obj, int i) {
        this.f18826b = i;
        this.f18827c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18826b) {
            case 0:
                ((r1.g) this.f18827c).a();
                break;
            case 1:
                ((y7.a) this.f18827c).b();
                break;
            case 2:
                ((c2) this.f18827c).d();
                break;
            case 3:
                ((SharedPreferences.Editor) this.f18827c).commit();
                break;
            case 4:
                ((s1) this.f18827c).I();
                break;
            case 5:
                ((s3) this.f18827c).c();
                break;
            case 6:
                ((w3) this.f18827c).g();
                break;
            case 7:
                ((C2156y0) this.f18827c).notifyDataSetChanged();
                break;
            case 8:
                ((y3) this.f18827c).l();
                break;
            case 9:
                ((WebView) this.f18827c).destroy();
                break;
            default:
                ((z4) this.f18827c).h();
                break;
        }
    }
}
