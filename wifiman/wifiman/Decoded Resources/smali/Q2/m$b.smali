.class final LQ2/m$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ2/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ2/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final a:Landroidx/fragment/app/w;

.field final synthetic b:LQ2/m;


# direct methods
.method constructor <init>(LQ2/m;Landroidx/fragment/app/w;)V
    .locals 0

    iput-object p1, p0, LQ2/m$b;->b:LQ2/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LQ2/m$b;->a:Landroidx/fragment/app/w;

    return-void
.end method

.method private b(Landroidx/fragment/app/w;Ljava/util/Set;)V
    .locals 4

    invoke-virtual {p1}, Landroidx/fragment/app/w;->q0()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/Fragment;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->r()Landroidx/fragment/app/w;

    move-result-object v3

    invoke-direct {p0, v3, p2}, LQ2/m$b;->b(Landroidx/fragment/app/w;Ljava/util/Set;)V

    iget-object v3, p0, LQ2/m$b;->b:LQ2/m;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->O()Landroidx/lifecycle/k;

    move-result-object v2

    invoke-virtual {v3, v2}, LQ2/m;->a(Landroidx/lifecycle/k;)Lcom/bumptech/glide/j;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {p2, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, LQ2/m$b;->a:Landroidx/fragment/app/w;

    invoke-direct {p0, v1, v0}, LQ2/m$b;->b(Landroidx/fragment/app/w;Ljava/util/Set;)V

    return-object v0
.end method
