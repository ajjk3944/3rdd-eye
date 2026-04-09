package T2;

import E5.s;
import a4.p;
import a4.t;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.lefan.signal.db.MacVendorBean;
import d5.AbstractC2281i;
import d5.AbstractC2282j;
import e5.C2307c;
import i5.EnumC2380a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import o4.AbstractC2763b;
import q0.C2789b;
import q0.v;
import q2.C2834o;
import q5.r;
import w2.AbstractC2972d;
import z5.AbstractC3046w;
import z5.C3038n;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f3584a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f3585b = null;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f3586c = true;

    public static boolean D(Parcel parcel, int i) {
        R(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static final List E(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        C2307c c2307c = new C2307c(10);
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i3 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            q5.i.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            q5.i.d(string2, "cursor.getString(toColumnIndex)");
            c2307c.add(new E0.c(i, i3, string, string2));
        }
        C2307c c2307cA = p.a(c2307c);
        q5.i.e(c2307cA, "<this>");
        if (c2307cA.a() <= 1) {
            return AbstractC2282j.j0(c2307cA);
        }
        Object[] array = c2307cA.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return AbstractC2281i.Q(array);
    }

    public static IBinder F(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iJ);
        return strongBinder;
    }

    public static final E0.d G(H0.c cVar, String str, boolean z6) throws IOException {
        Cursor cursorP = cVar.p("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorP.getColumnIndex("seqno");
            int columnIndex2 = cursorP.getColumnIndex("cid");
            int columnIndex3 = cursorP.getColumnIndex("name");
            int columnIndex4 = cursorP.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorP.moveToNext()) {
                    if (cursorP.getInt(columnIndex2) >= 0) {
                        int i = cursorP.getInt(columnIndex);
                        String string = cursorP.getString(columnIndex3);
                        String str2 = cursorP.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i);
                        q5.i.d(string, "columnName");
                        treeMap.put(numValueOf, string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                q5.i.d(collectionValues, "columnsMap.values");
                List listJ0 = AbstractC2282j.j0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                q5.i.d(collectionValues2, "ordersMap.values");
                E0.d dVar = new E0.d(str, z6, listJ0, AbstractC2282j.j0(collectionValues2));
                cursorP.close();
                return dVar;
            }
            cursorP.close();
            return null;
        } finally {
        }
    }

    public static int H(Parcel parcel, int i) {
        R(parcel, i, 4);
        return parcel.readInt();
    }

    public static long I(Parcel parcel, int i) {
        R(parcel, i, 8);
        return parcel.readLong();
    }

    public static int J(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void K(PAGRequest pAGRequest, String str, AbstractC2972d abstractC2972d) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = abstractC2972d.f23950d;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Map<String, Object> extraInfo = pAGRequest.getExtraInfo();
        if (extraInfo == null) {
            extraInfo = new HashMap<>();
        }
        extraInfo.put("admob_watermark", str2);
        pAGRequest.setExtraInfo(extraInfo);
    }

    public static void L(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + J(parcel, i));
    }

    public static final Object M(s sVar, s sVar2, p5.p pVar) throws Throwable {
        Object c3038n;
        Object objE;
        try {
            r.c(2, pVar);
            c3038n = pVar.h(sVar2, sVar);
        } catch (Throwable th) {
            c3038n = new C3038n(th, false);
        }
        EnumC2380a enumC2380a = EnumC2380a.f20635a;
        if (c3038n == enumC2380a || (objE = sVar.E(c3038n)) == AbstractC3046w.f24562e) {
            return enumC2380a;
        }
        if (objE instanceof C3038n) {
            throw ((C3038n) objE).f24546a;
        }
        return AbstractC3046w.p(objE);
    }

    public static int O(Parcel parcel) {
        int i = parcel.readInt();
        int iJ = J(parcel, i);
        char c6 = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c6 != 20293) {
            throw new J0.c("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i3 = iJ + iDataPosition;
        if (i3 >= iDataPosition && i3 <= parcel.dataSize()) {
            return i3;
        }
        throw new J0.c(A.f.o(new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i3).length()), "Size read is invalid start=", iDataPosition, " end=", i3), parcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
  0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.lang.ClassLoader P() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.g.P():java.lang.ClassLoader");
    }

    public static String Q(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String strReplaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
        return (strReplaceFirst.equals("base-master") || strReplaceFirst.equals("base-main")) ? "" : strReplaceFirst.startsWith("base-") ? strReplaceFirst.replace("base-", "config.") : strReplaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
    }

    public static void R(Parcel parcel, int i, int i3) {
        int iJ = J(parcel, i);
        if (iJ == i3) {
            return;
        }
        String hexString = Integer.toHexString(iJ);
        int length = String.valueOf(i3).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iJ).length() + 4 + 1);
        AbstractC2763b.h(sb, "Expected size ", i3, " got ", iJ);
        throw new J0.c(AbstractC1135f5.n(sb, " (0x", hexString, ")"), parcel);
    }

    public static void c(int i, int i3, int i6) {
        if (i >= 0 && i3 <= i6) {
            if (i > i3) {
                throw new IllegalArgumentException(A.f.g(i, i3, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i3 + ", size: " + i6);
    }

    public static final long f(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j6 = 0;
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            j6 += i;
            i = inputStream.read(bArr);
        }
        return j6;
    }

    public static Bundle g(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iJ);
        return bundle;
    }

    public static byte[] h(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return bArrCreateByteArray;
    }

    public static Parcelable i(Parcel parcel, int i, Parcelable.Creator creator) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iJ);
        return parcelable;
    }

    public static String j(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iJ);
        return string;
    }

    public static String[] k(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return strArrCreateStringArray;
    }

    public static ArrayList l(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iJ);
        return arrayListCreateStringArrayList;
    }

    public static Object[] m(Parcel parcel, int i, Parcelable.Creator creator) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iJ);
        return objArrCreateTypedArray;
    }

    public static void n(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new J0.c(A.f.i(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    public static String o(Context context, int i) throws Resources.NotFoundException {
        String strValueOf;
        q5.i.e(context, "context");
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            strValueOf = context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            strValueOf = String.valueOf(i);
        }
        q5.i.d(strValueOf, "try {\n                co….toString()\n            }");
        return strValueOf;
    }

    public static Drawable p(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f3586c) {
                return t(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e6) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e6;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            f3586c = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = I.l.f1870a;
        return resources.getDrawable(i, theme);
    }

    public static String q(String str, L4.g gVar) {
        q5.i.e(gVar, "macVendorDao");
        if (str == null || str.length() != 17 || str.equals("02:00:00:00:00:00")) {
            return null;
        }
        Locale locale = Locale.ENGLISH;
        q5.i.d(locale, "ENGLISH");
        String upperCase = str.toUpperCase(locale);
        q5.i.d(upperCase, "toUpperCase(...)");
        String strSubstring = upperCase.substring(0, 13);
        q5.i.d(strSubstring, "substring(...)");
        MacVendorBean macVendorBeanA = gVar.a(strSubstring);
        if (macVendorBeanA == null) {
            String strSubstring2 = upperCase.substring(0, 10);
            q5.i.d(strSubstring2, "substring(...)");
            macVendorBeanA = gVar.a(strSubstring2);
            if (macVendorBeanA == null) {
                String strSubstring3 = upperCase.substring(0, 8);
                q5.i.d(strSubstring3, "substring(...)");
                macVendorBeanA = gVar.a(strSubstring3);
            }
        }
        if (macVendorBeanA != null) {
            return macVendorBeanA.getBrand();
        }
        return null;
    }

    public static Drawable t(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            m.c cVar = new m.c(context);
            cVar.f21869b = theme;
            cVar.a(theme.getResources().getConfiguration());
            context = cVar;
        }
        return t.i(context, i);
    }

    public static final boolean u(v vVar, int i) {
        q5.i.e(vVar, "<this>");
        int i3 = v.f23035j;
        Iterator it = x5.h.L(vVar, C2789b.f22951g).iterator();
        while (it.hasNext()) {
            if (((v) it.next()).f23043h == i) {
                return true;
            }
        }
        return false;
    }

    public abstract void A(int i);

    public abstract void B(View view, int i, int i3);

    public abstract void C(View view, float f2, float f5);

    public abstract boolean N(int i, View view);

    public K2.c a(Context context, Looper looper, C2834o c2834o, Object obj, K2.g gVar, K2.h hVar) {
        return b(context, looper, c2834o, obj, (L2.k) gVar, (L2.k) hVar);
    }

    public K2.c b(Context context, Looper looper, C2834o c2834o, Object obj, L2.k kVar, L2.k kVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract int d(int i, View view);

    public abstract int e(int i, View view);

    public int r(View view) {
        return 0;
    }

    public int s() {
        return 0;
    }

    public abstract void x(Throwable th);

    public abstract void y(c1.g gVar);

    public void w() {
    }

    public void v(int i, int i3) {
    }

    public void z(int i, View view) {
    }
}
