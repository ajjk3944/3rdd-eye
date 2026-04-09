package pd;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EdgeEffect;
import androidx.lifecycle.l0;
import c7.l;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.internal.ads.aq0;
import com.liuzh.deviceinfo.R;
import j2.l2;
import j2.v1;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import je.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.o3;
import p.q3;
import t6.c0;
import t6.x;
import zj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static o.e f31716a;

    public static void A(JsonWriter jsonWriter, JSONObject jSONObject) throws JSONException, IOException {
        try {
            jsonWriter.beginObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    A(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String strValueOf = String.valueOf(obj);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 23);
                        sb2.append("unable to write field: ");
                        sb2.append(strValueOf);
                        throw new JSONException(sb2.toString());
                    }
                    B(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e2) {
            throw new IOException(e2);
        }
    }

    public static void B(JsonWriter jsonWriter, JSONArray jSONArray) throws JSONException, IOException {
        try {
            jsonWriter.beginArray();
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                Object obj = jSONArray.get(i4);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    A(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String strValueOf = String.valueOf(obj);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 23);
                        sb2.append("unable to write field: ");
                        sb2.append(strValueOf);
                        throw new JSONException(sb2.toString());
                    }
                    B(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e2) {
            throw new IOException(e2);
        }
    }

    public static JSONObject C(String str, JSONObject jSONObject) throws JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static Bundle D(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof Double) {
                    bundle.putDouble(next, ((Double) objOpt).doubleValue());
                } else if (objOpt instanceof Integer) {
                    bundle.putInt(next, ((Integer) objOpt).intValue());
                } else if (objOpt instanceof Long) {
                    bundle.putLong(next, ((Long) objOpt).longValue());
                } else if (objOpt instanceof String) {
                    bundle.putString(next, (String) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i4 = 0;
                        Object objOpt2 = null;
                        for (int i10 = 0; objOpt2 == null && i10 < length; i10++) {
                            objOpt2 = !jSONArray.isNull(i10) ? jSONArray.opt(i10) : null;
                        }
                        if (objOpt2 == null) {
                            za.i.h("Expected JSONArray with at least 1 non-null element for key:".concat(String.valueOf(next)));
                        } else if (objOpt2 instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i4 < length) {
                                bundleArr[i4] = !jSONArray.isNull(i4) ? D(jSONArray.optJSONObject(i4)) : null;
                                i4++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (objOpt2 instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i4 < length) {
                                dArr[i4] = jSONArray.optDouble(i4);
                                i4++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (objOpt2 instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i4 < length) {
                                strArr[i4] = !jSONArray.isNull(i4) ? jSONArray.optString(i4) : null;
                                i4++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (objOpt2 instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i4 < length) {
                                zArr[i4] = jSONArray.optBoolean(i4);
                                i4++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            za.i.h("JSONArray with unsupported type " + objOpt2.getClass().getCanonicalName() + " for key:" + next);
                        }
                    }
                } else if (objOpt instanceof JSONObject) {
                    bundle.putBundle(next, D((JSONObject) objOpt));
                } else {
                    za.i.h("Unsupported type for key:".concat(String.valueOf(next)));
                }
            }
        }
        return bundle;
    }

    public static String E(aq0 aq0Var) throws JSONException, IOException {
        if (aq0Var == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            F(jsonWriter, aq0Var);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e2) {
            za.i.f("Error when writing JSON.", e2);
            return null;
        }
    }

    public static void F(JsonWriter jsonWriter, Object obj) throws JSONException, IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof aq0) {
            A(jsonWriter, ((aq0) obj).f9389d);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                F(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                F(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }

    public static JSONObject G(JSONObject jSONObject, String[] strArr) {
        for (int i4 = 0; i4 < strArr.length - 1; i4 = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }

    public static final long a(float f10, float f11) {
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final String b(int i4, Context context) throws Resources.NotFoundException {
        nk.k.e(context, "ctx");
        int i10 = i4 - 1;
        String[] stringArray = context.getResources().getStringArray(R.array.android_versions);
        nk.k.d(stringArray, "getStringArray(...)");
        if (i10 >= 0 && i10 < stringArray.length) {
            return stringArray[i10];
        }
        String string = context.getString(R.string.bu_unknown);
        nk.k.d(string, "getString(...)");
        return string;
    }

    public static final int c(int i4) {
        switch (i4) {
            case 3:
                return R.drawable.img_android_cupcake;
            case 4:
                return R.drawable.img_android_donut;
            case 5:
            case 6:
            case 7:
                return R.drawable.img_android_eclair;
            case 8:
                return R.drawable.img_android_froyo;
            case 9:
            case 10:
                return R.drawable.img_android_gingerbread;
            case 11:
            case 12:
            case 13:
                return R.drawable.img_android_honeycomb;
            case 14:
            case 15:
                return R.drawable.img_android_ice_cream_sandwich;
            case 16:
            case 17:
            case 18:
                return R.drawable.img_android_jellybean;
            case 19:
            case 20:
                return R.drawable.img_android_kitkat;
            case 21:
            case 22:
                return R.drawable.img_android_lollipop;
            case 23:
                return R.drawable.img_android_marshmallow;
            case 24:
            case 25:
                return R.drawable.img_android_nougat;
            case 26:
            case 27:
                return R.drawable.img_android_oreo;
            case 28:
                return R.drawable.img_android_pie;
            case 29:
                return R.drawable.img_android_q;
            case 30:
                return R.drawable.img_android_r;
            case 31:
            case 32:
                return R.drawable.img_android_s_12;
            case 33:
                return R.drawable.img_android_tiramisu_13;
            case 34:
                return R.drawable.img_android_u14;
            case 35:
                return R.drawable.img_android_v15;
            case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                return R.drawable.img_android_w16;
            default:
                return R.drawable.img_android_logo;
        }
    }

    public static final void d(View view) {
        nk.k.e(view, "<this>");
        uk.g gVarR = jm.a.r(new c0.h(view, null, 1));
        while (gVarR.hasNext()) {
            ArrayList arrayList = k((View) gVarR.next()).f28588a;
            for (int iR = cm.g.r(arrayList); -1 < iR; iR--) {
                j2.a aVar = ((v1) arrayList.get(iR)).f27330a;
                l2 l2Var = aVar.f27062c;
                if (l2Var != null) {
                    l2Var.a();
                }
                aVar.f27062c = null;
                aVar.requestLayout();
            }
        }
    }

    public static int e(String str, int i4, int i10, boolean z3) {
        while (i4 < i10) {
            char cCharAt = str.charAt(i4);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z3)) {
                return i4;
            }
            i4++;
        }
        return i10;
    }

    public static final boolean f(String str, String str2) {
        nk.k.e(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i4 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i4 < str.length()) {
                    char cCharAt = str.charAt(i4);
                    int i12 = i11 + 1;
                    if (i11 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt == '(') {
                        i10++;
                    } else if (cCharAt == ')' && i10 - 1 == 0 && i11 != str.length() - 1) {
                        break;
                    }
                    i4++;
                    i11 = i12;
                } else if (i10 == 0) {
                    String strSubstring = str.substring(1, str.length() - 1);
                    nk.k.d(strSubstring, "substring(...)");
                    return nk.k.a(vk.i.V0(strSubstring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final void g(ViewGroup viewGroup) {
        com.facebook.shimmer.e eVar;
        ValueAnimator valueAnimator;
        View childAt = viewGroup.getChildAt(0);
        if ((childAt instanceof ShimmerFrameLayout) && (valueAnimator = (eVar = ((ShimmerFrameLayout) childAt).f8939b).f8967e) != null && valueAnimator.isStarted()) {
            eVar.f8967e.cancel();
        }
    }

    public static final String h(Collection collection) {
        nk.k.e(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return vk.j.k0(n.g0(collection, ",\n", "\n", "\n", null, 56)) + "},";
    }

    public static float i(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return j4.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final int j(Number number) {
        float fFloatValue = number.floatValue();
        Context context = pk.a.f32022a;
        nk.k.b(context);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        nk.k.d(displayMetrics, "getDisplayMetrics(...)");
        return pk.a.s(TypedValue.applyDimension(1, fFloatValue, displayMetrics));
    }

    public static final l4.a k(View view) {
        l4.a aVar = (l4.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar != null) {
            return aVar;
        }
        l4.a aVar2 = new l4.a();
        view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
        return aVar2;
    }

    public static final c0 l(x xVar, String str, l lVar, mk.a aVar) {
        nk.k.e(xVar, "tracer");
        nk.k.e(str, "label");
        nk.k.e(lVar, "executor");
        l0 l0Var = new l0(c0.f34327c);
        return new c0(l0Var, jm.a.n(new lf.d(lVar, xVar, str, aVar, l0Var)));
    }

    public static float m(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return j4.c.c(edgeEffect, f10, f11);
        }
        j4.b.a(edgeEffect, f10, f11);
        return f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long n(int r14, java.lang.String r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.b.n(int, java.lang.String):long");
    }

    public static void o(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e2) {
                u(cls, e2);
                throw null;
            } catch (InstantiationException e10) {
                u(cls, e10);
                throw null;
            } catch (NoSuchMethodException e11) {
                u(cls, e11);
                throw null;
            } catch (InvocationTargetException e12) {
                u(cls, e12);
                throw null;
            }
        } catch (ClassNotFoundException e13) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e13);
        }
    }

    public static final void p(ViewGroup viewGroup, boolean z3) {
        nk.k.e(viewGroup, "container");
        int i4 = z3 ? R.layout.ad_native_placeholder : R.layout.ad_native_placeholder_noimg;
        viewGroup.removeAllViews();
        LayoutInflater.from(viewGroup.getContext()).inflate(i4, viewGroup);
        viewGroup.setVisibility(0);
    }

    public static final void q(v0.l0 l0Var, int i4, Object obj) {
        l0Var.f35589i[(l0Var.j - l0Var.f35586e[l0Var.f35587f - 1].f35583b) + i4] = obj;
    }

    public static final void r(v0.l0 l0Var, int i4, Object obj, int i10, Object obj2) {
        int i11 = l0Var.j - l0Var.f35586e[l0Var.f35587f - 1].f35583b;
        Object[] objArr = l0Var.f35589i;
        objArr[i4 + i11] = obj;
        objArr[i11 + i10] = obj2;
    }

    public static void s(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            o3.a(view, charSequence);
            return;
        }
        q3 q3Var = q3.f30825k;
        if (q3Var != null && q3Var.f30827a == view) {
            q3.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new q3(view, charSequence);
            return;
        }
        q3 q3Var2 = q3.f30826l;
        if (q3Var2 != null && q3Var2.f30827a == view) {
            q3Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void t(android.content.Context r8, java.io.File r9) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.b.t(android.content.Context, java.io.File):void");
    }

    public static void u(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public static List v(JSONArray jSONArray, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                arrayList.add(jSONArray.getString(i4));
            }
        }
        return arrayList;
    }

    public static void w(Object[] objArr, int i4) {
        for (int i10 = 0; i10 < i4; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(u.r(i10, "at index "));
            }
        }
    }

    public static ArrayList x(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static JSONObject y(JsonReader jsonReader) {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, z(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, y(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                }
                jSONObject.put(strNextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static JSONArray z(JsonReader jsonReader) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONArray.put(z(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONArray.put(y(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                }
                jSONArray.put(jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }
}
