package y9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import q9.InterfaceC5499a;

/* compiled from: Strings.kt */
/* renamed from: y9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5821c implements Iterator<String>, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public final String f48370b;

    /* renamed from: c, reason: collision with root package name */
    public int f48371c;

    /* renamed from: d, reason: collision with root package name */
    public int f48372d;

    /* renamed from: e, reason: collision with root package name */
    public int f48373e;

    /* renamed from: f, reason: collision with root package name */
    public int f48374f;

    public C5821c(String string) {
        kotlin.jvm.internal.l.f(string, "string");
        this.f48370b = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i10;
        int i11 = this.f48371c;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.f48374f < 0) {
            this.f48371c = 2;
            return false;
        }
        String str = this.f48370b;
        int length = str.length();
        int length2 = str.length();
        for (int i12 = this.f48372d; i12 < length2; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i10 = i12 + 1) < str.length() && str.charAt(i10) == '\n') ? 2 : 1;
                length = i12;
                this.f48371c = 1;
                this.f48374f = i;
                this.f48373e = length;
                return true;
            }
        }
        i = -1;
        this.f48371c = 1;
        this.f48374f = i;
        this.f48373e = length;
        return true;
    }

    @Override // java.util.Iterator
    public final String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f48371c = 0;
        int i = this.f48373e;
        int i10 = this.f48372d;
        this.f48372d = this.f48374f + i;
        return this.f48370b.subSequence(i10, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
