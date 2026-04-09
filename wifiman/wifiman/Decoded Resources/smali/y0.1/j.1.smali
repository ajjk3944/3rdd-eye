.class final Ly0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ly0/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly0/j;

    invoke-direct {v0}, Ly0/j;-><init>()V

    sput-object v0, Ly0/j;->a:Ly0/j;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;I)J
    .locals 1

    invoke-static {p1, p2}, Ly0/h;->a(Landroid/view/MotionEvent;I)F

    move-result v0

    invoke-static {p1, p2}, Ly0/i;->a(Landroid/view/MotionEvent;I)F

    move-result p1

    invoke-static {v0, p1}, Ll0/h;->a(FF)J

    move-result-wide p1

    return-wide p1
.end method
