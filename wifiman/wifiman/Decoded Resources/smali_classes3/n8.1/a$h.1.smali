.class final Ln8/a$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/a;-><init>(Lorg/kodein/di/DI;Ln8/a$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln8/a;


# direct methods
.method constructor <init>(Ln8/a;)V
    .locals 0

    iput-object p1, p0, Ln8/a$h;->a:Ln8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LCc/a;)Ljava/util/List;
    .locals 10

    const-string/jumbo v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v9, p0, Ln8/a$h;->a:Ln8/a;

    invoke-static {v9, p1}, Ln8/a;->q(Ln8/a;LCc/a;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-interface {p1}, LCc/a;->j()LDc/j;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LDc/j;->B()Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$a;->i()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;->d()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ls9/d$c;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;->e()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;->f()Lgd/a;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lgd/a;->a()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    new-instance v6, Ls9/d$c;

    invoke-direct {v6, v4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_0
    move-object v6, v5

    :goto_1
    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;->f()Lgd/a;

    move-result-object v7

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Lgd/a;->d()Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :cond_1
    move-object v7, v5

    :goto_2
    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move-object v4, v6

    goto :goto_3

    :cond_2
    move-object v4, v5

    :goto_3
    new-instance v5, Ls9/d$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/a$b;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const v6, 0x7f110091

    invoke-direct {v5, v6, v1}, Ls9/d$b;-><init>(ILjava/util/List;)V

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, v9

    invoke-static/range {v1 .. v8}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCc/a;

    invoke-virtual {p0, p1}, Ln8/a$h;->a(LCc/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
