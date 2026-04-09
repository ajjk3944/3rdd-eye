package O4;

import N7.G8;
import Q4.S;
import Q4.f0;
import Q9.C1553s;
import android.content.Context;
import io.appmetrica.analytics.impl.Oo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: CrashlyticsReportDataCapture.java */
/* loaded from: classes2.dex */
public final class G {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f10249f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f10250g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10251a;

    /* renamed from: b, reason: collision with root package name */
    public final P f10252b;

    /* renamed from: c, reason: collision with root package name */
    public final C1455a f10253c;

    /* renamed from: d, reason: collision with root package name */
    public final C1553s f10254d;

    /* renamed from: e, reason: collision with root package name */
    public final V4.e f10255e;

    static {
        HashMap map = new HashMap();
        f10249f = map;
        Oo.i(5, map, "armeabi", 6, "armeabi-v7a");
        Oo.i(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f10250g = "Crashlytics Android SDK/19.0.3";
    }

    public G(Context context, P p10, C1455a c1455a, C1553s c1553s, V4.e eVar) {
        this.f10251a = context;
        this.f10252b = p10;
        this.f10253c = c1455a;
        this.f10254d = c1553s;
        this.f10255e = eVar;
    }

    public static Q4.O c(E3.m mVar, int i) {
        String str = (String) mVar.f1417c;
        int i10 = 0;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) mVar.f1418d;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        E3.m mVar2 = (E3.m) mVar.f1419e;
        if (i >= 8) {
            for (E3.m mVar3 = mVar2; mVar3 != null; mVar3 = (E3.m) mVar3.f1419e) {
                i10++;
            }
        }
        int i11 = i10;
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        byte b10 = (byte) (0 | 1);
        Q4.O oC = null;
        if (mVar2 != null && i11 == 0) {
            oC = c(mVar2, i + 1);
        }
        if (b10 == 1) {
            return new Q4.O(str, (String) mVar.f1416b, listD, oC, i11);
        }
        StringBuilder sb = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb.append(" overflowCount");
        }
        throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            S.a aVar = new S.a();
            aVar.f11101e = i;
            aVar.f11102f = (byte) (aVar.f11102f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            aVar.f11097a = jMax;
            byte b10 = (byte) (aVar.f11102f | 1);
            aVar.f11102f = b10;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            aVar.f11098b = str;
            aVar.f11099c = fileName;
            aVar.f11100d = lineNumber;
            aVar.f11102f = (byte) (b10 | 2);
            arrayList.add(aVar.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Q4.P e() {
        byte b10 = (byte) 1;
        if (b10 == 1) {
            return new Q4.P(CommonUrlParts.Values.FALSE_INTEGER, CommonUrlParts.Values.FALSE_INTEGER, 0L);
        }
        StringBuilder sb = new StringBuilder();
        if (b10 == 0) {
            sb.append(" address");
        }
        throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
    }

    public final List<f0.e.d.a.b.AbstractC0138a> a() {
        byte b10 = (byte) (((byte) (0 | 1)) | 2);
        C1455a c1455a = this.f10253c;
        String str = c1455a.f10294e;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        if (b10 == 3) {
            return Collections.singletonList(new Q4.N(0L, str, c1455a.f10291b, 0L));
        }
        StringBuilder sb = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b10 & 2) == 0) {
            sb.append(" size");
        }
        throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Q4.U b(int r17) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.G.b(int):Q4.U");
    }
}
