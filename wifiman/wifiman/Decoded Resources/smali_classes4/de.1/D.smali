.class public final Lde/D;
.super Lcom/ui/wifiman/db/RoomPersistentInstance;
.source "SourceFile"

# interfaces
.implements Lde/C;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lde/D$a;
    }
.end annotation


# direct methods
.method public constructor <init>(LSb/b;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)V

    return-void
.end method

.method private final h(Lic/a;)LSb/a$b;
    .locals 1

    sget-object v0, Lde/D$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, LSb/a$b;->SIGNAL:LSb/a$b;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, LSb/a$b;->NAME:LSb/a$b;

    :goto_0
    return-object p1
.end method

.method private final i(LSb/a$b;)Lic/a;
    .locals 1

    sget-object v0, Lde/D$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lic/a;->SIGNAL:Lic/a;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lic/a;->NAME:Lic/a;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LSb/a;

    invoke-virtual {p0, p1}, Lde/D;->j(LSb/a;)Lde/B;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lde/D;->k()Lde/B;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lde/B;

    invoke-virtual {p0, p1}, Lde/D;->l(Lde/B;)LSb/a;

    move-result-object p1

    return-object p1
.end method

.method protected j(LSb/a;)Lde/B;
    .locals 1

    const-string v0, "persistent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lde/B;

    invoke-virtual {p1}, LSb/a;->b()LSb/a$b;

    move-result-object p1

    invoke-direct {p0, p1}, Lde/D;->i(LSb/a$b;)Lic/a;

    move-result-object p1

    invoke-direct {v0, p1}, Lde/B;-><init>(Lic/a;)V

    return-object v0
.end method

.method protected k()Lde/B;
    .locals 3

    new-instance v0, Lde/B;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lde/B;-><init>(Lic/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method protected l(Lde/B;)LSb/a;
    .locals 1

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LSb/a;

    invoke-virtual {p1}, Lde/B;->b()Lic/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lde/D;->h(Lic/a;)LSb/a$b;

    move-result-object p1

    invoke-direct {v0, p1}, LSb/a;-><init>(LSb/a$b;)V

    return-object v0
.end method
