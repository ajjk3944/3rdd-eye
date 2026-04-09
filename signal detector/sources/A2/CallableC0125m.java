package A2;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.C0436Bf;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: A2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0125m implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f264c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f266e;

    public /* synthetic */ CallableC0125m(BinderC0126n binderC0126n, C0436Bf c0436Bf, int i, Bundle bundle) {
        this.f262a = 0;
        this.f264c = binderC0126n;
        this.f265d = c0436Bf;
        this.f263b = i;
        this.f266e = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f262a;
        int i3 = this.f263b;
        Object obj = this.f266e;
        Object obj2 = this.f265d;
        Object obj3 = this.f264c;
        switch (i) {
            case 0:
                BinderC0126n binderC0126n = (BinderC0126n) obj3;
                C0436Bf c0436Bf = (C0436Bf) obj2;
                return binderC0126n.P3(binderC0126n.f290c, c0436Bf.f7377a, c0436Bf.f7378b, c0436Bf.f7379c, c0436Bf.f7380d, this.f263b, c0436Bf.f7382f, (Bundle) obj, c0436Bf);
            case 1:
                Object[] objArr = {(O.e) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj4 = objArr[0];
                Objects.requireNonNull(obj4);
                arrayList.add(obj4);
                return O.h.b((String) obj3, (Context) obj2, Collections.unmodifiableList(arrayList), i3);
            default:
                try {
                    return O.h.b((String) obj3, (Context) obj2, (List) obj, i3);
                } catch (Throwable unused) {
                    return new O.g(-3);
                }
        }
    }

    public /* synthetic */ CallableC0125m(String str, Context context, Object obj, int i, int i3) {
        this.f262a = i3;
        this.f264c = str;
        this.f265d = context;
        this.f266e = obj;
        this.f263b = i;
    }
}
