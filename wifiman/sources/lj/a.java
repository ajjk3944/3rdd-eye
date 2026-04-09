package Lj;

import Lj.b;
import android.graphics.Rect;

/* loaded from: classes2.dex */
final class a extends Lj.b {

    /* renamed from: c, reason: collision with root package name */
    private final Rect f12062c;

    /* renamed from: d, reason: collision with root package name */
    private final b.EnumC0478b f12063d;

    static final class b extends b.a {

        /* renamed from: a, reason: collision with root package name */
        private Rect f12064a;

        /* renamed from: b, reason: collision with root package name */
        private b.EnumC0478b f12065b;

        b() {
        }

        @Override // Lj.b.a
        Lj.b a() {
            String str = "";
            if (this.f12064a == null) {
                str = " roi";
            }
            if (this.f12065b == null) {
                str = str + " orientation";
            }
            if (str.isEmpty()) {
                return new a(this.f12064a, this.f12065b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // Lj.b.a
        Rect c() {
            Rect rect = this.f12064a;
            if (rect != null) {
                return rect;
            }
            throw new IllegalStateException("Property \"roi\" has not been set");
        }

        @Override // Lj.b.a
        public b.a d(b.EnumC0478b enumC0478b) {
            if (enumC0478b == null) {
                throw new NullPointerException("Null orientation");
            }
            this.f12065b = enumC0478b;
            return this;
        }

        @Override // Lj.b.a
        public b.a e(Rect rect) {
            if (rect == null) {
                throw new NullPointerException("Null roi");
            }
            this.f12064a = rect;
            return this;
        }
    }

    @Override // Lj.b
    public b.EnumC0478b b() {
        return this.f12063d;
    }

    @Override // Lj.b
    public Rect c() {
        return this.f12062c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Lj.b)) {
            return false;
        }
        Lj.b bVar = (Lj.b) obj;
        return this.f12062c.equals(bVar.c()) && this.f12063d.equals(bVar.b());
    }

    public int hashCode() {
        return ((this.f12062c.hashCode() ^ 1000003) * 1000003) ^ this.f12063d.hashCode();
    }

    public String toString() {
        return "ImageProcessingOptions{roi=" + this.f12062c + ", orientation=" + this.f12063d + "}";
    }

    private a(Rect rect, b.EnumC0478b enumC0478b) {
        this.f12062c = rect;
        this.f12063d = enumC0478b;
    }
}
