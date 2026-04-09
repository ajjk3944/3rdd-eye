package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.d5;
import org.json.JSONException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class H implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18805b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18806c;

    public /* synthetic */ H(Object obj, int i) {
        this.f18805b = i;
        this.f18806c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.f18805b) {
            case 0:
                ((d5.c) this.f18806c).a();
                break;
            case 1:
                c1.b((Context) this.f18806c);
                break;
            case 2:
                ((f3) this.f18806c).h();
                break;
            case 3:
                ((s3) this.f18806c).b();
                break;
            case 4:
                ((v1) this.f18806c).K();
                break;
            default:
                ((C2158z0) this.f18806c).i();
                break;
        }
    }
}
