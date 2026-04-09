.class public abstract Lww3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Law3;

.field public static final b:Law3;

.field public static final c:Lcv3;

.field public static final d:Lzr3;

.field public static final e:Lyr3;

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Ltt3;->t:Ltt3;

    .line 2
    .line 3
    new-instance v1, Law3;

    .line 4
    .line 5
    const-class v2, Luw3;

    .line 6
    .line 7
    const-class v3, Lsw3;

    .line 8
    .line 9
    invoke-direct {v1, v2, v3, v0}, Law3;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbw3;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lww3;->a:Law3;

    .line 13
    .line 14
    sget-object v0, Lvt3;->t:Lvt3;

    .line 15
    .line 16
    new-instance v1, Law3;

    .line 17
    .line 18
    const-class v3, Llr3;

    .line 19
    .line 20
    invoke-direct {v1, v2, v3, v0}, Law3;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbw3;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lww3;->b:Law3;

    .line 24
    .line 25
    invoke-static {}, Liz3;->G()Ln64;

    .line 26
    .line 27
    .line 28
    new-instance v0, Lcv3;

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    const-string v2, "type.googleapis.com/google.crypto.tink.HmacKey"

    .line 32
    .line 33
    invoke-direct {v0, v1, v3, v2}, Lcv3;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lww3;->c:Lcv3;

    .line 37
    .line 38
    sget-object v0, Lzr3;->e:Lzr3;

    .line 39
    .line 40
    sput-object v0, Lww3;->d:Lzr3;

    .line 41
    .line 42
    sget-object v0, Lyr3;->m:Lyr3;

    .line 43
    .line 44
    sput-object v0, Lww3;->e:Lyr3;

    .line 45
    .line 46
    sput v1, Lww3;->f:I

    .line 47
    .line 48
    return-void
.end method
