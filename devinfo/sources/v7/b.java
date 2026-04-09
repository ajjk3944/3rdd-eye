package v7;

import b5.i0;
import java.io.File;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f35950a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f35951b;

    /* renamed from: c, reason: collision with root package name */
    public final File[] f35952c;

    /* renamed from: d, reason: collision with root package name */
    public final File[] f35953d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f35954e;

    /* renamed from: f, reason: collision with root package name */
    public i0 f35955f;
    public final /* synthetic */ c g;

    public b(c cVar, String str) {
        this.g = cVar;
        this.f35950a = str;
        int i4 = cVar.g;
        File file = cVar.f35956a;
        this.f35951b = new long[i4];
        this.f35952c = new File[i4];
        this.f35953d = new File[i4];
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i10 = 0; i10 < i4; i10++) {
            sb2.append(i10);
            this.f35952c[i10] = new File(file, sb2.toString());
            sb2.append(".tmp");
            this.f35953d[i10] = new File(file, sb2.toString());
            sb2.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        for (long j : this.f35951b) {
            sb2.append(' ');
            sb2.append(j);
        }
        return sb2.toString();
    }
}
