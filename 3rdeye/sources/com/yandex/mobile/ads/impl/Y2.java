package com.yandex.mobile.ads.impl;

import android.util.Range;
import com.yandex.mobile.ads.impl.oh;
import d0.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class Y2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f24328c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24329d;

    public /* synthetic */ Y2(Object obj, long j4, int i) {
        this.f24327b = i;
        this.f24329d = obj;
        this.f24328c = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24327b) {
            case 0:
                ((oh.a) this.f24329d).a(this.f24328c);
                return;
            default:
                d0.s sVar = (d0.s) this.f24329d;
                switch (sVar.f37276t.ordinal()) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        return;
                    case 1:
                        long j4 = this.f24328c;
                        C.S.a(sVar.f37258a, "Pause on ".concat(Y.d.a(j4)));
                        sVar.f37271o.addLast(Range.create(Long.valueOf(j4), Long.MAX_VALUE));
                        sVar.k(s.b.PAUSED);
                        return;
                    case 4:
                        sVar.k(s.b.PENDING_START_PAUSED);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: " + sVar.f37276t);
                }
        }
    }
}
