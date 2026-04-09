.class final Lca/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lca/d;->c()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lca/d;


# direct methods
.method constructor <init>(Lca/d;)V
    .locals 0

    iput-object p1, p0, Lca/d$c;->a:Lca/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lgg/D;
    .locals 2

    const-string/jumbo v0, "siteKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lca/d$c;->a:Lca/d;

    invoke-static {v0}, Lca/d;->a(Lca/d;)Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;

    move-result-object v0

    invoke-static {p1}, Lca/a;->a(Ljava/lang/String;)Lca/a;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase;->g(Ljava/lang/String;)Lgg/z;

    move-result-object v0

    new-instance v1, Lca/d$c$a;

    invoke-direct {v1, p1}, Lca/d$c$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lca/a;

    invoke-virtual {p1}, Lca/a;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lca/d$c;->a(Ljava/lang/String;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
