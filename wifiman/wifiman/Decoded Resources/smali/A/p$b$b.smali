.class public final LA/p$b$b;
.super LA/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/p$b;->a(LB/x;J)LA/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Z

.field final synthetic e:LB/x;

.field final synthetic f:I

.field final synthetic g:I

.field final synthetic h:Lf0/c$b;

.field final synthetic i:Lf0/c$c;

.field final synthetic j:Z

.field final synthetic k:I

.field final synthetic l:I

.field final synthetic m:J

.field final synthetic n:LA/B;


# direct methods
.method constructor <init>(JZLA/m;LB/x;IILf0/c$b;Lf0/c$c;ZIIJLA/B;)V
    .locals 0

    iput-boolean p3, p0, LA/p$b$b;->d:Z

    iput-object p5, p0, LA/p$b$b;->e:LB/x;

    iput p6, p0, LA/p$b$b;->f:I

    iput p7, p0, LA/p$b$b;->g:I

    iput-object p8, p0, LA/p$b$b;->h:Lf0/c$b;

    iput-object p9, p0, LA/p$b$b;->i:Lf0/c$c;

    iput-boolean p10, p0, LA/p$b$b;->j:Z

    iput p11, p0, LA/p$b$b;->k:I

    iput p12, p0, LA/p$b$b;->l:I

    iput-wide p13, p0, LA/p$b$b;->m:J

    iput-object p15, p0, LA/p$b$b;->n:LA/B;

    const/4 p12, 0x0

    move-object p6, p0

    move-wide p7, p1

    move p9, p3

    move-object p10, p4

    move-object p11, p5

    invoke-direct/range {p6 .. p12}, LA/u;-><init>(JZLA/m;LB/x;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)LA/t;
    .locals 21

    move-object/from16 v0, p0

    iget v1, v0, LA/p$b$b;->f:I

    add-int/lit8 v1, v1, -0x1

    move/from16 v3, p1

    if-ne v3, v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    move v12, v1

    goto :goto_1

    :cond_0
    iget v1, v0, LA/p$b$b;->g:I

    goto :goto_0

    :goto_1
    new-instance v1, LA/t;

    move-object v2, v1

    iget-boolean v5, v0, LA/p$b$b;->d:Z

    iget-object v6, v0, LA/p$b$b;->h:Lf0/c$b;

    iget-object v7, v0, LA/p$b$b;->i:Lf0/c$c;

    iget-object v4, v0, LA/p$b$b;->e:LB/x;

    invoke-interface {v4}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v8

    iget-boolean v9, v0, LA/p$b$b;->j:Z

    iget v10, v0, LA/p$b$b;->k:I

    iget v11, v0, LA/p$b$b;->l:I

    iget-wide v13, v0, LA/p$b$b;->m:J

    iget-object v4, v0, LA/p$b$b;->n:LA/B;

    invoke-virtual {v4}, LA/B;->v()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    move-result-object v17

    const/16 v20, 0x0

    move/from16 v3, p1

    move-object/from16 v4, p4

    move-object/from16 v15, p2

    move-object/from16 v16, p3

    move-wide/from16 v18, p5

    invoke-direct/range {v2 .. v20}, LA/t;-><init>(ILjava/util/List;ZLf0/c$b;Lf0/c$c;LY0/t;ZIIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
