.class public LFj/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFj/c;


# instance fields
.field a:LFj/b;

.field b:Ljava/lang/String;

.field c:LGj/f;

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field f:[Ljava/lang/Object;

.field g:J

.field h:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LGj/f;
    .locals 1

    iget-object v0, p0, LFj/d;->c:LGj/f;

    return-object v0
.end method

.method public b([Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LFj/d;->f:[Ljava/lang/Object;

    return-void
.end method

.method public c(LFj/b;)V
    .locals 0

    iput-object p1, p0, LFj/d;->a:LFj/b;

    return-void
.end method

.method public d(LGj/f;)V
    .locals 0

    iput-object p1, p0, LFj/d;->c:LGj/f;

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LFj/d;->b:Ljava/lang/String;

    return-void
.end method

.method public f(LEj/d;)V
    .locals 0

    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LFj/d;->e:Ljava/lang/String;

    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LFj/d;->d:Ljava/lang/String;

    return-void
.end method

.method public i(Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, LFj/d;->h:Ljava/lang/Throwable;

    return-void
.end method

.method public j(J)V
    .locals 0

    iput-wide p1, p0, LFj/d;->g:J

    return-void
.end method
