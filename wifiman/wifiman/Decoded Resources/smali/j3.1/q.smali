.class public final synthetic Lj3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll3/a$a;


# instance fields
.field public final synthetic a:Lj3/r;

.field public final synthetic b:Lc3/p;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lj3/r;Lc3/p;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/q;->a:Lj3/r;

    iput-object p2, p0, Lj3/q;->b:Lc3/p;

    iput-wide p3, p0, Lj3/q;->c:J

    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lj3/q;->a:Lj3/r;

    iget-object v1, p0, Lj3/q;->b:Lc3/p;

    iget-wide v2, p0, Lj3/q;->c:J

    invoke-static {v0, v1, v2, v3}, Lj3/r;->g(Lj3/r;Lc3/p;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
