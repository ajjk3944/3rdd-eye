package inet.ipaddr.format.validate;

import inet.ipaddr.g;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class i implements Serializable, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private Integer f49395a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f49396b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence f49397c;

    /* renamed from: d, reason: collision with root package name */
    private r f49398d;

    /* renamed from: e, reason: collision with root package name */
    private inet.ipaddr.g f49399e;

    /* renamed from: f, reason: collision with root package name */
    private final CharSequence f49400f;

    i() {
        this(null, null, null, null, null);
    }

    private void E(i iVar) {
        Integer num = iVar.f49395a;
        if (num != null) {
            this.f49395a = num;
        }
    }

    private static Integer c(int i10) {
        return g.a(i10);
    }

    private void t(i iVar) {
        r rVar = iVar.f49398d;
        if (rVar != null) {
            this.f49398d = rVar;
        }
    }

    void B(i iVar) {
        E(iVar);
        t(iVar);
    }

    Integer F0() {
        return this.f49395a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public i clone() {
        try {
            return (i) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    Integer h() {
        inet.ipaddr.g gVarL;
        Integer numF0 = F0();
        return (numF0 != null || (gVarL = l()) == null) ? numF0 : gVarL.W0(true);
    }

    inet.ipaddr.g l() {
        inet.ipaddr.g gVar = this.f49399e;
        if (gVar != null) {
            return gVar;
        }
        r rVar = this.f49398d;
        if (rVar != null) {
            return rVar.c2();
        }
        return null;
    }

    Integer m() {
        return this.f49396b;
    }

    CharSequence n() {
        return this.f49397c;
    }

    CharSequence o() {
        return this.f49400f;
    }

    g.a p(inet.ipaddr.o oVar) {
        Integer num = this.f49395a;
        if (num == null) {
            r rVar = this.f49398d;
            if (rVar != null) {
                if (rVar.f1()) {
                    return g.a.IPV6;
                }
                if (this.f49398d.e1()) {
                    return g.a.IPV4;
                }
            }
        } else if (num.intValue() > inet.ipaddr.g.U0(g.a.IPV4) && !oVar.p().f49799g) {
            return g.a.IPV6;
        }
        if (this.f49400f != null) {
            return g.a.IPV6;
        }
        return null;
    }

    void r(i iVar) {
        Integer num;
        if (this.f49395a == null || ((num = iVar.f49395a) != null && num.intValue() < this.f49395a.intValue())) {
            this.f49395a = iVar.f49395a;
        }
        if (this.f49398d != null) {
            if (iVar.f49398d != null) {
                this.f49399e = l().i1(iVar.l());
            }
        } else {
            r rVar = iVar.f49398d;
            if (rVar != null) {
                this.f49398d = rVar;
            }
        }
    }

    public String toString() {
        return "network prefix length: " + this.f49395a + " mask: " + this.f49398d + " zone: " + ((Object) this.f49400f) + " port: " + this.f49396b + " service: " + ((Object) this.f49397c);
    }

    i(CharSequence charSequence) {
        this(null, null, charSequence, null, null);
    }

    public i(CharSequence charSequence, int i10) {
        this(null, null, charSequence, c(i10), null);
    }

    public i(Integer num, CharSequence charSequence) {
        this(num, null, charSequence, null, null);
    }

    i(r rVar, CharSequence charSequence) {
        this(null, rVar, charSequence, null, null);
    }

    i(CharSequence charSequence, CharSequence charSequence2) {
        this(null, null, charSequence, null, charSequence2);
        if (charSequence != null && charSequence2 != null) {
            throw new IllegalArgumentException();
        }
    }

    private i(Integer num, r rVar, CharSequence charSequence, Integer num2, CharSequence charSequence2) {
        this.f49395a = num;
        this.f49398d = rVar;
        this.f49400f = charSequence;
        this.f49396b = num2;
        this.f49397c = charSequence2;
    }
}
