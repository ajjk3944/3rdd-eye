.class public Lcom/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$getComponents$0(LF4/d;)LD4/a;
    .locals 3

    const-class v0, Lcom/google/firebase/f;

    invoke-interface {p0, v0}, LF4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/f;

    const-class v1, Landroid/content/Context;

    invoke-interface {p0, v1}, LF4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Ld5/d;

    invoke-interface {p0, v2}, LF4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld5/d;

    invoke-static {v0, v1, p0}, LD4/b;->c(Lcom/google/firebase/f;Landroid/content/Context;Ld5/d;)LD4/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LF4/c;",
            ">;"
        }
    .end annotation

    const-class v0, LD4/a;

    invoke-static {v0}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v0

    const-class v1, Lcom/google/firebase/f;

    invoke-static {v1}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v1

    invoke-virtual {v0, v1}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-static {v1}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v1

    invoke-virtual {v0, v1}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    const-class v1, Ld5/d;

    invoke-static {v1}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v1

    invoke-virtual {v0, v1}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/analytics/connector/internal/b;

    invoke-direct {v1}, Lcom/google/firebase/analytics/connector/internal/b;-><init>()V

    invoke-virtual {v0, v1}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v0

    invoke-virtual {v0}, LF4/c$b;->d()LF4/c$b;

    move-result-object v0

    invoke-virtual {v0}, LF4/c$b;->c()LF4/c;

    move-result-object v0

    const-string/jumbo v1, "fire-analytics"

    const-string v2, "22.3.0"

    invoke-static {v1, v2}, Lm5/h;->b(Ljava/lang/String;Ljava/lang/String;)LF4/c;

    move-result-object v1

    filled-new-array {v0, v1}, [LF4/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
