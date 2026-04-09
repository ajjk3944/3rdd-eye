.class public final Lkotlin/reflect/jvm/internal/impl/types/checker/p$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/impl/types/checker/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lkotlin/reflect/jvm/internal/impl/types/checker/p$a;

.field private static final b:Lkotlin/reflect/jvm/internal/impl/types/checker/q;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/checker/p$a;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/types/checker/p$a;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/p$a;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/p$a;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/checker/q;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/types/checker/g$a;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/g$a;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Lkotlin/reflect/jvm/internal/impl/types/checker/q;-><init>(Lkotlin/reflect/jvm/internal/impl/types/checker/g;Lkotlin/reflect/jvm/internal/impl/types/checker/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/p$a;->b:Lkotlin/reflect/jvm/internal/impl/types/checker/q;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lkotlin/reflect/jvm/internal/impl/types/checker/q;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/p$a;->b:Lkotlin/reflect/jvm/internal/impl/types/checker/q;

    return-object v0
.end method
