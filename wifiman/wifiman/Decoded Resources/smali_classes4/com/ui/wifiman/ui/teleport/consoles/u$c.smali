.class final Lcom/ui/wifiman/ui/teleport/consoles/u$c;
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
.field final synthetic a:LIi/N;

.field final synthetic b:Lcom/ui/wifiman/ui/teleport/consoles/i;

.field final synthetic c:Lcom/ui/wifiman/ui/teleport/consoles/h;


# direct methods
.method constructor <init>(LIi/N;Lcom/ui/wifiman/ui/teleport/consoles/i;Lcom/ui/wifiman/ui/teleport/consoles/h;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$c;->a:LIi/N;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$c;->b:Lcom/ui/wifiman/ui/teleport/consoles/i;

    iput-object p3, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$c;->c:Lcom/ui/wifiman/ui/teleport/consoles/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$c;->a:LIi/N;

    new-instance v3, Lcom/ui/wifiman/ui/teleport/consoles/u$c$a;

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$c;->b:Lcom/ui/wifiman/ui/teleport/consoles/i;

    iget-object v2, p0, Lcom/ui/wifiman/ui/teleport/consoles/u$c;->c:Lcom/ui/wifiman/ui/teleport/consoles/h;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v2, v4}, Lcom/ui/wifiman/ui/teleport/consoles/u$c$a;-><init>(Lcom/ui/wifiman/ui/teleport/consoles/i;Lcom/ui/wifiman/ui/teleport/consoles/h;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/teleport/consoles/u$c;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
