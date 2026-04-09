package b1;

import android.graphics.Typeface;
import android.util.SparseArray;
import c1.C2043a;
import c1.C2044b;
import java.nio.ByteBuffer;

/* compiled from: MetadataRepo.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final C2044b f17075a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f17076b;

    /* renamed from: c, reason: collision with root package name */
    public final a f17077c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    public final Typeface f17078d;

    /* compiled from: MetadataRepo.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f17079a;

        /* renamed from: b, reason: collision with root package name */
        public k f17080b;

        public a() {
            this(1);
        }

        public final void a(k kVar, int i, int i10) {
            int iA = kVar.a(i);
            SparseArray<a> sparseArray = this.f17079a;
            a aVar = sparseArray == null ? null : sparseArray.get(iA);
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(kVar.a(i), aVar);
            }
            if (i10 > i) {
                aVar.a(kVar, i + 1, i10);
            } else {
                aVar.f17080b = kVar;
            }
        }

        public a(int i) {
            this.f17079a = new SparseArray<>(i);
        }
    }

    public i(Typeface typeface, C2044b c2044b) {
        int i;
        int i10;
        int i11;
        int i12;
        this.f17078d = typeface;
        this.f17075a = c2044b;
        int iA = c2044b.a(6);
        if (iA != 0) {
            int i13 = iA + c2044b.f4175a;
            i = ((ByteBuffer) c2044b.f4178d).getInt(((ByteBuffer) c2044b.f4178d).getInt(i13) + i13);
        } else {
            i = 0;
        }
        this.f17076b = new char[i * 2];
        int iA2 = c2044b.a(6);
        if (iA2 != 0) {
            int i14 = iA2 + c2044b.f4175a;
            i10 = ((ByteBuffer) c2044b.f4178d).getInt(((ByteBuffer) c2044b.f4178d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            k kVar = new k(this, i15);
            C2043a c2043aB = kVar.b();
            int iA3 = c2043aB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) c2043aB.f4178d).getInt(iA3 + c2043aB.f4175a) : 0, this.f17076b, i15 * 2);
            C2043a c2043aB2 = kVar.b();
            int iA4 = c2043aB2.a(16);
            if (iA4 != 0) {
                int i16 = iA4 + c2043aB2.f4175a;
                i11 = ((ByteBuffer) c2043aB2.f4178d).getInt(((ByteBuffer) c2043aB2.f4178d).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            A2.l.k("invalid metadata codepoint length", i11 > 0);
            C2043a c2043aB3 = kVar.b();
            int iA5 = c2043aB3.a(16);
            if (iA5 != 0) {
                int i17 = iA5 + c2043aB3.f4175a;
                i12 = ((ByteBuffer) c2043aB3.f4178d).getInt(((ByteBuffer) c2043aB3.f4178d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            this.f17077c.a(kVar, 0, i12 - 1);
        }
    }
}
