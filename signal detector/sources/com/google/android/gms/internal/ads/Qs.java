package com.google.android.gms.internal.ads;

import android.os.Bundle;
import q2.C2841s;

/* loaded from: classes.dex */
public final class Qs implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final int f10722a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10723b;

    public Qs(int i, int i3) {
        this.f10722a = i;
        this.f10723b = i3;
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final void b(Object obj) {
        int i;
        Bundle bundle = ((C0797Wj) obj).f12308a;
        int i3 = this.f10722a;
        if (i3 == -1 || (i = this.f10723b) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i3);
        bundle.putInt("crashes_without_flags", i);
        q2.r rVar = q2.r.f23260g;
        if (C2841s.f23267e.f23270c.f8326j) {
            bundle.putBoolean("did_reset", true);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* synthetic */ void d(Object obj) {
    }
}
