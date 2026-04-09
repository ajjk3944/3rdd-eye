.class public final synthetic Lcom/ui/wifiman/ui/teleport/consoles/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:F

.field public final synthetic c:Lcom/ui/wifiman/ui/teleport/consoles/h$a;

.field public final synthetic d:Lmh/a;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;FLcom/ui/wifiman/ui/teleport/consoles/h$a;Lmh/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/consoles/p;->a:Landroidx/compose/ui/e;

    iput p2, p0, Lcom/ui/wifiman/ui/teleport/consoles/p;->b:F

    iput-object p3, p0, Lcom/ui/wifiman/ui/teleport/consoles/p;->c:Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    iput-object p4, p0, Lcom/ui/wifiman/ui/teleport/consoles/p;->d:Lmh/a;

    iput p5, p0, Lcom/ui/wifiman/ui/teleport/consoles/p;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/p;->a:Landroidx/compose/ui/e;

    iget v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/p;->b:F

    iget-object v2, p0, Lcom/ui/wifiman/ui/teleport/consoles/p;->c:Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    iget-object v3, p0, Lcom/ui/wifiman/ui/teleport/consoles/p;->d:Lmh/a;

    iget v4, p0, Lcom/ui/wifiman/ui/teleport/consoles/p;->e:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/ui/wifiman/ui/teleport/consoles/u;->h(Landroidx/compose/ui/e;FLcom/ui/wifiman/ui/teleport/consoles/h$a;Lmh/a;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
