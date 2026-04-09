.class public LC5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ls3/i;

.field private static final b:LC5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ls3/i;

    const-string/jumbo v1, "MLKitImageUtils"

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Ls3/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LC5/a;->a:Ls3/i;

    new-instance v0, LC5/a;

    invoke-direct {v0}, LC5/a;-><init>()V

    sput-object v0, LC5/a;->b:LC5/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LC5/a;
    .locals 1

    sget-object v0, LC5/a;->b:LC5/a;

    return-object v0
.end method
