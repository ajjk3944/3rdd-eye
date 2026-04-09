package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h01 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public h01(String str, HashMap map, HashSet hashSet, HashSet hashSet2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(hashSet);
        this.d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static h01 a(lx lxVar, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        Cursor cursorP = lxVar.p(ex0.h("PRAGMA table_info(`", str, "`)"));
        HashMap map = new HashMap();
        try {
            if (cursorP.getColumnCount() > 0) {
                int columnIndex = cursorP.getColumnIndex("name");
                int columnIndex2 = cursorP.getColumnIndex("type");
                int columnIndex3 = cursorP.getColumnIndex("notnull");
                int columnIndex4 = cursorP.getColumnIndex("pk");
                int columnIndex5 = cursorP.getColumnIndex("dflt_value");
                while (cursorP.moveToNext()) {
                    String string = cursorP.getString(columnIndex);
                    map.put(string, new d01(cursorP.getInt(columnIndex4), 2, string, cursorP.getString(columnIndex2), cursorP.getString(columnIndex5), cursorP.getInt(columnIndex3) != 0));
                }
            }
            cursorP.close();
            HashSet hashSet = new HashSet();
            cursorP = lxVar.p("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorP.getColumnIndex("id");
                int columnIndex7 = cursorP.getColumnIndex("seq");
                int columnIndex8 = cursorP.getColumnIndex("table");
                int columnIndex9 = cursorP.getColumnIndex("on_delete");
                int columnIndex10 = cursorP.getColumnIndex("on_update");
                ArrayList arrayListB = b(cursorP);
                int count = cursorP.getCount();
                int i5 = 0;
                while (i5 < count) {
                    cursorP.moveToPosition(i5);
                    if (cursorP.getInt(columnIndex7) != 0) {
                        i = i5;
                        i2 = columnIndex6;
                        i3 = columnIndex7;
                        arrayList = arrayListB;
                        i4 = count;
                    } else {
                        int i6 = cursorP.getInt(columnIndex6);
                        i = i5;
                        ArrayList arrayList2 = new ArrayList();
                        i2 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        i3 = columnIndex7;
                        int size = arrayListB.size();
                        i4 = count;
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayListB.get(i7);
                            i7++;
                            int i8 = size;
                            f01 f01Var = (f01) obj;
                            ArrayList arrayList4 = arrayListB;
                            if (f01Var.f == i6) {
                                arrayList2.add(f01Var.h);
                                arrayList3.add(f01Var.i);
                            }
                            size = i8;
                            arrayListB = arrayList4;
                        }
                        arrayList = arrayListB;
                        hashSet.add(new e01(cursorP.getString(columnIndex8), cursorP.getString(columnIndex9), cursorP.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i5 = i + 1;
                    columnIndex6 = i2;
                    columnIndex7 = i3;
                    count = i4;
                    arrayListB = arrayList;
                }
                cursorP.close();
                cursorP = lxVar.p("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorP.getColumnIndex("name");
                    int columnIndex12 = cursorP.getColumnIndex("origin");
                    int columnIndex13 = cursorP.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        break;
                    }
                    HashSet hashSet3 = new HashSet();
                    while (cursorP.moveToNext()) {
                        if ("c".equals(cursorP.getString(columnIndex12))) {
                            g01 g01VarC = c(lxVar, cursorP.getString(columnIndex11), cursorP.getInt(columnIndex13) == 1);
                            if (g01VarC == null) {
                                break;
                            }
                            hashSet3.add(g01VarC);
                        }
                    }
                    cursorP.close();
                    hashSet2 = hashSet3;
                    return new h01(str, map, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new f01(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public static g01 c(lx lxVar, String str, boolean z) {
        Cursor cursorP = lxVar.p(ex0.h("PRAGMA index_xinfo(`", str, "`)"));
        try {
            int columnIndex = cursorP.getColumnIndex("seqno");
            int columnIndex2 = cursorP.getColumnIndex("cid");
            int columnIndex3 = cursorP.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorP.moveToNext()) {
                    if (cursorP.getInt(columnIndex2) >= 0) {
                        int i = cursorP.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i), cursorP.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                g01 g01Var = new g01(str, arrayList, z);
                cursorP.close();
                return g01Var;
            }
            cursorP.close();
            return null;
        } catch (Throwable th) {
            cursorP.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || h01.class != obj.getClass()) {
            return false;
        }
        h01 h01Var = (h01) obj;
        Set set2 = h01Var.c;
        Map map = h01Var.b;
        String str = h01Var.a;
        String str2 = this.a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map map2 = this.b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set set3 = this.c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set set4 = this.d;
        if (set4 == null || (set = h01Var.d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
