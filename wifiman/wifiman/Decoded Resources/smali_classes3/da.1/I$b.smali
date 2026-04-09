.class final Lda/I$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/I;->S0()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lda/I;


# direct methods
.method constructor <init>(Lda/I;)V
    .locals 0

    iput-object p1, p0, Lda/I$b;->a:Lda/I;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lca/d$a;)Lgg/f;
    .locals 3

    const-string/jumbo v0, "recaptcha"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lda/I$b;->a:Lda/I;

    invoke-static {v0}, Lda/I;->P0(Lda/I;)Lcom/ui/core/ui/sso/SSOAccountVM;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->g()LAb/a;

    move-result-object v0

    invoke-interface {v0}, LAb/a;->d()Lgg/z;

    move-result-object v0

    new-instance v1, Lda/I$b$a;

    iget-object v2, p0, Lda/I$b;->a:Lda/I;

    invoke-direct {v1, v2, p1}, Lda/I$b$a;-><init>(Lda/I;Lca/d$a;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lca/d$a;

    invoke-virtual {p0, p1}, Lda/I$b;->a(Lca/d$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
