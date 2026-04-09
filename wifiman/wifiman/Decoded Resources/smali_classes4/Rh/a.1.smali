.class LRh/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:LRh/d;

.field private final b:LRh/d$a;


# direct methods
.method public constructor <init>(LRh/d;LRh/d$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRh/a;->a:LRh/d;

    iput-object p2, p0, LRh/a;->b:LRh/d$a;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LRh/a;->a:LRh/d;

    iget-object v1, p0, LRh/a;->b:LRh/d$a;

    invoke-static {v0, v1, p1}, LRh/d;->a(LRh/d;LRh/d$a;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
