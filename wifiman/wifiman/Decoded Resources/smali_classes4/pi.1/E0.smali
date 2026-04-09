.class public abstract Lpi/E0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpi/E0$b;
    }
.end annotation


# static fields
.field public static final a:Lpi/E0$b;

.field public static final b:Lpi/E0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpi/E0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpi/E0$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpi/E0;->a:Lpi/E0$b;

    new-instance v0, Lpi/E0$a;

    invoke-direct {v0}, Lpi/E0$a;-><init>()V

    sput-object v0, Lpi/E0;->b:Lpi/E0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final c()Lpi/G0;
    .locals 2

    invoke-static {p0}, Lpi/G0;->g(Lpi/E0;)Lpi/G0;

    move-result-object v0

    const-string v1, "create(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public d(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 1

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public abstract e(Lpi/S;)Lpi/B0;
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g(Lpi/S;Lpi/N0;)Lpi/S;
    .locals 1

    const-string v0, "topLevelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final h()Lpi/E0;
    .locals 1

    new-instance v0, Lpi/E0$c;

    invoke-direct {v0, p0}, Lpi/E0$c;-><init>(Lpi/E0;)V

    return-object v0
.end method
