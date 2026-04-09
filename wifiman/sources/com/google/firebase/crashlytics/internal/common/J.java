package com.google.firebase.crashlytics.internal.common;

import N4.F;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
class J implements O {

    /* renamed from: a, reason: collision with root package name */
    private final File f38736a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38737b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38738c;

    J(String str, String str2, File file) {
        this.f38737b = str;
        this.f38738c = str2;
        this.f38736a = file;
    }

    private byte[] d() throws IOException {
        byte[] bArr = new byte[8192];
        try {
            InputStream inputStreamB = b();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (inputStreamB == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (inputStreamB != null) {
                            inputStreamB.close();
                        }
                        return null;
                    }
                    while (true) {
                        try {
                            int i10 = inputStreamB.read(bArr);
                            if (i10 <= 0) {
                                gZIPOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPOutputStream.close();
                                byteArrayOutputStream.close();
                                inputStreamB.close();
                                return byteArray;
                            }
                            gZIPOutputStream.write(bArr, 0, i10);
                        } finally {
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.common.O
    public String a() {
        return this.f38738c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.O
    public InputStream b() {
        if (this.f38736a.exists() && this.f38736a.isFile()) {
            try {
                return new FileInputStream(this.f38736a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.O
    public F.d.b c() throws IOException {
        byte[] bArrD = d();
        if (bArrD != null) {
            return F.d.b.a().b(bArrD).c(this.f38737b).a();
        }
        return null;
    }
}
