package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.yl1;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
final class zh0 implements ov {

    /* renamed from: a, reason: collision with root package name */
    private final ov f36500a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36501b;

    /* renamed from: c, reason: collision with root package name */
    private final a f36502c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f36503d;

    /* renamed from: e, reason: collision with root package name */
    private int f36504e;

    public interface a {
    }

    public zh0(g22 g22Var, int i, a aVar) {
        zf.a(i > 0);
        this.f36500a = g22Var;
        this.f36501b = i;
        this.f36502c = aVar;
        this.f36503d = new byte[1];
        this.f36504e = i;
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void a(q62 q62Var) {
        q62Var.getClass();
        this.f36500a.a(q62Var);
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f36500a.getResponseHeaders();
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final Uri getUri() {
        return this.f36500a.getUri();
    }

    @Override // com.yandex.mobile.ads.impl.lv
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        if (this.f36504e == 0) {
            int i11 = 0;
            if (this.f36500a.read(this.f36503d, 0, 1) != -1) {
                int i12 = (this.f36503d[0] & KotlinVersion.MAX_COMPONENT_VALUE) << 4;
                if (i12 != 0) {
                    byte[] bArr2 = new byte[i12];
                    int i13 = i12;
                    while (i13 > 0) {
                        int i14 = this.f36500a.read(bArr2, i11, i13);
                        if (i14 != -1) {
                            i11 += i14;
                            i13 -= i14;
                        }
                    }
                    while (i12 > 0 && bArr2[i12 - 1] == 0) {
                        i12--;
                    }
                    if (i12 > 0) {
                        ((yl1.a) this.f36502c).a(new uf1(i12, bArr2));
                    }
                }
                this.f36504e = this.f36501b;
            }
            return -1;
        }
        int i15 = this.f36500a.read(bArr, i, Math.min(this.f36504e, i10));
        if (i15 != -1) {
            this.f36504e -= i15;
        }
        return i15;
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final long a(sv svVar) {
        throw new UnsupportedOperationException();
    }
}
