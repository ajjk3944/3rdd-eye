package C0;

import A2.C0117e;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1070a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f1071b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1072c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1073d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1074e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1075f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f1076g;

    /* renamed from: h, reason: collision with root package name */
    public Executor f1077h;
    public R3.e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1078j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1079k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1080l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1081m;

    /* renamed from: n, reason: collision with root package name */
    public final long f1082n;

    /* renamed from: o, reason: collision with root package name */
    public final C0117e f1083o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f1084p;

    /* renamed from: q, reason: collision with root package name */
    public HashSet f1085q;

    /* renamed from: r, reason: collision with root package name */
    public String f1086r;

    public o(Context context, Class cls, String str) {
        q5.i.e(context, "context");
        this.f1070a = context;
        this.f1071b = cls;
        this.f1072c = str;
        this.f1073d = new ArrayList();
        this.f1074e = new ArrayList();
        this.f1075f = new ArrayList();
        this.f1079k = 1;
        this.f1080l = true;
        this.f1082n = -1L;
        this.f1083o = new C0117e(2);
        this.f1084p = new LinkedHashSet();
    }

    public final void a(D0.a... aVarArr) {
        if (this.f1085q == null) {
            this.f1085q = new HashSet();
        }
        for (D0.a aVar : aVarArr) {
            HashSet hashSet = this.f1085q;
            q5.i.b(hashSet);
            hashSet.add(Integer.valueOf(aVar.f1201a));
            HashSet hashSet2 = this.f1085q;
            q5.i.b(hashSet2);
            hashSet2.add(Integer.valueOf(aVar.f1202b));
        }
        this.f1083o.s((D0.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final C0.p b() throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.o.b():C0.p");
    }

    public final void c() {
        this.f1080l = false;
        this.f1081m = true;
    }
}
