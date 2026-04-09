.class public final synthetic Lda/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/Fragment;

.field public final synthetic b:Lcom/ui/core/ui/sso/SSOAccountVM;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/c;->a:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Lda/c;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lda/c;->a:Landroidx/fragment/app/Fragment;

    iget-object v1, p0, Lda/c;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    check-cast p1, Lq2/f;

    check-cast p2, Landroid/os/Bundle;

    invoke-static {v0, v1, p1, p2}, Lda/f;->a(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;

    move-result-object p1

    return-object p1
.end method
