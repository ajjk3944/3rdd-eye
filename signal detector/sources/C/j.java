package C;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f909a;

    /* renamed from: b, reason: collision with root package name */
    public final m f910b;

    /* renamed from: c, reason: collision with root package name */
    public final l f911c;

    /* renamed from: d, reason: collision with root package name */
    public final k f912d;

    /* renamed from: e, reason: collision with root package name */
    public final n f913e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f914f;

    public j() {
        m mVar = new m();
        mVar.f989a = 0;
        mVar.f990b = 0;
        mVar.f991c = 1.0f;
        mVar.f992d = Float.NaN;
        this.f910b = mVar;
        l lVar = new l();
        lVar.f981a = -1;
        lVar.f982b = 0;
        lVar.f983c = -1;
        lVar.f984d = Float.NaN;
        lVar.f985e = Float.NaN;
        lVar.f986f = Float.NaN;
        lVar.f987g = -1;
        lVar.f988h = null;
        lVar.i = -1;
        this.f911c = lVar;
        k kVar = new k();
        kVar.f941a = false;
        kVar.f946d = -1;
        kVar.f948e = -1;
        kVar.f950f = -1.0f;
        kVar.f952g = true;
        kVar.f954h = -1;
        kVar.i = -1;
        kVar.f957j = -1;
        kVar.f959k = -1;
        kVar.f961l = -1;
        kVar.f963m = -1;
        kVar.f965n = -1;
        kVar.f967o = -1;
        kVar.f969p = -1;
        kVar.f970q = -1;
        kVar.f971r = -1;
        kVar.f972s = -1;
        kVar.f973t = -1;
        kVar.f974u = -1;
        kVar.f975v = -1;
        kVar.f976w = 0.5f;
        kVar.f977x = 0.5f;
        kVar.f978y = null;
        kVar.f979z = -1;
        kVar.f916A = 0;
        kVar.f917B = 0.0f;
        kVar.f918C = -1;
        kVar.f919D = -1;
        kVar.f920E = -1;
        kVar.f921F = 0;
        kVar.f922G = 0;
        kVar.f923H = 0;
        kVar.f924I = 0;
        kVar.f925J = 0;
        kVar.f926K = 0;
        kVar.f927L = 0;
        kVar.M = LinearLayoutManager.INVALID_OFFSET;
        kVar.f928N = LinearLayoutManager.INVALID_OFFSET;
        kVar.f929O = LinearLayoutManager.INVALID_OFFSET;
        kVar.f930P = LinearLayoutManager.INVALID_OFFSET;
        kVar.f931Q = LinearLayoutManager.INVALID_OFFSET;
        kVar.f932R = LinearLayoutManager.INVALID_OFFSET;
        kVar.f933S = LinearLayoutManager.INVALID_OFFSET;
        kVar.f934T = -1.0f;
        kVar.f935U = -1.0f;
        kVar.f936V = 0;
        kVar.f937W = 0;
        kVar.f938X = 0;
        kVar.f939Y = 0;
        kVar.f940Z = 0;
        kVar.f942a0 = 0;
        kVar.b0 = 0;
        kVar.f945c0 = 0;
        kVar.f947d0 = 1.0f;
        kVar.f949e0 = 1.0f;
        kVar.f951f0 = -1;
        kVar.f953g0 = 0;
        kVar.f955h0 = -1;
        kVar.f962l0 = false;
        kVar.f964m0 = false;
        kVar.f966n0 = true;
        kVar.f968o0 = 0;
        this.f912d = kVar;
        n nVar = new n();
        nVar.f994a = 0.0f;
        nVar.f995b = 0.0f;
        nVar.f996c = 0.0f;
        nVar.f997d = 1.0f;
        nVar.f998e = 1.0f;
        nVar.f999f = Float.NaN;
        nVar.f1000g = Float.NaN;
        nVar.f1001h = -1;
        nVar.i = 0.0f;
        nVar.f1002j = 0.0f;
        nVar.f1003k = 0.0f;
        nVar.f1004l = false;
        nVar.f1005m = 0.0f;
        this.f913e = nVar;
        this.f914f = new HashMap();
    }

    public final void a(e eVar) {
        k kVar = this.f912d;
        eVar.f849e = kVar.f954h;
        eVar.f851f = kVar.i;
        eVar.f853g = kVar.f957j;
        eVar.f855h = kVar.f959k;
        eVar.i = kVar.f961l;
        eVar.f858j = kVar.f963m;
        eVar.f860k = kVar.f965n;
        eVar.f862l = kVar.f967o;
        eVar.f864m = kVar.f969p;
        eVar.f866n = kVar.f970q;
        eVar.f868o = kVar.f971r;
        eVar.f874s = kVar.f972s;
        eVar.f875t = kVar.f973t;
        eVar.f876u = kVar.f974u;
        eVar.f877v = kVar.f975v;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = kVar.f921F;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = kVar.f922G;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = kVar.f923H;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = kVar.f924I;
        eVar.f817A = kVar.f932R;
        eVar.f818B = kVar.f931Q;
        eVar.f879x = kVar.f928N;
        eVar.f881z = kVar.f930P;
        eVar.f821E = kVar.f976w;
        eVar.f822F = kVar.f977x;
        eVar.f870p = kVar.f979z;
        eVar.f872q = kVar.f916A;
        eVar.f873r = kVar.f917B;
        eVar.f823G = kVar.f978y;
        eVar.f835T = kVar.f918C;
        eVar.f836U = kVar.f919D;
        eVar.f825I = kVar.f934T;
        eVar.f824H = kVar.f935U;
        eVar.f827K = kVar.f937W;
        eVar.f826J = kVar.f936V;
        eVar.f838W = kVar.f962l0;
        eVar.f839X = kVar.f964m0;
        eVar.f828L = kVar.f938X;
        eVar.M = kVar.f939Y;
        eVar.f831P = kVar.f940Z;
        eVar.f832Q = kVar.f942a0;
        eVar.f829N = kVar.b0;
        eVar.f830O = kVar.f945c0;
        eVar.f833R = kVar.f947d0;
        eVar.f834S = kVar.f949e0;
        eVar.f837V = kVar.f920E;
        eVar.f845c = kVar.f950f;
        eVar.f842a = kVar.f946d;
        eVar.f844b = kVar.f948e;
        ((ViewGroup.MarginLayoutParams) eVar).width = kVar.f943b;
        ((ViewGroup.MarginLayoutParams) eVar).height = kVar.f944c;
        String str = kVar.f960k0;
        if (str != null) {
            eVar.f840Y = str;
        }
        eVar.f841Z = kVar.f968o0;
        eVar.setMarginStart(kVar.f926K);
        eVar.setMarginEnd(kVar.f925J);
        eVar.a();
    }

    public final Object clone() {
        j jVar = new j();
        k kVar = jVar.f912d;
        kVar.getClass();
        k kVar2 = this.f912d;
        kVar.f941a = kVar2.f941a;
        kVar.f943b = kVar2.f943b;
        kVar.f944c = kVar2.f944c;
        kVar.f946d = kVar2.f946d;
        kVar.f948e = kVar2.f948e;
        kVar.f950f = kVar2.f950f;
        kVar.f952g = kVar2.f952g;
        kVar.f954h = kVar2.f954h;
        kVar.i = kVar2.i;
        kVar.f957j = kVar2.f957j;
        kVar.f959k = kVar2.f959k;
        kVar.f961l = kVar2.f961l;
        kVar.f963m = kVar2.f963m;
        kVar.f965n = kVar2.f965n;
        kVar.f967o = kVar2.f967o;
        kVar.f969p = kVar2.f969p;
        kVar.f970q = kVar2.f970q;
        kVar.f971r = kVar2.f971r;
        kVar.f972s = kVar2.f972s;
        kVar.f973t = kVar2.f973t;
        kVar.f974u = kVar2.f974u;
        kVar.f975v = kVar2.f975v;
        kVar.f976w = kVar2.f976w;
        kVar.f977x = kVar2.f977x;
        kVar.f978y = kVar2.f978y;
        kVar.f979z = kVar2.f979z;
        kVar.f916A = kVar2.f916A;
        kVar.f917B = kVar2.f917B;
        kVar.f918C = kVar2.f918C;
        kVar.f919D = kVar2.f919D;
        kVar.f920E = kVar2.f920E;
        kVar.f921F = kVar2.f921F;
        kVar.f922G = kVar2.f922G;
        kVar.f923H = kVar2.f923H;
        kVar.f924I = kVar2.f924I;
        kVar.f925J = kVar2.f925J;
        kVar.f926K = kVar2.f926K;
        kVar.f927L = kVar2.f927L;
        kVar.M = kVar2.M;
        kVar.f928N = kVar2.f928N;
        kVar.f929O = kVar2.f929O;
        kVar.f930P = kVar2.f930P;
        kVar.f931Q = kVar2.f931Q;
        kVar.f932R = kVar2.f932R;
        kVar.f933S = kVar2.f933S;
        kVar.f934T = kVar2.f934T;
        kVar.f935U = kVar2.f935U;
        kVar.f936V = kVar2.f936V;
        kVar.f937W = kVar2.f937W;
        kVar.f938X = kVar2.f938X;
        kVar.f939Y = kVar2.f939Y;
        kVar.f940Z = kVar2.f940Z;
        kVar.f942a0 = kVar2.f942a0;
        kVar.b0 = kVar2.b0;
        kVar.f945c0 = kVar2.f945c0;
        kVar.f947d0 = kVar2.f947d0;
        kVar.f949e0 = kVar2.f949e0;
        kVar.f951f0 = kVar2.f951f0;
        kVar.f953g0 = kVar2.f953g0;
        kVar.f955h0 = kVar2.f955h0;
        kVar.f960k0 = kVar2.f960k0;
        int[] iArr = kVar2.f956i0;
        if (iArr == null || kVar2.f958j0 != null) {
            kVar.f956i0 = null;
        } else {
            kVar.f956i0 = Arrays.copyOf(iArr, iArr.length);
        }
        kVar.f958j0 = kVar2.f958j0;
        kVar.f962l0 = kVar2.f962l0;
        kVar.f964m0 = kVar2.f964m0;
        kVar.f966n0 = kVar2.f966n0;
        kVar.f968o0 = kVar2.f968o0;
        l lVar = jVar.f911c;
        lVar.getClass();
        l lVar2 = this.f911c;
        lVar2.getClass();
        lVar.f981a = lVar2.f981a;
        lVar.f983c = lVar2.f983c;
        lVar.f985e = lVar2.f985e;
        lVar.f984d = lVar2.f984d;
        m mVar = this.f910b;
        int i = mVar.f989a;
        m mVar2 = jVar.f910b;
        mVar2.f989a = i;
        mVar2.f991c = mVar.f991c;
        mVar2.f992d = mVar.f992d;
        mVar2.f990b = mVar.f990b;
        n nVar = jVar.f913e;
        nVar.getClass();
        n nVar2 = this.f913e;
        nVar2.getClass();
        nVar.f994a = nVar2.f994a;
        nVar.f995b = nVar2.f995b;
        nVar.f996c = nVar2.f996c;
        nVar.f997d = nVar2.f997d;
        nVar.f998e = nVar2.f998e;
        nVar.f999f = nVar2.f999f;
        nVar.f1000g = nVar2.f1000g;
        nVar.f1001h = nVar2.f1001h;
        nVar.i = nVar2.i;
        nVar.f1002j = nVar2.f1002j;
        nVar.f1003k = nVar2.f1003k;
        nVar.f1004l = nVar2.f1004l;
        nVar.f1005m = nVar2.f1005m;
        jVar.f909a = this.f909a;
        return jVar;
    }
}
