.class public final Ln0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ln0/k;

.field private static final b:Ln0/z;

.field private static final c:Ln0/z;

.field private static final d:Ln0/z;

.field private static final e:Ln0/z;

.field private static final f:Ln0/z;

.field private static final g:Ln0/z;

.field private static final h:Ln0/z;

.field private static final i:Ln0/z;

.field private static final j:Ln0/z;

.field private static final k:[F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/k;

    invoke-direct {v0}, Ln0/k;-><init>()V

    sput-object v0, Ln0/k;->a:Ln0/k;

    new-instance v0, Ln0/z;

    const v1, 0x3ee527e5    # 0.44757f

    const v2, 0x3ed09d49    # 0.40745f

    invoke-direct {v0, v1, v2}, Ln0/z;-><init>(FF)V

    sput-object v0, Ln0/k;->b:Ln0/z;

    new-instance v0, Ln0/z;

    const v1, 0x3eb2641b    # 0.34842f

    const v2, 0x3eb4063a    # 0.35161f

    invoke-direct {v0, v1, v2}, Ln0/z;-><init>(FF)V

    sput-object v0, Ln0/k;->c:Ln0/z;

    new-instance v0, Ln0/z;

    const v1, 0x3e9ec02f    # 0.31006f

    const v2, 0x3ea1dfb9    # 0.31616f

    invoke-direct {v0, v1, v2}, Ln0/z;-><init>(FF)V

    sput-object v0, Ln0/k;->d:Ln0/z;

    new-instance v0, Ln0/z;

    const v1, 0x3eb0fba9

    const v2, 0x3eb78d50    # 0.3585f

    invoke-direct {v0, v1, v2}, Ln0/z;-><init>(FF)V

    sput-object v0, Ln0/k;->e:Ln0/z;

    new-instance v0, Ln0/z;

    const v1, 0x3eaa32f4    # 0.33242f

    const v2, 0x3eb1e258    # 0.34743f

    invoke-direct {v0, v1, v2}, Ln0/z;-><init>(FF)V

    sput-object v0, Ln0/k;->f:Ln0/z;

    new-instance v0, Ln0/z;

    const v1, 0x3ea4b33e    # 0.32168f

    const v2, 0x3eace315    # 0.33767f

    invoke-direct {v0, v1, v2}, Ln0/z;-><init>(FF)V

    sput-object v0, Ln0/k;->g:Ln0/z;

    new-instance v0, Ln0/z;

    const v1, 0x3ea01b86

    const v2, 0x3ea8754f    # 0.32902f

    invoke-direct {v0, v1, v2}, Ln0/z;-><init>(FF)V

    sput-object v0, Ln0/k;->h:Ln0/z;

    new-instance v0, Ln0/z;

    const v1, 0x3e991926    # 0.29902f

    const v2, 0x3ea13405    # 0.31485f

    invoke-direct {v0, v1, v2}, Ln0/z;-><init>(FF)V

    sput-object v0, Ln0/k;->i:Ln0/z;

    new-instance v0, Ln0/z;

    const v1, 0x3eaaaa3b    # 0.33333f

    invoke-direct {v0, v1, v1}, Ln0/z;-><init>(FF)V

    sput-object v0, Ln0/k;->j:Ln0/z;

    const/4 v0, 0x3

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, Ln0/k;->k:[F

    return-void

    :array_0
    .array-data 4
        0x3f76d699    # 0.964212f
        0x3f800000    # 1.0f
        0x3f533f85
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ln0/z;
    .locals 1

    sget-object v0, Ln0/k;->d:Ln0/z;

    return-object v0
.end method

.method public final b()Ln0/z;
    .locals 1

    sget-object v0, Ln0/k;->e:Ln0/z;

    return-object v0
.end method

.method public final c()[F
    .locals 1

    sget-object v0, Ln0/k;->k:[F

    return-object v0
.end method

.method public final d()Ln0/z;
    .locals 1

    sget-object v0, Ln0/k;->g:Ln0/z;

    return-object v0
.end method

.method public final e()Ln0/z;
    .locals 1

    sget-object v0, Ln0/k;->h:Ln0/z;

    return-object v0
.end method
