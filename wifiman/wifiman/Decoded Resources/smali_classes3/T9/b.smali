.class public final synthetic LT9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/Fragment;

.field public final synthetic b:Lcom/ui/core/ui/sso/SSOAccountVM;

.field public final synthetic c:Lmh/l;

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Lmh/a;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lmh/l;ZZLjava/lang/String;Lmh/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT9/b;->a:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, LT9/b;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p3, p0, LT9/b;->c:Lmh/l;

    iput-boolean p4, p0, LT9/b;->d:Z

    iput-boolean p5, p0, LT9/b;->e:Z

    iput-object p6, p0, LT9/b;->f:Ljava/lang/String;

    iput-object p7, p0, LT9/b;->g:Lmh/a;

    iput p8, p0, LT9/b;->h:I

    iput p9, p0, LT9/b;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, LT9/b;->a:Landroidx/fragment/app/Fragment;

    iget-object v1, p0, LT9/b;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object v2, p0, LT9/b;->c:Lmh/l;

    iget-boolean v3, p0, LT9/b;->d:Z

    iget-boolean v4, p0, LT9/b;->e:Z

    iget-object v5, p0, LT9/b;->f:Ljava/lang/String;

    iget-object v6, p0, LT9/b;->g:Lmh/a;

    iget v7, p0, LT9/b;->h:I

    iget v8, p0, LT9/b;->i:I

    move-object v9, p1

    check-cast v9, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/ui/core/ui/sso/login/b;->b(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;Lmh/l;ZZLjava/lang/String;Lmh/a;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
