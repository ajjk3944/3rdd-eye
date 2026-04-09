package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.c7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4529c7 extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final C4940s5 f40612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4555d7 f40613b;

    public C4529c7(C4555d7 c4555d7, C4940s5 c4940s5) {
        this.f40613b = c4555d7;
        this.f40612a = c4940s5;
    }

    public final synchronized void a(ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = (ContentValues) it.next();
                this.f40613b.getClass();
                Integer asInteger = contentValues.getAsInteger("type");
                asInteger.intValue();
                arrayList2.add(asInteger);
            }
            Iterator it2 = this.f40613b.f40717j.iterator();
            while (it2.hasNext()) {
                ((InterfaceC4686i9) it2.next()).a(arrayList2);
            }
            ((D5) this.f40612a.f41613p).e();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        while (isRunning()) {
            try {
                synchronized (this) {
                    try {
                        if (C4555d7.a(this.f40613b)) {
                            wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable unused) {
                stopRunning();
            }
            synchronized (this.f40613b.f40713e) {
                arrayList = new ArrayList(this.f40613b.f40714f);
                this.f40613b.f40714f.clear();
            }
            C4555d7 c4555d7 = this.f40613b;
            c4555d7.getClass();
            if (!arrayList.isEmpty()) {
                c4555d7.f40710b.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase writableDatabase = c4555d7.f40711c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ContentValues contentValues = (ContentValues) it.next();
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                c4555d7.i.incrementAndGet();
                                c4555d7.a(contentValues, "Event saved to db");
                            }
                            writableDatabase.setTransactionSuccessful();
                            c4555d7.i.get();
                        } catch (Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                            c4555d7.f40710b.unlock();
                            a(arrayList);
                        }
                    }
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.endTransaction();
                        } catch (Throwable unused3) {
                        }
                    }
                } catch (Throwable unused4) {
                }
                c4555d7.f40710b.unlock();
            }
            a(arrayList);
        }
    }
}
