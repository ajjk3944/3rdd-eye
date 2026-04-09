package I5;

import A.f;
import A2.C;
import V0.m;
import V0.n;
import W0.e;
import W0.k;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Pair;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.Window;
import androidx.navigation.fragment.NavHostFragment;
import c5.C0407d;
import c5.C0411h;
import c5.C0413j;
import c5.InterfaceC0405b;
import com.apm.insight.R;
import com.bumptech.glide.c;
import com.google.android.gms.internal.ads.AbstractC0640Nf;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.C0852Zn;
import com.google.android.gms.internal.ads.C0960bu;
import com.google.android.gms.internal.ads.H9;
import d5.AbstractC2277e;
import d5.AbstractC2281i;
import f1.d;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.List;
import k0.AbstractComponentCallbacksC2617v;
import k0.DialogInterfaceOnCancelListenerC2610n;
import q0.z;
import q2.C2841s;
import q2.O;
import q2.a1;
import q5.i;
import q5.j;
import y5.l;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Field f1997a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f1998b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f1999c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f2000d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f2001e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2002f;

    /* renamed from: g, reason: collision with root package name */
    public static Field f2003g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f2004h;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A(java.lang.String r1) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9
            java.lang.String r1 = "unspecified"
            return r1
        L9:
            int r0 = r1.hashCode()
            switch(r0) {
                case 1743582862: goto L62;
                case 1743582863: goto L58;
                case 1743582864: goto L4e;
                case 1743582865: goto L44;
                case 1743582866: goto L3a;
                case 1743582867: goto L30;
                case 1743582868: goto L26;
                case 1743582869: goto L1c;
                case 1743582870: goto L11;
                default: goto L10;
            }
        L10:
            goto L6c
        L11:
            java.lang.String r0 = "requester_type_8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 8
            goto L6d
        L1c:
            java.lang.String r0 = "requester_type_7"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 7
            goto L6d
        L26:
            java.lang.String r0 = "requester_type_6"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 6
            goto L6d
        L30:
            java.lang.String r0 = "requester_type_5"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 5
            goto L6d
        L3a:
            java.lang.String r0 = "requester_type_4"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 4
            goto L6d
        L44:
            java.lang.String r0 = "requester_type_3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 3
            goto L6d
        L4e:
            java.lang.String r0 = "requester_type_2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 2
            goto L6d
        L58:
            java.lang.String r0 = "requester_type_1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 1
            goto L6d
        L62:
            java.lang.String r0 = "requester_type_0"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 0
            goto L6d
        L6c:
            r0 = -1
        L6d:
            switch(r0) {
                case 0: goto L89;
                case 1: goto L86;
                case 2: goto L83;
                case 3: goto L80;
                case 4: goto L7d;
                case 5: goto L7a;
                case 6: goto L77;
                case 7: goto L74;
                case 8: goto L71;
                default: goto L70;
            }
        L70:
            return r1
        L71:
            java.lang.String r1 = "8"
            return r1
        L74:
            java.lang.String r1 = "7"
            return r1
        L77:
            java.lang.String r1 = "6"
            return r1
        L7a:
            java.lang.String r1 = "5"
            return r1
        L7d:
            java.lang.String r1 = "4"
            return r1
        L80:
            java.lang.String r1 = "3"
            return r1
        L83:
            java.lang.String r1 = "2"
            return r1
        L86:
            java.lang.String r1 = "1"
            return r1
        L89:
            java.lang.String r1 = "0"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: I5.b.A(java.lang.String):java.lang.String");
    }

    public static String B(a1 a1Var) {
        Bundle bundle;
        return (a1Var == null || (bundle = a1Var.f23167c) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int C(android.os.Bundle r9) {
        /*
            java.lang.String r0 = "com.google.ads.mediation.admob.AdMobAdapter"
            android.os.Bundle r0 = r9.getBundle(r0)
            if (r0 == 0) goto L9
            r9 = r0
        L9:
            java.lang.String r0 = "query_info_type"
            java.lang.String r9 = r9.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 2
            if (r0 == 0) goto L18
            goto L87
        L18:
            int r0 = r9.hashCode()
            r2 = 1
            r3 = 3
            r4 = 4
            r5 = 5
            r6 = 6
            r7 = 7
            r8 = 8
            switch(r0) {
                case 1743582862: goto L79;
                case 1743582863: goto L6f;
                case 1743582864: goto L65;
                case 1743582865: goto L5b;
                case 1743582866: goto L51;
                case 1743582867: goto L47;
                case 1743582868: goto L3d;
                case 1743582869: goto L33;
                case 1743582870: goto L29;
                default: goto L27;
            }
        L27:
            goto L83
        L29:
            java.lang.String r0 = "requester_type_8"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L83
            r9 = r8
            goto L84
        L33:
            java.lang.String r0 = "requester_type_7"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L83
            r9 = r7
            goto L84
        L3d:
            java.lang.String r0 = "requester_type_6"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L83
            r9 = r6
            goto L84
        L47:
            java.lang.String r0 = "requester_type_5"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L83
            r9 = r5
            goto L84
        L51:
            java.lang.String r0 = "requester_type_4"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L83
            r9 = r4
            goto L84
        L5b:
            java.lang.String r0 = "requester_type_3"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L83
            r9 = r3
            goto L84
        L65:
            java.lang.String r0 = "requester_type_2"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L83
            r9 = r1
            goto L84
        L6f:
            java.lang.String r0 = "requester_type_1"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L83
            r9 = r2
            goto L84
        L79:
            java.lang.String r0 = "requester_type_0"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L83
            r9 = 0
            goto L84
        L83:
            r9 = -1
        L84:
            switch(r9) {
                case 0: goto L94;
                case 1: goto L93;
                case 2: goto L92;
                case 3: goto L91;
                case 4: goto L90;
                case 5: goto L8f;
                case 6: goto L8e;
                case 7: goto L8b;
                case 8: goto L88;
                default: goto L87;
            }
        L87:
            return r1
        L88:
            r9 = 10
            return r9
        L8b:
            r9 = 9
            return r9
        L8e:
            return r8
        L8f:
            return r7
        L90:
            return r6
        L91:
            return r5
        L92:
            return r4
        L93:
            return r3
        L94:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: I5.b.C(android.os.Bundle):int");
    }

    public static void D(C0852Zn c0852Zn, String str, Pair... pairArr) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.I7)).booleanValue()) {
            AbstractC0640Nf.f10005a.execute(new C(c0852Zn, str, pairArr, 2));
        }
    }

    public static int E(C0960bu c0960bu) {
        if (c0960bu.f13496s) {
            return 2;
        }
        a1 a1Var = c0960bu.f13482d;
        O o5 = a1Var.f23156G;
        String str = a1Var.f23161L;
        if (o5 == null && str == null) {
            return 1;
        }
        if (o5 == null || str == null) {
            return o5 != null ? 3 : 4;
        }
        return 5;
    }

    public static final String b(Object[] objArr, int i, int i3, AbstractC2277e abstractC2277e) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i6 = 0; i6 < i3; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i6];
            if (obj == abstractC2277e) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        i.d(string, "toString(...)");
        return string;
    }

    public static final Bundle c(C0407d... c0407dArr) {
        Bundle bundle = new Bundle(c0407dArr.length);
        for (C0407d c0407d : c0407dArr) {
            String str = (String) c0407d.f5921a;
            Object obj = c0407d.f5922b;
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
                i.b(componentType);
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
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static Object e(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static void g(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean h(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStreamOpenRawResource = null;
        }
        try {
            boolean zI = i(file, inputStreamOpenRawResource);
            g(inputStreamOpenRawResource);
            return zI;
        } catch (Throwable th2) {
            th = th2;
            g(inputStreamOpenRawResource);
            throw th;
        }
    }

    public static boolean i(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            g(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                } catch (IOException e6) {
                    e = e6;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    g(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    g(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e7) {
            e = e7;
        }
    }

    public static final z l(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        Dialog dialog;
        Window window;
        for (AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v2 = abstractComponentCallbacksC2617v; abstractComponentCallbacksC2617v2 != null; abstractComponentCallbacksC2617v2 = abstractComponentCallbacksC2617v2.f21687J) {
            if (abstractComponentCallbacksC2617v2 instanceof NavHostFragment) {
                return ((NavHostFragment) abstractComponentCallbacksC2617v2).X();
            }
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v3 = abstractComponentCallbacksC2617v2.p().f21525x;
            if (abstractComponentCallbacksC2617v3 instanceof NavHostFragment) {
                return ((NavHostFragment) abstractComponentCallbacksC2617v3).X();
            }
        }
        View view = abstractComponentCallbacksC2617v.f21696T;
        if (view != null) {
            return c.m(view);
        }
        View decorView = null;
        DialogInterfaceOnCancelListenerC2610n dialogInterfaceOnCancelListenerC2610n = abstractComponentCallbacksC2617v instanceof DialogInterfaceOnCancelListenerC2610n ? (DialogInterfaceOnCancelListenerC2610n) abstractComponentCallbacksC2617v : null;
        if (dialogInterfaceOnCancelListenerC2610n != null && (dialog = dialogInterfaceOnCancelListenerC2610n.v0) != null && (window = dialog.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        if (decorView != null) {
            return c.m(decorView);
        }
        throw new IllegalStateException(AbstractC1135f5.m("Fragment ", abstractComponentCallbacksC2617v, " does not have a NavController set"));
    }

    public static void m(Object obj) throws NoSuchFieldException, SecurityException {
        LongSparseArray longSparseArray;
        if (!f2000d) {
            try {
                f1999c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e6) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e6);
            }
            f2000d = true;
        }
        Class cls = f1999c;
        if (cls == null) {
            return;
        }
        if (!f2002f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f2001e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e7) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e7);
            }
            f2002f = true;
        }
        Field field = f2001e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e8) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e8);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static Integer n(CharSequence charSequence) {
        Integer numValueOf = Integer.valueOf(R.drawable.carrier_t);
        if (i.a(charSequence, "CMCC") || i.a(charSequence, "中国移动")) {
            return Integer.valueOf(R.drawable.ic_cmcc);
        }
        if (i.a(charSequence, "China Unicom") || i.a(charSequence, "中国联通")) {
            return Integer.valueOf(R.drawable.ic_cucc);
        }
        if (i.a(charSequence, "CTCC") || i.a(charSequence, "中国电信")) {
            return Integer.valueOf(R.drawable.ic_ctcc);
        }
        if (i.a(charSequence, "T-Mobile") || i.a(charSequence, "T-Mobile - US") || i.a(charSequence, "T-Mobile - UA") || i.a(charSequence, "Telekom") || i.a(charSequence, "Magenta Telekom") || i.a(charSequence, "Magyar Telekom") || i.a(charSequence, "Hrvatski Telekom") || i.a(charSequence, "Slovak Telekom") || i.a(charSequence, "Mkedonski Telecom AD Skopje")) {
            return numValueOf;
        }
        if (i.a(charSequence, "EE")) {
            return Integer.valueOf(R.drawable.carrier_ee);
        }
        if (i.a(charSequence, "Vodafone") || i.a(charSequence, "Vodacom")) {
            return Integer.valueOf(R.drawable.ic_vodafone);
        }
        if (i.a(charSequence, "Swisscom")) {
            return Integer.valueOf(R.drawable.carrier_swisscom);
        }
        if (i.a(charSequence, "SFR")) {
            return Integer.valueOf(R.drawable.carrier_sfr);
        }
        if (i.a(charSequence, "Optus")) {
            return Integer.valueOf(R.drawable.carrier_optus);
        }
        if (i.a(charSequence, "Singtel")) {
            return Integer.valueOf(R.drawable.carrier_singtel);
        }
        if (i.a(charSequence, "Orange")) {
            return Integer.valueOf(R.drawable.carrier_orange);
        }
        if (i.a(charSequence, "TIM")) {
            return Integer.valueOf(R.drawable.ic_carrier_tim);
        }
        if (i.a(charSequence, "Movistar")) {
            return Integer.valueOf(R.drawable.carrier_movistar);
        }
        if (i.a(charSequence, "Etisalat")) {
            return Integer.valueOf(R.drawable.carrier_etisalat);
        }
        if (i.a(charSequence, "AWCC")) {
            return Integer.valueOf(R.drawable.carrier_awcc);
        }
        if (i.a(charSequence, "Roshan")) {
            return Integer.valueOf(R.drawable.carrier_roshan);
        }
        if (i.a(charSequence, "Telefonica")) {
            return Integer.valueOf(R.drawable.carrier_telefonica);
        }
        if (i.a(charSequence, "Bharti Airtel")) {
            return Integer.valueOf(R.drawable.carrier_bharti_airtel);
        }
        if (i.a(charSequence, "Telenor")) {
            return Integer.valueOf(R.drawable.carrier_telenor);
        }
        if (i.a(charSequence, "TeliaSonera")) {
            return Integer.valueOf(R.drawable.carrier_telia_sonera);
        }
        if (i.a(charSequence, "Verizon Wireless")) {
            return Integer.valueOf(R.drawable.carrier_verizon);
        }
        if (i.a(charSequence, "MTS") || i.a(charSequence, "MTC")) {
            return Integer.valueOf(R.drawable.carrier_mts);
        }
        if (i.a(charSequence, "AT&T")) {
            return Integer.valueOf(R.drawable.carrier_ant);
        }
        return null;
    }

    public static Integer o(Integer num) {
        if ((num != null && num.intValue() == 1435) || (num != null && num.intValue() == 767)) {
            return Integer.valueOf(R.drawable.ic_cmcc);
        }
        if ((num != null && num.intValue() == 762) || (num != null && num.intValue() == 1436)) {
            return Integer.valueOf(R.drawable.ic_cucc);
        }
        if ((num != null && num.intValue() == 764) || (num != null && num.intValue() == 2237)) {
            return Integer.valueOf(R.drawable.ic_ctcc);
        }
        if ((num != null && num.intValue() == 1) || ((num != null && num.intValue() == 5) || ((num != null && num.intValue() == 6) || ((num != null && num.intValue() == 7) || ((num != null && num.intValue() == 12) || ((num != null && num.intValue() == 2367) || ((num != null && num.intValue() == 2386) || ((num != null && num.intValue() == 2394) || ((num != null && num.intValue() == 3) || ((num != null && num.intValue() == 4) || ((num != null && num.intValue() == 8) || ((num != null && num.intValue() == 9) || ((num != null && num.intValue() == 11) || ((num != null && num.intValue() == 13) || ((num != null && num.intValue() == 900) || ((num != null && num.intValue() == 1010) || ((num != null && num.intValue() == 1013) || ((num != null && num.intValue() == 1625) || ((num != null && num.intValue() == 1665) || ((num != null && num.intValue() == 1710) || ((num != null && num.intValue() == 1737) || ((num != null && num.intValue() == 2088) || ((num != null && num.intValue() == 2363) || ((num != null && num.intValue() == 2365) || ((num != null && num.intValue() == 2385) || ((num != null && num.intValue() == 2395) || ((num != null && num.intValue() == 2401) || (num != null && num.intValue() == 2551)))))))))))))))))))))))))))) {
            return Integer.valueOf(R.drawable.carrier_t);
        }
        if ((num != null && num.intValue() == 2) || ((num != null && num.intValue() == 718) || (num != null && num.intValue() == 2419))) {
            return Integer.valueOf(R.drawable.carrier_ee);
        }
        if ((num != null && num.intValue() == 15) || ((num != null && num.intValue() == 18) || ((num != null && num.intValue() == 19) || ((num != null && num.intValue() == 20) || ((num != null && num.intValue() == 21) || ((num != null && num.intValue() == 22) || ((num != null && num.intValue() == 23) || ((num != null && num.intValue() == 25) || ((num != null && num.intValue() == 26) || ((num != null && num.intValue() == 28) || ((num != null && num.intValue() == 29) || ((num != null && num.intValue() == 676) || ((num != null && num.intValue() == 1329) || ((num != null && num.intValue() == 1452) || ((num != null && num.intValue() == 1481) || ((num != null && num.intValue() == 1516) || ((num != null && num.intValue() == 1535) || ((num != null && num.intValue() == 1619) || ((num != null && num.intValue() == 1649) || ((num != null && num.intValue() == 1736) || ((num != null && num.intValue() == 1771) || ((num != null && num.intValue() == 2001) || ((num != null && num.intValue() == 2086) || ((num != null && num.intValue() == 2123) || ((num != null && num.intValue() == 2147) || ((num != null && num.intValue() == 2364) || ((num != null && num.intValue() == 2368) || ((num != null && num.intValue() == 2380) || ((num != null && num.intValue() == 2383) || ((num != null && num.intValue() == 2387) || ((num != null && num.intValue() == 2391) || ((num != null && num.intValue() == 2397) || ((num != null && num.intValue() == 2398) || ((num != null && num.intValue() == 2399) || ((num != null && num.intValue() == 2497) || ((num != null && num.intValue() == 2550) || ((num != null && num.intValue() == 2580) || ((num != null && num.intValue() == 24) || ((num != null && num.intValue() == 1405) || ((num != null && num.intValue() == 1602) || ((num != null && num.intValue() == 1635) || ((num != null && num.intValue() == 1744) || ((num != null && num.intValue() == 2362) || (num != null && num.intValue() == 2381)))))))))))))))))))))))))))))))))))))))))))) {
            return Integer.valueOf(R.drawable.ic_vodafone);
        }
        if ((num != null && num.intValue() == 16) || (num != null && num.intValue() == 2366)) {
            return Integer.valueOf(R.drawable.carrier_swisscom);
        }
        if (num != null && num.intValue() == 27) {
            return Integer.valueOf(R.drawable.carrier_sfr);
        }
        if (num != null && num.intValue() == 30) {
            return Integer.valueOf(R.drawable.carrier_optus);
        }
        if (num != null && num.intValue() == 31) {
            return Integer.valueOf(R.drawable.carrier_singtel);
        }
        if ((num != null && num.intValue() == 32) || ((num != null && num.intValue() == 567) || ((num != null && num.intValue() == 675) || ((num != null && num.intValue() == 678) || ((num != null && num.intValue() == 739) || ((num != null && num.intValue() == 742) || ((num != null && num.intValue() == 746) || ((num != null && num.intValue() == 849) || ((num != null && num.intValue() == 897) || ((num != null && num.intValue() == 904) || ((num != null && num.intValue() == 1011) || ((num != null && num.intValue() == 1366) || ((num != null && num.intValue() == 1368) || ((num != null && num.intValue() == 1407) || ((num != null && num.intValue() == 1410) || ((num != null && num.intValue() == 1421) || ((num != null && num.intValue() == 1434) || ((num != null && num.intValue() == 1606) || ((num != null && num.intValue() == 1621) || ((num != null && num.intValue() == 1659) || ((num != null && num.intValue() == 1676) || ((num != null && num.intValue() == 1713) || ((num != null && num.intValue() == 1715) || ((num != null && num.intValue() == 1716) || ((num != null && num.intValue() == 1721) || ((num != null && num.intValue() == 1936) || ((num != null && num.intValue() == 1940) || ((num != null && num.intValue() == 1943) || ((num != null && num.intValue() == 1948) || ((num != null && num.intValue() == 2034) || (num != null && num.intValue() == 2369))))))))))))))))))))))))))))))) {
            return Integer.valueOf(R.drawable.carrier_orange);
        }
        if ((num != null && num.intValue() == 33) || (num != null && num.intValue() == 1385)) {
            return Integer.valueOf(R.drawable.ic_carrier_tim);
        }
        if ((num != null && num.intValue() == 34) || ((num != null && num.intValue() == 625) || ((num != null && num.intValue() == 974) || ((num != null && num.intValue() == 1337) || ((num != null && num.intValue() == 1428) || ((num != null && num.intValue() == 1472) || ((num != null && num.intValue() == 1522) || ((num != null && num.intValue() == 1863) || ((num != null && num.intValue() == 1873) || ((num != null && num.intValue() == 1914) || ((num != null && num.intValue() == 1929) || ((num != null && num.intValue() == 2009) || (num != null && num.intValue() == 2010))))))))))))) {
            return Integer.valueOf(R.drawable.carrier_movistar);
        }
        if ((num != null && num.intValue() == 451) || ((num != null && num.intValue() == 1968) || (num != null && num.intValue() == 2221))) {
            return Integer.valueOf(R.drawable.carrier_etisalat);
        }
        if (num != null && num.intValue() == 452) {
            return Integer.valueOf(R.drawable.carrier_awcc);
        }
        if (num != null && num.intValue() == 453) {
            return Integer.valueOf(R.drawable.carrier_roshan);
        }
        if ((num != null && num.intValue() == 1343) || ((num != null && num.intValue() == 1453) || (num != null && num.intValue() == 2360))) {
            return Integer.valueOf(R.drawable.carrier_telefonica);
        }
        if ((num != null && num.intValue() == 866) || ((num != null && num.intValue() == 945) || ((num != null && num.intValue() == 1093) || ((num != null && num.intValue() == 1197) || ((num != null && num.intValue() == 1319) || ((num != null && num.intValue() == 1411) || ((num != null && num.intValue() == 1490) || ((num != null && num.intValue() == 1605) || ((num != null && num.intValue() == 1626) || ((num != null && num.intValue() == 1638) || ((num != null && num.intValue() == 1687) || ((num != null && num.intValue() == 1745) || ((num != null && num.intValue() == 1753) || ((num != null && num.intValue() == 1932) || ((num != null && num.intValue() == 1961) || ((num != null && num.intValue() == 2004) || ((num != null && num.intValue() == 2023) || (num != null && num.intValue() == 2414)))))))))))))))))) {
            return Integer.valueOf(R.drawable.carrier_bharti_airtel);
        }
        if (num != null && num.intValue() == 2108) {
            return Integer.valueOf(R.drawable.carrier_airtel_tigo);
        }
        if ((num != null && num.intValue() == 2007) || ((num != null && num.intValue() == 958) || ((num != null && num.intValue() == 1464) || ((num != null && num.intValue() == 1695) || ((num != null && num.intValue() == 1766) || ((num != null && num.intValue() == 1956) || (num != null && num.intValue() == 1975))))))) {
            return Integer.valueOf(R.drawable.carrier_telenor);
        }
        if ((num != null && num.intValue() == 656) || ((num != null && num.intValue() == 667) || ((num != null && num.intValue() == 892) || ((num != null && num.intValue() == 959) || ((num != null && num.intValue() == 1480) || (num != null && num.intValue() == 1690)))))) {
            return Integer.valueOf(R.drawable.carrier_telia_sonera);
        }
        if (num != null && num.intValue() == 1839) {
            return Integer.valueOf(R.drawable.carrier_verizon);
        }
        if ((num != null && num.intValue() == 569) || (num != null && num.intValue() == 578)) {
            return Integer.valueOf(R.drawable.carrier_mts);
        }
        if ((num != null && num.intValue() == 1187) || ((num != null && num.intValue() == 1326) || ((num != null && num.intValue() == 1770) || ((num != null && num.intValue() == 1807) || ((num != null && num.intValue() == 1912) || ((num != null && num.intValue() == 1915) || ((num != null && num.intValue() == 2628) || ((num != null && num.intValue() == 10021) || (num != null && num.intValue() == 10028))))))))) {
            return Integer.valueOf(R.drawable.carrier_ant);
        }
        if (num != null && num.intValue() == 2006) {
            return Integer.valueOf(R.drawable.carrier_madar);
        }
        if ((num != null && num.intValue() == 529) || ((num != null && num.intValue() == 773) || ((num != null && num.intValue() == 1338) || ((num != null && num.intValue() == 1429) || ((num != null && num.intValue() == 1442) || ((num != null && num.intValue() == 1467) || ((num != null && num.intValue() == 1473) || ((num != null && num.intValue() == 1520) || ((num != null && num.intValue() == 1641) || ((num != null && num.intValue() == 1647) || ((num != null && num.intValue() == 1673) || ((num != null && num.intValue() == 1864) || ((num != null && num.intValue() == 1925) || ((num != null && num.intValue() == 1953) || ((num != null && num.intValue() == 1954) || ((num != null && num.intValue() == 1955) || (num != null && num.intValue() == 2263))))))))))))))))) {
            return Integer.valueOf(R.drawable.carrier_claro);
        }
        if ((num != null && num.intValue() == 1909) || (num != null && num.intValue() == 2111)) {
            return Integer.valueOf(R.drawable.carrier_euskaltel);
        }
        if ((num != null && num.intValue() == 868) || ((num != null && num.intValue() == 1076) || ((num != null && num.intValue() == 1514) || ((num != null && num.intValue() == 1688) || ((num != null && num.intValue() == 2345) || (num != null && num.intValue() == 1931)))))) {
            return Integer.valueOf(R.drawable.carrier_mobitel);
        }
        if ((num != null && num.intValue() == 581) || ((num != null && num.intValue() == 1137) || ((num != null && num.intValue() == 1235) || (num != null && num.intValue() == 1486)))) {
            return Integer.valueOf(R.drawable.carrier_globalstar);
        }
        return null;
    }

    public static final int p(Cursor cursor, String str) {
        String strV;
        i.e(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    i.d(columnNames, "columnNames");
                    String strConcat = ".".concat(str);
                    String str2 = "." + str + '`';
                    int length = columnNames.length;
                    int i = 0;
                    int i3 = 0;
                    while (i3 < length) {
                        String str3 = columnNames[i3];
                        int i6 = i + 1;
                        if (str3.length() >= str.length() + 2 && (l.W(str3, strConcat) || (str3.charAt(0) == '`' && l.W(str3, str2)))) {
                            columnIndex = i;
                            break;
                        }
                        i3++;
                        i = i6;
                    }
                    columnIndex = -1;
                } else {
                    columnIndex = -1;
                }
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            i.d(columnNames2, "c.columnNames");
            strV = AbstractC2281i.V(columnNames2, null, 63);
        } catch (Exception e6) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e6);
            strV = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + strV);
    }

    public static File q(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static int r(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(AbstractC1135f5.l(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC0405b s(p5.a aVar) {
        C0413j c0413j = new C0413j();
        c0413j.f5930a = (j) aVar;
        c0413j.f5931b = C0411h.f5928a;
        return c0413j;
    }

    public static MappedByteBuffer t(Context context, Uri uri) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final void w(Object[] objArr, int i, int i3) {
        i.e(objArr, "<this>");
        while (i < i3) {
            objArr[i] = null;
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void x(android.content.Context r3, java.io.File r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "file"
            q5.i.e(r4, r0)
            if (r3 != 0) goto L9
            goto Laa
        L9:
            boolean r0 = r4.exists()
            if (r0 != 0) goto L1a
            r4 = 2131886412(0x7f12014c, float:1.9407402E38)
            java.lang.String r4 = r3.getString(r4)
            F4.d.b(r3, r4)
            return
        L1a:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "android.intent.action.SEND"
            r0.setAction(r1)
            if (r6 != 0) goto L4f
            java.lang.String r6 = r4.getPath()
            java.lang.String r6 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r6)
            if (r6 != 0) goto L31
            goto L4d
        L31:
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "getDefault(...)"
            q5.i.d(r1, r2)
            java.lang.String r6 = r6.toLowerCase(r1)
            java.lang.String r1 = "toLowerCase(...)"
            q5.i.d(r6, r1)
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r6 = r1.getMimeTypeFromExtension(r6)
            if (r6 != 0) goto L4f
        L4d:
            java.lang.String r6 = "application/octet-stream"
        L4f:
            r0.setType(r6)
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L72
            r1 = 24
            if (r6 < r1) goto L74
            java.lang.String r6 = r3.getPackageName()     // Catch: java.lang.Exception -> L72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72
            r1.<init>()     // Catch: java.lang.Exception -> L72
            r1.append(r6)     // Catch: java.lang.Exception -> L72
            java.lang.String r6 = ".fileProvider"
            r1.append(r6)     // Catch: java.lang.Exception -> L72
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Exception -> L72
            android.net.Uri r6 = androidx.core.content.FileProvider.d(r3, r6, r4)     // Catch: java.lang.Exception -> L72
            goto L7d
        L72:
            r6 = move-exception
            goto L79
        L74:
            android.net.Uri r6 = android.net.Uri.fromFile(r4)     // Catch: java.lang.Exception -> L72
            goto L7d
        L79:
            r6.printStackTrace()
            r6 = 0
        L7d:
            java.lang.String r1 = "android.intent.extra.STREAM"
            r0.putExtra(r1, r6)
            r6 = 1
            r0.addFlags(r6)
            if (r5 != 0) goto L8c
            java.lang.String r5 = r4.getName()
        L8c:
            android.content.Intent r4 = android.content.Intent.createChooser(r0, r5)
            android.content.pm.PackageManager r5 = r3.getPackageManager()
            android.content.ComponentName r5 = r4.resolveActivity(r5)
            if (r5 == 0) goto L9e
            r3.startActivity(r4)
            return
        L9e:
            if (r7 != 0) goto Laa
            r4 = 2131886667(0x7f12024b, float:1.940792E38)
            java.lang.String r4 = r3.getString(r4)
            F4.d.b(r3, r4)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I5.b.x(android.content.Context, java.io.File, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static v5.c y(int i, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new v5.c(i, i3 - 1, 1);
        }
        v5.c cVar = v5.c.f23901d;
        return v5.c.f23901d;
    }

    public void k(n nVar) {
        List listSingletonList = Collections.singletonList(nVar);
        k kVar = (k) this;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        e eVar = new e(kVar, listSingletonList);
        if (eVar.f3972g) {
            m.f().i(e.f3967h, f.m("Already enqueued work ids (", TextUtils.join(", ", eVar.f3970e), ")"), new Throwable[0]);
        } else {
            kVar.f3993l.o(new d(eVar));
        }
    }

    public abstract View u(int i);

    public abstract boolean v();
}
