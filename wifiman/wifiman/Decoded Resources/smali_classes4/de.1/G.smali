.class public final Lde/G;
.super Lcom/ui/wifiman/db/RoomPersistentInstance;
.source "SourceFile"

# interfaces
.implements Lde/F;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lde/G$a;
    }
.end annotation


# direct methods
.method public constructor <init>(LTb/b;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)V

    return-void
.end method

.method private final h(Lic/b;)LTb/a$b;
    .locals 1

    sget-object v0, Lde/G$a;->d:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, LTb/a$b;->CHANNEL_HEALTH:LTb/a$b;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, LTb/a$b;->NETWORKS:LTb/a$b;

    :goto_0
    return-object p1
.end method

.method private final i(Lic/c;)LTb/a$c;
    .locals 1

    sget-object v0, Lde/G$a;->h:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, LTb/a$c;->HEALTH:LTb/a$c;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, LTb/a$c;->NUMBER:LTb/a$c;

    :goto_0
    return-object p1
.end method

.method private final j(Lic/d;)LTb/a$d;
    .locals 1

    sget-object v0, Lde/G$a;->f:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, LTb/a$d;->SIGNAL:LTb/a$d;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, LTb/a$d;->SSID:LTb/a$d;

    :goto_0
    return-object p1
.end method

.method private final k(Lic/e;)LTb/a$e;
    .locals 1

    sget-object v0, Lde/G$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    sget-object p1, LTb/a$e;->GHZ_6:LTb/a$e;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, LTb/a$e;->GHZ_5:LTb/a$e;

    goto :goto_0

    :cond_2
    sget-object p1, LTb/a$e;->GHZ_2:LTb/a$e;

    goto :goto_0

    :cond_3
    sget-object p1, LTb/a$e;->ALL:LTb/a$e;

    :goto_0
    return-object p1
.end method

.method private final l(LTb/a$b;)Lic/b;
    .locals 1

    sget-object v0, Lde/G$a;->c:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lic/b;->CHANNEL_HEALTH:Lic/b;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lic/b;->NETWORKS:Lic/b;

    :goto_0
    return-object p1
.end method

.method private final m(LTb/a$c;)Lic/c;
    .locals 1

    sget-object v0, Lde/G$a;->g:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lic/c;->HEALTH:Lic/c;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lic/c;->NUMBER:Lic/c;

    :goto_0
    return-object p1
.end method

.method private final n(LTb/a$d;)Lic/d;
    .locals 1

    sget-object v0, Lde/G$a;->e:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lic/d;->SIGNAL:Lic/d;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lic/d;->SSID:Lic/d;

    :goto_0
    return-object p1
.end method

.method private final o(LTb/a$e;)Lic/e;
    .locals 1

    sget-object v0, Lde/G$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    sget-object p1, Lic/e;->GHZ_6:Lic/e;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lic/e;->GHZ_5:Lic/e;

    goto :goto_0

    :cond_2
    sget-object p1, Lic/e;->GHZ_2:Lic/e;

    goto :goto_0

    :cond_3
    sget-object p1, Lic/e;->ALL:Lic/e;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTb/a;

    invoke-virtual {p0, p1}, Lde/G;->p(LTb/a;)Lde/E;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lde/G;->q()Lde/E;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lde/E;

    invoke-virtual {p0, p1}, Lde/G;->r(Lde/E;)LTb/a;

    move-result-object p1

    return-object p1
.end method

.method protected p(LTb/a;)Lde/E;
    .locals 4

    const-string v0, "persistent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LTb/a;->h()LTb/a$e;

    move-result-object v0

    invoke-direct {p0, v0}, Lde/G;->o(LTb/a$e;)Lic/e;

    move-result-object v0

    invoke-virtual {p1}, LTb/a;->b()LTb/a$b;

    move-result-object v1

    invoke-direct {p0, v1}, Lde/G;->l(LTb/a$b;)Lic/b;

    move-result-object v1

    invoke-virtual {p1}, LTb/a;->f()LTb/a$d;

    move-result-object v2

    invoke-direct {p0, v2}, Lde/G;->n(LTb/a$d;)Lic/d;

    move-result-object v2

    invoke-virtual {p1}, LTb/a;->d()LTb/a$c;

    move-result-object p1

    invoke-direct {p0, p1}, Lde/G;->m(LTb/a$c;)Lic/c;

    move-result-object p1

    new-instance v3, Lde/E;

    invoke-direct {v3, v0, v2, p1, v1}, Lde/E;-><init>(Lic/e;Lic/d;Lic/c;Lic/b;)V

    return-object v3
.end method

.method protected q()Lde/E;
    .locals 8

    new-instance v7, Lde/E;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lde/E;-><init>(Lic/e;Lic/d;Lic/c;Lic/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method protected r(Lde/E;)LTb/a;
    .locals 4

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LTb/a;

    invoke-virtual {p1}, Lde/E;->c()Lic/e;

    move-result-object v1

    invoke-direct {p0, v1}, Lde/G;->k(Lic/e;)LTb/a$e;

    move-result-object v1

    invoke-virtual {p1}, Lde/E;->d()Lic/b;

    move-result-object v2

    invoke-direct {p0, v2}, Lde/G;->h(Lic/b;)LTb/a$b;

    move-result-object v2

    invoke-virtual {p1}, Lde/E;->f()Lic/d;

    move-result-object v3

    invoke-direct {p0, v3}, Lde/G;->j(Lic/d;)LTb/a$d;

    move-result-object v3

    invoke-virtual {p1}, Lde/E;->e()Lic/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lde/G;->i(Lic/c;)LTb/a$c;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, LTb/a;-><init>(LTb/a$e;LTb/a$b;LTb/a$d;LTb/a$c;)V

    return-object v0
.end method
