.class final Lc3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/i;


# instance fields
.field private final a:Ljava/util/Set;

.field private final b:Lc3/p;

.field private final c:Lc3/t;


# direct methods
.method constructor <init>(Ljava/util/Set;Lc3/p;Lc3/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc3/q;->a:Ljava/util/Set;

    iput-object p2, p0, Lc3/q;->b:Lc3/p;

    iput-object p3, p0, Lc3/q;->c:Lc3/t;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Class;La3/b;La3/g;)La3/h;
    .locals 6

    iget-object p2, p0, Lc3/q;->a:Ljava/util/Set;

    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Lc3/s;

    iget-object v1, p0, Lc3/q;->b:Lc3/p;

    iget-object v5, p0, Lc3/q;->c:Lc3/t;

    move-object v0, p2

    move-object v2, p1

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lc3/s;-><init>(Lc3/p;Ljava/lang/String;La3/b;La3/g;Lc3/t;)V

    return-object p2

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    iget-object p2, p0, Lc3/q;->a:Ljava/util/Set;

    filled-new-array {p3, p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string p3, "%s is not supported byt this factory. Supported encodings are: %s."

    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
