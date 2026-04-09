package Ii;

import dh.AbstractC5376a;
import dh.InterfaceC5384i;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class M extends AbstractC5376a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f9275c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final String f9276b;

    public static final class a implements InterfaceC5384i.c {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public M(String str) {
        super(f9275c);
        this.f9276b = str;
    }

    public final String Y() {
        return this.f9276b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof M) && AbstractC6492s.d(this.f9276b, ((M) obj).f9276b);
    }

    public int hashCode() {
        return this.f9276b.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f9276b + ')';
    }
}
