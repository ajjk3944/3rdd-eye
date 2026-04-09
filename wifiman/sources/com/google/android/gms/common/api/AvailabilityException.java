package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.api.internal.C4273b;
import java.util.ArrayList;
import o.C7010a;
import r3.C7564b;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public class AvailabilityException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final C7010a f34710a;

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (C4273b c4273b : this.f34710a.keySet()) {
            C7564b c7564b = (C7564b) AbstractC7901p.l((C7564b) this.f34710a.get(c4273b));
            z10 &= !c7564b.i();
            arrayList.add(c4273b.b() + ": " + String.valueOf(c7564b));
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
