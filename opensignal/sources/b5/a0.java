package b5;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final h f2419a;

    /* renamed from: d, reason: collision with root package name */
    public long f2420d;

    /* renamed from: g, reason: collision with root package name */
    public Uri f2421g;

    public a0(h hVar) {
        hVar.getClass();
        this.f2419a = hVar;
        this.f2421g = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // b5.h
    public final void close() {
        this.f2419a.close();
    }

    @Override // b5.h
    public final Map k() {
        return this.f2419a.k();
    }

    @Override // b5.h
    public final Uri o() {
        return this.f2419a.o();
    }

    @Override // androidx.media3.common.l
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f2419a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f2420d += i12;
        }
        return i12;
    }

    @Override // b5.h
    public final long t(k kVar) {
        this.f2421g = kVar.f2443a;
        Map map = Collections.EMPTY_MAP;
        h hVar = this.f2419a;
        long jT = hVar.t(kVar);
        Uri uriO = hVar.o();
        uriO.getClass();
        this.f2421g = uriO;
        hVar.k();
        return jT;
    }

    @Override // b5.h
    public final void w(b0 b0Var) {
        b0Var.getClass();
        this.f2419a.w(b0Var);
    }
}
