package N7;

import D7.a;
import N7.C1315pc;
import android.net.Uri;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivVideoSource.kt */
/* renamed from: N7.lc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1259lc implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Long> f8738a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<String> f8739b;

    /* renamed from: c, reason: collision with root package name */
    public final a f8740c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<Uri> f8741d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f8742e;

    /* compiled from: DivVideoSource.kt */
    /* renamed from: N7.lc$a */
    public static final class a implements InterfaceC5868a {

        /* renamed from: a, reason: collision with root package name */
        public final A7.b<Long> f8743a;

        /* renamed from: b, reason: collision with root package name */
        public final A7.b<Long> f8744b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f8745c;

        public a(A7.b<Long> bVar, A7.b<Long> bVar2) {
            this.f8743a = bVar;
            this.f8744b = bVar2;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            C1315pc.a aVar = (C1315pc.a) D7.a.f1071b.f6774h9.getValue();
            a.C0011a c0011a = D7.a.f1070a;
            aVar.getClass();
            return C1315pc.a.d(c0011a, this);
        }
    }

    public C1259lc(A7.b<Long> bVar, A7.b<String> bVar2, a aVar, A7.b<Uri> bVar3) {
        this.f8738a = bVar;
        this.f8739b = bVar2;
        this.f8740c = aVar;
        this.f8741d = bVar3;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1273mc) D7.a.f1071b.f6738e9.getValue()).b(D7.a.f1070a, this);
    }
}
