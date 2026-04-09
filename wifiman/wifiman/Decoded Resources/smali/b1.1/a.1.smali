.class public final Lb1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb1/a;

    invoke-direct {v0}, Lb1/a;-><init>()V

    sput-object v0, Lb1/a;->a:Lb1/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/String;
    .locals 2

    const-string v0, "top"

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_0

    const-string p1, "CCL"

    const-string v1, "horizontalAnchorIndexToAnchorName: Unknown horizontal index"

    invoke-static {p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    const-string v0, "bottom"

    :cond_1
    :goto_0
    return-object v0
.end method

.method public final b(I)Ljava/lang/String;
    .locals 2

    const/4 v0, -0x2

    const-string v1, "start"

    if-eq p1, v0, :cond_3

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const-string p1, "CCL"

    const-string v0, "verticalAnchorIndexToAnchorName: Unknown vertical index"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    const-string v1, "right"

    goto :goto_0

    :cond_1
    const-string v1, "left"

    goto :goto_0

    :cond_2
    const-string v1, "end"

    :cond_3
    :goto_0
    return-object v1
.end method
