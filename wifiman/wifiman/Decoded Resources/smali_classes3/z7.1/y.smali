.class public final Lz7/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz7/x;


# instance fields
.field private final a:Lmh/l;


# direct methods
.method public constructor <init>(Lmh/l;)V
    .locals 1

    const-string/jumbo v0, "rawSocketFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lz7/y;->a:Lmh/l;

    return-void
.end method

.method public synthetic constructor <init>(Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lz7/l;->c()Lmh/l;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lz7/y;-><init>(Lmh/l;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;)Ljava/net/DatagramSocket;
    .locals 1

    new-instance v0, Lz7/y$a;

    invoke-direct {v0, p1}, Lz7/y$a;-><init>(Ljava/lang/Integer;)V

    invoke-static {v0}, Lx7/a;->c(Lmh/a;)V

    iget-object v0, p0, Lz7/y;->a:Lmh/l;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/net/DatagramSocket;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/net/DatagramSocket;->setBroadcast(Z)V

    return-object p1
.end method
