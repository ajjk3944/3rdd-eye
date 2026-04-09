package org.kodein.type;

import Yg.J;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;

/* loaded from: classes3.dex */
public abstract class a implements q {

    /* renamed from: b, reason: collision with root package name */
    public static final C2018a f56943b = new C2018a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final q f56944c = s.b(O.b(J.class));

    /* renamed from: d, reason: collision with root package name */
    private static final q f56945d = s.b(O.b(Object.class));

    /* renamed from: org.kodein.type.a$a, reason: collision with other inner class name */
    public static final class C2018a {
        public /* synthetic */ C2018a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2018a() {
        }
    }

    @Override // org.kodein.type.q
    public boolean d(q typeToken) {
        AbstractC6492s.i(typeToken, "typeToken");
        if (AbstractC6492s.d(this, typeToken) || AbstractC6492s.d(this, f56945d)) {
            return true;
        }
        if (!AbstractC6492s.d(c(), typeToken.c())) {
            List listG = typeToken.g();
            if (!(listG instanceof Collection) || !listG.isEmpty()) {
                Iterator it = listG.iterator();
                while (it.hasNext()) {
                    if (d((q) it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }
        q[] qVarArrB = b();
        if (qVarArrB.length == 0) {
            return true;
        }
        q[] qVarArrB2 = typeToken.b();
        int length = qVarArrB.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 1;
            if (!qVarArrB[i10].d(qVarArrB2[i11])) {
                return false;
            }
            i10++;
            i11 = i12;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        if (getClass() == obj.getClass()) {
            return j((q) obj);
        }
        q qVar = (q) obj;
        if (!AbstractC6492s.d(c(), qVar.c())) {
            return false;
        }
        if (!f() || !qVar.f()) {
            q[] qVarArrB = b();
            q[] qVarArrB2 = qVar.b();
            if (qVarArrB.length != qVarArrB2.length) {
                return false;
            }
            int length = qVarArrB.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (!AbstractC6492s.d(qVarArrB[i10], qVarArrB2[i10])) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return k();
    }

    public abstract boolean j(q qVar);

    public abstract int k();

    public final String toString() {
        return h();
    }
}
