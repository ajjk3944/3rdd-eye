.class public final synthetic LL7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# instance fields
.field public final synthetic a:Lmh/l;


# direct methods
.method public synthetic constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL7/c;->a:Lmh/l;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LL7/c;->a:Lmh/l;

    invoke-static {v0, p1}, Lcom/ubnt/teleport/unifi/stun/GoTeleportStun;->h(Lmh/l;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
