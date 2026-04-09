.class public final synthetic Lcom/ui/wifiman/ui/teleport/consoles/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:LIi/N;

.field public final synthetic c:Lcom/ui/wifiman/ui/teleport/consoles/i;

.field public final synthetic d:F


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;LIi/N;Lcom/ui/wifiman/ui/teleport/consoles/i;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/consoles/j;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/consoles/j;->b:LIi/N;

    iput-object p3, p0, Lcom/ui/wifiman/ui/teleport/consoles/j;->c:Lcom/ui/wifiman/ui/teleport/consoles/i;

    iput p4, p0, Lcom/ui/wifiman/ui/teleport/consoles/j;->d:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/j;->a:Ljava/util/List;

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/j;->b:LIi/N;

    iget-object v2, p0, Lcom/ui/wifiman/ui/teleport/consoles/j;->c:Lcom/ui/wifiman/ui/teleport/consoles/i;

    iget v3, p0, Lcom/ui/wifiman/ui/teleport/consoles/j;->d:F

    check-cast p1, LA/y;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/ui/wifiman/ui/teleport/consoles/u;->f(Ljava/util/List;LIi/N;Lcom/ui/wifiman/ui/teleport/consoles/i;FLA/y;)LYg/J;

    move-result-object p1

    return-object p1
.end method
