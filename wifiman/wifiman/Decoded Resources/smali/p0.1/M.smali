.class public final Lp0/M;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp0/M;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp0/M;

    invoke-direct {v0}, Lp0/M;-><init>()V

    sput-object v0, Lp0/M;->a:Lp0/M;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Outline;Lm0/U0;)V
    .locals 1

    instance-of v0, p2, Lm0/T;

    if-eqz v0, :cond_0

    check-cast p2, Lm0/T;

    invoke-virtual {p2}, Lm0/T;->v()Landroid/graphics/Path;

    move-result-object p2

    invoke-static {p1, p2}, Lp0/L;->a(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Unable to obtain android.graphics.Path"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
