.class public final Lde/c;
.super Lcom/ui/wifiman/db/RoomPersistentInstance;
.source "SourceFile"

# interfaces
.implements Lde/b;


# direct methods
.method public constructor <init>(Lbc/a;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc/c;

    invoke-virtual {p0, p1}, Lde/c;->h(Lbc/c;)Lde/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lde/c;->i()Lde/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lde/a;

    invoke-virtual {p0, p1}, Lde/c;->j(Lde/a;)Lbc/c;

    move-result-object p1

    return-object p1
.end method

.method protected h(Lbc/c;)Lde/a;
    .locals 4

    const-string v0, "persistent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lbc/c;->c()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1}, Lbc/c;->a()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1}, Lbc/c;->e()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p1}, Lbc/c;->d()Ljava/lang/Boolean;

    move-result-object p1

    new-instance v3, Lde/a;

    invoke-direct {v3, v0, v2, v1, p1}, Lde/a;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v3
.end method

.method protected i()Lde/a;
    .locals 2

    new-instance v0, Lde/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, v1}, Lde/a;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method protected j(Lde/a;)Lbc/c;
    .locals 9

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lde/a;->d()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {p1}, Lde/a;->c()Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {p1}, Lde/a;->f()Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {p1}, Lde/a;->e()Ljava/lang/Boolean;

    move-result-object v6

    new-instance p1, Lbc/c;

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v2, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, Lbc/c;-><init>(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method
