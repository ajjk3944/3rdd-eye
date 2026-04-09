.class public final Lii/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lii/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lii/k$a;

.field private static final b:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lii/k$a;

    invoke-direct {v0}, Lii/k$a;-><init>()V

    sput-object v0, Lii/k$a;->a:Lii/k$a;

    sget-object v0, Lii/j;->a:Lii/j;

    sput-object v0, Lii/k$a;->b:Lmh/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final a(LZh/f;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method static synthetic b(LZh/f;)Z
    .locals 0

    invoke-static {p0}, Lii/k$a;->a(LZh/f;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final c()Lmh/l;
    .locals 1

    sget-object v0, Lii/k$a;->b:Lmh/l;

    return-object v0
.end method
