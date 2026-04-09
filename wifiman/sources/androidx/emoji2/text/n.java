package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final S1.b f31056a;

    /* renamed from: b, reason: collision with root package name */
    private final char[] f31057b;

    /* renamed from: c, reason: collision with root package name */
    private final a f31058c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    private final Typeface f31059d;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray f31060a;

        /* renamed from: b, reason: collision with root package name */
        private p f31061b;

        private a() {
            this(1);
        }

        a a(int i10) {
            SparseArray sparseArray = this.f31060a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i10);
        }

        final p b() {
            return this.f31061b;
        }

        void c(p pVar, int i10, int i11) {
            a aVarA = a(pVar.b(i10));
            if (aVarA == null) {
                aVarA = new a();
                this.f31060a.put(pVar.b(i10), aVarA);
            }
            if (i11 > i10) {
                aVarA.c(pVar, i10 + 1, i11);
            } else {
                aVarA.f31061b = pVar;
            }
        }

        a(int i10) {
            this.f31060a = new SparseArray(i10);
        }
    }

    private n(Typeface typeface, S1.b bVar) {
        this.f31059d = typeface;
        this.f31056a = bVar;
        this.f31057b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(S1.b bVar) {
        int iK = bVar.k();
        for (int i10 = 0; i10 < iK; i10++) {
            p pVar = new p(this, i10);
            Character.toChars(pVar.f(), this.f31057b, i10 * 2);
            h(pVar);
        }
    }

    public static n b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            A1.o.a("EmojiCompat.MetadataRepo.create");
            return new n(typeface, m.b(byteBuffer));
        } finally {
            A1.o.b();
        }
    }

    public char[] c() {
        return this.f31057b;
    }

    public S1.b d() {
        return this.f31056a;
    }

    int e() {
        return this.f31056a.l();
    }

    a f() {
        return this.f31058c;
    }

    Typeface g() {
        return this.f31059d;
    }

    void h(p pVar) {
        E1.h.h(pVar, "emoji metadata cannot be null");
        E1.h.b(pVar.c() > 0, "invalid metadata codepoint length");
        this.f31058c.c(pVar, 0, pVar.c() - 1);
    }
}
