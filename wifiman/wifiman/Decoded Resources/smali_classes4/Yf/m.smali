.class public final synthetic LYf/m;
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

    iput-object p1, p0, LYf/m;->a:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LYf/m;->a:Ljava/lang/StringBuilder;

    check-cast p1, Lcom/wireguard/crypto/b;

    invoke-static {v0, p1}, Lcom/wireguard/config/c;->a(Ljava/lang/StringBuilder;Lcom/wireguard/crypto/b;)V

    return-void
.end method
