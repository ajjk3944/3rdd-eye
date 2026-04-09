.class public final Lb8/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lb8/d$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lb8/d;
    .locals 1

    const/4 v0, 0x1

    if-gt p1, v0, :cond_0

    new-instance v0, Lb8/d$c;

    invoke-direct {v0, p1}, Lb8/d$c;-><init>(I)V

    goto :goto_0

    :cond_0
    const/16 v0, 0xa

    if-gt p1, v0, :cond_1

    new-instance v0, Lb8/d$d;

    invoke-direct {v0, p1}, Lb8/d$d;-><init>(I)V

    goto :goto_0

    :cond_1
    new-instance v0, Lb8/d$a;

    invoke-direct {v0, p1}, Lb8/d$a;-><init>(I)V

    :goto_0
    return-object v0
.end method

.method public final b(F)Lb8/d;
    .locals 2

    const/16 v0, 0x64

    int-to-float v0, v0

    mul-float/2addr p1, v0

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Lb8/d$b;->a(I)Lb8/d;

    move-result-object p1

    return-object p1
.end method

.method public final c()Lb8/d;
    .locals 1

    const/16 v0, 0x64

    invoke-virtual {p0, v0}, Lb8/d$b;->a(I)Lb8/d;

    move-result-object v0

    return-object v0
.end method
