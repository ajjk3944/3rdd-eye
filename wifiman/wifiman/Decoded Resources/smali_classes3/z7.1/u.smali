.class public final Lz7/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz7/q;


# instance fields
.field private final b:Ljava/net/DatagramSocket;

.field private final c:Lp7/b;

.field private final d:LYg/m;


# direct methods
.method public constructor <init>(Ljava/net/DatagramSocket;Lp7/b;)V
    .locals 1

    const-string/jumbo v0, "socket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "schedulerProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz7/u;->b:Ljava/net/DatagramSocket;

    iput-object p2, p0, Lz7/u;->c:Lp7/b;

    new-instance p1, Lz7/u$a;

    invoke-direct {p1, p0}, Lz7/u$a;-><init>(Lz7/u;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lz7/u;->d:LYg/m;

    return-void
.end method

.method public static final synthetic b(Lz7/u;)Lp7/b;
    .locals 0

    iget-object p0, p0, Lz7/u;->c:Lp7/b;

    return-object p0
.end method

.method public static final synthetic c(Lz7/u;)Ljava/net/DatagramSocket;
    .locals 0

    iget-object p0, p0, Lz7/u;->b:Ljava/net/DatagramSocket;

    return-object p0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lz7/u;->d:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgg/i;

    return-object v0
.end method
