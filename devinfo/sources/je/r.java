package je;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import me.s0;
import me.t0;
import me.u0;
import me.w0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f27604f;
    public static final String g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f27605a;

    /* renamed from: b, reason: collision with root package name */
    public final x f27606b;

    /* renamed from: c, reason: collision with root package name */
    public final a f27607c;

    /* renamed from: d, reason: collision with root package name */
    public final km.n f27608d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.d f27609e;

    static {
        HashMap map = new HashMap();
        f27604f = map;
        a0.g.v(5, map, "armeabi", 6, "armeabi-v7a");
        a0.g.v(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.0.3";
    }

    public r(Context context, x xVar, a aVar, km.n nVar, com.google.android.gms.internal.consent_sdk.d dVar) {
        this.f27605a = context;
        this.f27606b = xVar;
        this.f27607c = aVar;
        this.f27608d = nVar;
        this.f27609e = dVar;
    }

    public static t0 c(se.b bVar, int i4) {
        String str = (String) bVar.f33557b;
        String str2 = (String) bVar.f33556a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) bVar.f33558c;
        int i10 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        se.b bVar2 = (se.b) bVar.f33559d;
        if (i4 >= 8) {
            se.b bVar3 = bVar2;
            while (bVar3 != null) {
                bVar3 = (se.b) bVar3.f33559d;
                i10++;
            }
        }
        int i11 = i10;
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        byte b10 = (byte) (0 | 1);
        t0 t0VarC = null;
        if (bVar2 != null && i11 == 0) {
            t0VarC = c(bVar2, i4 + 1);
        }
        if (b10 == 1) {
            return new t0(str, str2, listD, t0VarC, i11);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" overflowCount");
        }
        throw new IllegalStateException(d.h.v(sb2, "Missing required properties:"));
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i4) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            w0 w0Var = new w0();
            w0Var.f29340e = i4;
            w0Var.f29341f = (byte) (w0Var.f29341f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            w0Var.f29336a = jMax;
            byte b10 = (byte) (w0Var.f29341f | 1);
            w0Var.f29341f = b10;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            w0Var.f29337b = str;
            w0Var.f29338c = fileName;
            w0Var.f29339d = lineNumber;
            w0Var.f29341f = (byte) (b10 | 2);
            arrayList.add(w0Var.a());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static u0 e() {
        byte b10 = (byte) 1;
        if (b10 == 1) {
            return new u0("0", "0", 0L);
        }
        StringBuilder sb2 = new StringBuilder();
        if (b10 == 0) {
            sb2.append(" address");
        }
        throw new IllegalStateException(d.h.v(sb2, "Missing required properties:"));
    }

    public final List a() {
        byte b10 = (byte) (((byte) (0 | 1)) | 2);
        a aVar = this.f27607c;
        String str = aVar.f27532e;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        String str2 = aVar.f27529b;
        if (b10 == 3) {
            return Collections.singletonList(new s0(0L, 0L, str, str2));
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" baseAddress");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" size");
        }
        throw new IllegalStateException(d.h.v(sb2, "Missing required properties:"));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final me.b1 b(int r17) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: je.r.b(int):me.b1");
    }
}
