.class public final LJh/K$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJh/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LJh/K$a;

.field private static final b:LJh/K;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LJh/K$a;

    invoke-direct {v0}, LJh/K$a;-><init>()V

    sput-object v0, LJh/K$a;->a:LJh/K$a;

    new-instance v0, LJh/M;

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, LJh/M;-><init>(Ljava/util/Map;)V

    sput-object v0, LJh/K$a;->b:LJh/K;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LJh/K;
    .locals 1

    sget-object v0, LJh/K$a;->b:LJh/K;

    return-object v0
.end method
