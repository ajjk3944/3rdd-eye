package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;

/* renamed from: io.appmetrica.analytics.impl.sk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4955sk implements InterfaceC4509bd {

    /* renamed from: a, reason: collision with root package name */
    public final C4908qo f41646a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41647b = "startup_state";

    /* renamed from: c, reason: collision with root package name */
    public final AESEncrypter f41648c;

    public C4955sk(C4908qo c4908qo) {
        this.f41646a = c4908qo;
        C4469a c4469a = new C4469a(Ga.j().f());
        this.f41648c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c4469a.b(), c4469a.a());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4509bd
    public final void a(Context context) {
        SQLiteDatabase readableDatabase = C4916r7.a(context).h().getReadableDatabase();
        if (readableDatabase != null) {
            try {
                Tb tbA = a(readableDatabase);
                C4621fm c4621fm = new C4621fm(new G4(new E4()));
                if (tbA != null) {
                    a(this.f41646a, c4621fm, tbA);
                    c4621fm.f40891p = tbA.f40173c;
                    c4621fm.f40893r = tbA.f40172b;
                }
                C4647gm c4647gm = new C4647gm(c4621fm);
                Om omA = Nm.a(C4647gm.class);
                omA.a(context, omA.d(context)).save(c4647gm);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(C4908qo c4908qo, C4621fm c4621fm, Tb tb) {
        String strOptStringOrNull;
        synchronized (c4908qo) {
            strOptStringOrNull = JsonUtils.optStringOrNull(c4908qo.f41502a.a(), "device_id");
        }
        if (TextUtils.isEmpty(strOptStringOrNull)) {
            if (!TextUtils.isEmpty(tb.f40174d)) {
                c4908qo.a(tb.f40174d);
            }
            if (!TextUtils.isEmpty(tb.f40175e)) {
                c4908qo.b(tb.f40175e);
            }
            if (TextUtils.isEmpty(tb.f40171a)) {
                return;
            }
            c4621fm.f40877a = tb.f40171a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: all -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x004c, blocks: (B:5:0x001b, B:7:0x0022, B:9:0x0028, B:13:0x0047), top: B:21:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.Tb a(android.database.sqlite.SQLiteDatabase r11) {
        /*
            r10 = this;
            java.lang.String r0 = "value"
            r1 = 0
            java.lang.String r3 = "binary_data"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = "data_key = ?"
            java.lang.String r2 = r10.f41647b     // Catch: java.lang.Throwable -> L4b
            java.lang.String[] r6 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L4b
            r8 = 0
            r9 = 0
            r7 = 0
            r2 = r11
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L45
            int r2 = r11.getCount()     // Catch: java.lang.Throwable -> L4c
            r3 = 1
            if (r2 != r3) goto L45
            boolean r2 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L45
            int r0 = r11.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L4c
            byte[] r0 = r11.getBlob(r0)     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter r2 = r10.f41648c     // Catch: java.lang.Throwable -> L4c
            byte[] r0 = r2.decrypt(r0)     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.impl.Tb r2 = new io.appmetrica.analytics.impl.Tb     // Catch: java.lang.Throwable -> L4c
            r2.<init>()     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.protobuf.nano.MessageNano r0 = io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(r2, r0)     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.impl.Tb r0 = (io.appmetrica.analytics.impl.Tb) r0     // Catch: java.lang.Throwable -> L4c
            io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(r11)
            return r0
        L45:
            if (r11 == 0) goto L4c
            r11.getCount()     // Catch: java.lang.Throwable -> L4c
            goto L4c
        L4b:
            r11 = r1
        L4c:
            io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4955sk.a(android.database.sqlite.SQLiteDatabase):io.appmetrica.analytics.impl.Tb");
    }
}
