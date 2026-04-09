package u1;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.internal.ads.C0752Tp;
import java.io.InputStream;
import java.util.ArrayDeque;
import o.a1;
import o1.InterfaceC2753a;

/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2946a implements l1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23724a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23725b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23726c;

    public /* synthetic */ C2946a(Object obj, int i, Object obj2) {
        this.f23724a = i;
        this.f23725b = obj;
        this.f23726c = obj2;
    }

    @Override // l1.j
    public final boolean a(Object obj, l1.h hVar) {
        switch (this.f23724a) {
            case 0:
                return ((l1.j) this.f23725b).a(obj, hVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((p) this.f23725b).getClass();
                return true;
        }
    }

    @Override // l1.j
    public final n1.z b(Object obj, int i, int i3, l1.h hVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        boolean z6;
        y yVar;
        H1.e eVar;
        switch (this.f23724a) {
            case 0:
                n1.z zVarB = ((l1.j) this.f23725b).b(obj, i, i3, hVar);
                Resources resources = (Resources) this.f23726c;
                if (zVarB == null) {
                    return null;
                }
                return new C2949d(resources, zVarB);
            case 1:
                n1.z zVarC = ((w1.d) this.f23725b).c((Uri) obj, hVar);
                if (zVarC == null) {
                    return null;
                }
                return r.b((InterfaceC2753a) this.f23726c, (Drawable) ((w1.c) zVarC).get(), i, i3);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof y) {
                    yVar = (y) inputStream;
                    z6 = false;
                } else {
                    z6 = true;
                    yVar = new y(inputStream, (C0752Tp) this.f23726c);
                }
                ArrayDeque arrayDeque = H1.e.f1759c;
                synchronized (arrayDeque) {
                    eVar = (H1.e) arrayDeque.poll();
                }
                if (eVar == null) {
                    eVar = new H1.e();
                }
                H1.e eVar2 = eVar;
                eVar2.f1760a = yVar;
                H1.m mVar = new H1.m(eVar2);
                t2.q qVar = new t2.q(yVar, 1, eVar2);
                try {
                    p pVar = (p) this.f23725b;
                    C2949d c2949dA = pVar.a(new a1(mVar, pVar.f23762d, pVar.f23761c), i, i3, hVar, qVar);
                    eVar2.a();
                    if (z6) {
                        yVar.b();
                    }
                    return c2949dA;
                } finally {
                }
        }
    }

    public C2946a(Resources resources, l1.j jVar) {
        this.f23724a = 0;
        this.f23726c = resources;
        this.f23725b = jVar;
    }
}
