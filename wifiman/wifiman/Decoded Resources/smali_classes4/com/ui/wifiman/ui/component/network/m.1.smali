.class public final synthetic Lcom/ui/wifiman/ui/component/network/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/ui/component/network/i;

.field public final synthetic b:Landroidx/compose/ui/e;

.field public final synthetic c:F

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/ui/component/network/i;Landroidx/compose/ui/e;FI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/m;->a:Lcom/ui/wifiman/ui/component/network/i;

    iput-object p2, p0, Lcom/ui/wifiman/ui/component/network/m;->b:Landroidx/compose/ui/e;

    iput p3, p0, Lcom/ui/wifiman/ui/component/network/m;->c:F

    iput p4, p0, Lcom/ui/wifiman/ui/component/network/m;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/m;->a:Lcom/ui/wifiman/ui/component/network/i;

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/m;->b:Landroidx/compose/ui/e;

    iget v2, p0, Lcom/ui/wifiman/ui/component/network/m;->c:F

    iget v3, p0, Lcom/ui/wifiman/ui/component/network/m;->d:I

    move-object v4, p1

    check-cast v4, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/ui/wifiman/ui/component/network/o;->c(Lcom/ui/wifiman/ui/component/network/i;Landroidx/compose/ui/e;FILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
