package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.44, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass44 {
    public static String[] A00 = {"EztRdnRdnxII2dimpNbIGIFL", "yBPkb8rrKyWAtXIO8vHrmMLgNIFMukmC", "ruf61JzVv", "IfWYroKwc", "5HPqTBNR8piE8Sks8fUTmtRJQLpo0nUy", "FxyxfNH4TJBWtje7DU0sksr0G0lHlrNk", "mC", "vPIo9e1233jy8mUAOhcfZhe0yZqmz6aB"};

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.23 != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.24> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends AnonymousClass24> SparseArray<T> A00(AnonymousClass23<T> anonymousClass23, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            sparseArray2.put(sparseArray.keyAt(i4), anonymousClass23.A6f(sparseArray.valueAt(i4)));
        }
        return sparseArray2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.23 != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.24> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<T extends com.facebook.ads.redexgen.X.24> */
    public static <T extends AnonymousClass24> BP<T> A01(AnonymousClass23<T> anonymousClass23, List<Bundle> list) {
        C2K c2kA01 = BP.A01();
        int i4 = 0;
        while (true) {
            int size = list.size();
            int i10 = A00[2].length();
            if (i10 == 29) {
                throw new RuntimeException();
            }
            A00[1] = "WptazREDdEStXNqRDkkRjPq2B5lfZI6H";
            if (i4 < size) {
                c2kA01.A04(anonymousClass23.A6f((Bundle) AbstractC02203y.A01(list.get(i4))));
                i4++;
            } else {
                return c2kA01.A05();
            }
        }
    }

    public static void A02(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) C5C.A0f(AnonymousClass44.class.getClassLoader()));
        }
    }
}
