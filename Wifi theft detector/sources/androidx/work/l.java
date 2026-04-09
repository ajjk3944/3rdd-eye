package androidx.work;

import androidx.work.s;

/* loaded from: classes.dex */
public final class l extends s {

    public static final class a extends s.a {
        public a(Class cls) {
            super(cls);
            this.f4536c.f23095d = OverwritingInputMerger.class.getName();
        }

        @Override // androidx.work.s.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public l c() {
            if (this.f4534a && this.f4536c.f23101j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new l(this);
        }

        @Override // androidx.work.s.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d() {
            return this;
        }
    }

    public l(a aVar) {
        super(aVar.f4535b, aVar.f4536c, aVar.f4537d);
    }

    public static l d(Class cls) {
        return (l) new a(cls).b();
    }
}
