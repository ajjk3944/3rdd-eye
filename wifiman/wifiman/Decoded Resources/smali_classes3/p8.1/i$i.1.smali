.class final Lp8/i$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp8/i;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lp8/i$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp8/i$i;

    invoke-direct {v0}, Lp8/i$i;-><init>()V

    sput-object v0, Lp8/i$i;->a:Lp8/i$i;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lp8/i$b;

    check-cast p2, Lp8/i$b;

    invoke-virtual {p0, p1, p2}, Lp8/i$i;->b(Lp8/i$b;Lp8/i$b;)Z

    move-result p1

    return p1
.end method

.method public final b(Lp8/i$b;Lp8/i$b;)Z
    .locals 1

    const-string/jumbo v0, "prev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lp8/i$b$a;

    if-nez v0, :cond_2

    instance-of v0, p2, Lp8/i$b$b;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of p1, p2, Lp8/i$b$c;

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    :goto_1
    return p1
.end method
