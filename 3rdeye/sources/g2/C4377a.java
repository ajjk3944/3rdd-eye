package g2;

import d2.C4268c;
import java.util.concurrent.Executor;
import r.InterfaceC5503a;

/* compiled from: RemoteClientUtils.java */
/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4377a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0458a f37942a = new C0458a();

    /* compiled from: RemoteClientUtils.java */
    /* renamed from: g2.a$a, reason: collision with other inner class name */
    public class C0458a implements InterfaceC5503a<byte[], Void> {
        @Override // r.InterfaceC5503a
        public final /* bridge */ /* synthetic */ Void apply(byte[] bArr) {
            return null;
        }
    }

    public static C4268c a(C4268c c4268c, InterfaceC5503a interfaceC5503a, Executor executor) {
        C4268c c4268c2 = new C4268c();
        c4268c.addListener(new RunnableC4378b(c4268c, interfaceC5503a, c4268c2), executor);
        return c4268c2;
    }
}
