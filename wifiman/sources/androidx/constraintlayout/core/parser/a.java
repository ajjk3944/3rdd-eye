package androidx.constraintlayout.core.parser;

import f1.C5492a;
import f1.C5493b;
import f1.C5494c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class a extends b {

    /* renamed from: f, reason: collision with root package name */
    ArrayList f30031f;

    public a(char[] cArr) {
        super(cArr);
        this.f30031f = new ArrayList();
    }

    public b A(int i10) throws CLParsingException {
        if (i10 >= 0 && i10 < this.f30031f.size()) {
            return (b) this.f30031f.get(i10);
        }
        throw new CLParsingException("no element at index " + i10, this);
    }

    public b D(String str) throws CLParsingException {
        Iterator it = this.f30031f.iterator();
        while (it.hasNext()) {
            c cVar = (c) ((b) it.next());
            if (cVar.e().equals(str)) {
                return cVar.i0();
            }
        }
        throw new CLParsingException("no element for key <" + str + ">", this);
    }

    public C5492a F(String str) throws CLParsingException {
        b bVarD = D(str);
        if (bVarD instanceof C5492a) {
            return (C5492a) bVarD;
        }
        throw new CLParsingException("no array found for key <" + str + ">, found [" + bVarD.m() + "] : " + bVarD, this);
    }

    public C5492a G(String str) {
        b bVarS = S(str);
        if (bVarS instanceof C5492a) {
            return (C5492a) bVarS;
        }
        return null;
    }

    public float H(int i10) throws CLParsingException {
        b bVarA = A(i10);
        if (bVarA != null) {
            return bVarA.f();
        }
        throw new CLParsingException("no float at index " + i10, this);
    }

    public float I(String str) throws CLParsingException {
        b bVarD = D(str);
        if (bVarD != null) {
            return bVarD.f();
        }
        throw new CLParsingException("no float found for key <" + str + ">, found [" + bVarD.m() + "] : " + bVarD, this);
    }

    public float L(String str) {
        b bVarS = S(str);
        if (bVarS instanceof C5493b) {
            return bVarS.f();
        }
        return Float.NaN;
    }

    public int M(int i10) throws CLParsingException {
        b bVarA = A(i10);
        if (bVarA != null) {
            return bVarA.i();
        }
        throw new CLParsingException("no int at index " + i10, this);
    }

    public int N(String str) throws CLParsingException {
        b bVarD = D(str);
        if (bVarD != null) {
            return bVarD.i();
        }
        throw new CLParsingException("no int found for key <" + str + ">, found [" + bVarD.m() + "] : " + bVarD, this);
    }

    public d O(String str) throws CLParsingException {
        b bVarD = D(str);
        if (bVarD instanceof d) {
            return (d) bVarD;
        }
        throw new CLParsingException("no object found for key <" + str + ">, found [" + bVarD.m() + "] : " + bVarD, this);
    }

    public d Q(String str) {
        b bVarS = S(str);
        if (bVarS instanceof d) {
            return (d) bVarS;
        }
        return null;
    }

    public b R(int i10) {
        if (i10 < 0 || i10 >= this.f30031f.size()) {
            return null;
        }
        return (b) this.f30031f.get(i10);
    }

    public b S(String str) {
        Iterator it = this.f30031f.iterator();
        while (it.hasNext()) {
            c cVar = (c) ((b) it.next());
            if (cVar.e().equals(str)) {
                return cVar.i0();
            }
        }
        return null;
    }

    public String U(int i10) throws CLParsingException {
        b bVarA = A(i10);
        if (bVarA instanceof C5494c) {
            return bVarA.e();
        }
        throw new CLParsingException("no string at index " + i10, this);
    }

    public String V(String str) throws CLParsingException {
        b bVarD = D(str);
        if (bVarD instanceof C5494c) {
            return bVarD.e();
        }
        throw new CLParsingException("no string found for key <" + str + ">, found [" + (bVarD != null ? bVarD.m() : null) + "] : " + bVarD, this);
    }

    public String W(int i10) {
        b bVarR = R(i10);
        if (bVarR instanceof C5494c) {
            return bVarR.e();
        }
        return null;
    }

    public String X(String str) {
        b bVarS = S(str);
        if (bVarS instanceof C5494c) {
            return bVarS.e();
        }
        return null;
    }

    public boolean Y(String str) {
        Iterator it = this.f30031f.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if ((bVar instanceof c) && ((c) bVar).e().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList Z() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f30031f.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar instanceof c) {
                arrayList.add(((c) bVar).e());
            }
        }
        return arrayList;
    }

    public void a0(String str, b bVar) {
        Iterator it = this.f30031f.iterator();
        while (it.hasNext()) {
            c cVar = (c) ((b) it.next());
            if (cVar.e().equals(str)) {
                cVar.j0(bVar);
                return;
            }
        }
        this.f30031f.add((c) c.g0(str, bVar));
    }

    public void c0(String str, float f10) {
        a0(str, new C5493b(f10));
    }

    public void clear() {
        this.f30031f.clear();
    }

    public void e0(String str, String str2) {
        C5494c c5494c = new C5494c(str2.toCharArray());
        c5494c.w(0L);
        c5494c.u(str2.length() - 1);
        a0(str, c5494c);
    }

    @Override // androidx.constraintlayout.core.parser.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f30031f.equals(((a) obj).f30031f);
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.parser.b
    public int hashCode() {
        return Objects.hash(this.f30031f, Integer.valueOf(super.hashCode()));
    }

    public int size() {
        return this.f30031f.size();
    }

    @Override // androidx.constraintlayout.core.parser.b
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f30031f.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (sb2.length() > 0) {
                sb2.append("; ");
            }
            sb2.append(bVar);
        }
        return super.toString() + " = <" + ((Object) sb2) + " >";
    }

    public void x(b bVar) {
        this.f30031f.add(bVar);
        if (e.f30040a) {
            System.out.println("added element " + bVar + " to " + this);
        }
    }

    @Override // androidx.constraintlayout.core.parser.b
    /* renamed from: z, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a b() {
        a aVar = (a) super.clone();
        ArrayList arrayList = new ArrayList(this.f30031f.size());
        Iterator it = this.f30031f.iterator();
        while (it.hasNext()) {
            b bVarClone = ((b) it.next()).clone();
            bVarClone.q(aVar);
            arrayList.add(bVarClone);
        }
        aVar.f30031f = arrayList;
        return aVar;
    }
}
