package c0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.V;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4172a {

    /* renamed from: c0.a$a, reason: collision with other inner class name */
    static final class C1169a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f33586a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1169a(InterfaceC6839p interfaceC6839p) {
            super(2);
            this.f33586a = interfaceC6839p;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4184m interfaceC4184m, Object obj) {
            List list = (List) this.f33586a.invoke(interfaceC4184m, obj);
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                if (obj2 != null && !interfaceC4184m.a(obj2)) {
                    throw new IllegalArgumentException("item can't be saved");
                }
            }
            List list2 = list;
            if (list2.isEmpty()) {
                return null;
            }
            return new ArrayList(list2);
        }
    }

    public static final InterfaceC4182k a(InterfaceC6839p interfaceC6839p, InterfaceC6835l interfaceC6835l) {
        C1169a c1169a = new C1169a(interfaceC6839p);
        AbstractC6492s.g(interfaceC6835l, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return AbstractC4183l.a(c1169a, (InterfaceC6835l) V.f(interfaceC6835l, 1));
    }
}
