package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class li {

    /* renamed from: a, reason: collision with root package name */
    public final m8.s f13494a;

    /* renamed from: b, reason: collision with root package name */
    public final hk f13495b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13496c;

    public li() {
        this.f13495b = ik.L();
        this.f13496c = false;
        this.f13494a = new m8.s(2);
    }

    public final synchronized void a(ki kiVar) {
        if (this.f13496c) {
            try {
                kiVar.l(this.f13495b);
            } catch (NullPointerException e2) {
                ua.j.C.f35265h.f("AdMobClearcutLogger.modify", e2);
            }
        }
    }

    public final synchronized void b(int i4) {
        if (this.f13496c) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.V5)).booleanValue()) {
                d(i4);
            } else {
                c(i4);
            }
        }
    }

    public final synchronized void c(int i4) {
        hk hkVar = this.f13495b;
        hkVar.b();
        ((ik) hkVar.f14755b).F();
        ArrayList arrayListI = ya.f0.I();
        hkVar.b();
        ((ik) hkVar.f14755b).E(arrayListI);
        oa oaVar = new oa(this.f13494a, ((ik) hkVar.e()).b());
        int i10 = i4 - 1;
        oaVar.f14617b = i10;
        oaVar.h();
        ya.a0.m("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i10, 10))));
    }

    public final synchronized void d(int i4) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(new File(externalStorageDirectory, "clearcut_events.txt").getPath()), true);
            try {
                try {
                    fileOutputStream.write(e(i4).getBytes());
                } finally {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        ya.a0.m("Could not close Clearcut output stream.");
                    }
                }
            } catch (IOException unused2) {
                ya.a0.m("Could not write Clearcut to file.");
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    ya.a0.m("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            ya.a0.m("Could not find file for Clearcut");
        }
    }

    public final synchronized String e(int i4) {
        StringBuilder sb2;
        hk hkVar = this.f13495b;
        String strK = ((ik) hkVar.f14755b).K();
        ua.j.C.f35267k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strEncodeToString = Base64.encodeToString(((ik) hkVar.e()).b(), 3);
        sb2 = new StringBuilder("id=");
        sb2.append(strK);
        sb2.append(",timestamp=");
        sb2.append(jElapsedRealtime);
        sb2.append(",event=");
        sb2.append(i4 - 1);
        sb2.append(",data=");
        sb2.append(strEncodeToString);
        sb2.append("\n");
        return sb2.toString();
    }

    public li(m8.s sVar) {
        this.f13495b = ik.L();
        this.f13494a = sVar;
        this.f13496c = ((Boolean) va.s.f36163e.f36166c.a(sk.U5)).booleanValue();
    }
}
