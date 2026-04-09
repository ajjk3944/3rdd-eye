.class final Lcom/ui/wifiman/model/teleport/session/a$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/session/a;->b()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/session/a$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/session/a$h;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/session/a$h;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/session/a$h;->a:Lcom/ui/wifiman/model/teleport/session/a$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lgg/f;
    .locals 5

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    const-string v2, "component2(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Llc/c;

    invoke-virtual {p1}, Llc/c;->c()I

    move-result p1

    const-string v2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    if-nez p1, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v0

    const-wide/16 v0, 0x1f4

    cmp-long p1, v3, v0

    if-gez p1, :cond_0

    const-string p1, "VPN Profile creation cancelled probably by system, because other VPN running"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p1, Lcom/ui/wifiman/model/teleport/session/TeleportSession$Error$VPNProfileCreationCancelledBySystem;->a:Lcom/ui/wifiman/model/teleport/session/TeleportSession$Error$VPNProfileCreationCancelledBySystem;

    invoke-static {p1}, Lgg/b;->D(Ljava/lang/Throwable;)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/ui/wifiman/model/teleport/session/a$h$a;

    invoke-direct {p1}, Lcom/ui/wifiman/model/teleport/session/a$h$a;-><init>()V

    invoke-static {p1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/ui/wifiman/model/teleport/session/a$h$b;

    invoke-direct {p1}, Lcom/ui/wifiman/model/teleport/session/a$h$b;-><init>()V

    invoke-static {p1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/session/a$h;->a(LYg/s;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
