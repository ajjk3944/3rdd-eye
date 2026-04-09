.class final Lw9/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw9/k;->c(Landroidx/compose/ui/e;Lmh/a;ZZLs9/b;Lw9/h;Ljava/lang/String;Lz/c$e;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Ls9/b;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Z

.field final synthetic e:Z

.field final synthetic f:Lw9/a;

.field final synthetic g:Lw9/b;

.field final synthetic h:LL0/U;

.field final synthetic i:Ls/I;

.field final synthetic j:Lz/c$e;

.field final synthetic k:Lmh/a;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Ls9/b;Ljava/lang/String;ZZLw9/a;Lw9/b;LL0/U;Ls/I;Lz/c$e;Lmh/a;)V
    .locals 0

    iput-object p1, p0, Lw9/k$a;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lw9/k$a;->b:Ls9/b;

    iput-object p3, p0, Lw9/k$a;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lw9/k$a;->d:Z

    iput-boolean p5, p0, Lw9/k$a;->e:Z

    iput-object p6, p0, Lw9/k$a;->f:Lw9/a;

    iput-object p7, p0, Lw9/k$a;->g:Lw9/b;

    iput-object p8, p0, Lw9/k$a;->h:LL0/U;

    iput-object p9, p0, Lw9/k$a;->i:Ls/I;

    iput-object p10, p0, Lw9/k$a;->j:Lz/c$e;

    iput-object p11, p0, Lw9/k$a;->k:Lmh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 23

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.component.button.UiButtonLink.<anonymous> (UiButtonLink.kt:97)"

    const v4, 0x39ff953b

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v5, v0, Lw9/k$a;->a:Landroidx/compose/ui/e;

    iget-object v6, v0, Lw9/k$a;->b:Ls9/b;

    iget-object v7, v0, Lw9/k$a;->c:Ljava/lang/String;

    iget-boolean v8, v0, Lw9/k$a;->d:Z

    iget-boolean v9, v0, Lw9/k$a;->e:Z

    iget-object v10, v0, Lw9/k$a;->f:Lw9/a;

    iget-object v11, v0, Lw9/k$a;->g:Lw9/b;

    iget-object v12, v0, Lw9/k$a;->h:LL0/U;

    iget-object v15, v0, Lw9/k$a;->i:Ls/I;

    iget-object v1, v0, Lw9/k$a;->j:Lz/c$e;

    move-object/from16 v16, v1

    iget-object v1, v0, Lw9/k$a;->k:Lmh/a;

    move-object/from16 v18, v1

    const/16 v21, 0x0

    const/16 v22, 0x1100

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/high16 v20, 0x30000000

    move-object/from16 v19, p1

    invoke-static/range {v5 .. v22}, Lw9/g;->b(Landroidx/compose/ui/e;Ls9/b;Ljava/lang/String;ZZLw9/a;Lw9/b;LL0/U;Ls/g;LN/f;Ls/G;Lz/c$e;Ly/m;Lmh/a;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lw9/k$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
