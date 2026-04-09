package p2;

import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import m2.EnumC6752j;

/* renamed from: p2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7212f {

    /* renamed from: e, reason: collision with root package name */
    public static final b f57510e = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f57511a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f57512b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f57513c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f57514d;

    /* renamed from: p2.f$a */
    public static final class a {

        /* renamed from: h, reason: collision with root package name */
        public static final C2027a f57515h = new C2027a(null);

        /* renamed from: a, reason: collision with root package name */
        public final String f57516a;

        /* renamed from: b, reason: collision with root package name */
        public final String f57517b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f57518c;

        /* renamed from: d, reason: collision with root package name */
        public final int f57519d;

        /* renamed from: e, reason: collision with root package name */
        public final String f57520e;

        /* renamed from: f, reason: collision with root package name */
        public final int f57521f;

        /* renamed from: g, reason: collision with root package name */
        public final int f57522g;

        /* renamed from: p2.f$a$a, reason: collision with other inner class name */
        public static final class C2027a {
            public /* synthetic */ C2027a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < str.length()) {
                    char cCharAt = str.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && cCharAt != '(') {
                        return false;
                    }
                    if (cCharAt == '(') {
                        i11++;
                    } else if (cCharAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                        return false;
                    }
                    i10++;
                    i12 = i13;
                }
                return i11 == 0;
            }

            public final boolean b(String current, String str) {
                AbstractC6492s.i(current, "current");
                if (AbstractC6492s.d(current, str)) {
                    return true;
                }
                if (!a(current)) {
                    return false;
                }
                String strSubstring = current.substring(1, current.length() - 1);
                AbstractC6492s.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return AbstractC6492s.d(t.q1(strSubstring).toString(), str);
            }

            private C2027a() {
            }
        }

        public a(String name, String type, boolean z10, int i10, String str, int i11) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(type, "type");
            this.f57516a = name;
            this.f57517b = type;
            this.f57518c = z10;
            this.f57519d = i10;
            this.f57520e = str;
            this.f57521f = i11;
            this.f57522g = a(type);
        }

        private final int a(String str) {
            if (str == null) {
                return 5;
            }
            Locale US = Locale.US;
            AbstractC6492s.h(US, "US");
            String upperCase = str.toUpperCase(US);
            AbstractC6492s.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (t.W(upperCase, "INT", false, 2, null)) {
                return 3;
            }
            if (t.W(upperCase, "CHAR", false, 2, null) || t.W(upperCase, "CLOB", false, 2, null) || t.W(upperCase, "TEXT", false, 2, null)) {
                return 2;
            }
            if (t.W(upperCase, "BLOB", false, 2, null)) {
                return 5;
            }
            return (t.W(upperCase, "REAL", false, 2, null) || t.W(upperCase, "FLOA", false, 2, null) || t.W(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.f57519d != ((a) obj).f57519d) {
                return false;
            }
            a aVar = (a) obj;
            if (!AbstractC6492s.d(this.f57516a, aVar.f57516a) || this.f57518c != aVar.f57518c) {
                return false;
            }
            if (this.f57521f == 1 && aVar.f57521f == 2 && (str3 = this.f57520e) != null && !f57515h.b(str3, aVar.f57520e)) {
                return false;
            }
            if (this.f57521f == 2 && aVar.f57521f == 1 && (str2 = aVar.f57520e) != null && !f57515h.b(str2, this.f57520e)) {
                return false;
            }
            int i10 = this.f57521f;
            return (i10 == 0 || i10 != aVar.f57521f || ((str = this.f57520e) == null ? aVar.f57520e == null : f57515h.b(str, aVar.f57520e))) && this.f57522g == aVar.f57522g;
        }

        public int hashCode() {
            return (((((this.f57516a.hashCode() * 31) + this.f57522g) * 31) + (this.f57518c ? 1231 : 1237)) * 31) + this.f57519d;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Column{name='");
            sb2.append(this.f57516a);
            sb2.append("', type='");
            sb2.append(this.f57517b);
            sb2.append("', affinity='");
            sb2.append(this.f57522g);
            sb2.append("', notNull=");
            sb2.append(this.f57518c);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f57519d);
            sb2.append(", defaultValue='");
            String str = this.f57520e;
            if (str == null) {
                str = "undefined";
            }
            sb2.append(str);
            sb2.append("'}");
            return sb2.toString();
        }
    }

    /* renamed from: p2.f$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7212f a(SupportSQLiteDatabase database, String tableName) {
            AbstractC6492s.i(database, "database");
            AbstractC6492s.i(tableName, "tableName");
            return AbstractC7213g.f(database, tableName);
        }

        private b() {
        }
    }

    /* renamed from: p2.f$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f57523a;

        /* renamed from: b, reason: collision with root package name */
        public final String f57524b;

        /* renamed from: c, reason: collision with root package name */
        public final String f57525c;

        /* renamed from: d, reason: collision with root package name */
        public final List f57526d;

        /* renamed from: e, reason: collision with root package name */
        public final List f57527e;

        public c(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
            AbstractC6492s.i(referenceTable, "referenceTable");
            AbstractC6492s.i(onDelete, "onDelete");
            AbstractC6492s.i(onUpdate, "onUpdate");
            AbstractC6492s.i(columnNames, "columnNames");
            AbstractC6492s.i(referenceColumnNames, "referenceColumnNames");
            this.f57523a = referenceTable;
            this.f57524b = onDelete;
            this.f57525c = onUpdate;
            this.f57526d = columnNames;
            this.f57527e = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC6492s.d(this.f57523a, cVar.f57523a) && AbstractC6492s.d(this.f57524b, cVar.f57524b) && AbstractC6492s.d(this.f57525c, cVar.f57525c) && AbstractC6492s.d(this.f57526d, cVar.f57526d)) {
                return AbstractC6492s.d(this.f57527e, cVar.f57527e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f57523a.hashCode() * 31) + this.f57524b.hashCode()) * 31) + this.f57525c.hashCode()) * 31) + this.f57526d.hashCode()) * 31) + this.f57527e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f57523a + "', onDelete='" + this.f57524b + " +', onUpdate='" + this.f57525c + "', columnNames=" + this.f57526d + ", referenceColumnNames=" + this.f57527e + '}';
        }
    }

    /* renamed from: p2.f$d */
    public static final class d implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        private final int f57528a;

        /* renamed from: b, reason: collision with root package name */
        private final int f57529b;

        /* renamed from: c, reason: collision with root package name */
        private final String f57530c;

        /* renamed from: d, reason: collision with root package name */
        private final String f57531d;

        public d(int i10, int i11, String from, String to) {
            AbstractC6492s.i(from, "from");
            AbstractC6492s.i(to, "to");
            this.f57528a = i10;
            this.f57529b = i11;
            this.f57530c = from;
            this.f57531d = to;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d other) {
            AbstractC6492s.i(other, "other");
            int i10 = this.f57528a - other.f57528a;
            return i10 == 0 ? this.f57529b - other.f57529b : i10;
        }

        public final String b() {
            return this.f57530c;
        }

        public final int c() {
            return this.f57528a;
        }

        public final String d() {
            return this.f57531d;
        }
    }

    /* renamed from: p2.f$e */
    public static final class e {

        /* renamed from: e, reason: collision with root package name */
        public static final a f57532e = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final String f57533a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f57534b;

        /* renamed from: c, reason: collision with root package name */
        public final List f57535c;

        /* renamed from: d, reason: collision with root package name */
        public List f57536d;

        /* renamed from: p2.f$e$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public e(String name, boolean z10, List columns, List orders) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(columns, "columns");
            AbstractC6492s.i(orders, "orders");
            this.f57533a = name;
            this.f57534b = z10;
            this.f57535c = columns;
            this.f57536d = orders;
            List arrayList = orders;
            if (arrayList.isEmpty()) {
                int size = columns.size();
                arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(EnumC6752j.ASC.name());
                }
            }
            this.f57536d = (List) arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f57534b == eVar.f57534b && AbstractC6492s.d(this.f57535c, eVar.f57535c) && AbstractC6492s.d(this.f57536d, eVar.f57536d)) {
                return t.P(this.f57533a, "index_", false, 2, null) ? t.P(eVar.f57533a, "index_", false, 2, null) : AbstractC6492s.d(this.f57533a, eVar.f57533a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((t.P(this.f57533a, "index_", false, 2, null) ? -1184239155 : this.f57533a.hashCode()) * 31) + (this.f57534b ? 1 : 0)) * 31) + this.f57535c.hashCode()) * 31) + this.f57536d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f57533a + "', unique=" + this.f57534b + ", columns=" + this.f57535c + ", orders=" + this.f57536d + "'}";
        }
    }

    public C7212f(String name, Map columns, Set foreignKeys, Set set) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(columns, "columns");
        AbstractC6492s.i(foreignKeys, "foreignKeys");
        this.f57511a = name;
        this.f57512b = columns;
        this.f57513c = foreignKeys;
        this.f57514d = set;
    }

    public static final C7212f a(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return f57510e.a(supportSQLiteDatabase, str);
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7212f)) {
            return false;
        }
        C7212f c7212f = (C7212f) obj;
        if (!AbstractC6492s.d(this.f57511a, c7212f.f57511a) || !AbstractC6492s.d(this.f57512b, c7212f.f57512b) || !AbstractC6492s.d(this.f57513c, c7212f.f57513c)) {
            return false;
        }
        Set set2 = this.f57514d;
        if (set2 == null || (set = c7212f.f57514d) == null) {
            return true;
        }
        return AbstractC6492s.d(set2, set);
    }

    public int hashCode() {
        return (((this.f57511a.hashCode() * 31) + this.f57512b.hashCode()) * 31) + this.f57513c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f57511a + "', columns=" + this.f57512b + ", foreignKeys=" + this.f57513c + ", indices=" + this.f57514d + '}';
    }
}
