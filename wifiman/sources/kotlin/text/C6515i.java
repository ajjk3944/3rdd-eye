package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh.InterfaceC6944a;

/* renamed from: kotlin.text.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C6515i implements Iterator, InterfaceC6944a {

    /* renamed from: f, reason: collision with root package name */
    private static final a f52263f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f52264a;

    /* renamed from: b, reason: collision with root package name */
    private int f52265b;

    /* renamed from: c, reason: collision with root package name */
    private int f52266c;

    /* renamed from: d, reason: collision with root package name */
    private int f52267d;

    /* renamed from: e, reason: collision with root package name */
    private int f52268e;

    /* renamed from: kotlin.text.i$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6515i(CharSequence string) {
        AbstractC6492s.i(string, "string");
        this.f52264a = string;
    }

    @Override // java.util.Iterator
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f52265b = 0;
        int i10 = this.f52267d;
        int i11 = this.f52266c;
        this.f52266c = this.f52268e + i10;
        return this.f52264a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f52265b;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f52268e < 0) {
            this.f52265b = 2;
            return false;
        }
        int length = this.f52264a.length();
        int length2 = this.f52264a.length();
        for (int i13 = this.f52266c; i13 < length2; i13++) {
            char cCharAt = this.f52264a.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < this.f52264a.length() && this.f52264a.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f52265b = 1;
                this.f52268e = i10;
                this.f52267d = length;
                return true;
            }
        }
        i10 = -1;
        this.f52265b = 1;
        this.f52268e = i10;
        this.f52267d = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
