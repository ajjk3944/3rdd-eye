package c5;

import a5.InterfaceC1651a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: ProtobufEncoder.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18500a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18501b;

    /* renamed from: c, reason: collision with root package name */
    public final g f18502c;

    /* compiled from: ProtobufEncoder.java */
    public static final class a implements InterfaceC1651a<a> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f18503a = new g();
    }

    public h(HashMap map, HashMap map2, g gVar) {
        this.f18500a = map;
        this.f18501b = map2;
        this.f18502c = gVar;
    }

    public final void a(Object obj, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        HashMap map = this.f18501b;
        HashMap map2 = this.f18500a;
        f fVar = new f(byteArrayOutputStream, map2, map, this.f18502c);
        if (obj == null) {
            return;
        }
        Z4.d dVar = (Z4.d) map2.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new Z4.b("No encoder for " + obj.getClass());
        }
    }
}
