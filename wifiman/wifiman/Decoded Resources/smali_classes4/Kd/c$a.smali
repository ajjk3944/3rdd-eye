.class final LKd/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKd/c;->b(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/util/UUID;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

.field final synthetic c:Ljava/util/UUID;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/util/UUID;)V
    .locals 0

    iput-object p1, p0, LKd/c$a;->a:Ljava/lang/String;

    iput-object p2, p0, LKd/c$a;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    iput-object p3, p0, LKd/c$a;->c:Ljava/util/UUID;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LKd/a$a;)LKd/a;
    .locals 7

    const-string v0, "console"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKd/a;

    iget-object v2, p0, LKd/c$a;->a:Ljava/lang/String;

    iget-object v3, p0, LKd/c$a;->b:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    iget-object v4, p0, LKd/c$a;->c:Ljava/util/UUID;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v5, p1

    invoke-direct/range {v1 .. v6}, LKd/a;-><init>(Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/util/UUID;LKd/a$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKd/a$a;

    invoke-virtual {p0, p1}, LKd/c$a;->a(LKd/a$a;)LKd/a;

    move-result-object p1

    return-object p1
.end method
