package Mg;

import Lg.f;
import Lg.g;
import Lg.h;
import Lg.l;
import java.io.IOException;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public abstract class a extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    private final l f13167a;

    protected a(l lVar) {
        this.f13167a = lVar;
    }

    public f a(f fVar, Lg.c cVar, h hVar) throws IOException {
        try {
            fVar.x(cVar, hVar);
            return fVar;
        } catch (IOException unused) {
            int iE = fVar.e();
            boolean zO = fVar.o();
            int iE2 = fVar.E();
            int iF = fVar.f();
            fVar.v(iE | 512);
            fVar.w(iF);
            this.f13167a.m1(fVar);
            f fVar2 = new f(iE, zO, iE2);
            fVar2.x(cVar, hVar);
            return fVar2;
        }
    }

    public f b(f fVar, h hVar, long j10) throws IOException {
        try {
            fVar.y(hVar, j10);
            return fVar;
        } catch (IOException unused) {
            int iE = fVar.e();
            boolean zO = fVar.o();
            int iE2 = fVar.E();
            int iF = fVar.f();
            fVar.v(iE | 512);
            fVar.w(iF);
            this.f13167a.m1(fVar);
            f fVar2 = new f(iE, zO, iE2);
            fVar2.y(hVar, j10);
            return fVar2;
        }
    }

    public f c(f fVar, h hVar) throws IOException {
        try {
            fVar.z(hVar);
            return fVar;
        } catch (IOException unused) {
            int iE = fVar.e();
            boolean zO = fVar.o();
            int iE2 = fVar.E();
            int iF = fVar.f();
            fVar.v(iE | 512);
            fVar.w(iF);
            this.f13167a.m1(fVar);
            f fVar2 = new f(iE, zO, iE2);
            fVar2.z(hVar);
            return fVar2;
        }
    }

    public f d(f fVar, g gVar) throws IOException {
        try {
            fVar.A(gVar);
            return fVar;
        } catch (IOException unused) {
            int iE = fVar.e();
            boolean zO = fVar.o();
            int iE2 = fVar.E();
            int iF = fVar.f();
            fVar.v(iE | 512);
            fVar.w(iF);
            this.f13167a.m1(fVar);
            f fVar2 = new f(iE, zO, iE2);
            fVar2.A(gVar);
            return fVar2;
        }
    }

    public l e() {
        return this.f13167a;
    }

    public abstract String f();

    public String toString() {
        return f();
    }
}
