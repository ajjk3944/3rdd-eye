.class final Lcom/ui/wifiman/model/teleport/session/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/session/a;-><init>(Landroid/content/Context;Llc/e;Lmc/a;Lac/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/session/a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/session/a$e;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/session/a$e;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/session/a$e;->a:Lcom/ui/wifiman/model/teleport/session/a$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)Lcom/ui/wifiman/model/teleport/session/TeleportSession$a;
    .locals 1

    const-string v0, "vpnApproved"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/teleport/session/TeleportSession$a;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/teleport/session/TeleportSession$a;-><init>(Z)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/session/a$e;->a(Ljava/lang/Boolean;)Lcom/ui/wifiman/model/teleport/session/TeleportSession$a;

    move-result-object p1

    return-object p1
.end method
