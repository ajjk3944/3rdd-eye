.class final Lld/c$a;
.super Lcom/ui/wifiman/db/RoomPersistentInstance;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lld/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(LUb/a;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LUb/c;

    invoke-virtual {p0, p1}, Lld/c$a;->h(LUb/c;)Lld/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lld/c$a;->i()Lld/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lld/a;

    invoke-virtual {p0, p1}, Lld/c$a;->j(Lld/a;)LUb/c;

    move-result-object p1

    return-object p1
.end method

.method protected h(LUb/c;)Lld/a;
    .locals 1

    const-string v0, "persistent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lld/a;

    invoke-virtual {p1}, LUb/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lld/a;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method protected i()Lld/a;
    .locals 3

    new-instance v0, Lld/a;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lld/a;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method protected j(Lld/a;)LUb/c;
    .locals 4

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LUb/c;

    invoke-virtual {p1}, Lld/a;->a()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, p1, v1, v2}, LUb/c;-><init>(ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
