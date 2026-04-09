.class Landroidx/fragment/app/w$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/w;->k(Landroidx/fragment/app/o;Landroidx/fragment/app/l;Landroidx/fragment/app/Fragment;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/fragment/app/w;


# direct methods
.method constructor <init>(Landroidx/fragment/app/w;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/w$i;->a:Landroidx/fragment/app/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lf/a;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/w$i;->b(Lf/a;)V

    return-void
.end method

.method public b(Lf/a;)V
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/w$i;->a:Landroidx/fragment/app/w;

    iget-object v0, v0, Landroidx/fragment/app/w;->G:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/w$k;

    const-string v1, "FragmentManager"

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "No IntentSenders were started for "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v2, v0, Landroidx/fragment/app/w$k;->a:Ljava/lang/String;

    iget v0, v0, Landroidx/fragment/app/w$k;->b:I

    iget-object v3, p0, Landroidx/fragment/app/w$i;->a:Landroidx/fragment/app/w;

    invoke-static {v3}, Landroidx/fragment/app/w;->f(Landroidx/fragment/app/w;)Landroidx/fragment/app/D;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroidx/fragment/app/D;->i(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v3

    if-nez v3, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Intent Sender result delivered for unknown Fragment "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    invoke-virtual {p1}, Lf/a;->b()I

    move-result v1

    invoke-virtual {p1}, Lf/a;->a()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v3, v0, v1, p1}, Landroidx/fragment/app/Fragment;->j0(IILandroid/content/Intent;)V

    return-void
.end method
