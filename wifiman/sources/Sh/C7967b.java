package sh;

import Zg.AbstractC3688u;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: sh.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7967b extends AbstractC3688u {

    /* renamed from: a, reason: collision with root package name */
    private final int f61614a;

    /* renamed from: b, reason: collision with root package name */
    private final int f61615b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f61616c;

    /* renamed from: d, reason: collision with root package name */
    private int f61617d;

    public C7967b(char c10, char c11, int i10) {
        this.f61614a = i10;
        this.f61615b = c11;
        boolean z10 = false;
        if (i10 <= 0 ? AbstractC6492s.k(c10, c11) >= 0 : AbstractC6492s.k(c10, c11) <= 0) {
            z10 = true;
        }
        this.f61616c = z10;
        this.f61617d = z10 ? c10 : c11;
    }

    @Override // Zg.AbstractC3688u
    public char d() {
        int i10 = this.f61617d;
        if (i10 != this.f61615b) {
            this.f61617d = this.f61614a + i10;
        } else {
            if (!this.f61616c) {
                throw new NoSuchElementException();
            }
            this.f61616c = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f61616c;
    }
}
