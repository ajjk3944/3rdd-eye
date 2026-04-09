.class public final Laf/e0$a$b;
.super Laf/e0$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laf/e0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Laf/e0$a$b;

.field private static final b:Laf/e0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laf/e0$a$b;

    invoke-direct {v0}, Laf/e0$a$b;-><init>()V

    sput-object v0, Laf/e0$a$b;->a:Laf/e0$a$b;

    sget-object v0, Laf/e0$b;->LOADING:Laf/e0$b;

    sput-object v0, Laf/e0$a$b;->b:Laf/e0$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Laf/e0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a()Laf/e0$b;
    .locals 1

    sget-object v0, Laf/e0$a$b;->b:Laf/e0$b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Laf/e0$a$b;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x7ee10d98

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Loading"

    return-object v0
.end method
