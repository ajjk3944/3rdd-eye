package androidx.work.multiprocess;

import T1.C1598j;
import T1.s;
import T1.z;
import androidx.work.multiprocess.b;
import androidx.work.multiprocess.d;
import androidx.work.q;
import c2.C2053c;
import c2.C2054d;
import h2.C4407a;
import h2.j;
import java.util.ArrayList;

/* compiled from: RemoteWorkManagerImpl.java */
/* loaded from: classes.dex */
public final class i extends b.a {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f17015d = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public final z f17016c;

    /* compiled from: RemoteWorkManagerImpl.java */
    public class a extends d<q.a.c> {
        @Override // androidx.work.multiprocess.d
        public final byte[] b(q.a.c cVar) {
            return i.f17015d;
        }
    }

    /* compiled from: RemoteWorkManagerImpl.java */
    public class b extends d<q.a.c> {
        @Override // androidx.work.multiprocess.d
        public final byte[] b(q.a.c cVar) {
            return i.f17015d;
        }
    }

    /* compiled from: RemoteWorkManagerImpl.java */
    public class c extends d<q.a.c> {
        @Override // androidx.work.multiprocess.d
        public final byte[] b(q.a.c cVar) {
            return i.f17015d;
        }
    }

    public i(RemoteWorkManagerService remoteWorkManagerService) {
        attachInterface(this, androidx.work.multiprocess.b.f16982h8);
        this.f17016c = z.c(remoteWorkManagerService);
    }

    @Override // androidx.work.multiprocess.b
    public final void a(String str, androidx.work.multiprocess.c cVar) {
        z zVar = this.f17016c;
        try {
            zVar.getClass();
            C2054d c2054d = new C2054d(zVar, str, true);
            zVar.f12233d.d(c2054d);
            new c(zVar.f12233d.c(), cVar, c2054d.f18416b.f12183d).a();
        } catch (Throwable th) {
            d.a.a(cVar, th);
        }
    }

    @Override // androidx.work.multiprocess.b
    public final void o(String str, androidx.work.multiprocess.c cVar) {
        z zVar = this.f17016c;
        try {
            zVar.getClass();
            C2053c c2053c = new C2053c(zVar, str);
            zVar.f12233d.d(c2053c);
            new b(zVar.f12233d.c(), cVar, c2053c.f18416b.f12183d).a();
        } catch (Throwable th) {
            d.a.a(cVar, th);
        }
    }

    @Override // androidx.work.multiprocess.b
    public final void u(byte[] bArr, androidx.work.multiprocess.c cVar) {
        try {
            j jVar = (j) C4407a.b(bArr, j.CREATOR);
            z zVar = this.f17016c;
            j.b bVar = jVar.f38173b;
            bVar.getClass();
            ArrayList arrayListA = j.b.a(zVar, bVar.f38177d);
            new a(this.f17016c.f12233d.c(), cVar, ((C1598j) new s(zVar, bVar.f38174a, bVar.f38175b, bVar.f38176c, arrayListA).i0()).f12183d).a();
        } catch (Throwable th) {
            d.a.a(cVar, th);
        }
    }
}
