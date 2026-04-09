package mf;

import Ee.C2706g;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: mf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6818a implements C2706g.b {

    /* renamed from: mf.a$a, reason: collision with other inner class name */
    public static final class C1959a extends AbstractC6818a {

        /* renamed from: a, reason: collision with root package name */
        private final String f53999a;

        /* renamed from: b, reason: collision with root package name */
        private final s9.d f54000b;

        /* renamed from: c, reason: collision with root package name */
        private final s9.d f54001c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f54002d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f54003e;

        /* renamed from: f, reason: collision with root package name */
        private final String f54004f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1959a(String id2, s9.d title, s9.d subtitle, boolean z10, boolean z11) {
            super(null);
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(title, "title");
            AbstractC6492s.i(subtitle, "subtitle");
            this.f53999a = id2;
            this.f54000b = title;
            this.f54001c = subtitle;
            this.f54002d = z10;
            this.f54003e = z11;
            this.f54004f = "server";
        }

        public final boolean a() {
            return this.f54003e;
        }

        public final boolean b() {
            return this.f54002d;
        }

        public final s9.d c() {
            return this.f54001c;
        }

        public final s9.d d() {
            return this.f54000b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1959a)) {
                return false;
            }
            C1959a c1959a = (C1959a) obj;
            return AbstractC6492s.d(this.f53999a, c1959a.f53999a) && AbstractC6492s.d(this.f54000b, c1959a.f54000b) && AbstractC6492s.d(this.f54001c, c1959a.f54001c) && this.f54002d == c1959a.f54002d && this.f54003e == c1959a.f54003e;
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f53999a;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f54004f;
        }

        public int hashCode() {
            return (((((((this.f53999a.hashCode() * 31) + this.f54000b.hashCode()) * 31) + this.f54001c.hashCode()) * 31) + Boolean.hashCode(this.f54002d)) * 31) + Boolean.hashCode(this.f54003e);
        }

        public String toString() {
            return "Server(id=" + this.f53999a + ", title=" + this.f54000b + ", subtitle=" + this.f54001c + ", highlighted=" + this.f54002d + ", checked=" + this.f54003e + ")";
        }
    }

    public /* synthetic */ AbstractC6818a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC6818a() {
    }
}
