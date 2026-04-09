package yf;

import Ee.C2706g;
import kotlin.jvm.internal.AbstractC6492s;
import s9.d;

/* renamed from: yf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC8665a extends C2706g.b {

    /* renamed from: yf.a$a, reason: collision with other inner class name */
    public static final class C2371a implements InterfaceC8665a {

        /* renamed from: a, reason: collision with root package name */
        private final String f66762a;

        /* renamed from: b, reason: collision with root package name */
        private final d f66763b;

        /* renamed from: c, reason: collision with root package name */
        private final d f66764c;

        /* renamed from: d, reason: collision with root package name */
        private final String f66765d;

        public C2371a(String id2, d key, d value) {
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(key, "key");
            AbstractC6492s.i(value, "value");
            this.f66762a = id2;
            this.f66763b = key;
            this.f66764c = value;
            this.f66765d = "keyVal";
        }

        public final d a() {
            return this.f66763b;
        }

        public final d b() {
            return this.f66764c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2371a)) {
                return false;
            }
            C2371a c2371a = (C2371a) obj;
            return AbstractC6492s.d(this.f66762a, c2371a.f66762a) && AbstractC6492s.d(this.f66763b, c2371a.f66763b) && AbstractC6492s.d(this.f66764c, c2371a.f66764c);
        }

        @Override // Ee.C2706g.b
        public String getId() {
            return this.f66762a;
        }

        @Override // Ee.C2706g.b
        public String getType() {
            return this.f66765d;
        }

        public int hashCode() {
            return (((this.f66762a.hashCode() * 31) + this.f66763b.hashCode()) * 31) + this.f66764c.hashCode();
        }

        public String toString() {
            return "KeyValue(id=" + this.f66762a + ", key=" + this.f66763b + ", value=" + this.f66764c + ")";
        }
    }
}
