.class public final LC2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC2/f$b;
    }
.end annotation


# static fields
.field private static final e:LC2/f$b;


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:LC2/f$b;

.field private final c:Ljava/lang/String;

.field private volatile d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC2/f$a;

    invoke-direct {v0}, LC2/f$a;-><init>()V

    sput-object v0, LC2/f;->e:LC2/f$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/Object;LC2/f$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LW2/k;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LC2/f;->c:Ljava/lang/String;

    iput-object p2, p0, LC2/f;->a:Ljava/lang/Object;

    invoke-static {p3}, LW2/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC2/f$b;

    iput-object p1, p0, LC2/f;->b:LC2/f$b;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Object;LC2/f$b;)LC2/f;
    .locals 1

    new-instance v0, LC2/f;

    invoke-direct {v0, p0, p1, p2}, LC2/f;-><init>(Ljava/lang/String;Ljava/lang/Object;LC2/f$b;)V

    return-object v0
.end method

.method private static b()LC2/f$b;
    .locals 1

    sget-object v0, LC2/f;->e:LC2/f$b;

    return-object v0
.end method

.method private d()[B
    .locals 2

    iget-object v0, p0, LC2/f;->d:[B

    if-nez v0, :cond_0

    iget-object v0, p0, LC2/f;->c:Ljava/lang/String;

    sget-object v1, LC2/e;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    iput-object v0, p0, LC2/f;->d:[B

    :cond_0
    iget-object v0, p0, LC2/f;->d:[B

    return-object v0
.end method

.method public static e(Ljava/lang/String;)LC2/f;
    .locals 3

    new-instance v0, LC2/f;

    const/4 v1, 0x0

    invoke-static {}, LC2/f;->b()LC2/f$b;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, LC2/f;-><init>(Ljava/lang/String;Ljava/lang/Object;LC2/f$b;)V

    return-object v0
.end method

.method public static f(Ljava/lang/String;Ljava/lang/Object;)LC2/f;
    .locals 2

    new-instance v0, LC2/f;

    invoke-static {}, LC2/f;->b()LC2/f$b;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, LC2/f;-><init>(Ljava/lang/String;Ljava/lang/Object;LC2/f$b;)V

    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC2/f;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LC2/f;

    if-eqz v0, :cond_0

    check-cast p1, LC2/f;

    iget-object v0, p0, LC2/f;->c:Ljava/lang/String;

    iget-object p1, p1, LC2/f;->c:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public g(Ljava/lang/Object;Ljava/security/MessageDigest;)V
    .locals 2

    iget-object v0, p0, LC2/f;->b:LC2/f$b;

    invoke-direct {p0}, LC2/f;->d()[B

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, LC2/f$b;->a([BLjava/lang/Object;Ljava/security/MessageDigest;)V

    return-void
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LC2/f;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Option{key=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LC2/f;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
