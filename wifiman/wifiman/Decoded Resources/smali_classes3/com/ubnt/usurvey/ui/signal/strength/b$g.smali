.class final Lcom/ubnt/usurvey/ui/signal/strength/b$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/strength/b;-><init>(LBc/a;Lde/z;Lcom/ui/wifiman/model/android/permissions/d;Ly8/g;Ly8/k;Ly8/u;Li8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/usurvey/ui/signal/strength/b;


# direct methods
.method constructor <init>(Lcom/ubnt/usurvey/ui/signal/strength/b;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/b$g;->a:Lcom/ubnt/usurvey/ui/signal/strength/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/usurvey/ui/signal/strength/b$b;)LDj/a;
    .locals 3

    const-string/jumbo v0, "cntType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ubnt/usurvey/ui/signal/strength/b$b$a$b$b;

    const-string/jumbo v1, "just(...)"

    if-eqz v0, :cond_0

    new-instance p1, Ll9/a;

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/b$g;->a:Lcom/ubnt/usurvey/ui/signal/strength/b;

    sget-object v2, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->LOCATION_DISABLED:Lcom/ubnt/usurvey/ui/signal/strength/b$c;

    invoke-static {v0, v2}, Lcom/ubnt/usurvey/ui/signal/strength/b;->e(Lcom/ubnt/usurvey/ui/signal/strength/b;Lcom/ubnt/usurvey/ui/signal/strength/b$c;)LTe/K0$f;

    move-result-object v0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/ubnt/usurvey/ui/signal/strength/b$b$a$b$c;

    if-eqz v0, :cond_1

    new-instance p1, Ll9/a;

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/b$g;->a:Lcom/ubnt/usurvey/ui/signal/strength/b;

    sget-object v2, Lcom/ubnt/usurvey/ui/signal/strength/b$c;->PERMISSIONS:Lcom/ubnt/usurvey/ui/signal/strength/b$c;

    invoke-static {v0, v2}, Lcom/ubnt/usurvey/ui/signal/strength/b;->e(Lcom/ubnt/usurvey/ui/signal/strength/b;Lcom/ubnt/usurvey/ui/signal/strength/b$c;)LTe/K0$f;

    move-result-object v0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lcom/ubnt/usurvey/ui/signal/strength/b$b$a$a;

    if-nez v0, :cond_4

    instance-of v0, p1, Lcom/ubnt/usurvey/ui/signal/strength/b$b$a$b$a;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    instance-of p1, p1, Lcom/ubnt/usurvey/ui/signal/strength/b$b$b;

    if-eqz p1, :cond_3

    new-instance p1, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/b$g;->a:Lcom/ubnt/usurvey/ui/signal/strength/b;

    invoke-static {p1}, Lcom/ubnt/usurvey/ui/signal/strength/b;->g(Lcom/ubnt/usurvey/ui/signal/strength/b;)Lgg/i;

    move-result-object p1

    sget-object v0, Lcom/ubnt/usurvey/ui/signal/strength/b$g$a;->a:Lcom/ubnt/usurvey/ui/signal/strength/b$g$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/usurvey/ui/signal/strength/b$b;

    invoke-virtual {p0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/b$g;->a(Lcom/ubnt/usurvey/ui/signal/strength/b$b;)LDj/a;

    move-result-object p1

    return-object p1
.end method
