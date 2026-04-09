package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class Jz {

    /* renamed from: a, reason: collision with root package name */
    public final File f9403a;

    /* renamed from: b, reason: collision with root package name */
    public final File f9404b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f9405c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1692pN f9406d;

    /* renamed from: e, reason: collision with root package name */
    public final C1948uA f9407e;

    public Jz(Context context, SharedPreferences sharedPreferences, InterfaceC1692pN interfaceC1692pN, C1948uA c1948uA) {
        this.f9405c = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        AbstractC0582Jp.O(dir, false);
        this.f9403a = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        AbstractC0582Jp.O(dir2, true);
        this.f9404b = dir2;
        this.f9406d = interfaceC1692pN;
        this.f9407e = c1948uA;
    }

    public final void a(Ly ly, byte[] bArr, byte[] bArr2) {
        String strA = ly.A().A();
        boolean zIsEmpty = TextUtils.isEmpty(strA);
        C1948uA c1948uA = this.f9407e;
        if (!zIsEmpty && bArr2.length != 0) {
            File file = this.f9404b;
            AbstractC0582Jp.Y(file);
            file.mkdirs();
            File fileE = AbstractC0582Jp.E(file, strA);
            fileE.getClass();
            fileE.mkdirs();
            File fileB = AbstractC0582Jp.b(strA, "pcam.jar", file);
            fileB.getClass();
            if (bArr == null || bArr.length <= 0 || AbstractC0582Jp.A(fileB, bArr)) {
                File fileB2 = AbstractC0582Jp.b(strA, "pcbc", file);
                fileB2.getClass();
                if (AbstractC0582Jp.A(fileB2, bArr2)) {
                    String strA2 = ly.A().A();
                    if (!TextUtils.isEmpty(strA2)) {
                        File fileB3 = AbstractC0582Jp.b(strA2, "pcam.jar", file);
                        fileB3.getClass();
                        File fileB4 = AbstractC0582Jp.b(strA2, "pcbc", file);
                        fileB4.getClass();
                        File fileB5 = AbstractC0582Jp.b(strA2, "pcam.jar", c());
                        fileB5.getClass();
                        File fileB6 = AbstractC0582Jp.b(strA2, "pcbc", c());
                        fileB6.getClass();
                        if (fileB3.exists() && !fileB3.renameTo(fileB5)) {
                            c1948uA.b(15318);
                        } else if (fileB4.exists() && fileB4.renameTo(fileB6)) {
                            Ly lyB = b(1);
                            SharedPreferences.Editor editorEdit = this.f9405c.edit();
                            if (lyB != null && !ly.A().A().equals(lyB.A().A())) {
                                editorEdit.putString(d(), Q2.b.b(lyB.b()));
                            }
                            editorEdit.putString(e(), Q2.b.b(ly.b()));
                            if (!editorEdit.commit()) {
                                c1948uA.b(15320);
                            }
                        } else {
                            c1948uA.b(15319);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    Ly lyB2 = b(1);
                    if (lyB2 != null) {
                        hashSet.add(lyB2.A().A());
                    }
                    Ly lyB3 = b(2);
                    if (lyB3 != null) {
                        hashSet.add(lyB3.A().A());
                    }
                    File[] fileArrListFiles = c().listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            String name = file2.getName();
                            if (!hashSet.contains(name)) {
                                File fileE2 = AbstractC0582Jp.E(c(), name);
                                fileE2.getClass();
                                AbstractC0582Jp.Y(fileE2);
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        c1948uA.b(15316);
    }

    public final Ly b(int i) {
        SharedPreferences sharedPreferences = this.f9405c;
        String string = i == 1 ? sharedPreferences.getString(e(), null) : sharedPreferences.getString(d(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] bArrI = Q2.b.i(string);
                Ly lyD = Ly.D(QK.r(0, bArrI.length, bArrI));
                String strA = lyD.A().A();
                File fileB = AbstractC0582Jp.b(strA, "pcam.jar", c());
                if (fileB == null) {
                    throw null;
                }
                if (!fileB.exists() && (fileB = AbstractC0582Jp.b(strA, "pcam", c())) == null) {
                    throw null;
                }
                File fileB2 = AbstractC0582Jp.b(strA, "pcbc", c());
                if (fileB2 == null) {
                    throw null;
                }
                if (fileB.exists() && fileB2.exists()) {
                    return lyD;
                }
            } catch (C1636oL unused) {
                this.f9407e.b(15317);
                return null;
            }
        }
        return null;
    }

    public final File c() {
        File file = new File(this.f9403a, Integer.toString(((EnumC1945u7) this.f9406d.c()).f17066a));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String d() {
        int i = ((EnumC1945u7) this.f9406d.c()).f17066a;
        return A.f.i(i, "FBAMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    public final String e() {
        int i = ((EnumC1945u7) this.f9406d.c()).f17066a;
        return A.f.i(i, "LATMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }
}
