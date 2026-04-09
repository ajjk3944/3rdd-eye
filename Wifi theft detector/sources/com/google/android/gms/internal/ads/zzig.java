package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzig extends IllegalStateException {
    public zzig(int i10, int i11) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 21 + String.valueOf(i11).length() + 1);
        sb.append("Buffer too small (");
        sb.append(i10);
        sb.append(" < ");
        sb.append(i11);
        sb.append(")");
        super(sb.toString());
    }
}
