.class final Lcom/ui/wifiman/model/wmw/j$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/j;-><init>(Landroid/content/Context;Lmc/a;Lcom/ui/wifiman/model/wmw/d;Lcom/ui/wifiman/model/wmw/b$d;LP7/a;LT8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/wmw/j;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/wmw/j;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/j$f;->a:Lcom/ui/wifiman/model/wmw/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/wmw/j$a;)Lgg/r;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/j$a;->a()Lcom/ui/wifiman/model/wmw/b$c;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/j$a;->b()Z

    move-result p1

    instance-of v1, v0, Lcom/ui/wifiman/model/wmw/b$c$c$b;

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/ui/wifiman/model/wmw/j$f;->a:Lcom/ui/wifiman/model/wmw/j;

    invoke-static {p1}, Lcom/ui/wifiman/model/wmw/j;->k(Lcom/ui/wifiman/model/wmw/j;)Lgg/b;

    move-result-object p1

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/j$f;->a:Lcom/ui/wifiman/model/wmw/j;

    move-object v2, v0

    check-cast v2, Lcom/ui/wifiman/model/wmw/b$c$c;

    invoke-static {v1, v2}, Lcom/ui/wifiman/model/wmw/j;->s(Lcom/ui/wifiman/model/wmw/j;Lcom/ui/wifiman/model/wmw/b$c$c;)Lgg/b;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lgg/f;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object v1, v2, p1

    invoke-static {v2}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_0
    instance-of v1, v0, Lcom/ui/wifiman/model/wmw/b$c$c$a;

    if-eqz v1, :cond_2

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/ui/wifiman/model/wmw/j$f;->a:Lcom/ui/wifiman/model/wmw/j;

    move-object v1, v0

    check-cast v1, Lcom/ui/wifiman/model/wmw/b$c$c;

    invoke-static {p1, v1}, Lcom/ui/wifiman/model/wmw/j;->s(Lcom/ui/wifiman/model/wmw/j;Lcom/ui/wifiman/model/wmw/b$c$c;)Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    goto :goto_1

    :cond_2
    instance-of p1, v0, Lcom/ui/wifiman/model/wmw/b$c$d;

    if-nez p1, :cond_4

    instance-of p1, v0, Lcom/ui/wifiman/model/wmw/b$c$b;

    if-nez p1, :cond_4

    instance-of p1, v0, Lcom/ui/wifiman/model/wmw/b$c$a;

    if-nez p1, :cond_4

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    :goto_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_1
    new-instance v1, Lcom/ui/wifiman/model/wmw/j$f$a;

    invoke-direct {v1, v0}, Lcom/ui/wifiman/model/wmw/j$f$a;-><init>(Lcom/ui/wifiman/model/wmw/b$c;)V

    invoke-static {v1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lgg/b;->i(Lgg/r;)Lgg/n;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/wmw/j$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/j$f;->a(Lcom/ui/wifiman/model/wmw/j$a;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
