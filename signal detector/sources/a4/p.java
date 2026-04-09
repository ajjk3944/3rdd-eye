package a4;

import G3.C0151e;
import G3.C0154h;
import a.AbstractC0241a;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EdgeEffect;
import com.google.android.gms.internal.ads.Ut;
import e5.C2307c;
import g0.C2329b;
import h5.C2376j;
import h5.InterfaceC2373g;
import h5.InterfaceC2374h;
import h5.InterfaceC2375i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import q0.J;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f4714a = true;

    public static JSONArray A(JsonReader jsonReader) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONArray.put(A(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONArray.put(x(jsonReader));
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

    public static Pair B(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i3;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - byteBufferAllocate.capacity();
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        E(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i3 = -1;
        } else {
            int i6 = iCapacity - 22;
            int iMin = Math.min(i6, 65535);
            for (int i7 = 0; i7 < iMin; i7++) {
                i3 = i6 - i7;
                if (byteBufferAllocate.getInt(i3) == 101010256 && ((char) byteBufferAllocate.getShort(i3 + 20)) == i7) {
                    break;
                }
            }
            i3 = -1;
        }
        if (i3 == -1) {
            return null;
        }
        byteBufferAllocate.position(i3);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + i3));
    }

    public static void C(JsonWriter jsonWriter, JSONObject jSONObject) throws JSONException, IOException {
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
                    C(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String strValueOf = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
                        sb.append("unable to write field: ");
                        sb.append(strValueOf);
                        throw new JSONException(sb.toString());
                    }
                    D(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e6) {
            throw new IOException(e6);
        }
    }

    public static void D(JsonWriter jsonWriter, JSONArray jSONArray) throws JSONException, IOException {
        try {
            jsonWriter.beginArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    C(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String strValueOf = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
                        sb.append("unable to write field: ");
                        sb.append(strValueOf);
                        throw new JSONException(sb.toString());
                    }
                    D(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e6) {
            throw new IOException(e6);
        }
    }

    public static void E(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static JSONObject F(String str, JSONObject jSONObject) throws JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static Bundle G(JSONObject jSONObject) {
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
                        int i = 0;
                        Object objOpt2 = null;
                        for (int i3 = 0; objOpt2 == null && i3 < length; i3++) {
                            objOpt2 = !jSONArray.isNull(i3) ? jSONArray.opt(i3) : null;
                        }
                        if (objOpt2 == null) {
                            u2.k.h("Expected JSONArray with at least 1 non-null element for key:".concat(String.valueOf(next)));
                        } else if (objOpt2 instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i < length) {
                                bundleArr[i] = !jSONArray.isNull(i) ? G(jSONArray.optJSONObject(i)) : null;
                                i++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (objOpt2 instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i < length) {
                                dArr[i] = jSONArray.optDouble(i);
                                i++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (objOpt2 instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i < length) {
                                strArr[i] = !jSONArray.isNull(i) ? jSONArray.optString(i) : null;
                                i++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (objOpt2 instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i < length) {
                                zArr[i] = jSONArray.optBoolean(i);
                                i++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            u2.k.h("JSONArray with unsupported type " + objOpt2.getClass().getCanonicalName() + " for key:" + next);
                        }
                    }
                } else if (objOpt instanceof JSONObject) {
                    bundle.putBundle(next, G((JSONObject) objOpt));
                } else {
                    u2.k.h("Unsupported type for key:".concat(String.valueOf(next)));
                }
            }
        }
        return bundle;
    }

    public static String H(Ut ut) throws JSONException, IOException {
        if (ut == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            I(jsonWriter, ut);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e6) {
            u2.k.f("Error when writing JSON.", e6);
            return null;
        }
    }

    public static void I(JsonWriter jsonWriter, Object obj) throws JSONException, IOException {
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
        if (obj instanceof Ut) {
            C(jsonWriter, ((Ut) obj).f11814d);
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
                I(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                I(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }

    public static JSONObject J(JSONObject jSONObject, String[] strArr) {
        for (int i = 0; i < strArr.length - 1; i = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }

    public static C2307c a(C2307c c2307c) {
        c2307c.f();
        c2307c.f19954c = true;
        return c2307c.f19953b > 0 ? c2307c : C2307c.f19951d;
    }

    public static int b(int i) {
        if (i == 0 || i <= -100) {
            return -1;
        }
        if (i >= -55) {
            return 4;
        }
        return (int) (((i - (-100)) * 4.0f) / 45.0f);
    }

    public static J c(TypedValue typedValue, J j6, J j7, String str, String str2) throws XmlPullParserException {
        if (j6 == null || j6 == j7) {
            return j6 == null ? j7 : j6;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    public static AbstractC0241a d(int i) {
        return i != 0 ? i != 1 ? new G3.m() : new C0151e() : new G3.m();
    }

    public static View e(int i, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View viewFindViewById = viewGroup.getChildAt(i3).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static Activity f(Context context) {
        q5.i.e(context, "<this>");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        q5.i.d(baseContext, "getBaseContext(...)");
        return f(baseContext);
    }

    public static int g(int i) {
        switch (i) {
            case 2412:
                return 1;
            case 2417:
                return 2;
            case 2422:
                return 3;
            case 2427:
                return 4;
            case 2432:
                return 5;
            case 2437:
                return 6;
            case 2442:
                return 7;
            case 2447:
                return 8;
            case 2452:
                return 9;
            case 2457:
                return 10;
            case 2462:
                return 11;
            case 2467:
                return 12;
            case 2472:
                return 13;
            case 2484:
                return 14;
            case 5080:
                return 16;
            case 5170:
                return 34;
            case 5180:
                return 36;
            case 5190:
                return 38;
            case 5200:
                return 40;
            case 5210:
                return 42;
            case 5220:
                return 44;
            case 5230:
                return 46;
            case 5240:
                return 48;
            case 5250:
                return 50;
            case 5260:
                return 52;
            case 5270:
                return 54;
            case 5280:
                return 56;
            case 5290:
                return 58;
            case 5300:
                return 60;
            case 5310:
                return 62;
            case 5320:
                return 64;
            case 5500:
                return 100;
            case 5510:
                return 102;
            case 5520:
                return 104;
            case 5530:
                return 106;
            case 5540:
                return 108;
            case 5550:
                return 110;
            case 5560:
                return 112;
            case 5570:
                return 114;
            case 5580:
                return 116;
            case 5590:
                return 118;
            case 5600:
                return 120;
            case 5610:
                return 122;
            case 5620:
                return 124;
            case 5630:
                return 126;
            case 5745:
                return 149;
            case 5765:
                return 153;
            case 5785:
                return 157;
            case 5805:
                return 161;
            case 5825:
                return 165;
            default:
                return -1;
        }
    }

    public static float h(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return U.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static String i(Integer num) {
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue() & 255;
        int iIntValue2 = (num.intValue() >> 8) & 255;
        int iIntValue3 = (num.intValue() >> 16) & 255;
        int iIntValue4 = (num.intValue() >> 24) & 255;
        StringBuilder sb = new StringBuilder();
        sb.append(iIntValue);
        sb.append(".");
        sb.append(iIntValue2);
        sb.append(".");
        sb.append(iIntValue3);
        return A.f.i(iIntValue4, ".", sb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0030, code lost:
    
        r9 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String j(android.content.Context r7, java.lang.Integer r8, android.net.wifi.WifiManager r9) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.p.j(android.content.Context, java.lang.Integer, android.net.wifi.WifiManager):java.lang.String");
    }

    public static String k(String str, String str2) {
        q5.i.e(str, "tableName");
        q5.i.e(str2, "triggerType");
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }

    public static List l(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        q5.i.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static InterfaceC2375i m(InterfaceC2373g interfaceC2373g, InterfaceC2374h interfaceC2374h) {
        q5.i.e(interfaceC2374h, "key");
        return q5.i.a(interfaceC2373g.getKey(), interfaceC2374h) ? C2376j.f20486a : interfaceC2373g;
    }

    public static float n(EdgeEffect edgeEffect, float f2, float f5) {
        if (Build.VERSION.SDK_INT >= 31) {
            return U.c.c(edgeEffect, f2, f5);
        }
        U.b.a(edgeEffect, f2, f5);
        return f2;
    }

    public static C2329b o(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j6;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                j6 = -1;
                break;
            }
            int i6 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j6 = byteBufferDuplicate.getInt() & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i6) {
                break;
            }
            i3++;
        }
        if (j6 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j6 - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j7 = byteBufferDuplicate.getInt() & 4294967295L;
            for (int i7 = 0; i7 < j7; i7++) {
                int i8 = byteBufferDuplicate.getInt();
                long j8 = byteBufferDuplicate.getInt() & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i8 || 1701669481 == i8) {
                    byteBufferDuplicate.position((int) (j8 + j6));
                    C2329b c2329b = new C2329b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    c2329b.f3262d = byteBufferDuplicate;
                    c2329b.f3259a = iPosition;
                    int i9 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    c2329b.f3260b = i9;
                    c2329b.f3261c = ((ByteBuffer) c2329b.f3262d).getShort(i9);
                    return c2329b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final byte[] p(URL url) throws IOException {
        InputStream inputStreamOpenStream = url.openStream();
        try {
            q5.i.b(inputStreamOpenStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStreamOpenStream.available()));
            T2.g.f(inputStreamOpenStream, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            q5.i.d(byteArray, "toByteArray(...)");
            inputStreamOpenStream.close();
            return byteArray;
        } finally {
        }
    }

    public static void q(ViewGroup viewGroup, float f2) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof G3.j) {
            ((G3.j) background).p(f2);
        }
    }

    public static void r(View view, G3.j jVar) {
        t3.a aVar = jVar.f1597b.f1562c;
        if (aVar == null || !aVar.f23666a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        C0154h c0154h = jVar.f1597b;
        if (c0154h.f1571m != elevation) {
            c0154h.f1571m = elevation;
            jVar.z();
        }
    }

    public static void s(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof G3.j) {
            r(viewGroup, (G3.j) background);
        }
    }

    public static void t(ViewGroup viewGroup, boolean z6) {
        if (Build.VERSION.SDK_INT >= 29) {
            L0.u.b(viewGroup, z6);
        } else if (f4714a) {
            try {
                L0.u.b(viewGroup, z6);
            } catch (NoSuchMethodError unused) {
                f4714a = false;
            }
        }
    }

    public static List u(JSONArray jSONArray, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        return arrayList;
    }

    public static ArrayList v(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static void w(int i, int i3) {
        String strW;
        if (i < 0 || i >= i3) {
            if (i < 0) {
                strW = t.w("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i3 < 0) {
                    throw new IllegalArgumentException(A.f.i(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
                }
                strW = t.w("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strW);
        }
    }

    public static JSONObject x(JsonReader jsonReader) {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, A(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, x(jsonReader));
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

    public static void y(int i, int i3, int i6) {
        if (i < 0 || i3 < i || i3 > i6) {
            throw new IndexOutOfBoundsException((i < 0 || i > i6) ? z(i, i6, "start index") : (i3 < 0 || i3 > i6) ? z(i3, i6, "end index") : t.w("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i)));
        }
    }

    public static String z(int i, int i3, String str) {
        if (i < 0) {
            return t.w("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i3 >= 0) {
            return t.w("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(A.f.i(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
    }
}
