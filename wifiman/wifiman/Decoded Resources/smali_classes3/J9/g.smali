.class public final synthetic LJ9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ls9/b;

.field public final synthetic d:Z

.field public final synthetic e:Lmh/a;

.field public final synthetic f:LJ9/b;

.field public final synthetic g:LL0/U;

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:F

.field public final synthetic k:I

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/b;ZLmh/a;LJ9/b;LL0/U;ZLjava/lang/String;FII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ9/g;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LJ9/g;->b:Ljava/lang/String;

    iput-object p3, p0, LJ9/g;->c:Ls9/b;

    iput-boolean p4, p0, LJ9/g;->d:Z

    iput-object p5, p0, LJ9/g;->e:Lmh/a;

    iput-object p6, p0, LJ9/g;->f:LJ9/b;

    iput-object p7, p0, LJ9/g;->g:LL0/U;

    iput-boolean p8, p0, LJ9/g;->h:Z

    iput-object p9, p0, LJ9/g;->i:Ljava/lang/String;

    iput p10, p0, LJ9/g;->j:F

    iput p11, p0, LJ9/g;->k:I

    iput p12, p0, LJ9/g;->l:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    move-object v0, p0

    iget-object v1, v0, LJ9/g;->a:Landroidx/compose/ui/e;

    iget-object v2, v0, LJ9/g;->b:Ljava/lang/String;

    iget-object v3, v0, LJ9/g;->c:Ls9/b;

    iget-boolean v4, v0, LJ9/g;->d:Z

    iget-object v5, v0, LJ9/g;->e:Lmh/a;

    iget-object v6, v0, LJ9/g;->f:LJ9/b;

    iget-object v7, v0, LJ9/g;->g:LL0/U;

    iget-boolean v8, v0, LJ9/g;->h:Z

    iget-object v9, v0, LJ9/g;->i:Ljava/lang/String;

    iget v10, v0, LJ9/g;->j:F

    iget v11, v0, LJ9/g;->k:I

    iget v12, v0, LJ9/g;->l:I

    move-object/from16 v13, p1

    check-cast v13, LT/l;

    move-object/from16 v14, p2

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    invoke-static/range {v1 .. v14}, LJ9/h;->b(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/b;ZLmh/a;LJ9/b;LL0/U;ZLjava/lang/String;FIILT/l;I)LYg/J;

    move-result-object v1

    return-object v1
.end method
