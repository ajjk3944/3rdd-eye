.class public final synthetic Lcom/ui/core/ui/sso/login/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lmh/a;

.field public final synthetic d:Z

.field public final synthetic e:Lcom/ui/core/ui/sso/SSOAccountVM;

.field public final synthetic f:Lf2/w;

.field public final synthetic g:Landroidx/fragment/app/Fragment;

.field public final synthetic h:Lmh/l;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;Landroidx/fragment/app/Fragment;Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/ui/core/ui/sso/login/c;->a:Z

    iput-object p2, p0, Lcom/ui/core/ui/sso/login/c;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/ui/core/ui/sso/login/c;->c:Lmh/a;

    iput-boolean p4, p0, Lcom/ui/core/ui/sso/login/c;->d:Z

    iput-object p5, p0, Lcom/ui/core/ui/sso/login/c;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p6, p0, Lcom/ui/core/ui/sso/login/c;->f:Lf2/w;

    iput-object p7, p0, Lcom/ui/core/ui/sso/login/c;->g:Landroidx/fragment/app/Fragment;

    iput-object p8, p0, Lcom/ui/core/ui/sso/login/c;->h:Lmh/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-boolean v0, p0, Lcom/ui/core/ui/sso/login/c;->a:Z

    iget-object v1, p0, Lcom/ui/core/ui/sso/login/c;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/ui/core/ui/sso/login/c;->c:Lmh/a;

    iget-boolean v3, p0, Lcom/ui/core/ui/sso/login/c;->d:Z

    iget-object v4, p0, Lcom/ui/core/ui/sso/login/c;->e:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object v5, p0, Lcom/ui/core/ui/sso/login/c;->f:Lf2/w;

    iget-object v6, p0, Lcom/ui/core/ui/sso/login/c;->g:Landroidx/fragment/app/Fragment;

    iget-object v7, p0, Lcom/ui/core/ui/sso/login/c;->h:Lmh/l;

    move-object v8, p1

    check-cast v8, Lf2/u;

    invoke-static/range {v0 .. v8}, Lcom/ui/core/ui/sso/login/b$a$b$a;->a(ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;Landroidx/fragment/app/Fragment;Lmh/l;Lf2/u;)LYg/J;

    move-result-object p1

    return-object p1
.end method
