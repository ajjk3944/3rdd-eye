package g8;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements x7.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24547a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24548b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24549c;

    public /* synthetic */ a(int i4, Object obj, Object obj2) {
        this.f24547a = i4;
        this.f24548b = obj;
        this.f24549c = obj2;
    }

    @Override // x7.j
    public final z7.y a(Object obj, int i4, int i10, x7.h hVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        boolean z3;
        y yVar;
        t8.e eVar;
        switch (this.f24547a) {
            case 0:
                z7.y yVarA = ((x7.j) this.f24548b).a(obj, i4, i10, hVar);
                Resources resources = (Resources) this.f24549c;
                if (yVarA == null) {
                    return null;
                }
                return new c(resources, yVarA);
            case 1:
                z7.y yVarC = ((i8.e) this.f24548b).c((Uri) obj, hVar);
                if (yVarC == null) {
                    return null;
                }
                return q.a((a8.b) this.f24549c, (Drawable) ((i8.d) yVarC).get(), i4, i10);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof y) {
                    yVar = (y) inputStream;
                    z3 = false;
                } else {
                    z3 = true;
                    yVar = new y(inputStream, (a8.g) this.f24549c);
                }
                ArrayDeque arrayDeque = t8.e.f34506c;
                synchronized (arrayDeque) {
                    eVar = (t8.e) arrayDeque.poll();
                }
                if (eVar == null) {
                    eVar = new t8.e();
                }
                t8.e eVar2 = eVar;
                eVar2.f34507a = yVar;
                t8.j jVar = new t8.j(eVar2);
                yb.i iVar = new yb.i(yVar, false, eVar2, 20);
                try {
                    o oVar = (o) this.f24548b;
                    c cVarA = oVar.a(new yb.e(jVar, oVar.f24593d, oVar.f24592c), i4, i10, hVar, iVar);
                    eVar2.c();
                    if (z3) {
                        yVar.e();
                    }
                    return cVarA;
                } finally {
                }
        }
    }

    @Override // x7.j
    public final boolean b(Object obj, x7.h hVar) {
        switch (this.f24547a) {
            case 0:
                return ((x7.j) this.f24548b).b(obj, hVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((o) this.f24548b).getClass();
                return true;
        }
    }

    public a(Resources resources, x7.j jVar) {
        this.f24547a = 0;
        this.f24549c = resources;
        this.f24548b = jVar;
    }
}
