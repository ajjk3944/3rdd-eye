.class public final synthetic Lcom/ui/wifiman/ui/teleport/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Lcom/ui/wifiman/ui/teleport/b$a;

.field public final synthetic c:Lcom/ui/wifiman/ui/teleport/d;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/b$a;Lcom/ui/wifiman/ui/teleport/d;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/t;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/t;->b:Lcom/ui/wifiman/ui/teleport/b$a;

    iput-object p3, p0, Lcom/ui/wifiman/ui/teleport/t;->c:Lcom/ui/wifiman/ui/teleport/d;

    iput p4, p0, Lcom/ui/wifiman/ui/teleport/t;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/t;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/t;->b:Lcom/ui/wifiman/ui/teleport/b$a;

    iget-object v2, p0, Lcom/ui/wifiman/ui/teleport/t;->c:Lcom/ui/wifiman/ui/teleport/d;

    iget v3, p0, Lcom/ui/wifiman/ui/teleport/t;->d:I

    move-object v4, p1

    check-cast v4, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/ui/wifiman/ui/teleport/v;->b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/b$a;Lcom/ui/wifiman/ui/teleport/d;ILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
