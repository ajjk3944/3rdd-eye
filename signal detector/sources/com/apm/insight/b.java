package com.apm.insight;

import android.text.TextUtils;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class b implements ICrashCallback, IOOMCallback {

    /* renamed from: a, reason: collision with root package name */
    private IOOMCallback f5954a;

    /* renamed from: b, reason: collision with root package name */
    private ICrashCallback f5955b;

    /* renamed from: c, reason: collision with root package name */
    private String f5956c;

    public b(String str, ICrashCallback iCrashCallback) {
        this.f5956c = str;
        this.f5955b = iCrashCallback;
    }

    public final void a(CrashType crashType, Throwable th, Thread thread, long j6, JSONArray jSONArray) {
        CrashType crashType2;
        Throwable th2;
        Thread thread2;
        long j7;
        if (this.f5954a == null || jSONArray == null) {
            return;
        }
        int i = 0;
        while (i < jSONArray.length()) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i), "header", "aid"), this.f5956c)) {
                crashType2 = crashType;
                th2 = th;
                thread2 = thread;
                j7 = j6;
                this.f5954a.onCrash(crashType2, th2, thread2, j7);
            } else {
                crashType2 = crashType;
                th2 = th;
                thread2 = thread;
                j7 = j6;
            }
            i++;
            crashType = crashType2;
            th = th2;
            thread = thread2;
            j6 = j7;
        }
    }

    @Override // com.apm.insight.ICrashCallback
    public final void onCrash(CrashType crashType, String str, Thread thread) {
    }

    @Override // com.apm.insight.IOOMCallback
    public final void onCrash(CrashType crashType, Throwable th, Thread thread, long j6) {
    }

    public b(String str, IOOMCallback iOOMCallback) {
        this.f5956c = str;
        this.f5954a = iOOMCallback;
    }

    public final void a(CrashType crashType, String str, Thread thread, JSONArray jSONArray) {
        if (this.f5955b == null || jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i), "header", "aid"), this.f5956c)) {
                this.f5955b.onCrash(crashType, str, thread);
            }
        }
    }

    public final void a(CrashType crashType, String str, String str2, String str3) {
        d dVarA;
        if (this.f5955b == null || (dVarA = d.a(this.f5956c)) == null || !dVarA.a(str3, str2)) {
            return;
        }
        this.f5955b.onCrash(crashType, str, null);
    }
}
