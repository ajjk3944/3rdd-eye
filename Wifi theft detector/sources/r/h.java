package r;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public class h implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f24118a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f24119b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f24120c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f24121d;

    public h() {
        this(0, 1, null);
    }

    public void a(long j10, Object obj) {
        int i10 = this.f24121d;
        if (i10 != 0 && j10 <= this.f24119b[i10 - 1]) {
            h(j10, obj);
            return;
        }
        if (this.f24118a) {
            long[] jArr = this.f24119b;
            if (i10 >= jArr.length) {
                Object[] objArr = this.f24120c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj2 = objArr[i12];
                    if (obj2 != i.f24122a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj2;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f24118a = false;
                this.f24121d = i11;
            }
        }
        int i13 = this.f24121d;
        if (i13 >= this.f24119b.length) {
            int iF = s.a.f(i13 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f24119b, iF);
            p.d(jArrCopyOf, "copyOf(this, newSize)");
            this.f24119b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f24120c, iF);
            p.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f24120c = objArrCopyOf;
        }
        this.f24119b[i13] = j10;
        this.f24120c[i13] = obj;
        this.f24121d = i13 + 1;
    }

    public void b() {
        int i10 = this.f24121d;
        Object[] objArr = this.f24120c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f24121d = 0;
        this.f24118a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public h clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        p.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        h hVar = (h) objClone;
        hVar.f24119b = (long[]) this.f24119b.clone();
        hVar.f24120c = (Object[]) this.f24120c.clone();
        return hVar;
    }

    public Object d(long j10) {
        int iB = s.a.b(this.f24119b, this.f24121d, j10);
        if (iB < 0 || this.f24120c[iB] == i.f24122a) {
            return null;
        }
        return this.f24120c[iB];
    }

    public Object e(long j10, Object obj) {
        int iB = s.a.b(this.f24119b, this.f24121d, j10);
        return (iB < 0 || this.f24120c[iB] == i.f24122a) ? obj : this.f24120c[iB];
    }

    public int f(long j10) {
        if (this.f24118a) {
            int i10 = this.f24121d;
            long[] jArr = this.f24119b;
            Object[] objArr = this.f24120c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != i.f24122a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f24118a = false;
            this.f24121d = i11;
        }
        return s.a.b(this.f24119b, this.f24121d, j10);
    }

    public long g(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f24121d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        if (this.f24118a) {
            long[] jArr = this.f24119b;
            Object[] objArr = this.f24120c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != i.f24122a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f24118a = false;
            this.f24121d = i12;
        }
        return this.f24119b[i10];
    }

    public void h(long j10, Object obj) {
        int iB = s.a.b(this.f24119b, this.f24121d, j10);
        if (iB >= 0) {
            this.f24120c[iB] = obj;
            return;
        }
        int i10 = ~iB;
        if (i10 < this.f24121d && this.f24120c[i10] == i.f24122a) {
            this.f24119b[i10] = j10;
            this.f24120c[i10] = obj;
            return;
        }
        if (this.f24118a) {
            int i11 = this.f24121d;
            long[] jArr = this.f24119b;
            if (i11 >= jArr.length) {
                Object[] objArr = this.f24120c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj2 = objArr[i13];
                    if (obj2 != i.f24122a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj2;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f24118a = false;
                this.f24121d = i12;
                i10 = ~s.a.b(this.f24119b, i12, j10);
            }
        }
        int i14 = this.f24121d;
        if (i14 >= this.f24119b.length) {
            int iF = s.a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f24119b, iF);
            p.d(jArrCopyOf, "copyOf(this, newSize)");
            this.f24119b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f24120c, iF);
            p.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f24120c = objArrCopyOf;
        }
        int i15 = this.f24121d;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.f24119b;
            int i16 = i10 + 1;
            z8.m.f(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.f24120c;
            z8.m.g(objArr2, objArr2, i16, i10, this.f24121d);
        }
        this.f24119b[i10] = j10;
        this.f24120c[i10] = obj;
        this.f24121d++;
    }

    public void i(long j10) {
        int iB = s.a.b(this.f24119b, this.f24121d, j10);
        if (iB < 0 || this.f24120c[iB] == i.f24122a) {
            return;
        }
        this.f24120c[iB] = i.f24122a;
        this.f24118a = true;
    }

    public void j(int i10) {
        if (this.f24120c[i10] != i.f24122a) {
            this.f24120c[i10] = i.f24122a;
            this.f24118a = true;
        }
    }

    public int k() {
        if (this.f24118a) {
            int i10 = this.f24121d;
            long[] jArr = this.f24119b;
            Object[] objArr = this.f24120c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != i.f24122a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f24118a = false;
            this.f24121d = i11;
        }
        return this.f24121d;
    }

    public Object l(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f24121d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        if (this.f24118a) {
            long[] jArr = this.f24119b;
            Object[] objArr = this.f24120c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != i.f24122a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f24118a = false;
            this.f24121d = i12;
        }
        return this.f24120c[i10];
    }

    public String toString() {
        if (k() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.f24121d * 28);
        sb.append('{');
        int i10 = this.f24121d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(g(i11));
            sb.append('=');
            Object objL = l(i11);
            if (objL != sb) {
                sb.append(objL);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        p.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public h(int i10) {
        if (i10 == 0) {
            this.f24119b = s.a.f24186b;
            this.f24120c = s.a.f24187c;
        } else {
            int iF = s.a.f(i10);
            this.f24119b = new long[iF];
            this.f24120c = new Object[iF];
        }
    }

    public /* synthetic */ h(int i10, int i11, kotlin.jvm.internal.i iVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
