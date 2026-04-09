.class public final synthetic LU9/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/Fragment;

.field public final synthetic b:Lcom/ui/core/ui/sso/SSOAccountVM;

.field public final synthetic c:LU9/h;

.field public final synthetic d:Lmh/a;

.field public final synthetic e:Lmh/l;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Lmh/a;Lmh/l;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU9/v;->a:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, LU9/v;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p3, p0, LU9/v;->c:LU9/h;

    iput-object p4, p0, LU9/v;->d:Lmh/a;

    iput-object p5, p0, LU9/v;->e:Lmh/l;

    iput p6, p0, LU9/v;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LU9/v;->a:Landroidx/fragment/app/Fragment;

    iget-object v1, p0, LU9/v;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object v2, p0, LU9/v;->c:LU9/h;

    iget-object v3, p0, LU9/v;->d:Lmh/a;

    iget-object v4, p0, LU9/v;->e:Lmh/l;

    iget v5, p0, LU9/v;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LU9/y;->c(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Lmh/a;Lmh/l;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
