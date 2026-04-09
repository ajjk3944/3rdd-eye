.class final Lcom/ui/wifiman/db/RoomPersistentInstance$c$b;
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
.field final synthetic a:Lcom/ui/wifiman/db/RoomPersistentInstance;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/db/RoomPersistentInstance;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/db/RoomPersistentInstance$c$b;->a:Lcom/ui/wifiman/db/RoomPersistentInstance;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/db/RoomPersistentInstance$c$b;->a:Lcom/ui/wifiman/db/RoomPersistentInstance;

    invoke-virtual {v0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
