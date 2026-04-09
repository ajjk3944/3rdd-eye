package h1;

import com.google.android.gms.internal.measurement.z3;
import java.util.ArrayList;
import java.util.List;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final a f24806a;

    public f(a aVar) {
        this.f24806a = aVar;
        if (aVar.a()) {
            return;
        }
        ArrayList arrayListD = z3.d(aVar);
        int size = arrayListD.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
        for (int i4 = 0; i4 < size; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((b) arrayListD.get(i4)).f24801a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        a aVar = this.f24806a;
        if (!aVar.a()) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb2 = new StringBuilder("Composition stack when thrown:\n");
        int i4 = 0;
        if (aVar.a()) {
            ak.c cVarF = cm.g.f();
            List list = aVar.f24800a;
            k.e(list, "<this>");
            vk.d dVar = new vk.d(list);
            int size = dVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) dVar.get(i10)).getClass();
            }
            ak.c cVarD = cm.g.d(cVarF);
            k.e(cVarD, "<this>");
            vk.d dVar2 = new vk.d(cVarD);
            int size2 = dVar2.size();
            while (i4 < size2) {
                String str = (String) dVar2.get(i4);
                sb2.append("\tat ");
                sb2.append(str);
                sb2.append('\n');
                i4++;
            }
        } else {
            ArrayList arrayListD = z3.d(aVar);
            int size3 = arrayListD.size();
            while (i4 < size3) {
                b bVar = (b) arrayListD.get(i4);
                sb2.append("\tat $$compose.m$");
                sb2.append(bVar.f24801a);
                sb2.append("(SourceFile:1)\n");
                i4++;
            }
        }
        String string = sb2.toString();
        k.d(string, "toString(...)");
        return string;
    }
}
