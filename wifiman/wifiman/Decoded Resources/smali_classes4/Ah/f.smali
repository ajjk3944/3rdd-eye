.class LAh/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:LAh/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LAh/f;

    invoke-direct {v0}, LAh/f;-><init>()V

    sput-object v0, LAh/f;->a:LAh/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBh/G;

    invoke-static {p1}, LAh/g;->g(LBh/G;)Lkotlin/reflect/jvm/internal/impl/builtins/c;

    move-result-object p1

    return-object p1
.end method
