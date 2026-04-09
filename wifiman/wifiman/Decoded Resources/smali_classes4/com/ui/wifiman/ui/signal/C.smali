.class public final synthetic Lcom/ui/wifiman/ui/signal/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/ui/signal/w;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/ui/signal/w;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/C;->a:Lcom/ui/wifiman/ui/signal/w;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/C;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/ui/signal/C;->a:Lcom/ui/wifiman/ui/signal/w;

    iget-object v1, p0, Lcom/ui/wifiman/ui/signal/C;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/ui/wifiman/ui/signal/z$b$a$b;->a(Lcom/ui/wifiman/ui/signal/w;Ljava/lang/String;)LYg/J;

    move-result-object v0

    return-object v0
.end method
