.class public final Lrf/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lrf/d;

.field private static final b:I

.field private static final c:I

.field private static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrf/d;

    invoke-direct {v0}, Lrf/d;-><init>()V

    sput-object v0, Lrf/d;->a:Lrf/d;

    const/16 v0, 0x18

    sput v0, Lrf/d;->b:I

    const/4 v0, 0x1

    sput v0, Lrf/d;->c:I

    const/16 v0, 0x12

    sput v0, Lrf/d;->d:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    sget v0, Lrf/d;->d:I

    return v0
.end method

.method public final b()I
    .locals 1

    sget v0, Lrf/d;->b:I

    return v0
.end method

.method public final c()I
    .locals 1

    sget v0, Lrf/d;->c:I

    return v0
.end method
