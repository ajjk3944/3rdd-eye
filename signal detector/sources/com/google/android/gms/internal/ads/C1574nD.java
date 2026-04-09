package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.nD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1574nD extends Cr {
    @Override // com.google.android.gms.internal.ads.Cr
    public final void k(AbstractC1466lD abstractC1466lD, Set set) {
        synchronized (abstractC1466lD) {
            try {
                if (abstractC1466lD.f15919h == null) {
                    abstractC1466lD.f15919h = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final int p(AbstractC1466lD abstractC1466lD) {
        int i;
        synchronized (abstractC1466lD) {
            i = abstractC1466lD.i - 1;
            abstractC1466lD.i = i;
        }
        return i;
    }
}
