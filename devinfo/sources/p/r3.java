package p;

import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.applovin.shadow.okio.Segment;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.dc;
import com.google.android.gms.internal.consent_sdk.e6;
import com.google.android.gms.internal.consent_sdk.h7;
import com.google.android.gms.internal.consent_sdk.i7;
import com.google.android.gms.internal.consent_sdk.j7;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.liuzh.deviceinfo.R;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f30844a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30845b;

    /* renamed from: c, reason: collision with root package name */
    public Object f30846c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f30847d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f30848e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f30849f;
    public final Object g;

    public /* synthetic */ r3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f30844a = obj;
        this.f30845b = obj2;
        this.f30846c = obj3;
        this.f30847d = obj4;
        this.f30848e = obj5;
        this.f30849f = obj6;
        this.g = obj7;
    }

    public static me.p0 b(me.p0 p0Var, le.f fVar, r3 r3Var, Map map) {
        Map mapUnmodifiableMap;
        me.o0 o0VarA = p0Var.a();
        String strB = ((le.d) fVar.f28716b).b();
        if (strB != null) {
            o0VarA.f29265e = new me.c1(strB);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        b5.i0 i0Var = (b5.i0) r3Var.f30847d;
        if (map.isEmpty()) {
            mapUnmodifiableMap = ((le.e) ((AtomicMarkableReference) i0Var.f1821b).getReference()).a();
        } else {
            HashMap map2 = new HashMap(((le.e) ((AtomicMarkableReference) i0Var.f1821b).getReference()).a());
            int i4 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strB2 = le.e.b(Segment.SHARE_MINIMUM, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strB2)) {
                    map2.put(strB2, le.e.b(Segment.SHARE_MINIMUM, (String) entry.getValue()));
                } else {
                    i4++;
                }
            }
            if (i4 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i4 + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map2);
        }
        List listF = f(mapUnmodifiableMap);
        List listF2 = f(((le.e) ((AtomicMarkableReference) ((b5.i0) r3Var.f30848e).f1821b).getReference()).a());
        if (!listF.isEmpty() || !listF2.isEmpty()) {
            me.q0 q0Var = (me.q0) p0Var.f29273c;
            o0VarA.f29263c = new me.q0(q0Var.f29283a, listF, listF2, q0Var.f29286d, q0Var.f29287e, q0Var.f29288f, q0Var.g);
        }
        return o0VarA.a();
    }

    public static me.j2 c(me.p0 p0Var, r3 r3Var) {
        List listA = ((dc) r3Var.f30849f).a();
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < listA.size(); i4++) {
            le.n nVar = (le.n) listA.get(i4);
            nVar.getClass();
            me.d1 d1Var = new me.d1();
            le.b bVar = (le.b) nVar;
            String str = bVar.f28706e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar.f28703b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            d1Var.f29109a = new me.f1(str2, str);
            String str3 = bVar.f28704c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            d1Var.f29110b = str3;
            String str4 = bVar.f28705d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            d1Var.f29111c = str4;
            d1Var.f29112d = bVar.f28707f;
            d1Var.f29113e = (byte) (d1Var.f29113e | 1);
            arrayList.add(d1Var.a());
        }
        if (arrayList.isEmpty()) {
            return p0Var;
        }
        me.o0 o0VarA = p0Var.a();
        o0VarA.f29266f = new me.g1(arrayList);
        return o0VarA.a();
    }

    public static String d(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[Segment.SIZE];
                while (true) {
                    int i4 = bufferedInputStream.read(bArr);
                    if (i4 == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i4);
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static r3 e(Context context, je.x xVar, pe.c cVar, je.a aVar, le.f fVar, r3 r3Var, km.n nVar, com.google.android.gms.internal.consent_sdk.d dVar, y4.a aVar2, je.j jVar, ke.c cVar2) {
        je.r rVar = new je.r(context, xVar, aVar, nVar, dVar);
        pe.a aVar3 = new pe.a(cVar, dVar, jVar);
        ne.a aVar4 = qe.a.f32268b;
        ea.q.b(context);
        return new r3(rVar, aVar3, new qe.a(new qe.c(ea.q.a().c(new ca.a(qe.a.f32269c, qe.a.f32270d)).a("FIREBASE_CRASHLYTICS_REPORT", new ba.b("json"), qe.a.f32271e), dVar.b(), aVar2)), fVar, r3Var, xVar, cVar2);
    }

    public static List f(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new me.f0(str, str2));
        }
        Collections.sort(arrayList, new b4.b(9));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // com.google.android.gms.internal.consent_sdk.j7
    public Object a() {
        Application application = (Application) ((j7) this.f30844a).a();
        return new com.google.android.gms.internal.consent_sdk.m(application, (com.google.android.gms.internal.consent_sdk.v) ((h7) this.f30846c).a(), (com.google.android.gms.internal.consent_sdk.h) ((j7) this.f30847d).a(), (com.google.android.gms.internal.consent_sdk.r) ((e6) this.f30848e).f19335b, (com.google.android.gms.internal.consent_sdk.p) this.f30849f, (com.google.android.gms.internal.consent_sdk.e0) ((j7) this.g).a());
    }

    public void g(Throwable th2, Thread thread, String str, le.c cVar, boolean z3) {
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        byte b10;
        boolean zEquals = str.equals("crash");
        je.r rVar = (je.r) this.f30844a;
        long j = cVar.f28709b;
        Context context = rVar.f27605a;
        int i4 = context.getResources().getConfiguration().orientation;
        km.n nVar = rVar.f27608d;
        Stack stack = new Stack();
        for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        se.b bVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            bVar = new se.b(th3.getLocalizedMessage(), th3.getClass().getName(), nVar.p(th3.getStackTrace()), bVar);
        }
        me.o0 o0Var = new me.o0();
        o0Var.f29262b = str;
        o0Var.f29261a = j;
        o0Var.g = (byte) (o0Var.g | 1);
        me.c2 c2VarB = ge.f.f24700a.b(context);
        int i10 = ((me.z0) c2VarB).f29363c;
        Boolean boolValueOf = i10 > 0 ? Boolean.valueOf(i10 != 100) : null;
        ArrayList arrayListA = ge.f.a(context);
        byte b11 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) bVar.f33558c;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b12 = (byte) 1;
        List listD = je.r.d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        Boolean bool = boolValueOf;
        if (b12 != 1) {
            StringBuilder sb2 = new StringBuilder();
            if (b12 == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException(d.h.v(sb2, "Missing required properties:"));
        }
        arrayList.add(new me.v0(4, listD, name));
        if (z3) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                Thread key = next.getKey();
                if (key.equals(thread)) {
                    it = it2;
                    b10 = b12;
                } else {
                    StackTraceElement[] stackTraceElementArrP = nVar.p(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    it = it2;
                    List listD2 = je.r.d(stackTraceElementArrP, 0);
                    if (listD2 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b12 != 1) {
                        byte b13 = b12;
                        StringBuilder sb3 = new StringBuilder();
                        if (b13 == 0) {
                            sb3.append(" importance");
                        }
                        throw new IllegalStateException(d.h.v(sb3, "Missing required properties:"));
                    }
                    b10 = b12;
                    arrayList.add(new me.v0(0, listD2, name2));
                }
                it2 = it;
                b12 = b10;
            }
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        me.t0 t0VarC = je.r.c(bVar, 0);
        me.u0 u0VarE = je.r.e();
        List listA = rVar.a();
        if (listA == null) {
            throw new NullPointerException("Null binaries");
        }
        me.r0 r0Var = new me.r0(listUnmodifiableList, t0VarC, null, u0VarE, listA);
        if (b11 != 1) {
            StringBuilder sb4 = new StringBuilder();
            if (b11 == 0) {
                sb4.append(" uiOrientation");
            }
            throw new IllegalStateException(d.h.v(sb4, "Missing required properties:"));
        }
        o0Var.f29263c = new me.q0(r0Var, null, null, bool, c2VarB, arrayListA, i4);
        o0Var.f29264d = rVar.b(i4);
        me.p0 p0VarA = o0Var.a();
        Map map = cVar.f28710c;
        le.f fVar = (le.f) this.f30847d;
        r3 r3Var = (r3) this.f30848e;
        me.j2 j2VarC = c(b(p0VarA, fVar, r3Var, map), r3Var);
        if (z3) {
            ((pe.a) this.f30845b).d(j2VarC, cVar.f28708a, zEquals);
        } else {
            ((ke.c) this.g).f28259b.a(new com.applovin.impl.sdk.u(this, j2VarC, cVar, zEquals, 7));
        }
    }

    public Task h(String str, Executor executor) {
        TaskCompletionSource taskCompletionSource;
        ArrayList arrayListB = ((pe.a) this.f30845b).b();
        ArrayList arrayList = new ArrayList();
        int size = arrayListB.size();
        int i4 = 0;
        while (i4 < size) {
            int i10 = i4 + 1;
            File file = (File) arrayListB.get(i4);
            try {
                ne.a aVar = pe.a.g;
                String strE = pe.a.e(file);
                aVar.getClass();
                arrayList.add(new je.b(ne.a.i(strE), file.getName(), file));
            } catch (IOException e2) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
            i4 = i10;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            je.b bVar = (je.b) obj;
            if (str == null || str.equals(bVar.f27536b)) {
                qe.a aVar2 = (qe.a) this.f30846c;
                me.b0 b0Var = bVar.f27535a;
                if (b0Var.f29066f == null || b0Var.g == null) {
                    je.w wVarB = ((je.x) this.f30849f).b(true);
                    me.b0 b0Var2 = bVar.f27535a;
                    String str2 = wVarB.f27624a;
                    me.a0 a0VarA = b0Var2.a();
                    a0VarA.f29041e = str2;
                    me.b0 b0VarA = a0VarA.a();
                    String str3 = wVarB.f27625b;
                    me.a0 a0VarA2 = b0VarA.a();
                    a0VarA2.f29042f = str3;
                    bVar = new je.b(a0VarA2.a(), bVar.f27536b, bVar.f27537c);
                }
                boolean z3 = str != null;
                qe.c cVar = aVar2.f32272a;
                synchronized (cVar.f32282f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z3) {
                            ((AtomicInteger) cVar.f32284i.f37323a).getAndIncrement();
                            if (cVar.f32282f.size() < cVar.f32281e) {
                                ge.e eVar = ge.e.f24699a;
                                eVar.b("Enqueueing report: " + bVar.f27536b);
                                eVar.b("Queue size: " + cVar.f32282f.size());
                                cVar.g.execute(new b4.o(cVar, bVar, taskCompletionSource, 19));
                                eVar.b("Closing task for report: " + bVar.f27536b);
                                taskCompletionSource.trySetResult(bVar);
                            } else {
                                cVar.a();
                                String str4 = "Dropping report due to queue being full: " + bVar.f27536b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) cVar.f32284i.f37324b).getAndIncrement();
                                taskCompletionSource.trySetResult(bVar);
                            }
                        } else {
                            cVar.b(bVar, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new je.y(this)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }

    public void i(String str) {
        b5.i0 i0Var = (b5.i0) this.f30848e;
        synchronized (i0Var) {
            try {
                if (((le.e) ((AtomicMarkableReference) i0Var.f1821b).getReference()).c(str)) {
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) i0Var.f1821b;
                    atomicMarkableReference.set((le.e) atomicMarkableReference.getReference(), true);
                    ig.l lVar = new ig.l(10, i0Var);
                    AtomicReference atomicReference = (AtomicReference) i0Var.f1822c;
                    while (!atomicReference.compareAndSet(null, lVar)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    ((ke.c) ((r3) i0Var.f1823d).f30845b).f28259b.a(lVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public r3(LinearLayout linearLayout, TextView textView, ProgressBar progressBar, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f30844a = linearLayout;
        this.f30846c = textView;
        this.f30845b = progressBar;
        this.f30847d = textView2;
        this.f30848e = textView3;
        this.f30849f = textView4;
        this.g = textView5;
    }

    public r3(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f30847d = layoutParams;
        this.f30848e = new Rect();
        this.f30849f = new int[2];
        this.g = new int[2];
        this.f30844a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f30845b = viewInflate;
        this.f30846c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(r3.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public r3(String str, pe.c cVar, ke.c cVar2) {
        this.f30847d = new b5.i0(this, false);
        this.f30848e = new b5.i0(this, true);
        this.f30849f = new dc(3);
        this.g = new AtomicMarkableReference(null, false);
        this.f30846c = str;
        this.f30844a = new le.h(cVar);
        this.f30845b = cVar2;
    }

    public r3(c8.e eVar, c8.e eVar2, c8.e eVar3, c8.e eVar4, z7.k kVar, z7.k kVar2) {
        this.g = u8.d.a(150, new o.e(26, this));
        this.f30844a = eVar;
        this.f30845b = eVar2;
        this.f30846c = eVar3;
        this.f30847d = eVar4;
        this.f30848e = kVar;
        this.f30849f = kVar2;
    }
}
