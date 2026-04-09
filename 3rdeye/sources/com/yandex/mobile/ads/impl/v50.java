package com.yandex.mobile.ads.impl;

import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class v50 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f34388a;

    /* renamed from: b, reason: collision with root package name */
    private final DataOutputStream f34389b;

    public v50() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AdRequest.MAX_CONTENT_URL_LENGTH);
        this.f34388a = byteArrayOutputStream;
        this.f34389b = new DataOutputStream(byteArrayOutputStream);
    }

    public final byte[] a(t50 t50Var) throws IOException {
        this.f34388a.reset();
        try {
            DataOutputStream dataOutputStream = this.f34389b;
            dataOutputStream.writeBytes(t50Var.f33442b);
            dataOutputStream.writeByte(0);
            String str = t50Var.f33443c;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = this.f34389b;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            this.f34389b.writeLong(t50Var.f33444d);
            this.f34389b.writeLong(t50Var.f33445e);
            this.f34389b.write(t50Var.f33446f);
            this.f34389b.flush();
            return this.f34388a.toByteArray();
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }
}
