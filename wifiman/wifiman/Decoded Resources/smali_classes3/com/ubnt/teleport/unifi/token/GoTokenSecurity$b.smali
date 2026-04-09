.class final Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/teleport/unifi/token/GoTokenSecurity;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)V
    .locals 0

    iput-object p1, p0, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$b;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$b$a;

    iget-object v1, p0, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$b;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;

    invoke-direct {v0, v1, p1}, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$b$a;-><init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;Ljava/lang/String;)V

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$b;->a(Ljava/lang/String;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
