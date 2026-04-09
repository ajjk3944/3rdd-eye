package zb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Looper;
import cc.s;
import d5.v;
import io.sentry.android.core.e0;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static g f26824c;

    /* renamed from: a, reason: collision with root package name */
    public final Object f26825a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f26826b;

    public g(Context context) {
        this.f26825a = context.getApplicationContext();
    }

    public static g a(Context context) {
        s.h(context);
        synchronized (g.class) {
            if (f26824c == null) {
                k kVar = p.f26841a;
                synchronized (p.class) {
                    if (p.f26845e == null) {
                        p.f26845e = context.getApplicationContext();
                    } else {
                        e0.p("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f26824c = new g(context);
            }
        }
        return f26824c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f6, code lost:
    
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean e(android.content.pm.PackageInfo r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.g.e(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static l f(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                e0.p("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < lVarArr.length; i10++) {
                if (lVarArr[i10].equals(mVar)) {
                    return lVarArr[i10];
                }
            }
        }
        return null;
    }

    public Object b(Context context) {
        if (this.f26826b == null) {
            synchronized (this) {
                try {
                    if (this.f26826b == null) {
                        this.f26826b = ((v) this.f26825a).k(context);
                    }
                } finally {
                }
            }
        }
        return this.f26826b;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(int r21) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.g.c(int):boolean");
    }

    public void d(bc.h hVar) {
        ((dd.p) this.f26825a).execute(new re.a(this, 2, hVar));
    }

    public g(Looper looper, ji.a aVar, String str) {
        this.f26825a = new dd.p(looper);
        s.i(aVar, "Listener must not be null");
        s.e(str);
        this.f26826b = new bc.g(aVar, str);
    }

    public g(v vVar) {
        this.f26826b = null;
        this.f26825a = vVar;
    }

    public g() {
        this.f26825a = new CopyOnWriteArraySet();
    }
}
