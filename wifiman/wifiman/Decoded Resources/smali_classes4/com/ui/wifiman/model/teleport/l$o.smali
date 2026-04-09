.class final Lcom/ui/wifiman/model/teleport/l$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/l;-><init>(LFd/D;LI7/a;LKd/d;LKd/b;LZc/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/teleport/l;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/teleport/l;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/teleport/l$o;->a:Lcom/ui/wifiman/model/teleport/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lgg/f;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/teleport/l$d;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/l$d;->a()LWc/b;

    move-result-object v1

    instance-of v2, v1, LWc/b$c;

    if-nez v2, :cond_2

    instance-of v2, v1, LWc/b$b;

    if-nez v2, :cond_2

    instance-of v2, v1, LWc/b$a$a;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, v1, LWc/b$a$b;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ui/wifiman/model/teleport/l$o;->a:Lcom/ui/wifiman/model/teleport/l;

    invoke-static {v1}, Lcom/ui/wifiman/model/teleport/l;->c(Lcom/ui/wifiman/model/teleport/l;)LKd/b;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/l$d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/l$d;->a()LWc/b;

    move-result-object v3

    check-cast v3, LWc/b$a$b;

    invoke-virtual {v3}, LWc/b$a$b;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    invoke-interface {v1, v2, v3}, LKd/b;->a(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)Lgg/z;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/model/teleport/l$o$a;

    iget-object v3, p0, Lcom/ui/wifiman/model/teleport/l$o;->a:Lcom/ui/wifiman/model/teleport/l;

    invoke-direct {v2, v0, p1, v3}, Lcom/ui/wifiman/model/teleport/l$o$a;-><init>(Ljava/util/Map;Lcom/ui/wifiman/model/teleport/l$d;Lcom/ui/wifiman/model/teleport/l;)V

    invoke-virtual {v1, v2}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/l$o;->a(LYg/s;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
