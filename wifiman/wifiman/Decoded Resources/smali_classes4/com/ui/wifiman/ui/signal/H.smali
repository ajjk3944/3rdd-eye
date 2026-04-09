.class public final synthetic Lcom/ui/wifiman/ui/signal/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/ui/signal/N;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/ui/signal/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/H;->a:Lcom/ui/wifiman/ui/signal/N;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/signal/H;->a:Lcom/ui/wifiman/ui/signal/N;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/ui/wifiman/ui/signal/M;->b(Lcom/ui/wifiman/ui/signal/N;Ljava/lang/String;)LYg/J;

    move-result-object p1

    return-object p1
.end method
