.class final Lp0/Z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp0/Z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp0/Z;

    invoke-direct {v0}, Lp0/Z;-><init>()V

    sput-object v0, Lp0/Z;->a:Lp0/Z;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Lm0/d1;)V
    .locals 0

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lp0/Y;->a(Landroid/view/View;Landroid/graphics/RenderEffect;)V

    return-void
.end method
