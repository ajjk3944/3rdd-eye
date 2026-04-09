package com.google.android.gms.internal.ads;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ka1 implements p81, c80 {

    /* renamed from: c, reason: collision with root package name */
    public static final ka1 f13097c;

    /* renamed from: d, reason: collision with root package name */
    public static final ka1 f13098d;

    /* renamed from: e, reason: collision with root package name */
    public static final ka1 f13099e;

    /* renamed from: f, reason: collision with root package name */
    public static final ka1 f13100f;
    public static final ka1 g;

    /* renamed from: h, reason: collision with root package name */
    public static final ka1 f13101h;

    /* renamed from: i, reason: collision with root package name */
    public static final ka1 f13102i;
    public static final ka1 j;

    /* renamed from: k, reason: collision with root package name */
    public static final ka1 f13103k;

    /* renamed from: l, reason: collision with root package name */
    public static final ka1 f13104l;

    /* renamed from: m, reason: collision with root package name */
    public static final ka1 f13105m;

    /* renamed from: n, reason: collision with root package name */
    public static final ka1 f13106n;

    /* renamed from: o, reason: collision with root package name */
    public static final ka1 f13107o;

    /* renamed from: p, reason: collision with root package name */
    public static final ka1 f13108p;

    /* renamed from: q, reason: collision with root package name */
    public static final ka1 f13109q;

    /* renamed from: r, reason: collision with root package name */
    public static final ka1 f13110r;

    /* renamed from: s, reason: collision with root package name */
    public static final ka1 f13111s;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13112a;

    /* renamed from: b, reason: collision with root package name */
    public String f13113b;

    static {
        int i4 = 0;
        f13097c = new ka1("TINK", i4);
        f13098d = new ka1("CRUNCHY", i4);
        f13099e = new ka1("NO_PREFIX", i4);
        int i10 = 1;
        f13100f = new ka1("TINK", i10);
        g = new ka1("CRUNCHY", i10);
        f13101h = new ka1("NO_PREFIX", i10);
        int i11 = 2;
        f13102i = new ka1("ASSUME_AES_GCM", i11);
        j = new ka1("ASSUME_XCHACHA20POLY1305", i11);
        f13103k = new ka1("ASSUME_CHACHA20POLY1305", i11);
        f13104l = new ka1("ASSUME_AES_CTR_HMAC", i11);
        f13105m = new ka1("ASSUME_AES_EAX", i11);
        f13106n = new ka1("ASSUME_AES_GCM_SIV", i11);
        int i12 = 3;
        f13107o = new ka1("TINK", i12);
        f13108p = new ka1("CRUNCHY", i12);
        f13109q = new ka1("NO_PREFIX", i12);
        int i13 = 4;
        f13110r = new ka1("IEEE_P1363", i13);
        f13111s = new ka1("DER", i13);
    }

    public static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e2) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e2);
                String strJoin = TextUtils.join(", ", objArr);
                int length = str2.length();
                str2 = a0.g.p(new StringBuilder(String.valueOf(strJoin).length() + length + 2 + 1), str2, " [", strJoin, "]");
            }
        }
        return r5.c.m(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", f(this.f13113b, str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", f(this.f13113b, str, objArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.c80
    /* renamed from: c */
    public /* synthetic */ void mo162c(Object obj) {
        ((j80) obj).j(this.f13113b);
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.f13113b, str, objArr));
        }
    }

    public void e(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.f13113b, str, objArr), remoteException);
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        ua.j.C.f35265h.f(this.f13113b, th2);
    }

    public String toString() {
        switch (this.f13112a) {
            case 0:
                return this.f13113b;
            case 1:
                return this.f13113b;
            case 2:
                return this.f13113b;
            case 3:
                return this.f13113b;
            case 4:
                return this.f13113b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ka1(String str, int i4) {
        this.f13112a = i4;
        this.f13113b = str;
    }

    public ka1(String str) {
        this.f13112a = 9;
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iMyUid).length() + 15 + String.valueOf(iMyPid).length() + 2);
        r5.c.q(iMyUid, iMyPid, "UID: [", "]  PID: [", sb2);
        sb2.append("] ");
        this.f13113b = sb2.toString().concat(str);
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public void mo163h(Object obj) {
    }
}
