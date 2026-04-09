.class public final synthetic Lda/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/Fragment;

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lmh/a;

.field public final synthetic e:Z

.field public final synthetic f:Lcom/ui/core/ui/sso/SSOAccountVM;

.field public final synthetic g:Lf2/w;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/Fragment;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/g;->a:Landroidx/fragment/app/Fragment;

    iput-boolean p2, p0, Lda/g;->b:Z

    iput-object p3, p0, Lda/g;->c:Ljava/lang/String;

    iput-object p4, p0, Lda/g;->d:Lmh/a;

    iput-boolean p5, p0, Lda/g;->e:Z

    iput-object p6, p0, Lda/g;->f:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p7, p0, Lda/g;->g:Lf2/w;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lda/g;->a:Landroidx/fragment/app/Fragment;

    iget-boolean v1, p0, Lda/g;->b:Z

    iget-object v2, p0, Lda/g;->c:Ljava/lang/String;

    iget-object v3, p0, Lda/g;->d:Lmh/a;

    iget-boolean v4, p0, Lda/g;->e:Z

    iget-object v5, p0, Lda/g;->f:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object v6, p0, Lda/g;->g:Lf2/w;

    move-object v7, p1

    check-cast v7, Lf2/u;

    invoke-static/range {v0 .. v7}, Lda/f$a$b$a;->a(Landroidx/fragment/app/Fragment;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;Lf2/u;)LYg/J;

    move-result-object p1

    return-object p1
.end method
