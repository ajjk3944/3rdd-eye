.class public final synthetic Lcom/ui/wifiman/ui/teleport/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/ui/teleport/A$a;

.field public final synthetic b:Landroidx/compose/ui/e;

.field public final synthetic c:Lcom/ui/wifiman/ui/teleport/B;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/ui/teleport/A$a;Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/I;->a:Lcom/ui/wifiman/ui/teleport/A$a;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/I;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, Lcom/ui/wifiman/ui/teleport/I;->c:Lcom/ui/wifiman/ui/teleport/B;

    iput p4, p0, Lcom/ui/wifiman/ui/teleport/I;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/I;->a:Lcom/ui/wifiman/ui/teleport/A$a;

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/I;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, Lcom/ui/wifiman/ui/teleport/I;->c:Lcom/ui/wifiman/ui/teleport/B;

    iget v3, p0, Lcom/ui/wifiman/ui/teleport/I;->d:I

    move-object v4, p1

    check-cast v4, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/ui/wifiman/ui/teleport/J;->c(Lcom/ui/wifiman/ui/teleport/A$a;Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
