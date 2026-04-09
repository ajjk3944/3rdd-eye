.class public final synthetic LU9/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lcom/ui/core/ui/sso/SSOAccountVM;

.field public final synthetic b:LU9/h;

.field public final synthetic c:Landroidx/fragment/app/Fragment;

.field public final synthetic d:Lmh/a;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Landroidx/fragment/app/Fragment;Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU9/u;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p2, p0, LU9/u;->b:LU9/h;

    iput-object p3, p0, LU9/u;->c:Landroidx/fragment/app/Fragment;

    iput-object p4, p0, LU9/u;->d:Lmh/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LU9/u;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object v1, p0, LU9/u;->b:LU9/h;

    iget-object v2, p0, LU9/u;->c:Landroidx/fragment/app/Fragment;

    iget-object v3, p0, LU9/u;->d:Lmh/a;

    move-object v4, p1

    check-cast v4, Lq2/f;

    move-object v5, p2

    check-cast v5, Landroid/os/Bundle;

    invoke-static/range {v0 .. v5}, LU9/y;->i(Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Landroidx/fragment/app/Fragment;Lmh/a;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;

    move-result-object p1

    return-object p1
.end method
