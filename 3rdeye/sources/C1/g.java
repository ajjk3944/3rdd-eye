package C1;

import b9.C1992A;
import c9.C2079C;
import c9.C2097r;
import c9.C2099t;
import c9.C2100u;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.singular.sdk.internal.Constants;
import d9.C4285c;
import d9.C4289g;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.l;
import t4.C5606d;
import y9.C5828j;
import y9.n;
import y9.q;
import z1.C5852a;

/* compiled from: TableInfo.android.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f844a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f845b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractSet f846c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractSet f847d;

    /* compiled from: TableInfo.android.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f848a;

        /* renamed from: b, reason: collision with root package name */
        public final String f849b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f850c;

        /* renamed from: d, reason: collision with root package name */
        public final int f851d;

        /* renamed from: e, reason: collision with root package name */
        public final String f852e;

        /* renamed from: f, reason: collision with root package name */
        public final int f853f;

        /* renamed from: g, reason: collision with root package name */
        public final int f854g;

        public a(int i, String name, String type, String str, boolean z10, int i10) {
            l.f(name, "name");
            l.f(type, "type");
            this.f848a = name;
            this.f849b = type;
            this.f850c = z10;
            this.f851d = i;
            this.f852e = str;
            this.f853f = i10;
            String upperCase = type.toUpperCase(Locale.ROOT);
            l.e(upperCase, "toUpperCase(...)");
            this.f854g = q.b0(upperCase, "INT", false) ? 3 : (q.b0(upperCase, "CHAR", false) || q.b0(upperCase, "CLOB", false) || q.b0(upperCase, "TEXT", false)) ? 2 : q.b0(upperCase, "BLOB", false) ? 5 : (q.b0(upperCase, "REAL", false) || q.b0(upperCase, "FLOA", false) || q.b0(upperCase, "DOUB", false)) ? 4 : 1;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if ((this.f851d > 0) == (aVar.f851d > 0) && l.b(this.f848a, aVar.f848a) && this.f850c == aVar.f850c) {
                        int i = aVar.f853f;
                        String str = aVar.f852e;
                        int i10 = this.f853f;
                        String str2 = this.f852e;
                        if ((i10 != 1 || i != 2 || str2 == null || j.a(str2, str)) && ((i10 != 2 || i != 1 || str == null || j.a(str, str2)) && ((i10 == 0 || i10 != i || (str2 == null ? str == null : j.a(str2, str))) && this.f854g == aVar.f854g))) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((((this.f848a.hashCode() * 31) + this.f854g) * 31) + (this.f850c ? 1231 : 1237)) * 31) + this.f851d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
            sb.append(this.f848a);
            sb.append("',\n            |   type = '");
            sb.append(this.f849b);
            sb.append("',\n            |   affinity = '");
            sb.append(this.f854g);
            sb.append("',\n            |   notNull = '");
            sb.append(this.f850c);
            sb.append("',\n            |   primaryKeyPosition = '");
            sb.append(this.f851d);
            sb.append("',\n            |   defaultValue = '");
            String str = this.f852e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'\n            |}\n        ");
            return C5828j.K(C5828j.M(sb.toString()));
        }
    }

    /* compiled from: TableInfo.android.kt */
    public static final class b {
        /* JADX WARN: Finally extract failed */
        public static g a(E1.a connection, String str) throws Exception {
            Map mapC;
            C4289g c4289gA;
            l.f(connection, "connection");
            E1.c cVarK0 = connection.K0("PRAGMA table_info(`" + str + "`)");
            try {
                long j4 = 0;
                if (cVarK0.x()) {
                    int iO = C5606d.o(cVarK0, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int iO2 = C5606d.o(cVarK0, "type");
                    int iO3 = C5606d.o(cVarK0, "notnull");
                    int iO4 = C5606d.o(cVarK0, Constants.REVENUE_PRODUCT_SKU_KEY);
                    int iO5 = C5606d.o(cVarK0, "dflt_value");
                    C4285c c4285c = new C4285c();
                    do {
                        String strG0 = cVarK0.g0(iO);
                        c4285c.put(strG0, new a((int) cVarK0.getLong(iO4), strG0, cVarK0.g0(iO2), cVarK0.isNull(iO5) ? null : cVarK0.g0(iO5), cVarK0.getLong(iO3) != 0, 2));
                    } while (cVarK0.x());
                    mapC = c4285c.c();
                    cVarK0.close();
                } else {
                    mapC = C2100u.f18582b;
                    cVarK0.close();
                }
                cVarK0 = connection.K0("PRAGMA foreign_key_list(`" + str + "`)");
                try {
                    int iO6 = C5606d.o(cVarK0, FacebookMediationAdapter.KEY_ID);
                    int iO7 = C5606d.o(cVarK0, "seq");
                    int iO8 = C5606d.o(cVarK0, "table");
                    int iO9 = C5606d.o(cVarK0, "on_delete");
                    int iO10 = C5606d.o(cVarK0, "on_update");
                    List<C1.c> listA = f.a(cVarK0);
                    cVarK0.reset();
                    C4289g c4289g = new C4289g();
                    while (cVarK0.x()) {
                        if (cVarK0.getLong(iO7) == j4) {
                            int i = (int) cVarK0.getLong(iO6);
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            int i10 = iO6;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : listA) {
                                int i11 = iO7;
                                List<C1.c> list = listA;
                                if (((C1.c) obj).f840b == i) {
                                    arrayList3.add(obj);
                                }
                                iO7 = i11;
                                listA = list;
                            }
                            int i12 = iO7;
                            List<C1.c> list2 = listA;
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                C1.c cVar = (C1.c) it.next();
                                arrayList.add(cVar.f842d);
                                arrayList2.add(cVar.f843e);
                            }
                            c4289g.add(new c(cVarK0.g0(iO8), cVarK0.g0(iO9), cVarK0.g0(iO10), arrayList, arrayList2));
                            iO6 = i10;
                            iO7 = i12;
                            listA = list2;
                            j4 = 0;
                        }
                    }
                    C4289g c4289gA2 = C2079C.a(c4289g);
                    cVarK0.close();
                    cVarK0 = connection.K0("PRAGMA index_list(`" + str + "`)");
                    try {
                        int iO11 = C5606d.o(cVarK0, AppMeasurementSdk.ConditionalUserProperty.NAME);
                        int iO12 = C5606d.o(cVarK0, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
                        int iO13 = C5606d.o(cVarK0, "unique");
                        if (iO11 != -1 && iO12 != -1 && iO13 != -1) {
                            C4289g c4289g2 = new C4289g();
                            while (cVarK0.x()) {
                                if ("c".equals(cVarK0.g0(iO12))) {
                                    d dVarB = f.b(connection, cVarK0.g0(iO11), cVarK0.getLong(iO13) == 1);
                                    if (dVarB == null) {
                                        cVarK0.close();
                                    } else {
                                        c4289g2.add(dVarB);
                                    }
                                }
                            }
                            c4289gA = C2079C.a(c4289g2);
                            cVarK0.close();
                            return new g(str, mapC, c4289gA2, c4289gA);
                        }
                        cVarK0.close();
                        c4289gA = null;
                        return new g(str, mapC, c4289gA2, c4289gA);
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    /* compiled from: TableInfo.android.kt */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f855a;

        /* renamed from: b, reason: collision with root package name */
        public final String f856b;

        /* renamed from: c, reason: collision with root package name */
        public final String f857c;

        /* renamed from: d, reason: collision with root package name */
        public final List<String> f858d;

        /* renamed from: e, reason: collision with root package name */
        public final List<String> f859e;

        public c(String referenceTable, String onDelete, String onUpdate, List<String> columnNames, List<String> referenceColumnNames) {
            l.f(referenceTable, "referenceTable");
            l.f(onDelete, "onDelete");
            l.f(onUpdate, "onUpdate");
            l.f(columnNames, "columnNames");
            l.f(referenceColumnNames, "referenceColumnNames");
            this.f855a = referenceTable;
            this.f856b = onDelete;
            this.f857c = onUpdate;
            this.f858d = columnNames;
            this.f859e = referenceColumnNames;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (l.b(this.f855a, cVar.f855a) && l.b(this.f856b, cVar.f856b) && l.b(this.f857c, cVar.f857c) && l.b(this.f858d, cVar.f858d)) {
                return l.b(this.f859e, cVar.f859e);
            }
            return false;
        }

        public final int hashCode() {
            return this.f859e.hashCode() + ((this.f858d.hashCode() + B4.g.n(B4.g.n(this.f855a.hashCode() * 31, 31, this.f856b), 31, this.f857c)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
            sb.append(this.f855a);
            sb.append("',\n            |   onDelete = '");
            sb.append(this.f856b);
            sb.append("',\n            |   onUpdate = '");
            sb.append(this.f857c);
            sb.append("',\n            |   columnNames = {");
            C5828j.K(C2097r.u0(C2097r.B0(this.f858d), StringUtils.COMMA, null, null, null, 62));
            C5828j.K("},");
            C1992A c1992a = C1992A.f18074a;
            sb.append(c1992a);
            sb.append("\n            |   referenceColumnNames = {");
            C5828j.K(C2097r.u0(C2097r.B0(this.f859e), StringUtils.COMMA, null, null, null, 62));
            C5828j.K(" }");
            sb.append(c1992a);
            sb.append("\n            |}\n        ");
            return C5828j.K(C5828j.M(sb.toString()));
        }
    }

    /* compiled from: TableInfo.android.kt */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f860a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f861b;

        /* renamed from: c, reason: collision with root package name */
        public final List<String> f862c;

        /* renamed from: d, reason: collision with root package name */
        public final List<String> f863d;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public d(String name, boolean z10, List<String> columns, List<String> orders) {
            l.f(name, "name");
            l.f(columns, "columns");
            l.f(orders, "orders");
            this.f860a = name;
            this.f861b = z10;
            this.f862c = columns;
            this.f863d = orders;
            List<String> arrayList = orders;
            if (arrayList.isEmpty()) {
                int size = columns.size();
                arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add("ASC");
                }
            }
            this.f863d = (List) arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f861b == dVar.f861b && l.b(this.f862c, dVar.f862c) && l.b(this.f863d, dVar.f863d)) {
                    String str = this.f860a;
                    boolean zA0 = n.a0(str, "index_", false);
                    String str2 = dVar.f860a;
                    return zA0 ? n.a0(str2, "index_", false) : str.equals(str2);
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f860a;
            return this.f863d.hashCode() + ((this.f862c.hashCode() + ((((n.a0(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f861b ? 1 : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
            sb.append(this.f860a);
            sb.append("',\n            |   unique = '");
            sb.append(this.f861b);
            sb.append("',\n            |   columns = {");
            C5828j.K(C2097r.u0(this.f862c, StringUtils.COMMA, null, null, null, 62));
            C5828j.K("},");
            C1992A c1992a = C1992A.f18074a;
            sb.append(c1992a);
            sb.append("\n            |   orders = {");
            C5828j.K(C2097r.u0(this.f863d, StringUtils.COMMA, null, null, null, 62));
            C5828j.K(" }");
            sb.append(c1992a);
            sb.append("\n            |}\n        ");
            return C5828j.K(C5828j.M(sb.toString()));
        }
    }

    public g(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        l.f(foreignKeys, "foreignKeys");
        this.f844a = str;
        this.f845b = map;
        this.f846c = foreignKeys;
        this.f847d = abstractSet;
    }

    public static final g a(G1.d dVar, String str) {
        return b.a(new C5852a(dVar), str);
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f844a.equals(gVar.f844a) || !this.f845b.equals(gVar.f845b) || !l.b(this.f846c, gVar.f846c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f847d;
        if (abstractSet2 == null || (abstractSet = gVar.f847d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f846c.hashCode() + ((this.f845b.hashCode() + (this.f844a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.f844a);
        sb.append("',\n            |    columns = {");
        sb.append(j.b(C2097r.C0(new h(0), this.f845b.values())));
        sb.append("\n            |    foreignKeys = {");
        sb.append(j.b(this.f846c));
        sb.append("\n            |    indices = {");
        AbstractSet abstractSet = this.f847d;
        sb.append(j.b(abstractSet != null ? C2097r.C0(new i(), abstractSet) : C2099t.f18581b));
        sb.append("\n            |}\n        ");
        return C5828j.M(sb.toString());
    }
}
