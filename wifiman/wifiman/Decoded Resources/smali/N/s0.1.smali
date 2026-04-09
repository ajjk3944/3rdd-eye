.class public final LN/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN/s0;

.field private static final b:F

.field private static final c:Lr/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LN/s0;

    invoke-direct {v0}, LN/s0;-><init>()V

    sput-object v0, LN/s0;->a:LN/s0;

    const/4 v0, 0x4

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/s0;->b:F

    new-instance v0, Lr/h0;

    const v1, 0x3a83126f    # 0.001f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v3, 0x42480000    # 50.0f

    invoke-direct {v0, v2, v3, v1}, Lr/h0;-><init>(FFLjava/lang/Object;)V

    sput-object v0, LN/s0;->c:Lr/h0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    sget v0, LN/s0;->b:F

    return v0
.end method
