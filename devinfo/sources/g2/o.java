package g2;

import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24386a;

    /* renamed from: b, reason: collision with root package name */
    public final n f24387b;

    /* renamed from: c, reason: collision with root package name */
    public final n f24388c;

    /* renamed from: d, reason: collision with root package name */
    public final n f24389d;

    /* renamed from: e, reason: collision with root package name */
    public final n f24390e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f24391f;

    public o(String str) {
        this.f24386a = 1;
        this.f24391f = str;
        this.f24387b = new n(1, null);
        this.f24388c = new n(0, null);
        this.f24389d = new n(1, null);
        this.f24390e = new n(0, null);
    }

    public final n a() {
        switch (this.f24386a) {
        }
        return this.f24390e;
    }

    public final n b() {
        switch (this.f24386a) {
        }
        return this.f24387b;
    }

    public final n c() {
        switch (this.f24386a) {
        }
        return this.f24389d;
    }

    public final n d() {
        switch (this.f24386a) {
        }
        return this.f24388c;
    }

    public final String toString() {
        switch (this.f24386a) {
            case 0:
                return zj.m.c0((o[]) this.f24391f, null, null, 57);
            default:
                String str = (String) this.f24391f;
                return str != null ? d.h.p(')', "RectRulers(", str) : super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(o[] oVarArr) {
        this.f24386a = 0;
        this.f24391f = oVarArr;
        int length = oVarArr.length;
        n[] nVarArr = new n[length];
        for (int i4 = 0; i4 < length; i4++) {
            nVarArr[i4] = ((o[]) this.f24391f)[i4].b();
        }
        this.f24387b = new n(1, new g1(nVarArr, 0));
        int length2 = ((o[]) this.f24391f).length;
        n[] nVarArr2 = new n[length2];
        for (int i10 = 0; i10 < length2; i10++) {
            nVarArr2[i10] = ((o[]) this.f24391f)[i10].d();
        }
        this.f24388c = new n(0, new m(nVarArr2, 0));
        int length3 = ((o[]) this.f24391f).length;
        n[] nVarArr3 = new n[length3];
        for (int i11 = 0; i11 < length3; i11++) {
            nVarArr3[i11] = ((o[]) this.f24391f)[i11].c();
        }
        this.f24389d = new n(1, new g1(nVarArr3, 1));
        int length4 = ((o[]) this.f24391f).length;
        n[] nVarArr4 = new n[length4];
        for (int i12 = 0; i12 < length4; i12++) {
            nVarArr4[i12] = ((o[]) this.f24391f)[i12].a();
        }
        this.f24390e = new n(0, new m(nVarArr4, 1));
    }
}
