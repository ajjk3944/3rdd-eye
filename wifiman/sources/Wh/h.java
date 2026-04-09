package Wh;

import Uh.w;
import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final a f23970b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final h f23971c = new h(AbstractC3689v.l());

    /* renamed from: a, reason: collision with root package name */
    private final List f23972a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(w table) {
            AbstractC6492s.i(table, "table");
            if (table.K() == 0) {
                return b();
            }
            List listP = table.P();
            AbstractC6492s.h(listP, "getRequirementList(...)");
            return new h(listP, null);
        }

        public final h b() {
            return h.f23971c;
        }

        private a() {
        }
    }

    public /* synthetic */ h(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    private h(List list) {
        this.f23972a = list;
    }
}
