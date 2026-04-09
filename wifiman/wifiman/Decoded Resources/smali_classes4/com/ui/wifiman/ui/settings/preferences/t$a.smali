.class public final Lcom/ui/wifiman/ui/settings/preferences/t$a;
.super Lcom/ui/wifiman/ui/settings/preferences/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/ui/settings/preferences/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Z

.field private final b:LT7/c;

.field private final c:Ls9/d$b;

.field private final d:Ljava/lang/Void;

.field private final e:Ljava/lang/Void;

.field private final f:Lmh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/ui/settings/preferences/t;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-boolean p1, p0, Lcom/ui/wifiman/ui/settings/preferences/t$a;->a:Z

    sget-object p1, LT7/c;->IMPERIAL:LT7/c;

    iput-object p1, p0, Lcom/ui/wifiman/ui/settings/preferences/t$a;->b:LT7/c;

    new-instance p1, Ls9/d$b;

    sget v0, Lm8/c;->t:I

    invoke-direct {p1, v0}, Ls9/d$b;-><init>(I)V

    iput-object p1, p0, Lcom/ui/wifiman/ui/settings/preferences/t$a;->c:Ls9/d$b;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/settings/preferences/t$a;->g()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public b()Lmh/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/t$a;->f:Lmh/a;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/wifiman/ui/settings/preferences/t$a;->a:Z

    return v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e()LT7/c;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/t$a;->b:LT7/c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/ui/settings/preferences/t$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/ui/settings/preferences/t$a;

    iget-boolean v1, p0, Lcom/ui/wifiman/ui/settings/preferences/t$a;->a:Z

    iget-boolean p1, p1, Lcom/ui/wifiman/ui/settings/preferences/t$a;->a:Z

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public f()Ljava/lang/Void;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/t$a;->d:Ljava/lang/Void;

    return-object v0
.end method

.method public g()Ljava/lang/Void;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/t$a;->e:Ljava/lang/Void;

    return-object v0
.end method

.method public bridge synthetic getIcon()Ls9/a;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/settings/preferences/t$a;->f()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Ls9/a;

    return-object v0
.end method

.method public bridge synthetic getTitle()Ls9/d;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/settings/preferences/t$a;->h()Ls9/d$b;

    move-result-object v0

    return-object v0
.end method

.method public h()Ls9/d$b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/settings/preferences/t$a;->c:Ls9/d$b;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-boolean v0, p0, Lcom/ui/wifiman/ui/settings/preferences/t$a;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Lcom/ui/wifiman/ui/settings/preferences/t$a;->a:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Imperial(selected="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
