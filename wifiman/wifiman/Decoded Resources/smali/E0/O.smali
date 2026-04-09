.class public final LE0/O;
.super LE0/a;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LE0/b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LE0/a;-><init>(LE0/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method protected d(LE0/c0;J)J
    .locals 2

    invoke-virtual {p1}, LE0/c0;->C2()LE0/Q;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, LE0/Q;->r1()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/n;->h(J)I

    move-result p1

    int-to-float p1, p1

    invoke-static {v0, v1}, LY0/n;->i(J)I

    move-result v0

    int-to-float v0, v0

    invoke-static {p1, v0}, Ll0/h;->a(FF)J

    move-result-wide v0

    invoke-static {v0, v1, p2, p3}, Ll0/g;->r(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method protected e(LE0/c0;)Ljava/util/Map;
    .locals 0

    invoke-virtual {p1}, LE0/c0;->C2()LE0/Q;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, LE0/Q;->h1()LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->p()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method protected i(LE0/c0;LC0/a;)I
    .locals 0

    invoke-virtual {p1}, LE0/c0;->C2()LE0/Q;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, LE0/P;->X(LC0/a;)I

    move-result p1

    return p1
.end method
