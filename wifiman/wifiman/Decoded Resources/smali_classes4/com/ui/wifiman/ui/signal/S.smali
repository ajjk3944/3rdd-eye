.class public final synthetic Lcom/ui/wifiman/ui/signal/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/ui/signal/N;

.field public final synthetic b:Lcom/ui/wifiman/ui/signal/m;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/ui/signal/N;Lcom/ui/wifiman/ui/signal/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/S;->a:Lcom/ui/wifiman/ui/signal/N;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/S;->b:Lcom/ui/wifiman/ui/signal/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/ui/signal/S;->a:Lcom/ui/wifiman/ui/signal/N;

    iget-object v1, p0, Lcom/ui/wifiman/ui/signal/S;->b:Lcom/ui/wifiman/ui/signal/m;

    check-cast p1, Lf2/u;

    invoke-static {v0, v1, p1}, Lcom/ui/wifiman/ui/signal/P$b;->a(Lcom/ui/wifiman/ui/signal/N;Lcom/ui/wifiman/ui/signal/m;Lf2/u;)LYg/J;

    move-result-object p1

    return-object p1
.end method
