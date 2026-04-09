package b2;

import java.util.ArrayList;
import q5.j;

/* renamed from: b2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330a extends j implements p5.a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0330a f5716c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0330a f5717d;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5718b;

    static {
        int i = 0;
        f5716c = new C0330a(i, 0);
        f5717d = new C0330a(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0330a(int i, int i3) {
        super(i);
        this.f5718b = i3;
    }

    @Override // p5.a
    public final Object b() {
        switch (this.f5718b) {
        }
        return new ArrayList();
    }
}
