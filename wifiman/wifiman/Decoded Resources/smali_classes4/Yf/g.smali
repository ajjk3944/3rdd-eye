.class public final synthetic LYf/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Ljava/lang/StringBuilder;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/StringBuilder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYf/g;->a:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LYf/g;->a:Ljava/lang/StringBuilder;

    check-cast p1, Ljava/net/InetAddress;

    invoke-static {v0, p1}, Lcom/wireguard/config/b;->d(Ljava/lang/StringBuilder;Ljava/net/InetAddress;)V

    return-void
.end method
