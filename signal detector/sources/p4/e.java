package P4;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class e extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public Object f3151d;

    /* renamed from: e, reason: collision with root package name */
    public y5.d f3152e;

    /* renamed from: f, reason: collision with root package name */
    public Pattern f3153f;

    /* renamed from: g, reason: collision with root package name */
    public Iterator f3154g;

    /* renamed from: h, reason: collision with root package name */
    public String f3155h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f3156j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f3157k;

    /* renamed from: l, reason: collision with root package name */
    public int f3158l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, j5.b bVar) {
        super(bVar);
        this.f3157k = iVar;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f3156j = obj;
        this.f3158l |= LinearLayoutManager.INVALID_OFFSET;
        return this.f3157k.b(this);
    }
}
