.class final Lcom/ui/wmw/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/k;-><init>(Ljava/lang/String;Lcom/ui/wmw/api/v1/a;LKf/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wmw/k;


# direct methods
.method constructor <init>(Lcom/ui/wmw/k;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/k$a;->a:Lcom/ui/wmw/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wmw/api/v1/b;)Lgg/f;
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wmw/api/v1/b$d;

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ui/wmw/k$a;->a:Lcom/ui/wmw/k;

    new-instance v2, Lcom/ui/wmw/k$a$b;

    invoke-direct {v2, v0, p1}, Lcom/ui/wmw/k$a$b;-><init>(Lcom/ui/wmw/k;Lcom/ui/wmw/api/v1/b;)V

    invoke-static {v2}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wmw/api/v1/b$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ui/wmw/k$a;->a:Lcom/ui/wmw/k;

    new-instance v2, Lcom/ui/wmw/k$a$c;

    invoke-direct {v2, v0, p1}, Lcom/ui/wmw/k$a$c;-><init>(Lcom/ui/wmw/k;Lcom/ui/wmw/api/v1/b;)V

    invoke-static {v2}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/ui/wmw/api/v1/b$a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/ui/wmw/k$a;->a:Lcom/ui/wmw/k;

    new-instance v2, Lcom/ui/wmw/k$a$d;

    invoke-direct {v2, v0, p1}, Lcom/ui/wmw/k$a$d;-><init>(Lcom/ui/wmw/k;Lcom/ui/wmw/api/v1/b;)V

    invoke-static {v2}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lcom/ui/wmw/api/v1/b$c;

    if-eqz v0, :cond_3

    iget-object p1, p0, Lcom/ui/wmw/k$a;->a:Lcom/ui/wmw/k;

    invoke-static {p1}, Lcom/ui/wmw/k;->f(Lcom/ui/wmw/k;)Lcom/ui/wmw/api/v1/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wmw/api/v1/a;->c()Lgg/z;

    move-result-object p1

    new-instance v0, Lcom/ui/wmw/k$a$a;

    iget-object v1, p0, Lcom/ui/wmw/k$a;->a:Lcom/ui/wmw/k;

    invoke-direct {v0, v1}, Lcom/ui/wmw/k$a$a;-><init>(Lcom/ui/wmw/k;)V

    invoke-virtual {p1, v0}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_3
    instance-of p1, p1, Lcom/ui/wmw/api/v1/b$e;

    if-eqz p1, :cond_4

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wmw/api/v1/b;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/k$a;->a(Lcom/ui/wmw/api/v1/b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
