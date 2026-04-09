.class final Li8/r$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/r$b;->a(Ljava/lang/Boolean;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Li8/r;


# direct methods
.method constructor <init>(Li8/r;)V
    .locals 0

    iput-object p1, p0, Li8/r$b$b;->a:Li8/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Li8/s;)Lgg/r;
    .locals 2

    const-string/jumbo v0, "deepLink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Li8/s$c;

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    if-eqz v0, :cond_0

    new-instance v0, Li8/r$b$b$a;

    invoke-direct {v0, p1}, Li8/r$b$b$a;-><init>(Li8/s;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Li8/s$g;

    if-eqz v0, :cond_1

    new-instance v0, Li8/r$b$b$b;

    invoke-direct {v0, p1}, Li8/r$b$b$b;-><init>(Li8/s;)V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Li8/s$f;

    if-eqz v0, :cond_2

    iget-object v0, p0, Li8/r$b$b;->a:Li8/r;

    invoke-static {v0}, Li8/r;->b(Li8/r;)Lcom/ubnt/usurvey/ui/teleport/deeplink/a;

    move-result-object v0

    check-cast p1, Li8/s$f;

    invoke-interface {v0, p1}, Lcom/ubnt/usurvey/ui/teleport/deeplink/a;->b(Li8/s$f;)Lgg/b;

    move-result-object p1

    new-instance v0, Li8/r$b$b$c;

    invoke-direct {v0}, Li8/r$b$b$c;-><init>()V

    invoke-static {v0}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lgg/b;->i(Lgg/r;)Lgg/n;

    move-result-object p1

    const-string/jumbo v0, "andThen(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    instance-of p1, p1, Li8/s$e$a;

    if-eqz p1, :cond_3

    new-instance p1, Li8/r$b$b$d;

    invoke-direct {p1}, Li8/r$b$b$d;-><init>()V

    invoke-static {p1}, Lgg/n;->c(Lgg/q;)Lgg/n;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li8/s;

    invoke-virtual {p0, p1}, Li8/r$b$b;->a(Li8/s;)Lgg/r;

    move-result-object p1

    return-object p1
.end method
