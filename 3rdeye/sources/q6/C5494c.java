package q6;

import F7.o;
import Z6.c;
import b9.C2001h;
import b9.j;
import b9.p;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import d7.C4278a;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p9.InterfaceC5480a;

/* compiled from: StoredValuesController.kt */
/* renamed from: q6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5494c {

    /* renamed from: a, reason: collision with root package name */
    public final p f45443a;

    /* compiled from: StoredValuesController.kt */
    /* renamed from: q6.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45444a;

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
            try {
                iArr[c.h.ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c.h.DICT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f45444a = iArr;
        }
    }

    /* compiled from: StoredValuesController.kt */
    /* renamed from: q6.c$b */
    public static final class b extends m implements InterfaceC5480a<o> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ O7.a<F7.c> f45445g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(O7.a<? extends F7.c> aVar) {
            super(0);
            this.f45445g = aVar;
        }

        @Override // p9.InterfaceC5480a
        public final o invoke() {
            return this.f45445g.get().a();
        }
    }

    public C5494c(O7.a<? extends F7.c> aVar) {
        this.f45443a = C2001h.b(new b(aVar));
    }

    public static Z6.c a(JSONObject jSONObject, c.h hVar, String str) throws JSONException {
        switch (a.f45444a[hVar.ordinal()]) {
            case 1:
                String string = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                l.e(string, "getString(KEY_VALUE)");
                return new c.g(str, string);
            case 2:
                return new c.f(str, jSONObject.getLong(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            case 3:
                return new c.b(str, jSONObject.getBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            case 4:
                return new c.e(str, jSONObject.getDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            case 5:
                String string2 = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                l.e(string2, "getString(KEY_VALUE)");
                return new c.C0206c(str, C4278a.C0440a.a(string2));
            case 6:
                String string3 = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                l.e(string3, "getString(KEY_VALUE)");
                try {
                    new URL(string3);
                    return new c.i(str, string3);
                } catch (MalformedURLException unused) {
                    throw new IllegalArgumentException("Invalid url ".concat(string3));
                }
            case 7:
                JSONArray jSONArray = jSONObject.getJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                l.e(jSONArray, "getJSONArray(KEY_VALUE)");
                return new c.a(str, jSONArray);
            case 8:
                JSONObject jSONObject2 = jSONObject.getJSONObject(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                l.e(jSONObject2, "getJSONObject(KEY_VALUE)");
                return new c.d(str, jSONObject2);
            default:
                throw new j();
        }
    }
}
