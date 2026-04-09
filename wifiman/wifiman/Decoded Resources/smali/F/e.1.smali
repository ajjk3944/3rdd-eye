.class final LF/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LF/e;

.field private static final b:Lm0/j1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LF/e;

    invoke-direct {v0}, LF/e;-><init>()V

    sput-object v0, LF/e;->a:LF/e;

    new-instance v0, Lm0/j1;

    sget-object v1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v1}, Lm0/v0$a;->a()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lm0/j1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LF/e;->b:Lm0/j1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lm0/j1;
    .locals 1

    sget-object v0, LF/e;->b:Lm0/j1;

    return-object v0
.end method
