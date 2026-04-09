package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w01 {

    /* renamed from: a, reason: collision with root package name */
    public final File f17812a;

    /* renamed from: b, reason: collision with root package name */
    public final File f17813b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f17814c;

    /* renamed from: d, reason: collision with root package name */
    public final cs1 f17815d;

    /* renamed from: e, reason: collision with root package name */
    public final g21 f17816e;

    public w01(Context context, SharedPreferences sharedPreferences, cs1 cs1Var, g21 g21Var) {
        this.f17814c = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        mq0.N(dir, false);
        this.f17812a = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        mq0.N(dir2, true);
        this.f17813b = dir2;
        this.f17815d = cs1Var;
        this.f17816e = g21Var;
    }

    public final void a(zy0 zy0Var, byte[] bArr, byte[] bArr2) {
        String strA = zy0Var.A().A();
        boolean zIsEmpty = TextUtils.isEmpty(strA);
        g21 g21Var = this.f17816e;
        if (!zIsEmpty && bArr2.length != 0) {
            File file = this.f17813b;
            mq0.W(file);
            file.mkdirs();
            File fileD = mq0.D(file, strA);
            fileD.getClass();
            fileD.mkdirs();
            File fileB = mq0.b(strA, "pcam.jar", file);
            fileB.getClass();
            if (bArr == null || bArr.length <= 0 || mq0.A(fileB, bArr)) {
                File fileB2 = mq0.b(strA, "pcbc", file);
                fileB2.getClass();
                if (mq0.A(fileB2, bArr2)) {
                    String strA2 = zy0Var.A().A();
                    if (!TextUtils.isEmpty(strA2)) {
                        File fileB3 = mq0.b(strA2, "pcam.jar", file);
                        fileB3.getClass();
                        File fileB4 = mq0.b(strA2, "pcbc", file);
                        fileB4.getClass();
                        File fileB5 = mq0.b(strA2, "pcam.jar", c());
                        fileB5.getClass();
                        File fileB6 = mq0.b(strA2, "pcbc", c());
                        fileB6.getClass();
                        if (fileB3.exists() && !fileB3.renameTo(fileB5)) {
                            g21Var.b(15318);
                        } else if (fileB4.exists() && fileB4.renameTo(fileB6)) {
                            zy0 zy0VarB = b(1);
                            SharedPreferences.Editor editorEdit = this.f17814c.edit();
                            if (zy0VarB != null && !zy0Var.A().A().equals(zy0VarB.A().A())) {
                                editorEdit.putString(d(), tb.b.b(zy0VarB.b()));
                            }
                            editorEdit.putString(e(), tb.b.b(zy0Var.b()));
                            if (!editorEdit.commit()) {
                                g21Var.b(15320);
                            }
                        } else {
                            g21Var.b(15319);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    zy0 zy0VarB2 = b(1);
                    if (zy0VarB2 != null) {
                        hashSet.add(zy0VarB2.A().A());
                    }
                    zy0 zy0VarB3 = b(2);
                    if (zy0VarB3 != null) {
                        hashSet.add(zy0VarB3.A().A());
                    }
                    File[] fileArrListFiles = c().listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            String name = file2.getName();
                            if (!hashSet.contains(name)) {
                                File fileD2 = mq0.D(c(), name);
                                fileD2.getClass();
                                mq0.W(fileD2);
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        g21Var.b(15316);
    }

    public final zy0 b(int i4) {
        SharedPreferences sharedPreferences = this.f17814c;
        String string = i4 == 1 ? sharedPreferences.getString(e(), null) : sharedPreferences.getString(d(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] bArrL = tb.b.l(string);
                zy0 zy0VarD = zy0.D(bn1.v(0, bArrL.length, bArrL));
                String strA = zy0VarD.A().A();
                File fileB = mq0.b(strA, "pcam.jar", c());
                if (fileB == null) {
                    throw null;
                }
                if (!fileB.exists() && (fileB = mq0.b(strA, "pcam", c())) == null) {
                    throw null;
                }
                File fileB2 = mq0.b(strA, "pcbc", c());
                if (fileB2 == null) {
                    throw null;
                }
                if (fileB.exists() && fileB2.exists()) {
                    return zy0VarD;
                }
            } catch (ao1 unused) {
                this.f17816e.b(15317);
                return null;
            }
        }
        return null;
    }

    public final File c() {
        File file = new File(this.f17812a, Integer.toString(((fg) this.f17815d.a()).f11160a));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String d() {
        int i4 = ((fg) this.f17815d.a()).f11160a;
        return d.h.q(i4, "FBAMTD", new StringBuilder(String.valueOf(i4).length() + 6));
    }

    public final String e() {
        int i4 = ((fg) this.f17815d.a()).f11160a;
        return d.h.q(i4, "LATMTD", new StringBuilder(String.valueOf(i4).length() + 6));
    }
}
