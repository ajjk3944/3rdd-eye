package c5;

import c5.d;
import java.lang.annotation.Annotation;

/* compiled from: AtProtobuf.java */
/* renamed from: c5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2065a {

    /* renamed from: a, reason: collision with root package name */
    public int f18486a;

    /* renamed from: b, reason: collision with root package name */
    public d.a f18487b;

    /* compiled from: AtProtobuf.java */
    /* renamed from: c5.a$a, reason: collision with other inner class name */
    public static final class C0279a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final int f18488a;

        /* renamed from: b, reason: collision with root package name */
        public final d.a f18489b;

        public C0279a(int i, d.a aVar) {
            this.f18488a = i;
            this.f18489b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public final Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            C0279a c0279a = (C0279a) ((d) obj);
            return this.f18488a == c0279a.f18488a && this.f18489b.equals(c0279a.f18489b);
        }

        @Override // java.lang.annotation.Annotation
        public final int hashCode() {
            return (14552422 ^ this.f18488a) + (this.f18489b.hashCode() ^ 2041407134);
        }

        @Override // java.lang.annotation.Annotation
        public final String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f18488a + "intEncoding=" + this.f18489b + ')';
        }
    }

    public static C2065a b() {
        C2065a c2065a = new C2065a();
        c2065a.f18487b = d.a.DEFAULT;
        return c2065a;
    }

    public final C0279a a() {
        return new C0279a(this.f18486a, this.f18487b);
    }
}
