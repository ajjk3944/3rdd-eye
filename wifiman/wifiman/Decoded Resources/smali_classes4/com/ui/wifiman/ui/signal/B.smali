.class public final synthetic Lcom/ui/wifiman/ui/signal/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/ui/signal/w;

.field public final synthetic b:LT/q0;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/ui/signal/w;LT/q0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/B;->a:Lcom/ui/wifiman/ui/signal/w;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/B;->b:LT/q0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/ui/signal/B;->a:Lcom/ui/wifiman/ui/signal/w;

    iget-object v1, p0, Lcom/ui/wifiman/ui/signal/B;->b:LT/q0;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/ui/wifiman/ui/signal/z$b$a$a;->b(Lcom/ui/wifiman/ui/signal/w;LT/q0;Ljava/lang/String;)LYg/J;

    move-result-object p1

    return-object p1
.end method
