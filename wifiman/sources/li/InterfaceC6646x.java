package li;

import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;

/* renamed from: li.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6646x {

    /* renamed from: li.x$a */
    public static final class a implements InterfaceC6646x {

        /* renamed from: a, reason: collision with root package name */
        public static final a f52760a = new a();

        private a() {
        }

        @Override // li.InterfaceC6646x
        public pi.S a(Uh.q proto, String flexibleId, AbstractC7346d0 lowerBound, AbstractC7346d0 upperBound) {
            AbstractC6492s.i(proto, "proto");
            AbstractC6492s.i(flexibleId, "flexibleId");
            AbstractC6492s.i(lowerBound, "lowerBound");
            AbstractC6492s.i(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    pi.S a(Uh.q qVar, String str, AbstractC7346d0 abstractC7346d0, AbstractC7346d0 abstractC7346d02);
}
