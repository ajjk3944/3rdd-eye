package k6;

import H6.C0675l;
import Z6.d;
import android.net.Uri;
import d7.C4278a;
import io.appmetrica.analytics.impl.Oo;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DivActionTypedSetVariableHandler.kt */
/* renamed from: k6.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5241t extends kotlin.jvm.internal.m implements p9.l<Z6.d, Z6.d> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f43422g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0675l f43423h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5241t(C5242u c5242u, Object obj, C0675l c0675l, String str) {
        super(1);
        this.f43422g = obj;
        this.f43423h = c0675l;
        this.i = str;
    }

    @Override // p9.l
    public final Z6.d invoke(Z6.d dVar) throws NumberFormatException, Z6.f {
        Z6.d variable = dVar;
        kotlin.jvm.internal.l.f(variable, "variable");
        boolean z10 = variable instanceof d.a;
        C0675l c0675l = this.f43423h;
        String lowerCase = "array";
        Object obj = this.f43422g;
        String str = this.i;
        if (z10) {
            boolean z11 = obj instanceof JSONArray;
            JSONArray jSONArray = (JSONArray) (z11 ? obj : null);
            if (jSONArray == null) {
                if (obj instanceof Integer ? true : obj instanceof Double) {
                    lowerCase = "number";
                } else if (obj instanceof JSONObject) {
                    lowerCase = "dict";
                } else if (!z11) {
                    lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
                }
                C5246y.d(c0675l, new IllegalArgumentException(Oo.f("Trying to set value with invalid type (", lowerCase, ") to variable ", str)));
            }
            if (jSONArray != null) {
                ((d.a) variable).g(jSONArray);
                return variable;
            }
        } else if (variable instanceof d.b) {
            Boolean bool = (Boolean) (obj instanceof Boolean ? obj : null);
            if (bool == null) {
                if (obj instanceof Integer ? true : obj instanceof Double) {
                    lowerCase = "number";
                } else if (obj instanceof JSONObject) {
                    lowerCase = "dict";
                } else if (!(obj instanceof JSONArray)) {
                    lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
                }
                C5246y.d(c0675l, new IllegalArgumentException(Oo.f("Trying to set value with invalid type (", lowerCase, ") to variable ", str)));
            }
            if (bool != null) {
                d.b bVar = (d.b) variable;
                boolean zBooleanValue = bool.booleanValue();
                if (bVar.f14038c != zBooleanValue) {
                    bVar.f14038c = zBooleanValue;
                    bVar.c(bVar);
                    return variable;
                }
            }
        } else if (variable instanceof d.c) {
            boolean z12 = obj instanceof Integer;
            Integer num = (Integer) (!z12 ? null : obj);
            if (num == null) {
                if (z12 ? true : obj instanceof Double) {
                    lowerCase = "number";
                } else if (obj instanceof JSONObject) {
                    lowerCase = "dict";
                } else if (!(obj instanceof JSONArray)) {
                    lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
                }
                C5246y.d(c0675l, new IllegalArgumentException(Oo.f("Trying to set value with invalid type (", lowerCase, ") to variable ", str)));
            }
            if (num != null) {
                int iIntValue = num.intValue();
                d.c cVar = (d.c) variable;
                Integer num2 = (Integer) l7.h.f43881b.invoke(new C4278a(iIntValue));
                if (num2 == null) {
                    throw new Z6.f(2, "Wrong value format for color variable: '" + ((Object) C4278a.a(iIntValue)) + '\'', null);
                }
                int iIntValue2 = num2.intValue();
                if (cVar.f14040c != iIntValue2) {
                    cVar.f14040c = iIntValue2;
                    cVar.c(cVar);
                    return variable;
                }
            }
        } else if (variable instanceof d.C0207d) {
            boolean z13 = obj instanceof JSONObject;
            JSONObject jSONObject = (JSONObject) (z13 ? obj : null);
            if (jSONObject == null) {
                if (obj instanceof Integer ? true : obj instanceof Double) {
                    lowerCase = "number";
                } else if (z13) {
                    lowerCase = "dict";
                } else if (!(obj instanceof JSONArray)) {
                    lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
                }
                C5246y.d(c0675l, new IllegalArgumentException(Oo.f("Trying to set value with invalid type (", lowerCase, ") to variable ", str)));
            }
            if (jSONObject != null) {
                ((d.C0207d) variable).g(jSONObject);
                return variable;
            }
        } else if (variable instanceof d.e) {
            boolean z14 = obj instanceof Double;
            Double d10 = (Double) (z14 ? obj : null);
            if (d10 == null) {
                if (obj instanceof Integer ? true : z14) {
                    lowerCase = "number";
                } else if (obj instanceof JSONObject) {
                    lowerCase = "dict";
                } else if (!(obj instanceof JSONArray)) {
                    lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
                }
                C5246y.d(c0675l, new IllegalArgumentException(Oo.f("Trying to set value with invalid type (", lowerCase, ") to variable ", str)));
            }
            if (d10 != null) {
                ((d.e) variable).g(d10.doubleValue());
                return variable;
            }
        } else if (variable instanceof d.f) {
            Long l5 = (Long) (obj instanceof Long ? obj : null);
            if (l5 == null) {
                if (obj instanceof Integer ? true : obj instanceof Double) {
                    lowerCase = "number";
                } else if (obj instanceof JSONObject) {
                    lowerCase = "dict";
                } else if (!(obj instanceof JSONArray)) {
                    lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
                }
                C5246y.d(c0675l, new IllegalArgumentException(Oo.f("Trying to set value with invalid type (", lowerCase, ") to variable ", str)));
            }
            if (l5 != null) {
                ((d.f) variable).g(l5.longValue());
                return variable;
            }
        } else if (variable instanceof d.g) {
            String str2 = (String) (obj instanceof String ? obj : null);
            if (str2 == null) {
                if (obj instanceof Integer ? true : obj instanceof Double) {
                    lowerCase = "number";
                } else if (obj instanceof JSONObject) {
                    lowerCase = "dict";
                } else if (!(obj instanceof JSONArray)) {
                    lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
                }
                C5246y.d(c0675l, new IllegalArgumentException(Oo.f("Trying to set value with invalid type (", lowerCase, ") to variable ", str)));
            }
            if (str2 != null) {
                variable.d(str2);
                return variable;
            }
        } else if (variable instanceof d.h) {
            Uri uri = (Uri) (obj instanceof Uri ? obj : null);
            if (uri == null) {
                if (obj instanceof Integer ? true : obj instanceof Double) {
                    lowerCase = "number";
                } else if (obj instanceof JSONObject) {
                    lowerCase = "dict";
                } else if (!(obj instanceof JSONArray)) {
                    lowerCase = obj.getClass().getSimpleName().toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
                }
                C5246y.d(c0675l, new IllegalArgumentException(Oo.f("Trying to set value with invalid type (", lowerCase, ") to variable ", str)));
            }
            if (uri != null) {
                ((d.h) variable).g(uri);
            }
        }
        return variable;
    }
}
