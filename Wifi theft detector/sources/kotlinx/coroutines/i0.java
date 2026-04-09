package kotlinx.coroutines;

import kotlin.coroutines.d;

/* loaded from: classes4.dex */
public final class i0 extends kotlin.coroutines.a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f22501b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f22502a;

    public static final class a implements d.c {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public a() {
        }
    }

    public i0(String str) {
        super(f22501b);
        this.f22502a = str;
    }

    public final String X() {
        return this.f22502a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && kotlin.jvm.internal.p.a(this.f22502a, ((i0) obj).f22502a);
    }

    public int hashCode() {
        return this.f22502a.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f22502a + ')';
    }
}
