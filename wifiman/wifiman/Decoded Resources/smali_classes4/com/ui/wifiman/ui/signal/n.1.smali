.class public final synthetic Lcom/ui/wifiman/ui/signal/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lcom/ui/wifiman/ui/signal/m;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/ui/wifiman/ui/signal/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/n;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/ui/wifiman/ui/signal/n;->b:Lcom/ui/wifiman/ui/signal/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/ui/signal/n;->a:Ljava/util/List;

    iget-object v1, p0, Lcom/ui/wifiman/ui/signal/n;->b:Lcom/ui/wifiman/ui/signal/m;

    check-cast p1, LA/y;

    invoke-static {v0, v1, p1}, Lcom/ui/wifiman/ui/signal/r;->a(Ljava/util/List;Lcom/ui/wifiman/ui/signal/m;LA/y;)LYg/J;

    move-result-object p1

    return-object p1
.end method
