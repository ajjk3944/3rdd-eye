.class final Lcom/ui/wifiman/ui/signal/r$f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/r$f;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/signal/m;

.field final synthetic b:Lcom/ui/wifiman/ui/signal/c;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/signal/m;Lcom/ui/wifiman/ui/signal/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/r$f$b;->a:Lcom/ui/wifiman/ui/signal/m;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/r$f$b;->b:Lcom/ui/wifiman/ui/signal/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/ui/signal/r$f$b;->a:Lcom/ui/wifiman/ui/signal/m;

    iget-object v1, p0, Lcom/ui/wifiman/ui/signal/r$f$b;->b:Lcom/ui/wifiman/ui/signal/c;

    check-cast v1, Lcom/ui/wifiman/ui/signal/c$c;

    invoke-virtual {v1}, Lcom/ui/wifiman/ui/signal/c$c;->c()Lcom/ui/wifiman/ui/signal/l$b$b$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ui/wifiman/ui/signal/m;->s0(Lcom/ui/wifiman/ui/signal/l$b$b;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/signal/r$f$b;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
