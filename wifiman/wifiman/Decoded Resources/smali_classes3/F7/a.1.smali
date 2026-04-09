.class public final LF7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF7/a$a;
    }
.end annotation


# static fields
.field public static final a:LF7/a;

.field private static b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LF7/a;

    invoke-direct {v0}, LF7/a;-><init>()V

    sput-object v0, LF7/a;->a:LF7/a;

    const-string/jumbo v0, "\\-"

    const-string/jumbo v1, "\\."

    const-string v2, ":"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LF7/a;->b:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LF7/a$a;
    .locals 1

    new-instance v0, LF7/b;

    invoke-direct {v0}, LF7/b;-><init>()V

    return-object v0
.end method
