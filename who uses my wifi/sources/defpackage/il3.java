package defpackage;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class il3 implements kl3, l34, ks2 {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ il3(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.ks2
    /* renamed from: c */
    public /* synthetic */ void mo12c(Object obj) {
        int i = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 2:
                int i2 = ya4.g0;
                ((zt1) obj).G(((dc4) obj2).f);
                break;
            default:
                ((bd4) obj).j((b84) obj2);
                break;
        }
    }

    @Override // defpackage.kl3
    public Iterator d(sq0 sq0Var, CharSequence charSequence) {
        return new gl3(charSequence, new ci3(((al3) this.g).t.matcher(charSequence)), 1);
    }

    @Override // defpackage.l34
    public Object l(String str) {
        o34 o34Var = (o34) this.g;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            Provider provider = Security.getProvider(strArr[i2]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                return o34Var.d(str, (Provider) obj);
            } catch (Exception unused) {
            }
        }
        return o34Var.d(str, null);
    }

    public /* synthetic */ il3(ad4 ad4Var, b84 b84Var) {
        this.f = 4;
        this.g = b84Var;
    }
}
