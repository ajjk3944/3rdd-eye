.class final Lm4/a;
.super Lm4/g;
.source "SourceFile"


# static fields
.field static final a:Lm4/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm4/a;

    invoke-direct {v0}, Lm4/a;-><init>()V

    sput-object v0, Lm4/a;->a:Lm4/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lm4/g;-><init>()V

    return-void
.end method

.method static h()Lm4/g;
    .locals 1

    sget-object v0, Lm4/a;->a:Lm4/a;

    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/Object;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Optional.get() cannot be called on an absent value"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x79a31aac

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Optional.absent()"

    return-object v0
.end method
