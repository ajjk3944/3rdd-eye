package d5;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.exoplayer2.b1;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y0 implements f0, qb.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7105a;

    /* renamed from: d, reason: collision with root package name */
    public long f7106d;

    /* renamed from: g, reason: collision with root package name */
    public long f7107g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7108r;

    /* renamed from: x, reason: collision with root package name */
    public Object f7109x;

    /* renamed from: y, reason: collision with root package name */
    public Object f7110y;

    public y0(zc.r0 r0Var, String str, long j) {
        this.f7105a = 4;
        Objects.requireNonNull(r0Var);
        this.f7110y = r0Var;
        cc.s.e(str);
        this.f7109x = str;
        this.f7106d = j;
    }

    @Override // d5.f0
    public long a() {
        switch (this.f7105a) {
            case 0:
                long j = this.f7106d;
                if (!this.f7108r) {
                    return j;
                }
                ((a5.x) ((a5.b) this.f7109x)).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f7107g;
                return j + (((androidx.media3.common.n0) this.f7110y).f1725a == 1.0f ? a5.d0.G(jElapsedRealtime) : jElapsedRealtime * r4.f1727g);
            default:
                long j7 = this.f7106d;
                if (!this.f7108r) {
                    return j7;
                }
                ((et.d) ((qb.a) this.f7109x)).getClass();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - this.f7107g;
                return j7 + (((b1) this.f7110y).f4070a == 1.0f ? com.google.android.exoplayer2.h.c(jElapsedRealtime2) : jElapsedRealtime2 * r4.f4072c);
        }
    }

    @Override // qb.l
    public void b(b1 b1Var) {
        if (this.f7108r) {
            c(a());
        }
        this.f7110y = b1Var;
    }

    public void c(long j) {
        switch (this.f7105a) {
            case 0:
                this.f7106d = j;
                if (this.f7108r) {
                    ((a5.x) ((a5.b) this.f7109x)).getClass();
                    this.f7107g = SystemClock.elapsedRealtime();
                    break;
                }
                break;
            default:
                this.f7106d = j;
                if (this.f7108r) {
                    ((et.d) ((qb.a) this.f7109x)).getClass();
                    this.f7107g = SystemClock.elapsedRealtime();
                    break;
                }
                break;
        }
    }

    public void d() {
        switch (this.f7105a) {
            case 0:
                if (!this.f7108r) {
                    ((a5.x) ((a5.b) this.f7109x)).getClass();
                    this.f7107g = SystemClock.elapsedRealtime();
                    this.f7108r = true;
                    break;
                }
                break;
            default:
                if (!this.f7108r) {
                    ((et.d) ((qb.a) this.f7109x)).getClass();
                    this.f7107g = SystemClock.elapsedRealtime();
                    this.f7108r = true;
                    break;
                }
                break;
        }
    }

    public long e() {
        if (!this.f7108r) {
            this.f7108r = true;
            zc.r0 r0Var = (zc.r0) this.f7110y;
            this.f7107g = r0Var.w1().getLong((String) this.f7109x, this.f7106d);
        }
        return this.f7107g;
    }

    public void f(long j) {
        SharedPreferences.Editor editorEdit = ((zc.r0) this.f7110y).w1().edit();
        editorEdit.putLong((String) this.f7109x, j);
        editorEdit.apply();
        this.f7107g = j;
    }

    @Override // qb.l
    /* renamed from: getPlaybackParameters */
    public b1 mo6getPlaybackParameters() {
        return (b1) this.f7110y;
    }

    @Override // d5.f0
    public void setPlaybackParameters(androidx.media3.common.n0 n0Var) {
        if (this.f7108r) {
            c(a());
        }
        this.f7110y = n0Var;
    }

    @Override // d5.f0
    public androidx.media3.common.n0 getPlaybackParameters() {
        return (androidx.media3.common.n0) this.f7110y;
    }

    public y0(qb.a aVar) {
        this.f7105a = 2;
        this.f7109x = aVar;
        this.f7110y = b1.f4069d;
    }

    public y0(a5.b bVar) {
        this.f7105a = 0;
        this.f7109x = bVar;
        this.f7110y = androidx.media3.common.n0.f1724r;
    }

    public y0(long j, long j7, boolean z10, File file, HashMap map) {
        this.f7105a = 1;
        this.f7106d = j;
        this.f7109x = file;
        this.f7107g = j7;
        this.f7110y = map;
        this.f7108r = z10;
    }

    public y0(int i10, long j) {
        this.f7105a = 3;
        this.f7106d = j;
        this.f7107g = j + i10;
    }
}
