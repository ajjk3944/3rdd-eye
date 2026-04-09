.class final Lcom/ui/wifiman/model/teleport/b$x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/teleport/b;-><init>(LI7/a;LFd/D;LFd/C;Lcom/ui/wifiman/model/teleport/session/TeleportSession;LP7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/teleport/b$x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/teleport/b$x;

    invoke-direct {v0}, Lcom/ui/wifiman/model/teleport/b$x;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/teleport/b$x;->a:Lcom/ui/wifiman/model/teleport/b$x;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lcom/ui/wifiman/model/teleport/TeleportConnection$a;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {v0}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;->a()F

    move-result v1

    cmpg-float v1, v1, p1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    if-nez v1, :cond_7

    instance-of v1, v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;

    if-eqz v1, :cond_2

    check-cast v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;

    invoke-virtual {v0, p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;->b(F)Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$c;

    move-result-object v0

    goto :goto_0

    :cond_2
    instance-of v1, v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$a;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$a;

    invoke-virtual {v0, p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$a;->b(F)Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$a;

    move-result-object v0

    goto :goto_0

    :cond_3
    instance-of v1, v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$b;

    if-eqz v1, :cond_4

    check-cast v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$b;

    invoke-virtual {v0, p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$b;->b(F)Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$b;

    move-result-object v0

    goto :goto_0

    :cond_4
    instance-of v1, v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$e;

    if-eqz v1, :cond_5

    check-cast v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$e;

    invoke-virtual {v0, p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$e;->b(F)Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$e;

    move-result-object v0

    goto :goto_0

    :cond_5
    instance-of v1, v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$d;

    if-eqz v1, :cond_6

    check-cast v0, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$d;

    invoke-virtual {v0, p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$d;->b(F)Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b$d;

    move-result-object v0

    goto :goto_0

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_0
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/teleport/b$x;->a(LYg/s;)Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    move-result-object p1

    return-object p1
.end method
