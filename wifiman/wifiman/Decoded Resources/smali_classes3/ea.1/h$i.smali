.class final Lea/h$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lea/h;->k0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lea/h;


# direct methods
.method constructor <init>(Lea/h;)V
    .locals 0

    iput-object p1, p0, Lea/h$i;->a:Lea/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lca/d$a;)Lgg/f;
    .locals 4

    const-string/jumbo v0, "recaptcha"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lea/h$i;->a:Lea/h;

    invoke-static {v0}, Lea/h;->o0(Lea/h;)Lcom/ui/core/ui/sso/SSOAccountVM;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->g()LAb/a;

    move-result-object v0

    iget-object v1, p0, Lea/h$i;->a:Lea/h;

    invoke-virtual {v1}, Lea/h;->f0()LLi/z;

    move-result-object v1

    invoke-interface {v1}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, LEb/o;

    invoke-virtual {p1}, Lca/d$a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lca/d$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v3, p1}, LEb/o;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2}, LAb/a;->b(Ljava/lang/String;LEb/o;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lca/d$a;

    invoke-virtual {p0, p1}, Lea/h$i;->a(Lca/d$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
