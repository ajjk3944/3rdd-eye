package E;

import A9.C0583j;
import L0.I;
import L0.S;
import N7.G8;
import Q9.C1526e;
import Q9.C1539k0;
import Q9.C1545n0;
import Q9.F0;
import Q9.J;
import Q9.L;
import Q9.U;
import Q9.Z;
import Q9.v0;
import Q9.w0;
import S9.AbstractC1569a;
import S9.C1588u;
import a4.C1650a;
import a7.AbstractC1664a;
import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.PictureDrawable;
import android.media.CamcorderProfile;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import c9.C2092m;
import com.google.android.gms.tasks.Task;
import com.singular.sdk.internal.Constants;
import d9.C4284b;
import f9.InterfaceC4350h;
import h3.C4412a;
import j3.f;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import l4.C5285d;
import l4.C5287f;
import l4.C5289h;
import p9.InterfaceC5480a;
import v.InterfaceC5649d;
import w9.InterfaceC5748c;

/* compiled from: JpegImage2Result.java */
/* loaded from: classes.dex */
public class u implements M4.a, L2.k, a3.n, com.google.gson.internal.g, InterfaceC5649d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1342b;

    public /* synthetic */ u(int i) {
        this.f1342b = i;
    }

    public static final InterfaceC5748c A(O9.e eVar) {
        kotlin.jvm.internal.l.f(eVar, "<this>");
        if (eVar instanceof O9.b) {
            return ((O9.b) eVar).f10489b;
        }
        if (eVar instanceof w0) {
            return A(((w0) eVar).f11538a);
        }
        return null;
    }

    public static final String B(com.zipoapps.premiumhelper.d dVar, int i) {
        return String.valueOf(dVar.getResources().getInteger(i));
    }

    public static final Class C(InterfaceC5748c interfaceC5748c) {
        kotlin.jvm.internal.l.f(interfaceC5748c, "<this>");
        Class<?> clsI = ((kotlin.jvm.internal.d) interfaceC5748c).i();
        kotlin.jvm.internal.l.d(clsI, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsI;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class D(InterfaceC5748c interfaceC5748c) {
        kotlin.jvm.internal.l.f(interfaceC5748c, "<this>");
        Class<?> clsI = ((kotlin.jvm.internal.d) interfaceC5748c).i();
        if (clsI.isPrimitive()) {
            String name = clsI.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals(Constants.LONG)) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsI;
    }

    public static final void E(InterfaceC4350h interfaceC4350h, Throwable th) {
        Throwable runtimeException;
        Iterator<A9.B> it = F9.g.f1753a.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(interfaceC4350h, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    b9.x.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            b9.x.a(th, new F9.h(interfaceC4350h));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static H.e F() {
        if (H.e.f1959c != null) {
            return H.e.f1959c;
        }
        synchronized (H.e.class) {
            try {
                if (H.e.f1959c == null) {
                    H.e.f1959c = new H.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return H.e.f1959c;
    }

    public static List G(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.l.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static H.c H() {
        if (H.f.f1962a != null) {
            return H.f.f1962a;
        }
        synchronized (H.f.class) {
            try {
                if (H.f.f1962a == null) {
                    H.f.f1962a = new H.c(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return H.f.f1962a;
    }

    public static final CharSequence I(CharSequence charSequence, int i) {
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i10 = i - 30;
                int i11 = i + 30;
                String str = i10 <= 0 ? "" : ".....";
                String str2 = i11 >= charSequence.length() ? "" : ".....";
                StringBuilder sbU = G8.u(str);
                if (i10 < 0) {
                    i10 = 0;
                }
                int length = charSequence.length();
                if (i11 > length) {
                    i11 = length;
                }
                sbU.append(charSequence.subSequence(i10, i11).toString());
                sbU.append(str2);
                return sbU.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final M9.b J(InterfaceC5748c interfaceC5748c, ArrayList arrayList, InterfaceC5480a interfaceC5480a) {
        M9.b f02;
        M9.b v0Var;
        kotlin.jvm.internal.l.f(interfaceC5748c, "<this>");
        if (interfaceC5748c.equals(kotlin.jvm.internal.x.a(Collection.class)) ? true : interfaceC5748c.equals(kotlin.jvm.internal.x.a(List.class)) ? true : interfaceC5748c.equals(kotlin.jvm.internal.x.a(List.class)) ? true : interfaceC5748c.equals(kotlin.jvm.internal.x.a(ArrayList.class))) {
            f02 = new C1526e((M9.b) arrayList.get(0));
        } else if (interfaceC5748c.equals(kotlin.jvm.internal.x.a(HashSet.class))) {
            f02 = new L((M9.b) arrayList.get(0), 0);
        } else {
            if (interfaceC5748c.equals(kotlin.jvm.internal.x.a(Set.class)) ? true : interfaceC5748c.equals(kotlin.jvm.internal.x.a(Set.class)) ? true : interfaceC5748c.equals(kotlin.jvm.internal.x.a(LinkedHashSet.class))) {
                f02 = new L((M9.b) arrayList.get(0), 1);
            } else if (interfaceC5748c.equals(kotlin.jvm.internal.x.a(HashMap.class))) {
                f02 = new J((M9.b) arrayList.get(0), (M9.b) arrayList.get(1));
            } else {
                if (interfaceC5748c.equals(kotlin.jvm.internal.x.a(Map.class)) ? true : interfaceC5748c.equals(kotlin.jvm.internal.x.a(Map.class)) ? true : interfaceC5748c.equals(kotlin.jvm.internal.x.a(LinkedHashMap.class))) {
                    f02 = new U((M9.b) arrayList.get(0), (M9.b) arrayList.get(1));
                } else {
                    if (interfaceC5748c.equals(kotlin.jvm.internal.x.a(Map.Entry.class))) {
                        M9.b keySerializer = (M9.b) arrayList.get(0);
                        M9.b valueSerializer = (M9.b) arrayList.get(1);
                        kotlin.jvm.internal.l.f(keySerializer, "keySerializer");
                        kotlin.jvm.internal.l.f(valueSerializer, "valueSerializer");
                        v0Var = new Z(keySerializer, valueSerializer);
                    } else if (interfaceC5748c.equals(kotlin.jvm.internal.x.a(b9.l.class))) {
                        M9.b keySerializer2 = (M9.b) arrayList.get(0);
                        M9.b valueSerializer2 = (M9.b) arrayList.get(1);
                        kotlin.jvm.internal.l.f(keySerializer2, "keySerializer");
                        kotlin.jvm.internal.l.f(valueSerializer2, "valueSerializer");
                        v0Var = new C1539k0(keySerializer2, valueSerializer2);
                    } else if (interfaceC5748c.equals(kotlin.jvm.internal.x.a(b9.q.class))) {
                        M9.b aSerializer = (M9.b) arrayList.get(0);
                        M9.b bSerializer = (M9.b) arrayList.get(1);
                        M9.b cSerializer = (M9.b) arrayList.get(2);
                        kotlin.jvm.internal.l.f(aSerializer, "aSerializer");
                        kotlin.jvm.internal.l.f(bSerializer, "bSerializer");
                        kotlin.jvm.internal.l.f(cSerializer, "cSerializer");
                        f02 = new F0(aSerializer, bSerializer, cSerializer);
                    } else if (C(interfaceC5748c).isArray()) {
                        Object objInvoke = interfaceC5480a.invoke();
                        kotlin.jvm.internal.l.d(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                        M9.b elementSerializer = (M9.b) arrayList.get(0);
                        kotlin.jvm.internal.l.f(elementSerializer, "elementSerializer");
                        v0Var = new v0((InterfaceC5748c) objInvoke, elementSerializer);
                    } else {
                        f02 = null;
                    }
                    f02 = v0Var;
                }
            }
        }
        if (f02 != null) {
            return f02;
        }
        M9.b[] bVarArr = (M9.b[]) arrayList.toArray(new M9.b[0]);
        return T1.B.c(interfaceC5748c, (M9.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public static final boolean K(String method) {
        kotlin.jvm.internal.l.f(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }

    public static final M9.b L(I9.g gVar, w9.j type) {
        kotlin.jvm.internal.l.f(gVar, "<this>");
        kotlin.jvm.internal.l.f(type, "type");
        M9.b<Object> bVarA = M9.m.a(gVar, type, true);
        if (bVarA != null) {
            return bVarA;
        }
        InterfaceC5748c<Object> interfaceC5748cC = C1545n0.c(type);
        kotlin.jvm.internal.l.f(interfaceC5748cC, "<this>");
        C1545n0.d(interfaceC5748cC);
        throw null;
    }

    public static final ArrayList M(I9.g gVar, List typeArguments, boolean z10) {
        kotlin.jvm.internal.l.f(gVar, "<this>");
        kotlin.jvm.internal.l.f(typeArguments, "typeArguments");
        if (z10) {
            List list = typeArguments;
            ArrayList arrayList = new ArrayList(C2092m.T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(L(gVar, (w9.j) it.next()));
            }
            return arrayList;
        }
        List<w9.j> list2 = typeArguments;
        ArrayList arrayList2 = new ArrayList(C2092m.T(list2, 10));
        for (w9.j type : list2) {
            kotlin.jvm.internal.l.f(type, "type");
            M9.b<Object> bVarA = M9.m.a(gVar, type, false);
            if (bVarA == null) {
                return null;
            }
            arrayList2.add(bVarA);
        }
        return arrayList2;
    }

    public static void N(View view, C5287f c5287f) {
        C1650a c1650a = c5287f.f43759b.f43783b;
        if (c1650a == null || !c1650a.f14159a) {
            return;
        }
        float fI = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            fI += I.d.i((View) parent);
        }
        C5287f.b bVar = c5287f.f43759b;
        if (bVar.f43792l != fI) {
            bVar.f43792l = fI;
            c5287f.n();
        }
    }

    public static final long O(long j4, long j10, long j11, String str) {
        String property;
        int i = F9.z.f1790a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j4;
        }
        Long lR = y9.m.R(property);
        if (lR == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lR.longValue();
        if (j10 <= jLongValue && jLongValue <= j11) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j10 + ".." + j11 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int P(int i, int i10, String str) {
        return (int) O(i, 1, (i10 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }

    public static final void Q(AbstractC1569a abstractC1569a, Number number) {
        AbstractC1569a.s(abstractC1569a, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
        throw null;
    }

    public static final String R(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) I(str2, -1));
    }

    public static long S() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }

    public static final S9.w e(Number number, String output) {
        kotlin.jvm.internal.l.f(output, "output");
        return new S9.w("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) I(output, -1)));
    }

    public static final S9.w g(O9.e keyDescriptor) {
        kotlin.jvm.internal.l.f(keyDescriptor, "keyDescriptor");
        return new S9.w("Value of type '" + keyDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final C1588u h(int i, String message) {
        kotlin.jvm.internal.l.f(message, "message");
        if (i >= 0) {
            message = "Unexpected JSON token at offset " + i + ": " + message;
        }
        kotlin.jvm.internal.l.f(message, "message");
        return new C1588u(message);
    }

    public static final C1588u i(int i, String message, CharSequence input) {
        kotlin.jvm.internal.l.f(message, "message");
        kotlin.jvm.internal.l.f(input, "input");
        return h(i, message + "\nJSON input: " + ((Object) I(input, i)));
    }

    public static final ExecutorService j(boolean z10) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new androidx.work.c(z10));
        kotlin.jvm.internal.l.e(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorServiceNewFixedThreadPool;
    }

    public static final String k(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(th.getMessage());
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            sb.append('\n');
            sb.append(cause.getMessage());
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "result.toString()");
        return string;
    }

    public static final Object l(Task task, w5.n nVar) throws Exception {
        if (!task.isComplete()) {
            C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(nVar));
            c0583j.s();
            task.addOnCompleteListener(L9.a.f4104b, new L9.b(c0583j));
            Object objR = c0583j.r();
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            return objR;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static C4284b m(C4284b c4284b) {
        c4284b.h();
        c4284b.f37538d = true;
        return c4284b.f37537c > 0 ? c4284b : C4284b.f37535e;
    }

    public static final String o(X0.n nVar, AbstractC1664a abstractC1664a, int i, String str) {
        if (str.length() != 0 && i > 0) {
            StringBuilder sb = new StringBuilder(i);
            v9.f fVarC = v9.h.O(0, i).iterator();
            while (fVarC.f47101d) {
                sb.append(str.charAt(fVarC.a() % str.length()));
            }
            String string = sb.toString();
            kotlin.jvm.internal.l.e(string, "stringBuilder.toString()");
            return string;
        }
        if (str.length() != 0) {
            return "";
        }
        H6.I i10 = (H6.I) nVar.f13451d;
        Throwable th = new Throwable(B4.f.c(new StringBuilder("Warning occurred while evaluating '"), abstractC1664a.f14167a, "': String for padding is empty."));
        Q6.c cVar = (Q6.c) i10.f2053c;
        cVar.f11320d.add(th);
        cVar.b();
        return "";
    }

    public static void p(StringBuilder sb, Object obj) {
        int iLastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static int q(Context context, String str) {
        return r(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int r(Context context, String str, int i, int i10, String str2) {
        int iC;
        if (context.checkPermission(str, i, i10) != -1) {
            String strD = y0.f.d(str);
            if (strD != null) {
                if (str2 == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(i10);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        str2 = packagesForUid[0];
                    }
                }
                int iMyUid = Process.myUid();
                String packageName = context.getPackageName();
                if (iMyUid == i10 && Objects.equals(packageName, str2) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManagerC = y0.g.c(context);
                    iC = y0.g.a(appOpsManagerC, strD, Binder.getCallingUid(), str2);
                    if (iC == 0) {
                        iC = y0.g.a(appOpsManagerC, strD, i10, y0.g.b(context));
                    }
                } else {
                    iC = y0.f.c((AppOpsManager) y0.f.a(context, AppOpsManager.class), strD, str2);
                }
                if (iC != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static int s(Context context, String str) {
        return r(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static T1.B t(int i) {
        return i != 0 ? i != 1 ? new C5289h() : new C5285d() : new C5289h();
    }

    public static C4284b u() {
        return new C4284b(10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONArray w(org.json.JSONArray r6, int r7) {
        /*
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            int r1 = r6.length()
            r2 = 0
        La:
            if (r2 >= r1) goto L38
            java.lang.Object r3 = r6.opt(r2)
            boolean r4 = r3 instanceof org.json.JSONObject
            java.lang.String r5 = "..."
            if (r4 == 0) goto L23
            if (r7 != 0) goto L1a
        L18:
            r3 = r5
            goto L32
        L1a:
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            int r4 = r7 + (-1)
            org.json.JSONObject r3 = x(r3, r4)
            goto L32
        L23:
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 == 0) goto L32
            if (r7 != 0) goto L2a
            goto L18
        L2a:
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            int r4 = r7 + (-1)
            org.json.JSONArray r3 = w(r3, r4)
        L32:
            r0.put(r3)
            int r2 = r2 + 1
            goto La
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E.u.w(org.json.JSONArray, int):org.json.JSONArray");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject x(org.json.JSONObject r6, int r7) throws org.json.JSONException {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Iterator r1 = r6.keys()
            java.lang.String r2 = "keys"
            kotlin.jvm.internal.l.e(r1, r2)
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r6.opt(r2)
            java.lang.String r4 = "key"
            kotlin.jvm.internal.l.e(r2, r4)
            boolean r4 = r3 instanceof org.json.JSONObject
            java.lang.String r5 = "..."
            if (r4 == 0) goto L36
            if (r7 != 0) goto L2d
        L2b:
            r3 = r5
            goto L45
        L2d:
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            int r4 = r7 + (-1)
            org.json.JSONObject r3 = x(r3, r4)
            goto L45
        L36:
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 == 0) goto L45
            if (r7 != 0) goto L3d
            goto L2b
        L3d:
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            int r4 = r7 + (-1)
            org.json.JSONArray r3 = w(r3, r4)
        L45:
            r0.put(r2, r3)
            goto Le
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E.u.x(org.json.JSONObject, int):org.json.JSONObject");
    }

    public static H.b y() {
        if (H.b.f1946b != null) {
            return H.b.f1946b;
        }
        synchronized (H.b.class) {
            try {
                if (H.b.f1946b == null) {
                    H.b.f1946b = new H.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return H.b.f1946b;
    }

    public static final String z(com.zipoapps.premiumhelper.d dVar, int i) {
        return String.valueOf(dVar.getResources().getBoolean(i));
    }

    @Override // v.InterfaceC5649d
    public CamcorderProfile a(int i, int i10) {
        return CamcorderProfile.get(i, i10);
    }

    @Override // L2.k
    public L2.c b(L2.h hVar) {
        return L2.c.SOURCE;
    }

    @Override // v.InterfaceC5649d
    public boolean c(int i, int i10) {
        return CamcorderProfile.hasProfile(i, i10);
    }

    @Override // M4.a
    public void d(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // L2.d
    public boolean f(Object obj, File file, L2.h hVar) throws Throwable {
        try {
            C4412a.d(((Y2.c) ((N2.u) obj).get()).f13728b.f13737a.f13739a.f3094d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e4) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e4);
            return false;
        }
    }

    @Override // com.google.gson.internal.g
    public Object n() {
        switch (this.f1342b) {
            case 20:
                return new com.google.gson.internal.f();
            default:
                return new LinkedHashSet();
        }
    }

    public PictureDrawable v(ByteArrayInputStream byteArrayInputStream) {
        float fWidth;
        float fHeight;
        try {
            j3.f fVarC = j3.f.c(byteArrayInputStream);
            kotlin.jvm.internal.l.e(fVarC, "getFromInputStream(source)");
            f.F f10 = fVarC.f42716a;
            if (f10 == null) {
                throw new IllegalArgumentException("SVG document is empty");
            }
            f.C5170b c5170b = f10.f42794o;
            RectF rectF = c5170b == null ? null : new RectF(c5170b.f42807a, c5170b.f42808b, c5170b.a(), c5170b.b());
            if (rectF != null) {
                fWidth = rectF.width();
                fHeight = rectF.height();
            } else {
                if (fVarC.f42716a == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                fWidth = fVarC.a().f42809c;
                if (fVarC.f42716a == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                fHeight = fVarC.a().f42810d;
            }
            if (rectF == null && fWidth > 0.0f && fHeight > 0.0f) {
                f.F f11 = fVarC.f42716a;
                if (f11 == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                f11.f42794o = new f.C5170b(0.0f, 0.0f, fWidth, fHeight);
            }
            return new PictureDrawable(fVarC.d());
        } catch (j3.h unused) {
            return null;
        }
    }
}
