.class final Lcom/ui/wifiman/model/teleport/b$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/b;->q()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/b$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/b$h;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/b$h;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/b$h;->a:Lcom/ui/wifiman/model/teleport/b$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)Lgg/f;
    .locals 1

    const-string v0, "vpnProfileCreated"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoVpnProfile;->a:Lcom/ui/wifiman/model/teleport/TeleportConnection$Error$NoVpnProfile;

    invoke-static {p1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/b$h;->a(Ljava/lang/Boolean;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
