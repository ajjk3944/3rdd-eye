.class interface abstract Ljcifs/smb1/smb1/L;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A0:I

.field public static final B0:Z

.field public static final C0:Z

.field public static final D0:Z

.field public static final E0:Z

.field public static final F0:Z

.field public static final G0:Z

.field public static final H0:Ljava/lang/String;

.field public static final I0:I

.field public static final J0:I

.field public static final K0:Ljava/util/TimeZone;

.field public static final L0:Z

.field public static final M0:Ljava/lang/String;

.field public static final N0:I

.field public static final O0:I

.field public static final P0:I

.field public static final Q0:I

.field public static final R0:Z

.field public static final S0:I

.field public static final T0:Ljava/util/LinkedList;

.field public static final U0:I

.field public static final V0:I

.field public static final W0:I

.field public static final X0:Ljava/lang/String;

.field public static final Y0:Ljava/lang/String;

.field public static final Z0:Ljcifs/smb1/smb1/Q;

.field public static final w0:Ljava/net/InetAddress;

.field public static final x0:I

.field public static final y0:I

.field public static final z0:I


# direct methods
.method static constructor <clinit>()V
    .locals 14

    invoke-static {}, LRg/a;->e()Ljava/net/InetAddress;

    move-result-object v0

    sput-object v0, Ljcifs/smb1/smb1/L;->w0:Ljava/net/InetAddress;

    const-string v0, "jcifs.smb1.smb.client.lport"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, Ljcifs/smb1/smb1/L;->x0:I

    const-string v0, "jcifs.smb1.smb.client.maxMpxCount"

    const/16 v2, 0xa

    invoke-static {v0, v2}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, Ljcifs/smb1/smb1/L;->y0:I

    const-string v0, "jcifs.smb1.smb.client.snd_buf_size"

    const/16 v2, 0x4104

    invoke-static {v0, v2}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, Ljcifs/smb1/smb1/L;->z0:I

    const-string v0, "jcifs.smb1.smb.client.rcv_buf_size"

    const v2, 0xec00

    invoke-static {v0, v2}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, Ljcifs/smb1/smb1/L;->A0:I

    const-string v0, "jcifs.smb1.smb.client.useUnicode"

    const/4 v2, 0x1

    invoke-static {v0, v2}, LRg/a;->a(Ljava/lang/String;Z)Z

    move-result v3

    sput-boolean v3, Ljcifs/smb1/smb1/L;->B0:Z

    invoke-static {v0, v1}, LRg/a;->a(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Ljcifs/smb1/smb1/L;->C0:Z

    const-string v0, "jcifs.smb1.smb.client.useNtStatus"

    invoke-static {v0, v2}, LRg/a;->a(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Ljcifs/smb1/smb1/L;->D0:Z

    const-string v4, "jcifs.smb1.smb.client.signingPreferred"

    invoke-static {v4, v1}, LRg/a;->a(Ljava/lang/String;Z)Z

    move-result v4

    sput-boolean v4, Ljcifs/smb1/smb1/L;->E0:Z

    const-string v5, "jcifs.smb1.smb.client.useNTSmbs"

    invoke-static {v5, v2}, LRg/a;->a(Ljava/lang/String;Z)Z

    move-result v5

    sput-boolean v5, Ljcifs/smb1/smb1/L;->F0:Z

    const-string v6, "jcifs.smb1.smb.client.useExtendedSecurity"

    invoke-static {v6, v2}, LRg/a;->a(Ljava/lang/String;Z)Z

    move-result v6

    sput-boolean v6, Ljcifs/smb1/smb1/L;->G0:Z

    const-string v7, "jcifs.smb1.netbios.hostname"

    const/4 v8, 0x0

    invoke-static {v7, v8}, LRg/a;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    sput-object v7, Ljcifs/smb1/smb1/L;->H0:Ljava/lang/String;

    const-string v7, "jcifs.smb1.smb.lmCompatibility"

    const/4 v9, 0x3

    invoke-static {v7, v9}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v7

    sput v7, Ljcifs/smb1/smb1/L;->I0:I

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v10

    const-wide/high16 v12, 0x40f0000000000000L    # 65536.0

    mul-double/2addr v10, v12

    double-to-int v7, v10

    sput v7, Ljcifs/smb1/smb1/L;->J0:I

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v7

    sput-object v7, Ljcifs/smb1/smb1/L;->K0:Ljava/util/TimeZone;

    const-string v7, "jcifs.smb1.smb.client.useBatching"

    invoke-static {v7, v2}, LRg/a;->a(Ljava/lang/String;Z)Z

    move-result v2

    sput-boolean v2, Ljcifs/smb1/smb1/L;->L0:Z

    const-string v2, "jcifs.smb1.encoding"

    sget-object v7, LRg/a;->c:Ljava/lang/String;

    invoke-static {v2, v7}, LRg/a;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Ljcifs/smb1/smb1/L;->M0:Ljava/lang/String;

    if-eqz v6, :cond_0

    const/16 v2, 0x800

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    or-int/2addr v2, v9

    const/4 v6, 0x4

    if-eqz v4, :cond_1

    move v4, v6

    goto :goto_1

    :cond_1
    move v4, v1

    :goto_1
    or-int/2addr v2, v4

    if-eqz v0, :cond_2

    const/16 v4, 0x4000

    goto :goto_2

    :cond_2
    move v4, v1

    :goto_2
    or-int/2addr v2, v4

    if-eqz v3, :cond_3

    const v4, 0x8000

    goto :goto_3

    :cond_3
    move v4, v1

    :goto_3
    or-int/2addr v2, v4

    sput v2, Ljcifs/smb1/smb1/L;->N0:I

    if-eqz v5, :cond_4

    const/16 v4, 0x10

    goto :goto_4

    :cond_4
    move v4, v1

    :goto_4
    if-eqz v0, :cond_5

    const/16 v0, 0x40

    goto :goto_5

    :cond_5
    move v0, v1

    :goto_5
    or-int/2addr v0, v4

    if-eqz v3, :cond_6

    goto :goto_6

    :cond_6
    move v6, v1

    :goto_6
    or-int/2addr v0, v6

    or-int/lit16 v0, v0, 0x1000

    sput v0, Ljcifs/smb1/smb1/L;->O0:I

    const-string v3, "jcifs.smb1.smb.client.flags2"

    invoke-static {v3, v2}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v2

    sput v2, Ljcifs/smb1/smb1/L;->P0:I

    const-string v2, "jcifs.smb1.smb.client.capabilities"

    invoke-static {v2, v0}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, Ljcifs/smb1/smb1/L;->Q0:I

    const-string v0, "jcifs.smb1.smb.client.tcpNoDelay"

    invoke-static {v0, v1}, LRg/a;->a(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Ljcifs/smb1/smb1/L;->R0:Z

    const-string v0, "jcifs.smb1.smb.client.responseTimeout"

    const/16 v2, 0x7530

    invoke-static {v0, v2}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, Ljcifs/smb1/smb1/L;->S0:I

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    sput-object v0, Ljcifs/smb1/smb1/L;->T0:Ljava/util/LinkedList;

    const-string v0, "jcifs.smb1.smb.client.ssnLimit"

    const/16 v2, 0xfa

    invoke-static {v0, v2}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, Ljcifs/smb1/smb1/L;->U0:I

    const-string v0, "jcifs.smb1.smb.client.soTimeout"

    const v2, 0x88b8

    invoke-static {v0, v2}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, Ljcifs/smb1/smb1/L;->V0:I

    const-string v0, "jcifs.smb1.smb.client.connTimeout"

    invoke-static {v0, v2}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, Ljcifs/smb1/smb1/L;->W0:I

    const-string v0, "os.name"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "jcifs.smb1.smb.client.nativeOs"

    invoke-static {v2, v0}, LRg/a;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ljcifs/smb1/smb1/L;->X0:Ljava/lang/String;

    const-string v0, "jcifs.smb1.smb.client.nativeLanMan"

    const-string v2, "jCIFS"

    invoke-static {v0, v2}, LRg/a;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ljcifs/smb1/smb1/L;->Y0:Ljava/lang/String;

    new-instance v0, Ljcifs/smb1/smb1/Q;

    invoke-direct {v0, v8, v1, v8, v1}, Ljcifs/smb1/smb1/Q;-><init>(LRg/b;ILjava/net/InetAddress;I)V

    sput-object v0, Ljcifs/smb1/smb1/L;->Z0:Ljcifs/smb1/smb1/Q;

    return-void
.end method
