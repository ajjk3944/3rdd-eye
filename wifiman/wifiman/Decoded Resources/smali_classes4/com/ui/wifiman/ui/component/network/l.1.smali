.class public final synthetic Lcom/ui/wifiman/ui/component/network/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:Lcom/ui/wifiman/ui/component/network/k;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;FFLcom/ui/wifiman/ui/component/network/k;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/l;->a:Landroidx/compose/ui/e;

    iput p2, p0, Lcom/ui/wifiman/ui/component/network/l;->b:F

    iput p3, p0, Lcom/ui/wifiman/ui/component/network/l;->c:F

    iput-object p4, p0, Lcom/ui/wifiman/ui/component/network/l;->d:Lcom/ui/wifiman/ui/component/network/k;

    iput p5, p0, Lcom/ui/wifiman/ui/component/network/l;->e:I

    iput p6, p0, Lcom/ui/wifiman/ui/component/network/l;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/l;->a:Landroidx/compose/ui/e;

    iget v1, p0, Lcom/ui/wifiman/ui/component/network/l;->b:F

    iget v2, p0, Lcom/ui/wifiman/ui/component/network/l;->c:F

    iget-object v3, p0, Lcom/ui/wifiman/ui/component/network/l;->d:Lcom/ui/wifiman/ui/component/network/k;

    iget v4, p0, Lcom/ui/wifiman/ui/component/network/l;->e:I

    iget v5, p0, Lcom/ui/wifiman/ui/component/network/l;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/ui/wifiman/ui/component/network/o;->b(Landroidx/compose/ui/e;FFLcom/ui/wifiman/ui/component/network/k;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
