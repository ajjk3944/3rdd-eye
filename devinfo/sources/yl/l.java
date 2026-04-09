package yl;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f37714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f37715c;

    public /* synthetic */ l(q qVar, int i4, Object obj, int i10) {
        this.f37713a = i10;
        this.f37714b = qVar;
        this.f37715c = i4;
    }

    private final Object c() {
        q qVar = this.f37714b;
        int i4 = this.f37715c;
        qVar.f37731k.getClass();
        try {
            qVar.f37743w.w(i4, b.CANCEL);
            synchronized (qVar) {
                qVar.f37745y.remove(Integer.valueOf(i4));
            }
        } catch (IOException unused) {
        }
        return yj.u.f37649a;
    }

    private final Object d() {
        q qVar = this.f37714b;
        int i4 = this.f37715c;
        qVar.f37731k.getClass();
        synchronized (qVar) {
            qVar.f37745y.remove(Integer.valueOf(i4));
        }
        return yj.u.f37649a;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f37713a) {
            case 0:
                return c();
            case 1:
                return d();
            default:
                q qVar = this.f37714b;
                int i4 = this.f37715c;
                qVar.f37731k.getClass();
                try {
                    qVar.f37743w.w(i4, b.CANCEL);
                    synchronized (qVar) {
                        qVar.f37745y.remove(Integer.valueOf(i4));
                    }
                } catch (IOException unused) {
                }
                return yj.u.f37649a;
        }
    }

    public /* synthetic */ l(q qVar, int i4, List list, boolean z3) {
        this.f37713a = 2;
        this.f37714b = qVar;
        this.f37715c = i4;
    }
}
