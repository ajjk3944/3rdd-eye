package x9;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6687X;
import m0.AbstractC6688Y;
import m0.U0;
import m0.X0;
import o0.C7044k;

/* renamed from: x9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8431a {

    /* renamed from: a, reason: collision with root package name */
    private final U0 f65445a;

    /* renamed from: b, reason: collision with root package name */
    private final X0 f65446b;

    /* renamed from: c, reason: collision with root package name */
    private final U0 f65447c;

    /* renamed from: d, reason: collision with root package name */
    private final C7044k f65448d;

    /* renamed from: e, reason: collision with root package name */
    private final long f65449e;

    public /* synthetic */ C8431a(U0 u02, X0 x02, U0 u03, C7044k c7044k, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(u02, x02, u03, c7044k, j10);
    }

    public final U0 a() {
        return this.f65445a;
    }

    public final long b() {
        return this.f65449e;
    }

    public final X0 c() {
        return this.f65446b;
    }

    public final U0 d() {
        return this.f65447c;
    }

    public final C7044k e() {
        return this.f65448d;
    }

    private C8431a(U0 checkPath, X0 pathMeasure, U0 pathToDraw, C7044k stroke, long j10) {
        AbstractC6492s.i(checkPath, "checkPath");
        AbstractC6492s.i(pathMeasure, "pathMeasure");
        AbstractC6492s.i(pathToDraw, "pathToDraw");
        AbstractC6492s.i(stroke, "stroke");
        this.f65445a = checkPath;
        this.f65446b = pathMeasure;
        this.f65447c = pathToDraw;
        this.f65448d = stroke;
        this.f65449e = j10;
    }

    public /* synthetic */ C8431a(U0 u02, X0 x02, U0 u03, C7044k c7044k, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC6688Y.a() : u02, (i10 & 2) != 0 ? AbstractC6687X.a() : x02, (i10 & 4) != 0 ? AbstractC6688Y.a() : u03, c7044k, j10, null);
    }
}
