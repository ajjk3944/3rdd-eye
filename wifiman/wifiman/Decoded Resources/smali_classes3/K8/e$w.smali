.class final LK8/e$w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK8/e;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LK8/e$w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK8/e$w;

    invoke-direct {v0}, LK8/e$w;-><init>()V

    sput-object v0, LK8/e$w;->a:LK8/e$w;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)LDj/a;
    .locals 2

    const-string/jumbo v0, "connectionState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    if-eqz v0, :cond_0

    new-instance p1, Ls9/d$a;

    const-string/jumbo v0, "disconnected"

    sget-object v1, LK8/e$w$a;->a:LK8/e$w$a;

    invoke-direct {p1, v0, v1}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b;

    if-eqz v0, :cond_1

    new-instance p1, Ls9/d$a;

    const-string/jumbo v0, "connecting"

    sget-object v1, LK8/e$w$b;->a:LK8/e$w$b;

    invoke-direct {p1, v0, v1}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;

    if-eqz v0, :cond_2

    new-instance v0, LK8/e$w$f;

    invoke-direct {v0, p1}, LK8/e$w$f;-><init>(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LK8/e$w$c;->a:LK8/e$w$c;

    invoke-virtual {p1, v0}, Lgg/z;->K(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, LK8/e$w$d;->a:LK8/e$w$d;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, LK8/e$w$e;->a:LK8/e$w$e;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    invoke-virtual {p0, p1}, LK8/e$w;->a(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)LDj/a;

    move-result-object p1

    return-object p1
.end method
