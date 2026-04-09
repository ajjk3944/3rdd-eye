.class public final LCc/b$e$b;
.super LCc/b$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCc/b$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final b:LCc/b$e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LCc/b$e$b;

    invoke-direct {v0}, LCc/b$e$b;-><init>()V

    sput-object v0, LCc/b$e$b;->b:LCc/b$e$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LCc/b$e;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, LCc/b$e$b;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x8b9ad8a

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Unspecified"

    return-object v0
.end method
