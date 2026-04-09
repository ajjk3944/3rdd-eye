package n8;

import android.text.TextUtils;
import com.unity3d.ads.BuildConfig;
import g8.o;
import java.util.ArrayList;
import q8.c;

/* loaded from: classes3.dex */
public class a implements o8.a {

    /* renamed from: a, reason: collision with root package name */
    public c f23554a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f23555b;

    public a(c cVar) {
        this.f23554a = cVar;
    }

    @Override // o8.a
    public void a(int i10) {
        this.f23555b.remove(i10);
        c();
        this.f23554a.c();
    }

    @Override // o8.a
    public ArrayList b() {
        return this.f23555b;
    }

    public final void c() {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < this.f23555b.size(); i10++) {
            k8.c cVar = (k8.c) this.f23555b.get(i10);
            sb.append(cVar.b());
            sb.append("#&#");
            sb.append(cVar.a());
            sb.append("#&#");
            sb.append(cVar.c());
            if (i10 != this.f23555b.size() - 1) {
                sb.append("#&#");
            }
        }
        o.c().q(this.f23554a.getContext(), "wol_history", sb.toString());
    }

    @Override // o8.a
    public void d() {
        this.f23555b = new ArrayList();
        String strF = o.c().f(this.f23554a.getContext(), "wol_history", null);
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        String[] strArrSplit = strF.split("#&#");
        if (strArrSplit.length % 3 != 0) {
            o.c().i(this.f23554a.getContext(), BuildConfig.FLAVOR, "wol_history");
            return;
        }
        for (int i10 = 0; i10 < strArrSplit.length; i10 += 3) {
            k8.c cVar = new k8.c();
            cVar.e(strArrSplit[i10]);
            cVar.d(strArrSplit[i10 + 1]);
            cVar.f(strArrSplit[i10 + 2]);
            this.f23555b.add(cVar);
        }
    }

    @Override // o8.a
    public void e(String str, String str2, String str3) {
        k8.c cVar = new k8.c();
        cVar.e(str);
        cVar.d(str2);
        cVar.f(str3);
        this.f23555b.add(cVar);
        c();
        this.f23554a.c();
    }
}
