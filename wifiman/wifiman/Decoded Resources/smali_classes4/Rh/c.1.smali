.class LRh/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:LRh/d;

.field private final b:Lri/o;


# direct methods
.method public constructor <init>(LRh/d;Lri/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRh/c;->a:LRh/d;

    iput-object p2, p0, LRh/c;->b:Lri/o;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LRh/c;->a:LRh/d;

    iget-object v1, p0, LRh/c;->b:Lri/o;

    check-cast p1, LRh/d$a;

    invoke-static {v0, v1, p1}, LRh/d;->c(LRh/d;Lri/o;LRh/d$a;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
