.class public final synthetic Lj3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll3/a$a;


# instance fields
.field public final synthetic a:Lj3/r;

.field public final synthetic b:Ljava/lang/Iterable;

.field public final synthetic c:Lc3/p;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lj3/r;Ljava/lang/Iterable;Lc3/p;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/m;->a:Lj3/r;

    iput-object p2, p0, Lj3/m;->b:Ljava/lang/Iterable;

    iput-object p3, p0, Lj3/m;->c:Lc3/p;

    iput-wide p4, p0, Lj3/m;->d:J

    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lj3/m;->a:Lj3/r;

    iget-object v1, p0, Lj3/m;->b:Ljava/lang/Iterable;

    iget-object v2, p0, Lj3/m;->c:Lc3/p;

    iget-wide v3, p0, Lj3/m;->d:J

    invoke-static {v0, v1, v2, v3, v4}, Lj3/r;->b(Lj3/r;Ljava/lang/Iterable;Lc3/p;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
