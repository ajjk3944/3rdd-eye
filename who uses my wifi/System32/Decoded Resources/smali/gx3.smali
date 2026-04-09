.class public abstract Lgx3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lvv3;

.field public static final b:Ltv3;

.field public static final c:Lzu3;

.field public static final d:Lwu3;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    .line 2
    .line 3
    invoke-static {v0}, Low3;->a(Ljava/lang/String;)Lv34;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lvt3;->v:Lvt3;

    .line 8
    .line 9
    new-instance v2, Lvv3;

    .line 10
    .line 11
    const-class v3, Lrw3;

    .line 12
    .line 13
    invoke-direct {v2, v3, v1}, Lvv3;-><init>(Ljava/lang/Class;Lwv3;)V

    .line 14
    .line 15
    .line 16
    sput-object v2, Lgx3;->a:Lvv3;

    .line 17
    .line 18
    sget-object v1, Ltt3;->v:Ltt3;

    .line 19
    .line 20
    new-instance v2, Ltv3;

    .line 21
    .line 22
    invoke-direct {v2, v0, v1}, Ltv3;-><init>(Lv34;Luv3;)V

    .line 23
    .line 24
    .line 25
    sput-object v2, Lgx3;->b:Ltv3;

    .line 26
    .line 27
    sget-object v1, Lvt3;->u:Lvt3;

    .line 28
    .line 29
    new-instance v2, Lzu3;

    .line 30
    .line 31
    const-class v3, Lpw3;

    .line 32
    .line 33
    invoke-direct {v2, v3, v1}, Lzu3;-><init>(Ljava/lang/Class;Lav3;)V

    .line 34
    .line 35
    .line 36
    sput-object v2, Lgx3;->c:Lzu3;

    .line 37
    .line 38
    sget-object v1, Ltt3;->w:Ltt3;

    .line 39
    .line 40
    new-instance v2, Lwu3;

    .line 41
    .line 42
    invoke-direct {v2, v0, v1}, Lwu3;-><init>(Lv34;Lxu3;)V

    .line 43
    .line 44
    .line 45
    sput-object v2, Lgx3;->d:Lwu3;

    .line 46
    .line 47
    return-void
.end method

.method public static a(Lgs3;)Li04;
    .locals 2

    .line 1
    sget-object v0, Lgs3;->k:Lgs3;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Li04;->h:Li04;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v0, Lgs3;->l:Lgs3;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object p0, Li04;->k:Li04;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    sget-object v0, Lgs3;->n:Lgs3;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    sget-object p0, Li04;->j:Li04;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    sget-object v0, Lgs3;->m:Lgs3;

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    sget-object p0, Li04;->i:Li04;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 46
    .line 47
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string v1, "Unable to serialize variant: "

    .line 52
    .line 53
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0
.end method

.method public static b(Li04;)Lgs3;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq v0, v1, :cond_2

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/4 v1, 0x4

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    sget-object p0, Lgs3;->l:Lgs3;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 21
    .line 22
    invoke-virtual {p0}, Li04;->a()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x22

    .line 37
    .line 38
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 39
    .line 40
    .line 41
    const-string v1, "Unable to parse OutputPrefixType: "

    .line 42
    .line 43
    invoke-static {v2, v1, p0}, Lex0;->j(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :cond_1
    sget-object p0, Lgs3;->n:Lgs3;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_2
    sget-object p0, Lgs3;->m:Lgs3;

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_3
    sget-object p0, Lgs3;->k:Lgs3;

    .line 58
    .line 59
    return-object p0
.end method
