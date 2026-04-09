.class public final synthetic Lcom/ui/wifiman/ui/component/network/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Lcom/ui/wifiman/ui/component/network/N;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:F

.field public final synthetic f:Z

.field public final synthetic g:Lmh/l;

.field public final synthetic h:Lmh/l;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/N;JJFZLmh/l;Lmh/l;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/W;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lcom/ui/wifiman/ui/component/network/W;->b:Lcom/ui/wifiman/ui/component/network/N;

    iput-wide p3, p0, Lcom/ui/wifiman/ui/component/network/W;->c:J

    iput-wide p5, p0, Lcom/ui/wifiman/ui/component/network/W;->d:J

    iput p7, p0, Lcom/ui/wifiman/ui/component/network/W;->e:F

    iput-boolean p8, p0, Lcom/ui/wifiman/ui/component/network/W;->f:Z

    iput-object p9, p0, Lcom/ui/wifiman/ui/component/network/W;->g:Lmh/l;

    iput-object p10, p0, Lcom/ui/wifiman/ui/component/network/W;->h:Lmh/l;

    iput p11, p0, Lcom/ui/wifiman/ui/component/network/W;->i:I

    iput p12, p0, Lcom/ui/wifiman/ui/component/network/W;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    move-object v0, p0

    iget-object v1, v0, Lcom/ui/wifiman/ui/component/network/W;->a:Landroidx/compose/ui/e;

    iget-object v2, v0, Lcom/ui/wifiman/ui/component/network/W;->b:Lcom/ui/wifiman/ui/component/network/N;

    iget-wide v3, v0, Lcom/ui/wifiman/ui/component/network/W;->c:J

    iget-wide v5, v0, Lcom/ui/wifiman/ui/component/network/W;->d:J

    iget v7, v0, Lcom/ui/wifiman/ui/component/network/W;->e:F

    iget-boolean v8, v0, Lcom/ui/wifiman/ui/component/network/W;->f:Z

    iget-object v9, v0, Lcom/ui/wifiman/ui/component/network/W;->g:Lmh/l;

    iget-object v10, v0, Lcom/ui/wifiman/ui/component/network/W;->h:Lmh/l;

    iget v11, v0, Lcom/ui/wifiman/ui/component/network/W;->i:I

    iget v12, v0, Lcom/ui/wifiman/ui/component/network/W;->j:I

    move-object/from16 v13, p1

    check-cast v13, LT/l;

    move-object/from16 v14, p2

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    invoke-static/range {v1 .. v14}, Lcom/ui/wifiman/ui/component/network/X;->g(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/N;JJFZLmh/l;Lmh/l;IILT/l;I)LYg/J;

    move-result-object v1

    return-object v1
.end method
