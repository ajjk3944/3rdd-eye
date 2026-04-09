.class public final Lof/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lof/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lof/a$b;

.field private static final b:I

.field private static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lof/a$b;

    invoke-direct {v0}, Lof/a$b;-><init>()V

    sput-object v0, Lof/a$b;->a:Lof/a$b;

    const/16 v0, 0x18

    sput v0, Lof/a$b;->b:I

    const/4 v0, 0x2

    sput v0, Lof/a$b;->c:I

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

    sget v0, Lof/a$b;->c:I

    return v0
.end method

.method public final b()I
    .locals 1

    sget v0, Lof/a$b;->b:I

    return v0
.end method

.method public final c()Ls9/a$b;
    .locals 4

    new-instance v0, Ls9/c$a;

    sget v1, Lm8/a;->t0:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
