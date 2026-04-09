package n7;

import kotlin.jvm.internal.l;

/* compiled from: Field.kt */
/* renamed from: n7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5371a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f44398a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f44399b;

    /* compiled from: Field.kt */
    /* renamed from: n7.a$a, reason: collision with other inner class name */
    public static final class C0502a extends AbstractC5371a<Object> {

        /* renamed from: c, reason: collision with root package name */
        public static final C0502a f44400c = new C0502a(0, false);
    }

    /* compiled from: Field.kt */
    /* renamed from: n7.a$b */
    public static final class b extends AbstractC5371a<Object> {

        /* renamed from: c, reason: collision with root package name */
        public static final b f44401c = new b(1, true);
    }

    /* compiled from: Field.kt */
    /* renamed from: n7.a$c */
    public static final class c<T> extends AbstractC5371a<T> {

        /* renamed from: c, reason: collision with root package name */
        public final String f44402c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, String reference) {
            super(3, z10);
            l.f(reference, "reference");
            this.f44402c = reference;
        }
    }

    /* compiled from: Field.kt */
    /* renamed from: n7.a$d */
    public static final class d<T> extends AbstractC5371a<T> {

        /* renamed from: c, reason: collision with root package name */
        public final T f44403c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Object obj, boolean z10) {
            super(2, z10);
            this.f44403c = obj;
        }
    }

    public AbstractC5371a(int i, boolean z10) {
        this.f44398a = i;
        this.f44399b = z10;
    }
}
