package q6;

import E.u;
import F7.o;
import F7.p;
import H6.C0675l;
import J7.a;
import N7.C1154e9;
import Z6.c;
import androidx.work.s;
import b9.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import l7.h;
import org.json.JSONException;
import org.json.JSONObject;
import y9.q;

/* compiled from: StoredValuesActionHandler.kt */
/* renamed from: q6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5493b {

    /* compiled from: StoredValuesActionHandler.kt */
    /* renamed from: q6.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45442a;

        static {
            int[] iArr = new int[c.h.values().length];
            try {
                iArr[c.h.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.h.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.h.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.h.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.h.COLOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.h.URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f45442a = iArr;
        }
    }

    public static Z6.c a(c.h hVar, String str, String str2) throws NumberFormatException, C5492a {
        switch (a.f45442a[hVar.ordinal()]) {
            case 1:
                return new c.g(str, str2);
            case 2:
                try {
                    return new c.f(str, Long.parseLong(str2));
                } catch (NumberFormatException e4) {
                    throw new C5492a(1, e4, null);
                }
            case 3:
                Boolean boolV0 = q.v0(str2);
                if (boolV0 == null) {
                    try {
                        int i = Integer.parseInt(str2);
                        boolV0 = i != 0 ? i != 1 ? null : Boolean.TRUE : Boolean.FALSE;
                        if (boolV0 == null) {
                            throw new C5492a(2, null, C1154e9.i("Unable to convert ", str2, " to boolean"));
                        }
                    } catch (NumberFormatException e10) {
                        throw new C5492a(1, e10, null);
                    }
                }
                return new c.b(str, boolV0.booleanValue());
            case 4:
                try {
                    return new c.e(str, Double.parseDouble(str2));
                } catch (NumberFormatException e11) {
                    throw new C5492a(1, e11, null);
                }
            case 5:
                Integer num = (Integer) h.f43881b.invoke(str2);
                if (num != null) {
                    return new c.C0206c(str, num.intValue());
                }
                throw new C5492a(2, null, s.e("Wrong value format for color stored value: '", str2, '\''));
            case 6:
                try {
                    try {
                        new URL(str2);
                        return new c.i(str, str2);
                    } catch (MalformedURLException unused) {
                        throw new IllegalArgumentException("Invalid url ".concat(str2));
                    }
                } catch (IllegalArgumentException e12) {
                    throw new C5492a(1, e12, null);
                }
            default:
                throw new C5492a(2, null, "Cannot create stored value of type = '" + hVar + "'.");
        }
    }

    public static boolean b(Z6.c cVar, long j4, C0675l c0675l) throws JSONException {
        Object string;
        c.h obj;
        C5494c c5494cA = c0675l.getDiv2Component$div_release().A();
        Q6.c cVarA = c0675l.getViewComponent$div_release().a().a(c0675l.getDivData(), c0675l.getDivTag());
        String id = "stored_value_" + cVar.a();
        boolean z10 = cVar instanceof c.g;
        if (z10 ? true : cVar instanceof c.f ? true : cVar instanceof c.b ? true : cVar instanceof c.a ? true : cVar instanceof c.d ? true : cVar instanceof c.e) {
            string = cVar.b();
        } else {
            if (!(cVar instanceof c.i ? true : cVar instanceof c.C0206c)) {
                throw new j();
            }
            string = cVar.b().toString();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("expiration_time", (j4 * 1000) + System.currentTimeMillis());
        c.h.a aVar = c.h.Converter;
        if (z10) {
            obj = c.h.STRING;
        } else if (cVar instanceof c.f) {
            obj = c.h.INTEGER;
        } else if (cVar instanceof c.b) {
            obj = c.h.BOOLEAN;
        } else if (cVar instanceof c.e) {
            obj = c.h.NUMBER;
        } else if (cVar instanceof c.C0206c) {
            obj = c.h.COLOR;
        } else if (cVar instanceof c.i) {
            obj = c.h.URL;
        } else if (cVar instanceof c.a) {
            obj = c.h.ARRAY;
        } else {
            if (!(cVar instanceof c.d)) {
                throw new j();
            }
            obj = c.h.DICT;
        }
        aVar.getClass();
        l.f(obj, "obj");
        jSONObject.put("type", obj.value);
        jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, string);
        l.f(id, "id");
        List<p> list = ((o) c5494cA.f45443a.getValue()).c(new o.a(u.G(new a.C0050a(id, jSONObject)))).f1710b;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            cVarA.a((p) it.next());
        }
        return list.isEmpty();
    }
}
