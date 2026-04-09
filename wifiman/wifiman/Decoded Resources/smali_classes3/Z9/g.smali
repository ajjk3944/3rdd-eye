.class public final synthetic LZ9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroidx/compose/ui/e;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:LQ0/v;

.field public final synthetic f:LQ0/A;

.field public final synthetic g:LQ0/k;

.field public final synthetic h:J

.field public final synthetic i:LW0/k;

.field public final synthetic j:LW0/j;

.field public final synthetic k:J

.field public final synthetic l:I

.field public final synthetic m:Z

.field public final synthetic n:I

.field public final synthetic o:Lmh/l;

.field public final synthetic p:LL0/U;

.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZILmh/l;LL0/U;III)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, LZ9/g;->a:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, LZ9/g;->b:Landroidx/compose/ui/e;

    move-wide v1, p3

    iput-wide v1, v0, LZ9/g;->c:J

    move-wide v1, p5

    iput-wide v1, v0, LZ9/g;->d:J

    move-object v1, p7

    iput-object v1, v0, LZ9/g;->e:LQ0/v;

    move-object v1, p8

    iput-object v1, v0, LZ9/g;->f:LQ0/A;

    move-object v1, p9

    iput-object v1, v0, LZ9/g;->g:LQ0/k;

    move-wide v1, p10

    iput-wide v1, v0, LZ9/g;->h:J

    move-object v1, p12

    iput-object v1, v0, LZ9/g;->i:LW0/k;

    move-object/from16 v1, p13

    iput-object v1, v0, LZ9/g;->j:LW0/j;

    move-wide/from16 v1, p14

    iput-wide v1, v0, LZ9/g;->k:J

    move/from16 v1, p16

    iput v1, v0, LZ9/g;->l:I

    move/from16 v1, p17

    iput-boolean v1, v0, LZ9/g;->m:Z

    move/from16 v1, p18

    iput v1, v0, LZ9/g;->n:I

    move-object/from16 v1, p19

    iput-object v1, v0, LZ9/g;->o:Lmh/l;

    move-object/from16 v1, p20

    iput-object v1, v0, LZ9/g;->p:LL0/U;

    move/from16 v1, p21

    iput v1, v0, LZ9/g;->q:I

    move/from16 v1, p22

    iput v1, v0, LZ9/g;->r:I

    move/from16 v1, p23

    iput v1, v0, LZ9/g;->s:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    iget-object v1, v0, LZ9/g;->a:Ljava/lang/String;

    iget-object v2, v0, LZ9/g;->b:Landroidx/compose/ui/e;

    iget-wide v3, v0, LZ9/g;->c:J

    iget-wide v5, v0, LZ9/g;->d:J

    iget-object v7, v0, LZ9/g;->e:LQ0/v;

    iget-object v8, v0, LZ9/g;->f:LQ0/A;

    iget-object v9, v0, LZ9/g;->g:LQ0/k;

    iget-wide v10, v0, LZ9/g;->h:J

    iget-object v12, v0, LZ9/g;->i:LW0/k;

    iget-object v13, v0, LZ9/g;->j:LW0/j;

    iget-wide v14, v0, LZ9/g;->k:J

    move-object/from16 v26, v1

    iget v1, v0, LZ9/g;->l:I

    move/from16 v16, v1

    iget-boolean v1, v0, LZ9/g;->m:Z

    move/from16 v17, v1

    iget v1, v0, LZ9/g;->n:I

    move/from16 v18, v1

    iget-object v1, v0, LZ9/g;->o:Lmh/l;

    move-object/from16 v19, v1

    iget-object v1, v0, LZ9/g;->p:LL0/U;

    move-object/from16 v20, v1

    iget v1, v0, LZ9/g;->q:I

    move/from16 v21, v1

    iget v1, v0, LZ9/g;->r:I

    move/from16 v22, v1

    iget v1, v0, LZ9/g;->s:I

    move/from16 v23, v1

    move-object/from16 v24, p1

    check-cast v24, LT/l;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v25

    move-object/from16 v1, v26

    invoke-static/range {v1 .. v25}, LZ9/h;->a(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZILmh/l;LL0/U;IIILT/l;I)LYg/J;

    move-result-object v1

    return-object v1
.end method
