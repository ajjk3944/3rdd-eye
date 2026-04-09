.class final LJ7/v$a$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/v$a$b;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;)LJ7/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;


# direct methods
.method constructor <init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;)V
    .locals 0

    iput-object p1, p0, LJ7/v$a$b$a;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Instantiating Teleport cloud with token "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LJ7/v$a$b$a;->a:Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    invoke-virtual {v1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJ7/v$a$b$a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
