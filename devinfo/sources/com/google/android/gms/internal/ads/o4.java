package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o4 implements c8 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14531a;

    public o4(ArrayList arrayList) {
        this.f14531a = arrayList;
        boolean z3 = false;
        if (!arrayList.isEmpty()) {
            long j = ((n4) arrayList.get(0)).f14146b;
            int i4 = 1;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                if (((n4) arrayList.get(i4)).f14145a < j) {
                    z3 = true;
                    break;
                } else {
                    j = ((n4) arrayList.get(i4)).f14146b;
                    i4++;
                }
            }
        }
        mq0.m(!z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o4.class != obj.getClass()) {
            return false;
        }
        return this.f14531a.equals(((o4) obj).f14531a);
    }

    public final int hashCode() {
        return this.f14531a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.f14531a.toString());
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final /* synthetic */ void a(o6 o6Var) {
    }
}
