.class public final LE0/H;
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
    .locals 6

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    move-wide v1, p2

    invoke-static/range {v0 .. v5}, LE0/c0;->s3(LE0/c0;JZILjava/lang/Object;)J

    move-result-wide p1

    return-wide p1
.end method

.method protected e(LE0/c0;)Ljava/util/Map;
    .locals 0

    invoke-virtual {p1}, LE0/c0;->h1()LC0/D;

    move-result-object p1

    invoke-interface {p1}, LC0/D;->p()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method protected i(LE0/c0;LC0/a;)I
    .locals 0

    invoke-virtual {p1, p2}, LE0/P;->X(LC0/a;)I

    move-result p1

    return p1
.end method
