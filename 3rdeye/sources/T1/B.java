package T1;

import A9.C0567b;
import A9.C0583j;
import A9.C0600s;
import F9.C0658a;
import H6.C0672i;
import J8.InterfaceC0696k;
import K6.C0713c;
import N7.AbstractC1142dc;
import N7.C1210i5;
import N7.EnumC1195h5;
import N7.S2;
import N7.Vb;
import N7.Z;
import Q9.M;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC1762o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import c9.C2092m;
import c9.C2099t;
import com.applovin.sdk.AppLovinEventTypes;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import f9.InterfaceC4347e;
import ia.C4468d;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.IDN;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o6.C5426c;
import w1.k;
import z6.C5865d;

/* compiled from: WorkManagerImplExt.kt */
/* loaded from: classes.dex */
public class B implements a3.f, com.google.gson.internal.g {
    public static void A(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final String B(String str) {
        kotlin.jvm.internal.l.f(str, "<this>");
        int i = 0;
        int i10 = -1;
        if (!y9.q.b0(str, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
            try {
                String ascii = IDN.toASCII(str);
                kotlin.jvm.internal.l.e(ascii, "toASCII(host)");
                Locale US = Locale.US;
                kotlin.jvm.internal.l.e(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                kotlin.jvm.internal.l.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i11 = 0; i11 < length; i11++) {
                    char cCharAt = lowerCase.charAt(i11);
                    if (kotlin.jvm.internal.l.h(cCharAt, 31) <= 0 || kotlin.jvm.internal.l.h(cCharAt, 127) >= 0 || y9.q.f0(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressE = (y9.n.a0(str, "[", false) && y9.n.T(str, "]")) ? e(1, str.length() - 1, str) : e(0, str.length(), str);
        if (inetAddressE == null) {
            return null;
        }
        byte[] address = inetAddressE.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressE.getHostAddress();
            }
            throw new AssertionError(androidx.work.s.e("Invalid IPv6 address: '", str, '\''));
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < address.length) {
            int i14 = i12;
            while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        C4468d c4468d = new C4468d();
        while (i < address.length) {
            if (i == i10) {
                c4468d.C0(58);
                i += i13;
                if (i == 16) {
                    c4468d.C0(58);
                }
            } else {
                if (i > 0) {
                    c4468d.C0(58);
                }
                byte b10 = address[i];
                byte[] bArr = V9.b.f13053a;
                c4468d.N0(((b10 & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return c4468d.p0();
    }

    public static final b9.t C(String str) {
        int i;
        com.google.gson.internal.c.e(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.l.h(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i11 = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            int i12 = i10 ^ RecyclerView.UNDEFINED_DURATION;
            if (Integer.compare(i12, i11 ^ RecyclerView.UNDEFINED_DURATION) > 0) {
                if (i11 != 119304647) {
                    return null;
                }
                i11 = (int) (((-1) & 4294967295L) / (4294967295L & 10));
                if (Integer.compare(i12, i11 ^ RecyclerView.UNDEFINED_DURATION) > 0) {
                    return null;
                }
            }
            int i13 = i10 * 10;
            int i14 = iDigit + i13;
            if (Integer.compare(i14 ^ RecyclerView.UNDEFINED_DURATION, i13 ^ RecyclerView.UNDEFINED_DURATION) < 0) {
                return null;
            }
            i++;
            i10 = i14;
        }
        return new b9.t(i10);
    }

    public static final b9.v D(String str) {
        int i;
        long j4;
        kotlin.jvm.internal.l.f(str, "<this>");
        int i10 = 10;
        com.google.gson.internal.c.e(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        int i11 = 1;
        if (kotlin.jvm.internal.l.h(cCharAt, 48) >= 0) {
            i = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i = 1;
        }
        long j10 = 10;
        long j11 = 0;
        long j12 = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), i10);
            if (iDigit < 0) {
                return null;
            }
            int i12 = length;
            long j13 = j11 ^ Long.MIN_VALUE;
            int i13 = i;
            if (Long.compare(j13, j12 ^ Long.MIN_VALUE) <= 0) {
                j4 = j10;
            } else {
                if (j12 != 512409557603043100L) {
                    return null;
                }
                if (j10 >= 0) {
                    long j14 = (Long.MAX_VALUE / j10) << i11;
                    j4 = j10;
                    j12 = j14 + ((((-1) - (j14 * j10)) ^ Long.MIN_VALUE) >= (j10 ^ Long.MIN_VALUE) ? i11 : 0);
                } else if (Long.MAX_VALUE < (j10 ^ Long.MIN_VALUE)) {
                    j4 = j10;
                    j12 = 0;
                } else {
                    j12 = 1;
                    j4 = j10;
                }
                if (Long.compare(j13, j12 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j15 = j11 * j4;
            long j16 = (iDigit & 4294967295L) + j15;
            if (Long.compare(j16 ^ Long.MIN_VALUE, j15 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i = i13 + 1;
            j11 = j16;
            length = i12;
            j10 = j4;
            i10 = 10;
            i11 = 1;
        }
        return new b9.v(j11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(java.util.List r6, X0.j r7, h9.c r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof X0.f
            if (r0 == 0) goto L13
            r0 = r8
            X0.f r0 = (X0.f) r0
            int r1 = r0.f13433o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13433o = r1
            goto L18
        L13:
            X0.f r0 = new X0.f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f13432n
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f13433o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.f13431m
            java.io.Serializable r7 = r0.f13430l
            kotlin.jvm.internal.w r7 = (kotlin.jvm.internal.w) r7
            b9.n.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L67
        L30:
            r8 = move-exception
            goto L80
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f13430l
            java.util.List r6 = (java.util.List) r6
            b9.n.b(r8)
            goto L5c
        L42:
            b9.n.b(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            X0.g r2 = new X0.g
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f13430l = r8
            r0.f13433o = r4
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L5b
            goto L95
        L5b:
            r6 = r8
        L5c:
            kotlin.jvm.internal.w r7 = new kotlin.jvm.internal.w
            r7.<init>()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L67:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8d
            java.lang.Object r8 = r6.next()
            p9.l r8 = (p9.l) r8
            r0.f13430l = r7     // Catch: java.lang.Throwable -> L30
            r0.f13431m = r6     // Catch: java.lang.Throwable -> L30
            r0.f13433o = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L67
            goto L95
        L80:
            T r2 = r7.f43660b
            if (r2 != 0) goto L87
            r7.f43660b = r8
            goto L67
        L87:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            b9.x.a(r2, r8)
            goto L67
        L8d:
            T r6 = r7.f43660b
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L96
            b9.A r1 = b9.C1992A.f18074a
        L95:
            return r1
        L96:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.B.b(java.util.List, X0.j, h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final M9.b c(w9.InterfaceC5748c r16, M9.b... r17) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.B.c(w9.c, M9.b[]):M9.b");
    }

    public static final z d(Context context, androidx.work.b configuration) throws Resources.NotFoundException {
        k.a aVarA;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(configuration, "configuration");
        e2.c cVar = new e2.c(configuration.f16866b);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "context.applicationContext");
        c2.s sVar = cVar.f37700a;
        kotlin.jvm.internal.l.e(sVar, "workTaskExecutor.serialTaskExecutor");
        boolean z10 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        B7.d clock = configuration.f16867c;
        kotlin.jvm.internal.l.f(clock, "clock");
        if (z10) {
            aVarA = new k.a(applicationContext, WorkDatabase.class, null);
            aVarA.i = true;
        } else {
            aVarA = w1.h.a(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            aVarA.f47249h = new t(applicationContext);
        }
        aVarA.f47247f = sVar;
        aVarA.f47245d.add(new C1590b(clock));
        aVarA.a(C1596h.f12179d);
        aVarA.a(new m(applicationContext, 2, 3));
        aVarA.a(C1597i.f12181c);
        aVarA.a(C1592d.f12168e);
        aVarA.a(new m(applicationContext, 5, 6));
        aVarA.a(C1593e.f12171e);
        aVarA.a(C1594f.f12174e);
        aVarA.a(C1595g.f12177e);
        aVarA.a(new C(applicationContext));
        aVarA.a(new m(applicationContext, 10, 11));
        aVarA.a(C1592d.f12167d);
        aVarA.a(C1593e.f12170d);
        aVarA.a(C1594f.f12173d);
        aVarA.a(C1595g.f12176d);
        aVarA.f47256p = false;
        aVarA.f47257q = true;
        WorkDatabase workDatabase = (WorkDatabase) aVarA.b();
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext2, "context.applicationContext");
        G5.c cVar2 = new G5.c(applicationContext2, cVar);
        l lVar = new l(context.getApplicationContext(), configuration, cVar, workDatabase);
        A schedulersCreator = A.f12118b;
        kotlin.jvm.internal.l.f(schedulersCreator, "schedulersCreator");
        String str = q.f12209a;
        W1.b bVar = new W1.b(context, workDatabase, configuration);
        c2.o.a(context, SystemJobService.class, true);
        androidx.work.m.e().a(q.f12209a, "Created SystemJobScheduler and enabled SystemJobService");
        return new z(context.getApplicationContext(), configuration, cVar, workDatabase, C2092m.W(bVar, new U1.c(context, configuration, cVar2, lVar, new y(lVar, cVar), cVar)), lVar, cVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cb, code lost:
    
        if (r7 == 16) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cd, code lost:
    
        if (r8 != (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d1, code lost:
    
        r0 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.InetAddress e(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.B.e(int, int, java.lang.String):java.net.InetAddress");
    }

    public static View f(int i, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View viewFindViewById = viewGroup.getChildAt(i10).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static final C0672i g(C0672i c0672i, Z div, C5865d path) {
        A7.d dVar;
        C5426c c5426cA;
        kotlin.jvm.internal.l.f(c0672i, "<this>");
        kotlin.jvm.internal.l.f(div, "div");
        kotlin.jvm.internal.l.f(path, "path");
        if (!k(div)) {
            return c0672i;
        }
        p6.h hVar = c0672i.f2148c;
        if (hVar == null || (c5426cA = p6.h.a(hVar, path.b(), div, c0672i.f2147b, null, 8)) == null || (dVar = c5426cA.f44857a) == null) {
            dVar = c0672i.f2147b;
        }
        return c0672i.a(dVar);
    }

    public static final List h(D7.f fVar) {
        kotlin.jvm.internal.l.f(fVar, "<this>");
        return fVar instanceof D7.d ? ((D7.d) fVar).f1077c : fVar instanceof D7.g ? h(((D7.g) fVar).d()) : C2099t.f18581b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int j(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "<this>");
        if (activity instanceof InterfaceC0696k) {
            return ((InterfaceC0696k) activity).a();
        }
        return -1;
    }

    public static final boolean k(Z z10) {
        List<Vb> listR;
        List<C1210i5> listU;
        kotlin.jvm.internal.l.f(z10, "<this>");
        S2 s2D = z10.d();
        List<AbstractC1142dc> listH = s2D.h();
        return !((listH == null || listH.isEmpty()) && ((listR = s2D.r()) == null || listR.isEmpty()) && ((listU = s2D.u()) == null || listU.isEmpty()));
    }

    public static final C0583j l(InterfaceC4347e interfaceC4347e) {
        C0583j c0583j;
        C0583j c0583j2;
        if (!(interfaceC4347e instanceof F9.i)) {
            return new C0583j(1, interfaceC4347e);
        }
        F9.i iVar = (F9.i) interfaceC4347e;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F9.i.i;
            Object obj = atomicReferenceFieldUpdater.get(iVar);
            F9.y yVar = C0658a.f1746c;
            c0583j = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(iVar, yVar);
                c0583j2 = null;
                break;
            }
            if (obj instanceof C0583j) {
                while (!atomicReferenceFieldUpdater.compareAndSet(iVar, obj, yVar)) {
                    if (atomicReferenceFieldUpdater.get(iVar) != obj) {
                        break;
                    }
                }
                c0583j2 = (C0583j) obj;
                break loop0;
            }
            if (obj != yVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0583j2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0583j.f251h;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0583j2);
            if (!(obj2 instanceof C0600s) || ((C0600s) obj2).f269d == null) {
                C0583j.f250g.set(c0583j2, 536870911);
                atomicReferenceFieldUpdater2.set(c0583j2, C0567b.f224b);
                c0583j = c0583j2;
            } else {
                c0583j2.n();
            }
            if (c0583j != null) {
                return c0583j;
            }
        }
        return new C0583j(2, interfaceC4347e);
    }

    public static final Typeface m(B0.f fVar, String str, EnumC1195h5 enumC1195h5, Long l5) {
        Integer numValueOf;
        u6.a aVar;
        kotlin.jvm.internal.l.f(fVar, "<this>");
        if (l5 != null) {
            long jLongValue = l5.longValue();
            long j4 = jLongValue >> 31;
            numValueOf = Integer.valueOf((j4 == 0 || j4 == -1) ? (int) jLongValue : jLongValue > 0 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION);
        } else {
            numValueOf = null;
        }
        u6.a aVar2 = (u6.a) fVar.f358d;
        if (str != null && (aVar = (u6.a) ((HashMap) fVar.f357c).get(str)) != null) {
            aVar2 = aVar;
        }
        return C0713c.O(C0713c.P(enumC1195h5, numValueOf), aVar2);
    }

    public static boolean p(Uri uri) {
        return uri != null && AppLovinEventTypes.USER_VIEWED_CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static final kotlin.jvm.internal.b q(Object[] array) {
        kotlin.jvm.internal.l.f(array, "array");
        return new kotlin.jvm.internal.b(array);
    }

    public static String r(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final void s(R9.A a10, String str, Boolean bool) {
        kotlin.jvm.internal.l.f(a10, "<this>");
        M m10 = R9.j.f11806a;
        a10.b(bool == null ? R9.x.INSTANCE : new R9.u(bool, false, null), str);
    }

    public static final void t(R9.A a10, String str, Number number) {
        kotlin.jvm.internal.l.f(a10, "<this>");
        a10.b(R9.j.a(number), str);
    }

    public static final void u(R9.A a10, String key, String str) {
        kotlin.jvm.internal.l.f(key, "key");
        a10.b(R9.j.b(str), key);
    }

    public static final void v(R9.A a10, String key, p9.l lVar) {
        kotlin.jvm.internal.l.f(a10, "<this>");
        kotlin.jvm.internal.l.f(key, "key");
        R9.A a11 = new R9.A();
        lVar.invoke(a11);
        a10.b(a11.a(), key);
    }

    public static final D7.f w(D7.f fVar) {
        kotlin.jvm.internal.l.f(fVar, "<this>");
        return fVar instanceof D7.e ? fVar : new D7.e(fVar);
    }

    public void i(l4.l lVar, float f10, float f11) {
        throw null;
    }

    @Override // com.google.gson.internal.g
    public Object n() {
        return new LinkedHashMap();
    }

    public void o(int i) {
        throw null;
    }

    public void y(boolean z10) {
        throw null;
    }

    public void z() {
        throw null;
    }

    @Override // a3.f
    public void a(ActivityC1762o activityC1762o) {
    }

    public void x(boolean z10) {
    }
}
