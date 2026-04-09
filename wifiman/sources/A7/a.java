package A7;

import A7.d;
import Zg.AbstractC3682n;
import com.ubnt.discovery.server.lan.processing.parser.UnknownFieldException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import s7.C7916c;
import s7.C7920g;
import s7.InterfaceC7921h;
import x7.AbstractC8424a;
import y7.AbstractC8624d;

/* loaded from: classes3.dex */
public abstract class a implements d {

    /* renamed from: A7.a$a, reason: collision with other inner class name */
    static final class C0008a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0008a f356a = new C0008a();

        C0008a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to parse field";
        }
    }

    @Override // A7.d
    public final C7920g a(InetAddress address, byte[] data) {
        AbstractC6492s.i(address, "address");
        AbstractC6492s.i(data, "data");
        if (data.length <= d()) {
            return null;
        }
        c cVarH = h(data, 0, d());
        if (!cVarH.c() || cVarH.a() <= 0) {
            return null;
        }
        int iD = d() + cVarH.a();
        int iD2 = d();
        ArrayList arrayList = new ArrayList();
        while (iD2 < iD) {
            int iC = c() + iD2;
            b bVarG = g(data, iD2, iC);
            try {
                arrayList.add(f(cVarH, bVarG, AbstractC3682n.r(data, iC, bVarG.a() + iC)));
            } catch (UnknownFieldException unused) {
            } catch (Throwable th2) {
                AbstractC8424a.d(C0008a.f356a, th2);
            }
            iD2 += c() + bVarG.a();
        }
        return new C7920g(e(arrayList), AbstractC8624d.f66379a.a(address), arrayList);
    }

    @Override // A7.d
    public C7920g b(DatagramPacket datagramPacket) {
        return d.a.a(this, datagramPacket);
    }

    public abstract int c();

    public abstract int d();

    public abstract C7916c e(List list);

    public abstract InterfaceC7921h f(c cVar, b bVar, byte[] bArr);

    public abstract b g(byte[] bArr, int i10, int i11);

    public abstract c h(byte[] bArr, int i10, int i11);
}
