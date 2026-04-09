package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class N1 implements B3 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9938a;

    public N1(ArrayList arrayList) {
        this.f9938a = arrayList;
        boolean z6 = false;
        if (!arrayList.isEmpty()) {
            long j6 = ((M1) arrayList.get(0)).f9794b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((M1) arrayList.get(i)).f9793a < j6) {
                    z6 = true;
                    break;
                } else {
                    j6 = ((M1) arrayList.get(i)).f9794b;
                    i++;
                }
            }
        }
        AbstractC0582Jp.m(!z6);
    }

    @Override // com.google.android.gms.internal.ads.B3
    public final /* synthetic */ void a(O2 o22) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || N1.class != obj.getClass()) {
            return false;
        }
        return this.f9938a.equals(((N1) obj).f9938a);
    }

    public final int hashCode() {
        return this.f9938a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.f9938a.toString());
    }
}
