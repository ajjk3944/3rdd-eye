package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b42 implements ov {

    /* renamed from: a, reason: collision with root package name */
    private final ov f25079a;

    /* renamed from: b, reason: collision with root package name */
    private final nv f25080b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25081c;

    /* renamed from: d, reason: collision with root package name */
    private long f25082d;

    public b42(ov ovVar, pm pmVar) {
        this.f25079a = (ov) zf.a(ovVar);
        this.f25080b = (nv) zf.a(pmVar);
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void a(q62 q62Var) {
        q62Var.getClass();
        this.f25079a.a(q62Var);
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final void close() throws IOException {
        try {
            this.f25079a.close();
        } finally {
            if (this.f25081c) {
                this.f25081c = false;
                this.f25080b.close();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f25079a.getResponseHeaders();
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final Uri getUri() {
        return this.f25079a.getUri();
    }

    @Override // com.yandex.mobile.ads.impl.lv
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        if (this.f25082d == 0) {
            return -1;
        }
        int i11 = this.f25079a.read(bArr, i, i10);
        if (i11 > 0) {
            this.f25080b.write(bArr, i, i11);
            long j4 = this.f25082d;
            if (j4 != -1) {
                this.f25082d = j4 - i11;
            }
        }
        return i11;
    }

    @Override // com.yandex.mobile.ads.impl.ov
    public final long a(sv svVar) throws IOException {
        long jA = this.f25079a.a(svVar);
        this.f25082d = jA;
        if (jA == 0) {
            return 0L;
        }
        if (svVar.f33256g == -1 && jA != -1) {
            svVar = svVar.a(jA);
        }
        this.f25081c = true;
        this.f25080b.a(svVar);
        return this.f25082d;
    }
}
