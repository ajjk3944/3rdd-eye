.class final Lba/t$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lba/t;->T0(Ljava/lang/String;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lba/t;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lba/t;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lba/t$c;->a:Lba/t;

    iput-object p2, p0, Lba/t$c;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lca/d$a;)Lgg/D;
    .locals 4

    const-string/jumbo v0, "recaptcha"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lba/t$c;->a:Lba/t;

    invoke-static {v0}, Lba/t;->E0(Lba/t;)Lcom/ui/core/ui/sso/SSOAccountVM;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/SSOAccountVM;->r0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->g()LAb/a;

    move-result-object v0

    iget-object v1, p0, Lba/t$c;->b:Ljava/lang/String;

    new-instance v2, LEb/h;

    invoke-virtual {p1}, Lca/d$a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lca/d$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v3, p1}, LEb/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1, v2}, LAb/a;->f(Ljava/lang/String;LEb/h;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lca/d$a;

    invoke-virtual {p0, p1}, Lba/t$c;->a(Lca/d$a;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
