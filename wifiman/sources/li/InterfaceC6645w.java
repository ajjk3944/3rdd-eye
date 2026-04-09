package li;

import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import java.util.List;

/* renamed from: li.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6645w {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC6645w f52759a = new a();

    /* renamed from: li.w$a */
    static class a implements InterfaceC6645w {
        a() {
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i10 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // li.InterfaceC6645w
        public void a(InterfaceC2492b interfaceC2492b) {
            if (interfaceC2492b == null) {
                c(2);
            }
        }

        @Override // li.InterfaceC6645w
        public void b(InterfaceC2495e interfaceC2495e, List list) {
            if (interfaceC2495e == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }
    }

    void a(InterfaceC2492b interfaceC2492b);

    void b(InterfaceC2495e interfaceC2495e, List list);
}
