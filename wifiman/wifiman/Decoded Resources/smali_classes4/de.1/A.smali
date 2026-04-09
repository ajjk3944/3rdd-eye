.class public final Lde/A;
.super Lcom/ui/wifiman/db/RoomPersistentInstance;
.source "SourceFile"

# interfaces
.implements Lde/z;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lde/A$a;
    }
.end annotation


# direct methods
.method public constructor <init>(LWb/h;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)V

    return-void
.end method

.method private final h(Lgc/b;)LWb/e$b;
    .locals 1

    sget-object v0, Lde/A$a;->d:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    sget-object p1, LWb/e$b;->LATENCY:LWb/e$b;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, LWb/e$b;->THROUGHPUT:LWb/e$b;

    goto :goto_0

    :cond_2
    sget-object p1, LWb/e$b;->SIGNAL:LWb/e$b;

    :goto_0
    return-object p1
.end method

.method private final i(Lgc/c;)LWb/e$c;
    .locals 1

    sget-object v0, Lde/A$a;->f:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, LWb/e$c;->CELLULAR:LWb/e$c;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, LWb/e$c;->WIFI:LWb/e$c;

    :goto_0
    return-object p1
.end method

.method private final j(Lgc/a;)LWb/e$d;
    .locals 1

    sget-object v0, Lde/A$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, LWb/e$d;->FLOORPLAN:LWb/e$d;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, LWb/e$d;->SIGNAL:LWb/e$d;

    :goto_0
    return-object p1
.end method

.method private final k(LWb/e$d;)Lgc/a;
    .locals 1

    sget-object v0, Lde/A$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lgc/a;->FLOORPLAN:Lgc/a;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lgc/a;->SIGNAL:Lgc/a;

    :goto_0
    return-object p1
.end method

.method private final l(LWb/e$b;)Lgc/b;
    .locals 1

    sget-object v0, Lde/A$a;->c:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    sget-object p1, Lgc/b;->LATENCY:Lgc/b;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lgc/b;->THROUGHPUT:Lgc/b;

    goto :goto_0

    :cond_2
    sget-object p1, Lgc/b;->SIGNAL:Lgc/b;

    :goto_0
    return-object p1
.end method

.method private final m(LWb/e$c;)Lgc/c;
    .locals 1

    sget-object v0, Lde/A$a;->e:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lgc/c;->CELLULAR:Lgc/c;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lgc/c;->WIFI:Lgc/c;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWb/e;

    invoke-virtual {p0, p1}, Lde/A;->n(LWb/e;)Lde/y;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lde/A;->o()Lde/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lde/y;

    invoke-virtual {p0, p1}, Lde/A;->p(Lde/y;)LWb/e;

    move-result-object p1

    return-object p1
.end method

.method protected n(LWb/e;)Lde/y;
    .locals 3

    const-string v0, "persistent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lde/y;

    invoke-virtual {p1}, LWb/e;->f()LWb/e$d;

    move-result-object v1

    invoke-direct {p0, v1}, Lde/A;->k(LWb/e$d;)Lgc/a;

    move-result-object v1

    invoke-virtual {p1}, LWb/e;->b()LWb/e$b;

    move-result-object v2

    invoke-direct {p0, v2}, Lde/A;->l(LWb/e$b;)Lgc/b;

    move-result-object v2

    invoke-virtual {p1}, LWb/e;->d()LWb/e$c;

    move-result-object p1

    invoke-direct {p0, p1}, Lde/A;->m(LWb/e$c;)Lgc/c;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lde/y;-><init>(Lgc/a;Lgc/b;Lgc/c;)V

    return-object v0
.end method

.method protected o()Lde/y;
    .locals 7

    new-instance v6, Lde/y;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lde/y;-><init>(Lgc/a;Lgc/b;Lgc/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method protected p(Lde/y;)LWb/e;
    .locals 3

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LWb/e;

    invoke-virtual {p1}, Lde/y;->d()Lgc/a;

    move-result-object v1

    invoke-direct {p0, v1}, Lde/A;->j(Lgc/a;)LWb/e$d;

    move-result-object v1

    invoke-virtual {p1}, Lde/y;->c()Lgc/b;

    move-result-object v2

    invoke-direct {p0, v2}, Lde/A;->h(Lgc/b;)LWb/e$b;

    move-result-object v2

    invoke-virtual {p1}, Lde/y;->e()Lgc/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lde/A;->i(Lgc/c;)LWb/e$c;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, LWb/e;-><init>(LWb/e$d;LWb/e$b;LWb/e$c;)V

    return-object v0
.end method
