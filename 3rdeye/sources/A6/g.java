package A6;

import I6.t;
import a9.InterfaceC1676a;
import android.content.Context;
import b9.C1992A;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;
import y9.q;

/* compiled from: Ticker.kt */
/* loaded from: classes.dex */
public final class g extends m implements InterfaceC5480a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f64g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f65h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, int i) {
        super(0);
        this.f64g = i;
        this.f65h = obj;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        switch (this.f64g) {
            case 0:
                ((e) this.f65h).c();
                return C1992A.f18074a;
            case 1:
                F6.d dVar = (F6.d) this.f65h;
                Context context = dVar.f1669a.getContext();
                kotlin.jvm.internal.l.e(context, "view.context");
                return new F6.b(context, dVar.f1670b);
            case 2:
                Object obj = ((InterfaceC1676a) this.f65h).get();
                kotlin.jvm.internal.l.e(obj, "parsingHistogramReporter.get()");
                return (e7.f) obj;
            case 3:
                E7.b bVar = (E7.b) this.f65h;
                return new B7.d((K7.a) bVar.f1475b, (z7.c) bVar.f1476c);
            case 4:
                try {
                    return MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException e4) {
                    ((K7.a) this.f65h).f3751a.d(new IllegalStateException("Storage cannot work with templates!", e4));
                    return null;
                }
            default:
                File file = (File) ((t) this.f65h).invoke();
                String name = file.getName();
                kotlin.jvm.internal.l.e(name, "getName(...)");
                if (q.u0(name, "").equals("preferences_pb")) {
                    return file;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }
}
