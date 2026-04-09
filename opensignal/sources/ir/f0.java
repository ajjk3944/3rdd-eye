package ir;

import android.animation.TimeInterpolator;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Path;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.y3;
import com.survicate.surveys.entities.models.QuestionValidationState;
import io.sentry.b5;
import io.sentry.f5;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import ku.p0;
import lr.m1;
import ls.e1;
import org.json.JSONException;
import org.json.JSONObject;
import p.l2;
import u3.h0;
import u3.i0;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f12934a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f12935b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f12936c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Field f12937d;

    public static final int A(mr.g gVar) {
        br.l.e(gVar, "<this>");
        return gVar.a().size();
    }

    public static String B(KeyEvent.Callback callback) {
        if (callback == null) {
            return null;
        }
        String canonicalName = callback.getClass().getCanonicalName();
        return canonicalName != null ? canonicalName : callback.getClass().getSimpleName();
    }

    public static void C(re.b bVar) {
        if (!bVar.isDone()) {
            throw new IllegalStateException(y3.D("Future was expected to be done: %s", bVar));
        }
        boolean z10 = false;
        while (true) {
            try {
                bVar.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public static final Class D(d dVar) {
        br.l.e(dVar, "<this>");
        Class clsA = ((br.e) dVar).a();
        br.l.c(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class E(d dVar) {
        br.l.e(dVar, "<this>");
        Class clsA = ((br.e) dVar).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return clsA;
    }

    public static final Class F(d dVar) {
        br.l.e(dVar, "<this>");
        Class clsA = ((br.e) dVar).a();
        if (clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final Type G(y yVar) {
        z zVar = yVar.f12943a;
        if (zVar == null) {
            return g0.f12938g;
        }
        br.m mVar = yVar.f12944b;
        br.l.b(mVar);
        int i10 = d0.f12933a[zVar.ordinal()];
        if (i10 == 1) {
            return new g0(null, i(mVar, true));
        }
        if (i10 == 2) {
            return i(mVar, true);
        }
        if (i10 == 3) {
            return new g0(i(mVar, true), null);
        }
        throw new bf.n();
    }

    public static final d H(Class cls) {
        br.l.e(cls, "<this>");
        return br.x.f2918a.b(cls);
    }

    public static float I(String[] strArr, int i10) throws NumberFormatException {
        float f10 = Float.parseFloat(strArr[i10]);
        if (f10 >= 0.0f && f10 <= 1.0f) {
            return f10;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int J(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.f0.J(java.lang.String):int");
    }

    public static int K(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return lastPathSegment.endsWith(".avi") ? 16 : -1;
    }

    public static jv.b L() throws ba.l {
        jv.b bVar = new jv.b();
        jv.a aVar = bVar.f13866a;
        tv.b bVar2 = aVar.f13863a;
        if (((uv.c) bVar2.f23030r) != null) {
            throw new IllegalStateException("Try to recreate Root scope definition");
        }
        sv.a aVar2 = uv.c.f23725d;
        uv.c cVar = new uv.c(aVar2, true);
        String str = aVar2.f22363a;
        ((HashMap) bVar2.f23027a).put(str, cVar);
        bVar2.f23030r = cVar;
        tv.b bVar3 = aVar.f13863a;
        if (((uv.b) bVar3.f23031x) != null) {
            throw new IllegalStateException("Try to recreate Root scope");
        }
        HashMap map = (HashMap) bVar3.f23028d;
        if (map.containsKey("-Root-")) {
            throw new ba.l("Scope with id '-Root-' is already created");
        }
        uv.c cVar2 = (uv.c) ((HashMap) bVar3.f23027a).get(str);
        if (cVar2 == null) {
            String str2 = "No Scope Definition found for qualifer '" + str + '\'';
            br.l.e(str2, "s");
            throw new ba.l(str2);
        }
        uv.b bVar4 = new uv.b(cVar2, (jv.a) bVar3.f23029g);
        uv.b bVar5 = (uv.b) bVar3.f23031x;
        List listH = bVar5 == null ? null : e5.H(bVar5);
        if (listH == null) {
            listH = mq.w.f16945a;
        }
        HashSet hashSet = cVar2.f23728c;
        qm.c cVar3 = bVar4.f23723d;
        uv.b bVar6 = (uv.b) cVar3.f20919g;
        jv.a aVar3 = (jv.a) cVar3.f20918d;
        br.l.e(hashSet, "definitions");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            mv.b bVar7 = (mv.b) it.next();
            l2 l2Var = aVar3.f13864b;
            if (l2Var.F(pv.a.DEBUG)) {
                if (bVar6.f23720a.f23727b) {
                    l2Var.z(br.l.k(bVar7, "- "));
                } else {
                    l2Var.z(bVar6 + " -> " + bVar7);
                }
            }
            cVar3.M(bVar7, false);
        }
        bVar4.f23722c.addAll(listH);
        map.put("-Root-", bVar4);
        bVar3.f23031x = bVar4;
        return bVar;
    }

    public static boolean M(int i10, Rect rect, Rect rect2) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        }
        if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        }
        if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            return (i15 < i16 || rect.right <= i16) && rect.right < rect2.right;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        return (i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom;
    }

    public static boolean N(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int O(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.right;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.bottom;
        } else if (i10 == 66) {
            i11 = rect2.left;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.top;
            i12 = rect.bottom;
        }
        return Math.max(0, i11 - i12);
    }

    public static final rr.c P(ls.z zVar) {
        int i10 = zVar == null ? -1 : dt.y.f7554a[zVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? rr.c.DECLARATION : rr.c.SYNTHESIZED : rr.c.DELEGATION : rr.c.FAKE_OVERRIDE : rr.c.DECLARATION;
    }

    public static int Q(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static void R(js.q qVar, Annotation annotation) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class clsD = D(z(annotation));
        js.o oVarA = qVar.a(xr.d.a(clsD), new wr.a(annotation));
        if (oVarA != null) {
            S(oVarA, annotation, clsD);
        }
    }

    public static void S(js.o oVar, Annotation annotation, Class cls) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        br.l.d(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                br.l.b(objInvoke);
                qs.g gVarE = qs.g.e(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    oVar.M(gVarE, g((Class) objInvoke));
                } else if (wr.c.f24590a.contains(enclosingClass)) {
                    oVar.l(gVarE, objInvoke);
                } else {
                    List list = xr.d.f25493a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        br.l.d(enclosingClass, "if (clazz.isEnum) clazz else clazz.enclosingClass");
                        oVar.q(gVarE, xr.d.a(enclosingClass), qs.g.e(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        br.l.d(interfaces, "clazz.interfaces");
                        Class cls2 = (Class) mq.l.x0(interfaces);
                        br.l.d(cls2, "annotationClass");
                        js.o oVarK = oVar.K(xr.d.a(cls2), gVarE);
                        if (oVarK != null) {
                            S(oVarK, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        js.p pVarP = oVar.P(gVarE);
                        if (pVarP != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                qs.b bVarA = xr.d.a(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    br.l.c(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    pVarP.a(bVarA, qs.g.e(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    br.l.c(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    pVarP.h(g((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    js.o oVarD = pVarP.d(xr.d.a(componentType));
                                    if (oVarD != null) {
                                        br.l.c(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        S(oVarD, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    pVarP.c(obj4);
                                }
                            }
                            pVarP.b();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        oVar.b();
    }

    public static void T(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static int U(Context context, int i10, int i11) {
        TypedValue typedValueC0 = xu.d.c0(context, i10);
        return (typedValueC0 == null || typedValueC0.type != 16) ? i11 : typedValueC0.data;
    }

    public static TimeInterpolator V(Context context, int i10, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!N(strValueOf, "cubic-bezier") && !N(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (N(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(I(strArrSplit, 0), I(strArrSplit, 1), I(strArrSplit, 2), I(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!N(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        try {
            k3.f.b(ba.m.r(strSubstring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e4) {
            throw new RuntimeException("Error in parsing ".concat(strSubstring), e4);
        }
    }

    public static String W(Throwable th2) {
        br.l.e(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public static byte[] X(kg.d dVar) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i10 = 0;
        while (i10 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i10);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < iMin2) {
                int i12 = dVar.read(bArr, i11, iMin2 - i11);
                if (i12 == -1) {
                    return h(arrayDeque, i10);
                }
                i11 += i12;
                i10 += i12;
            }
            long j = iMin * (iMin < 4096 ? 4 : 2);
            iMin = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        if (dVar.read() == -1) {
            return h(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static char[] Y(byte[] bArr) {
        char[] charArray = mq.o.x0(new lq.t(bArr), "", null, null, ch.g.f3944d, 30).toCharArray();
        br.l.d(charArray, "toCharArray(...)");
        return charArray;
    }

    public static String Z(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public static final f1.c a(long j, long j7) {
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        return new f1.c(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j7 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j7 & 4294967295L)) + Float.intBitsToFloat(i11));
    }

    public static String a0(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e4) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    String strS = h0.b.s(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strS), (Throwable) e4);
                    String name2 = e4.getClass().getName();
                    StringBuilder sbS = c7.a.s(name2.length() + strS.length() + 8 + 1, "<", strS, " threw ", name2);
                    sbS.append(">");
                    string = sbS.toString();
                }
            }
            objArr[i11] = string;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i12, iIndexOf);
            sb2.append(objArr[i10]);
            i10++;
            i12 = iIndexOf + 2;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static final String b(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        st.j jVarA0 = st.l.a0(type, e0.E);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = jVarA0.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        sb2.append(((Class) next).getName());
        sb2.append(tt.s.j0(st.l.X(jVarA0), "[]"));
        return sb2.toString();
    }

    public static void b0(int i10, int i11) {
        String strZ;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strZ = kc.f.Z("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(c7.a.l(i11, "negative size: ", new StringBuilder(String.valueOf(i11).length() + 15)));
                }
                strZ = kc.f.Z("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strZ);
        }
    }

    public static void c(Throwable th2, Throwable th3) {
        br.l.e(th2, "<this>");
        br.l.e(th3, "exception");
        if (th2 != th3) {
            Integer num = uq.a.f23619a;
            if (num == null || num.intValue() >= 19) {
                th2.addSuppressed(th3);
                return;
            }
            Method method = tq.a.f22951a;
            if (method != null) {
                method.invoke(th2, th3);
            }
        }
    }

    public static void c0(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? d0("start index", i10, i12) : (i11 < 0 || i11 > i12) ? d0("end index", i11, i12) : kc.f.Z("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static final bn.d d(long j, String str, List list) {
        br.l.e(list, "assistantResults");
        return list.isEmpty() ? new bn.c(str, j) : new bn.b((bh.a) mq.o.r0(list), str, j);
    }

    public static String d0(String str, int i10, int i11) {
        if (i10 < 0) {
            return kc.f.Z("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return kc.f.Z("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(c7.a.l(i11, "negative size: ", new StringBuilder(String.valueOf(i11).length() + 15)));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = f(r8, r9, r10)
            boolean r1 = f(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = O(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.f0.e(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean f(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static vs.f g(Class cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
            br.l.d(cls, "currentClass.componentType");
        }
        if (cls.isPrimitive()) {
            if (cls.equals(Void.TYPE)) {
                return new vs.f(qs.b.j(or.n.f19692d.g()), i10);
            }
            or.k primitiveType = ys.c.get(cls.getName()).getPrimitiveType();
            br.l.d(primitiveType, "get(currentClass.name).primitiveType");
            return i10 > 0 ? new vs.f(qs.b.j(primitiveType.getArrayTypeFqName()), i10 - 1) : new vs.f(qs.b.j(primitiveType.getTypeFqName()), i10);
        }
        qs.b bVarA = xr.d.a(cls);
        String str = qr.d.f20965a;
        qs.b bVar = (qs.b) qr.d.f20972h.get(bVarA.b().i());
        if (bVar != null) {
            bVarA = bVar;
        }
        return new vs.f(bVarA, i10);
    }

    public static byte[] h(ArrayDeque arrayDeque, int i10) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i10 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static final Type i(br.m mVar, boolean z10) {
        m1 m1Var = (m1) mVar;
        e eVarF = m1Var.f();
        if (eVarF instanceof w) {
            return new c0((w) eVarF);
        }
        if (!(eVarF instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + m1Var);
        }
        d dVar = (d) eVarF;
        Class clsE = z10 ? E(dVar) : D(dVar);
        List listC = m1Var.c();
        if (listC.isEmpty()) {
            return clsE;
        }
        if (!clsE.isArray()) {
            return m(clsE, listC);
        }
        if (clsE.getComponentType().isPrimitive()) {
            return clsE;
        }
        y yVar = (y) mq.o.K0(listC);
        if (yVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + m1Var);
        }
        z zVar = yVar.f12943a;
        br.m mVar2 = yVar.f12944b;
        int i10 = zVar == null ? -1 : d0.f12933a[zVar.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return clsE;
        }
        if (i10 != 2 && i10 != 3) {
            throw new bf.n();
        }
        br.l.b(mVar2);
        Type typeI = i(mVar2, false);
        return typeI instanceof Class ? clsE : new a(typeI);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (com.google.android.gms.internal.measurement.y3.g(r9, r1, br.l.a(r7, r2) ? r0.getWidth() : q8.i.e(r7.f16325a, r8), br.l.a(r7, r2) ? r0.getHeight() : q8.i.e(r7.f16326b, r8), r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap j(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, m8.h r7, m8.g r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.f0.j(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, m8.h, m8.g, boolean):android.graphics.Bitmap");
    }

    public static final bq.n k(bq.j jVar, QuestionValidationState questionValidationState) {
        br.l.e(jVar, "configuration");
        br.l.e(questionValidationState, "validationState");
        if (jVar.f2874c && !jVar.f2876e) {
            return new bq.l(!jVar.f2875d, jVar.f2872a, questionValidationState.isSuccess(), jVar.f2873b, jVar.f2877f);
        }
        if (questionValidationState.getHideDefaultSubmitButton()) {
            return bq.k.f2878a;
        }
        return new bq.m(jVar.f2873b, questionValidationState.isSuccess(), jVar.f2877f);
    }

    public static j4.q l(Context context) {
        ProviderInfo providerInfo;
        q3.d dVar;
        ApplicationInfo applicationInfo;
        df.c bVar = Build.VERSION.SDK_INT >= 28 ? new j4.b() : new df.c();
        PackageManager packageManager = context.getPackageManager();
        se.b.m(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            dVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrZ = bVar.z(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrZ) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new q3.d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e4) {
                io.sentry.android.core.e0.a("emoji2.text.DefaultEmojiConfig", b5.ERROR, null, e4);
                io.sentry.android.core.e0.b(f5.FATAL, null, e4);
                Log.wtf("emoji2.text.DefaultEmojiConfig", e4);
            }
        }
        if (dVar == null) {
            return null;
        }
        return new j4.q(new j4.p(context, dVar));
    }

    public static final b0 m(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(mq.p.a0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(G((y) it.next()));
            }
            return new b0(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(mq.p.a0(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(G((y) it2.next()));
            }
            return new b0(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        b0 b0VarM = m(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(mq.p.a0(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(G((y) it3.next()));
        }
        return new b0(cls, b0VarM, arrayList3);
    }

    public static byte[] n(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        int i10 = 0;
        Iterator it = new hr.d(0, length - 1, 1).iterator();
        while (true) {
            hr.c cVar = (hr.c) it;
            if (!cVar.f10868g) {
                return bArr;
            }
            cVar.nextInt();
            int i11 = i10 + 1;
            if (i10 < 0) {
                e5.Q();
                throw null;
            }
            int i12 = i10 * 2;
            bArr[i10] = (byte) (o(str.charAt(i12 + 1)) + (o(str.charAt(i12)) << 4));
            i10 = i11;
        }
    }

    public static int o(char c4) {
        if ('0' <= c4 && c4 < ':') {
            return c4 - '0';
        }
        if ('a' <= c4 && c4 < 'g') {
            return c4 - 'W';
        }
        if ('A' <= c4 && c4 < 'G') {
            return c4 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c4);
    }

    public static final as.p p(e1 e1Var) {
        switch (e1Var == null ? -1 : dt.y.f7555b[e1Var.ordinal()]) {
            case 1:
                as.p pVar = rr.p.f21700d;
                br.l.d(pVar, "INTERNAL");
                return pVar;
            case 2:
                as.p pVar2 = rr.p.f21697a;
                br.l.d(pVar2, "PRIVATE");
                return pVar2;
            case 3:
                as.p pVar3 = rr.p.f21698b;
                br.l.d(pVar3, "PRIVATE_TO_THIS");
                return pVar3;
            case 4:
                as.p pVar4 = rr.p.f21699c;
                br.l.d(pVar4, "PROTECTED");
                return pVar4;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                as.p pVar5 = rr.p.f21701e;
                br.l.d(pVar5, "PUBLIC");
                return pVar5;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                as.p pVar6 = rr.p.f21702f;
                br.l.d(pVar6, "LOCAL");
                return pVar6;
            default:
                as.p pVar7 = rr.p.f21697a;
                br.l.d(pVar7, "PRIVATE");
                return pVar7;
        }
    }

    public static boolean q(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = i0.f23177a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = h0.f23171d;
        h0 h0Var = (h0) view.getTag(f3.c.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (h0Var == null) {
            h0Var = new h0();
            h0Var.f23172a = null;
            h0Var.f23173b = null;
            h0Var.f23174c = null;
            view.setTag(f3.c.tag_unhandled_key_event_manager, h0Var);
        }
        WeakReference weakReference2 = h0Var.f23174c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        h0Var.f23174c = new WeakReference(keyEvent);
        if (h0Var.f23173b == null) {
            h0Var.f23173b = new SparseArray();
        }
        SparseArray sparseArray = h0Var.f23173b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(f3.c.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        throw h0.b.e(size, arrayList);
    }

    public static boolean r(u3.i iVar, View view, Window.Callback callback, KeyEvent keyEvent) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (iVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return iVar.b(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f12934a) {
                            try {
                                f12935b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f12934a = true;
                        }
                        Method method = f12935b;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (i0.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f12936c) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f12937d = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f12936c = true;
                }
                Field field = f12937d;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (i0.c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && i0.c(view, keyEvent)) || iVar.b(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final boolean t(long j, long j7) {
        return j == j7;
    }

    public static final float u(float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f10) & 8589934591L) / 3)) + 709952852);
        float f11 = fIntBitsToFloat - ((fIntBitsToFloat - (f10 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f11 - ((f11 - (f10 / (f11 * f11))) * 0.33333334f);
    }

    public static final gu.a v(gu.d dVar, ju.a aVar, String str) {
        br.l.e(dVar, "<this>");
        d dVar2 = dVar.f9664a;
        gu.a aVar2 = (gu.a) dVar.f9668e.get(str);
        if (aVar2 == null) {
            aVar.a().getClass();
            br.l.e(dVar2, "baseClass");
            br.b0.d(1, null);
            aVar2 = null;
        }
        if (aVar2 != null) {
            return aVar2;
        }
        p0.g(dVar2, str);
        throw null;
    }

    public static final gu.a w(gu.d dVar, mu.y yVar, Object obj) {
        br.l.e(dVar, "<this>");
        d dVar2 = dVar.f9664a;
        br.l.e(obj, "value");
        Map map = dVar.f9667d;
        Class<?> cls = obj.getClass();
        br.y yVar2 = br.x.f2918a;
        gu.a aVar = (gu.a) map.get(yVar2.b(cls));
        if (aVar == null) {
            yVar.a().getClass();
            br.l.e(dVar2, "baseClass");
            if (dVar2.x(obj)) {
                br.b0.d(1, null);
            }
            aVar = null;
        }
        if (aVar == null) {
            aVar = null;
        }
        if (aVar != null) {
            return aVar;
        }
        d dVarB = yVar2.b(obj.getClass());
        br.l.e(dVar2, "baseClass");
        String strP = dVarB.p();
        if (strP == null) {
            strP = String.valueOf(dVarB);
        }
        p0.g(dVar2, strP);
        throw null;
    }

    public static ni.c0 x(df.c cVar, ak.u uVar, ak.a0 a0Var) {
        br.l.e(cVar, "dateTimeRepository");
        br.l.e(uVar, "deviceLocation");
        return new ni.c0(Double.valueOf(uVar.f727g), Double.valueOf(uVar.f721a), Double.valueOf(uVar.f722b), Double.valueOf(uVar.j), Long.valueOf(uVar.a(cVar, a0Var)), Boolean.valueOf(uVar.f730l), Double.valueOf(uVar.f728h), Long.valueOf(uVar.f726f), uVar.f723c, uVar.f731m, uVar.f732n, uVar.f733o);
    }

    public static ni.c0 y(String str) {
        if (str != null && str.length() != 0 && !tt.l.D0(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new ni.c0(xu.d.t("altitude", jSONObject), xu.d.t("latitude", jSONObject), xu.d.t("longitude", jSONObject), xu.d.t("accuracy", jSONObject), xu.d.C("age", jSONObject), xu.d.r("mocking_enabled", jSONObject), xu.d.t("speed", jSONObject), xu.d.C("time", jSONObject), xu.d.K("provider", jSONObject), xu.d.t("msl_altitude_meters", jSONObject), xu.d.v("msl_altitude_accuracy_meters", jSONObject), xu.d.v("altitude_accuracy_meters", jSONObject));
            } catch (JSONException unused) {
                ch.n.c("LocationCoreResult", "Trying to parse invalid JSON: ".concat(str));
            }
        }
        return null;
    }

    public static final d z(Annotation annotation) {
        br.l.e(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        br.l.d(clsAnnotationType, "annotationType(...)");
        return H(clsAnnotationType);
    }
}
