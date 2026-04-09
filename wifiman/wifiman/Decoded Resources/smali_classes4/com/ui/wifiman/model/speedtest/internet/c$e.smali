.class final Lcom/ui/wifiman/model/speedtest/internet/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/internet/c;->r(LW7/c;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/speedtest/internet/c$e$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/speedtest/internet/c$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$e;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/internet/c$e;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/c$e;->a:Lcom/ui/wifiman/model/speedtest/internet/c$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LIa/g;)Lcom/ui/wifiman/model/speedtest/internet/c$b;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LIa/g;->b()LIa/f;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/speedtest/internet/c$e$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$b$b$a;

    invoke-virtual {p1}, LIa/g;->a()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$b$b$a;-><init>(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/c$b$b$b;

    invoke-virtual {p1}, LIa/g;->a()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$b$b$b;-><init>(Ljava/util/List;)V

    :goto_0
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIa/g;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/c$e;->a(LIa/g;)Lcom/ui/wifiman/model/speedtest/internet/c$b;

    move-result-object p1

    return-object p1
.end method
