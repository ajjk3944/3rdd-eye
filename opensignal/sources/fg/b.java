package fg;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8841a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f8842d;

    public /* synthetic */ b(d dVar, int i10) {
        this.f8841a = i10;
        this.f8842d = dVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        gg.b bVarZ;
        gg.b bVarG;
        switch (this.f8841a) {
            case 0:
                this.f8842d.a();
                return;
            case 1:
                this.f8842d.a();
                return;
            default:
                d dVar = this.f8842d;
                Object obj = d.f8845m;
                synchronized (obj) {
                    try {
                        se.f fVar = dVar.f8846a;
                        fVar.a();
                        io.sentry.internal.debugmeta.c cVarA = io.sentry.internal.debugmeta.c.a(fVar.f22007a);
                        try {
                            bVarZ = dVar.f8848c.z();
                            if (cVarA != null) {
                                cVarA.A();
                            }
                        } catch (Throwable th2) {
                            if (cVarA != null) {
                                cVarA.A();
                            }
                            throw th2;
                        }
                    } finally {
                    }
                }
                try {
                    gg.d dVar2 = bVarZ.f9571b;
                    gg.d dVar3 = gg.d.REGISTER_ERROR;
                    if (dVar2 == dVar3) {
                        bVarG = dVar.g(bVarZ);
                    } else {
                        if (dVar2 == gg.d.UNREGISTERED) {
                            bVarG = dVar.g(bVarZ);
                        } else if (!dVar.f8849d.a(bVarZ)) {
                            return;
                        } else {
                            bVarG = dVar.b(bVarZ);
                        }
                    }
                    synchronized (obj) {
                        try {
                            se.f fVar2 = dVar.f8846a;
                            fVar2.a();
                            io.sentry.internal.debugmeta.c cVarA2 = io.sentry.internal.debugmeta.c.a(fVar2.f22007a);
                            try {
                                dVar.f8848c.q(bVarG);
                                if (cVarA2 != null) {
                                    cVarA2.A();
                                }
                            } catch (Throwable th3) {
                                if (cVarA2 != null) {
                                    cVarA2.A();
                                }
                                throw th3;
                            }
                        } finally {
                        }
                    }
                    synchronized (dVar) {
                        try {
                            if (dVar.k.size() != 0 && !TextUtils.equals(bVarZ.f9570a, bVarG.f9570a)) {
                                Iterator it = dVar.k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } finally {
                        }
                    }
                    if (bVarG.f9571b == gg.d.REGISTERED) {
                        String str = bVarG.f9570a;
                        synchronized (dVar) {
                            dVar.j = str;
                        }
                    }
                    gg.d dVar4 = bVarG.f9571b;
                    if (dVar4 == dVar3) {
                        f fVar3 = f.BAD_CONFIG;
                        dVar.h(new g());
                        return;
                    } else if (dVar4 == gg.d.NOT_GENERATED || dVar4 == gg.d.ATTEMPT_MIGRATION) {
                        dVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        dVar.i(bVarG);
                        return;
                    }
                } catch (g e4) {
                    dVar.h(e4);
                    return;
                }
        }
    }
}
