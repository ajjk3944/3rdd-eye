.class final Lcom/ubnt/usurvey/ui/signal/strength/c$k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/strength/c$k;->a(Lgc/b;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/usurvey/ui/signal/strength/c;


# direct methods
.method constructor <init>(Lcom/ubnt/usurvey/ui/signal/strength/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$k$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)Ll9/a;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ll9/a;

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$k$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    invoke-static {v0}, Lcom/ubnt/usurvey/ui/signal/strength/c;->g(Lcom/ubnt/usurvey/ui/signal/strength/c;)Ly8/d;

    move-result-object v0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ll9/a;

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$k$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    invoke-static {v0}, Lcom/ubnt/usurvey/ui/signal/strength/c;->j(Lcom/ubnt/usurvey/ui/signal/strength/c;)Ly8/p;

    move-result-object v0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/c$k$a;->a(Ljava/lang/Boolean;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
