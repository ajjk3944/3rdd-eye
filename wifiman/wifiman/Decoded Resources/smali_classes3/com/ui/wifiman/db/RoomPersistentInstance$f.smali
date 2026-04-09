.class final Lcom/ui/wifiman/db/RoomPersistentInstance$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/db/RoomPersistentInstance;->a(Lmh/l;)Lgg/b;
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

    iput-object p1, p0, Lcom/ui/wifiman/db/RoomPersistentInstance$f;->a:Lcom/ui/wifiman/db/RoomPersistentInstance;

    iput-object p2, p0, Lcom/ui/wifiman/db/RoomPersistentInstance$f;->b:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/db/RoomPersistentInstance$f;->a:Lcom/ui/wifiman/db/RoomPersistentInstance;

    iget-object v1, p0, Lcom/ui/wifiman/db/RoomPersistentInstance$f;->b:Lmh/l;

    new-instance v2, Lcom/ui/wifiman/db/RoomPersistentInstance$f$d;

    invoke-direct {v2, p1, v0, v1}, Lcom/ui/wifiman/db/RoomPersistentInstance$f$d;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;Lcom/ui/wifiman/db/RoomPersistentInstance;Lmh/l;)V

    invoke-static {v2}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/wifiman/db/RoomPersistentInstance$f$c;->a:Lcom/ui/wifiman/db/RoomPersistentInstance$f$c;

    invoke-virtual {p1, v0}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->y()Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/db/RoomPersistentInstance$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance$f;->a(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
