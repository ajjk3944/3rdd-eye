.class public final LW0/n$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW0/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW0/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final b:LW0/n$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW0/n$b;

    invoke-direct {v0}, LW0/n$b;-><init>()V

    sput-object v0, LW0/n$b;->b:LW0/n$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()F
    .locals 1

    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0
.end method

.method public c()J
    .locals 2

    sget-object v0, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v0}, Lm0/v0$a;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public e()Lm0/l0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
