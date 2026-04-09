.class final Lcom/ui/wifiman/ui/signal/r$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/signal/r;->e(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/signal/m;Lcom/ui/wifiman/ui/signal/l$a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/signal/m;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/signal/m;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/r$b;->a:Lcom/ui/wifiman/ui/signal/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lmh/p;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/ui/signal/r$b$a;

    iget-object v1, p0, Lcom/ui/wifiman/ui/signal/r$b;->a:Lcom/ui/wifiman/ui/signal/m;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/ui/signal/r$b$a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/signal/r$b;->a()Lmh/p;

    move-result-object v0

    return-object v0
.end method
