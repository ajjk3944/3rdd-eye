package hf;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import lf.s0;
import lf.t0;
import lf.u0;
import lf.w0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f10705f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f10706g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10707a;

    /* renamed from: b, reason: collision with root package name */
    public final x f10708b;

    /* renamed from: c, reason: collision with root package name */
    public final a8.f f10709c;

    /* renamed from: d, reason: collision with root package name */
    public final om.f f10710d;

    /* renamed from: e, reason: collision with root package name */
    public final al.b f10711e;

    static {
        HashMap map = new HashMap();
        f10705f = map;
        c7.a.w(5, map, "armeabi", 6, "armeabi-v7a");
        c7.a.w(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f10706g = "Crashlytics Android SDK/20.0.3";
    }

    public r(Context context, x xVar, a8.f fVar, om.f fVar2, al.b bVar) {
        this.f10707a = context;
        this.f10708b = xVar;
        this.f10709c = fVar;
        this.f10710d = fVar2;
        this.f10711e = bVar;
    }

    public static t0 c(js.e eVar, int i10) {
        String str = (String) eVar.f13799r;
        String str2 = (String) eVar.f13798g;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) eVar.f13800x;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        js.e eVar2 = (js.e) eVar.f13797d;
        if (i10 >= 8) {
            js.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = (js.e) eVar3.f13797d;
                i11++;
            }
        }
        int i12 = i11;
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        byte b2 = (byte) (0 | 1);
        t0 t0VarC = null;
        if (eVar2 != null && i12 == 0) {
            t0VarC = c(eVar2, i10 + 1);
        }
        if (b2 == 1) {
            return new t0(str, str2, listD, t0VarC, i12);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b2 & 1) == 0) {
            sb2.append(" overflowCount");
        }
        throw new IllegalStateException(h0.b.p("Missing required properties:", sb2));
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            w0 w0Var = new w0();
            w0Var.f15461e = i10;
            w0Var.f15462f = (byte) (w0Var.f15462f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            w0Var.f15457a = jMax;
            byte b2 = (byte) (w0Var.f15462f | 1);
            w0Var.f15462f = b2;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            w0Var.f15458b = str;
            w0Var.f15459c = fileName;
            w0Var.f15460d = lineNumber;
            w0Var.f15462f = (byte) (b2 | 2);
            arrayList.add(w0Var.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static u0 e() {
        byte b2 = (byte) 1;
        if (b2 == 1) {
            return new u0(0L, "0", "0");
        }
        StringBuilder sb2 = new StringBuilder();
        if (b2 == 0) {
            sb2.append(" address");
        }
        throw new IllegalStateException(h0.b.p("Missing required properties:", sb2));
    }

    public final List a() {
        byte b2 = (byte) (((byte) (0 | 1)) | 2);
        a8.f fVar = this.f10709c;
        String str = (String) fVar.f199e;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        String str2 = (String) fVar.f196b;
        if (b2 == 3) {
            return Collections.singletonList(new s0(0L, 0L, str, str2));
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b2 & 1) == 0) {
            sb2.append(" baseAddress");
        }
        if ((b2 & 2) == 0) {
            sb2.append(" size");
        }
        throw new IllegalStateException(h0.b.p("Missing required properties:", sb2));
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
    public final lf.b1 b(int r17) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.r.b(int):lf.b1");
    }
}
