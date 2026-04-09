package ha;

import ca.l;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10533a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f10534b;

    /* renamed from: c, reason: collision with root package name */
    public int f10535c;

    /* renamed from: d, reason: collision with root package name */
    public int f10536d;

    /* renamed from: e, reason: collision with root package name */
    public long f10537e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f10538f;

    /* renamed from: g, reason: collision with root package name */
    public Object f10539g;

    public b(int i10) {
        switch (i10) {
            case 1:
                this.f10533a = new byte[8];
                this.f10534b = new ArrayDeque();
                this.f10538f = new j6.d();
                break;
            default:
                this.f10533a = new byte[8];
                this.f10534b = new ArrayDeque();
                this.f10538f = new f();
                break;
        }
    }

    public long a(l lVar, int i10) {
        lVar.readFully(this.f10533a, 0, i10);
        long j = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j = (j << 8) | (r0[i11] & 255);
        }
        return j;
    }

    public long b(u5.l lVar, int i10) {
        lVar.readFully(this.f10533a, 0, i10);
        long j = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j = (j << 8) | (r0[i11] & 255);
        }
        return j;
    }
}
