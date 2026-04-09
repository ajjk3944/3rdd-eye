.class final Lcom/ui/wifiman/db/RoomPersistentInstance$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/db/RoomPersistentInstance$c;->a(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/db/RoomPersistentInstance$a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/db/RoomPersistentInstance$c$a;->a:Lcom/ui/wifiman/db/RoomPersistentInstance$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/lang/Object;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Lcom/ui/wifiman/db/RoomPersistentInstance$Error$NotInitialized;

    iget-object v0, p0, Lcom/ui/wifiman/db/RoomPersistentInstance$c$a;->a:Lcom/ui/wifiman/db/RoomPersistentInstance$a;

    invoke-virtual {v0}, Lcom/ui/wifiman/db/RoomPersistentInstance$a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/ui/wifiman/db/RoomPersistentInstance$Error$NotInitialized;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance$c$a;->a(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
