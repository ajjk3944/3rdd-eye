package com.mbridge.msdk.config.component.common.file;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private String f13201a;

    /* renamed from: b, reason: collision with root package name */
    private String f13202b;

    /* renamed from: c, reason: collision with root package name */
    private String f13203c;

    /* renamed from: d, reason: collision with root package name */
    private String f13204d;

    /* renamed from: e, reason: collision with root package name */
    private String f13205e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13206f;

    public String a() {
        return this.f13203c + this.f13201a;
    }

    public void b(String str) {
        this.f13201a = str;
    }

    public void c(String str) {
        this.f13202b = str;
    }

    public String d() {
        return this.f13205e;
    }

    public void e(String str) {
        this.f13205e = str;
    }

    @NonNull
    public String toString() {
        return "FileDescription{fileName='" + this.f13201a + "', fileType='" + this.f13202b + "', dirPath='" + this.f13203c + "', unZipDirPath='" + this.f13204d + "', unZipFilePath='" + this.f13205e + "', fileExists=" + this.f13206f + '}';
    }

    public void a(String str) {
        this.f13203c = str;
    }

    public String b() {
        return this.f13202b;
    }

    public String c() {
        return this.f13204d;
    }

    public void d(String str) {
        this.f13204d = str;
    }

    public boolean e() {
        return this.f13206f;
    }

    public void a(boolean z10) {
        this.f13206f = z10;
    }
}
