.class public final Lu0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lu0/d;

.field private static final b:I

.field private static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu0/d;

    invoke-direct {v0}, Lu0/d;-><init>()V

    sput-object v0, Lu0/d;->a:Lu0/d;

    const/4 v0, 0x0

    invoke-static {v0}, Lu0/b;->a(I)I

    move-result v0

    sput v0, Lu0/d;->b:I

    const/16 v0, 0x9

    invoke-static {v0}, Lu0/b;->a(I)I

    move-result v0

    sput v0, Lu0/d;->c:I

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

    sget v0, Lu0/d;->b:I

    return v0
.end method

.method public final b()I
    .locals 1

    sget v0, Lu0/d;->c:I

    return v0
.end method
