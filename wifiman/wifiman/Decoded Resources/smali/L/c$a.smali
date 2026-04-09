.class public final LL/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LL/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LL/c;LY0/t;LL0/U;LY0/d;LQ0/k$b;)LL/c;
    .locals 7

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LL/c;->g()LY0/t;

    move-result-object v0

    if-ne p2, v0, :cond_0

    invoke-virtual {p1}, LL/c;->f()LL0/U;

    move-result-object v0

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p4}, LY0/d;->getDensity()F

    move-result v0

    invoke-virtual {p1}, LL/c;->d()LY0/d;

    move-result-object v1

    invoke-interface {v1}, LY0/d;->getDensity()F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p1}, LL/c;->e()LQ0/k$b;

    move-result-object v0

    if-ne p5, v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {}, LL/c;->a()LL/c;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LL/c;->g()LY0/t;

    move-result-object v0

    if-ne p2, v0, :cond_1

    invoke-virtual {p1}, LL/c;->f()LL0/U;

    move-result-object v0

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p4}, LY0/d;->getDensity()F

    move-result v0

    invoke-virtual {p1}, LL/c;->d()LY0/d;

    move-result-object v1

    invoke-interface {v1}, LY0/d;->getDensity()F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_1

    invoke-virtual {p1}, LL/c;->e()LQ0/k$b;

    move-result-object v0

    if-ne p5, v0, :cond_1

    return-object p1

    :cond_1
    new-instance p1, LL/c;

    invoke-static {p3, p2}, LL0/V;->d(LL0/U;LY0/t;)LL0/U;

    move-result-object v3

    invoke-interface {p4}, LY0/d;->getDensity()F

    move-result p3

    invoke-interface {p4}, LY0/l;->y()F

    move-result p4

    invoke-static {p3, p4}, LY0/f;->a(FF)LY0/d;

    move-result-object v4

    const/4 v6, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p5

    invoke-direct/range {v1 .. v6}, LL/c;-><init>(LY0/t;LL0/U;LY0/d;LQ0/k$b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1}, LL/c;->b(LL/c;)V

    return-object p1
.end method
