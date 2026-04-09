.class final Li8/r$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/r;-><init>(Li8/a;Li8/s$d;Lcom/ubnt/usurvey/ui/teleport/deeplink/a;LN8/a;)V
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

    iput-object p1, p0, Li8/r$b;->a:Li8/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)LDj/a;
    .locals 2

    const-string/jumbo v0, "appWizardRequired"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Li8/r$b;->a:Li8/r;

    invoke-static {p1}, Li8/r;->c(Li8/r;)Li8/s$d;

    move-result-object p1

    invoke-interface {p1}, Li8/s$d;->b()Lgg/i;

    move-result-object p1

    new-instance v0, Li8/r$b$a;

    iget-object v1, p0, Li8/r$b;->a:Li8/r;

    invoke-direct {v0, v1}, Li8/r$b$a;-><init>(Li8/r;)V

    invoke-virtual {p1, v0}, Lgg/i;->M1(Lkg/n;)Lgg/i;

    move-result-object p1

    new-instance v0, Li8/r$b$b;

    iget-object v1, p0, Li8/r$b;->a:Li8/r;

    invoke-direct {v0, v1}, Li8/r$b$b;-><init>(Li8/r;)V

    invoke-virtual {p1, v0}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Li8/r$b;->a(Ljava/lang/Boolean;)LDj/a;

    move-result-object p1

    return-object p1
.end method
