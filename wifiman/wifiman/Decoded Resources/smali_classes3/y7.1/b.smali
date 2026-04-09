.class public final Ly7/b;
.super Ly7/d;
.source "SourceFile"


# instance fields
.field private final b:Ljava/net/Inet4Address;


# direct methods
.method public constructor <init>(Ljava/net/Inet4Address;)V
    .locals 1

    const-string/jumbo v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ly7/d;-><init>()V

    iput-object p1, p0, Ly7/b;->b:Ljava/net/Inet4Address;

    return-void
.end method


# virtual methods
.method public bridge synthetic b()Ljava/net/InetAddress;
    .locals 1

    invoke-virtual {p0}, Ly7/b;->d()Ljava/net/Inet4Address;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/net/Inet4Address;
    .locals 1

    iget-object v0, p0, Ly7/b;->b:Ljava/net/Inet4Address;

    return-object v0
.end method
