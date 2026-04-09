package U9;

import c9.C2092m;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p9.InterfaceC5480a;

/* compiled from: CertificatePinner.kt */
/* renamed from: U9.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1611h extends kotlin.jvm.internal.m implements InterfaceC5480a<List<? extends X509Certificate>> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1610g f12647g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List<Certificate> f12648h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1611h(C1610g c1610g, List<? extends Certificate> list, String str) {
        super(0);
        this.f12647g = c1610g;
        this.f12648h = list;
        this.i = str;
    }

    @Override // p9.InterfaceC5480a
    public final List<? extends X509Certificate> invoke() throws SSLPeerUnverifiedException {
        ga.c cVar = this.f12647g.f12646b;
        List<Certificate> listA = this.f12648h;
        if (cVar != null) {
            listA = cVar.a(this.i, listA);
        }
        List<Certificate> list = listA;
        ArrayList arrayList = new ArrayList(C2092m.T(list, 10));
        for (Certificate certificate : list) {
            kotlin.jvm.internal.l.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
