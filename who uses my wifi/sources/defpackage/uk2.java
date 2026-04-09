package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableRow;
import android.widget.TextView;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class uk2 implements of1 {
    public static Boolean f;
    public static final char[] g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final int[] h = {R.attr.colorPrimary};
    public static final int[] i = {R.attr.colorPrimaryVariant};
    public static final so1 j = new so1("gads:sdk_csi_server", "https://csi.gstatic.com/csi", 4);
    public static final zq2 k = new zq2(1);
    public static final ju l;
    public static final ju[] m;
    public static final p63 n;
    public static final /* synthetic */ int o = 0;

    static {
        ju juVar = new ju("app_set_id");
        l = juVar;
        m = new ju[]{juVar};
        n = new p63(12);
    }

    public uk2() {
        new ConcurrentHashMap();
    }

    public static void A(Parcel parcel, int i2, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int I = I(parcel, i2);
        parcel.writeByteArray(bArr);
        O(parcel, I);
    }

    public static void B(Parcel parcel, int i2, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int I = I(parcel, i2);
        parcel.writeStrongBinder(iBinder);
        O(parcel, I);
    }

    public static void C(Parcel parcel, int i2, Parcelable parcelable, int i3) {
        if (parcelable == null) {
            return;
        }
        int I = I(parcel, i2);
        parcelable.writeToParcel(parcel, i3);
        O(parcel, I);
    }

    public static void D(Parcel parcel, int i2, String str) {
        if (str == null) {
            return;
        }
        int I = I(parcel, i2);
        parcel.writeString(str);
        O(parcel, I);
    }

    public static void E(Parcel parcel, int i2, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int I = I(parcel, i2);
        parcel.writeStringArray(strArr);
        O(parcel, I);
    }

    public static void F(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int I = I(parcel, i2);
        parcel.writeStringList(list);
        O(parcel, I);
    }

    public static void G(Parcel parcel, int i2, Parcelable[] parcelableArr, int i3) {
        if (parcelableArr == null) {
            return;
        }
        int I = I(parcel, i2);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i3);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        O(parcel, I);
    }

    public static void H(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int I = I(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcelable parcelable = (Parcelable) list.get(i3);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        O(parcel, I);
    }

    public static int I(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static File J(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(R(file, str), str2);
    }

    public static BigDecimal K(String str) {
        U(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static jr3 L(String str) throws GeneralSecurityException {
        String str2;
        try {
            try {
                byte[] bArrB = new dr3(new ByteArrayInputStream(str.getBytes(dr3.b))).a().b();
                try {
                    h54 h54Var = h54.a;
                    int i2 = u44.a;
                    vz3 vz3VarE = vz3.E(bArrB, h54.b);
                    for (uz3 uz3Var : vz3VarE.B()) {
                        if (uz3Var.B().C() == 1 || uz3Var.B().C() == 2 || uz3Var.B().C() == 3) {
                            switch (uz3Var.B().C()) {
                                case 1:
                                    str2 = "UNKNOWN_KEYMATERIAL";
                                    break;
                                case 2:
                                    str2 = "SYMMETRIC";
                                    break;
                                case 3:
                                    str2 = "ASYMMETRIC_PRIVATE";
                                    break;
                                case 4:
                                    str2 = "ASYMMETRIC_PUBLIC";
                                    break;
                                case 5:
                                    str2 = "REMOTE";
                                    break;
                                case 6:
                                    str2 = "UNRECOGNIZED";
                                    break;
                                default:
                                    throw null;
                            }
                            throw new GeneralSecurityException("keyset contains key material of type " + str2 + " for type url " + uz3Var.B().A());
                        }
                    }
                    return jr3.a(vz3VarE);
                } catch (a64 unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (a64 unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }

    public static boolean M(int i2) {
        iz1 iz1Var = mz1.P3;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
            return ((Boolean) tw1Var.c.a(mz1.Q3)).booleanValue() || i2 <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141 A[Catch: JSONException -> 0x0131, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0131, blocks: (B:31:0x0113, B:40:0x012d, B:48:0x0141, B:47:0x013d), top: B:65:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject N(android.content.Context r17, android.view.View r18) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk2.N(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static void O(Parcel parcel, int i2) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(iDataPosition - i2);
        parcel.setDataPosition(iDataPosition);
    }

    public static boolean P(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                file.setReadOnly();
            }
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            g82.c(fileOutputStream);
            return true;
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            g82.c(fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            g82.c(fileOutputStream2);
            throw th;
        }
    }

    public static boolean Q(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static File R(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        W(file2, false);
        return file2;
    }

    public static JSONObject S(View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                if (((Boolean) tw1.e.c.a(mz1.B8)).booleanValue()) {
                    lf4 lf4Var = hg4.C.c;
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", parent != null);
                    return jSONObject;
                }
                lf4 lf4Var2 = hg4.C.c;
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                if ((parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) == -1) {
                    z = false;
                }
                jSONObject.put("contained_in_scroll_view", z);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static void T(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    public static void U(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String strSubstring = str.substring(0, 30);
        throw new NumberFormatException(ex0.l(new StringBuilder(String.valueOf(strSubstring).length() + 28), "Number string too large: ", strSubstring, "..."));
    }

    public static JSONObject V(Context context, View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                lf4 lf4Var = hg4.C.c;
                jSONObject.put("can_show_on_lock_screen", lf4.K(view));
                boolean z = false;
                if (context != null) {
                    Object systemService = context.getSystemService("keyguard");
                    KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
                    if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                        z = true;
                    }
                }
                jSONObject.put("is_keyguard_locked", z);
                return jSONObject;
            } catch (JSONException unused) {
                gi2.i0("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static void W(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static Pair X(RandomAccessFile randomAccessFile, int i2) throws IOException {
        int i3;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i2, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - byteBufferAllocate.capacity();
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        d0(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i3 = -1;
        } else {
            int i4 = iCapacity - 22;
            int iMin = Math.min(i4, 65535);
            for (int i5 = 0; i5 < iMin; i5++) {
                i3 = i4 - i5;
                if (byteBufferAllocate.getInt(i3) == 101010256 && ((char) byteBufferAllocate.getShort(i3 + 20)) == i5) {
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

    public static TextView Y(Context context, String str, int i2, int i3, float f2, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        c0(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f2, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i2);
        textView.setTextColor(i3);
        textView.setText(str);
        return textView;
    }

    public static JSONObject Z(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) throws JSONException {
        int[] iArr;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int i2 = 2;
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArr3 = new int[i2];
                    view2.getLocationOnScreen(iArr3);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        int measuredWidth = view2.getMeasuredWidth();
                        iArr = iArr2;
                        try {
                            sv1 sv1Var = sv1.f;
                            jSONObject4.put("width", sv1Var.a.h(context, measuredWidth));
                            jSONObject4.put("height", sv1Var.a.h(context, view2.getMeasuredHeight()));
                            jSONObject4.put("x", sv1Var.a.h(context, iArr3[0] - iArr[0]));
                            jSONObject4.put("y", sv1Var.a.h(context, iArr3[1] - iArr[1]));
                            jSONObject4.put("relative_to", "ad_view");
                            jSONObject3.put("frame", jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = h0(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", sv1Var.a.h(context, iArr3[0] - iArr[0]));
                                jSONObject.put("y", sv1Var.a.h(context, iArr3[1] - iArr[1]));
                                jSONObject.put("relative_to", "ad_view");
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                iz1 iz1Var = mz1.C8;
                                tw1 tw1Var = tw1.e;
                                if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) tw1Var.c.a(mz1.D8)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject3.put("view_width_layout_type", i0(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", i0(layoutParams.height) - 1);
                                }
                                if (((Boolean) tw1Var.c.a(mz1.E8)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                jSONObject3.put("font_size", textView.getTextSize());
                                jSONObject3.put("text", textView.getText());
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            if (((Boolean) tw1.e.c.a(mz1.F8)).booleanValue()) {
                                jSONObject3.put("alpha", view2.getAlpha());
                            }
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused) {
                            gi2.i0("Unable to get asset views information");
                            it = it2;
                            iArr2 = iArr;
                            i2 = 2;
                        }
                    } catch (JSONException unused2) {
                        iArr = iArr2;
                    }
                    it = it2;
                    iArr2 = iArr;
                    i2 = 2;
                }
            }
        }
        return jSONObject2;
    }

    public static boolean a0(File file) {
        boolean z;
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            z = true;
            for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
                File file2 = fileArrListFiles[i2];
                z = file2 != null && a0(file2) && z;
            }
        } else {
            z = true;
        }
        return file.delete() && z;
    }

    public static final Bundle b(gk0... gk0VarArr) {
        Bundle bundle = new Bundle(gk0VarArr.length);
        for (gk0 gk0Var : gk0VarArr) {
            String str = (String) gk0Var.f;
            Object obj = gk0Var.g;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                i30.j(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                hc.a(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                hc.b(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static JSONObject b0(String str, Context context, Point point, Point point2) throws JSONException {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    int i2 = point2.x;
                    sv1 sv1Var = sv1.f;
                    jSONObject3.put("x", sv1Var.a.h(context, i2));
                    jSONObject3.put("y", sv1Var.a.h(context, point2.y));
                    jSONObject3.put("start_x", sv1Var.a.h(context, point.x));
                    jSONObject3.put("start_y", sv1Var.a.h(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e) {
                    gi2.c0("Error occurred while putting signals into JSON object.", e);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e2) {
                e = e2;
                jSONObject = jSONObject2;
                gi2.c0("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static String c(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : bArr) {
            char[] cArr2 = g;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            i2 += 2;
        }
        return new String(cArr);
    }

    public static void c0(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i2;
        layoutParams2.width = i3;
        view.setLayoutParams(layoutParams2);
    }

    public static void d0(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static boolean e0(Context context, a83 a83Var) {
        jl3 jl3Var;
        if (!a83Var.N) {
            return false;
        }
        iz1 iz1Var = mz1.G8;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        if (((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
            return ((Boolean) kz1Var2.a(mz1.J8)).booleanValue();
        }
        String str = (String) kz1Var2.a(mz1.H8);
        if (str.isEmpty() || context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        sq0 sq0VarP = sq0.p(new yk3(';'));
        Iterator itD = ((kl3) sq0VarP.g).d(sq0VarP, str);
        do {
            jl3Var = (jl3) itD;
            if (!jl3Var.hasNext()) {
                return false;
            }
        } while (!((String) jl3Var.next()).equals(packageName));
        return true;
    }

    public static JSONObject f0(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        lf4 lf4Var = hg4.C.c;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        try {
            int i2 = displayMetrics.widthPixels;
            sv1 sv1Var = sv1.f;
            jSONObject.put("width", sv1Var.a.h(context, i2));
            jSONObject.put("height", sv1Var.a.h(context, displayMetrics.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static WindowManager.LayoutParams g0() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) tw1.e.c.a(mz1.I8)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static void h(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gn0.N, i2, i3);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                j(context, i, "Theme.MaterialComponents");
            }
        }
        j(context, h, "Theme.AppCompat");
    }

    public static JSONObject h0(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i2 = rect.right - rect.left;
        sv1 sv1Var = sv1.f;
        jSONObject.put("width", sv1Var.a.h(context, i2));
        int i3 = rect.bottom - rect.top;
        j63 j63Var = sv1Var.a;
        jSONObject.put("height", j63Var.h(context, i3));
        jSONObject.put("x", j63Var.h(context, rect.left));
        jSONObject.put("y", j63Var.h(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static void i(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gn0.N, i2, i3);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i4 : iArr2) {
                if (typedArrayObtainStyledAttributes2.getResourceId(i4, -1) == -1) {
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
            z = true;
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static int i0(int i2) {
        if (i2 != -2) {
            return i2 != -1 ? 2 : 3;
        }
        return 4;
    }

    public static void j(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(ex0.h("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void q(hk hkVar, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            x3 x3Var = (x3) hkVar.h(fr.h);
            if (x3Var != null) {
                x3Var.k(th);
            } else {
                gi2.o(hkVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                gi2.a(runtimeException, th);
                th = runtimeException;
            }
            gi2.o(hkVar, th);
        }
    }

    public static oj r(oj ojVar) {
        i30.m(ojVar, "<this>");
        qj qjVar = ojVar instanceof qj ? (qj) ojVar : null;
        if (qjVar == null || (ojVar = qjVar.h) != null) {
            return ojVar;
        }
        rj rjVar = (rj) qjVar.getContext().h(pz.h);
        oj cpVar = rjVar != null ? new cp((lk) rjVar, qjVar) : qjVar;
        qjVar.h = cpVar;
        return cpVar;
    }

    public static TypedArray s(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        h(context, attributeSet, i2, i3);
        i(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static pe0 v(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = byteBufferDuplicate.getInt() & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = byteBufferDuplicate.getInt() & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j4 = byteBufferDuplicate.getInt() & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    pe0 pe0Var = new pe0();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    pe0Var.i = byteBufferDuplicate;
                    pe0Var.f = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    pe0Var.g = i7;
                    pe0Var.h = ((ByteBuffer) pe0Var.i).getShort(i7);
                    return pe0Var;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static byte[] x(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 2;
            bArr[i2 / 2] = (byte) Integer.parseInt(str.substring(i2, i3), 16);
            i2 = i3;
        }
        return bArr;
    }

    public static Object y(hy hyVar, n nVar, n nVar2) {
        Object k30Var;
        i30.m(hyVar, "<this>");
        hk hkVar = nVar2.h;
        if (hkVar == ls.f) {
            k30Var = new j30(nVar2);
            if (nVar2.h != ls.f) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
            }
        } else {
            k30Var = new k30(nVar2, hkVar);
        }
        qb1.b(2, hyVar);
        return hyVar.f(nVar, k30Var);
    }

    public static void z(Parcel parcel, int i2, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int I = I(parcel, i2);
        parcel.writeBundle(bundle);
        O(parcel, I);
    }

    public abstract boolean e(k0 k0Var, g0 g0Var, g0 g0Var2);

    public abstract boolean f(k0 k0Var, Object obj, Object obj2);

    public abstract boolean g(k0 k0Var, j0 j0Var, j0 j0Var2);

    public abstract Typeface k(Context context, tv tvVar, Resources resources, int i2);

    public abstract Typeface l(Context context, wv[] wvVarArr, int i2);

    public Typeface m(Context context, Resources resources, int i2, String str, int i3) {
        File fileJ = wl2.j(context);
        if (fileJ == null) {
            return null;
        }
        try {
            if (wl2.d(fileJ, resources, i2)) {
                return Typeface.createFromFile(fileJ.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileJ.delete();
        }
    }

    public void n(mj0 mj0Var) {
        List listSingletonList = Collections.singletonList(mj0Var);
        ha1 ha1Var = (ha1) this;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        w91 w91Var = new w91(ha1Var, listSingletonList);
        if (!w91Var.n) {
            ha1Var.s.j(new ws(w91Var));
        } else {
            h80 h80VarD = h80.d();
            TextUtils.join(", ", w91Var.l);
            h80VarD.g(new Throwable[0]);
        }
    }

    public wv o(wv[] wvVarArr, int i2) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        wv wvVar = null;
        int i4 = Integer.MAX_VALUE;
        for (wv wvVar2 : wvVarArr) {
            int iAbs = (Math.abs(wvVar2.c - i3) * 2) + (wvVar2.d == z ? 0 : 1);
            if (wvVar == null || i4 > iAbs) {
                wvVar = wvVar2;
                i4 = iAbs;
            }
        }
        return wvVar;
    }

    public abstract float p(Object obj);

    public abstract void t(j0 j0Var, j0 j0Var2);

    public abstract void u(j0 j0Var, Thread thread);

    public abstract void w(Object obj, float f2);
}
