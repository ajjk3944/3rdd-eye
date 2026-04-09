.class public LP6/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP6/x;


# instance fields
.field private final a:LP6/m;

.field private final b:LP6/q;

.field private final c:Z

.field private final d:I

.field private final e:I


# direct methods
.method constructor <init>(LP6/m;LP6/q;IIZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP6/A;->a:LP6/m;

    iput-object p2, p0, LP6/A;->b:LP6/q;

    iput p3, p0, LP6/A;->d:I

    iput p4, p0, LP6/A;->e:I

    iput-boolean p5, p0, LP6/A;->c:Z

    return-void
.end method

.method private c()Z
    .locals 2

    iget-boolean v0, p0, LP6/A;->c:Z

    if-nez v0, :cond_1

    iget v0, p0, LP6/A;->e:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    iget v0, p0, LP6/A;->d:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    invoke-direct {p0}, LP6/A;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LP6/A;->a:LP6/m;

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

    iget-object v0, p0, LP6/A;->b:LP6/q;

    invoke-virtual {v0}, LP6/q;->a()Z

    move-result v0

    return v0
.end method
