.class final Li8/q$G0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/q;->m(Li8/a$b;)Lgg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Li8/a$b;

.field final synthetic b:Li8/q;


# direct methods
.method constructor <init>(Li8/a$b;Li8/q;)V
    .locals 0

    iput-object p1, p0, Li8/q$G0;->a:Li8/a$b;

    iput-object p2, p0, Li8/q$G0;->b:Li8/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroid/content/Intent;
    .locals 11

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/ui/core/ui/sso/UiSSO;->a:Lcom/ui/core/ui/sso/UiSSO;

    iget-object v0, p0, Li8/q$G0;->a:Li8/a$b;

    check-cast v0, Li8/a$b$t;

    invoke-virtual {v0}, Li8/a$b$t;->a()Ljava/lang/String;

    move-result-object v4

    new-instance v0, Lcom/ui/core/ui/sso/UiSSO$e;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v2, v3}, Lcom/ui/core/ui/sso/UiSSO$e;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, p0, Li8/q$G0;->b:Li8/q;

    invoke-static {v2}, Li8/q;->d(Li8/q;)Lcom/ubnt/usurvey/a$b;

    move-result-object v2

    invoke-interface {v2}, Lcom/ubnt/usurvey/a$b;->getConfig()Lcom/ubnt/usurvey/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ubnt/usurvey/a;->m()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object v8, v3

    :goto_0
    const/16 v9, 0x2a

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v10}, Lcom/ui/core/ui/sso/UiSSO;->c(Lcom/ui/core/ui/sso/UiSSO;Landroid/content/Context;Lcom/ui/core/ui/sso/UiSSO$c;Ljava/lang/String;Ljava/lang/String;ZLcom/ui/core/ui/sso/UiSSO$g;Lcom/ui/core/ui/sso/UiSSO$e;ILjava/lang/Object;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1}, Li8/q$G0;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method
