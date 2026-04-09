.class public LP6/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP6/x;


# instance fields
.field private final a:LP6/m;

.field private final b:LP6/q;

.field private final c:Z

.field private final d:Z


# direct methods
.method constructor <init>(LP6/m;LP6/q;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP6/C;->a:LP6/m;

    iput-object p2, p0, LP6/C;->b:LP6/q;

    iput-boolean p3, p0, LP6/C;->c:Z

    iput-boolean p4, p0, LP6/C;->d:Z

    return-void
.end method

.method private c()Z
    .locals 1

    iget-boolean v0, p0, LP6/C;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-boolean v0, p0, LP6/C;->d:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    invoke-direct {p0}, LP6/C;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LP6/C;->a:LP6/m;

    invoke-virtual {v0}, LP6/m;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, LP6/C;->b:LP6/q;

    invoke-virtual {v0}, LP6/q;->a()Z

    move-result v0

    return v0
.end method
