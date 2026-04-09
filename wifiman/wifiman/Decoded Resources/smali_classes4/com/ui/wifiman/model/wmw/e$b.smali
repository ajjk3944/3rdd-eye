.class final Lcom/ui/wifiman/model/wmw/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/e;-><init>(Lwc/h;Lcom/ui/wifiman/model/wmw/b$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/e;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/e;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/e$b;->a:Lcom/ui/wifiman/model/wmw/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Ljava/util/Set;
    .locals 10

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/wmw/b;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    check-cast p1, Ljava/lang/Iterable;

    iget-object v4, p0, Lcom/ui/wifiman/model/wmw/e$b;->a:Lcom/ui/wifiman/model/wmw/e;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwc/a;

    invoke-virtual {v5}, Lwc/a;->j()Lxa/a$d;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-interface {v6}, Lxa/a$d;->N()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ubnt/usurvey/product/l;

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    sget-object v7, Lcom/ubnt/usurvey/product/l;->WM_W_d64:Lcom/ubnt/usurvey/product/l;

    if-ne v6, v7, :cond_0

    invoke-virtual {v5}, Lwc/a;->g()J

    move-result-wide v6

    sub-long v6, v2, v6

    const-wide/16 v8, 0x3a98

    cmp-long v6, v6, v8

    if-gez v6, :cond_0

    new-instance v6, Lcom/ui/wifiman/model/wmw/d$a;

    invoke-virtual {v5}, Lwc/a;->h()Lh9/a;

    move-result-object v7

    invoke-virtual {v5}, Lwc/a;->d()Lh9/a;

    move-result-object v8

    invoke-virtual {v5}, Lwc/a;->i()Ljava/lang/String;

    move-result-object v9

    invoke-static {v4, v5, v0}, Lcom/ui/wifiman/model/wmw/e;->c(Lcom/ui/wifiman/model/wmw/e;Lwc/a;Lcom/ui/wifiman/model/wmw/b;)Lcom/ui/wifiman/model/wmw/d$a$a;

    move-result-object v5

    invoke-direct {v6, v7, v8, v9, v5}, Lcom/ui/wifiman/model/wmw/d$a;-><init>(Lh9/a;Lh9/a;Ljava/lang/String;Lcom/ui/wifiman/model/wmw/d$a$a;)V

    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/e$b;->a(LYg/s;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
