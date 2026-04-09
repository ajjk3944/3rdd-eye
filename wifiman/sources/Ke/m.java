package Ke;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class m {

    public static final class a extends m {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10728a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1788948318;
        }

        public String toString() {
            return "Finished";
        }
    }

    public static final class b extends m {

        /* renamed from: a, reason: collision with root package name */
        public static final b f10729a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -2114059072;
        }

        public String toString() {
            return "Idle";
        }
    }

    public static final class c extends m {

        /* renamed from: a, reason: collision with root package name */
        private final float f10730a;

        /* renamed from: b, reason: collision with root package name */
        private final int f10731b;

        public c(float f10, int i10) {
            super(null);
            this.f10730a = f10;
            this.f10731b = i10;
        }

        public final int a() {
            return this.f10731b;
        }

        public final float b() {
            return this.f10730a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.f10730a, cVar.f10730a) == 0 && this.f10731b == cVar.f10731b;
        }

        public int hashCode() {
            return (Float.hashCode(this.f10730a) * 31) + Integer.hashCode(this.f10731b);
        }

        public String toString() {
            return "InProgress(progressRatio=" + this.f10730a + ", currentPort=" + this.f10731b + ")";
        }
    }

    public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private m() {
    }
}
