.class public final Lo4/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lo4/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo4/y;

    invoke-direct {v0}, Lo4/y;-><init>()V

    sput-object v0, Lo4/y;->a:Lo4/y;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a()Lo4/y;
    .locals 1

    sget-object v0, Lo4/y;->a:Lo4/y;

    return-object v0
.end method

.method public static b(Lo4/y;)Lo4/y;
    .locals 1

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string/jumbo v0, "SecretKeyAccess is required"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
