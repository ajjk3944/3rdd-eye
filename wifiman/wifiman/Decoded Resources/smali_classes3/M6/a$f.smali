.class LM6/a$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/a;->g(LG6/N$d;Ljava/nio/ByteBuffer;ILM6/a$g;)Lkg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LG6/N$d;

.field final synthetic b:LM6/a$g;

.field final synthetic c:I

.field final synthetic d:Ljava/nio/ByteBuffer;


# direct methods
.method constructor <init>(LG6/N$d;LM6/a$g;ILjava/nio/ByteBuffer;)V
    .locals 0

    iput-object p1, p0, LM6/a$f;->a:LG6/N$d;

    iput-object p2, p0, LM6/a$f;->b:LM6/a$g;

    iput p3, p0, LM6/a$f;->c:I

    iput-object p4, p0, LM6/a$f;->d:Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b()Lkg/f;
    .locals 1

    new-instance v0, LM6/a$f$b;

    invoke-direct {v0, p0}, LM6/a$f$b;-><init>(LM6/a$f;)V

    return-object v0
.end method

.method private c()Lkg/n;
    .locals 1

    new-instance v0, LM6/a$f$a;

    invoke-direct {v0, p0}, LM6/a$f$a;-><init>(LM6/a$f;)V

    return-object v0
.end method


# virtual methods
.method public a(Lgg/s;)Lgg/v;
    .locals 1

    invoke-direct {p0}, LM6/a$f;->c()Lkg/n;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/s;->Q(Lkg/n;)Lgg/s;

    move-result-object p1

    invoke-direct {p0}, LM6/a$f;->b()Lkg/f;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/s;->F(Lkg/f;)Lgg/s;

    move-result-object p1

    iget-object v0, p0, LM6/a$f;->a:LG6/N$d;

    invoke-virtual {p1, v0}, Lgg/s;->g(Lgg/w;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/s;

    invoke-virtual {p0, p1}, LM6/a$f;->a(Lgg/s;)Lgg/v;

    move-result-object p1

    return-object p1
.end method
