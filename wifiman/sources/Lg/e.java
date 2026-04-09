package Lg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private int f11673a;

    /* renamed from: b, reason: collision with root package name */
    boolean f11674b;

    /* renamed from: c, reason: collision with root package name */
    private int f11675c;

    /* renamed from: d, reason: collision with root package name */
    protected final List f11676d = Collections.synchronizedList(new LinkedList());

    /* renamed from: e, reason: collision with root package name */
    protected final List f11677e = Collections.synchronizedList(new LinkedList());

    /* renamed from: f, reason: collision with root package name */
    protected final List f11678f = Collections.synchronizedList(new LinkedList());

    /* renamed from: g, reason: collision with root package name */
    protected final List f11679g = Collections.synchronizedList(new LinkedList());

    protected e(int i10, int i11, boolean z10) {
        this.f11675c = i10;
        this.f11673a = i11;
        this.f11674b = z10;
    }

    public Collection a() {
        return this.f11679g;
    }

    public List b() {
        ArrayList arrayList = new ArrayList(this.f11677e.size() + this.f11678f.size() + this.f11679g.size());
        arrayList.addAll(this.f11677e);
        arrayList.addAll(this.f11678f);
        arrayList.addAll(this.f11679g);
        return arrayList;
    }

    public Collection c() {
        return this.f11677e;
    }

    public Collection d() {
        return this.f11678f;
    }

    public int e() {
        return this.f11675c;
    }

    public int f() {
        if (this.f11674b) {
            return 0;
        }
        return this.f11673a;
    }

    public int g() {
        return a().size();
    }

    public int h() {
        return c().size();
    }

    public int i() {
        return d().size();
    }

    public int j() {
        return l().size();
    }

    public int k() {
        return (this.f11675c & 30720) >> 11;
    }

    public Collection l() {
        return this.f11676d;
    }

    public boolean m() {
        return (this.f11675c & 1024) != 0;
    }

    public boolean n() {
        return ((j() + h()) + i()) + g() == 0;
    }

    public boolean o() {
        return this.f11674b;
    }

    public boolean p() {
        return (this.f11675c & 32768) == 0;
    }

    public boolean q() {
        return (this.f11675c & 32768) == 32768;
    }

    public boolean r() {
        return (this.f11675c & 512) != 0;
    }

    public boolean s() {
        return (this.f11675c & 15) == 0;
    }

    String t() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append(toString());
        sb2.append("\n");
        for (g gVar : this.f11676d) {
            sb2.append("\tquestion:      ");
            sb2.append(gVar);
            sb2.append("\n");
        }
        for (h hVar : this.f11677e) {
            sb2.append("\tanswer:        ");
            sb2.append(hVar);
            sb2.append("\n");
        }
        for (h hVar2 : this.f11678f) {
            sb2.append("\tauthoritative: ");
            sb2.append(hVar2);
            sb2.append("\n");
        }
        for (h hVar3 : this.f11679g) {
            sb2.append("\tadditional:    ");
            sb2.append(hVar3);
            sb2.append("\n");
        }
        return sb2.toString();
    }

    protected String u(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(4000);
        int length = bArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            int iMin = Math.min(32, length - i10);
            if (i10 < 16) {
                sb2.append(' ');
            }
            if (i10 < 256) {
                sb2.append(' ');
            }
            if (i10 < 4096) {
                sb2.append(' ');
            }
            sb2.append(Integer.toHexString(i10));
            sb2.append(':');
            int i11 = 0;
            while (i11 < iMin) {
                if (i11 % 8 == 0) {
                    sb2.append(' ');
                }
                int i12 = i10 + i11;
                sb2.append(Integer.toHexString((bArr[i12] & 240) >> 4));
                sb2.append(Integer.toHexString(bArr[i12] & 15));
                i11++;
            }
            if (i11 < 32) {
                while (i11 < 32) {
                    if (i11 % 8 == 0) {
                        sb2.append(' ');
                    }
                    sb2.append("  ");
                    i11++;
                }
            }
            sb2.append("    ");
            for (int i13 = 0; i13 < iMin; i13++) {
                if (i13 % 8 == 0) {
                    sb2.append(' ');
                }
                int i14 = bArr[i10 + i13] & 255;
                sb2.append((i14 <= 32 || i14 >= 127) ? '.' : (char) i14);
            }
            sb2.append("\n");
            i10 += 32;
            if (i10 >= 2048) {
                sb2.append("....\n");
                break;
            }
        }
        return sb2.toString();
    }

    public void v(int i10) {
        this.f11675c = i10;
    }

    public void w(int i10) {
        this.f11673a = i10;
    }
}
