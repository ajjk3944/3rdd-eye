package j6;

import N7.R3;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.M0;
import androidx.camera.core.impl.N0;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import j6.q;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import o5.C5423b;
import v.C5670z;

/* compiled from: DivCustomContainerViewAdapter.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements q.a, w, l7.l, v3.g, C5670z.f.a, I4.d {
    public static void c(R3 div, q.a callBack) {
        kotlin.jvm.internal.l.f(div, "div");
        kotlin.jvm.internal.l.f(callBack, "callBack");
    }

    public static StringBuilder d(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void f(N0.b bVar, N0.a aVar, M0 m02, N0.b bVar2, N0.a aVar2) {
        m02.a(N0.a(bVar, aVar));
        m02.a(N0.a(bVar2, aVar2));
    }

    @Override // v.C5670z.f.a
    public boolean a(TotalCaptureResult totalCaptureResult) {
        return C5670z.b(totalCaptureResult, false);
    }

    @Override // v3.g
    public Object apply(Object obj) {
        C5423b c5423b = (C5423b) obj;
        c5423b.getClass();
        c5.h hVar = n5.p.f44369a;
        hVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            hVar.a(c5423b, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // l7.l
    public boolean e(Object obj) {
        return true;
    }

    @Override // I4.d
    public Object g(I4.t tVar) {
        return FirebaseSessionsRegistrar.getComponents$lambda$2(tVar);
    }

    @Override // j6.q.a
    public void b(boolean z10) {
    }
}
