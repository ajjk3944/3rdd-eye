.class public final Lii/i;
.super Lii/a;
.source "SourceFile"


# instance fields
.field private final b:Loi/i;


# direct methods
.method public constructor <init>(Lmh/a;)V
    .locals 2

    .line 1
    const-string v0, "getScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, p1, v1, v0}, Lii/i;-><init>(Loi/n;Lmh/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Loi/n;Lmh/a;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Lii/a;-><init>()V

    .line 5
    new-instance v0, Lii/h;

    invoke-direct {v0, p2}, Lii/h;-><init>(Lmh/a;)V

    invoke-interface {p1, v0}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, Lii/i;->b:Loi/i;

    return-void
.end method

.method public synthetic constructor <init>(Loi/n;Lmh/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 2
    sget-object p1, Loi/f;->e:Loi/n;

    .line 3
    :cond_0
    invoke-direct {p0, p1, p2}, Lii/i;-><init>(Loi/n;Lmh/a;)V

    return-void
.end method

.method static synthetic j(Lmh/a;)Lii/k;
    .locals 0

    invoke-static {p0}, Lii/i;->k(Lmh/a;)Lii/k;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lmh/a;)Lii/k;
    .locals 1

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lii/k;

    instance-of v0, p0, Lii/a;

    if-eqz v0, :cond_0

    check-cast p0, Lii/a;

    invoke-virtual {p0}, Lii/a;->h()Lii/k;

    move-result-object p0

    :cond_0
    return-object p0
.end method


# virtual methods
.method protected i()Lii/k;
    .locals 1

    iget-object v0, p0, Lii/i;->b:Loi/i;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lii/k;

    return-object v0
.end method
