package c2;

import androidx.work.t;
import b2.C1819F;
import b2.C1842w;
import b2.InterfaceC1826g;
import c9.C2092m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: StatusRunnable.java */
/* loaded from: classes.dex */
public final class u extends v<List<androidx.work.t>> {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T1.z f18436c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.work.v f18437d;

    public u(T1.z zVar, androidx.work.v vVar) {
        this.f18436c = zVar;
        this.f18437d = vVar;
    }

    @Override // c2.v
    public final List a() {
        String str;
        InterfaceC1826g interfaceC1826gU = this.f18436c.f12232c.u();
        androidx.work.v vVar = this.f18437d;
        kotlin.jvm.internal.l.f(vVar, "<this>");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        ArrayList states = vVar.f17037d;
        kotlin.jvm.internal.l.e(states, "states");
        String str2 = " AND";
        if (states.isEmpty()) {
            str = " WHERE";
        } else {
            ArrayList arrayList2 = new ArrayList(C2092m.T(states, 10));
            Iterator it = states.iterator();
            while (it.hasNext()) {
                t.b bVar = (t.b) it.next();
                kotlin.jvm.internal.l.c(bVar);
                arrayList2.add(Integer.valueOf(C1819F.j(bVar)));
            }
            sb.append(" WHERE state IN (");
            r.a(sb, arrayList2.size());
            sb.append(")");
            arrayList.addAll(arrayList2);
            str = " AND";
        }
        ArrayList ids = vVar.f17034a;
        kotlin.jvm.internal.l.e(ids, "ids");
        if (!ids.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(C2092m.T(ids, 10));
            Iterator it2 = ids.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((UUID) it2.next()).toString());
            }
            sb.append(str.concat(" id IN ("));
            r.a(sb, ids.size());
            sb.append(")");
            arrayList.addAll(arrayList3);
            str = " AND";
        }
        ArrayList tags = vVar.f17036c;
        kotlin.jvm.internal.l.e(tags, "tags");
        if (tags.isEmpty()) {
            str2 = str;
        } else {
            sb.append(str.concat(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
            r.a(sb, tags.size());
            sb.append("))");
            arrayList.addAll(tags);
        }
        ArrayList uniqueWorkNames = vVar.f17035b;
        kotlin.jvm.internal.l.e(uniqueWorkNames, "uniqueWorkNames");
        if (!uniqueWorkNames.isEmpty()) {
            sb.append(str2.concat(" id IN (SELECT work_spec_id FROM workname WHERE name IN ("));
            r.a(sb, uniqueWorkNames.size());
            sb.append("))");
            arrayList.addAll(uniqueWorkNames);
        }
        sb.append(";");
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "builder.toString()");
        return (List) C1842w.f17137y.apply(interfaceC1826gU.a(new F1.a(string, arrayList.toArray(new Object[0]))));
    }
}
