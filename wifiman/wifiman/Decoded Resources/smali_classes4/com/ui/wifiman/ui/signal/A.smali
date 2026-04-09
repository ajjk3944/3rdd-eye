.class public final synthetic Lcom/ui/wifiman/ui/signal/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/ui/signal/w;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/ui/signal/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/signal/A;->a:Lcom/ui/wifiman/ui/signal/w;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/signal/A;->a:Lcom/ui/wifiman/ui/signal/w;

    check-cast p1, LF/B;

    invoke-static {v0, p1}, Lcom/ui/wifiman/ui/signal/z$b$a$a;->a(Lcom/ui/wifiman/ui/signal/w;LF/B;)LYg/J;

    move-result-object p1

    return-object p1
.end method
