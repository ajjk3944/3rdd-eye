package sh;

import Zg.AbstractC3688u;
import gh.AbstractC5918c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh.InterfaceC6944a;

/* renamed from: sh.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7966a implements Iterable, InterfaceC6944a {

    /* renamed from: d, reason: collision with root package name */
    public static final C2163a f61610d = new C2163a(null);

    /* renamed from: a, reason: collision with root package name */
    private final char f61611a;

    /* renamed from: b, reason: collision with root package name */
    private final char f61612b;

    /* renamed from: c, reason: collision with root package name */
    private final int f61613c;

    /* renamed from: sh.a$a, reason: collision with other inner class name */
    public static final class C2163a {
        public /* synthetic */ C2163a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2163a() {
        }
    }

    public AbstractC7966a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f61611a = c10;
        this.f61612b = (char) AbstractC5918c.c(c10, c11, i10);
        this.f61613c = i10;
    }

    public final char i() {
        return this.f61611a;
    }

    public final char j() {
        return this.f61612b;
    }

    @Override // java.lang.Iterable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC3688u iterator() {
        return new C7967b(this.f61611a, this.f61612b, this.f61613c);
    }
}
