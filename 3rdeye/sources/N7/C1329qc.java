package N7;

import D7.a;
import N7.C1259lc;
import N7.C1315pc;
import android.net.Uri;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivVideoSourceTemplate.kt */
/* renamed from: N7.qc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1329qc implements InterfaceC5868a, z7.b<C1259lc> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Long>> f9003a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<A7.b<String>> f9004b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5371a<a> f9005c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Uri>> f9006d;

    /* compiled from: DivVideoSourceTemplate.kt */
    /* renamed from: N7.qc$a */
    public static final class a implements InterfaceC5868a, z7.b<C1259lc.a> {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC5371a<A7.b<Long>> f9007a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC5371a<A7.b<Long>> f9008b;

        public a(AbstractC5371a<A7.b<Long>> abstractC5371a, AbstractC5371a<A7.b<Long>> abstractC5371a2) {
            this.f9007a = abstractC5371a;
            this.f9008b = abstractC5371a2;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            C1315pc.b bVar = (C1315pc.b) D7.a.f1071b.f6785i9.getValue();
            a.C0011a c0011a = D7.a.f1070a;
            bVar.getClass();
            return C1315pc.b.d(c0011a, this);
        }
    }

    public C1329qc(AbstractC5371a<A7.b<Long>> abstractC5371a, AbstractC5371a<A7.b<String>> abstractC5371a2, AbstractC5371a<a> abstractC5371a3, AbstractC5371a<A7.b<Uri>> abstractC5371a4) {
        this.f9003a = abstractC5371a;
        this.f9004b = abstractC5371a2;
        this.f9005c = abstractC5371a3;
        this.f9006d = abstractC5371a4;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1287nc) D7.a.f1071b.f6750f9.getValue()).b(D7.a.f1070a, this);
    }
}
