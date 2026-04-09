package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import q2.C2841s;
import t2.AbstractC2907C;
import t2.C2911G;

/* loaded from: classes.dex */
public final class A8 {

    /* renamed from: a, reason: collision with root package name */
    public final A1.w f6936a;

    /* renamed from: b, reason: collision with root package name */
    public final C2055w9 f6937b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6938c;

    public A8() {
        this.f6937b = C2109x9.L();
        this.f6938c = false;
        this.f6936a = new A1.w(7);
    }

    public final synchronized void a(InterfaceC2216z8 interfaceC2216z8) {
        if (this.f6938c) {
            try {
                interfaceC2216z8.g(this.f6937b);
            } catch (NullPointerException e6) {
                p2.j.f22785C.f22795h.f("AdMobClearcutLogger.modify", e6);
            }
        }
    }

    public final synchronized void b(int i) {
        if (this.f6938c) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.V5)).booleanValue()) {
                d(i);
            } else {
                c(i);
            }
        }
    }

    public final synchronized void c(int i) {
        C2055w9 c2055w9 = this.f6937b;
        c2055w9.b();
        ((C2109x9) c2055w9.f13551b).F();
        ArrayList arrayListI = C2911G.I();
        c2055w9.b();
        ((C2109x9) c2055w9.f13551b).E(arrayListI);
        J4 j42 = new J4(this.f6936a, ((C2109x9) c2055w9.d()).b());
        int i3 = i - 1;
        j42.f9224b = i3;
        j42.h();
        AbstractC2907C.m("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i3, 10))));
    }

    public final synchronized void d(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(new File(externalStorageDirectory, "clearcut_events.txt").getPath()), true);
            try {
                try {
                    fileOutputStream.write(e(i).getBytes());
                } finally {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        AbstractC2907C.m("Could not close Clearcut output stream.");
                    }
                }
            } catch (IOException unused2) {
                AbstractC2907C.m("Could not write Clearcut to file.");
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    AbstractC2907C.m("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            AbstractC2907C.m("Could not find file for Clearcut");
        }
    }

    public final synchronized String e(int i) {
        StringBuilder sb;
        C2055w9 c2055w9 = this.f6937b;
        String strK = ((C2109x9) c2055w9.f13551b).K();
        p2.j.f22785C.f22797k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strEncodeToString = Base64.encodeToString(((C2109x9) c2055w9.d()).b(), 3);
        sb = new StringBuilder("id=");
        sb.append(strK);
        sb.append(",timestamp=");
        sb.append(jElapsedRealtime);
        sb.append(",event=");
        sb.append(i - 1);
        sb.append(",data=");
        sb.append(strEncodeToString);
        sb.append("\n");
        return sb.toString();
    }

    public A8(A1.w wVar) {
        this.f6937b = C2109x9.L();
        this.f6936a = wVar;
        this.f6938c = ((Boolean) C2841s.f23267e.f23270c.a(H9.U5)).booleanValue();
    }
}
