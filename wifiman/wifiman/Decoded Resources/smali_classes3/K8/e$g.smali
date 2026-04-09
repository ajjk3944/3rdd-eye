.class final LK8/e$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK8/e;->p0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LK8/e$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK8/e$g;

    invoke-direct {v0}, LK8/e$g;-><init>()V

    sput-object v0, LK8/e$g;->a:LK8/e$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Ljava/lang/RuntimeException;
    .locals 1

    const-string/jumbo v0, "tunnelState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;->b()Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "No teleport error available"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_2
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    invoke-virtual {p0, p1}, LK8/e$g;->a(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Ljava/lang/RuntimeException;

    move-result-object p1

    return-object p1
.end method
