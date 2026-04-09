package s1;

import android.database.Cursor;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f24232a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f24233b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f24234c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f24235d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f24236a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24237b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24238c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f24239d;

        /* renamed from: e, reason: collision with root package name */
        public final int f24240e;

        /* renamed from: f, reason: collision with root package name */
        public final String f24241f;

        /* renamed from: g, reason: collision with root package name */
        public final int f24242g;

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            this.f24236a = str;
            this.f24237b = str2;
            this.f24239d = z10;
            this.f24240e = i10;
            this.f24238c = a(str2);
            this.f24241f = str3;
            this.f24242g = i11;
        }

        public static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f24240e != aVar.f24240e || !this.f24236a.equals(aVar.f24236a) || this.f24239d != aVar.f24239d) {
                    return false;
                }
                if (this.f24242g == 1 && aVar.f24242g == 2 && (str3 = this.f24241f) != null && !str3.equals(aVar.f24241f)) {
                    return false;
                }
                if (this.f24242g == 2 && aVar.f24242g == 1 && (str2 = aVar.f24241f) != null && !str2.equals(this.f24241f)) {
                    return false;
                }
                int i10 = this.f24242g;
                if ((i10 == 0 || i10 != aVar.f24242g || ((str = this.f24241f) == null ? aVar.f24241f == null : str.equals(aVar.f24241f))) && this.f24238c == aVar.f24238c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f24236a.hashCode() * 31) + this.f24238c) * 31) + (this.f24239d ? 1231 : 1237)) * 31) + this.f24240e;
        }

        public String toString() {
            return "Column{name='" + this.f24236a + "', type='" + this.f24237b + "', affinity='" + this.f24238c + "', notNull=" + this.f24239d + ", primaryKeyPosition=" + this.f24240e + ", defaultValue='" + this.f24241f + "'}";
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f24243a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24244b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24245c;

        /* renamed from: d, reason: collision with root package name */
        public final List f24246d;

        /* renamed from: e, reason: collision with root package name */
        public final List f24247e;

        public b(String str, String str2, String str3, List list, List list2) {
            this.f24243a = str;
            this.f24244b = str2;
            this.f24245c = str3;
            this.f24246d = Collections.unmodifiableList(list);
            this.f24247e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f24243a.equals(bVar.f24243a) && this.f24244b.equals(bVar.f24244b) && this.f24245c.equals(bVar.f24245c) && this.f24246d.equals(bVar.f24246d)) {
                return this.f24247e.equals(bVar.f24247e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f24243a.hashCode() * 31) + this.f24244b.hashCode()) * 31) + this.f24245c.hashCode()) * 31) + this.f24246d.hashCode()) * 31) + this.f24247e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f24243a + "', onDelete='" + this.f24244b + "', onUpdate='" + this.f24245c + "', columnNames=" + this.f24246d + ", referenceColumnNames=" + this.f24247e + '}';
        }
    }

    public static class c implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final int f24248a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24249b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24250c;

        /* renamed from: d, reason: collision with root package name */
        public final String f24251d;

        public c(int i10, int i11, String str, String str2) {
            this.f24248a = i10;
            this.f24249b = i11;
            this.f24250c = str;
            this.f24251d = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i10 = this.f24248a - cVar.f24248a;
            return i10 == 0 ? this.f24249b - cVar.f24249b : i10;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f24252a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f24253b;

        /* renamed from: c, reason: collision with root package name */
        public final List f24254c;

        public d(String str, boolean z10, List list) {
            this.f24252a = str;
            this.f24253b = z10;
            this.f24254c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f24253b == dVar.f24253b && this.f24254c.equals(dVar.f24254c)) {
                return this.f24252a.startsWith("index_") ? dVar.f24252a.startsWith("index_") : this.f24252a.equals(dVar.f24252a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f24252a.startsWith("index_") ? -1184239155 : this.f24252a.hashCode()) * 31) + (this.f24253b ? 1 : 0)) * 31) + this.f24254c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f24252a + "', unique=" + this.f24253b + ", columns=" + this.f24254c + '}';
        }
    }

    public f(String str, Map map, Set set, Set set2) {
        this.f24232a = str;
        this.f24233b = Collections.unmodifiableMap(map);
        this.f24234c = Collections.unmodifiableSet(set);
        this.f24235d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static f a(u1.b bVar, String str) {
        return new f(str, b(bVar, str), d(bVar, str), f(bVar, str));
    }

    public static Map b(u1.b bVar, String str) {
        Cursor cursorO = bVar.O("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorO.getColumnCount() > 0) {
                int columnIndex = cursorO.getColumnIndex("name");
                int columnIndex2 = cursorO.getColumnIndex(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
                int columnIndex3 = cursorO.getColumnIndex("notnull");
                int columnIndex4 = cursorO.getColumnIndex("pk");
                int columnIndex5 = cursorO.getColumnIndex("dflt_value");
                while (cursorO.moveToNext()) {
                    String string = cursorO.getString(columnIndex);
                    map.put(string, new a(string, cursorO.getString(columnIndex2), cursorO.getInt(columnIndex3) != 0, cursorO.getInt(columnIndex4), cursorO.getString(columnIndex5), 2));
                }
            }
            return map;
        } finally {
            cursorO.close();
        }
    }

    public static List c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < count; i10++) {
            cursor.moveToPosition(i10);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static Set d(u1.b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorO = bVar.O("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorO.getColumnIndex("id");
            int columnIndex2 = cursorO.getColumnIndex("seq");
            int columnIndex3 = cursorO.getColumnIndex("table");
            int columnIndex4 = cursorO.getColumnIndex("on_delete");
            int columnIndex5 = cursorO.getColumnIndex("on_update");
            List<c> listC = c(cursorO);
            int count = cursorO.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                cursorO.moveToPosition(i10);
                if (cursorO.getInt(columnIndex2) == 0) {
                    int i11 = cursorO.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : listC) {
                        if (cVar.f24248a == i11) {
                            arrayList.add(cVar.f24250c);
                            arrayList2.add(cVar.f24251d);
                        }
                    }
                    hashSet.add(new b(cursorO.getString(columnIndex3), cursorO.getString(columnIndex4), cursorO.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            cursorO.close();
            return hashSet;
        } catch (Throwable th) {
            cursorO.close();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    public static d e(u1.b bVar, String str, boolean z10) {
        Cursor cursorO = bVar.O("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorO.getColumnIndex("seqno");
            int columnIndex2 = cursorO.getColumnIndex(BidResponsedEx.KEY_CID);
            int columnIndex3 = cursorO.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorO.moveToNext()) {
                    if (cursorO.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorO.getInt(columnIndex)), cursorO.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                d dVar = new d(str, z10, arrayList);
                cursorO.close();
                return dVar;
            }
            cursorO.close();
            return null;
        } catch (Throwable th) {
            cursorO.close();
            throw th;
        }
    }

    public static Set f(u1.b bVar, String str) {
        Cursor cursorO = bVar.O("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorO.getColumnIndex("name");
            int columnIndex2 = cursorO.getColumnIndex("origin");
            int columnIndex3 = cursorO.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (cursorO.moveToNext()) {
                    if ("c".equals(cursorO.getString(columnIndex2))) {
                        String string = cursorO.getString(columnIndex);
                        boolean z10 = true;
                        if (cursorO.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        d dVarE = e(bVar, string, z10);
                        if (dVarE == null) {
                            return null;
                        }
                        hashSet.add(dVarE);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            cursorO.close();
        }
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f24232a;
        if (str == null ? fVar.f24232a != null : !str.equals(fVar.f24232a)) {
            return false;
        }
        Map map = this.f24233b;
        if (map == null ? fVar.f24233b != null : !map.equals(fVar.f24233b)) {
            return false;
        }
        Set set2 = this.f24234c;
        if (set2 == null ? fVar.f24234c != null : !set2.equals(fVar.f24234c)) {
            return false;
        }
        Set set3 = this.f24235d;
        if (set3 == null || (set = fVar.f24235d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f24232a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f24233b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f24234c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.f24232a + "', columns=" + this.f24233b + ", foreignKeys=" + this.f24234c + ", indices=" + this.f24235d + '}';
    }
}
