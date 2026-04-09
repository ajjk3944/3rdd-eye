.class public final Lp4/A;
.super Lp4/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp4/A$a;
    }
.end annotation


# instance fields
.field private final a:Lp4/A$a;


# direct methods
.method private constructor <init>(Lp4/A$a;)V
    .locals 0

    invoke-direct {p0}, Lp4/c;-><init>()V

    iput-object p1, p0, Lp4/A;->a:Lp4/A$a;

    return-void
.end method

.method public static a(Lp4/A$a;)Lp4/A;
    .locals 1

    new-instance v0, Lp4/A;

    invoke-direct {v0, p0}, Lp4/A;-><init>(Lp4/A$a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lp4/A$a;
    .locals 1

    iget-object v0, p0, Lp4/A;->a:Lp4/A$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lp4/A;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lp4/A;

    invoke-virtual {p1}, Lp4/A;->b()Lp4/A$a;

    move-result-object p1

    invoke-virtual {p0}, Lp4/A;->b()Lp4/A$a;

    move-result-object v0

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lp4/A;->a:Lp4/A$a;

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ChaCha20Poly1305 Parameters (variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp4/A;->a:Lp4/A$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
