.class public final Lcom/ui/wifiman/db/RoomPersistentInstance$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/db/RoomPersistentInstance;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/db/RoomPersistentInstance$a;

.field final synthetic b:Lcom/ui/wifiman/db/RoomPersistentInstance;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;Lcom/ui/wifiman/db/RoomPersistentInstance;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/db/RoomPersistentInstance$e;->a:Lcom/ui/wifiman/db/RoomPersistentInstance$a;

    iput-object p2, p0, Lcom/ui/wifiman/db/RoomPersistentInstance$e;->b:Lcom/ui/wifiman/db/RoomPersistentInstance;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/db/RoomPersistentInstance$e;->a:Lcom/ui/wifiman/db/RoomPersistentInstance$a;

    new-instance v1, Lcom/ui/wifiman/db/RoomPersistentInstance$b;

    iget-object v2, p0, Lcom/ui/wifiman/db/RoomPersistentInstance$e;->b:Lcom/ui/wifiman/db/RoomPersistentInstance;

    invoke-direct {v1, v2}, Lcom/ui/wifiman/db/RoomPersistentInstance$b;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance;)V

    invoke-virtual {v0, v1}, Lcom/ui/wifiman/db/RoomPersistentInstance$a;->c(Lmh/a;)V

    iget-object v0, p0, Lcom/ui/wifiman/db/RoomPersistentInstance$e;->a:Lcom/ui/wifiman/db/RoomPersistentInstance$a;

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
