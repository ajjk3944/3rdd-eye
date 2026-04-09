.class abstract Lp4/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LC4/a;

.field private static final b:Lv4/k;

.field private static final c:Lv4/j;

.field private static final d:Lv4/c;

.field private static final e:Lv4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string/jumbo v0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-static {v0}, Lv4/s;->e(Ljava/lang/String;)LC4/a;

    move-result-object v0

    sput-object v0, Lp4/s;->a:LC4/a;

    new-instance v1, Lp4/j;

    invoke-direct {v1}, Lp4/j;-><init>()V

    const-class v2, Lp4/q;

    const-class v3, Lv4/p;

    invoke-static {v1, v2, v3}, Lv4/k;->a(Lv4/k$b;Ljava/lang/Class;Ljava/lang/Class;)Lv4/k;

    move-result-object v1

    sput-object v1, Lp4/s;->b:Lv4/k;

    new-instance v1, Lp4/k;

    invoke-direct {v1}, Lp4/k;-><init>()V

    invoke-static {v1, v0, v3}, Lv4/j;->a(Lv4/j$b;LC4/a;Ljava/lang/Class;)Lv4/j;

    move-result-object v1

    sput-object v1, Lp4/s;->c:Lv4/j;

    new-instance v1, Lp4/l;

    invoke-direct {v1}, Lp4/l;-><init>()V

    const-class v2, Lp4/o;

    const-class v3, Lv4/o;

    invoke-static {v1, v2, v3}, Lv4/c;->a(Lv4/c$b;Ljava/lang/Class;Ljava/lang/Class;)Lv4/c;

    move-result-object v1

    sput-object v1, Lp4/s;->d:Lv4/c;

    new-instance v1, Lp4/r;

    invoke-direct {v1}, Lp4/r;-><init>()V

    invoke-static {v1, v0, v3}, Lv4/b;->a(Lv4/b$b;LC4/a;Ljava/lang/Class;)Lv4/b;

    move-result-object v0

    sput-object v0, Lp4/s;->e:Lv4/b;

    return-void
.end method

.method public static synthetic a(Lv4/o;Lo4/y;)Lp4/o;
    .locals 0

    invoke-static {p0, p1}, Lp4/s;->b(Lv4/o;Lo4/y;)Lp4/o;

    move-result-object p0

    return-object p0
.end method

.method private static b(Lv4/o;Lo4/y;)Lp4/o;
    .locals 3

    invoke-virtual {p0}, Lv4/o;->f()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lv4/o;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v1

    invoke-static {v0, v1}, LA4/l;->Z(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/l;

    move-result-object v0

    invoke-virtual {v0}, LA4/l;->X()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lp4/q;->a()Lp4/q$b;

    move-result-object v1

    invoke-virtual {v0}, LA4/l;->W()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Lp4/q$b;->c(I)Lp4/q$b;

    move-result-object v1

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Lp4/q$b;->b(I)Lp4/q$b;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Lp4/q$b;->d(I)Lp4/q$b;

    move-result-object v1

    invoke-virtual {p0}, Lv4/o;->e()LA4/I;

    move-result-object v2

    invoke-static {v2}, Lp4/s;->e(LA4/I;)Lp4/q$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp4/q$b;->e(Lp4/q$c;)Lp4/q$b;

    move-result-object v1

    invoke-virtual {v1}, Lp4/q$b;->a()Lp4/q;

    move-result-object v1

    invoke-static {}, Lp4/o;->a()Lp4/o$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lp4/o$b;->e(Lp4/q;)Lp4/o$b;

    move-result-object v1

    invoke-virtual {v0}, LA4/l;->W()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->N0()[B

    move-result-object v0

    invoke-static {p1}, Lo4/y;->b(Lo4/y;)Lo4/y;

    move-result-object p1

    invoke-static {v0, p1}, LC4/b;->a([BLo4/y;)LC4/b;

    move-result-object p1

    invoke-virtual {v1, p1}, Lp4/o$b;->d(LC4/b;)Lp4/o$b;

    move-result-object p1

    invoke-virtual {p0}, Lv4/o;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Lp4/o$b;->c(Ljava/lang/Integer;)Lp4/o$b;

    move-result-object p0

    invoke-virtual {p0}, Lp4/o$b;->a()Lp4/o;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string/jumbo p1, "Only version 0 keys are accepted"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string/jumbo p1, "Parsing AesGcmKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo p1, "Wrong type URL in call to AesGcmParameters.parseParameters"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c()V
    .locals 1

    invoke-static {}, Lv4/i;->a()Lv4/i;

    move-result-object v0

    invoke-static {v0}, Lp4/s;->d(Lv4/i;)V

    return-void
.end method

.method public static d(Lv4/i;)V
    .locals 1

    sget-object v0, Lp4/s;->b:Lv4/k;

    invoke-virtual {p0, v0}, Lv4/i;->h(Lv4/k;)V

    sget-object v0, Lp4/s;->c:Lv4/j;

    invoke-virtual {p0, v0}, Lv4/i;->g(Lv4/j;)V

    sget-object v0, Lp4/s;->d:Lv4/c;

    invoke-virtual {p0, v0}, Lv4/i;->f(Lv4/c;)V

    sget-object v0, Lp4/s;->e:Lv4/b;

    invoke-virtual {p0, v0}, Lv4/i;->e(Lv4/b;)V

    return-void
.end method

.method private static e(LA4/I;)Lp4/q$c;
    .locals 3

    sget-object v0, Lp4/s$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    sget-object p0, Lp4/q$c;->d:Lp4/q$c;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Unable to parse OutputPrefixType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LA4/I;->getNumber()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lp4/q$c;->c:Lp4/q$c;

    return-object p0

    :cond_2
    sget-object p0, Lp4/q$c;->b:Lp4/q$c;

    return-object p0
.end method
