package com.google.vr.dynamite.client;

/* loaded from: classes3.dex */
public final class d extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f39144a = 1;

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = this.f39144a != 1 ? "Unknown error" : "Package not available";
        StringBuilder sb2 = new StringBuilder(str.length() + 17);
        sb2.append("LoaderException{");
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
