.class public final synthetic Lz7/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz7/w;

.field public final synthetic b:Ljava/net/DatagramSocket;


# direct methods
.method public synthetic constructor <init>(Lz7/w;Ljava/net/DatagramSocket;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz7/v;->a:Lz7/w;

    iput-object p2, p0, Lz7/v;->b:Ljava/net/DatagramSocket;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz7/v;->a:Lz7/w;

    iget-object v1, p0, Lz7/v;->b:Ljava/net/DatagramSocket;

    invoke-static {v0, v1}, Lz7/w;->a(Lz7/w;Ljava/net/DatagramSocket;)V

    return-void
.end method
