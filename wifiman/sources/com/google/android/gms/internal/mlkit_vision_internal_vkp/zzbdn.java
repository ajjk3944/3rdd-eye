package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzbdn extends IOException {
    zzbdn() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzbdn(String str, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th2);
    }

    zzbdn(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
