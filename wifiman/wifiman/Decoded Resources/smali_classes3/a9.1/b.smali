.class public final La9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/b$a;
    }
.end annotation


# static fields
.field public static final b:La9/b$a;


# instance fields
.field private final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La9/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La9/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, La9/b;->b:La9/b$a;

    return-void
.end method

.method private synthetic constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La9/b;->a:[B

    return-void
.end method

.method public static final synthetic a([B)[B
    .locals 0

    invoke-static {p0}, La9/b;->c([B)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b([B)La9/b;
    .locals 1

    new-instance v0, La9/b;

    invoke-direct {v0, p0}, La9/b;-><init>([B)V

    return-object v0
.end method

.method private static c([B)[B
    .locals 0

    return-object p0
.end method

.method public static d([BLjava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, La9/b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, La9/b;

    invoke-virtual {p1}, La9/b;->g()[B

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static e([B)I
    .locals 0

    invoke-static {p0}, Ljava/util/Arrays;->hashCode([B)I

    move-result p0

    return p0
.end method

.method public static f([B)Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BTLEv2NetworkFrame(data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, La9/b;->a:[B

    invoke-static {v0, p1}, La9/b;->d([BLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic g()[B
    .locals 1

    iget-object v0, p0, La9/b;->a:[B

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, La9/b;->a:[B

    invoke-static {v0}, La9/b;->e([B)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La9/b;->a:[B

    invoke-static {v0}, La9/b;->f([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
