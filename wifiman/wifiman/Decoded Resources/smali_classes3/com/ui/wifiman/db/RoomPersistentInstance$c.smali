.class final Lcom/ui/wifiman/db/RoomPersistentInstance$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/db/RoomPersistentInstance;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/db/RoomPersistentInstance;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/db/RoomPersistentInstance;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/db/RoomPersistentInstance$c;->a:Lcom/ui/wifiman/db/RoomPersistentInstance;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)LDj/a;
    .locals 2

    const-string/jumbo v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/db/RoomPersistentInstance$a;->e()Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/db/RoomPersistentInstance$c$a;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance$c$a;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/db/RoomPersistentInstance$c$b;

    iget-object v1, p0, Lcom/ui/wifiman/db/RoomPersistentInstance$c;->a:Lcom/ui/wifiman/db/RoomPersistentInstance;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/db/RoomPersistentInstance$c$b;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance;)V

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/db/RoomPersistentInstance$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance$c;->a(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
