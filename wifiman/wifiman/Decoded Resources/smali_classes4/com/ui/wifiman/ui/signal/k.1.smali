.class public final synthetic Lcom/ui/wifiman/ui/signal/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/ui/signal/g;

.field public final synthetic b:LTe/k0;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/ui/signal/g;LTe/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/k;->a:Lcom/ui/wifiman/ui/signal/g;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/k;->b:LTe/k0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/ui/signal/k;->a:Lcom/ui/wifiman/ui/signal/g;

    iget-object v1, p0, Lcom/ui/wifiman/ui/signal/k;->b:LTe/k0;

    invoke-static {v0, v1}, Lcom/ui/wifiman/ui/signal/i$b$b;->a(Lcom/ui/wifiman/ui/signal/g;LTe/k0;)LYg/J;

    move-result-object v0

    return-object v0
.end method
