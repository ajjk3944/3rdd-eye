package com.google.firebase.crashlytics.internal.common;

import N4.F;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.firebase.crashlytics.internal.common.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C5105g implements O {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f38783a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38784b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38785c;

    C5105g(String str, String str2, byte[] bArr) {
        this.f38784b = str;
        this.f38785c = str2;
        this.f38783a = bArr;
    }

    private byte[] d() throws IOException {
        if (e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f38783a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean e() {
        byte[] bArr = this.f38783a;
        return bArr == null || bArr.length == 0;
    }

    @Override // com.google.firebase.crashlytics.internal.common.O
    public String a() {
        return this.f38785c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.O
    public InputStream b() {
        if (e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f38783a);
    }

    @Override // com.google.firebase.crashlytics.internal.common.O
    public F.d.b c() throws IOException {
        byte[] bArrD = d();
        if (bArrD == null) {
            return null;
        }
        return F.d.b.a().b(bArrD).c(this.f38784b).a();
    }
}
