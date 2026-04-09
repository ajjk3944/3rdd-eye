.class public final LH8/l$b$a$a;
.super LH8/l$b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH8/l$b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final b:LH8/l$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LH8/l$a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LH8/l$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LH8/l$b$a$a;->b:LH8/l$a;

    return-void
.end method


# virtual methods
.method public bridge synthetic c()Ls9/d;
    .locals 1

    invoke-virtual {p0}, LH8/l$b$a$a;->h()Ls9/d$b;

    move-result-object v0

    return-object v0
.end method

.method protected e()LH8/l$a;
    .locals 1

    iget-object v0, p0, LH8/l$b$a$a;->b:LH8/l$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LH8/l$b$a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LH8/l$b$a$a;

    iget-object v1, p0, LH8/l$b$a$a;->b:LH8/l$a;

    iget-object p1, p1, LH8/l$b$a$a;->b:LH8/l$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public bridge synthetic g()Ls9/d;
    .locals 1

    invoke-virtual {p0}, LH8/l$b$a$a;->i()Ls9/d$b;

    move-result-object v0

    return-object v0
.end method

.method public h()Ls9/d$b;
    .locals 2

    new-instance v0, Ls9/d$b;

    const v1, 0x7f110306

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LH8/l$b$a$a;->b:LH8/l$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LH8/l$a;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public i()Ls9/d$b;
    .locals 2

    new-instance v0, Ls9/d$b;

    const v1, 0x7f110307

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LH8/l$b$a$a;->b:LH8/l$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "HostOffline(site="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
