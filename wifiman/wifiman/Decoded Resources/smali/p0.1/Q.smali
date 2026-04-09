.class public final Lp0/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp0/Q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp0/Q;

    invoke-direct {v0}, Lp0/Q;-><init>()V

    sput-object v0, Lp0/Q;->a:Lp0/Q;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/RenderNode;Lm0/d1;)V
    .locals 0

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lp0/N;->a(Landroid/graphics/RenderNode;Landroid/graphics/RenderEffect;)Z

    return-void
.end method
