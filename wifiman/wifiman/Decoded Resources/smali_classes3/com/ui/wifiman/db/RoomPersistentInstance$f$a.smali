.class final Lcom/ui/wifiman/db/RoomPersistentInstance$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/db/RoomPersistentInstance$f;->a(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/db/RoomPersistentInstance;

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/db/RoomPersistentInstance;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/db/RoomPersistentInstance$f$a;->a:Lcom/ui/wifiman/db/RoomPersistentInstance;

    iput-object p2, p0, Lcom/ui/wifiman/db/RoomPersistentInstance$f$a;->b:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/db/RoomPersistentInstance$f$a;->a:Lcom/ui/wifiman/db/RoomPersistentInstance;

    iget-object v1, p0, Lcom/ui/wifiman/db/RoomPersistentInstance$f$a;->b:Lmh/l;

    invoke-virtual {v0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
