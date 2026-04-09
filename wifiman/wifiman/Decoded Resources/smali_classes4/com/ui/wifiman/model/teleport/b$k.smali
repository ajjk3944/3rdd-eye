.class final Lcom/ui/wifiman/model/teleport/b$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/b;->s()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/b$k;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/h;)Lgg/D;
    .locals 4

    const-string v0, "console"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/h;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/h;->j()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TeleportConnection - Connect requested for console "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/h;->y()Lcom/ui/wifiman/model/teleport/n$b;

    move-result-object v0

    instance-of v1, v0, Lcom/ui/wifiman/model/teleport/n$b$b;

    if-nez v1, :cond_3

    instance-of v1, v0, Lcom/ui/wifiman/model/teleport/n$b$a$b;

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v1, v0, Lcom/ui/wifiman/model/teleport/n$b$a$d;

    if-nez v1, :cond_2

    instance-of v1, v0, Lcom/ui/wifiman/model/teleport/n$b$a$c;

    if-nez v1, :cond_2

    instance-of v0, v0, Lcom/ui/wifiman/model/teleport/n$b$a$a;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/model/teleport/b$k;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-static {v0}, Lcom/ui/wifiman/model/teleport/b;->j(Lcom/ui/wifiman/model/teleport/b;)LFd/D;

    move-result-object v0

    invoke-interface {v0}, LFd/D;->getAll()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/teleport/b$k$a;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/teleport/b$k$a;-><init>(Lcom/ui/wifiman/model/teleport/h;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    goto :goto_2

    :cond_3
    :goto_1
    new-instance v0, Ll9/a;

    invoke-direct {v0, v2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object v0

    :goto_2
    new-instance v1, Lcom/ui/wifiman/model/teleport/b$k$b;

    iget-object v2, p0, Lcom/ui/wifiman/model/teleport/b$k;->a:Lcom/ui/wifiman/model/teleport/b;

    invoke-direct {v1, v2, p1}, Lcom/ui/wifiman/model/teleport/b$k$b;-><init>(Lcom/ui/wifiman/model/teleport/b;Lcom/ui/wifiman/model/teleport/h;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/b$k;->a(Lcom/ui/wifiman/model/teleport/h;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
