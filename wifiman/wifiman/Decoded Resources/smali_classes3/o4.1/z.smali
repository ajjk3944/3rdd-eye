.class abstract Lo4/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string/jumbo v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lo4/z;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method public static a(LA4/C$c;)LA4/D$c;
    .locals 2

    invoke-static {}, LA4/D$c;->Z()LA4/D$c$a;

    move-result-object v0

    invoke-virtual {p0}, LA4/C$c;->Y()LA4/y;

    move-result-object v1

    invoke-virtual {v1}, LA4/y;->Z()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LA4/D$c$a;->x(Ljava/lang/String;)LA4/D$c$a;

    move-result-object v0

    invoke-virtual {p0}, LA4/C$c;->b0()LA4/z;

    move-result-object v1

    invoke-virtual {v0, v1}, LA4/D$c$a;->w(LA4/z;)LA4/D$c$a;

    move-result-object v0

    invoke-virtual {p0}, LA4/C$c;->a0()LA4/I;

    move-result-object v1

    invoke-virtual {v0, v1}, LA4/D$c$a;->u(LA4/I;)LA4/D$c$a;

    move-result-object v0

    invoke-virtual {p0}, LA4/C$c;->Z()I

    move-result p0

    invoke-virtual {v0, p0}, LA4/D$c$a;->t(I)LA4/D$c$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p0

    check-cast p0, LA4/D$c;

    return-object p0
.end method

.method public static b(LA4/C;)LA4/D;
    .locals 2

    invoke-static {}, LA4/D;->Z()LA4/D$b;

    move-result-object v0

    invoke-virtual {p0}, LA4/C;->b0()I

    move-result v1

    invoke-virtual {v0, v1}, LA4/D$b;->u(I)LA4/D$b;

    move-result-object v0

    invoke-virtual {p0}, LA4/C;->a0()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LA4/C$c;

    invoke-static {v1}, Lo4/z;->a(LA4/C$c;)LA4/D$c;

    move-result-object v1

    invoke-virtual {v0, v1}, LA4/D$b;->t(LA4/D$c;)LA4/D$b;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p0

    check-cast p0, LA4/D;

    return-object p0
.end method

.method public static c(LA4/C$c;)V
    .locals 2

    invoke-virtual {p0}, LA4/C$c;->c0()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LA4/C$c;->a0()LA4/I;

    move-result-object v0

    sget-object v1, LA4/I;->UNKNOWN_PREFIX:LA4/I;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, LA4/C$c;->b0()LA4/z;

    move-result-object v0

    sget-object v1, LA4/z;->UNKNOWN_STATUS:LA4/z;

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p0}, LA4/C$c;->Z()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo v1, "key %d has unknown status"

    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p0}, LA4/C$c;->Z()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo v1, "key %d has unknown prefix"

    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p0}, LA4/C$c;->Z()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo v1, "key %d has no key data"

    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d(LA4/C;)V
    .locals 9

    invoke-virtual {p0}, LA4/C;->b0()I

    move-result v0

    invoke-virtual {p0}, LA4/C;->a0()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    move v3, v1

    move v4, v3

    move v5, v2

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LA4/C$c;

    invoke-virtual {v6}, LA4/C$c;->b0()LA4/z;

    move-result-object v7

    sget-object v8, LA4/z;->ENABLED:LA4/z;

    if-eq v7, v8, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v6}, Lo4/z;->c(LA4/C$c;)V

    invoke-virtual {v6}, LA4/C$c;->Z()I

    move-result v7

    if-ne v7, v0, :cond_2

    if-nez v4, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string/jumbo v0, "keyset contains multiple primary keys"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_1
    invoke-virtual {v6}, LA4/C$c;->Y()LA4/y;

    move-result-object v6

    invoke-virtual {v6}, LA4/y;->Y()LA4/y$c;

    move-result-object v6

    sget-object v7, LA4/y$c;->ASYMMETRIC_PUBLIC:LA4/y$c;

    if-eq v6, v7, :cond_3

    move v5, v1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    if-eqz v3, :cond_7

    if-nez v4, :cond_6

    if-eqz v5, :cond_5

    goto :goto_2

    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string/jumbo v0, "keyset doesn\'t contain a valid primary key"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    :goto_2
    return-void

    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string/jumbo v0, "keyset must contain at least one ENABLED key"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
