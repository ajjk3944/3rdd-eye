package j$.util.stream;

import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class m1 extends q1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f26667c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Predicate f26668d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(r1 r1Var, Predicate predicate) {
        super(r1Var);
        this.f26667c = r1Var;
        this.f26668d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f26725a) {
            return;
        }
        boolean zTest = this.f26668d.test(obj);
        r1 r1Var = this.f26667c;
        if (zTest == r1Var.f26741a) {
            this.f26725a = true;
            this.f26726b = r1Var.f26742b;
        }
    }
}
