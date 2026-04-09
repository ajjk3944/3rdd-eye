.class public final Lr91;
.super Lja;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-class v0, Lr91;

    .line 2
    .line 3
    invoke-static {v0}, Lk80;->d(Ljava/lang/Class;)Li80;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Lcom/sun/jna/Memory;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-class v2, Lcom/sun/jna/platform/win32/Win32Exception;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "Checking for JNA classes: {} and {}"

    .line 20
    .line 21
    invoke-interface {v0, v3, v1, v2}, Li80;->f(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lja;->h()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/sun/jna/Memory;

    .line 5
    .line 6
    const-wide/16 v1, 0x3c00

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/sun/jna/Memory;-><init>(J)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/sun/jna/ptr/IntByReference;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Lcom/sun/jna/ptr/IntByReference;-><init>(I)V

    .line 15
    .line 16
    .line 17
    sget v0, Lv10;->a:I

    .line 18
    .line 19
    sget-object v0, Lcom/sun/jna/Pointer;->NULL:Lcom/sun/jna/Pointer;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    throw v0
.end method
