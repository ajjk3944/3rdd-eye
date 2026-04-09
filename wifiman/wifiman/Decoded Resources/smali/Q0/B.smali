.class public final LQ0/B;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LQ0/B;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ0/B;

    invoke-direct {v0}, LQ0/B;-><init>()V

    sput-object v0, LQ0/B;->a:LQ0/B;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    sget-object v0, LQ0/C;->a:LQ0/C;

    invoke-virtual {v0, p1}, LQ0/C;->a(Landroid/content/Context;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
