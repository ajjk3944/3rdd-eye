package com.apm.insight;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class b implements ICrashCallback, IOOMCallback {

    /* renamed from: a, reason: collision with root package name */
    private IOOMCallback f4772a;

    /* renamed from: b, reason: collision with root package name */
    private ICrashCallback f4773b;

    /* renamed from: c, reason: collision with root package name */
    private String f4774c;

    public b(String str, ICrashCallback iCrashCallback) {
        this.f4774c = str;
        this.f4773b = iCrashCallback;
    }

    public final void a(@NonNull CrashType crashType, @Nullable Throwable th, @Nullable Thread thread, long j10, JSONArray jSONArray) {
        CrashType crashType2;
        Throwable th2;
        Thread thread2;
        long j11;
        if (this.f4772a == null || jSONArray == null) {
            return;
        }
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i10), "header", "aid"), this.f4774c)) {
                crashType2 = crashType;
                th2 = th;
                thread2 = thread;
                j11 = j10;
                this.f4772a.onCrash(crashType2, th2, thread2, j11);
            } else {
                crashType2 = crashType;
                th2 = th;
                thread2 = thread;
                j11 = j10;
            }
            i10++;
            crashType = crashType2;
            th = th2;
            thread = thread2;
            j10 = j11;
        }
    }

    @Override // com.apm.insight.ICrashCallback
    public final void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
    }

    @Override // com.apm.insight.IOOMCallback
    public final void onCrash(@NonNull CrashType crashType, @Nullable Throwable th, @Nullable Thread thread, long j10) {
    }

    public b(String str, IOOMCallback iOOMCallback) {
        this.f4774c = str;
        this.f4772a = iOOMCallback;
    }

    public final void a(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread, JSONArray jSONArray) {
        if (this.f4773b == null || jSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i10), "header", "aid"), this.f4774c)) {
                this.f4773b.onCrash(crashType, str, thread);
            }
        }
    }

    public final void a(@NonNull CrashType crashType, @Nullable String str, @Nullable String str2, String str3) {
        d dVarA;
        if (this.f4773b == null || (dVarA = d.a(this.f4774c)) == null || !dVarA.a(str3, str2)) {
            return;
        }
        this.f4773b.onCrash(crashType, str, null);
    }
}
