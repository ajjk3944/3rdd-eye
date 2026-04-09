.class public final Ln8/f;
.super Ln8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln8/f$a;
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;La8/b;)V
    .locals 1

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Ln8/f$a;

    invoke-direct {v0, p1, p2}, Ln8/f$a;-><init>(Lorg/kodein/di/DI;La8/b;)V

    .line 3
    invoke-direct {p0, p1, v0}, Ln8/f;-><init>(Lorg/kodein/di/DI;Ln8/a$c;)V

    return-void
.end method

.method public constructor <init>(Lorg/kodein/di/DI;Linet/ipaddr/g;)V
    .locals 1

    const-string/jumbo v0, "di"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "ip"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Ln8/f$a;

    invoke-direct {v0, p1, p2}, Ln8/f$a;-><init>(Lorg/kodein/di/DI;Linet/ipaddr/g;)V

    .line 5
    invoke-direct {p0, p1, v0}, Ln8/f;-><init>(Lorg/kodein/di/DI;Ln8/a$c;)V

    return-void
.end method

.method private constructor <init>(Lorg/kodein/di/DI;Ln8/a$c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ln8/a;-><init>(Lorg/kodein/di/DI;Ln8/a$c;)V

    return-void
.end method
