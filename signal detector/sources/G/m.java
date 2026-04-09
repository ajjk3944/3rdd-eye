package G;

import M2.u;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC0640Nf;
import f4.InterfaceFutureC2326a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import n1.RunnableC2683a;
import o.U;
import o1.InterfaceC2759g;
import r1.C2870A;
import r1.C2873c;
import r1.x;

/* loaded from: classes.dex */
public abstract class m implements r1.s {

    /* renamed from: a, reason: collision with root package name */
    public Object f1505a;

    public m(int i) {
        switch (i) {
            case 2:
                char[] cArr = H1.p.f1779a;
                this.f1505a = new ArrayDeque(20);
                break;
            case 3:
            default:
                U u6 = new U();
                this.f1505a = u6;
                ((HashSet) u6.f22435g).add("B3EEABB8EE11C2BE770B684D95219ECB");
                break;
            case 4:
                this.f1505a = new RunnableC2683a(9, this);
                break;
        }
    }

    public void a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            StringBuilder sb = new StringBuilder(str2.length() + 108);
            sb.append("Value ");
            sb.append(str2);
            sb.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            u2.k.h(sb.toString());
        }
        ((Bundle) ((U) this.f1505a).f22436h).putString(str, str2);
    }

    public m b(Bundle bundle) {
        U u6 = (U) this.f1505a;
        ((Bundle) u6.f22433e).putBundle(AdMobAdapter.class.getName(), bundle);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            ((HashSet) u6.f22435g).remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return g();
    }

    public abstract void c(c1.g gVar);

    @Override // r1.s
    public r1.r d(x xVar) {
        return new C2873c(2, (C2870A) this.f1505a);
    }

    public abstract String e();

    public void f(InterfaceC2759g interfaceC2759g) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f1505a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(interfaceC2759g);
        }
    }

    public abstract m g();

    public void h(String str) {
        u.f(str, "Content URL must be non-null.");
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Content URL must be non-empty.");
        }
        int length = str.length();
        Object[] objArr = {512, Integer.valueOf(str.length())};
        if (!(length <= 512)) {
            throw new IllegalArgumentException(String.format("Content URL must not exceed %d in length.  Provided length was %d.", objArr));
        }
        ((U) this.f1505a).f22437j = str;
    }

    public void i(ArrayList arrayList) {
        ArrayList arrayList2 = (ArrayList) ((U) this.f1505a).f22438k;
        arrayList2.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                u2.k.h("neighboring content URL should not be null or empty");
            } else {
                arrayList2.add(str);
            }
        }
    }

    public abstract void j();

    public InterfaceFutureC2326a k() {
        return AbstractC0640Nf.f10005a.a((RunnableC2683a) this.f1505a);
    }

    public m(C2870A c2870a) {
        this.f1505a = c2870a;
    }
}
