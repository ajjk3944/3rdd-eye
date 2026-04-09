.class public final LCh/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCh/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCh/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:LCh/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LCh/c$b;

    invoke-direct {v0}, LCh/c$b;-><init>()V

    sput-object v0, LCh/c$b;->a:LCh/c$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LBh/e;LBh/f0;)Z
    .locals 1

    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "functionDescriptor"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    invoke-static {}, LCh/d;->a()LZh/c;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;->P(LZh/c;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
