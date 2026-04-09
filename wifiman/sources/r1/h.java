package R1;

import O1.j;
import Q1.f;
import Q1.h;
import R1.d;
import Yg.J;
import Zg.AbstractC3689v;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.AbstractC3985v;
import dh.InterfaceC5380e;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public static final h f19553a = new h();

    /* renamed from: b, reason: collision with root package name */
    private static final String f19554b = "preferences_pb";

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19555a;

        static {
            int[] iArr = new int[h.b.values().length];
            iArr[h.b.BOOLEAN.ordinal()] = 1;
            iArr[h.b.FLOAT.ordinal()] = 2;
            iArr[h.b.DOUBLE.ordinal()] = 3;
            iArr[h.b.INTEGER.ordinal()] = 4;
            iArr[h.b.LONG.ordinal()] = 5;
            iArr[h.b.STRING.ordinal()] = 6;
            iArr[h.b.STRING_SET.ordinal()] = 7;
            iArr[h.b.VALUE_NOT_SET.ordinal()] = 8;
            f19555a = iArr;
        }
    }

    private h() {
    }

    private final void d(String str, Q1.h hVar, R1.a aVar) throws CorruptionException {
        h.b bVarX = hVar.X();
        switch (bVarX == null ? -1 : a.f19555a[bVarX.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                aVar.i(f.a(str), Boolean.valueOf(hVar.P()));
                return;
            case 2:
                aVar.i(f.c(str), Float.valueOf(hVar.S()));
                return;
            case 3:
                aVar.i(f.b(str), Double.valueOf(hVar.R()));
                return;
            case 4:
                aVar.i(f.d(str), Integer.valueOf(hVar.T()));
                return;
            case 5:
                aVar.i(f.e(str), Long.valueOf(hVar.U()));
                return;
            case 6:
                d.a aVarF = f.f(str);
                String strV = hVar.V();
                AbstractC6492s.h(strV, "value.string");
                aVar.i(aVarF, strV);
                return;
            case 7:
                d.a aVarG = f.g(str);
                List listM = hVar.W().M();
                AbstractC6492s.h(listM, "value.stringSet.stringsList");
                aVar.i(aVarG, AbstractC3689v.n1(listM));
                return;
            case 8:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    private final Q1.h g(Object obj) {
        if (obj instanceof Boolean) {
            AbstractC3985v abstractC3985vN = Q1.h.Y().x(((Boolean) obj).booleanValue()).n();
            AbstractC6492s.h(abstractC3985vN, "newBuilder().setBoolean(value).build()");
            return (Q1.h) abstractC3985vN;
        }
        if (obj instanceof Float) {
            AbstractC3985v abstractC3985vN2 = Q1.h.Y().A(((Number) obj).floatValue()).n();
            AbstractC6492s.h(abstractC3985vN2, "newBuilder().setFloat(value).build()");
            return (Q1.h) abstractC3985vN2;
        }
        if (obj instanceof Double) {
            AbstractC3985v abstractC3985vN3 = Q1.h.Y().z(((Number) obj).doubleValue()).n();
            AbstractC6492s.h(abstractC3985vN3, "newBuilder().setDouble(value).build()");
            return (Q1.h) abstractC3985vN3;
        }
        if (obj instanceof Integer) {
            AbstractC3985v abstractC3985vN4 = Q1.h.Y().B(((Number) obj).intValue()).n();
            AbstractC6492s.h(abstractC3985vN4, "newBuilder().setInteger(value).build()");
            return (Q1.h) abstractC3985vN4;
        }
        if (obj instanceof Long) {
            AbstractC3985v abstractC3985vN5 = Q1.h.Y().D(((Number) obj).longValue()).n();
            AbstractC6492s.h(abstractC3985vN5, "newBuilder().setLong(value).build()");
            return (Q1.h) abstractC3985vN5;
        }
        if (obj instanceof String) {
            AbstractC3985v abstractC3985vN6 = Q1.h.Y().E((String) obj).n();
            AbstractC6492s.h(abstractC3985vN6, "newBuilder().setString(value).build()");
            return (Q1.h) abstractC3985vN6;
        }
        if (!(obj instanceof Set)) {
            throw new IllegalStateException(AbstractC6492s.p("PreferencesSerializer does not support type: ", obj.getClass().getName()));
        }
        AbstractC3985v abstractC3985vN7 = Q1.h.Y().F(Q1.g.N().x((Set) obj)).n();
        AbstractC6492s.h(abstractC3985vN7, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
        return (Q1.h) abstractC3985vN7;
    }

    @Override // O1.j
    public Object c(InputStream inputStream, InterfaceC5380e interfaceC5380e) throws CorruptionException {
        Q1.f fVarA = Q1.d.f19121a.a(inputStream);
        R1.a aVarB = e.b(new d.b[0]);
        Map mapK = fVarA.K();
        AbstractC6492s.h(mapK, "preferencesProto.preferencesMap");
        for (Map.Entry entry : mapK.entrySet()) {
            String name = (String) entry.getKey();
            Q1.h value = (Q1.h) entry.getValue();
            h hVar = f19553a;
            AbstractC6492s.h(name, "name");
            AbstractC6492s.h(value, "value");
            hVar.d(name, value, aVarB);
        }
        return aVarB.d();
    }

    @Override // O1.j
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public d b() {
        return e.a();
    }

    public final String f() {
        return f19554b;
    }

    @Override // O1.j
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object a(d dVar, OutputStream outputStream, InterfaceC5380e interfaceC5380e) {
        Map mapA = dVar.a();
        f.a aVarN = Q1.f.N();
        for (Map.Entry entry : mapA.entrySet()) {
            aVarN.x(((d.a) entry.getKey()).a(), g(entry.getValue()));
        }
        ((Q1.f) aVarN.n()).i(outputStream);
        return J.f24997a;
    }
}
