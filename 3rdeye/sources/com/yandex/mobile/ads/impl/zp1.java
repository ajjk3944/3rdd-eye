package com.yandex.mobile.ads.impl;

import android.util.Base64;
import com.yandex.mobile.ads.impl.c11;
import y9.C5819a;

/* loaded from: classes3.dex */
public final class zp1 {

    /* renamed from: a, reason: collision with root package name */
    private static final c11 f36587a = c11.a.a();

    public static final void a(long j4, op1<?> request, nc1 nc1Var) {
        String str;
        String str2;
        kotlin.jvm.internal.l.f(request, "request");
        byte[] bArrB = request.b();
        String str3 = null;
        if (bArrB != null) {
            try {
                str = new String(bArrB, C5819a.f48359b);
            } catch (Exception unused) {
                str = "UNKNOWN_CONTENT";
            }
        } else {
            str = null;
        }
        byte[] bArr = nc1Var.f30836b;
        if (bArr == null) {
            str2 = str3;
        } else {
            if (request instanceof fj0) {
                str3 = "IMAGE_CONTENT";
            } else {
                try {
                    byte[] bArrDecode = Base64.decode(bArr, 0);
                    kotlin.jvm.internal.l.e(bArrDecode, "decode(...)");
                    str2 = new String(bArrDecode, C5819a.f48359b);
                } catch (IllegalArgumentException unused2) {
                    str3 = new String(bArr, C5819a.f48359b);
                } catch (Exception unused3) {
                    str2 = "UNKNOWN_CONTENT";
                }
            }
            str2 = str3;
        }
        c11 c11Var = f36587a;
        int iF = request.f();
        String str4 = iF == 0 ? "GET" : iF == 1 ? "POST" : iF == 2 ? "PUT" : iF == 3 ? "DELETE" : iF == 4 ? "HEAD" : iF == 5 ? "OPTIONS" : iF == 6 ? "TRACE" : iF == 7 ? "PATCH" : "UNKNOWN";
        String strL = request.l();
        kotlin.jvm.internal.l.e(strL, "getUrl(...)");
        c11Var.a(j4, str4, strL, request.e(), str, Integer.valueOf(nc1Var.f30835a), nc1Var.f30837c, str2);
    }
}
