.class public final Lg2/d;
.super Lf2/v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg2/d$a;
    }
.end annotation

.annotation runtime Lf2/D$b;
    value = "navigation"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lg2/d;",
        "Lf2/v;",
        "Lf2/E;",
        "navigatorProvider",
        "<init>",
        "(Lf2/E;)V",
        "Lf2/t;",
        "l",
        "()Lf2/t;",
        "a",
        "navigation-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lf2/E;)V
    .locals 0

    invoke-direct {p0, p1}, Lf2/v;-><init>(Lf2/E;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lf2/r;
    .locals 1

    invoke-virtual {p0}, Lg2/d;->l()Lf2/t;

    move-result-object v0

    return-object v0
.end method

.method public l()Lf2/t;
    .locals 1

    new-instance v0, Lg2/d$a;

    invoke-direct {v0, p0}, Lg2/d$a;-><init>(Lf2/D;)V

    return-object v0
.end method
