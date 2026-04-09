.class public final synthetic Lz7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field public final synthetic a:Ljava/net/DatagramSocket;


# direct methods
.method public synthetic constructor <init>(Ljava/net/DatagramSocket;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz7/c;->a:Ljava/net/DatagramSocket;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lz7/c;->a:Ljava/net/DatagramSocket;

    invoke-static {v0}, Lz7/d$a;->a(Ljava/net/DatagramSocket;)V

    return-void
.end method
