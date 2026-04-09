.class public final Lde/r;
.super Lcom/ui/wifiman/db/RoomPersistentInstance;
.source "SourceFile"

# interfaces
.implements Lde/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lde/r$a;
    }
.end annotation


# direct methods
.method public constructor <init>(LPb/a;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)V

    return-void
.end method

.method private final h(Lfc/a;)LPb/g$b;
    .locals 1

    sget-object v0, Lde/r$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    sget-object p1, LPb/g$b;->SIGNAL:LPb/g$b;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, LPb/g$b;->MAC:LPb/g$b;

    goto :goto_0

    :cond_2
    sget-object p1, LPb/g$b;->NAME:LPb/g$b;

    :goto_0
    return-object p1
.end method

.method private final i(LPb/g$b;)Lfc/a;
    .locals 1

    sget-object v0, Lde/r$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    sget-object p1, Lfc/a;->SIGNAL:Lfc/a;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lfc/a;->MAC:Lfc/a;

    goto :goto_0

    :cond_2
    sget-object p1, Lfc/a;->NAME:Lfc/a;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPb/g;

    invoke-virtual {p0, p1}, Lde/r;->j(LPb/g;)Lde/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lde/r;->k()Lde/p;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lde/p;

    invoke-virtual {p0, p1}, Lde/r;->l(Lde/p;)LPb/g;

    move-result-object p1

    return-object p1
.end method

.method protected j(LPb/g;)Lde/p;
    .locals 3

    const-string v0, "persistent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LPb/g;->a()Z

    move-result v0

    invoke-virtual {p1}, LPb/g;->c()LPb/g$b;

    move-result-object v1

    invoke-direct {p0, v1}, Lde/r;->i(LPb/g$b;)Lfc/a;

    move-result-object v1

    invoke-virtual {p1}, LPb/g;->e()Z

    move-result p1

    new-instance v2, Lde/p;

    invoke-direct {v2, v1, p1, v0}, Lde/p;-><init>(Lfc/a;ZZ)V

    return-object v2
.end method

.method protected k()Lde/p;
    .locals 7

    new-instance v6, Lde/p;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lde/p;-><init>(Lfc/a;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method protected l(Lde/p;)LPb/g;
    .locals 3

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LPb/g;

    invoke-virtual {p1}, Lde/p;->c()Z

    move-result v1

    invoke-virtual {p1}, Lde/p;->e()Z

    move-result v2

    invoke-virtual {p1}, Lde/p;->d()Lfc/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lde/r;->h(Lfc/a;)LPb/g$b;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, LPb/g;-><init>(ZZLPb/g$b;)V

    return-object v0
.end method
