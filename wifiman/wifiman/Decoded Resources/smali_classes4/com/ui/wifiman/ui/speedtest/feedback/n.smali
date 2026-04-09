.class public final synthetic Lcom/ui/wifiman/ui/speedtest/feedback/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LT/q0;

.field public final synthetic b:Lcom/ui/wifiman/ui/speedtest/feedback/e;


# direct methods
.method public synthetic constructor <init>(LT/q0;Lcom/ui/wifiman/ui/speedtest/feedback/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/speedtest/feedback/n;->a:LT/q0;

    iput-object p2, p0, Lcom/ui/wifiman/ui/speedtest/feedback/n;->b:Lcom/ui/wifiman/ui/speedtest/feedback/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/ui/speedtest/feedback/n;->a:LT/q0;

    iget-object v1, p0, Lcom/ui/wifiman/ui/speedtest/feedback/n;->b:Lcom/ui/wifiman/ui/speedtest/feedback/e;

    check-cast p1, LR0/Q;

    invoke-static {v0, v1, p1}, Lcom/ui/wifiman/ui/speedtest/feedback/i$b$b;->a(LT/q0;Lcom/ui/wifiman/ui/speedtest/feedback/e;LR0/Q;)LYg/J;

    move-result-object p1

    return-object p1
.end method
