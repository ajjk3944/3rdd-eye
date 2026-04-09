package com.google.gson.internal.sql;

import com.google.gson.internal.bind.c;
import com.google.gson.q;
import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f39120a;

    /* renamed from: b, reason: collision with root package name */
    public static final c.b f39121b;

    /* renamed from: c, reason: collision with root package name */
    public static final c.b f39122c;

    /* renamed from: d, reason: collision with root package name */
    public static final q f39123d;

    /* renamed from: e, reason: collision with root package name */
    public static final q f39124e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f39125f;

    class a extends c.b {
        a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.c.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Date a(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    class b extends c.b {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.c.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Timestamp a(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f39120a = z10;
        if (z10) {
            f39121b = new a(Date.class);
            f39122c = new b(Timestamp.class);
            f39123d = com.google.gson.internal.sql.a.f39114b;
            f39124e = com.google.gson.internal.sql.b.f39116b;
            f39125f = c.f39118b;
            return;
        }
        f39121b = null;
        f39122c = null;
        f39123d = null;
        f39124e = null;
        f39125f = null;
    }
}
