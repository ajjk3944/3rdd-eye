.class public final synthetic LL9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Lmh/p;

.field public final synthetic c:Lmh/p;

.field public final synthetic d:Lmh/q;

.field public final synthetic e:J

.field public final synthetic f:F

.field public final synthetic g:J

.field public final synthetic h:Lz/N;

.field public final synthetic i:F

.field public final synthetic j:I

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/q;JFJLz/N;FII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL9/j;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LL9/j;->b:Lmh/p;

    iput-object p3, p0, LL9/j;->c:Lmh/p;

    iput-object p4, p0, LL9/j;->d:Lmh/q;

    iput-wide p5, p0, LL9/j;->e:J

    iput p7, p0, LL9/j;->f:F

    iput-wide p8, p0, LL9/j;->g:J

    iput-object p10, p0, LL9/j;->h:Lz/N;

    iput p11, p0, LL9/j;->i:F

    iput p12, p0, LL9/j;->j:I

    iput p13, p0, LL9/j;->k:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, LL9/j;->a:Landroidx/compose/ui/e;

    iget-object v2, v0, LL9/j;->b:Lmh/p;

    iget-object v3, v0, LL9/j;->c:Lmh/p;

    iget-object v4, v0, LL9/j;->d:Lmh/q;

    iget-wide v5, v0, LL9/j;->e:J

    iget v7, v0, LL9/j;->f:F

    iget-wide v8, v0, LL9/j;->g:J

    iget-object v10, v0, LL9/j;->h:Lz/N;

    iget v11, v0, LL9/j;->i:F

    iget v12, v0, LL9/j;->j:I

    iget v13, v0, LL9/j;->k:I

    move-object/from16 v14, p1

    check-cast v14, LT/l;

    move-object/from16 v15, p2

    check-cast v15, Ljava/lang/Integer;

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v15

    invoke-static/range {v1 .. v15}, LL9/q;->c(Landroidx/compose/ui/e;Lmh/p;Lmh/p;Lmh/q;JFJLz/N;FIILT/l;I)LYg/J;

    move-result-object v1

    return-object v1
.end method
