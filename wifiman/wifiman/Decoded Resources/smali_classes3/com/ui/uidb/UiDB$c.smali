.class public final Lcom/ui/uidb/UiDB$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/uidb/UiDB;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Lbb/a$a;

.field private final b:Lbb/a;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/ui/uidb/UiDB$b;


# direct methods
.method public constructor <init>(Lbb/a$a;Lbb/a;Ljava/lang/String;Lcom/ui/uidb/UiDB$b;)V
    .locals 1

    const-string/jumbo v0, "metadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "snapshot"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "snapshotJson"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "environment"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/uidb/UiDB$c;->a:Lbb/a$a;

    iput-object p2, p0, Lcom/ui/uidb/UiDB$c;->b:Lbb/a;

    iput-object p3, p0, Lcom/ui/uidb/UiDB$c;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/ui/uidb/UiDB$c;->d:Lcom/ui/uidb/UiDB$b;

    return-void
.end method


# virtual methods
.method public final a()Lcom/ui/uidb/UiDB$b;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/UiDB$c;->d:Lcom/ui/uidb/UiDB$b;

    return-object v0
.end method

.method public final c()Lbb/a$a;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/UiDB$c;->a:Lbb/a$a;

    return-object v0
.end method

.method public final d()Lbb/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/UiDB$c;->b:Lbb/a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/uidb/UiDB$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/uidb/UiDB$c;

    iget-object v1, p0, Lcom/ui/uidb/UiDB$c;->a:Lbb/a$a;

    iget-object v3, p1, Lcom/ui/uidb/UiDB$c;->a:Lbb/a$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/uidb/UiDB$c;->b:Lbb/a;

    iget-object v3, p1, Lcom/ui/uidb/UiDB$c;->b:Lbb/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/uidb/UiDB$c;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/uidb/UiDB$c;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/uidb/UiDB$c;->d:Lcom/ui/uidb/UiDB$b;

    iget-object p1, p1, Lcom/ui/uidb/UiDB$c;->d:Lcom/ui/uidb/UiDB$b;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/UiDB$c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/ui/uidb/UiDB$c;->a:Lbb/a$a;

    invoke-virtual {v0}, Lbb/a$a;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/uidb/UiDB$c;->b:Lbb/a;

    invoke-virtual {v1}, Lbb/a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/uidb/UiDB$c;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/uidb/UiDB$c;->d:Lcom/ui/uidb/UiDB$b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/ui/uidb/UiDB$c;->a:Lbb/a$a;

    iget-object v1, p0, Lcom/ui/uidb/UiDB$c;->b:Lbb/a;

    iget-object v2, p0, Lcom/ui/uidb/UiDB$c;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/ui/uidb/UiDB$c;->d:Lcom/ui/uidb/UiDB$b;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "SnapshotResponse(metadata="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", snapshot="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", snapshotJson="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", environment="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
