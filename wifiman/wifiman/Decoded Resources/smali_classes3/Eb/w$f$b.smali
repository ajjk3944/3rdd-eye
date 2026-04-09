.class public final LEb/w$f$b;
.super LJb/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEb/w$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final f:LEb/w$f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LEb/w$f$b;

    invoke-direct {v0}, LEb/w$f$b;-><init>()V

    sput-object v0, LEb/w$f$b;->f:LEb/w$f$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const-class v0, LEb/w$f;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    new-instance v1, LEb/x;

    invoke-direct {v1}, LEb/x;-><init>()V

    sget-object v2, LEb/w$f;->Unknown:LEb/w$f;

    invoke-direct {p0, v0, v1, v2}, LJb/a;-><init>(Lth/d;Lmh/a;Ljava/lang/Enum;)V

    return-void
.end method

.method public static synthetic j()[LEb/w$f;
    .locals 1

    invoke-static {}, LEb/w$f$b;->k()[LEb/w$f;

    move-result-object v0

    return-object v0
.end method

.method private static final k()[LEb/w$f;
    .locals 2

    invoke-static {}, LEb/w$f;->getEntries()Lfh/a;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [LEb/w$f;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LEb/w$f;

    return-object v0
.end method
