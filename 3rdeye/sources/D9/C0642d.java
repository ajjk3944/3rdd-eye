package D9;

import b9.C1992A;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;

/* compiled from: Builders.kt */
/* renamed from: D9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0642d<T> extends E9.g<T> {

    /* renamed from: e, reason: collision with root package name */
    public final h9.i f1184e;

    /* JADX WARN: Multi-variable type inference failed */
    public C0642d(p9.p<? super C9.u<? super T>, ? super InterfaceC4347e<? super C1992A>, ? extends Object> pVar, InterfaceC4350h interfaceC4350h, int i, C9.a aVar) {
        super(interfaceC4350h, i, aVar);
        this.f1184e = (h9.i) pVar;
    }

    @Override // E9.g
    public final String toString() {
        return "block[" + this.f1184e + "] -> " + super.toString();
    }
}
