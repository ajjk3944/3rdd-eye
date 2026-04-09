.class final synthetic Lcom/ui/wifiman/db/RoomPersistentInstance$d;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/db/RoomPersistentInstance;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string/jumbo v5, "doOnNextInstance(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/Completable;"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-class v3, Lcom/ui/wifiman/db/RoomPersistentInstance;

    const-string/jumbo v4, "doOnNextInstance"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lgg/b;
    .locals 1

    const-string/jumbo v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/f;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/ui/wifiman/db/RoomPersistentInstance;

    invoke-virtual {v0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance;->d(Ljava/lang/Object;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance$d;->a(Ljava/lang/Object;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
