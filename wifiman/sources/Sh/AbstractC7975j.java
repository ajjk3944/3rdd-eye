package sh;

import Zg.S;
import gh.AbstractC5918c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh.InterfaceC6944a;

/* renamed from: sh.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7975j implements Iterable, InterfaceC6944a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f61632d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f61633a;

    /* renamed from: b, reason: collision with root package name */
    private final long f61634b;

    /* renamed from: c, reason: collision with root package name */
    private final long f61635c;

    /* renamed from: sh.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AbstractC7975j(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f61633a = j10;
        this.f61634b = AbstractC5918c.d(j10, j11, j12);
        this.f61635c = j12;
    }

    public final long i() {
        return this.f61633a;
    }

    public final long j() {
        return this.f61634b;
    }

    @Override // java.lang.Iterable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public S iterator() {
        return new C7976k(this.f61633a, this.f61634b, this.f61635c);
    }
}
