.class final Lcom/ubnt/usurvey/ui/signal/strength/c$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/strength/c;-><init>(Lje/u;Ly8/p;Ly8/d;Ly8/n;Ly8/m;LCd/f;Ly8/v;Lde/z;Lre/a;Li8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/usurvey/ui/signal/strength/c$k$b;
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/usurvey/ui/signal/strength/c;


# direct methods
.method constructor <init>(Lcom/ubnt/usurvey/ui/signal/strength/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$k;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgc/b;)LDj/a;
    .locals 2

    const-string/jumbo v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ubnt/usurvey/ui/signal/strength/c$k$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    const-string/jumbo v1, "just(...)"

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    new-instance p1, Ll9/a;

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$k;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    invoke-static {v0}, Lcom/ubnt/usurvey/ui/signal/strength/c;->h(Lcom/ubnt/usurvey/ui/signal/strength/c;)Ly8/m;

    move-result-object v0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ll9/a;

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$k;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    invoke-static {v0}, Lcom/ubnt/usurvey/ui/signal/strength/c;->i(Lcom/ubnt/usurvey/ui/signal/strength/c;)Ly8/n;

    move-result-object v0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$k;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    invoke-static {p1}, Lcom/ubnt/usurvey/ui/signal/strength/c;->n(Lcom/ubnt/usurvey/ui/signal/strength/c;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/strength/c$k$a;

    iget-object v1, p0, Lcom/ubnt/usurvey/ui/signal/strength/c$k;->a:Lcom/ubnt/usurvey/ui/signal/strength/c;

    invoke-direct {v0, v1}, Lcom/ubnt/usurvey/ui/signal/strength/c$k$a;-><init>(Lcom/ubnt/usurvey/ui/signal/strength/c;)V

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgc/b;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/c$k;->a(Lgc/b;)LDj/a;

    move-result-object p1

    return-object p1
.end method
