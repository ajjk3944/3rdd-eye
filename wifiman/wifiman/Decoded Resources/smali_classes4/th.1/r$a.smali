.class public final Lth/r$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lth/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lth/r$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lth/p;)Lth/r;
    .locals 2

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lth/r;

    sget-object v1, Lth/s;->IN:Lth/s;

    invoke-direct {v0, v1, p1}, Lth/r;-><init>(Lth/s;Lth/p;)V

    return-object v0
.end method

.method public final b(Lth/p;)Lth/r;
    .locals 2

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lth/r;

    sget-object v1, Lth/s;->OUT:Lth/s;

    invoke-direct {v0, v1, p1}, Lth/r;-><init>(Lth/s;Lth/p;)V

    return-object v0
.end method

.method public final c()Lth/r;
    .locals 1

    sget-object v0, Lth/r;->d:Lth/r;

    return-object v0
.end method

.method public final d(Lth/p;)Lth/r;
    .locals 2

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lth/r;

    sget-object v1, Lth/s;->INVARIANT:Lth/s;

    invoke-direct {v0, v1, p1}, Lth/r;-><init>(Lth/s;Lth/p;)V

    return-object v0
.end method
