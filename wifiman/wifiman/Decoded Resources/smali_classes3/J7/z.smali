.class public final synthetic LJ7/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# instance fields
.field public final synthetic a:Lmh/l;


# direct methods
.method public synthetic constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ7/z;->a:Lmh/l;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LJ7/z;->a:Lmh/l;

    invoke-static {v0, p1}, LJ7/F;->w(Lmh/l;Ljava/lang/Object;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    move-result-object p1

    return-object p1
.end method
