.class final Lp0/K;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp0/K;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp0/K;

    invoke-direct {v0}, Lp0/K;-><init>()V

    sput-object v0, Lp0/K;->a:Lp0/K;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)Z
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->invalidateOutline()V

    const/4 p1, 0x1

    return p1
.end method
