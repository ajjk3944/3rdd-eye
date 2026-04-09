.class public final Lcom/ui/wifiman/model/wmw/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/wmw/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/wmw/d$a$a;
    }
.end annotation


# instance fields
.field private final a:Lh9/a;

.field private final b:Lh9/a;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/ui/wifiman/model/wmw/d$a$a;


# direct methods
.method public constructor <init>(Lh9/a;Lh9/a;Ljava/lang/String;Lcom/ui/wifiman/model/wmw/d$a$a;)V
    .locals 1

    const-string v0, "mac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleMac"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adoptionState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/d$a;->a:Lh9/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/wmw/d$a;->b:Lh9/a;

    iput-object p3, p0, Lcom/ui/wifiman/model/wmw/d$a;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/ui/wifiman/model/wmw/d$a;->d:Lcom/ui/wifiman/model/wmw/d$a$a;

    return-void
.end method


# virtual methods
.method public final a()Lh9/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/d$a;->b:Lh9/a;

    return-object v0
.end method

.method public final b()Lh9/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/d$a;->a:Lh9/a;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/d$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/d$a;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ui/wifiman/model/wmw/d$a;

    iget-object v0, p1, Lcom/ui/wifiman/model/wmw/d$a;->a:Lh9/a;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/d$a;->a:Lh9/a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/ui/wifiman/model/wmw/d$a;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/ui/wifiman/model/wmw/d$a;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/ui/wifiman/model/wmw/d$a;->d:Lcom/ui/wifiman/model/wmw/d$a$a;

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/d$a;->d:Lcom/ui/wifiman/model/wmw/d$a$a;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/d$a;->a:Lh9/a;

    invoke-virtual {v0}, Lh9/a;->hashCode()I

    move-result v0

    return v0
.end method
