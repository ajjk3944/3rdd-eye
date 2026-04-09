.class final LUc/i$p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUc/i$p;->a(LUc/i$b;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LUc/i;

.field final synthetic b:LUc/i$c;


# direct methods
.method constructor <init>(LUc/i;LUc/i$c;)V
    .locals 0

    iput-object p1, p0, LUc/i$p$a;->a:LUc/i;

    iput-object p2, p0, LUc/i$p$a;->b:LUc/i$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LVc/g;)LUc/e$a;
    .locals 4

    const-string v0, "xmlDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LUc/i$p$a;->a:LUc/i;

    invoke-static {v0}, LUc/i;->h(LUc/i;)Lcom/ui/wifiman/model/vendor/d$b;

    move-result-object v0

    iget-object v1, p0, LUc/i$p$a;->b:LUc/i$c;

    invoke-virtual {v1}, LUc/i$c;->b()Linet/ipaddr/g;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {p1, v0, v1, v2, v3}, LVc/b;->d(LVc/g;Lcom/ui/wifiman/model/vendor/d$b;Linet/ipaddr/g;J)LVc/a;

    move-result-object p1

    invoke-virtual {p1}, LVc/a;->g()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, LUc/i$p$a;->a:LUc/i;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LUc/a;

    invoke-static {v1, v2}, LUc/i;->g(LUc/i;LUc/a;)LCc/b;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    new-instance v0, LUc/e$a;

    invoke-direct {v0, p1, v2}, LUc/e$a;-><init>(LUc/a;LCc/b;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LVc/g;

    invoke-virtual {p0, p1}, LUc/i$p$a;->a(LVc/g;)LUc/e$a;

    move-result-object p1

    return-object p1
.end method
