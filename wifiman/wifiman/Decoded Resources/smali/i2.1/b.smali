.class public final Li2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li2/b$a;,
        Li2/b$b;
    }
.end annotation


# static fields
.field public static final a:Li2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li2/b;

    invoke-direct {v0}, Li2/b;-><init>()V

    sput-object v0, Li2/b;->a:Li2/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    sget-object v0, Li2/b$b;->a:Li2/b$b;

    invoke-virtual {v0}, Li2/b$b;->a()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final b()I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-eq v0, v1, :cond_1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v0, Li2/b$a;->a:Li2/b$a;

    invoke-virtual {v0}, Li2/b$a;->a()I

    move-result v0

    :goto_1
    return v0
.end method
