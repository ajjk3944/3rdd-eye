.class public final LTe/M$a$f;
.super LTe/M$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTe/M$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# static fields
.field public static final a:LTe/M$a$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LTe/M$a$f;

    invoke-direct {v0}, LTe/M$a$f;-><init>()V

    sput-object v0, LTe/M$a$f;->a:LTe/M$a$f;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LTe/M$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, LTe/M$a$f;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x2763ead

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Ms50"

    return-object v0
.end method
