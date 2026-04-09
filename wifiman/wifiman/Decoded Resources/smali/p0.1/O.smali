.class final Lp0/O;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp0/O;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp0/O;

    invoke-direct {v0}, Lp0/O;-><init>()V

    sput-object v0, Lp0/O;->a:Lp0/O;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/RenderNode;)V
    .locals 0

    invoke-virtual {p1}, Landroid/view/RenderNode;->discardDisplayList()V

    return-void
.end method
