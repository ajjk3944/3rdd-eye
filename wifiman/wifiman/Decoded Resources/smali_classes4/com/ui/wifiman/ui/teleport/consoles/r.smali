.class public final synthetic Lcom/ui/wifiman/ui/teleport/consoles/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LIi/N;

.field public final synthetic b:Lcom/ui/wifiman/ui/teleport/consoles/i;


# direct methods
.method public synthetic constructor <init>(LIi/N;Lcom/ui/wifiman/ui/teleport/consoles/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/consoles/r;->a:LIi/N;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/consoles/r;->b:Lcom/ui/wifiman/ui/teleport/consoles/i;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/r;->a:LIi/N;

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/consoles/r;->b:Lcom/ui/wifiman/ui/teleport/consoles/i;

    invoke-static {v0, v1}, Lcom/ui/wifiman/ui/teleport/consoles/u;->g(LIi/N;Lcom/ui/wifiman/ui/teleport/consoles/i;)LYg/J;

    move-result-object v0

    return-object v0
.end method
