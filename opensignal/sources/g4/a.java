package g4;

import android.app.Application;
import java.lang.ref.WeakReference;
import wt.t;

/* loaded from: classes.dex */
public final class a implements po.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9325a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9326b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f9327c;

    public a(WeakReference weakReference, no.b bVar) {
        this.f9325a = weakReference;
        this.f9326b = bVar;
    }

    public String a() {
        if (((String) this.f9327c) == null) {
            synchronized (this) {
                try {
                    if (((String) this.f9327c) == null) {
                        String strC = vc.e.C((Application) ((WeakReference) this.f9325a).get(), "com.survicate.surveys.workspaceKey");
                        if (strC == null) {
                            throw new IllegalStateException("You need to provide Workspace Key in AndroidManifest.xml meta-data or by setWorkspaceKey method");
                        }
                        ((sm.f) ((no.b) this.f9326b)).M("Loaded Workspace Key: ".concat(strC));
                        this.f9327c = strC;
                    }
                } finally {
                }
            }
        }
        return (String) this.f9327c;
    }

    public a(String str, a2.g gVar, ar.k kVar, t tVar) {
        br.l.e(str, "name");
        this.f9325a = str;
        this.f9326b = new Object();
    }
}
