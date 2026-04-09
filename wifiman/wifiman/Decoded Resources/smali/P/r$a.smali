.class public final LP/r$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LP/r$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP/r$a;

    invoke-direct {v0}, LP/r$a;-><init>()V

    sput-object v0, LP/r$a;->a:LP/r$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JZ)LP/g;
    .locals 2

    if-eqz p3, :cond_1

    invoke-static {p1, p2}, Lm0/x0;->i(J)F

    move-result p1

    float-to-double p1, p1

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    cmpl-double p1, p1, v0

    if-lez p1, :cond_0

    invoke-static {}, LP/s;->b()LP/g;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, LP/s;->c()LP/g;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {}, LP/s;->a()LP/g;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final b(JZ)J
    .locals 4

    invoke-static {p1, p2}, Lm0/x0;->i(J)F

    move-result v0

    if-nez p3, :cond_0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpg-double p3, v0, v2

    if-gez p3, :cond_0

    sget-object p1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {p1}, Lm0/v0$a;->f()J

    move-result-wide p1

    :cond_0
    return-wide p1
.end method
