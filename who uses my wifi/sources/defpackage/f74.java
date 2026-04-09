package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class f74 implements j4 {
    public static MessageDigest h;
    public final /* synthetic */ int f;
    public Object g;

    public /* synthetic */ f74(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public abstract byte A1(long j);

    public abstract int C1();

    public abstract int D1();

    public abstract void F1(long j, byte[] bArr, long j2, long j3);

    public abstract boolean H1();

    public abstract void I1();

    public abstract o42 J1();

    public abstract oz1 K1();

    public synchronized void L1(Object obj, Executor executor) {
        ((HashMap) this.g).put(obj, executor);
    }

    public abstract int N1();

    public abstract int O1();

    public synchronized void P1(dp2 dp2Var) {
        for (Map.Entry entry : ((HashMap) this.g).entrySet()) {
            ((Executor) entry.getValue()).execute(new n62(dp2Var, entry.getKey(), 19));
        }
    }

    public abstract long Q1();

    public abstract long R1();

    public abstract boolean S1();

    public abstract int T1();

    @Override // defpackage.j4
    public List c1() {
        return (List) this.g;
    }

    public abstract int d();

    @Override // defpackage.j4
    public boolean g1() {
        List list = (List) this.g;
        return list.isEmpty() || (list.size() == 1 && ((w40) list.get(0)).c());
    }

    public void h1(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            StringBuilder sb = new StringBuilder(str2.length() + 108);
            sb.append("Value ");
            sb.append(str2);
            sb.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            gi2.i0(sb.toString());
        }
        ((Bundle) ((o7) this.g).h).putString(str, str2);
    }

    public abstract void i();

    public f74 i1(Bundle bundle) {
        o7 o7Var = (o7) this.g;
        ((Bundle) o7Var.e).putBundle(AdMobAdapter.class.getName(), bundle);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            ((HashSet) o7Var.g).remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return l1();
    }

    public abstract void j1(p21 p21Var);

    public abstract String k1();

    public abstract f74 l1();

    public void m1(String str) {
        ou1.k(str, "Content URL must be non-null.");
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Content URL must be non-empty.");
        }
        int length = str.length();
        Object[] objArr = {512, Integer.valueOf(str.length())};
        if (!(length <= 512)) {
            throw new IllegalArgumentException(String.format("Content URL must not exceed %d in length.  Provided length was %d.", objArr));
        }
        ((o7) this.g).j = str;
    }

    public void n1(ArrayList arrayList) {
        ArrayList arrayList2 = (ArrayList) ((o7) this.g).k;
        arrayList2.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                gi2.i0("neighboring content URL should not be null or empty");
            } else {
                arrayList2.add(str);
            }
        }
    }

    public abstract long o1();

    public abstract void p1();

    public abstract void q1(Object obj, long j, byte b);

    public n70 r1() {
        return md2.a.a((a9) this.g);
    }

    public MessageDigest s1() {
        synchronized (this.g) {
            MessageDigest messageDigest = h;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    h = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return h;
        }
    }

    public abstract boolean t1(long j, Object obj);

    public String toString() {
        switch (this.f) {
            case 2:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.g;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public abstract void u1(int i, long j);

    public abstract void v1(Object obj, long j, boolean z);

    public abstract float w1(long j, Object obj);

    public abstract void x1(Object obj, long j, float f);

    public abstract double y1(long j, Object obj);

    public abstract void z1(Object obj, long j, double d);

    public f74(int i) {
        this.f = i;
        switch (i) {
            case 3:
                break;
            case 6:
                this.g = new a9(23, this);
                break;
            case 7:
                this.g = new Object();
                break;
            case 10:
                this.g = new ez1();
                break;
            default:
                o7 o7Var = new o7();
                this.g = o7Var;
                ((HashSet) o7Var.g).add("B3EEABB8EE11C2BE770B684D95219ECB");
                break;
        }
    }

    public f74(View view) {
        this.f = 8;
        this.g = new WeakReference(view);
    }

    public f74(Set set) {
        this.f = 9;
        this.g = new HashMap();
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                up2 up2Var = (up2) it.next();
                synchronized (this) {
                    L1(up2Var.a, up2Var.b);
                }
            }
        }
    }
}
