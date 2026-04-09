.class public final LSh/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lli/x;


# static fields
.field public static final a:LSh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LSh/p;

    invoke-direct {v0}, LSh/p;-><init>()V

    sput-object v0, LSh/p;->a:LSh/p;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LUh/q;Ljava/lang/String;Lpi/d0;Lpi/d0;)Lpi/S;
    .locals 1

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flexibleId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lowerBound"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperBound"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlin.jvm.PlatformType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lkotlin/reflect/jvm/internal/impl/types/error/k;->ERROR_FLEXIBLE_TYPE:Lkotlin/reflect/jvm/internal/impl/types/error/k;

    invoke-virtual {p3}, Lpi/d0;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4}, Lpi/d0;->toString()Ljava/lang/String;

    move-result-object p4

    filled-new-array {p2, p3, p4}, [Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/error/l;->d(Lkotlin/reflect/jvm/internal/impl/types/error/k;[Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/types/error/i;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, LXh/a;->g:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    invoke-virtual {p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;->S(Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, LOh/k;

    invoke-direct {p1, p3, p4}, LOh/k;-><init>(Lpi/d0;Lpi/d0;)V

    return-object p1

    :cond_1
    invoke-static {p3, p4}, Lpi/V;->e(Lpi/d0;Lpi/d0;)Lpi/M0;

    move-result-object p1

    return-object p1
.end method
