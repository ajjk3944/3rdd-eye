.class public abstract Lcom/ui/wifiman/db/RoomPersistentInstance;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/db/RoomPersistentInstance$a;,
        Lcom/ui/wifiman/db/RoomPersistentInstance$Error;
    }
.end annotation


# instance fields
.field private final a:Lgg/z;

.field private final b:Lgg/i;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;)V
    .locals 1

    const-string/jumbo v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/ui/wifiman/db/RoomPersistentInstance$e;

    invoke-direct {v0, p1, p0}, Lcom/ui/wifiman/db/RoomPersistentInstance$e;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance$a;Lcom/ui/wifiman/db/RoomPersistentInstance;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->e()Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "cache(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/db/RoomPersistentInstance;->a:Lgg/z;

    new-instance v0, Lcom/ui/wifiman/db/RoomPersistentInstance$c;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/db/RoomPersistentInstance$c;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance;)V

    invoke-virtual {p1, v0}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "distinctUntilChanged(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/db/RoomPersistentInstance$d;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/db/RoomPersistentInstance$d;-><init>(Ljava/lang/Object;)V

    invoke-static {p1, v0}, Ln9/c;->c(Lgg/i;Lmh/l;)Lgg/i;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/db/RoomPersistentInstance;->b:Lgg/i;

    return-void
.end method


# virtual methods
.method public final a(Lmh/l;)Lgg/b;
    .locals 2

    const-string/jumbo v0, "updater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/db/RoomPersistentInstance;->a:Lgg/z;

    new-instance v1, Lcom/ui/wifiman/db/RoomPersistentInstance$f;

    invoke-direct {v1, p0, p1}, Lcom/ui/wifiman/db/RoomPersistentInstance$f;-><init>(Lcom/ui/wifiman/db/RoomPersistentInstance;Lmh/l;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->L(Lgg/y;)Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "observeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/db/RoomPersistentInstance;->b:Lgg/i;

    return-object v0
.end method

.method protected d(Ljava/lang/Object;)Lgg/b;
    .locals 1

    const-string/jumbo v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    const-string/jumbo v0, "complete(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected abstract e(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method protected abstract f()Ljava/lang/Object;
.end method

.method protected abstract g(Ljava/lang/Object;)Ljava/lang/Object;
.end method
