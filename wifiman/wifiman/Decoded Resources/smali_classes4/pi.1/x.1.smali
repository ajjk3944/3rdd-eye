.class public final Lpi/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpi/q0;


# static fields
.field public static final a:Lpi/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpi/x;

    invoke-direct {v0}, Lpi/x;-><init>()V

    sput-object v0, Lpi/x;->a:Lpi/x;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;Lpi/v0;LBh/m;)Lpi/r0;
    .locals 0

    const-string p2, "annotations"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p1, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {p1}, Lpi/r0$a;->j()Lpi/r0;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p2, Lpi/r0;->b:Lpi/r0$a;

    new-instance p3, Lpi/s;

    invoke-direct {p3, p1}, Lpi/s;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)V

    invoke-static {p3}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2, p1}, Lpi/r0$a;->i(Ljava/util/List;)Lpi/r0;

    move-result-object p1

    :goto_0
    return-object p1
.end method
