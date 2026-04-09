package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.d7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4555d7 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock.ReadLock f40709a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantReadWriteLock.WriteLock f40710b;

    /* renamed from: c, reason: collision with root package name */
    public final C4891q7 f40711c;

    /* renamed from: d, reason: collision with root package name */
    public final C4529c7 f40712d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f40713e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f40714f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f40715g;

    /* renamed from: h, reason: collision with root package name */
    public final C4940s5 f40716h;
    public final AtomicLong i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f40717j;

    /* renamed from: k, reason: collision with root package name */
    public final Z6 f40718k;

    /* renamed from: l, reason: collision with root package name */
    public final C5093y7 f40719l;

    static {
        HashSet hashSet = new HashSet();
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public C4555d7(C4940s5 c4940s5, C4891q7 c4891q7, Z6 z62, C5093y7 c5093y7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f40709a = reentrantReadWriteLock.readLock();
        this.f40710b = reentrantReadWriteLock.writeLock();
        this.f40713e = new Object();
        this.f40714f = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.i = atomicLong;
        this.f40717j = new ArrayList();
        this.f40711c = c4891q7;
        this.f40715g = c4940s5.getContext();
        this.f40716h = c4940s5;
        this.f40718k = z62;
        this.f40719l = c5093y7;
        atomicLong.set(c());
        C4529c7 c4529c7 = new C4529c7(this, c4940s5);
        this.f40712d = c4529c7;
        c4529c7.setName(a(c4940s5));
    }

    public final long a(Set set) {
        this.f40709a.lock();
        Cursor cursorRawQuery = null;
        long j4 = 0;
        try {
            SQLiteDatabase readableDatabase = this.f40711c.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder("SELECT count() FROM events");
                if (!set.isEmpty()) {
                    sb.append(" WHERE ");
                }
                Iterator it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (i > 0) {
                        sb.append(" OR ");
                    }
                    sb.append("type == " + num);
                    i++;
                }
                cursorRawQuery = readableDatabase.rawQuery(sb.toString(), null);
                if (cursorRawQuery.moveToFirst()) {
                    j4 = cursorRawQuery.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        AbstractC4623fo.a(cursorRawQuery);
        this.f40709a.unlock();
        return j4;
    }

    public final long b() {
        this.f40709a.lock();
        try {
            return this.i.get();
        } finally {
            this.f40709a.unlock();
        }
    }

    public final long c() {
        SQLiteDatabase readableDatabase;
        this.f40709a.lock();
        try {
            readableDatabase = this.f40711c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        long jQueryRowsCount = readableDatabase != null ? DBUtils.queryRowsCount(readableDatabase, "events") : 0L;
        this.f40709a.unlock();
        return jQueryRowsCount;
    }

    public final void d() {
        Cursor cursor;
        Cursor cursorRawQuery;
        this.f40709a.lock();
        Cursor cursorRawQuery2 = null;
        try {
            SQLiteDatabase readableDatabase = this.f40711c.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(" SELECT DISTINCT id From sessions order by id asc ", new String[0]);
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("All sessions in db: ");
                    while (cursorRawQuery.moveToNext()) {
                        stringBuffer.append(cursorRawQuery.getString(0));
                        stringBuffer.append(", ");
                    }
                    cursorRawQuery2 = readableDatabase.rawQuery(" SELECT DISTINCT session_id From events order by session_id asc ", new String[0]);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("All sessions in reports db: ");
                    while (cursorRawQuery2.moveToNext()) {
                        stringBuffer2.append(cursorRawQuery2.getString(0));
                        stringBuffer2.append(", ");
                    }
                } catch (Throwable unused) {
                    cursor = cursorRawQuery2;
                    cursorRawQuery2 = cursorRawQuery;
                    cursorRawQuery = cursorRawQuery2;
                    cursorRawQuery2 = cursor;
                    this.f40709a.unlock();
                    AbstractC4623fo.a(cursorRawQuery);
                    AbstractC4623fo.a(cursorRawQuery2);
                }
            } else {
                cursorRawQuery = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.f40709a.unlock();
        AbstractC4623fo.a(cursorRawQuery);
        AbstractC4623fo.a(cursorRawQuery2);
    }

    public final void e() {
        this.f40712d.start();
    }

    public final void a(InterfaceC4686i9 interfaceC4686i9) {
        this.f40717j.add(interfaceC4686i9);
    }

    public static String a(Xa xa) {
        return "DatabaseWorker [" + xa.b().e() + "]";
    }

    public final void a(long j4, Tk tk, long j10) {
        JSONObject jSONObject;
        boolean zB;
        M7 m72 = new M7(null, 1, 0 == true ? 1 : 0);
        C5028vh c5028vh = (C5028vh) this.f40716h.f41608k.a();
        Long lValueOf = Long.valueOf(j4);
        Long lValueOf2 = Long.valueOf(j10);
        try {
            jSONObject = new JSONObject().put("dId", c5028vh.getDeviceId()).put("uId", c5028vh.getUuid()).put("appVer", c5028vh.getAppVersion()).put("appBuild", c5028vh.getAppBuildNumber()).put("kitBuildType", c5028vh.getAnalyticsSdkBuildType()).put("osVer", c5028vh.getOsVersion()).put("osApiLev", c5028vh.getOsApiLevel()).put("lang", c5028vh.getLocale()).put("root", c5028vh.getDeviceRootStatus()).put("app_debuggable", ((C4631g6) c5028vh).f40928a).put(CommonUrlParts.APP_FRAMEWORK, c5028vh.getAppFramework()).put("attribution_id", c5028vh.f41874r).put("analyticsSdkVersionName", c5028vh.getAnalyticsSdkVersionName()).put("kitBuildNumber", c5028vh.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        Long lValueOf3 = Long.valueOf(Cn.a());
        C4593ek c4593ek = AbstractC4568dk.f40755a;
        synchronized (c4593ek) {
            zB = c4593ek.f40821b.b(true);
        }
        ContentValues contentValuesA = m72.fromModel(new L7(lValueOf, tk, string, new K7(lValueOf2, lValueOf3, Boolean.valueOf(zB))));
        if (contentValuesA == null) {
            return;
        }
        this.f40710b.lock();
        try {
            SQLiteDatabase writableDatabase = this.f40711c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, contentValuesA);
            }
        } catch (Throwable unused2) {
        }
        this.f40710b.unlock();
    }

    public final void a(ContentValues contentValues) {
        synchronized (this.f40713e) {
            this.f40714f.add(contentValues);
        }
        synchronized (this.f40712d) {
            this.f40712d.notifyAll();
        }
    }

    public final void a() {
        SQLiteDatabase writableDatabase;
        try {
            this.f40710b.lock();
            if (this.i.get() > ((C5028vh) this.f40716h.f41608k.a()).f41878v && (writableDatabase = this.f40711c.getWritableDatabase()) != null) {
                int iA = a(writableDatabase);
                this.i.addAndGet(-iA);
                if (iA != 0) {
                    Iterator it = this.f40717j.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC4686i9) it.next()).a();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.f40710b.unlock();
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f40718k.a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join(", ", O9.i), TextUtils.join(", ", O9.f39931j), 10), 2, this.f40716h.f41600b.f41171b, true).f40377b;
        } catch (Throwable th) {
            Zj zj = AbstractC5105yj.f42147a;
            zj.getClass();
            zj.a(new C5130zj("deleteExcessiveReports exception", th));
            return 0;
        }
    }

    public final void a(long j4, int i, int i10, boolean z10) {
        if (i10 <= 0) {
            return;
        }
        this.f40710b.lock();
        try {
            String str = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j4), "session_type", Integer.toString(i), FacebookMediationAdapter.KEY_ID, "events", Integer.toString(i10 - 1));
            SQLiteDatabase writableDatabase = this.f40711c.getWritableDatabase();
            if (writableDatabase != null) {
                X6 x6A = this.f40718k.a(writableDatabase, str, 1, this.f40716h.f41600b.f41171b, z10);
                if (x6A.f40376a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = x6A.f40376a.iterator();
                    while (it.hasNext()) {
                        Integer asInteger = ((ContentValues) it.next()).getAsInteger("type");
                        asInteger.intValue();
                        arrayList.add(asInteger);
                    }
                    Iterator it2 = this.f40717j.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC4686i9) it2.next()).b(arrayList);
                    }
                }
                List list = x6A.f40376a;
                if (list != null) {
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        a((ContentValues) list.get(i11), "Event removed from db");
                    }
                }
                this.i.addAndGet(-x6A.f40377b);
            }
        } catch (Throwable unused) {
        }
        this.f40710b.unlock();
    }

    public final ContentValues a(long j4, Tk tk) {
        ContentValues contentValues = new ContentValues();
        this.f40709a.lock();
        Cursor cursorRawQuery = null;
        try {
            SQLiteDatabase readableDatabase = this.f40711c.getReadableDatabase();
            if (readableDatabase != null) {
                Locale locale = Locale.US;
                cursorRawQuery = readableDatabase.rawQuery("SELECT report_request_parameters FROM sessions WHERE id = " + j4 + " AND type = " + tk.f40197a + " ORDER BY id DESC LIMIT 1", null);
                if (cursorRawQuery.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        AbstractC4623fo.a(cursorRawQuery);
        this.f40709a.unlock();
        return contentValues;
    }

    public static String a(LinkedHashMap linkedHashMap) {
        StringBuilder sb = new StringBuilder("id >= ?");
        for (String str : linkedHashMap.keySet()) {
            sb.append(sb.length() > 0 ? " AND " : "");
            sb.append(str + " = ? ");
        }
        if (TextUtils.isEmpty(sb.toString())) {
            return null;
        }
        return sb.toString();
    }

    public static String[] a(String[] strArr, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final void a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (O9.f39926d.contains(EnumC4997ub.a(asInteger != null ? asInteger.intValue() : -1))) {
            C5068x7 c5068x7A = new C5093y7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.f40716h.f41610m;
            EnumC4997ub enumC4997ub = c5068x7A.f42049d;
            C5043w7 c5043w7 = c5068x7A.f42052g;
            publicLogger.info(AbstractC4512bg.a(str, enumC4997ub, c5043w7.f41899b, c5043w7.f41900c), new Object[0]);
        }
    }

    public static boolean a(C4555d7 c4555d7) {
        boolean zIsEmpty;
        synchronized (c4555d7.f40713e) {
            zIsEmpty = c4555d7.f40714f.isEmpty();
        }
        return zIsEmpty;
    }
}
