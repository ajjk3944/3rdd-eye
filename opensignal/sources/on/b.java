package on;

import com.survicate.surveys.entities.survey.translations.Translatable;
import com.survicate.surveys.infrastructure.network.VisitorData;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class b extends rq.c {
    public Object B;
    public Object D;
    public VisitorData E;
    public LinkedHashMap F;
    public boolean G;
    public /* synthetic */ Object H;
    public final /* synthetic */ e I;
    public int J;

    /* renamed from: r, reason: collision with root package name */
    public e f19593r;

    /* renamed from: x, reason: collision with root package name */
    public a f19594x;

    /* renamed from: y, reason: collision with root package name */
    public Translatable f19595y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, rq.c cVar) {
        super(cVar);
        this.I = eVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.a(null, false, 0, this);
    }
}
