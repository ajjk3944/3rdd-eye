package com.applovin.impl.sdk;

import com.applovin.impl.v1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21433b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f21434c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f21435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f21436e;

    public /* synthetic */ v(Object obj, boolean z10, long j4, int i) {
        this.f21433b = i;
        this.f21436e = obj;
        this.f21434c = z10;
        this.f21435d = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21433b) {
            case 0:
                ((r) this.f21436e).a(this.f21434c, this.f21435d);
                break;
            default:
                ((v1) this.f21436e).b(this.f21434c, this.f21435d);
                break;
        }
    }
}
