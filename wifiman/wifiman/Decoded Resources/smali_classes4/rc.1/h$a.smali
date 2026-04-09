.class final Lrc/h$a;
.super Lcom/ui/wifiman/db/RoomPersistentInstance;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrc/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(LMb/a;)V
    .locals 1

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LMb/c;

    invoke-virtual {p0, p1}, Lrc/h$a;->h(LMb/c;)LMb/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lrc/h$a;->i()LMb/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LMb/c;

    invoke-virtual {p0, p1}, Lrc/h$a;->j(LMb/c;)LMb/c;

    move-result-object p1

    return-object p1
.end method

.method protected h(LMb/c;)LMb/c;
    .locals 1

    const-string v0, "persistent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected i()LMb/c;
    .locals 3

    new-instance v0, LMb/c;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v1, v2, v1}, LMb/c;-><init>(IILjava/lang/Long;Z)V

    return-object v0
.end method

.method protected j(LMb/c;)LMb/c;
    .locals 1

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
