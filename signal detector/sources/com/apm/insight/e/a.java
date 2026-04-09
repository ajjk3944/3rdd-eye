package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.e;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f6107a;

    /* renamed from: b, reason: collision with root package name */
    private com.apm.insight.e.a.b f6108b;

    /* renamed from: c, reason: collision with root package name */
    private SQLiteDatabase f6109c;

    private a() {
    }

    public static a a() {
        if (f6107a == null) {
            synchronized (a.class) {
                try {
                    if (f6107a == null) {
                        f6107a = new a();
                    }
                } finally {
                }
            }
        }
        return f6107a;
    }

    private void b() {
        if (this.f6108b == null) {
            a(e.g());
        }
    }

    public final synchronized void a(Context context) {
        try {
            this.f6109c = new b(context).getWritableDatabase();
        } finally {
            this.f6108b = new com.apm.insight.e.a.b();
        }
        this.f6108b = new com.apm.insight.e.a.b();
    }

    public final synchronized void a(com.apm.insight.d.a aVar) {
        b();
        com.apm.insight.e.a.b bVar = this.f6108b;
        if (bVar != null) {
            bVar.a(this.f6109c, aVar);
        }
    }

    public final synchronized boolean a(String str) {
        b();
        com.apm.insight.e.a.b bVar = this.f6108b;
        if (bVar == null) {
            return false;
        }
        return bVar.a(this.f6109c, str);
    }
}
