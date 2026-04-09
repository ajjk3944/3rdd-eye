.class public final synthetic Lcom/ui/wifiman/ui/signal/J;
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

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/J;->a:Lcom/ui/wifiman/ui/signal/N;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/signal/J;->a:Lcom/ui/wifiman/ui/signal/N;

    check-cast p1, LJ9/a;

    invoke-static {v0, p1}, Lcom/ui/wifiman/ui/signal/M$a;->b(Lcom/ui/wifiman/ui/signal/N;LJ9/a;)LYg/J;

    move-result-object p1

    return-object p1
.end method
