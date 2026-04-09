.class public final Lv4/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv4/q;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LC4/a;

.field private final c:Lcom/google/crypto/tink/shaded/protobuf/h;

.field private final d:LA4/y$c;

.field private final e:LA4/I;

.field private final f:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;LA4/y$c;LA4/I;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv4/o;->a:Ljava/lang/String;

    invoke-static {p1}, Lv4/s;->e(Ljava/lang/String;)LC4/a;

    move-result-object p1

    iput-object p1, p0, Lv4/o;->b:LC4/a;

    iput-object p2, p0, Lv4/o;->c:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object p3, p0, Lv4/o;->d:LA4/y$c;

    iput-object p4, p0, Lv4/o;->e:LA4/I;

    iput-object p5, p0, Lv4/o;->f:Ljava/lang/Integer;

    return-void
.end method

.method public static b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;LA4/y$c;LA4/I;Ljava/lang/Integer;)Lv4/o;
    .locals 7

    sget-object v0, LA4/I;->RAW:LA4/I;

    if-ne p3, v0, :cond_1

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string/jumbo p1, "Keys with output prefix type raw should not have an id requirement."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    if-eqz p4, :cond_2

    :goto_0
    new-instance v6, Lv4/o;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lv4/o;-><init>(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;LA4/y$c;LA4/I;Ljava/lang/Integer;)V

    return-object v6

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string/jumbo p1, "Keys with output prefix type different from raw should have an id requirement."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()LC4/a;
    .locals 1

    iget-object v0, p0, Lv4/o;->b:LC4/a;

    return-object v0
.end method

.method public c()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lv4/o;->f:Ljava/lang/Integer;

    return-object v0
.end method

.method public d()LA4/y$c;
    .locals 1

    iget-object v0, p0, Lv4/o;->d:LA4/y$c;

    return-object v0
.end method

.method public e()LA4/I;
    .locals 1

    iget-object v0, p0, Lv4/o;->e:LA4/I;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv4/o;->a:Ljava/lang/String;

    return-object v0
.end method

.method public g()Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 1

    iget-object v0, p0, Lv4/o;->c:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-object v0
.end method
