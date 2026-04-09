package w0;

import android.net.Uri;
import android.view.InputEvent;
import c5.C0412i;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import j5.g;
import p5.p;
import y0.C3008b;
import z5.InterfaceC3044u;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2966b extends g implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f23933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2968d f23934f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Uri f23935g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InputEvent f23936h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2966b(C2968d c2968d, Uri uri, InputEvent inputEvent, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f23934f = c2968d;
        this.f23935g = uri;
        this.f23936h = inputEvent;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((C2966b) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new C2966b(this.f23934f, this.f23935g, this.f23936h, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        int i = this.f23933e;
        if (i == 0) {
            R2.a.H(obj);
            C3008b c3008b = this.f23934f.f23940a;
            this.f23933e = 1;
            Object objC = c3008b.c(this.f23935g, this.f23936h, this);
            EnumC2380a enumC2380a = EnumC2380a.f20635a;
            if (objC == enumC2380a) {
                return enumC2380a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R2.a.H(obj);
        }
        return C0412i.f5929a;
    }
}
