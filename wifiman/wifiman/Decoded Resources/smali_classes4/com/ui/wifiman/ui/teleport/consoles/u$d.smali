.class final Lcom/ui/wifiman/ui/teleport/consoles/u$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/teleport/consoles/u;->t(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/consoles/i;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/teleport/consoles/i;

.field final synthetic b:Lcom/ui/wifiman/ui/teleport/consoles/h;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/teleport/consoles/i;Lcom/ui/wifiman/ui/teleport/consoles/h;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$d;->a:Lcom/ui/wifiman/ui/teleport/consoles/i;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$d;->b:Lcom/ui/wifiman/ui/teleport/consoles/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$d;->a:Lcom/ui/wifiman/ui/teleport/consoles/i;

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$d;->b:Lcom/ui/wifiman/ui/teleport/consoles/h;

    check-cast v1, Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    invoke-virtual {v0, v1}, Lcom/ui/wifiman/ui/teleport/consoles/i;->o0(Lcom/ui/wifiman/ui/teleport/consoles/h$a;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/teleport/consoles/u$d;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
