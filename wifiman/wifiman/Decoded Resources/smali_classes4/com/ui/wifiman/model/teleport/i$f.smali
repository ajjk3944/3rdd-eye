.class final Lcom/ui/wifiman/model/teleport/i$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/i;-><init>(Lcom/ui/wifiman/model/teleport/session/TeleportSession;LFd/D;Lcom/ui/wifiman/model/teleport/k;LLd/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/i;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/i;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/i$f;->a:Lcom/ui/wifiman/model/teleport/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lgg/f;
    .locals 5

    const-string v0, "consoles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/teleport/h;->C()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    if-nez v2, :cond_2

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    new-instance p1, Lcom/ui/wifiman/model/teleport/i$f$a;

    invoke-direct {p1}, Lcom/ui/wifiman/model/teleport/i$f$a;-><init>()V

    sget-object v1, Lcom/ui/wifiman/model/teleport/h;->a:Lcom/ui/wifiman/model/teleport/h$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/teleport/h$b;->a()Ljava/util/Comparator;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Comparator;->thenComparing(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p1

    const-string v1, "thenComparing(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/h;->j()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "There is currently no main console set, but there are Ubiquiti Consoles available. Setting $"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " as main console"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v3, v1, v3}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/i$f;->a:Lcom/ui/wifiman/model/teleport/i;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/i;->c(Lcom/ui/wifiman/model/teleport/i;)LFd/D;

    move-result-object v0

    invoke-interface {v0, p1}, LFd/D;->b(Ljava/lang/String;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/i$f;->a(Ljava/util/List;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
