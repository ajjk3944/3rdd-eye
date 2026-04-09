package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: c, reason: collision with root package name */
    public static final a1 f1244c = new a1();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f1246b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final l0 f1245a = new l0();

    public final d1 a(Class cls) {
        d1 d1VarW;
        Class cls2;
        c0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f1246b;
        d1 d1Var = (d1) concurrentHashMap.get(cls);
        if (d1Var != null) {
            return d1Var;
        }
        l0 l0Var = this.f1245a;
        l0Var.getClass();
        Class cls3 = e1.f1265a;
        if (!a0.class.isAssignableFrom(cls) && (cls2 = e1.f1265a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        c1 c1VarA = ((k0) l0Var.f1316a).a(cls);
        int i10 = c1VarA.f1258d;
        a aVar = c1VarA.f1255a;
        if ((i10 & 2) == 2) {
            if (a0.class.isAssignableFrom(cls)) {
                d1VarW = new u0(e1.f1267c, r.f1344a, aVar);
            } else {
                l1 l1Var = e1.f1266b;
                q qVar = r.f1345b;
                if (qVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                d1VarW = new u0(l1Var, qVar, aVar);
            }
        } else if (a0.class.isAssignableFrom(cls)) {
            q qVar2 = null;
            v0 v0Var = w0.f1376b;
            h0 h0Var = i0.f1297b;
            l1 l1Var2 = e1.f1267c;
            if (j0.f1302a[c1VarA.a().ordinal()] != 1) {
                qVar2 = r.f1344a;
            }
            q qVar3 = qVar2;
            p0 p0Var = q0.f1336b;
            if (!(c1VarA instanceof c1)) {
                int[] iArr = t0.f1353n;
                c1VarA.getClass();
                throw new ClassCastException();
            }
            d1VarW = t0.w(c1VarA, v0Var, h0Var, l1Var2, qVar3, p0Var);
        } else {
            q qVar4 = null;
            v0 v0Var2 = w0.f1375a;
            h0 h0Var2 = i0.f1296a;
            l1 l1Var3 = e1.f1266b;
            if (j0.f1302a[c1VarA.a().ordinal()] != 1 && (qVar4 = r.f1345b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            q qVar5 = qVar4;
            p0 p0Var2 = q0.f1335a;
            if (!(c1VarA instanceof c1)) {
                int[] iArr2 = t0.f1353n;
                c1VarA.getClass();
                throw new ClassCastException();
            }
            d1VarW = t0.w(c1VarA, v0Var2, h0Var2, l1Var3, qVar5, p0Var2);
        }
        d1 d1Var2 = (d1) concurrentHashMap.putIfAbsent(cls, d1VarW);
        return d1Var2 != null ? d1Var2 : d1VarW;
    }
}
