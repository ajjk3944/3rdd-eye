package Cb;

import Gb.f;
import Zg.AbstractC3689v;
import Zg.Q;
import Zg.U;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C6510d;
import kotlin.text.t;
import qh.AbstractC7510c;
import sh.C7968c;
import sh.C7974i;

/* loaded from: classes3.dex */
public final class b implements Cb.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f2475d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final f f2476a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2477b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2478c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(f ucoreStorage, boolean z10, String str) {
        AbstractC6492s.i(ucoreStorage, "ucoreStorage");
        this.f2476a = ucoreStorage;
        this.f2477b = z10;
        this.f2478c = str;
    }

    private final String c() {
        String str = this.f2478c;
        if (str != null) {
            return str;
        }
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    private final String d() {
        String string = UUID.randomUUID().toString();
        AbstractC6492s.h(string, "toString(...)");
        this.f2476a.l(string);
        return string;
    }

    private final String e() {
        String strJ = j();
        this.f2476a.B(strJ);
        return strJ;
    }

    private final String f() {
        String strP = this.f2476a.p();
        if (strP == null) {
            strP = d();
        }
        return "android-" + strP;
    }

    private final String g() {
        String strA = this.f2476a.A();
        if (strA != null) {
            return strA;
        }
        String str = Build.MANUFACTURER + " " + Build.MODEL;
        this.f2476a.J(str);
        return str;
    }

    private final String h() {
        String strA = this.f2476a.a();
        if (strA != null) {
            return strA;
        }
        String strC = c();
        this.f2476a.d(strC);
        return strC;
    }

    @Override // Cb.a
    public Map a() {
        String strI;
        Map mapC = U.c();
        if (this.f2477b && (strI = i()) != null) {
        }
        mapC.put("X-DEVICE-ID", f());
        mapC.put("X-DEVICE-NAME", Ib.a.a(Ib.a.b(h())));
        mapC.put("X-DEVICE-MODEL", g());
        return U.b(mapC);
    }

    @Override // Cb.a
    public String b() {
        if (!this.f2477b) {
            return "";
        }
        String strI = i();
        if (strI == null) {
            strI = e();
        }
        byte[] bytes = strI.getBytes(C6510d.f52215b);
        AbstractC6492s.h(bytes, "getBytes(...)");
        byte[] bArrEncode = Base64.encode(MessageDigest.getInstance("SHA-256").digest(bytes), 8);
        AbstractC6492s.h(bArrEncode, "encode(...)");
        return t.L(t.q1(t.y(bArrEncode)).toString(), "=", "", false, 4, null);
    }

    public final String i() {
        return this.f2476a.x();
    }

    public final String j() {
        List listK0 = AbstractC3689v.K0(new C7968c('a', 'z'), new C7968c('0', '9'));
        C7974i c7974i = new C7974i(1, 56);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(c7974i, 10));
        Iterator it = c7974i.iterator();
        while (it.hasNext()) {
            ((Q) it).d();
            Character ch2 = (Character) AbstractC3689v.O0(listK0, AbstractC7510c.f59421a);
            ch2.charValue();
            arrayList.add(ch2);
        }
        return AbstractC3689v.z0(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
