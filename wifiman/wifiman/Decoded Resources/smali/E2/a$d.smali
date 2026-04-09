.class LE2/a$d;
.super LE2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LE2/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c(LC2/a;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public d(ZLC2/a;LC2/c;)Z
    .locals 0

    sget-object p1, LC2/a;->RESOURCE_DISK_CACHE:LC2/a;

    if-eq p2, p1, :cond_0

    sget-object p1, LC2/a;->MEMORY_CACHE:LC2/a;

    if-eq p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
