package sl;

import ak.j;
import android.view.View;
import java.util.Arrays;
import java.util.Map;
import nk.k;
import u0.w0;
import vk.i;
import wg.s;
import xk.r;
import yj.u;
import zj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33826a;

    public /* synthetic */ b(int i4) {
        this.f33826a = i4;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f33826a) {
            case 0:
                c cVar = (c) obj;
                k.e(cVar, "it");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cVar.f33827e);
                sb2.append('=');
                sb2.append(cVar.f33828f);
                return sb2.toString();
            case 1:
                k.e((t5.a) obj, "config");
                throw new yj.h();
            case 2:
                d6.c cVar2 = (d6.c) obj;
                k.e(cVar2, "it");
                return Boolean.valueOf(cVar2.P());
            case 3:
                d6.c cVar3 = (d6.c) obj;
                k.e(cVar3, "statement");
                j jVar = new j();
                while (cVar3.P()) {
                    jVar.add(Integer.valueOf((int) cVar3.getLong(0)));
                }
                return com.bumptech.glide.d.c(jVar);
            case 4:
                Map.Entry entry = (Map.Entry) obj;
                k.e(entry, "<destruct>");
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sbB = i3.e.b(str, " : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    k.d(value, "toString(...)");
                }
                sbB.append(value);
                return sbB.toString();
            case 5:
                k.e((View) obj, "it");
                return u.f37649a;
            case 6:
                k.e((View) obj, "it");
                return u.f37649a;
            case 7:
                b2.b bVar = ((w0) obj).f35013a;
                if (bVar != null) {
                    bVar.invoke();
                }
                return u.f37649a;
            case 8:
                String str2 = (String) obj;
                k.e(str2, "it");
                return (CharSequence) n.h0(i.Q0(str2, new String[]{"/"}));
            case 9:
                s sVar = (s) obj;
                k.e(sVar, "it");
                return sVar.f36705a;
            case 10:
                y6.d dVar = (y6.d) obj;
                k.e(dVar, "it");
                return dVar.getClass().getSimpleName();
            default:
                ck.f fVar = (ck.f) obj;
                if (fVar instanceof r) {
                    return (r) fVar;
                }
                return null;
        }
    }

    public /* synthetic */ b(t5.s sVar) {
        this.f33826a = 1;
    }
}
