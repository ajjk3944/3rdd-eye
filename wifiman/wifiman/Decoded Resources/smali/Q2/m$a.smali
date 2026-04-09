.class LQ2/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ2/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ2/m;->b(Landroid/content/Context;Lcom/bumptech/glide/b;Landroidx/lifecycle/k;Landroidx/fragment/app/w;Z)Lcom/bumptech/glide/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/lifecycle/k;

.field final synthetic b:LQ2/m;


# direct methods
.method constructor <init>(LQ2/m;Landroidx/lifecycle/k;)V
    .locals 0

    iput-object p1, p0, LQ2/m$a;->b:LQ2/m;

    iput-object p2, p0, LQ2/m$a;->a:Landroidx/lifecycle/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, LQ2/m$a;->b:LQ2/m;

    iget-object v0, v0, LQ2/m;->a:Ljava/util/Map;

    iget-object v1, p0, LQ2/m$a;->a:Landroidx/lifecycle/k;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
