.class LN6/y$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN6/y;-><init>(Lgg/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final a:Lkg/n;

.field final b:Lgg/s;

.field final c:Lkg/n;

.field final d:Lkg/n;

.field final synthetic e:Lgg/y;

.field final synthetic f:LN6/y;


# direct methods
.method constructor <init>(LN6/y;Lgg/y;)V
    .locals 2

    iput-object p1, p0, LN6/y$a;->f:LN6/y;

    iput-object p2, p0, LN6/y$a;->e:Lgg/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LN6/y;->g()Lkg/n;

    move-result-object p1

    iput-object p1, p0, LN6/y$a;->a:Lkg/n;

    const-wide/16 v0, 0xa

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, p1, p2}, Lgg/s;->c1(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object p1

    iput-object p1, p0, LN6/y$a;->b:Lgg/s;

    new-instance p1, LN6/y$a$a;

    invoke-direct {p1, p0}, LN6/y$a$a;-><init>(LN6/y$a;)V

    iput-object p1, p0, LN6/y$a;->c:Lkg/n;

    new-instance p1, LN6/y$a$b;

    invoke-direct {p1, p0}, LN6/y$a$b;-><init>(LN6/y$a;)V

    iput-object p1, p0, LN6/y$a;->d:Lkg/n;

    return-void
.end method


# virtual methods
.method public a(Lgg/s;)Lgg/s;
    .locals 1

    new-instance v0, LN6/y$a$c;

    invoke-direct {v0, p0}, LN6/y$a$c;-><init>(LN6/y$a;)V

    invoke-virtual {p1, v0}, Lgg/s;->s0(Lkg/n;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lgg/s;)Lgg/v;
    .locals 0

    invoke-virtual {p0, p1}, LN6/y$a;->a(Lgg/s;)Lgg/s;

    move-result-object p1

    return-object p1
.end method
