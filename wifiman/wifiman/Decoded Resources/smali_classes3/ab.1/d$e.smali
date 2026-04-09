.class public final Lab/d$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lab/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lab/d$e$a;,
        Lab/d$e$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Lab/d$e$b;

.field private final d:Lcom/ui/uidb/UiDB$b;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Lab/d$e$b;Lcom/ui/uidb/UiDB$b;)V
    .locals 1

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "productId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "variant"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "environment"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lab/d$e;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lab/d$e;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lab/d$e;->c:Lab/d$e$b;

    .line 6
    iput-object p4, p0, Lab/d$e;->d:Lcom/ui/uidb/UiDB$b;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lab/d$e$b;Lcom/ui/uidb/UiDB$b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lab/d$e;-><init>(Ljava/lang/String;Ljava/lang/String;Lab/d$e$b;Lcom/ui/uidb/UiDB$b;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lab/d$e;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lab/d$e;->a:Ljava/lang/String;

    check-cast p1, Lab/d$e;

    iget-object v2, p1, Lab/d$e;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lab/d$e$a;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Lab/d$e;->b:Ljava/lang/String;

    iget-object v2, p1, Lab/d$e;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Lua/a$a;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    return v1

    :cond_3
    iget-object v0, p0, Lab/d$e;->d:Lcom/ui/uidb/UiDB$b;

    iget-object v2, p1, Lab/d$e;->d:Lcom/ui/uidb/UiDB$b;

    if-eq v0, v2, :cond_4

    return v1

    :cond_4
    iget-object v0, p0, Lab/d$e;->c:Lab/d$e$b;

    iget-object p1, p1, Lab/d$e;->c:Lab/d$e$b;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lab/d$e;->a:Ljava/lang/String;

    invoke-static {v0}, Lab/d$e$a;->d(Ljava/lang/String;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lab/d$e;->b:Ljava/lang/String;

    invoke-static {v1}, Lua/a$a;->h(Ljava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lab/d$e;->d:Lcom/ui/uidb/UiDB$b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lab/d$e;->c:Lab/d$e$b;

    invoke-virtual {v1}, Lab/d$e$b;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
