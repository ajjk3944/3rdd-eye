.class public final Lcom/ubnt/teleport/unifi/token/GoTokenSecurity;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM7/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 \u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0005\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/ubnt/teleport/unifi/token/GoTokenSecurity;",
        "LM7/b;",
        "<init>",
        "()V",
        "",
        "secret",
        "bridgeConvertSecretToToken",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;",
        "Lgg/z;",
        "a",
        "(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)Lgg/z;",
        "teleport-unifi_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lmh/l;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity;->d(Lmh/l;Ljava/lang/Object;)V

    return-void
.end method

.method private final native bridgeConvertSecretToToken(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final synthetic c(Lcom/ubnt/teleport/unifi/token/GoTokenSecurity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity;->bridgeConvertSecretToToken(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lmh/l;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)Lgg/z;
    .locals 3

    const-string/jumbo v0, "secret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LN7/b;->a:LN7/b;

    invoke-virtual {v0}, LN7/b;->a()Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$a;

    invoke-direct {v1, p0, p1}, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$a;-><init>(Lcom/ubnt/teleport/unifi/token/GoTokenSecurity;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)V

    invoke-static {v1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v1

    const-string/jumbo v2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$b;

    invoke-direct {v1, p1}, Lcom/ubnt/teleport/unifi/token/GoTokenSecurity$b;-><init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)V

    new-instance p1, LM7/a;

    invoke-direct {p1, v1}, LM7/a;-><init>(Lmh/l;)V

    invoke-virtual {v0, p1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "secret: TeleportCloud.To\u2026 xx${it.takeLast(4)}\" } }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
