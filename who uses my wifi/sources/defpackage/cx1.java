package defpackage;

import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cx1 {
    public final wy0 a;
    public final yy1 b;
    public final boolean c;

    public cx1() {
        this.b = zy1.L();
        this.c = false;
        this.a = new wy0(4);
    }

    public final synchronized void a(bx1 bx1Var) {
        if (this.c) {
            try {
                bx1Var.e(this.b);
            } catch (NullPointerException e) {
                hg4.C.h.d("AdMobClearcutLogger.modify", e);
            }
        }
    }

    public final synchronized void b(int i) {
        if (this.c) {
            if (((Boolean) tw1.e.c.a(mz1.B5)).booleanValue()) {
                d(i);
            } else {
                c(i);
            }
        }
    }

    public final synchronized void c(int i) {
        yy1 yy1Var = this.b;
        yy1Var.b();
        ((zy1) yy1Var.g).F();
        ArrayList arrayListG = lf4.G();
        yy1Var.b();
        ((zy1) yy1Var.g).E(arrayListG);
        byte[] bArrB = ((zy1) yy1Var.d()).b();
        wy0 wy0Var = this.a;
        so1 so1Var = new so1();
        Objects.requireNonNull(wy0Var);
        so1Var.h = wy0Var;
        so1Var.g = bArrB;
        int i2 = i - 1;
        so1Var.f = i2;
        synchronized (so1Var) {
            ((ExecutorService) ((wy0) so1Var.h).h).execute(new fu1(4, so1Var));
        }
        gi2.G("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
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
                        gi2.G("Could not close Clearcut output stream.");
                    }
                }
            } catch (IOException unused2) {
                gi2.G("Could not write Clearcut to file.");
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    gi2.G("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            gi2.G("Could not find file for Clearcut");
        }
    }

    public final synchronized String e(int i) {
        StringBuilder sb;
        yy1 yy1Var = this.b;
        String strK = ((zy1) yy1Var.g).K();
        hg4.C.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strEncodeToString = Base64.encodeToString(((zy1) yy1Var.d()).b(), 3);
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

    public cx1(wy0 wy0Var) {
        this.b = zy1.L();
        this.a = wy0Var;
        this.c = ((Boolean) tw1.e.c.a(mz1.A5)).booleanValue();
    }
}
