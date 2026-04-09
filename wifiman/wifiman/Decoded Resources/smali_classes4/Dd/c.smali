.class public final LDd/c;
.super Lcom/ui/wifiman/db/RoomPersistentInstance;
.source "SourceFile"

# interfaces
.implements LDd/b;


# direct methods
.method public constructor <init>(LZb/a;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZb/c;

    invoke-virtual {p0, p1}, LDd/c;->h(LZb/c;)LDd/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LDd/c;->i()LDd/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LDd/a;

    invoke-virtual {p0, p1}, LDd/c;->j(LDd/a;)LZb/c;

    move-result-object p1

    return-object p1
.end method

.method protected h(LZb/c;)LDd/a;
    .locals 2

    const-string v0, "persistent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LDd/a;

    invoke-virtual {p1}, LZb/c;->c()Z

    move-result v1

    invoke-virtual {p1}, LZb/c;->a()Z

    move-result p1

    invoke-direct {v0, v1, p1}, LDd/a;-><init>(ZZ)V

    return-object v0
.end method

.method protected i()LDd/a;
    .locals 3

    new-instance v0, LDd/a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LDd/a;-><init>(ZZ)V

    return-object v0
.end method

.method protected j(LDd/a;)LZb/c;
    .locals 7

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LZb/c;

    invoke-virtual {p1}, LDd/a;->d()Z

    move-result v3

    invoke-virtual {p1}, LDd/a;->c()Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LZb/c;-><init>(IZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
