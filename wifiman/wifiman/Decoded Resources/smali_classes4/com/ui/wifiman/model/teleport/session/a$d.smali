.class final Lcom/ui/wifiman/model/teleport/session/a$d;
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
.field public static final a:Lcom/ui/wifiman/model/teleport/session/a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/session/a$d;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/session/a$d;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/session/a$d;->a:Lcom/ui/wifiman/model/teleport/session/a$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lac/a;)Ll9/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lac/a;->f()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/ubnt/teleport/TeleportTunnel$d;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    invoke-static {p1}, Lcom/ubnt/teleport/TeleportTunnel$d;->a(Ljava/lang/String;)Lcom/ubnt/teleport/TeleportTunnel$d;

    move-result-object v0

    :cond_1
    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lac/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/session/a$d;->a(Lac/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
