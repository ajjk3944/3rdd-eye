.class public final LT8/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/util/UUID;


# direct methods
.method private synthetic constructor <init>(Ljava/util/UUID;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT8/a$c;->a:Ljava/util/UUID;

    return-void
.end method

.method public static final synthetic a(Ljava/util/UUID;)LT8/a$c;
    .locals 1

    new-instance v0, LT8/a$c;

    invoke-direct {v0, p0}, LT8/a$c;-><init>(Ljava/util/UUID;)V

    return-object v0
.end method

.method public static b(Ljava/util/UUID;)Ljava/util/UUID;
    .locals 1

    const-string/jumbo v0, "uuid"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static c(Ljava/util/UUID;Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LT8/a$c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LT8/a$c;

    invoke-virtual {p1}, LT8/a$c;->f()Ljava/util/UUID;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static d(Ljava/util/UUID;)I
    .locals 0

    invoke-virtual {p0}, Ljava/util/UUID;->hashCode()I

    move-result p0

    return p0
.end method

.method public static e(Ljava/util/UUID;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Service(uuid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LT8/a$c;->a:Ljava/util/UUID;

    invoke-static {v0, p1}, LT8/a$c;->c(Ljava/util/UUID;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic f()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, LT8/a$c;->a:Ljava/util/UUID;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LT8/a$c;->a:Ljava/util/UUID;

    invoke-static {v0}, LT8/a$c;->d(Ljava/util/UUID;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LT8/a$c;->a:Ljava/util/UUID;

    invoke-static {v0}, LT8/a$c;->e(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
