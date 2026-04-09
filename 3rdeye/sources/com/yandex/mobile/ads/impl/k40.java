package com.yandex.mobile.ads.impl;

import android.media.MediaDrmException;
import com.yandex.mobile.ads.impl.a40;
import com.yandex.mobile.ads.impl.g60;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class k40 implements g60 {
    @Override // com.yandex.mobile.ads.impl.g60
    public final void a(g60.b bVar) {
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final int b() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final byte[] c() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final yu d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final /* synthetic */ void a(byte[] bArr, gi1 gi1Var) {
        H0.a(this, bArr, gi1Var);
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final void b(byte[] bArr) {
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final void c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final g60.a a(byte[] bArr, List<a40.b> list, int i, HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final g60.d a() {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final Map<String, String> a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final boolean a(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final void a(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.g60
    public final void release() {
    }
}
