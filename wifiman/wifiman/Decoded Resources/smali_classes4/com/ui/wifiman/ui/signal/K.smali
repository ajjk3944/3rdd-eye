.class public final synthetic Lcom/ui/wifiman/ui/signal/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/ui/signal/N;

.field public final synthetic b:LTe/K0;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/ui/signal/N;LTe/K0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/K;->a:Lcom/ui/wifiman/ui/signal/N;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/K;->b:LTe/K0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/ui/signal/K;->a:Lcom/ui/wifiman/ui/signal/N;

    iget-object v1, p0, Lcom/ui/wifiman/ui/signal/K;->b:LTe/K0;

    invoke-static {v0, v1}, Lcom/ui/wifiman/ui/signal/M$a;->a(Lcom/ui/wifiman/ui/signal/N;LTe/K0;)LYg/J;

    move-result-object v0

    return-object v0
.end method
