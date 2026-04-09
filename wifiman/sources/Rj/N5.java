package rj;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public class N5 {

    /* renamed from: a, reason: collision with root package name */
    private org.kodein.type.q f60600a;

    /* renamed from: b, reason: collision with root package name */
    private org.kodein.type.q f60601b;

    /* renamed from: c, reason: collision with root package name */
    private org.kodein.type.q f60602c;

    /* renamed from: d, reason: collision with root package name */
    private Object f60603d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f60604a = new a();

        private a() {
        }
    }

    public N5(org.kodein.type.q qVar, org.kodein.type.q qVar2, org.kodein.type.q qVar3, Object obj) {
        this.f60600a = qVar;
        this.f60601b = qVar2;
        this.f60602c = qVar3;
        this.f60603d = obj;
    }

    public final org.kodein.type.q a() {
        return this.f60601b;
    }

    public final org.kodein.type.q b() {
        return this.f60600a;
    }

    public final Object c() {
        return this.f60603d;
    }

    public final org.kodein.type.q d() {
        return this.f60602c;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f60600a != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("contextType=");
            org.kodein.type.q qVar = this.f60600a;
            sb2.append(qVar != null ? qVar.i() : null);
            arrayList.add(sb2.toString());
        }
        if (this.f60601b != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("argType=");
            org.kodein.type.q qVar2 = this.f60601b;
            sb3.append(qVar2 != null ? qVar2.i() : null);
            arrayList.add(sb3.toString());
        }
        if (this.f60602c != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("type=");
            org.kodein.type.q qVar3 = this.f60602c;
            sb4.append(qVar3 != null ? qVar3.i() : null);
            arrayList.add(sb4.toString());
        }
        if (!AbstractC6492s.d(this.f60603d, a.f60604a)) {
            arrayList.add("tag=" + this.f60603d);
        }
        return '[' + AbstractC3689v.z0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }

    public /* synthetic */ N5(org.kodein.type.q qVar, org.kodein.type.q qVar2, org.kodein.type.q qVar3, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : qVar, (i10 & 2) != 0 ? null : qVar2, (i10 & 4) != 0 ? null : qVar3, (i10 & 8) != 0 ? a.f60604a : obj);
    }
}
