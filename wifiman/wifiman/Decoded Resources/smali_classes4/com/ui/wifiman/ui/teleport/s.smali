.class public final synthetic Lcom/ui/wifiman/ui/teleport/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/ui/teleport/b$a;

.field public final synthetic b:Lcom/ui/wifiman/ui/teleport/d;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/ui/teleport/b$a;Lcom/ui/wifiman/ui/teleport/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/s;->a:Lcom/ui/wifiman/ui/teleport/b$a;

    iput-object p2, p0, Lcom/ui/wifiman/ui/teleport/s;->b:Lcom/ui/wifiman/ui/teleport/d;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/s;->a:Lcom/ui/wifiman/ui/teleport/b$a;

    iget-object v1, p0, Lcom/ui/wifiman/ui/teleport/s;->b:Lcom/ui/wifiman/ui/teleport/d;

    invoke-static {v0, v1}, Lcom/ui/wifiman/ui/teleport/v;->a(Lcom/ui/wifiman/ui/teleport/b$a;Lcom/ui/wifiman/ui/teleport/d;)LYg/J;

    move-result-object v0

    return-object v0
.end method
