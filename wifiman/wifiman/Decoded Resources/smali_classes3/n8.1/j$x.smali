.class final Ln8/j$x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/j;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln8/j;


# direct methods
.method constructor <init>(Ln8/j;)V
    .locals 0

    iput-object p1, p0, Ln8/j$x;->a:Ln8/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LJe/b;)LDj/a;
    .locals 4

    const-string/jumbo v0, "topic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LAg/c;->a:LAg/c;

    iget-object v0, p0, Ln8/j$x;->a:Ln8/j;

    invoke-static {v0}, Ln8/j;->D0(Ln8/j;)Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;

    move-result-object v0

    invoke-interface {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/UiSSOAccountManager;->e()Lgg/i;

    move-result-object v0

    sget-object v1, Ln8/j$x$a;->a:Ln8/j$x$a;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    const-string/jumbo v1, "distinctUntilChanged(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Ln8/j$x;->a:Ln8/j;

    invoke-static {v2}, Ln8/j;->A0(Ln8/j;)LSd/d;

    move-result-object v2

    invoke-interface {v2}, LSd/d;->b()Lgg/i;

    move-result-object v2

    sget-object v3, Ln8/j$x$b;->a:Ln8/j$x$b;

    invoke-virtual {v2, v3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->W()Lgg/i;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Ln8/j$x;->a:Ln8/j;

    invoke-static {v1}, Ln8/j;->z0(Ln8/j;)Lgg/i;

    move-result-object v1

    invoke-virtual {p1, v0, v2, v1}, LAg/c;->b(Lgg/i;Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p1

    new-instance v0, Ln8/j$x$c;

    iget-object v1, p0, Ln8/j$x;->a:Ln8/j;

    invoke-direct {v0, v1}, Ln8/j$x$c;-><init>(Ln8/j;)V

    invoke-virtual {p1, v0}, Lgg/i;->N1(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJe/b;

    invoke-virtual {p0, p1}, Ln8/j$x;->a(LJe/b;)LDj/a;

    move-result-object p1

    return-object p1
.end method
