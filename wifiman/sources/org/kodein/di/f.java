package org.kodein.di;

import kotlin.jvm.internal.AbstractC6492s;
import org.kodein.type.q;

/* loaded from: classes4.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f56931a = a.f56932a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f56932a = new a();

        private a() {
        }

        public final f a(q type, Object value) {
            AbstractC6492s.i(type, "type");
            AbstractC6492s.i(value, "value");
            return new b(type, value);
        }
    }

    public static final class b implements f {

        /* renamed from: b, reason: collision with root package name */
        private final q f56933b;

        /* renamed from: c, reason: collision with root package name */
        private final Object f56934c;

        public b(q type, Object value) {
            AbstractC6492s.i(type, "type");
            AbstractC6492s.i(value, "value");
            this.f56933b = type;
            this.f56934c = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(getType(), bVar.getType()) && AbstractC6492s.d(getValue(), bVar.getValue());
        }

        @Override // org.kodein.di.f
        public q getType() {
            return this.f56933b;
        }

        @Override // org.kodein.di.f
        public Object getValue() {
            return this.f56934c;
        }

        public int hashCode() {
            return (getType().hashCode() * 31) + getValue().hashCode();
        }

        public String toString() {
            return "Value(type=" + getType() + ", value=" + getValue() + ')';
        }
    }

    q getType();

    Object getValue();
}
