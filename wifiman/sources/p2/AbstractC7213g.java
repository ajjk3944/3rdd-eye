package p2;

import Zg.AbstractC3689v;
import Zg.U;
import Zg.d0;
import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import jh.AbstractC6329b;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;
import p2.C7212f;

/* renamed from: p2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7213g {
    private static final Map a(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorQuery.getColumnCount() <= 0) {
                Map mapH = U.h();
                AbstractC6329b.a(cursorQuery, null);
                return mapH;
            }
            int columnIndex = cursorQuery.getColumnIndex("name");
            int columnIndex2 = cursorQuery.getColumnIndex("type");
            int columnIndex3 = cursorQuery.getColumnIndex("notnull");
            int columnIndex4 = cursorQuery.getColumnIndex("pk");
            int columnIndex5 = cursorQuery.getColumnIndex("dflt_value");
            Map mapC = U.c();
            while (cursorQuery.moveToNext()) {
                String name = cursorQuery.getString(columnIndex);
                String type = cursorQuery.getString(columnIndex2);
                boolean z10 = cursorQuery.getInt(columnIndex3) != 0;
                int i10 = cursorQuery.getInt(columnIndex4);
                String string = cursorQuery.getString(columnIndex5);
                AbstractC6492s.h(name, "name");
                AbstractC6492s.h(type, "type");
                mapC.put(name, new C7212f.a(name, type, z10, i10, string, 2));
            }
            Map mapB = U.b(mapC);
            AbstractC6329b.a(cursorQuery, null);
            return mapB;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC6329b.a(cursorQuery, th2);
                throw th3;
            }
        }
    }

    private static final List b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List listC = AbstractC3689v.c();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            AbstractC6492s.h(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            AbstractC6492s.h(string2, "cursor.getString(toColumnIndex)");
            listC.add(new C7212f.d(i10, i11, string, string2));
        }
        return AbstractC3689v.V0(AbstractC3689v.a(listC));
    }

    private static final Set c(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorQuery.getColumnIndex("id");
            int columnIndex2 = cursorQuery.getColumnIndex("seq");
            int columnIndex3 = cursorQuery.getColumnIndex("table");
            int columnIndex4 = cursorQuery.getColumnIndex("on_delete");
            int columnIndex5 = cursorQuery.getColumnIndex("on_update");
            List listB = b(cursorQuery);
            cursorQuery.moveToPosition(-1);
            Set setB = d0.b();
            while (cursorQuery.moveToNext()) {
                if (cursorQuery.getInt(columnIndex2) == 0) {
                    int i10 = cursorQuery.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<C7212f.d> arrayList3 = new ArrayList();
                    for (Object obj : listB) {
                        if (((C7212f.d) obj).c() == i10) {
                            arrayList3.add(obj);
                        }
                    }
                    for (C7212f.d dVar : arrayList3) {
                        arrayList.add(dVar.b());
                        arrayList2.add(dVar.d());
                    }
                    String string = cursorQuery.getString(columnIndex3);
                    AbstractC6492s.h(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursorQuery.getString(columnIndex4);
                    AbstractC6492s.h(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursorQuery.getString(columnIndex5);
                    AbstractC6492s.h(string3, "cursor.getString(onUpdateColumnIndex)");
                    setB.add(new C7212f.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set setA = d0.a(setB);
            AbstractC6329b.a(cursorQuery, null);
            return setA;
        } finally {
        }
    }

    private static final C7212f.e d(SupportSQLiteDatabase supportSQLiteDatabase, String str, boolean z10) {
        Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorQuery.getColumnIndex("seqno");
            int columnIndex2 = cursorQuery.getColumnIndex("cid");
            int columnIndex3 = cursorQuery.getColumnIndex("name");
            int columnIndex4 = cursorQuery.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorQuery.moveToNext()) {
                    if (cursorQuery.getInt(columnIndex2) >= 0) {
                        int i10 = cursorQuery.getInt(columnIndex);
                        String columnName = cursorQuery.getString(columnIndex3);
                        String str2 = cursorQuery.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i10);
                        AbstractC6492s.h(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                AbstractC6492s.h(collectionValues, "columnsMap.values");
                List listI1 = AbstractC3689v.i1(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                AbstractC6492s.h(collectionValues2, "ordersMap.values");
                C7212f.e eVar = new C7212f.e(str, z10, listI1, AbstractC3689v.i1(collectionValues2));
                AbstractC6329b.a(cursorQuery, null);
                return eVar;
            }
            AbstractC6329b.a(cursorQuery, null);
            return null;
        } finally {
        }
    }

    private static final Set e(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorQuery.getColumnIndex("name");
            int columnIndex2 = cursorQuery.getColumnIndex("origin");
            int columnIndex3 = cursorQuery.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set setB = d0.b();
                while (cursorQuery.moveToNext()) {
                    if (AbstractC6492s.d(SnmpConfigurator.O_COMMUNITY, cursorQuery.getString(columnIndex2))) {
                        String name = cursorQuery.getString(columnIndex);
                        boolean z10 = true;
                        if (cursorQuery.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        AbstractC6492s.h(name, "name");
                        C7212f.e eVarD = d(supportSQLiteDatabase, name, z10);
                        if (eVarD == null) {
                            AbstractC6329b.a(cursorQuery, null);
                            return null;
                        }
                        setB.add(eVarD);
                    }
                }
                Set setA = d0.a(setB);
                AbstractC6329b.a(cursorQuery, null);
                return setA;
            }
            AbstractC6329b.a(cursorQuery, null);
            return null;
        } finally {
        }
    }

    public static final C7212f f(SupportSQLiteDatabase database, String tableName) {
        AbstractC6492s.i(database, "database");
        AbstractC6492s.i(tableName, "tableName");
        return new C7212f(tableName, a(database, tableName), c(database, tableName), e(database, tableName));
    }
}
