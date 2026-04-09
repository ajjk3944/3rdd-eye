.class final Lm0/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lm0/o1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm0/o1;

    invoke-direct {v0}, Lm0/o1;-><init>()V

    sput-object v0, Lm0/o1;->a:Lm0/o1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    sget-object v0, Lm0/m1;->a:Lm0/m1$a;

    invoke-virtual {v0}, Lm0/m1$a;->b()I

    move-result v0

    return v0
.end method

.method public final b()Landroid/graphics/Shader$TileMode;
    .locals 1

    invoke-static {}, Lm0/n1;->a()Landroid/graphics/Shader$TileMode;

    move-result-object v0

    return-object v0
.end method
