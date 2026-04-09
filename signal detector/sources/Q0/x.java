package q0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import d5.AbstractC2282j;
import d5.C2273a;
import java.util.ArrayList;
import java.util.Iterator;
import o.a1;
import r0.AbstractC2869a;
import u.AbstractC2939h;
import u.C2941j;

/* loaded from: classes.dex */
public final class x extends v implements Iterable, r5.a {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f23047n = 0;

    /* renamed from: k, reason: collision with root package name */
    public final C2941j f23048k;

    /* renamed from: l, reason: collision with root package name */
    public int f23049l;

    /* renamed from: m, reason: collision with root package name */
    public String f23050m;

    public x(y yVar) {
        super(yVar);
        this.f23048k = new C2941j();
    }

    @Override // q0.v
    public final u e(a1 a1Var) {
        u uVarE = super.e(a1Var);
        ArrayList arrayList = new ArrayList();
        w wVar = new w(this);
        while (wVar.hasNext()) {
            u uVarE2 = ((v) wVar.next()).e(a1Var);
            if (uVarE2 != null) {
                arrayList.add(uVarE2);
            }
        }
        u[] uVarArr = {uVarE, (u) AbstractC2282j.a0(arrayList)};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 2; i++) {
            u uVar = uVarArr[i];
            if (uVar != null) {
                arrayList2.add(uVar);
            }
        }
        return (u) AbstractC2282j.a0(arrayList2);
    }

    @Override // q0.v
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof x)) {
            return false;
        }
        C2941j c2941j = this.f23048k;
        x5.g gVarK = x5.h.K(AbstractC2939h.d(c2941j));
        ArrayList arrayList = new ArrayList();
        Iterator it = ((x5.a) gVarK).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        x xVar = (x) obj;
        C2941j c2941j2 = xVar.f23048k;
        C2273a c2273aD = AbstractC2939h.d(c2941j2);
        while (c2273aD.hasNext()) {
            arrayList.remove((v) c2273aD.next());
        }
        return super.equals(obj) && c2941j.g() == c2941j2.g() && this.f23049l == xVar.f23049l && arrayList.isEmpty();
    }

    @Override // q0.v
    public final void f(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        String strValueOf;
        super.f(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC2869a.f23323d);
        q5.i.d(typedArrayObtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        if (resourceId == this.f23043h) {
            throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + this).toString());
        }
        this.f23049l = resourceId;
        this.f23050m = null;
        if (resourceId <= 16777215) {
            strValueOf = String.valueOf(resourceId);
        } else {
            try {
                strValueOf = context.getResources().getResourceName(resourceId);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(resourceId);
            }
            q5.i.d(strValueOf, "try {\n                co….toString()\n            }");
        }
        this.f23050m = strValueOf;
        typedArrayObtainAttributes.recycle();
    }

    public final void g(v vVar) {
        q5.i.e(vVar, "node");
        int i = vVar.f23043h;
        String str = vVar.i;
        if (i == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        String str2 = this.i;
        if (str2 != null && q5.i.a(str, str2)) {
            throw new IllegalArgumentException(("Destination " + vVar + " cannot have the same route as graph " + this).toString());
        }
        if (i == this.f23043h) {
            throw new IllegalArgumentException(("Destination " + vVar + " cannot have the same id as graph " + this).toString());
        }
        C2941j c2941j = this.f23048k;
        v vVar2 = (v) c2941j.d(i);
        if (vVar2 == vVar) {
            return;
        }
        if (vVar.f23037b != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (vVar2 != null) {
            vVar2.f23037b = null;
        }
        vVar.f23037b = this;
        c2941j.f(vVar.f23043h, vVar);
    }

    public final v h(int i, boolean z6) {
        x xVar;
        v vVar = (v) this.f23048k.d(i);
        if (vVar != null) {
            return vVar;
        }
        if (!z6 || (xVar = this.f23037b) == null) {
            return null;
        }
        return xVar.h(i, true);
    }

    @Override // q0.v
    public final int hashCode() {
        int iE = this.f23049l;
        C2941j c2941j = this.f23048k;
        int iG = c2941j.g();
        for (int i = 0; i < iG; i++) {
            iE = (((iE * 31) + c2941j.e(i)) * 31) + ((v) c2941j.h(i)).hashCode();
        }
        return iE;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new w(this);
    }

    @Override // q0.v
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        v vVarH = h(this.f23049l, true);
        sb.append(" startDestination=");
        if (vVarH == null) {
            String str = this.f23050m;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x" + Integer.toHexString(this.f23049l));
            }
        } else {
            sb.append("{");
            sb.append(vVarH.toString());
            sb.append("}");
        }
        String string = sb.toString();
        q5.i.d(string, "sb.toString()");
        return string;
    }
}
