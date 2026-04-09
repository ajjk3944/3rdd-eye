package kotlinx.coroutines.selects;

import kotlinx.coroutines.internal.c0;
import kotlinx.coroutines.o;
import l9.l;
import l9.q;
import y8.s;

/* loaded from: classes4.dex */
public abstract class SelectKt {

    /* renamed from: a, reason: collision with root package name */
    public static final q f22647a = new q() { // from class: kotlinx.coroutines.selects.SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1
        @Override // l9.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f22648b = new c0("STATE_REG");

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f22649c = new c0("STATE_COMPLETED");

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f22650d = new c0("STATE_CANCELLED");

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f22651e = new c0("NO_RESULT");

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f22652f = new c0("PARAM_CLAUSE_0");

    public static final TrySelectDetailedResult a(int i10) {
        if (i10 == 0) {
            return TrySelectDetailedResult.f22654a;
        }
        if (i10 == 1) {
            return TrySelectDetailedResult.f22655b;
        }
        if (i10 == 2) {
            return TrySelectDetailedResult.f22656c;
        }
        if (i10 == 3) {
            return TrySelectDetailedResult.f22657d;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    public static final c0 i() {
        return f22652f;
    }

    public static final boolean j(o oVar, l lVar) {
        Object objS = oVar.s(s.f25199a, null, lVar);
        if (objS == null) {
            return false;
        }
        oVar.C(objS);
        return true;
    }
}
