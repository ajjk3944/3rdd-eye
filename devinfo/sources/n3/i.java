package n3;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f29644a;

    /* renamed from: b, reason: collision with root package name */
    public final l f29645b;

    /* renamed from: c, reason: collision with root package name */
    public final k f29646c;

    /* renamed from: d, reason: collision with root package name */
    public final j f29647d;

    /* renamed from: e, reason: collision with root package name */
    public final m f29648e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f29649f;

    public i() {
        l lVar = new l();
        lVar.f29698a = 0;
        lVar.f29699b = 0;
        lVar.f29700c = 1.0f;
        lVar.f29701d = Float.NaN;
        this.f29645b = lVar;
        k kVar = new k();
        kVar.f29690a = -1;
        kVar.f29691b = 0;
        kVar.f29692c = -1;
        kVar.f29693d = Float.NaN;
        kVar.f29694e = Float.NaN;
        kVar.f29695f = Float.NaN;
        kVar.g = -1;
        kVar.f29696h = null;
        kVar.f29697i = -1;
        this.f29646c = kVar;
        j jVar = new j();
        jVar.f29651a = false;
        jVar.f29657d = -1;
        jVar.f29659e = -1;
        jVar.f29661f = -1.0f;
        jVar.g = true;
        jVar.f29664h = -1;
        jVar.f29666i = -1;
        jVar.j = -1;
        jVar.f29669k = -1;
        jVar.f29671l = -1;
        jVar.f29673m = -1;
        jVar.f29675n = -1;
        jVar.f29677o = -1;
        jVar.f29679p = -1;
        jVar.f29680q = -1;
        jVar.f29681r = -1;
        jVar.f29682s = -1;
        jVar.f29683t = -1;
        jVar.f29684u = -1;
        jVar.f29685v = -1;
        jVar.f29686w = 0.5f;
        jVar.f29687x = 0.5f;
        jVar.f29688y = null;
        jVar.f29689z = -1;
        jVar.A = 0;
        jVar.B = 0.0f;
        jVar.C = -1;
        jVar.D = -1;
        jVar.E = -1;
        jVar.F = 0;
        jVar.G = 0;
        jVar.H = 0;
        jVar.I = 0;
        jVar.J = 0;
        jVar.K = 0;
        jVar.L = 0;
        jVar.M = LinearLayoutManager.INVALID_OFFSET;
        jVar.N = LinearLayoutManager.INVALID_OFFSET;
        jVar.O = LinearLayoutManager.INVALID_OFFSET;
        jVar.P = LinearLayoutManager.INVALID_OFFSET;
        jVar.Q = LinearLayoutManager.INVALID_OFFSET;
        jVar.R = LinearLayoutManager.INVALID_OFFSET;
        jVar.S = LinearLayoutManager.INVALID_OFFSET;
        jVar.T = -1.0f;
        jVar.U = -1.0f;
        jVar.V = 0;
        jVar.W = 0;
        jVar.X = 0;
        jVar.Y = 0;
        jVar.Z = 0;
        jVar.f29652a0 = 0;
        jVar.f29654b0 = 0;
        jVar.f29656c0 = 0;
        jVar.f29658d0 = 1.0f;
        jVar.f29660e0 = 1.0f;
        jVar.f29662f0 = -1;
        jVar.f29663g0 = 0;
        jVar.f29665h0 = -1;
        jVar.f29672l0 = false;
        jVar.f29674m0 = false;
        jVar.f29676n0 = true;
        jVar.f29678o0 = 0;
        this.f29647d = jVar;
        m mVar = new m();
        mVar.f29703a = 0.0f;
        mVar.f29704b = 0.0f;
        mVar.f29705c = 0.0f;
        mVar.f29706d = 1.0f;
        mVar.f29707e = 1.0f;
        mVar.f29708f = Float.NaN;
        mVar.g = Float.NaN;
        mVar.f29709h = -1;
        mVar.f29710i = 0.0f;
        mVar.j = 0.0f;
        mVar.f29711k = 0.0f;
        mVar.f29712l = false;
        mVar.f29713m = 0.0f;
        this.f29648e = mVar;
        this.f29649f = new HashMap();
    }

    public final void a(d dVar) {
        j jVar = this.f29647d;
        dVar.f29587e = jVar.f29664h;
        dVar.f29589f = jVar.f29666i;
        dVar.g = jVar.j;
        dVar.f29592h = jVar.f29669k;
        dVar.f29594i = jVar.f29671l;
        dVar.j = jVar.f29673m;
        dVar.f29597k = jVar.f29675n;
        dVar.f29599l = jVar.f29677o;
        dVar.f29601m = jVar.f29679p;
        dVar.f29603n = jVar.f29680q;
        dVar.f29605o = jVar.f29681r;
        dVar.f29611s = jVar.f29682s;
        dVar.f29612t = jVar.f29683t;
        dVar.f29613u = jVar.f29684u;
        dVar.f29614v = jVar.f29685v;
        ((ViewGroup.MarginLayoutParams) dVar).leftMargin = jVar.F;
        ((ViewGroup.MarginLayoutParams) dVar).rightMargin = jVar.G;
        ((ViewGroup.MarginLayoutParams) dVar).topMargin = jVar.H;
        ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = jVar.I;
        dVar.A = jVar.R;
        dVar.B = jVar.Q;
        dVar.f29616x = jVar.N;
        dVar.f29618z = jVar.P;
        dVar.E = jVar.f29686w;
        dVar.F = jVar.f29687x;
        dVar.f29607p = jVar.f29689z;
        dVar.f29609q = jVar.A;
        dVar.f29610r = jVar.B;
        dVar.G = jVar.f29688y;
        dVar.T = jVar.C;
        dVar.U = jVar.D;
        dVar.I = jVar.T;
        dVar.H = jVar.U;
        dVar.K = jVar.W;
        dVar.J = jVar.V;
        dVar.W = jVar.f29672l0;
        dVar.X = jVar.f29674m0;
        dVar.L = jVar.X;
        dVar.M = jVar.Y;
        dVar.P = jVar.Z;
        dVar.Q = jVar.f29652a0;
        dVar.N = jVar.f29654b0;
        dVar.O = jVar.f29656c0;
        dVar.R = jVar.f29658d0;
        dVar.S = jVar.f29660e0;
        dVar.V = jVar.E;
        dVar.f29583c = jVar.f29661f;
        dVar.f29579a = jVar.f29657d;
        dVar.f29581b = jVar.f29659e;
        ((ViewGroup.MarginLayoutParams) dVar).width = jVar.f29653b;
        ((ViewGroup.MarginLayoutParams) dVar).height = jVar.f29655c;
        String str = jVar.f29670k0;
        if (str != null) {
            dVar.Y = str;
        }
        dVar.Z = jVar.f29678o0;
        dVar.setMarginStart(jVar.K);
        dVar.setMarginEnd(jVar.J);
        dVar.a();
    }

    public final Object clone() {
        i iVar = new i();
        j jVar = iVar.f29647d;
        jVar.getClass();
        j jVar2 = this.f29647d;
        jVar.f29651a = jVar2.f29651a;
        jVar.f29653b = jVar2.f29653b;
        jVar.f29655c = jVar2.f29655c;
        jVar.f29657d = jVar2.f29657d;
        jVar.f29659e = jVar2.f29659e;
        jVar.f29661f = jVar2.f29661f;
        jVar.g = jVar2.g;
        jVar.f29664h = jVar2.f29664h;
        jVar.f29666i = jVar2.f29666i;
        jVar.j = jVar2.j;
        jVar.f29669k = jVar2.f29669k;
        jVar.f29671l = jVar2.f29671l;
        jVar.f29673m = jVar2.f29673m;
        jVar.f29675n = jVar2.f29675n;
        jVar.f29677o = jVar2.f29677o;
        jVar.f29679p = jVar2.f29679p;
        jVar.f29680q = jVar2.f29680q;
        jVar.f29681r = jVar2.f29681r;
        jVar.f29682s = jVar2.f29682s;
        jVar.f29683t = jVar2.f29683t;
        jVar.f29684u = jVar2.f29684u;
        jVar.f29685v = jVar2.f29685v;
        jVar.f29686w = jVar2.f29686w;
        jVar.f29687x = jVar2.f29687x;
        jVar.f29688y = jVar2.f29688y;
        jVar.f29689z = jVar2.f29689z;
        jVar.A = jVar2.A;
        jVar.B = jVar2.B;
        jVar.C = jVar2.C;
        jVar.D = jVar2.D;
        jVar.E = jVar2.E;
        jVar.F = jVar2.F;
        jVar.G = jVar2.G;
        jVar.H = jVar2.H;
        jVar.I = jVar2.I;
        jVar.J = jVar2.J;
        jVar.K = jVar2.K;
        jVar.L = jVar2.L;
        jVar.M = jVar2.M;
        jVar.N = jVar2.N;
        jVar.O = jVar2.O;
        jVar.P = jVar2.P;
        jVar.Q = jVar2.Q;
        jVar.R = jVar2.R;
        jVar.S = jVar2.S;
        jVar.T = jVar2.T;
        jVar.U = jVar2.U;
        jVar.V = jVar2.V;
        jVar.W = jVar2.W;
        jVar.X = jVar2.X;
        jVar.Y = jVar2.Y;
        jVar.Z = jVar2.Z;
        jVar.f29652a0 = jVar2.f29652a0;
        jVar.f29654b0 = jVar2.f29654b0;
        jVar.f29656c0 = jVar2.f29656c0;
        jVar.f29658d0 = jVar2.f29658d0;
        jVar.f29660e0 = jVar2.f29660e0;
        jVar.f29662f0 = jVar2.f29662f0;
        jVar.f29663g0 = jVar2.f29663g0;
        jVar.f29665h0 = jVar2.f29665h0;
        jVar.f29670k0 = jVar2.f29670k0;
        int[] iArr = jVar2.f29667i0;
        if (iArr == null || jVar2.f29668j0 != null) {
            jVar.f29667i0 = null;
        } else {
            jVar.f29667i0 = Arrays.copyOf(iArr, iArr.length);
        }
        jVar.f29668j0 = jVar2.f29668j0;
        jVar.f29672l0 = jVar2.f29672l0;
        jVar.f29674m0 = jVar2.f29674m0;
        jVar.f29676n0 = jVar2.f29676n0;
        jVar.f29678o0 = jVar2.f29678o0;
        k kVar = iVar.f29646c;
        kVar.getClass();
        k kVar2 = this.f29646c;
        kVar2.getClass();
        kVar.f29690a = kVar2.f29690a;
        kVar.f29692c = kVar2.f29692c;
        kVar.f29694e = kVar2.f29694e;
        kVar.f29693d = kVar2.f29693d;
        l lVar = this.f29645b;
        int i4 = lVar.f29698a;
        l lVar2 = iVar.f29645b;
        lVar2.f29698a = i4;
        lVar2.f29700c = lVar.f29700c;
        lVar2.f29701d = lVar.f29701d;
        lVar2.f29699b = lVar.f29699b;
        m mVar = iVar.f29648e;
        mVar.getClass();
        m mVar2 = this.f29648e;
        mVar2.getClass();
        mVar.f29703a = mVar2.f29703a;
        mVar.f29704b = mVar2.f29704b;
        mVar.f29705c = mVar2.f29705c;
        mVar.f29706d = mVar2.f29706d;
        mVar.f29707e = mVar2.f29707e;
        mVar.f29708f = mVar2.f29708f;
        mVar.g = mVar2.g;
        mVar.f29709h = mVar2.f29709h;
        mVar.f29710i = mVar2.f29710i;
        mVar.j = mVar2.j;
        mVar.f29711k = mVar2.f29711k;
        mVar.f29712l = mVar2.f29712l;
        mVar.f29713m = mVar2.f29713m;
        iVar.f29644a = this.f29644a;
        return iVar;
    }
}
