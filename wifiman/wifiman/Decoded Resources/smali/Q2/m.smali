.class final LQ2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ2/m$b;
    }
.end annotation


# instance fields
.field final a:Ljava/util/Map;

.field private final b:LQ2/o$b;


# direct methods
.method constructor <init>(LQ2/o$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LQ2/m;->a:Ljava/util/Map;

    iput-object p1, p0, LQ2/m;->b:LQ2/o$b;

    return-void
.end method


# virtual methods
.method a(Landroidx/lifecycle/k;)Lcom/bumptech/glide/j;
    .locals 1

    invoke-static {}, LW2/l;->a()V

    iget-object v0, p0, LQ2/m;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/j;

    return-object p1
.end method

.method b(Landroid/content/Context;Lcom/bumptech/glide/b;Landroidx/lifecycle/k;Landroidx/fragment/app/w;Z)Lcom/bumptech/glide/j;
    .locals 3

    invoke-static {}, LW2/l;->a()V

    invoke-virtual {p0, p3}, LQ2/m;->a(Landroidx/lifecycle/k;)Lcom/bumptech/glide/j;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, LQ2/k;

    invoke-direct {v0, p3}, LQ2/k;-><init>(Landroidx/lifecycle/k;)V

    iget-object v1, p0, LQ2/m;->b:LQ2/o$b;

    new-instance v2, LQ2/m$b;

    invoke-direct {v2, p0, p4}, LQ2/m$b;-><init>(LQ2/m;Landroidx/fragment/app/w;)V

    invoke-interface {v1, p2, v0, v2, p1}, LQ2/o$b;->a(Lcom/bumptech/glide/b;LQ2/j;LQ2/p;Landroid/content/Context;)Lcom/bumptech/glide/j;

    move-result-object p1

    iget-object p2, p0, LQ2/m;->a:Ljava/util/Map;

    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, LQ2/m$a;

    invoke-direct {p2, p0, p3}, LQ2/m$a;-><init>(LQ2/m;Landroidx/lifecycle/k;)V

    invoke-virtual {v0, p2}, LQ2/k;->b(LQ2/l;)V

    if-eqz p5, :cond_0

    invoke-virtual {p1}, Lcom/bumptech/glide/j;->b()V

    :cond_0
    move-object v0, p1

    :cond_1
    return-object v0
.end method
