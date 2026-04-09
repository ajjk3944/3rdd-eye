.class final Lbe/i$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbe/i;-><init>(LZc/f;Lbe/c$a;LP7/a;Lcom/ui/wifiman/model/teleport/TeleportConnection;LFd/D;Lcom/ui/wifiman/model/support/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbe/i$g$a;
    }
.end annotation


# static fields
.field public static final a:Lbe/i$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbe/i$g;

    invoke-direct {v0}, Lbe/i$g;-><init>()V

    sput-object v0, Lbe/i$g;->a:Lbe/i$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LZc/e;)Ll9/a;
    .locals 4

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LZc/e;->g()Lb8/c;

    move-result-object v0

    sget-object v1, Lbe/i$g$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eq v0, v1, :cond_2

    if-eq v0, v2, :cond_2

    const/4 p1, 0x3

    if-eq v0, p1, :cond_1

    const/4 p1, 0x4

    if-eq v0, p1, :cond_1

    const/4 p1, 0x5

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    move-object p1, v3

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, LZc/e;->b()LZc/e$a;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LZc/e$a;->a()Linet/ipaddr/g;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Linet/ipaddr/a;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_1
    if-eqz p1, :cond_3

    new-instance v0, Lbe/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, v2, v3}, Lbe/c$b;-><init>(Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v0

    :cond_3
    new-instance p1, Ll9/a;

    invoke-direct {p1, v3}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZc/e;

    invoke-virtual {p0, p1}, Lbe/i$g;->a(LZc/e;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
