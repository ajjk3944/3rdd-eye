.class public final Lo4/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo4/n$b;
    }
.end annotation


# instance fields
.field private final a:LA4/C;

.field private final b:Ljava/util/List;

.field private final c:Ly4/a;


# direct methods
.method private constructor <init>(LA4/C;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo4/n;->a:LA4/C;

    iput-object p2, p0, Lo4/n;->b:Ljava/util/List;

    sget-object p1, Ly4/a;->b:Ly4/a;

    iput-object p1, p0, Lo4/n;->c:Ly4/a;

    return-void
.end method

.method private static a(LA4/t;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LA4/t;->W()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string/jumbo v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static b(LA4/C;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LA4/C;->Z()I

    move-result p0

    if-lez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string/jumbo v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static c(LA4/t;Lo4/a;[B)LA4/C;
    .locals 0

    :try_start_0
    invoke-virtual {p0}, LA4/t;->W()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->N0()[B

    move-result-object p0

    invoke-interface {p1, p0, p2}, Lo4/a;->b([B[B)[B

    move-result-object p0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object p1

    invoke-static {p0, p1}, LA4/C;->e0([BLcom/google/crypto/tink/shaded/protobuf/o;)LA4/C;

    move-result-object p0

    invoke-static {p0}, Lo4/n;->b(LA4/C;)V
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string/jumbo p1, "invalid keyset, corrupted key material"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static d(LA4/C;Lo4/a;[B)LA4/t;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/a;->toByteArray()[B

    move-result-object v0

    invoke-interface {p1, v0, p2}, Lo4/a;->a([B[B)[B

    move-result-object v0

    :try_start_0
    invoke-interface {p1, v0, p2}, Lo4/a;->b([B[B)[B

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object p2

    invoke-static {p1, p2}, LA4/C;->e0([BLcom/google/crypto/tink/shaded/protobuf/o;)LA4/C;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/crypto/tink/shaded/protobuf/w;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    invoke-static {}, LA4/t;->X()LA4/t$b;

    move-result-object p1

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->s([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p2

    invoke-virtual {p1, p2}, LA4/t$b;->t(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/t$b;

    move-result-object p1

    invoke-static {p0}, Lo4/z;->b(LA4/C;)LA4/D;

    move-result-object p0

    invoke-virtual {p1, p0}, LA4/t$b;->u(LA4/D;)LA4/t$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p0

    check-cast p0, LA4/t;

    return-object p0

    :cond_0
    :try_start_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string/jumbo p1, "cannot encrypt keyset"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string/jumbo p1, "invalid keyset, corrupted key material"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static final e(LA4/C;)Lo4/n;
    .locals 2

    invoke-static {p0}, Lo4/n;->b(LA4/C;)V

    invoke-static {p0}, Lo4/n;->f(LA4/C;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lo4/n;

    invoke-direct {v1, p0, v0}, Lo4/n;-><init>(LA4/C;Ljava/util/List;)V

    return-object v1
.end method

.method private static f(LA4/C;)Ljava/util/List;
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, LA4/C;->Z()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, LA4/C;->a0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LA4/C$c;

    invoke-virtual {v2}, LA4/C$c;->Z()I

    move-result v6

    invoke-static {v2}, Lo4/n;->q(LA4/C$c;)Lv4/o;

    move-result-object v3

    :try_start_0
    invoke-static {}, Lv4/i;->a()Lv4/i;

    move-result-object v4

    invoke-static {}, Lo4/f;->a()Lo4/y;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, Lv4/i;->d(Lv4/o;Lo4/y;)Lo4/g;

    move-result-object v4

    new-instance v9, Lo4/n$b;

    invoke-virtual {v2}, LA4/C$c;->b0()LA4/z;

    move-result-object v2

    invoke-static {v2}, Lo4/n;->m(LA4/z;)Lo4/k;

    move-result-object v5

    invoke-virtual {p0}, LA4/C;->b0()I

    move-result v2

    if-ne v6, v2, :cond_0

    const/4 v2, 0x1

    :goto_1
    move v7, v2

    goto :goto_2

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :goto_2
    const/4 v8, 0x0

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Lo4/n$b;-><init>(Lo4/g;Lo4/k;IZLo4/n$a;)V

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private g(Lo4/g;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    :try_start_0
    invoke-static {p1, p2}, Lo4/x;->c(Lo4/g;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private static j(LA4/C$c;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    :try_start_0
    invoke-virtual {p0}, LA4/C$c;->Y()LA4/y;

    move-result-object p0

    invoke-static {p0, p1}, Lo4/x;->e(LA4/y;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v0, "No key manager found for key type "

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, " not supported by key manager of type "

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    throw p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private l(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lo4/n;->a:LA4/C;

    invoke-static {v0}, Lo4/z;->d(LA4/C;)V

    invoke-static {p2}, Lo4/v;->j(Ljava/lang/Class;)Lo4/v$b;

    move-result-object v0

    iget-object v1, p0, Lo4/n;->c:Ly4/a;

    invoke-virtual {v0, v1}, Lo4/v$b;->e(Ly4/a;)Lo4/v$b;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lo4/n;->p()I

    move-result v2

    if-ge v1, v2, :cond_3

    iget-object v2, p0, Lo4/n;->a:LA4/C;

    invoke-virtual {v2, v1}, LA4/C;->Y(I)LA4/C$c;

    move-result-object v2

    invoke-virtual {v2}, LA4/C$c;->b0()LA4/z;

    move-result-object v3

    sget-object v4, LA4/z;->ENABLED:LA4/z;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2, p2}, Lo4/n;->j(LA4/C$c;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lo4/n;->b:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lo4/n;->b:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo4/n$b;

    invoke-virtual {v4}, Lo4/n$b;->a()Lo4/g;

    move-result-object v4

    invoke-direct {p0, v4, p2}, Lo4/n;->g(Lo4/g;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v2}, LA4/C$c;->Z()I

    move-result v5

    iget-object v6, p0, Lo4/n;->a:LA4/C;

    invoke-virtual {v6}, LA4/C;->b0()I

    move-result v6

    if-ne v5, v6, :cond_1

    invoke-virtual {v0, v4, v3, v2}, Lo4/v$b;->b(Ljava/lang/Object;Ljava/lang/Object;LA4/C$c;)Lo4/v$b;

    goto :goto_2

    :cond_1
    invoke-virtual {v0, v4, v3, v2}, Lo4/v$b;->a(Ljava/lang/Object;Ljava/lang/Object;LA4/C$c;)Lo4/v$b;

    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lo4/v$b;->d()Lo4/v;

    move-result-object p2

    invoke-static {p2, p1}, Lo4/x;->o(Lo4/v;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private static m(LA4/z;)Lo4/k;
    .locals 1

    sget-object v0, Lo4/n$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lo4/k;->d:Lo4/k;

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string/jumbo v0, "Unknown key status"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object p0, Lo4/k;->c:Lo4/k;

    return-object p0

    :cond_2
    sget-object p0, Lo4/k;->b:Lo4/k;

    return-object p0
.end method

.method public static final n(Lo4/p;Lo4/a;)Lo4/n;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-static {p0, p1, v0}, Lo4/n;->o(Lo4/p;Lo4/a;[B)Lo4/n;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Lo4/p;Lo4/a;[B)Lo4/n;
    .locals 0

    invoke-interface {p0}, Lo4/p;->a()LA4/t;

    move-result-object p0

    invoke-static {p0}, Lo4/n;->a(LA4/t;)V

    invoke-static {p0, p1, p2}, Lo4/n;->c(LA4/t;Lo4/a;[B)LA4/C;

    move-result-object p0

    invoke-static {p0}, Lo4/n;->e(LA4/C;)Lo4/n;

    move-result-object p0

    return-object p0
.end method

.method private static q(LA4/C$c;)Lv4/o;
    .locals 4

    invoke-virtual {p0}, LA4/C$c;->Z()I

    move-result v0

    invoke-virtual {p0}, LA4/C$c;->a0()LA4/I;

    move-result-object v1

    sget-object v2, LA4/I;->RAW:LA4/I;

    if-ne v1, v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, LA4/C$c;->Y()LA4/y;

    move-result-object v1

    invoke-virtual {v1}, LA4/y;->Z()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LA4/C$c;->Y()LA4/y;

    move-result-object v2

    invoke-virtual {v2}, LA4/y;->a0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {p0}, LA4/C$c;->Y()LA4/y;

    move-result-object v3

    invoke-virtual {v3}, LA4/y;->Y()LA4/y$c;

    move-result-object v3

    invoke-virtual {p0}, LA4/C$c;->a0()LA4/I;

    move-result-object p0

    invoke-static {v1, v2, v3, p0, v0}, Lv4/o;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;LA4/y$c;LA4/I;Ljava/lang/Integer;)Lv4/o;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Lcom/google/crypto/tink/internal/TinkBugException;

    const-string v1, "Creating a protokey serialization failed"

    invoke-direct {v0, v1, p0}, Lcom/google/crypto/tink/internal/TinkBugException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method h()LA4/C;
    .locals 1

    iget-object v0, p0, Lo4/n;->a:LA4/C;

    return-object v0
.end method

.method public i()LA4/D;
    .locals 1

    iget-object v0, p0, Lo4/n;->a:LA4/C;

    invoke-static {v0}, Lo4/z;->b(LA4/C;)LA4/D;

    move-result-object v0

    return-object v0
.end method

.method public k(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Lo4/x;->d(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, v0}, Lo4/n;->l(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "No wrapper found for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public p()I
    .locals 1

    iget-object v0, p0, Lo4/n;->a:LA4/C;

    invoke-virtual {v0}, LA4/C;->Z()I

    move-result v0

    return v0
.end method

.method public r(Lo4/q;Lo4/a;)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-virtual {p0, p1, p2, v0}, Lo4/n;->s(Lo4/q;Lo4/a;[B)V

    return-void
.end method

.method public s(Lo4/q;Lo4/a;[B)V
    .locals 1

    iget-object v0, p0, Lo4/n;->a:LA4/C;

    invoke-static {v0, p2, p3}, Lo4/n;->d(LA4/C;Lo4/a;[B)LA4/t;

    move-result-object p2

    invoke-interface {p1, p2}, Lo4/q;->b(LA4/t;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lo4/n;->i()LA4/D;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
