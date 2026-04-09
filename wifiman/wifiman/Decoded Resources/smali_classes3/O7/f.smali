.class public final LO7/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LO7/f;

.field private static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LO7/f;

    invoke-direct {v0}, LO7/f;-><init>()V

    sput-object v0, LO7/f;->a:LO7/f;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, LO7/f;->b:J

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    sget-wide v0, LO7/f;->b:J

    return-wide v0
.end method
