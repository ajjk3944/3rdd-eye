.class Lc5/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ4/f;


# instance fields
.field private a:Z

.field private b:Z

.field private c:LZ4/b;

.field private final d:Lc5/f;


# direct methods
.method constructor <init>(Lc5/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc5/i;->a:Z

    iput-boolean v0, p0, Lc5/i;->b:Z

    iput-object p1, p0, Lc5/i;->d:Lc5/f;

    return-void
.end method

.method private b()V
    .locals 2

    iget-boolean v0, p0, Lc5/i;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc5/i;->a:Z

    return-void

    :cond_0
    new-instance v0, Lcom/google/firebase/encoders/EncodingException;

    const-string v1, "Cannot encode a second value in the ValueEncoderContext"

    invoke-direct {v0, v1}, Lcom/google/firebase/encoders/EncodingException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)LZ4/f;
    .locals 3

    invoke-direct {p0}, Lc5/i;->b()V

    iget-object v0, p0, Lc5/i;->d:Lc5/f;

    iget-object v1, p0, Lc5/i;->c:LZ4/b;

    iget-boolean v2, p0, Lc5/i;->b:Z

    invoke-virtual {v0, v1, p1, v2}, Lc5/f;->i(LZ4/b;Ljava/lang/Object;Z)LZ4/d;

    return-object p0
.end method

.method c(LZ4/b;Z)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc5/i;->a:Z

    iput-object p1, p0, Lc5/i;->c:LZ4/b;

    iput-boolean p2, p0, Lc5/i;->b:Z

    return-void
.end method

.method public g(Z)LZ4/f;
    .locals 3

    invoke-direct {p0}, Lc5/i;->b()V

    iget-object v0, p0, Lc5/i;->d:Lc5/f;

    iget-object v1, p0, Lc5/i;->c:LZ4/b;

    iget-boolean v2, p0, Lc5/i;->b:Z

    invoke-virtual {v0, v1, p1, v2}, Lc5/f;->o(LZ4/b;ZZ)Lc5/f;

    return-object p0
.end method
