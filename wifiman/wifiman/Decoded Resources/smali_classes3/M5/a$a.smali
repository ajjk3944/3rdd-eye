.class final LM5/a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM5/a;->a(Lb6/b;Lx6/b;Landroidx/compose/ui/e;LY5/d;LY5/d;LY5/d;LY5/d;LC6/a;LC6/b;LB6/a;LO5/a;ZLx6/b;Lf6/a;Li6/a;LO5/c;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb6/b;

.field final synthetic b:Lx6/b;

.field final synthetic c:LY5/d;

.field final synthetic d:LY5/d;

.field final synthetic e:LY5/d;

.field final synthetic f:LY5/d;

.field final synthetic g:LO5/a;

.field final synthetic h:Z

.field final synthetic i:Lx6/b;

.field final synthetic j:Li6/a;

.field final synthetic k:LO5/c;

.field final synthetic l:I

.field final synthetic m:I


# direct methods
.method constructor <init>(Lb6/b;Lx6/b;LY5/d;LY5/d;LY5/d;LY5/d;LC6/a;LC6/b;LB6/a;LO5/a;ZLx6/b;Lf6/a;Li6/a;LO5/c;II)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LM5/a$a;->a:Lb6/b;

    move-object v1, p2

    iput-object v1, v0, LM5/a$a;->b:Lx6/b;

    move-object v1, p3

    iput-object v1, v0, LM5/a$a;->c:LY5/d;

    move-object v1, p4

    iput-object v1, v0, LM5/a$a;->d:LY5/d;

    move-object v1, p5

    iput-object v1, v0, LM5/a$a;->e:LY5/d;

    move-object v1, p6

    iput-object v1, v0, LM5/a$a;->f:LY5/d;

    move-object v1, p10

    iput-object v1, v0, LM5/a$a;->g:LO5/a;

    move v1, p11

    iput-boolean v1, v0, LM5/a$a;->h:Z

    move-object v1, p12

    iput-object v1, v0, LM5/a$a;->i:Lx6/b;

    move-object/from16 v1, p14

    iput-object v1, v0, LM5/a$a;->j:Li6/a;

    move-object/from16 v1, p15

    iput-object v1, v0, LM5/a$a;->k:LO5/c;

    move/from16 v1, p16

    iput v1, v0, LM5/a$a;->l:I

    move/from16 v1, p17

    iput v1, v0, LM5/a$a;->m:I

    const/4 v1, 0x3

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz/d;LT/l;I)V
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p3

    const-string v2, "$this$ChartBox"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x51

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string/jumbo v3, "com.patrykandpatrick.vico.compose.chart.Chart.<anonymous> (Charts.kt:261)"

    const v4, -0x103bba36

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v5, v0, LM5/a$a;->a:Lb6/b;

    iget-object v6, v0, LM5/a$a;->b:Lx6/b;

    iget-object v7, v0, LM5/a$a;->c:LY5/d;

    iget-object v8, v0, LM5/a$a;->d:LY5/d;

    iget-object v9, v0, LM5/a$a;->e:LY5/d;

    iget-object v10, v0, LM5/a$a;->f:LY5/d;

    iget-object v14, v0, LM5/a$a;->g:LO5/a;

    iget-boolean v15, v0, LM5/a$a;->h:Z

    iget-object v1, v0, LM5/a$a;->i:Lx6/b;

    move-object/from16 v16, v1

    iget-object v1, v0, LM5/a$a;->j:Li6/a;

    move-object/from16 v18, v1

    iget-object v1, v0, LM5/a$a;->k:LO5/c;

    move-object/from16 v19, v1

    iget v1, v0, LM5/a$a;->l:I

    shr-int/lit8 v2, v1, 0x3

    and-int/lit8 v2, v2, 0x8

    shl-int/lit8 v2, v2, 0x3

    const v3, 0x9249208

    or-int/2addr v2, v3

    and-int/lit8 v3, v1, 0x70

    or-int/2addr v2, v3

    iget v3, v0, LM5/a$a;->m:I

    shl-int/lit8 v4, v3, 0x1b

    const/high16 v11, 0x70000000

    and-int/2addr v4, v11

    or-int v21, v2, v4

    shr-int/lit8 v2, v3, 0x3

    and-int/lit8 v2, v2, 0xe

    const v4, 0x8200

    or-int/2addr v2, v4

    shr-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0x8

    shl-int/lit8 v1, v1, 0x3

    or-int/2addr v1, v2

    shr-int/lit8 v2, v3, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    shr-int/lit8 v2, v3, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int v22, v1, v2

    const/16 v23, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    move-object/from16 v20, p2

    invoke-static/range {v5 .. v23}, LM5/a;->c(Lb6/b;Lx6/b;LY5/d;LY5/d;LY5/d;LY5/d;LC6/a;LC6/b;LB6/a;LO5/a;ZLx6/b;Lf6/a;Li6/a;LO5/c;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/d;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LM5/a$a;->a(Lz/d;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
