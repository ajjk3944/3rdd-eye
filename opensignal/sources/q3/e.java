package q3;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f20693c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20695e;

    public /* synthetic */ e(String str, Context context, Object obj, int i10, int i11) {
        this.f20691a = i11;
        this.f20692b = str;
        this.f20693c = context;
        this.f20695e = obj;
        this.f20694d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f20691a) {
            case 0:
                Object[] objArr = {(d) this.f20695e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return h.b(this.f20692b, this.f20693c, Collections.unmodifiableList(arrayList), this.f20694d);
            default:
                try {
                    return h.b(this.f20692b, this.f20693c, (List) this.f20695e, this.f20694d);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
