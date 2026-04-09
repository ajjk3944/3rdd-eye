.class public abstract Lr/G;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr/E;

.field private static final b:Lr/E;

.field private static final c:Lr/E;

.field private static final d:Lr/E;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lr/x;

    const v1, 0x3ecccccd    # 0.4f

    const/4 v2, 0x0

    const v3, 0x3e4ccccd    # 0.2f

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v3, v4}, Lr/x;-><init>(FFFF)V

    sput-object v0, Lr/G;->a:Lr/E;

    new-instance v0, Lr/x;

    invoke-direct {v0, v2, v2, v3, v4}, Lr/x;-><init>(FFFF)V

    sput-object v0, Lr/G;->b:Lr/E;

    new-instance v0, Lr/x;

    invoke-direct {v0, v1, v2, v4, v4}, Lr/x;-><init>(FFFF)V

    sput-object v0, Lr/G;->c:Lr/E;

    new-instance v0, Lr/F;

    invoke-direct {v0}, Lr/F;-><init>()V

    sput-object v0, Lr/G;->d:Lr/E;

    return-void
.end method

.method public static synthetic a(F)F
    .locals 0

    invoke-static {p0}, Lr/G;->b(F)F

    move-result p0

    return p0
.end method

.method private static final b(F)F
    .locals 0

    return p0
.end method

.method public static final c()Lr/E;
    .locals 1

    sget-object v0, Lr/G;->a:Lr/E;

    return-object v0
.end method

.method public static final d()Lr/E;
    .locals 1

    sget-object v0, Lr/G;->d:Lr/E;

    return-object v0
.end method

.method public static final e()Lr/E;
    .locals 1

    sget-object v0, Lr/G;->b:Lr/E;

    return-object v0
.end method
