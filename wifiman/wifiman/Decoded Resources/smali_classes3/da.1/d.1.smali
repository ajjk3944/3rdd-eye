.class public final synthetic Lda/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/Fragment;

.field public final synthetic b:Lcom/ui/core/ui/sso/SSOAccountVM;

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lmh/a;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;ZZLjava/lang/String;Lmh/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/d;->a:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Lda/d;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-boolean p3, p0, Lda/d;->c:Z

    iput-boolean p4, p0, Lda/d;->d:Z

    iput-object p5, p0, Lda/d;->e:Ljava/lang/String;

    iput-object p6, p0, Lda/d;->f:Lmh/a;

    iput p7, p0, Lda/d;->g:I

    iput p8, p0, Lda/d;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lda/d;->a:Landroidx/fragment/app/Fragment;

    iget-object v1, p0, Lda/d;->b:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-boolean v2, p0, Lda/d;->c:Z

    iget-boolean v3, p0, Lda/d;->d:Z

    iget-object v4, p0, Lda/d;->e:Ljava/lang/String;

    iget-object v5, p0, Lda/d;->f:Lmh/a;

    iget v6, p0, Lda/d;->g:I

    iget v7, p0, Lda/d;->h:I

    move-object v8, p1

    check-cast v8, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lda/f;->b(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;ZZLjava/lang/String;Lmh/a;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
