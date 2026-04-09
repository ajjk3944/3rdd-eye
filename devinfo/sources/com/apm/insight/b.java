package com.apm.insight;

import android.text.TextUtils;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements ICrashCallback, IOOMCallback {

    /* renamed from: a, reason: collision with root package name */
    private IOOMCallback f3012a;

    /* renamed from: b, reason: collision with root package name */
    private ICrashCallback f3013b;

    /* renamed from: c, reason: collision with root package name */
    private String f3014c;

    public b(String str, ICrashCallback iCrashCallback) {
        this.f3014c = str;
        this.f3013b = iCrashCallback;
    }

    public final void a(CrashType crashType, Throwable th2, Thread thread, long j, JSONArray jSONArray) {
        CrashType crashType2;
        Throwable th3;
        Thread thread2;
        long j8;
        if (this.f3012a == null || jSONArray == null) {
            return;
        }
        int i4 = 0;
        while (i4 < jSONArray.length()) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i4), "header", "aid"), this.f3014c)) {
                crashType2 = crashType;
                th3 = th2;
                thread2 = thread;
                j8 = j;
                this.f3012a.onCrash(crashType2, th3, thread2, j8);
            } else {
                crashType2 = crashType;
                th3 = th2;
                thread2 = thread;
                j8 = j;
            }
            i4++;
            crashType = crashType2;
            th2 = th3;
            thread = thread2;
            j = j8;
        }
    }

    @Override // com.apm.insight.ICrashCallback
    public final void onCrash(CrashType crashType, String str, Thread thread) {
    }

    @Override // com.apm.insight.IOOMCallback
    public final void onCrash(CrashType crashType, Throwable th2, Thread thread, long j) {
    }

    public b(String str, IOOMCallback iOOMCallback) {
        this.f3014c = str;
        this.f3012a = iOOMCallback;
    }

    public final void a(CrashType crashType, String str, Thread thread, JSONArray jSONArray) {
        if (this.f3013b == null || jSONArray == null) {
            return;
        }
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i4), "header", "aid"), this.f3014c)) {
                this.f3013b.onCrash(crashType, str, thread);
            }
        }
    }

    public final void a(CrashType crashType, String str, String str2, String str3) {
        d dVarA;
        if (this.f3013b == null || (dVarA = d.a(this.f3014c)) == null || !dVarA.a(str3, str2)) {
            return;
        }
        this.f3013b.onCrash(crashType, str, null);
    }
}
