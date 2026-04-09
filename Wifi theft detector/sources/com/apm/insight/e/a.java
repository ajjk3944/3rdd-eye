package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.e;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f4925a;

    /* renamed from: b, reason: collision with root package name */
    private com.apm.insight.e.a.b f4926b;

    /* renamed from: c, reason: collision with root package name */
    private SQLiteDatabase f4927c;

    private a() {
    }

    public static a a() {
        if (f4925a == null) {
            synchronized (a.class) {
                try {
                    if (f4925a == null) {
                        f4925a = new a();
                    }
                } finally {
                }
            }
        }
        return f4925a;
    }

    private void b() {
        if (this.f4926b == null) {
            a(e.g());
        }
    }

    public final synchronized void a(Context context) {
        try {
            this.f4927c = new b(context).getWritableDatabase();
        } finally {
            this.f4926b = new com.apm.insight.e.a.b();
        }
        this.f4926b = new com.apm.insight.e.a.b();
    }

    public final synchronized void a(com.apm.insight.d.a aVar) {
        b();
        com.apm.insight.e.a.b bVar = this.f4926b;
        if (bVar != null) {
            bVar.a(this.f4927c, aVar);
        }
    }

    public final synchronized boolean a(String str) {
        b();
        com.apm.insight.e.a.b bVar = this.f4926b;
        if (bVar == null) {
            return false;
        }
        return bVar.a(this.f4927c, str);
    }
}
