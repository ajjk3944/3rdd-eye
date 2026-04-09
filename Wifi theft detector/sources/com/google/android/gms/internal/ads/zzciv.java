package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzciv extends zzhq {
    public zzciv(int i10, Map map, zzhf zzhfVar, int i11) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 15);
        sb.append("Response code: ");
        sb.append(i10);
        super(sb.toString(), zzhfVar, 2000, i11);
    }
}
