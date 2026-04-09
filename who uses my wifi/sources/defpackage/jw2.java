package defpackage;

import android.os.Parcel;
import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jw2 extends hv1 implements b52 {
    public final /* synthetic */ Object f;
    public final /* synthetic */ String g;
    public final /* synthetic */ long h;
    public final /* synthetic */ aa3 i;
    public final /* synthetic */ pd2 j;
    public final /* synthetic */ mw2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw2(long j, Object obj, String str, pd2 pd2Var, mw2 mw2Var, aa3 aa3Var) {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        this.f = obj;
        this.g = str;
        this.h = j;
        this.i = aa3Var;
        this.j = pd2Var;
        Objects.requireNonNull(mw2Var);
        this.k = mw2Var;
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            b();
        } else {
            if (i != 3) {
                return false;
            }
            String string = parcel.readString();
            iv1.f(parcel);
            B3(string);
        }
        parcel2.writeNoException();
        return true;
    }

    public final void B3(String str) {
        synchronized (this.f) {
            mw2 mw2Var = this.k;
            String str2 = this.g;
            hg4.C.k.getClass();
            mw2Var.d(str2, (int) (SystemClock.elapsedRealtime() - this.h), str, false);
            mw2Var.l.c(str2, "error");
            mw2Var.o.s(str2, "error");
            ea3 ea3Var = mw2Var.p;
            aa3 aa3Var = this.i;
            aa3Var.m(str);
            aa3Var.b(false);
            ea3Var.b(aa3Var.n());
            this.j.a(Boolean.FALSE);
        }
    }

    public final void b() {
        synchronized (this.f) {
            mw2 mw2Var = this.k;
            String str = this.g;
            hg4.C.k.getClass();
            mw2Var.d(str, (int) (SystemClock.elapsedRealtime() - this.h), "", true);
            mw2Var.l.b(str);
            mw2Var.o.w(str);
            ea3 ea3Var = mw2Var.p;
            aa3 aa3Var = this.i;
            aa3Var.b(true);
            ea3Var.b(aa3Var.n());
            this.j.a(Boolean.TRUE);
        }
    }
}
