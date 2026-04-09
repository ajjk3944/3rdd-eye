.class public final synthetic Lj3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll3/a$a;


# instance fields
.field public final synthetic a:Lj3/r;

.field public final synthetic b:Lc3/p;


# direct methods
.method public synthetic constructor <init>(Lj3/r;Lc3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/l;->a:Lj3/r;

    iput-object p2, p0, Lj3/l;->b:Lc3/p;

    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lj3/l;->a:Lj3/r;

    iget-object v1, p0, Lj3/l;->b:Lc3/p;

    invoke-static {v0, v1}, Lj3/r;->a(Lj3/r;Lc3/p;)Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method
