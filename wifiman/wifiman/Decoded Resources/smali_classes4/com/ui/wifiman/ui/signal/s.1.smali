.class public final synthetic Lcom/ui/wifiman/ui/signal/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Lcom/ui/wifiman/ui/signal/l$b;

.field public final synthetic c:Lcom/ui/wifiman/ui/signal/m;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/l$b;Lcom/ui/wifiman/ui/signal/m;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/s;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/s;->b:Lcom/ui/wifiman/ui/signal/l$b;

    iput-object p3, p0, Lcom/ui/wifiman/ui/signal/s;->c:Lcom/ui/wifiman/ui/signal/m;

    iput p4, p0, Lcom/ui/wifiman/ui/signal/s;->d:I

    iput p5, p0, Lcom/ui/wifiman/ui/signal/s;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/ui/wifiman/ui/signal/s;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lcom/ui/wifiman/ui/signal/s;->b:Lcom/ui/wifiman/ui/signal/l$b;

    iget-object v2, p0, Lcom/ui/wifiman/ui/signal/s;->c:Lcom/ui/wifiman/ui/signal/m;

    iget v3, p0, Lcom/ui/wifiman/ui/signal/s;->d:I

    iget v4, p0, Lcom/ui/wifiman/ui/signal/s;->e:I

    move-object v5, p1

    check-cast v5, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/ui/wifiman/ui/signal/t;->a(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/l$b;Lcom/ui/wifiman/ui/signal/m;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
