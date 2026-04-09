.class public abstract Ljcifs/smb1/smb1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:I

.field static b:[Ljava/lang/Object;

.field private static c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "jcifs.smb1.smb.maxBuffers"

    const/16 v1, 0x10

    invoke-static {v0, v1}, LRg/a;->d(Ljava/lang/String;I)I

    move-result v0

    sput v0, Ljcifs/smb1/smb1/c;->a:I

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Ljcifs/smb1/smb1/c;->b:[Ljava/lang/Object;

    const/4 v0, 0x0

    sput v0, Ljcifs/smb1/smb1/c;->c:I

    return-void
.end method

.method public static a()[B
    .locals 5

    sget-object v0, Ljcifs/smb1/smb1/c;->b:[Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget v1, Ljcifs/smb1/smb1/c;->c:I

    if-lez v1, :cond_1

    const/4 v1, 0x0

    :goto_0
    sget v2, Ljcifs/smb1/smb1/c;->a:I

    if-ge v1, v2, :cond_1

    sget-object v2, Ljcifs/smb1/smb1/c;->b:[Ljava/lang/Object;

    aget-object v3, v2, v1

    if-eqz v3, :cond_0

    check-cast v3, [B

    const/4 v4, 0x0

    aput-object v4, v2, v1

    sget v1, Ljcifs/smb1/smb1/c;->c:I

    add-int/lit8 v1, v1, -0x1

    sput v1, Ljcifs/smb1/smb1/c;->c:I

    monitor-exit v0

    return-object v3

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const v1, 0xffff

    new-array v1, v1, [B

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method static b(Ljcifs/smb1/smb1/C;Ljcifs/smb1/smb1/D;)V
    .locals 2

    sget-object v0, Ljcifs/smb1/smb1/c;->b:[Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Ljcifs/smb1/smb1/c;->a()[B

    move-result-object v1

    iput-object v1, p0, Ljcifs/smb1/smb1/C;->r1:[B

    invoke-static {}, Ljcifs/smb1/smb1/c;->a()[B

    move-result-object p0

    iput-object p0, p1, Ljcifs/smb1/smb1/D;->k1:[B

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static c([B)V
    .locals 4

    sget-object v0, Ljcifs/smb1/smb1/c;->b:[Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget v1, Ljcifs/smb1/smb1/c;->c:I

    sget v2, Ljcifs/smb1/smb1/c;->a:I

    if-ge v1, v2, :cond_1

    const/4 v1, 0x0

    :goto_0
    sget v2, Ljcifs/smb1/smb1/c;->a:I

    if-ge v1, v2, :cond_1

    sget-object v2, Ljcifs/smb1/smb1/c;->b:[Ljava/lang/Object;

    aget-object v3, v2, v1

    if-nez v3, :cond_0

    aput-object p0, v2, v1

    sget p0, Ljcifs/smb1/smb1/c;->c:I

    add-int/lit8 p0, p0, 0x1

    sput p0, Ljcifs/smb1/smb1/c;->c:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
