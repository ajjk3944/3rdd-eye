.class public final Lde/x;
.super Lcom/ui/wifiman/db/RoomPersistentInstance;
.source "SourceFile"

# interfaces
.implements Lde/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lde/x$a;
    }
.end annotation


# direct methods
.method public constructor <init>(LPb/e;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)V

    return-void
.end method

.method private final h(Lfc/b;)LPb/i$b;
    .locals 1

    sget-object v0, Lde/x$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, LPb/i$b;->IP:LPb/i$b;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, LPb/i$b;->NAME:LPb/i$b;

    :goto_0
    return-object p1
.end method

.method private final i(LPb/i$b;)Lfc/b;
    .locals 1

    sget-object v0, Lde/x$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lfc/b;->IP:Lfc/b;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lfc/b;->NAME:Lfc/b;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPb/i;

    invoke-virtual {p0, p1}, Lde/x;->j(LPb/i;)Lde/v;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lde/x;->k()Lde/v;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lde/v;

    invoke-virtual {p0, p1}, Lde/x;->l(Lde/v;)LPb/i;

    move-result-object p1

    return-object p1
.end method

.method protected j(LPb/i;)Lde/v;
    .locals 2

    const-string v0, "persistent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lde/v;

    invoke-virtual {p1}, LPb/i;->c()LPb/i$b;

    move-result-object v1

    invoke-direct {p0, v1}, Lde/x;->i(LPb/i$b;)Lfc/b;

    move-result-object v1

    invoke-virtual {p1}, LPb/i;->e()Z

    move-result p1

    invoke-direct {v0, v1, p1}, Lde/v;-><init>(Lfc/b;Z)V

    return-object v0
.end method

.method protected k()Lde/v;
    .locals 4

    new-instance v0, Lde/v;

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2, v3}, Lde/v;-><init>(Lfc/b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method protected l(Lde/v;)LPb/i;
    .locals 3

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LPb/i;

    invoke-virtual {p1}, Lde/v;->c()Lfc/b;

    move-result-object v1

    invoke-direct {p0, v1}, Lde/x;->h(Lfc/b;)LPb/i$b;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1}, Lde/v;->d()Z

    move-result p1

    invoke-direct {v0, v1, v2, p1}, LPb/i;-><init>(LPb/i$b;ZZ)V

    return-object v0
.end method
