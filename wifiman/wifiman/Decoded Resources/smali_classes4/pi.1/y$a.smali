.class public final Lpi/y$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpi/y;
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
    invoke-direct {p0}, Lpi/y$a;-><init>()V

    return-void
.end method

.method private final a(Lpi/M0;)Z
    .locals 1

    invoke-virtual {p1}, Lpi/S;->N0()Lpi/v0;

    invoke-virtual {p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    invoke-interface {v0}, Lpi/v0;->c()LBh/h;

    move-result-object v0

    instance-of v0, v0, LBh/l0;

    if-nez v0, :cond_0

    instance-of p1, p1, Lkotlin/reflect/jvm/internal/impl/types/checker/i;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    return p1
.end method

.method public static synthetic c(Lpi/y$a;Lpi/M0;ZZILjava/lang/Object;)Lpi/y;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lpi/y$a;->b(Lpi/M0;ZZ)Lpi/y;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lpi/M0;Z)Z
    .locals 2

    invoke-direct {p0, p1}, Lpi/y$a;->a(Lpi/M0;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object v0

    invoke-interface {v0}, Lpi/v0;->c()LBh/h;

    move-result-object v0

    instance-of v1, v0, LDh/U;

    if-eqz v1, :cond_1

    check-cast v0, LDh/U;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LDh/U;->T0()Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual {p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object p2

    invoke-interface {p2}, Lpi/v0;->c()LBh/h;

    move-result-object p2

    instance-of p2, p2, LBh/l0;

    if-eqz p2, :cond_3

    invoke-static {p1}, Lpi/J0;->l(Lpi/S;)Z

    move-result p1

    return p1

    :cond_3
    sget-object p2, Lkotlin/reflect/jvm/internal/impl/types/checker/r;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/r;

    invoke-virtual {p2, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/r;->a(Lpi/M0;)Z

    move-result p1

    xor-int/2addr p1, v1

    return p1
.end method


# virtual methods
.method public final b(Lpi/M0;ZZ)Lpi/y;
    .locals 2

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lpi/y;

    if-eqz v0, :cond_0

    check-cast p1, Lpi/y;

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    if-nez p3, :cond_2

    invoke-direct {p0, p1, p2}, Lpi/y$a;->d(Lpi/M0;Z)Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v0

    goto :goto_1

    :cond_2
    :goto_0
    instance-of p3, p1, Lpi/I;

    if-eqz p3, :cond_3

    move-object p3, p1

    check-cast p3, Lpi/I;

    invoke-virtual {p3}, Lpi/I;->V0()Lpi/d0;

    move-result-object v1

    invoke-virtual {v1}, Lpi/S;->N0()Lpi/v0;

    move-result-object v1

    invoke-virtual {p3}, Lpi/I;->W0()Lpi/d0;

    move-result-object p3

    invoke-virtual {p3}, Lpi/S;->N0()Lpi/v0;

    move-result-object p3

    invoke-static {v1, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_3
    new-instance p3, Lpi/y;

    invoke-static {p1}, Lpi/L;->c(Lpi/S;)Lpi/d0;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lpi/d0;->U0(Z)Lpi/d0;

    move-result-object p1

    invoke-direct {p3, p1, p2, v0}, Lpi/y;-><init>(Lpi/d0;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, p3

    :goto_1
    return-object p1
.end method
