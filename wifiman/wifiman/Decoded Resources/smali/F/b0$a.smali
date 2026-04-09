.class final LF/b0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/b0;->a(Landroidx/compose/ui/e;LF/E;LM/G;LR0/Q;Lmh/l;ZZLR0/H;LF/u0;I)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/E;

.field final synthetic b:LM/G;

.field final synthetic c:LR0/Q;

.field final synthetic d:Z

.field final synthetic e:Z

.field final synthetic f:LR0/H;

.field final synthetic g:LF/u0;

.field final synthetic h:Lmh/l;

.field final synthetic i:I


# direct methods
.method constructor <init>(LF/E;LM/G;LR0/Q;ZZLR0/H;LF/u0;Lmh/l;I)V
    .locals 0

    iput-object p1, p0, LF/b0$a;->a:LF/E;

    iput-object p2, p0, LF/b0$a;->b:LM/G;

    iput-object p3, p0, LF/b0$a;->c:LR0/Q;

    iput-boolean p4, p0, LF/b0$a;->d:Z

    iput-boolean p5, p0, LF/b0$a;->e:Z

    iput-object p6, p0, LF/b0$a;->f:LR0/H;

    iput-object p7, p0, LF/b0$a;->g:LF/u0;

    iput-object p8, p0, LF/b0$a;->h:Lmh/l;

    iput p9, p0, LF/b0$a;->i:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const v2, 0x32c59664

    invoke-interface {v1, v2}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:245)"

    move/from16 v5, p3

    invoke-static {v2, v5, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_1

    new-instance v2, LM/J;

    invoke-direct {v2}, LM/J;-><init>()V

    invoke-interface {v1, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    move-object v10, v2

    check-cast v10, LM/J;

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_2

    new-instance v2, LF/n;

    invoke-direct {v2}, LF/n;-><init>()V

    invoke-interface {v1, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v13, v2

    check-cast v13, LF/n;

    new-instance v2, LF/a0;

    iget-object v5, v0, LF/b0$a;->a:LF/E;

    iget-object v6, v0, LF/b0$a;->b:LM/G;

    iget-object v7, v0, LF/b0$a;->c:LR0/Q;

    iget-boolean v8, v0, LF/b0$a;->d:Z

    iget-boolean v9, v0, LF/b0$a;->e:Z

    iget-object v11, v0, LF/b0$a;->f:LR0/H;

    iget-object v12, v0, LF/b0$a;->g:LF/u0;

    iget-object v15, v0, LF/b0$a;->h:Lmh/l;

    iget v14, v0, LF/b0$a;->i:I

    const/16 v17, 0x200

    const/16 v18, 0x0

    const/16 v16, 0x0

    move-object v4, v2

    move/from16 v19, v14

    move-object/from16 v14, v16

    move/from16 v16, v19

    invoke-direct/range {v4 .. v18}, LF/a0;-><init>(LF/E;LM/G;LR0/Q;ZZLM/J;LR0/H;LF/u0;LF/n;LF/x;Lmh/l;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-interface {v1, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_3

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v6, v3, :cond_4

    :cond_3
    new-instance v6, LF/b0$a$a;

    invoke-direct {v6, v2}, LF/b0$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v6, Lth/g;

    check-cast v6, Lmh/l;

    invoke-static {v4, v6}, Landroidx/compose/ui/input/key/a;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    return-object v2
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LF/b0$a;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method
