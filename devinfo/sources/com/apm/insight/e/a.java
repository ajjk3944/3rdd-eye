package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f3157a;

    /* renamed from: b, reason: collision with root package name */
    private com.apm.insight.e.a.b f3158b;

    /* renamed from: c, reason: collision with root package name */
    private SQLiteDatabase f3159c;

    private a() {
    }

    public static a a() {
        if (f3157a == null) {
            synchronized (a.class) {
                try {
                    if (f3157a == null) {
                        f3157a = new a();
                    }
                } finally {
                }
            }
        }
        return f3157a;
    }

    private void b() {
        if (this.f3158b == null) {
            a(e.g());
        }
    }

    public final synchronized void a(Context context) {
        try {
            this.f3159c = new b(context).getWritableDatabase();
        } finally {
            this.f3158b = new com.apm.insight.e.a.b();
        }
        this.f3158b = new com.apm.insight.e.a.b();
    }

    public final synchronized void a(com.apm.insight.d.a aVar) {
        b();
        com.apm.insight.e.a.b bVar = this.f3158b;
        if (bVar != null) {
            bVar.a(this.f3159c, aVar);
        }
    }

    public final synchronized boolean a(String str) {
        b();
        com.apm.insight.e.a.b bVar = this.f3158b;
        if (bVar == null) {
            return false;
        }
        return bVar.a(this.f3159c, str);
    }
}
