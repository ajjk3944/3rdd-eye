package tn;

import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final u f22933a;

    /* renamed from: b, reason: collision with root package name */
    public final List f22934b;

    /* renamed from: c, reason: collision with root package name */
    public final rn.a f22935c;

    public t(u uVar, List list, rn.a aVar) {
        br.l.e(uVar, "condition");
        br.l.e(list, "value");
        br.l.e(aVar, "valueOperator");
        this.f22933a = uVar;
        this.f22934b = list;
        this.f22935c = aVar;
    }

    public final boolean a(un.i iVar) {
        String str = iVar.f23611b;
        int i10 = s.f22932b[this.f22933a.ordinal()];
        rn.a aVar = this.f22935c;
        List<String> list = this.f22934b;
        if (i10 == 1) {
            int i11 = s.f22931a[aVar.ordinal()];
            if (i11 == 1) {
                if (list == null || !list.isEmpty()) {
                    for (String str2 : list) {
                        Locale locale = Locale.ROOT;
                        String lowerCase = str.toLowerCase(locale);
                        br.l.d(lowerCase, "toLowerCase(...)");
                        String lowerCase2 = str2.toLowerCase(locale);
                        br.l.d(lowerCase2, "toLowerCase(...)");
                        if (tt.l.q0(lowerCase, lowerCase2, false)) {
                            return true;
                        }
                    }
                }
                return false;
            }
            if (i11 != 2) {
                throw new bf.n();
            }
            if (list == null || !list.isEmpty()) {
                for (String str3 : list) {
                    Locale locale2 = Locale.ROOT;
                    String lowerCase3 = str.toLowerCase(locale2);
                    br.l.d(lowerCase3, "toLowerCase(...)");
                    String lowerCase4 = str3.toLowerCase(locale2);
                    br.l.d(lowerCase4, "toLowerCase(...)");
                    if (!tt.l.q0(lowerCase3, lowerCase4, false)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    return tt.l.D0(str);
                }
                if (i10 != 5) {
                    throw new bf.n();
                }
            } else if (tt.l.D0(str)) {
                return false;
            }
            return true;
        }
        int i12 = s.f22931a[aVar.ordinal()];
        if (i12 == 1) {
            if (list == null || !list.isEmpty()) {
                for (String str4 : list) {
                    Locale locale3 = Locale.ROOT;
                    String lowerCase5 = str.toLowerCase(locale3);
                    br.l.d(lowerCase5, "toLowerCase(...)");
                    String lowerCase6 = str4.toLowerCase(locale3);
                    br.l.d(lowerCase6, "toLowerCase(...)");
                    if (!tt.l.q0(lowerCase5, lowerCase6, false)) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (i12 != 2) {
            throw new bf.n();
        }
        if (list == null || !list.isEmpty()) {
            for (String str5 : list) {
                Locale locale4 = Locale.ROOT;
                String lowerCase7 = str.toLowerCase(locale4);
                br.l.d(lowerCase7, "toLowerCase(...)");
                String lowerCase8 = str5.toLowerCase(locale4);
                br.l.d(lowerCase8, "toLowerCase(...)");
                if (tt.l.q0(lowerCase7, lowerCase8, false)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f22933a == tVar.f22933a && br.l.a(this.f22934b, tVar.f22934b) && this.f22935c == tVar.f22935c;
    }

    public final int hashCode() {
        return this.f22935c.hashCode() + h0.b.c(this.f22933a.hashCode() * 31, 31, this.f22934b);
    }

    public final String toString() {
        return "DisplayLogicTextGroup(condition=" + this.f22933a + ", value=" + this.f22934b + ", valueOperator=" + this.f22935c + ')';
    }
}
