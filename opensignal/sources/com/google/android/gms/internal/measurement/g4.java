package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* loaded from: classes.dex */
public final class g4 extends ContentObserver {
    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        m4.f5116i.incrementAndGet();
    }
}
