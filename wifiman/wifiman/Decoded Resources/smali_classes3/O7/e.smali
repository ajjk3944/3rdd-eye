.class public final LO7/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LO7/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LO7/e;

    invoke-direct {v0}, LO7/e;-><init>()V

    sput-object v0, LO7/e;->a:LO7/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LT7/b;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    sget-object v0, LT7/b;->SYSTEM:LT7/b;

    goto :goto_0

    :cond_0
    sget-object v0, LT7/b;->LIGHT:LT7/b;

    :goto_0
    return-object v0
.end method
