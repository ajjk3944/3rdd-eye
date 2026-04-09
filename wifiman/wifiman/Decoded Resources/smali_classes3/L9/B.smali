.class public final synthetic LL9/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:LL9/d;

.field public final synthetic d:Lmh/a;

.field public final synthetic e:Lmh/q;

.field public final synthetic f:J

.field public final synthetic g:J

.field public final synthetic h:J

.field public final synthetic i:F

.field public final synthetic j:Lz/N;

.field public final synthetic k:F

.field public final synthetic l:I

.field public final synthetic m:I

.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ljava/lang/String;LL9/d;Lmh/a;Lmh/q;JJJFLz/N;FIII)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, LL9/B;->a:Landroidx/compose/ui/e;

    move-object v1, p2

    iput-object v1, v0, LL9/B;->b:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, LL9/B;->c:LL9/d;

    move-object v1, p4

    iput-object v1, v0, LL9/B;->d:Lmh/a;

    move-object v1, p5

    iput-object v1, v0, LL9/B;->e:Lmh/q;

    move-wide v1, p6

    iput-wide v1, v0, LL9/B;->f:J

    move-wide v1, p8

    iput-wide v1, v0, LL9/B;->g:J

    move-wide v1, p10

    iput-wide v1, v0, LL9/B;->h:J

    move v1, p12

    iput v1, v0, LL9/B;->i:F

    move-object/from16 v1, p13

    iput-object v1, v0, LL9/B;->j:Lz/N;

    move/from16 v1, p14

    iput v1, v0, LL9/B;->k:F

    move/from16 v1, p15

    iput v1, v0, LL9/B;->l:I

    move/from16 v1, p16

    iput v1, v0, LL9/B;->m:I

    move/from16 v1, p17

    iput v1, v0, LL9/B;->n:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, LL9/B;->a:Landroidx/compose/ui/e;

    iget-object v2, v0, LL9/B;->b:Ljava/lang/String;

    iget-object v3, v0, LL9/B;->c:LL9/d;

    iget-object v4, v0, LL9/B;->d:Lmh/a;

    iget-object v5, v0, LL9/B;->e:Lmh/q;

    iget-wide v6, v0, LL9/B;->f:J

    iget-wide v8, v0, LL9/B;->g:J

    iget-wide v10, v0, LL9/B;->h:J

    iget v12, v0, LL9/B;->i:F

    iget-object v13, v0, LL9/B;->j:Lz/N;

    iget v14, v0, LL9/B;->k:F

    iget v15, v0, LL9/B;->l:I

    move-object/from16 v20, v1

    iget v1, v0, LL9/B;->m:I

    move/from16 v16, v1

    iget v1, v0, LL9/B;->n:I

    move/from16 v17, v1

    move-object/from16 v18, p1

    check-cast v18, LT/l;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v19

    move-object/from16 v1, v20

    invoke-static/range {v1 .. v19}, LL9/E;->a(Landroidx/compose/ui/e;Ljava/lang/String;LL9/d;Lmh/a;Lmh/q;JJJFLz/N;FIIILT/l;I)LYg/J;

    move-result-object v1

    return-object v1
.end method
