.class final Lm0/K$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field public static final a:Lm0/K$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm0/K$b;

    invoke-direct {v0}, Lm0/K$b;-><init>()V

    sput-object v0, Lm0/K$b;->a:Lm0/K$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/view/View;)J
    .locals 2

    invoke-static {p0}, Lm0/L;->a(Landroid/view/View;)J

    move-result-wide v0

    return-wide v0
.end method
