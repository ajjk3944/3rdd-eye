.class public abstract Lpi/w0;
.super Lpi/E0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpi/w0$a;
    }
.end annotation


# static fields
.field public static final c:Lpi/w0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpi/w0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpi/w0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpi/w0;->c:Lpi/w0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lpi/E0;-><init>()V

    return-void
.end method

.method public static final i(Lpi/v0;Ljava/util/List;)Lpi/E0;
    .locals 1

    sget-object v0, Lpi/w0;->c:Lpi/w0$a;

    invoke-virtual {v0, p0, p1}, Lpi/w0$a;->b(Lpi/v0;Ljava/util/List;)Lpi/E0;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Ljava/util/Map;)Lpi/w0;
    .locals 1

    sget-object v0, Lpi/w0;->c:Lpi/w0$a;

    invoke-virtual {v0, p0}, Lpi/w0$a;->c(Ljava/util/Map;)Lpi/w0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public e(Lpi/S;)Lpi/B0;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lpi/S;->N0()Lpi/v0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpi/w0;->k(Lpi/v0;)Lpi/B0;

    move-result-object p1

    return-object p1
.end method

.method public abstract k(Lpi/v0;)Lpi/B0;
.end method
