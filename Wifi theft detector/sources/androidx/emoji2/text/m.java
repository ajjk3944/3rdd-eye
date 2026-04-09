package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final e1.b f3059a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f3060b;

    /* renamed from: c, reason: collision with root package name */
    public final a f3061c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    public final Typeface f3062d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray f3063a;

        /* renamed from: b, reason: collision with root package name */
        public TypefaceEmojiRasterizer f3064b;

        public a() {
            this(1);
        }

        public a a(int i10) {
            SparseArray sparseArray = this.f3063a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i10);
        }

        public final TypefaceEmojiRasterizer b() {
            return this.f3064b;
        }

        public void c(TypefaceEmojiRasterizer typefaceEmojiRasterizer, int i10, int i11) {
            a aVarA = a(typefaceEmojiRasterizer.b(i10));
            if (aVarA == null) {
                aVarA = new a();
                this.f3063a.put(typefaceEmojiRasterizer.b(i10), aVarA);
            }
            if (i11 > i10) {
                aVarA.c(typefaceEmojiRasterizer, i10 + 1, i11);
            } else {
                aVarA.f3064b = typefaceEmojiRasterizer;
            }
        }

        public a(int i10) {
            this.f3063a = new SparseArray(i10);
        }
    }

    public m(Typeface typeface, e1.b bVar) {
        this.f3062d = typeface;
        this.f3059a = bVar;
        this.f3060b = new char[bVar.k() * 2];
        a(bVar);
    }

    public static m b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            n0.r.a("EmojiCompat.MetadataRepo.create");
            return new m(typeface, l.b(byteBuffer));
        } finally {
            n0.r.b();
        }
    }

    public final void a(e1.b bVar) {
        int iK = bVar.k();
        for (int i10 = 0; i10 < iK; i10++) {
            TypefaceEmojiRasterizer typefaceEmojiRasterizer = new TypefaceEmojiRasterizer(this, i10);
            Character.toChars(typefaceEmojiRasterizer.f(), this.f3060b, i10 * 2);
            h(typefaceEmojiRasterizer);
        }
    }

    public char[] c() {
        return this.f3060b;
    }

    public e1.b d() {
        return this.f3059a;
    }

    public int e() {
        return this.f3059a.l();
    }

    public a f() {
        return this.f3061c;
    }

    public Typeface g() {
        return this.f3062d;
    }

    public void h(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        r0.i.h(typefaceEmojiRasterizer, "emoji metadata cannot be null");
        r0.i.b(typefaceEmojiRasterizer.c() > 0, "invalid metadata codepoint length");
        this.f3061c.c(typefaceEmojiRasterizer, 0, typefaceEmojiRasterizer.c() - 1);
    }
}
