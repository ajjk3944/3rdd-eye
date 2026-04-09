package v1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23792a;

    /* renamed from: b, reason: collision with root package name */
    public final j f23793b;

    /* renamed from: c, reason: collision with root package name */
    public final j f23794c;

    /* renamed from: d, reason: collision with root package name */
    public final j f23795d;

    /* renamed from: e, reason: collision with root package name */
    public final j f23796e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f23797f;

    public k(String str) {
        this.f23792a = 1;
        this.f23797f = str;
        this.f23793b = new j(1, null);
        this.f23794c = new j(0, null);
        this.f23795d = new j(1, null);
        this.f23796e = new j(0, null);
    }

    public final j a() {
        switch (this.f23792a) {
        }
        return this.f23796e;
    }

    public final j b() {
        switch (this.f23792a) {
        }
        return this.f23793b;
    }

    public final j c() {
        switch (this.f23792a) {
        }
        return this.f23795d;
    }

    public final j d() {
        switch (this.f23792a) {
        }
        return this.f23794c;
    }

    public final String toString() {
        switch (this.f23792a) {
            case 0:
                return mq.l.u0((k[]) this.f23797f, "innermostOf(", ")", null, 57);
            default:
                String str = (String) this.f23797f;
                return str != null ? h0.b.g(')', "RectRulers(", str) : super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(k[] kVarArr) {
        this.f23792a = 0;
        this.f23797f = kVarArr;
        int length = kVarArr.length;
        j[] jVarArr = new j[length];
        for (int i10 = 0; i10 < length; i10++) {
            jVarArr[i10] = ((k[]) this.f23797f)[i10].b();
        }
        this.f23793b = new j(1, new b0(jVarArr, 0));
        int length2 = ((k[]) this.f23797f).length;
        j[] jVarArr2 = new j[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            jVarArr2[i11] = ((k[]) this.f23797f)[i11].d();
        }
        this.f23794c = new j(0, new i(jVarArr2, 0));
        int length3 = ((k[]) this.f23797f).length;
        j[] jVarArr3 = new j[length3];
        for (int i12 = 0; i12 < length3; i12++) {
            jVarArr3[i12] = ((k[]) this.f23797f)[i12].c();
        }
        this.f23795d = new j(1, new b0(jVarArr3, 1));
        int length4 = ((k[]) this.f23797f).length;
        j[] jVarArr4 = new j[length4];
        for (int i13 = 0; i13 < length4; i13++) {
            jVarArr4[i13] = ((k[]) this.f23797f)[i13].a();
        }
        this.f23796e = new j(0, new i(jVarArr4, 1));
    }
}
