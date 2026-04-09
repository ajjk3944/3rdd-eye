.class LM6/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/a;->d(LG6/N$c;Ljava/nio/ByteBuffer;LP6/F;)Lkg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LP6/F;

.field final synthetic b:Ljava/nio/ByteBuffer;

.field final synthetic c:LG6/N$c;


# direct methods
.method constructor <init>(LP6/F;Ljava/nio/ByteBuffer;LG6/N$c;)V
    .locals 0

    iput-object p1, p0, LM6/a$e;->a:LP6/F;

    iput-object p2, p0, LM6/a$e;->b:Ljava/nio/ByteBuffer;

    iput-object p3, p0, LM6/a$e;->c:LG6/N$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(Ljava/nio/ByteBuffer;)Lkg/n;
    .locals 1

    new-instance v0, LM6/a$e$b;

    invoke-direct {v0, p0, p1}, LM6/a$e$b;-><init>(LM6/a$e;Ljava/nio/ByteBuffer;)V

    return-object v0
.end method

.method private c(LP6/F;)Lkg/p;
    .locals 1

    new-instance v0, LM6/a$e$c;

    invoke-direct {v0, p0, p1}, LM6/a$e$c;-><init>(LM6/a$e;LP6/F;)V

    return-object v0
.end method


# virtual methods
.method public a(Lgg/s;)Lgg/v;
    .locals 1

    iget-object v0, p0, LM6/a$e;->a:LP6/F;

    invoke-direct {p0, v0}, LM6/a$e;->c(LP6/F;)Lkg/p;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/s;->V0(Lkg/p;)Lgg/s;

    move-result-object p1

    iget-object v0, p0, LM6/a$e;->b:Ljava/nio/ByteBuffer;

    invoke-direct {p0, v0}, LM6/a$e;->b(Ljava/nio/ByteBuffer;)Lkg/n;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object p1

    iget-object v0, p0, LM6/a$e;->c:LG6/N$c;

    invoke-virtual {p1, v0}, Lgg/s;->g(Lgg/w;)Lgg/s;

    move-result-object p1

    new-instance v0, LM6/a$e$a;

    invoke-direct {v0, p0}, LM6/a$e$a;-><init>(LM6/a$e;)V

    invoke-virtual {p1, v0}, Lgg/s;->V0(Lkg/p;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/s;

    invoke-virtual {p0, p1}, LM6/a$e;->a(Lgg/s;)Lgg/v;

    move-result-object p1

    return-object p1
.end method
