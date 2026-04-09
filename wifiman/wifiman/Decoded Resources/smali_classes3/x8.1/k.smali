.class public final synthetic Lx8/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/ui/signal/d;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/ui/signal/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx8/k;->a:Lcom/ui/wifiman/ui/signal/d;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx8/k;->a:Lcom/ui/wifiman/ui/signal/d;

    check-cast p1, Lde/y;

    invoke-static {v0, p1}, Lx8/l;->p0(Lcom/ui/wifiman/ui/signal/d;Lde/y;)Lde/y;

    move-result-object p1

    return-object p1
.end method
