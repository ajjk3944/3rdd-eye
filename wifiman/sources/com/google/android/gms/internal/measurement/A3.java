package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: classes.dex */
final class A3 extends AbstractC4453s3 {
    A3(B3 b32, String str, Boolean bool, boolean z10) {
        super(b32, str, bool);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4453s3
    final /* synthetic */ Object g(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (S2.f35105c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (S2.f35106d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}
