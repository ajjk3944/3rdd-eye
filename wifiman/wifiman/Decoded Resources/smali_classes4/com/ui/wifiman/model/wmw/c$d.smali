.class public final Lcom/ui/wifiman/model/wmw/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/c;->b(Lcom/ui/wifiman/model/wmw/b;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/b;

.field final synthetic b:Lcom/ui/wifiman/model/wmw/c;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/wmw/b;Lcom/ui/wifiman/model/wmw/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/c$d;->a:Lcom/ui/wifiman/model/wmw/b;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/c$d;->b:Lcom/ui/wifiman/model/wmw/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/c$d;->a:Lcom/ui/wifiman/model/wmw/b;

    instance-of v1, v0, Lcom/ui/wifiman/model/wmw/b$b;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/c$d;->b:Lcom/ui/wifiman/model/wmw/c;

    invoke-static {v0}, Lcom/ui/wifiman/model/wmw/c;->c(Lcom/ui/wifiman/model/wmw/c;)Lcc/b;

    move-result-object v0

    invoke-interface {v0, v2}, Lcc/b;->b(Lcc/a;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    instance-of v1, v0, Lcom/ui/wifiman/model/wmw/b$a$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v3, ""

    if-eqz v1, :cond_1

    :try_start_1
    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/c$d;->b:Lcom/ui/wifiman/model/wmw/c;

    invoke-static {v0}, Lcom/ui/wifiman/model/wmw/c;->c(Lcom/ui/wifiman/model/wmw/c;)Lcc/b;

    move-result-object v0

    new-instance v1, Lcc/a;

    iget-object v4, p0, Lcom/ui/wifiman/model/wmw/c$d;->a:Lcom/ui/wifiman/model/wmw/b;

    check-cast v4, Lcom/ui/wifiman/model/wmw/b$a$a;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/wmw/b$a$a;->a()Lh9/a;

    move-result-object v4

    invoke-virtual {v4, v3}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/ui/wifiman/model/wmw/c$d;->a:Lcom/ui/wifiman/model/wmw/b;

    check-cast v4, Lcom/ui/wifiman/model/wmw/b$a$a;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/wmw/b$a$a;->b()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    invoke-direct {v1, v5, v3, v4, v2}, Lcc/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcc/b;->b(Lcc/a;)V

    goto :goto_0

    :cond_1
    instance-of v0, v0, Lcom/ui/wifiman/model/wmw/b$a$b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/c$d;->b:Lcom/ui/wifiman/model/wmw/c;

    invoke-static {v0}, Lcom/ui/wifiman/model/wmw/c;->c(Lcom/ui/wifiman/model/wmw/c;)Lcc/b;

    move-result-object v0

    new-instance v1, Lcc/a;

    iget-object v4, p0, Lcom/ui/wifiman/model/wmw/c$d;->a:Lcom/ui/wifiman/model/wmw/b;

    check-cast v4, Lcom/ui/wifiman/model/wmw/b$a$b;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/wmw/b$a$b;->a()Lh9/a;

    move-result-object v4

    invoke-virtual {v4, v3}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/ui/wifiman/model/wmw/c$d;->a:Lcom/ui/wifiman/model/wmw/b;

    check-cast v4, Lcom/ui/wifiman/model/wmw/b$a$b;

    invoke-virtual {v4}, Lcom/ui/wifiman/model/wmw/b$a$b;->b()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v1, v5, v3, v4, v2}, Lcc/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcc/b;->b(Lcc/a;)V

    :goto_0
    invoke-interface {p1}, Lgg/c;->a()V

    goto :goto_2

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
