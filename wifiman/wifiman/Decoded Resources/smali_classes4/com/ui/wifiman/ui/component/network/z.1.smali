.class public final synthetic Lcom/ui/wifiman/ui/component/network/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Lmh/q;

.field public final synthetic c:Z

.field public final synthetic d:F

.field public final synthetic e:Lmh/r;

.field public final synthetic f:Lmh/s;

.field public final synthetic g:Lmh/s;

.field public final synthetic h:Lmh/t;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lmh/q;ZFLmh/r;Lmh/s;Lmh/s;Lmh/t;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/z;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lcom/ui/wifiman/ui/component/network/z;->b:Lmh/q;

    iput-boolean p3, p0, Lcom/ui/wifiman/ui/component/network/z;->c:Z

    iput p4, p0, Lcom/ui/wifiman/ui/component/network/z;->d:F

    iput-object p5, p0, Lcom/ui/wifiman/ui/component/network/z;->e:Lmh/r;

    iput-object p6, p0, Lcom/ui/wifiman/ui/component/network/z;->f:Lmh/s;

    iput-object p7, p0, Lcom/ui/wifiman/ui/component/network/z;->g:Lmh/s;

    iput-object p8, p0, Lcom/ui/wifiman/ui/component/network/z;->h:Lmh/t;

    iput p9, p0, Lcom/ui/wifiman/ui/component/network/z;->i:I

    iput p10, p0, Lcom/ui/wifiman/ui/component/network/z;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/z;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/z;->b:Lmh/q;

    iget-boolean v2, p0, Lcom/ui/wifiman/ui/component/network/z;->c:Z

    iget v3, p0, Lcom/ui/wifiman/ui/component/network/z;->d:F

    iget-object v4, p0, Lcom/ui/wifiman/ui/component/network/z;->e:Lmh/r;

    iget-object v5, p0, Lcom/ui/wifiman/ui/component/network/z;->f:Lmh/s;

    iget-object v6, p0, Lcom/ui/wifiman/ui/component/network/z;->g:Lmh/s;

    iget-object v7, p0, Lcom/ui/wifiman/ui/component/network/z;->h:Lmh/t;

    iget v8, p0, Lcom/ui/wifiman/ui/component/network/z;->i:I

    iget v9, p0, Lcom/ui/wifiman/ui/component/network/z;->j:I

    move-object v10, p1

    check-cast v10, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, Lcom/ui/wifiman/ui/component/network/B;->h(Landroidx/compose/ui/e;Lmh/q;ZFLmh/r;Lmh/s;Lmh/s;Lmh/t;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
