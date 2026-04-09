package com.yandex.mobile.ads.impl;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.yandex.mobile.ads.impl.a40;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public interface g60 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f27553a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27554b;

        public a(String str, byte[] bArr) {
            this.f27553a = bArr;
            this.f27554b = str;
        }

        public final byte[] a() {
            return this.f27553a;
        }

        public final String b() {
            return this.f27554b;
        }
    }

    public interface b {
    }

    public interface c {
        g60 a(UUID uuid);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f27555a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27556b;

        public d(String str, byte[] bArr) {
            this.f27555a = bArr;
            this.f27556b = str;
        }

        public final byte[] a() {
            return this.f27555a;
        }

        public final String b() {
            return this.f27556b;
        }
    }

    a a(byte[] bArr, List<a40.b> list, int i, HashMap<String, String> map) throws NotProvisionedException;

    d a();

    Map<String, String> a(byte[] bArr);

    void a(b bVar);

    void a(byte[] bArr, gi1 gi1Var);

    void a(byte[] bArr, byte[] bArr2);

    boolean a(String str, byte[] bArr);

    int b();

    void b(byte[] bArr);

    byte[] b(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    void c(byte[] bArr) throws DeniedByServerException;

    byte[] c() throws MediaDrmException;

    yu d(byte[] bArr) throws MediaCryptoException;

    void release();
}
