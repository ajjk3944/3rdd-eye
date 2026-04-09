package n0;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: n0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6858c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f54109d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f54110a;

    /* renamed from: b, reason: collision with root package name */
    private final long f54111b;

    /* renamed from: c, reason: collision with root package name */
    private final int f54112c;

    /* renamed from: n0.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ AbstractC6858c(String str, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, i10);
    }

    public final int a() {
        return AbstractC6857b.f(this.f54111b);
    }

    public final int b() {
        return this.f54112c;
    }

    public abstract float c(int i10);

    public abstract float d(int i10);

    public final long e() {
        return this.f54111b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC6858c abstractC6858c = (AbstractC6858c) obj;
        if (this.f54112c == abstractC6858c.f54112c && AbstractC6492s.d(this.f54110a, abstractC6858c.f54110a)) {
            return AbstractC6857b.e(this.f54111b, abstractC6858c.f54111b);
        }
        return false;
    }

    public final String f() {
        return this.f54110a;
    }

    public boolean g() {
        return false;
    }

    public abstract long h(float f10, float f11, float f12);

    public int hashCode() {
        return (((this.f54110a.hashCode() * 31) + AbstractC6857b.g(this.f54111b)) * 31) + this.f54112c;
    }

    public abstract float i(float f10, float f11, float f12);

    public abstract long j(float f10, float f11, float f12, float f13, AbstractC6858c abstractC6858c);

    public String toString() {
        return this.f54110a + " (id=" + this.f54112c + ", model=" + ((Object) AbstractC6857b.h(this.f54111b)) + ')';
    }

    private AbstractC6858c(String str, long j10, int i10) {
        this.f54110a = str;
        this.f54111b = j10;
        this.f54112c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
