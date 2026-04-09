.class public final Lc/L$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/L;
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
    invoke-direct {p0}, Lc/L$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Lc/L$a;IILmh/l;ILjava/lang/Object;)Lc/L;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    sget-object p3, Lc/L$a$a;->a:Lc/L$a$a;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lc/L$a;->a(IILmh/l;)Lc/L;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(IILmh/l;)Lc/L;
    .locals 7

    const-string v0, "detectDarkMode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc/L;

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    move v2, p1

    move v3, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lc/L;-><init>(IIILmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final c(I)Lc/L;
    .locals 7

    new-instance v6, Lc/L;

    sget-object v4, Lc/L$a$b;->a:Lc/L$a$b;

    const/4 v5, 0x0

    const/4 v3, 0x2

    move-object v0, v6

    move v1, p1

    move v2, p1

    invoke-direct/range {v0 .. v5}, Lc/L;-><init>(IIILmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method
