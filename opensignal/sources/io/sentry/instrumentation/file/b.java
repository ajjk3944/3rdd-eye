package io.sentry.instrumentation.file;

import i.g0;
import io.sentry.i1;
import io.sentry.o6;
import io.sentry.util.k;
import io.sentry.x5;
import io.sentry.z4;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f12330a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12331b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12332c;

    /* renamed from: d, reason: collision with root package name */
    public Object f12333d;

    /* renamed from: e, reason: collision with root package name */
    public Object f12334e = o6.OK;

    /* renamed from: f, reason: collision with root package name */
    public Object f12335f;

    public b(i1 i1Var, File file, x5 x5Var) {
        this.f12331b = i1Var;
        this.f12332c = file;
        this.f12333d = x5Var;
        this.f12335f = new g0(x5Var);
        z4.d().a("FileIO");
    }

    public pg.d a() {
        return new pg.d((JSONObject) this.f12331b, (Date) this.f12332c, (JSONArray) this.f12333d, (JSONObject) this.f12334e, this.f12330a, (JSONArray) this.f12335f);
    }

    public void b(Closeable closeable) {
        i1 i1Var = (i1) this.f12331b;
        try {
            try {
                closeable.close();
            } catch (IOException e4) {
                this.f12334e = o6.INTERNAL_ERROR;
                if (i1Var != null) {
                    i1Var.f(e4);
                }
                throw e4;
            }
        } finally {
            c();
        }
    }

    public void c() {
        String strO;
        File file = (File) this.f12332c;
        x5 x5Var = (x5) this.f12333d;
        i1 i1Var = (i1) this.f12331b;
        if (i1Var != null) {
            String strA = k.a(this.f12330a);
            if (file != null) {
                String strA2 = k.a(this.f12330a);
                if (x5Var.isSendDefaultPii()) {
                    strO = file.getName() + " (" + strA2 + ")";
                } else {
                    int iLastIndexOf = file.getName().lastIndexOf(46);
                    if (iLastIndexOf <= 0 || iLastIndexOf >= file.getName().length() - 1) {
                        strO = h0.b.o("*** (", strA2, ")");
                    } else {
                        strO = "***" + file.getName().substring(iLastIndexOf) + " (" + strA2 + ")";
                    }
                }
                i1Var.o(strO);
                if (x5Var.isSendDefaultPii()) {
                    i1Var.l(file.getAbsolutePath(), "file.path");
                }
            } else {
                i1Var.o(strA);
            }
            i1Var.l(Long.valueOf(this.f12330a), "file.size");
            boolean zC = x5Var.getThreadChecker().c();
            i1Var.l(Boolean.valueOf(zC), "blocked_main_thread");
            if (zC) {
                i1Var.l(((g0) this.f12335f).u(), "call_stack");
            }
            i1Var.g((o6) this.f12334e);
        }
    }

    public Object d(a aVar) throws IOException {
        try {
            Object objCall = aVar.call();
            if (objCall instanceof Integer) {
                int iIntValue = ((Integer) objCall).intValue();
                if (iIntValue != -1) {
                    this.f12330a += iIntValue;
                    return objCall;
                }
            } else if (objCall instanceof Long) {
                long jLongValue = ((Long) objCall).longValue();
                if (jLongValue != -1) {
                    this.f12330a += jLongValue;
                }
            }
            return objCall;
        } catch (IOException e4) {
            this.f12334e = o6.INTERNAL_ERROR;
            i1 i1Var = (i1) this.f12331b;
            if (i1Var != null) {
                i1Var.f(e4);
            }
            throw e4;
        }
    }
}
