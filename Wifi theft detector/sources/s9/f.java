package s9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class f implements Iterator, m9.a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f24363f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f24364a;

    /* renamed from: b, reason: collision with root package name */
    public int f24365b;

    /* renamed from: c, reason: collision with root package name */
    public int f24366c;

    /* renamed from: d, reason: collision with root package name */
    public int f24367d;

    /* renamed from: e, reason: collision with root package name */
    public int f24368e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public a() {
        }
    }

    public f(CharSequence string) {
        kotlin.jvm.internal.p.e(string, "string");
        this.f24364a = string;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f24365b = 0;
        int i10 = this.f24367d;
        int i11 = this.f24366c;
        this.f24366c = this.f24368e + i10;
        return this.f24364a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f24365b;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f24368e < 0) {
            this.f24365b = 2;
            return false;
        }
        int length = this.f24364a.length();
        int length2 = this.f24364a.length();
        for (int i13 = this.f24366c; i13 < length2; i13++) {
            char cCharAt = this.f24364a.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < this.f24364a.length() && this.f24364a.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f24365b = 1;
                this.f24368e = i10;
                this.f24367d = length;
                return true;
            }
        }
        i10 = -1;
        this.f24365b = 1;
        this.f24368e = i10;
        this.f24367d = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
