.class public final Lde/u;
.super Lcom/ui/wifiman/db/RoomPersistentInstance;
.source "SourceFile"

# interfaces
.implements Lde/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lde/u$a;
    }
.end annotation


# direct methods
.method public constructor <init>(LPb/c;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)V

    return-void
.end method

.method private final h(Lfc/c;)LPb/h$b;
    .locals 1

    sget-object v0, Lde/u$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, LPb/h$b;->BLUETOOTH:LPb/h$b;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, LPb/h$b;->LAN:LPb/h$b;

    :goto_0
    return-object p1
.end method

.method private final i(LPb/h$b;)Lfc/c;
    .locals 1

    sget-object v0, Lde/u$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lfc/c;->BLUETOOTH:Lfc/c;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lfc/c;->LAN:Lfc/c;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPb/h;

    invoke-virtual {p0, p1}, Lde/u;->j(LPb/h;)Lde/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lde/u;->k()Lde/s;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lde/s;

    invoke-virtual {p0, p1}, Lde/u;->l(Lde/s;)LPb/h;

    move-result-object p1

    return-object p1
.end method

.method protected j(LPb/h;)Lde/s;
    .locals 1

    const-string v0, "persistent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lde/s;

    invoke-virtual {p1}, LPb/h;->b()LPb/h$b;

    move-result-object p1

    invoke-direct {p0, p1}, Lde/u;->i(LPb/h$b;)Lfc/c;

    move-result-object p1

    invoke-direct {v0, p1}, Lde/s;-><init>(Lfc/c;)V

    return-object v0
.end method

.method protected k()Lde/s;
    .locals 3

    new-instance v0, Lde/s;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lde/s;-><init>(Lfc/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method protected l(Lde/s;)LPb/h;
    .locals 1

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LPb/h;

    invoke-virtual {p1}, Lde/s;->b()Lfc/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lde/u;->h(Lfc/c;)LPb/h$b;

    move-result-object p1

    invoke-direct {v0, p1}, LPb/h;-><init>(LPb/h$b;)V

    return-object v0
.end method
