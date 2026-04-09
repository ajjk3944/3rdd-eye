package bb;

import a5.d0;
import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;
import qb.v;

/* loaded from: classes.dex */
public final class r implements Handler.Callback {
    public final Object B;
    public final Object D;
    public final Object E;
    public Object F;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2565a;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f2566d;

    /* renamed from: g, reason: collision with root package name */
    public final TreeMap f2567g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2568r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2569x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2570y;

    public r(cb.c cVar, p pVar, pb.b bVar) {
        this.f2565a = 0;
        this.F = cVar;
        this.D = pVar;
        this.B = bVar;
        this.f2567g = new TreeMap();
        this.f2566d = v.l(this);
        this.E = new ra.a();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f2565a) {
            case 0:
                if (!this.f2570y) {
                    if (message.what == 1) {
                        o oVar = (o) message.obj;
                        long j = oVar.f2558a;
                        long j7 = oVar.f2559b;
                        Long lValueOf = Long.valueOf(j7);
                        TreeMap treeMap = this.f2567g;
                        Long l10 = (Long) treeMap.get(lValueOf);
                        if (l10 != null) {
                            if (l10.longValue() > j) {
                                treeMap.put(Long.valueOf(j7), Long.valueOf(j));
                                break;
                            }
                        } else {
                            treeMap.put(Long.valueOf(j7), Long.valueOf(j));
                            break;
                        }
                    }
                }
                break;
            default:
                if (!this.f2570y) {
                    if (message.what == 1) {
                        g5.l lVar = (g5.l) message.obj;
                        long j10 = lVar.f9367a;
                        long j11 = lVar.f9368b;
                        Long lValueOf2 = Long.valueOf(j11);
                        TreeMap treeMap2 = this.f2567g;
                        Long l11 = (Long) treeMap2.get(lValueOf2);
                        if (l11 != null) {
                            if (l11.longValue() > j10) {
                                treeMap2.put(Long.valueOf(j11), Long.valueOf(j10));
                                break;
                            }
                        } else {
                            treeMap2.put(Long.valueOf(j11), Long.valueOf(j10));
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    public r(h5.c cVar, g5.m mVar, r5.b bVar) {
        this.f2565a = 1;
        this.F = cVar;
        this.D = mVar;
        this.B = bVar;
        this.f2567g = new TreeMap();
        this.f2566d = d0.k(this);
        this.E = new c6.a();
    }
}
