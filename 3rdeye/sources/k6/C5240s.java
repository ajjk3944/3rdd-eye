package k6;

import H6.C0675l;
import N7.AbstractC1192h2;
import N7.F1;
import N7.Yb;
import Z6.c;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONException;
import q6.C5493b;

/* compiled from: DivActionTypedSetStoredValueHandler.kt */
/* renamed from: k6.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5240s implements InterfaceC5234m {
    @Override // k6.InterfaceC5234m
    public final boolean a(String str, AbstractC1192h2 action, C0675l c0675l, A7.d dVar) throws JSONException {
        Z6.c dVar2;
        kotlin.jvm.internal.l.f(action, "action");
        if (!(action instanceof AbstractC1192h2.o)) {
            return false;
        }
        F1 f12 = ((AbstractC1192h2.o) action).f8333b;
        String strA = f12.f5158b.a(dVar);
        long jLongValue = f12.f5157a.a(dVar).longValue();
        Yb yb = f12.f5159c;
        if (yb instanceof Yb.g) {
            dVar2 = new c.g(strA, ((Yb.g) yb).f7809b.f8877a.a(dVar));
        } else if (yb instanceof Yb.e) {
            dVar2 = new c.f(strA, ((Yb.e) yb).f7807b.f5746a.a(dVar).longValue());
        } else if (yb instanceof Yb.b) {
            dVar2 = new c.b(strA, ((Yb.b) yb).f7804b.f8623a.a(dVar).booleanValue());
        } else if (yb instanceof Yb.f) {
            dVar2 = new c.e(strA, ((Yb.f) yb).f7808b.f7605a.a(dVar).doubleValue());
        } else if (yb instanceof Yb.c) {
            dVar2 = new c.C0206c(strA, ((Yb.c) yb).f7805b.f9353a.a(dVar).intValue());
        } else if (yb instanceof Yb.h) {
            String string = ((Yb.h) yb).f7810b.f9989a.a(dVar).toString();
            kotlin.jvm.internal.l.e(string, "value.value.value.evaluate(resolver).toString()");
            try {
                new URL(string);
                dVar2 = new c.i(strA, string);
            } catch (MalformedURLException unused) {
                throw new IllegalArgumentException("Invalid url ".concat(string));
            }
        } else if (yb instanceof Yb.a) {
            dVar2 = new c.a(strA, ((Yb.a) yb).f7803b.f7875a.a(dVar));
        } else {
            if (!(yb instanceof Yb.d)) {
                throw new b9.j();
            }
            dVar2 = new c.d(strA, ((Yb.d) yb).f7806b.f5942a.a(dVar));
        }
        C5493b.b(dVar2, jLongValue, c0675l);
        return true;
    }
}
