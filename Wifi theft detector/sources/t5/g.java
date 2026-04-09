package t5;

import android.text.TextUtils;
import com.iab.omid.library.mmadbridge.adsession.CreativeType;
import com.iab.omid.library.mmadbridge.adsession.ImpressionType;
import com.iab.omid.library.mmadbridge.adsession.Owner;

/* loaded from: classes3.dex */
public abstract class g {
    public static void a() {
        if (!n5.a.b()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void b(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void d(String str, int i10, String str2) {
        if (str.length() > i10) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void f(o5.g gVar) {
        i(gVar);
        g(gVar);
    }

    public static void g(o5.g gVar) {
        if (gVar.r()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void h(o5.g gVar) {
        if (gVar.w()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    public static void i(o5.g gVar) {
        if (!gVar.w()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    public static void j(o5.g gVar) {
        if (!gVar.u()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static void k(o5.g gVar) {
        if (!gVar.v()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    public static void l(o5.g gVar) {
        if (gVar.t().r() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    public static void m(o5.g gVar) {
        if (gVar.t().s() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }
}
