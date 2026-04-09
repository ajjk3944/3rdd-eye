package com.google.gson.internal;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f20843a;

    static {
        int i4;
        String property = System.getProperty("java.version");
        try {
            String[] strArrSplit = property.split("[._]", 3);
            i4 = Integer.parseInt(strArrSplit[0]);
            if (i4 == 1 && strArrSplit.length > 1) {
                i4 = Integer.parseInt(strArrSplit[1]);
            }
        } catch (NumberFormatException unused) {
            i4 = -1;
        }
        if (i4 == -1) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < property.length(); i10++) {
                    char cCharAt = property.charAt(i10);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    sb2.append(cCharAt);
                }
                i4 = Integer.parseInt(sb2.toString());
            } catch (NumberFormatException unused2) {
                i4 = -1;
            }
        }
        if (i4 == -1) {
            i4 = 6;
        }
        f20843a = i4;
    }
}
