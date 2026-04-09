.class final Lcom/ui/wifiman/model/teleport/b$k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/b$k;->a(Lcom/ui/wifiman/model/teleport/h;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/h;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/h;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/b$k$a;->a:Lcom/ui/wifiman/model/teleport/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ll9/a;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/b$k$a;->a:Lcom/ui/wifiman/model/teleport/h;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/ui/wifiman/model/teleport/n;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/teleport/n;->a()LKd/a;

    move-result-object v2

    invoke-virtual {v2}, LKd/a;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/ui/wifiman/model/teleport/h;->z()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    invoke-static {v2, v3}, Lcom/ubnt/teleport/TeleportTunnel$d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_0

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    new-instance p1, Ll9/a;

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/b$k$a;->a(Ljava/util/List;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
