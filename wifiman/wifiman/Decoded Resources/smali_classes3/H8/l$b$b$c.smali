.class public final LH8/l$b$b$c;
.super LH8/l$b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH8/l$b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:LH8/l$a;

.field private final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LH8/l$a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LH8/l$b$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LH8/l$b$b$c;->a:LH8/l$a;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, LH8/l$b$b$c;->b:Z

    return v0
.end method

.method public bridge synthetic c()Ls9/d;
    .locals 1

    invoke-virtual {p0}, LH8/l$b$b$c;->i()Ls9/d$a;

    move-result-object v0

    return-object v0
.end method

.method protected e()LH8/l$a;
    .locals 1

    iget-object v0, p0, LH8/l$b$b$c;->a:LH8/l$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LH8/l$b$b$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LH8/l$b$b$c;

    iget-object v1, p0, LH8/l$b$b$c;->a:LH8/l$a;

    iget-object p1, p1, LH8/l$b$b$c;->a:LH8/l$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LH8/l$b$b$c;->a:LH8/l$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LH8/l$a;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public i()Ls9/d$a;
    .locals 3

    new-instance v0, Ls9/d$a;

    invoke-virtual {p0}, LH8/l$b;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, LH8/l$b$b$c$a;

    invoke-direct {v2, p0}, LH8/l$b$b$c$a;-><init>(LH8/l$b$b$c;)V

    invoke-direct {v0, v1, v2}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LH8/l$b$b$c;->a:LH8/l$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "TunnelCreated(site="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
