.class Landroidx/fragment/app/K$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/K;->a(Landroidx/fragment/app/K$e$c;Landroidx/fragment/app/K$e$b;Landroidx/fragment/app/C;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/fragment/app/K$d;

.field final synthetic b:Landroidx/fragment/app/K;


# direct methods
.method constructor <init>(Landroidx/fragment/app/K;Landroidx/fragment/app/K$d;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/K$a;->b:Landroidx/fragment/app/K;

    iput-object p2, p0, Landroidx/fragment/app/K$a;->a:Landroidx/fragment/app/K$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/K$a;->b:Landroidx/fragment/app/K;

    iget-object v0, v0, Landroidx/fragment/app/K;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/K$a;->a:Landroidx/fragment/app/K$d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/K$a;->a:Landroidx/fragment/app/K$d;

    invoke-virtual {v0}, Landroidx/fragment/app/K$e;->e()Landroidx/fragment/app/K$e$c;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/K$a;->a:Landroidx/fragment/app/K$d;

    invoke-virtual {v1}, Landroidx/fragment/app/K$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v1

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/K$e$c;->applyState(Landroid/view/View;)V

    :cond_0
    return-void
.end method
